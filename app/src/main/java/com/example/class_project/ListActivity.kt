package com.example.class_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class_project.ui.theme.Class_ProjectTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyList()
        }
    }
}

@Composable
fun MyList(){
Column(modifier = Modifier.fillMaxSize()){

    Row(
    modifier = Modifier
        .fillMaxWidth(),
    horizontalArrangement = Arrangement.Center

    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.woof),
                contentDescription = "logo",
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp)
            )
        }

            Text(
                text = "Woof",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 10.dp), shape = RoundedCornerShape(
            topEnd = 20.dp,
            bottomStart = 20.dp
        ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog1),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Koda",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "2 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending
    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 15.dp), shape = RoundedCornerShape(
        topEnd = 20.dp,
        bottomStart = 20.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog4),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Lola",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "16 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending
    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 15.dp), shape = RoundedCornerShape(
        topEnd = 20.dp,
        bottomStart = 20.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog5),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Frankie",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "2 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending
    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 15.dp), shape = RoundedCornerShape(
        topEnd = 20.dp,
        bottomStart = 20.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog3),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Nox",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "5 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending
    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 15.dp), shape = RoundedCornerShape(
        topEnd = 20.dp,
        bottomStart = 20.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog3),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Bella",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "14 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending
    //Card Beginning

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp,top = 15.dp),
        shape = RoundedCornerShape(
        topEnd = 20.dp,
        bottomStart = 20.dp
    ), colors = CardDefaults.cardColors(
        containerColor = Color(219,228,222), //Card background color
        contentColor = Color.Black  //Card content color,e.g.text
    ))   {
        Row {


            Column {


                Image(
                    painter = painterResource(id = R.drawable.dog5),
                    contentDescription = "first",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .height(70.dp)
                        .width(70.dp)


                )
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Moana",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top =15.dp)
                )
                Text(
                    text = "2 years old",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top =5.dp, bottom = 10.dp)
                )
            }
        }

    }
    //Card Ending


}
}

@Preview(showBackground = true)
@Composable
fun MyListPreview() {
    MyList()
}