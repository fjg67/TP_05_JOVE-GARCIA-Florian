package com.example.tp_05_jove_garcia_florian

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GameBottomNavigation(
    onScreenSelected: (String) -> Unit
) {
    val selectedScreen = remember { mutableStateOf("Home") }

    NavigationBar {
        NavigationBarItem(
            selected = selectedScreen.value == "Home",
            onClick = {
                selectedScreen.value = "Home"
                onScreenSelected("Home")
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "Home",
                    modifier = Modifier.size(20.dp)
                )
            },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = selectedScreen.value == "Profile",
            onClick = {
                selectedScreen.value = "Profile"
                onScreenSelected("Profile")
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = "Profile",
                    modifier = Modifier.size(20.dp)
                )
            },
            label = { Text("Profile") }
        )
    }
}