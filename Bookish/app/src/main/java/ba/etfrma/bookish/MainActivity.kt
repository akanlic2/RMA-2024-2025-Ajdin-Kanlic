package ba.etfrma.bookish

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ba.etfrma.bookish.ui.theme.BookishTheme
import java.nio.file.WatchEvent
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookishTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Legenda o Ali-paši",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "My favorite book is:",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth().padding(bottom = 250.dp),
        )
        Text(
                text = name,
                fontSize = 30.sp,
                color = Color.Blue,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BookishTheme {
        Greeting("Legenda o Ali-paši")
    }
}