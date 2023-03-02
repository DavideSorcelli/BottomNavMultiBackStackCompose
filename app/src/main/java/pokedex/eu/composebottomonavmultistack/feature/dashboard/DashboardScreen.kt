package pokedex.eu.composebottomonavmultistack.feature.dashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

@Composable
fun DashboardScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Dashboard screen")
    }
}

@Preview
@Composable
fun DashboardScreenPreview() {
    ComposeBottomoNavMultiStackTheme {
        DashboardScreen()
    }
}