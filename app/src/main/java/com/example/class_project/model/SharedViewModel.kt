package com.example.class_project.model

import android.widget.Toast
import android.content.Context
import android.widget.MediaController
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.google.firebase.Firebase
import com.google.firebase.firestore.core.UserData
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.toObject
//import io.grpc.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class SharedViewModel() : ViewModel() {

    fun saveData(
        userData: Employee,
        context: Context,
            ) = CoroutineScope(Dispatchers.IO).launch{
                val fireStoreRef = Firebase.firestore
                    .collection("employee")
                    .document(userData.Id)
        try {
            fireStoreRef.set(userData)
                .addOnSuccessListener {
                    Toast.makeText(context,"Successfuly Added",Toast.LENGTH_SHORT).show()
                }

        }catch (e : Exception){
            Toast.makeText(context,e.message,Toast.LENGTH_SHORT).show()
        }

    }

    fun retrieveData(
        Id :String,
        context: Context,
        data: (Employee) -> Unit
    ) = CoroutineScope(Dispatchers.IO).launch{
        val fireStoreRef = Firebase.firestore
            .collection("employee")
            .document(Id)
        try {
            fireStoreRef.get()
                .addOnSuccessListener {
                    if ( it.exists()){
                        val userData = it.toObject<Employee>()!!
                        data(userData)
                    }else{
                        Toast.makeText(context,"failed to load data",Toast.LENGTH_SHORT).show()
                    }
                }

        }catch (e : Exception){
            Toast.makeText(context,e.message,Toast.LENGTH_SHORT).show()
        }

    }

    fun deleteData(
        Id :String,
        context: Context,
        navController: NavController,
       backToMain : () -> Unit
    ) = CoroutineScope(Dispatchers.IO).launch{
        val fireStoreRef = Firebase.firestore
            .collection("employee")
            .document(Id)
        try {
            fireStoreRef.delete()
                .addOnSuccessListener {
                    Toast.makeText(context,"Deleted Succesfully",Toast.LENGTH_SHORT).show()
                    navController.popBackStack()
                }

        }catch (e : Exception){
            Toast.makeText(context,e.message,Toast.LENGTH_SHORT).show()
        }

    }
}