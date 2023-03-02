package pokedex.eu.composebottomonavmultistack.feature.dse

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

const val dseRoute: String = "dse"

@Composable
fun DseScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "DSE screen")
    }
}

@Preview
@Composable
fun DseScreenPreview() {
    ComposeBottomoNavMultiStackTheme {
        DseScreen()
    }
}