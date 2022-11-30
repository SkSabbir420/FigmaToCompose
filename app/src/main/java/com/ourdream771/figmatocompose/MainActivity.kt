package com.ourdream771.figmatocompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ourdream771.figmatocompose.actionbutton.ActionButton
import com.ourdream771.figmatocompose.actionbutton.Design
import com.ourdream771.figmatocompose.ui.theme.FigmaToComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaToComposeTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),


                ) {
                    ActionButton(
                        text = "Hello World",
                        modifier =  Modifier.fillMaxWidth(),
                        design = Design.Primary,
                        onClick = {
                            Toast.makeText(applicationContext,"Hello world",Toast.LENGTH_LONG).show()
                                  },
                        icon = {
                            Icon(imageVector = Icons.Default.Check,
                                contentDescription = null)
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ActionButton(
                        text = "Secondary",
                        modifier =  Modifier.fillMaxWidth(),
                        design = Design.Secondary,
                        onClick = {
                            Toast.makeText(applicationContext,"Secondary",Toast.LENGTH_LONG).show()
                        },
                        icon = {
                            Icon(imageVector = Icons.Default.Close,
                                contentDescription = null,
                                tint = Color.Green
                            )
                        }
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FigmaToComposeTheme {
        Greeting("Android")
    }
}