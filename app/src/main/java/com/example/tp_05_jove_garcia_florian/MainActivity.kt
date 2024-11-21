package com.example.tp_05_jove_garcia_florian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp_05_jove_garcia_florian.ui.theme.HomeScreen
import com.example.tp_05_jove_garcia_florian.ui.theme.TP_05_JOVE_GARCIA_FlorianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TP_05_JOVE_GARCIA_FlorianTheme {
                MyGameApp()
            }
        }
    }
}

@Composable
fun MyGameApp() {
    val currentScreen = remember { mutableStateOf("Home") }

    Scaffold(
        bottomBar = {
            GameBottomNavigation { screen ->
                currentScreen.value = screen
            }
        }
    ) { paddingValues ->
        when (currentScreen.value) {
            "Home" -> HomeScreen(modifier = Modifier.padding(paddingValues))
            "Profile" -> ProfileScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyGameAppPreview() {
    TP_05_JOVE_GARCIA_FlorianTheme {
        MyGameApp()
    }
}