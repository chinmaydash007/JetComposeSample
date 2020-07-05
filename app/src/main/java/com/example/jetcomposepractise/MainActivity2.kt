package com.example.jetcomposepractise

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.drawShadow
import androidx.ui.core.setContent
import androidx.ui.foundation.Border
import androidx.ui.foundation.ClickableText
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.RectangleShape
import androidx.ui.graphics.Shape
import androidx.ui.layout.Column
import androidx.ui.layout.InnerPadding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.contentColorFor
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.Dp
import androidx.ui.unit.dp
import com.example.jetcomposepractise.ui.JetComposePractiseTheme

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                App()
            }
        }
    }
}

@Preview(name = "New Compose Layout")
@Composable
fun App() {
    Column {
        TopAppBar(
            title = { Text(text = "JetPack Compose") },
            backgroundColor = Color.Green,
            elevation = 10.dp
        )
        Text(text = "Hello Jetpack")



    }

}


fun showToast(context:Context) {
    Toast.makeText(context, "You just clicked a Clickable", Toast.LENGTH_LONG)
        .show()
}


