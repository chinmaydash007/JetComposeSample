package com.example.jetcomposepractise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Border
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBorder
import androidx.ui.foundation.shape.corner.CornerSize
import androidx.ui.foundation.shape.corner.CutCornerShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.RectangleShape
import androidx.ui.graphics.Shape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetcomposepractise.ui.JetComposePractiseTheme
import com.example.jetcomposepractise.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                showPreview()
            }
        }
    }
}

@Composable
fun personDetails(name: String, age: Int) {
    Column(modifier = Modifier.padding(20.dp)) {
        var imageModifier = Modifier.preferredHeightIn(minHeight = 180.dp).fillMaxWidth().drawBorder(border = Border(2.dp, color = Color.Green),
                shape = RoundedCornerShape(corner = CornerSize(12.dp))).clip(shape = RoundedCornerShape(12.dp))
        Image(imageResource(id = R.drawable.abc), contentScale = ContentScale.Crop, alpha = 0.5f, modifier = imageModifier)
        Spacer(modifier = Modifier.preferredHeight(30.dp))

        Row(Modifier.padding(12.dp)) {
            Text(text = name, modifier = Modifier.padding(20.dp, 0.dp),style = typography.h5,maxLines = 1,overflow = TextOverflow.Clip)
            Text(text = age.toString(),style = typography.caption)
        }

    }


}

@Preview(showBackground = true)
@Composable
fun showPreview() {
    personDetails("Chinmay How are you? I am fine.", 12)
}
