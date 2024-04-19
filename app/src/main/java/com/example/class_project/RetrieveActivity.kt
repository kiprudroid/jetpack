package com.example.class_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.model.Employee
import com.example.class_project.model.SharedViewModel
import com.example.class_project.ui.theme.Class_ProjectTheme
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class RetrieveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Class_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Retrieve(sharedViewModel = SharedViewModel())
                }
            }
        }
    }
}

@Composable
fun Retrieve(sharedViewModel : SharedViewModel){
    var id :String by remember{ mutableStateOf("") }
    var name :String by remember{ mutableStateOf("") }
    var position :String by remember{ mutableStateOf("") }
    var age :String by remember{ mutableStateOf("") }

    val mContext = LocalContext.current
    
    sharedViewModel.retrieveData("1", mContext){
        data -> 
        id = data.Id
        name = data.name
        position = data.position
        age = data.age


    }
    Text(text = "$id is $name")
    


    
}

@Preview(showBackground = true)
@Composable
fun RetrievePreview(){
Retrieve(sharedViewModel = SharedViewModel())
}