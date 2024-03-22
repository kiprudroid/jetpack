package com.example.class_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.IntentActivity
import com.example.class_project.R

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout()  {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
//Start of TopAppBar

        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
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


            )//End of TopAppBar

        Text(
            text = "BREEDS OF CATS",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
//Row 1
        Row {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "",
                modifier = Modifier.size(200.dp,130.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Good Dog",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(text = "This is a nice breed")

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
//Row 2
        Row {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "",
                modifier = Modifier.size(200.dp,130.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Bad Dog",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(text = "This is a nice breed")

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {mContext.startActivity(Intent(mContext, IntentActivity::class.java))},
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(text = "Continue")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview() {
    Layout()
}