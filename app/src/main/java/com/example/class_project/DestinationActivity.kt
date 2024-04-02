package com.example.class_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.ui.theme.Class_ProjectTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Destination(){
var search by remember {mutableStateOf("")
}

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
val mContext = LocalContext.current
//Start of TopAppBar

        TopAppBar(
            title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,MainActivity::class.java))},
                )
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "ArrowBack",
                        tint = Color.White
                    )
                }
            },

            actions = {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    tint = Color.White
                )

                Spacer(modifier = Modifier.width(10.dp))

                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings",
                    tint = Color.White
                )

            },


            )
    //End of TopAppBar

        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                ,
            contentAlignment = Alignment.BottomStart
        ) {
Image(painter = painterResource(
    id = R.drawable.theblackpearl),
    contentDescription ="thepearl" ,
    modifier = Modifier.fillMaxSize(),
    contentScale = ContentScale.Crop
)
            Text(
                text = "Let's Plan Your Next Vacation",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.End,
                modifier = Modifier.padding(start=20.dp )

            )
        } //End of Box

        //Search Bar
        OutlinedTextField(
            value = search,
            onValueChange ={search = it},
            placeholder = { Text(text = "What is Your Destination ?  ")},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription ="Search" )
            },
            modifier =  Modifier.padding(start = 20.dp, top = 15.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        ) //End Of SearchBar

        Text(
            text = "Recently Viewed",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(start = 30.dp , top = 15.dp),
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight(700)


        )

       Row(
           modifier = Modifier
               .horizontalScroll(rememberScrollState())
       ) {
           //Card Beginning
           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
                   .padding(start = 10.dp)
           ){
               Column{

                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),

                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.hotel) ,
                           contentDescription = "Card",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )
                   }
                   Text(
                       text = "Moscow",
                       modifier = Modifier.fillMaxWidth(),
                       fontSize = 24.sp,
                       textAlign = TextAlign.End,
                   )
               }
           }
           Spacer(modifier = Modifier.width(8.dp))
           //End of Card
           //Card Beginning
           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
                   .padding(start = 10.dp)
           ){
               Column{

                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),

                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.sahara) ,
                           contentDescription = "Card",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )
                   }
                   Text(
                       text = "Atlas Mountains",
                       modifier = Modifier.fillMaxWidth(),
                       fontSize = 24.sp,
                       textAlign = TextAlign.End,
                   )
               }
           }
           Spacer(modifier = Modifier.width(8.dp))
           //End of Card
           //Card Beginning
           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
                   .padding(start = 10.dp)
           ){
               Column{

                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),

                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.la) ,
                           contentDescription = "Card",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )
                   }
                   Text(
                       text = "Moscow",
                       modifier = Modifier.fillMaxWidth(),
                       fontSize = 24.sp,
                       textAlign = TextAlign.End,
                   )
               }
           }
           Spacer(modifier = Modifier.width(8.dp))
           //End of Card
           //Card Beginning
           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
                   .padding(start = 10.dp)
           ){
               Column{

                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),

                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.hotel) ,
                           contentDescription = "Card",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )
                   }
                   Text(
                       text = "Moscow",
                       modifier = Modifier.fillMaxWidth(),
                       fontSize = 24.sp,
                       textAlign = TextAlign.End,
                   )
               }
           }
           Spacer(modifier = Modifier.width(8.dp))
           //End of Card
       }
    }
}


@Preview(showBackground = true)
@Composable
fun DestinationPreview() {
    Destination()
}