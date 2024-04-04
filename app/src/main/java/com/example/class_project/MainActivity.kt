package com.example.class_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.IntentActivity
import com.example.class_project.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo() {
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Text(text = "Android is a mobile operating system based on a modified version of the Linux kernel and other open-source software, designed primarily for touchscreen mobile devices such as smartphones and tablets. ")

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        {
            Text(text = "About")
        }

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,LottieActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        {
            Text(text = "Animation")
        }
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,ListActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        {
            Text(text = "List")
        }
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,SplashActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        {
            Text(text = "Splash")
        }

        Text(
            text = "Types of Cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .height(30.dp),
            textAlign = TextAlign.Center,
            color = Color.White,
            textDecoration = TextDecoration.Underline
        )

        Text(text = "1.Toyota")
        Text(text = "2.Nissan")
        Text(text = "3.Audi")
        Text(text = "4.Bugatti")

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Example of Football Clubs",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .height(30.dp),
            textAlign = TextAlign.Center,
            color = Color.White,
            textDecoration = TextDecoration.Underline
        )

        Text(text = "This are some of the football clubs in England.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "1.Liverpool")

        Text(text = "2.Manchester City")

        Text(text = "3.Arsenal")

        Text(text = "4.Chelsea")

        Divider()

        Text(
            text = "eMobilis training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.sparrow),
                contentDescription = "sparrow",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
                      },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview() {
    Demo()
}