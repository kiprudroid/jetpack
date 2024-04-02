package com.example.class_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.ui.theme.Class_ProjectTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
MyForm()
        }
    }
}

@Composable

fun MyForm(){
Column(
    modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.img),
            contentScale = ContentScale.FillBounds
        )) {
var firstname by remember { mutableStateOf("")}
var lastname by remember { mutableStateOf("")}
var email by remember { mutableStateOf("")}
var password by remember { mutableStateOf("")}
var contact by remember { mutableStateOf("")}

Box(
    modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.Center
){
    Image(painter = painterResource(id = R.drawable.img_1),
        contentDescription ="register",
        modifier = Modifier.size(100.dp),
    )
}
    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Create an Account",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(10.dp))

//Text field
    TextField(
    value = firstname,
    onValueChange = {firstname = it},
    placeholder = {Text(text="Enter Firstname")},
    leadingIcon = { Icon(
        imageVector = Icons.Default.Person,
        contentDescription = "person")
    },
    modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

)
    Spacer(modifier = Modifier.height(10.dp))

    //End Text field

    //Text field
    TextField(
        value = lastname,
        onValueChange = {lastname = it},
        placeholder = {Text(text="Enter Lastname")},
        leadingIcon = { Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "person")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

    )
    Spacer(modifier = Modifier.height(10.dp))

    //End Text field

    //Text field
    TextField(
        value = email,
        onValueChange = {email = it},
        placeholder = {Text(text="Enter Email Address")},
        leadingIcon = { Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "person")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

    )
    Spacer(modifier = Modifier.height(10.dp))

    //End Text field
    //Text field
    TextField(
        value = password,
        onValueChange = {password = it},
        placeholder = {Text(text="Enter Password")},
        leadingIcon = { Icon(
            imageVector = Icons.Default.Lock,
            contentDescription = "person")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation()

    )
    Spacer(modifier = Modifier.height(10.dp))

    //End Textfield
    //Text field
    TextField(
        value = contact,
        onValueChange = {contact = it},
        placeholder = {Text(text="Enter Phone Number")},
        leadingIcon = { Icon(
            imageVector = Icons.Default.Phone,
            contentDescription = "person")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

    )
    Spacer(modifier = Modifier.height(20.dp))

    //End Textfield

    OutlinedButton(onClick = {/* TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Blue)
    ) {
        Text(
            text="Register",
            color = Color.Blue,
            fontSize = 20.sp)
    }
    Spacer(modifier = Modifier.height(10.dp))
    //End of outlined Button

    Text(
        text = "Already Have an account ? Login .",
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp))
}
}
@Preview(showBackground = true)
@Composable
fun MyFormPreview() {
   MyForm()
}