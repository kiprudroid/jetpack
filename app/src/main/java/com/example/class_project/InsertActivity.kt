package com.example.class_project

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.model.Employee
import com.example.class_project.model.SharedViewModel
import com.example.class_project.ui.theme.Class_ProjectTheme

class InsertActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Class_ProjectTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
                    MyInsert(SharedViewModel())
//                }
            }
        }
    }
}

@Composable
fun MyInsert(
    sharedViewModel : SharedViewModel
){
    var id :String by remember{ mutableStateOf("") }
    var name :String by remember{ mutableStateOf("") }
    var position :String by remember{ mutableStateOf("") }
    var age :String by remember{ mutableStateOf("") }

    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.padding(start= 30.dp , end = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //beginning of text field
            TextField(
                value = id,
                onValueChange = {id = it},
                placeholder = {Text(text="Enter Your Id")},
                leadingIcon = { Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "person")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )
            Spacer(modifier = Modifier.height(20.dp))
            //end of text field
            //beginning of text field
            TextField(
                value = name,
                onValueChange = {name = it},
                placeholder = {Text(text="Enter First Name")},
                leadingIcon = { Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            Spacer(modifier = Modifier.height(20.dp))
            //end of text field
            //beginning of text field
            TextField(
                value = position,
                onValueChange = {position  = it},
                placeholder = {Text(text="Enter Your Job title")},
                leadingIcon = { Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = "pos")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            Spacer(modifier = Modifier.height(20.dp))
            //end of text field
            //beginning of text field
            TextField(
                value = age,
                onValueChange = {age = it},
                placeholder = {Text(text="Enter Age")},
                leadingIcon = { Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

            )
            Spacer(modifier = Modifier.height(20.dp))
            //end of text field
            OutlinedButton(onClick = {
                     val userData = Employee(
                         Id = id,
                         name = name,
                         position = position,
                         age = age
                     )
                sharedViewModel.saveData(userData = userData, context = mContext)
                                     },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Blue)
            ) {
                Text(
                    text="Add Data",
                    color = Color.Blue,
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.height(10.dp))
            //End of outlined Button

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "View Data",
                modifier = Modifier.clickable {
                    mContext.startActivity(Intent(mContext,RetrieveActivity::class.java))
                }
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun MyInsertPreview(){
    MyInsert(SharedViewModel())
}