package com.example.class_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.class_project.ui.theme.Class_ProjectTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

//Start of TopAppBar

        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(
                    onClick = {
                        mContext.startActivity(
                            Intent(
                                mContext,
                                MainActivity::class.java
                            )
                        )
                    },
                )
                {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "ArrowBack",
                        tint = Color.Black
                    )
                }
            },

            actions = {
                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = "Location",
                    tint = Color.Black
                )

                Spacer(modifier = Modifier.width(15.dp))
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    tint = Color.Black
                )

                Spacer(modifier = Modifier.width(15.dp))

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Settings",
                    tint = Color.Black
                )

            },


            )
        //End of TopAppBar

        Column (
            modifier = Modifier.verticalScroll(rememberScrollState())
        ){
        Text(
            text = "Tickets",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp)
        )

            Spacer(modifier = Modifier.height(10.dp))



           Row {


               //Column 1
               Column(
                   modifier= Modifier.width(160.dp)
               ) {
                   Card(
                       modifier = Modifier
                           .height(100.dp)
                           .width(160.dp)
                           .shadow(
                               4.dp, RectangleShape, true, DefaultShadowColor,
                               DefaultShadowColor
                           )

                   ) {

                       Box (
                           modifier = Modifier
                               .fillMaxWidth(),
                           contentAlignment = Alignment.TopEnd,


                           ){
                           Image(painter = painterResource(id = R.drawable.hotel),
                               contentDescription = "first",
                               contentScale = ContentScale.FillBounds)

                           Icon(imageVector = Icons.Default.FavoriteBorder,
                               contentDescription = "fav",
                               tint = Color.White,
                               modifier = Modifier.padding(15.dp)
                           )
                       }
                   }
                   Text(
                       text = "Colosseum,",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       fontWeight = FontWeight.Bold
                   )
                   Row {

                       //Star
                       Icon(imageVector = Icons.Default.Star,
                           contentDescription = "Star",
                           tint = Color(0,150,255),
                       )
                       //End Star
                       //Star
                       Icon(imageVector = Icons.Default.Star,
                           contentDescription = "Star",
                           tint = Color(0,150,255),
                       )
                       //End Star
                       //Star
                       Icon(imageVector = Icons.Default.Star,
                           contentDescription = "Star",
                           tint = Color(0,150,255),
                       )
                       //End Star
                       //Star
                       Icon(imageVector = Icons.Default.Star,
                           contentDescription = "Star",
                           tint = Color(0,150,255),
                       )
                       //End Star
                       //Star
                       Icon(imageVector = Icons.Default.Star,
                           contentDescription = "Star",
                           tint = Color(0,150,255),
                       )
                       //End Star
                   }

                   Text(
                       text = "443 Reviewers",
                       fontSize = 15.sp,
                       fontFamily = FontFamily.SansSerif,

                       )
                   Text(
                       text = "From $38",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       color = Color.Blue
                   )
                   Row(
                       modifier = Modifier.fillMaxWidth()
                   ) {

                       OutlinedButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL)
                           callIntent.data="tel:0720245837".toUri()
                           mContext.startActivity(callIntent)
                       }) {
                           Text(text = "Call")
                       }

                       OutlinedButton(
                           onClick = {  val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("kiprutoshadrack06@gmail.com"))
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Job Portal Application")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this to apply for an Administrator position")
                               mContext.startActivity(shareIntent)},

                           ) {
                           Text(text = "Email")
                       }
                   }
               }
               //End Of Column 1




           }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview() {
   Explore()
}