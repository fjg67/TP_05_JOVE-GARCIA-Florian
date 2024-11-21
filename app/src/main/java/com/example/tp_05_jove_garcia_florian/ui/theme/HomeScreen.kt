package com.example.tp_05_jove_garcia_florian.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tp_05_jove_garcia_florian.GameBottomNavigation
import com.example.tp_05_jove_garcia_florian.GameCategoryRow
import com.example.tp_05_jove_garcia_florian.R
import com.example.tp_05_jove_garcia_florian.SearchBar
import com.example.tp_05_jove_garcia_florian.ui.theme.FavoriteCollectionsGrid

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        SearchBar()
        Text(
            text = "Game category",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        GameCategoryRow(
            categories = listOf(
                "Moba" to R.drawable.moba_image,
                "FPS" to R.drawable.fps_image,
                "Action" to R.drawable.action_image,
                "Sport" to R.drawable.sport_image
            )
        )
        Text(
            text = "Favorite collections",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        FavoriteCollectionsGrid(
            favorites = listOf(
                "League of Legends" to R.drawable.lol_image,
                "Genshing Impact" to R.drawable.genshing_image,
                "Ea sport FC 25" to R.drawable.fifa_image,
                "GTA 6" to R.drawable.gta6_image
            )
        )
    }
}