package xyz.teamgravity.cleantheming

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import xyz.teamgravity.cleantheming.ui.theme.CleanThemingTheme
import xyz.teamgravity.cleantheming.ui.theme.spacing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanThemingTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Button(
                            modifier = Modifier
                                .padding(horizontal = MaterialTheme.spacing.medium)
                                .fillMaxWidth(),
                            onClick = {
                                Toast.makeText(this@MainActivity, "Button clicked", Toast.LENGTH_SHORT).show()
                            }
                        ) {
                            Text(text = "Simple button")
                        }
                    }
                }
            }
        }
    }
}