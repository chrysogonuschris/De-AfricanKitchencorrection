package com.chrys.de_africankitchen.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.view.drawToBitmap
import androidx.fragment.app.Fragment
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.models.generalrecipiemodel
import com.google.android.gms.tasks.Tasks
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.nio.ByteBuffer

class addToKitchen : Fragment() {

    lateinit var fdName : TextInputEditText
    lateinit var ctrName : TextInputEditText
    lateinit var fdingre : TextInputEditText
    lateinit var fdmeth : TextInputEditText
    lateinit var fddura : TextInputEditText
    lateinit var fdImg : ImageView
    lateinit var ctrImg : ImageView
    lateinit var addbtn1 : Button
    lateinit var addbtn2 : Button
    lateinit var submit : Button

    lateinit var fdlay : TextInputLayout
    lateinit var ctrlay : TextInputLayout
    lateinit var inglay : TextInputLayout
    lateinit var methlay : TextInputLayout
    lateinit var duralay : TextInputLayout
    lateinit var newlist :  ArrayList<generalrecipiemodel>
     var imageUri1: Uri? = null
     var imageUri2: Uri? = null

    lateinit var database : FirebaseDatabase
    lateinit var storage : FirebaseStorage






    @RequiresApi(Build.VERSION_CODES.P)
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.addto_fragment, container, false)

        fdName = view.findViewById(R.id.fdname)
        ctrName = view.findViewById(R.id.ctrname)
        fdingre = view.findViewById(R.id.fdingredients)
        fdmeth = view.findViewById(R.id.fdmethods)
        fddura = view.findViewById(R.id.ckdua)
        fdImg = view.findViewById(R.id.fdimg)
        ctrImg = view.findViewById(R.id.ctrimg)
        addbtn1 = view.findViewById(R.id.addbtn1)
        addbtn2 = view.findViewById(R.id.addbtn2)
        submit = view.findViewById(R.id.submit)

        fdlay = view.findViewById(R.id.fdlay)
        ctrlay = view.findViewById(R.id.ctrlay)
        inglay = view.findViewById(R.id.ingrlay)
        methlay = view.findViewById(R.id.methlay)
        duralay = view.findViewById(R.id.duralay)

        newlist = arrayListOf<generalrecipiemodel>()

//        initializing firebase






        val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            uri?.let { imageUri ->
                if (imageUri1 == null) {
                    imageUri1 = imageUri
                    fdImg.setImageURI(imageUri1)
                } else if (imageUri2 == null) {
                    imageUri2 = imageUri
                    ctrImg.setImageURI(imageUri2)
                }
            }
        }


        addbtn1.setOnClickListener {
            getContent.launch("image/*")
        }

        addbtn2.setOnClickListener {
            getContent.launch("image/*")
        }



        submit.setOnClickListener {
            uploadImages()
            }



        return view
    }

    private fun checkFields() : Boolean {
        if (fdName.text!!.isEmpty()){
            fdlay.error = "this field is required"
        }
        if (ctrName.text!!.isEmpty()){
            ctrlay.error = "this field is required"
        }
        if (fdingre.text!!.isEmpty()){
            inglay.error = "this field is required"
        }
        if (fdmeth.text!!.isEmpty()){
            methlay.error = "this field is required"
        }
        if (fddura.text!!.isEmpty()){
            duralay.error = "this field is required"
        }

        return true
    }

    private fun uploadImages() {

//        upload the images to firebase storage
        val storageRef = FirebaseStorage.getInstance().reference

        val imageRef1 = storageRef.child("images/${imageUri1?.lastPathSegment}")
        val uploadTask1 = imageUri1?.let { imageRef1.putFile(it) }

        val imageRef2 = storageRef.child("images/${imageUri2?.lastPathSegment}")
        val uploadTask2 = imageUri2?.let { imageRef2.putFile(it) }

        // Wait for both uploads to complete




        Tasks.whenAll(uploadTask1, uploadTask2).addOnCompleteListener { task ->
            if (task.isSuccessful) {

                if (checkFields()) {
                    var foodnm = fdName.text.toString()
                    var countryNm = ctrName.text.toString()
                    var fooding = fdingre.text.toString()
                    var foodmeth = fdmeth.text.toString()
                    var fooddura = fddura.text.toString()
                    // Get the download URLs of the uploaded images
                    imageRef1.downloadUrl.addOnSuccessListener { uri1 ->
                        val imageUrl1 = uri1.toString()

                        imageRef2.downloadUrl.addOnSuccessListener { uri2 ->
                            val imageUrl2 = uri2.toString()

                            var model = generalrecipiemodel(
                                foodnm,
                                countryNm,
                                fooddura,
                                fooding,
                                foodmeth,
                                imageUrl1,
                                imageUrl2
                            )

                            newlist.add(model)

                            database = FirebaseDatabase.getInstance()
                            var gnrecipie = database.getReference("recipies")
                            val recipie = gnrecipie.child("generalRecipies")

                            newlist.forEachIndexed { index, generalrecipiemodel ->
                                recipie.child("gnRecipie${index + 1}").setValue(generalrecipiemodel)
                                    .addOnCompleteListener {
                                        Toast.makeText(
                                            requireActivity(),
                                            "your data has been succesfully added",
                                            Toast.LENGTH_LONG
                                        ).show()

                                        fdName.setText("")
                                        ctrName.setText("")
                                        fdingre.setText("")
                                        fdmeth.setText("")
                                        fddura.setText("")
                                        fdImg.setImageResource(R.drawable.amala)
                                        ctrImg.setImageResource(R.drawable.angola)
                                    }
                            }


                        }.addOnFailureListener { exception ->
                            // Handle failure to retrieve download URL for image 2
                        }
                    }.addOnFailureListener { exception ->
                        // Handle failure to retrieve download URL for image 1
                    }

                }
            }else {
                // Handle the upload failure
            }

        }
    }



}