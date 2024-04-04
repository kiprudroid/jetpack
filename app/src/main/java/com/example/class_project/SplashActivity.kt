package com.example.class_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.class_project.ui.theme.Class_ProjectTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

              Splash()
            
            val mContext = LocalContext.current
            val coroutinescope = rememberCoroutineScope()
            coroutinescope.launch {
                delay(5000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
            }

            }
    }
}

@Composable
fun Splash(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(1,1,50)),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,




    ){
        Text(
            text = "Infinity Housing",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
        )
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.infinite))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition,
            modifier = Modifier.size(300.dp),
            iterations = LottieConstants.IterateForever
        )


    }

}
@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    Splash()
}