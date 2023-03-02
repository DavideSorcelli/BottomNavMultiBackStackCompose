package pokedex.eu.composebottomonavmultistack.feature.vehicle.remote_commands

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

const val vehicleRemoteCmdRoute = "vehicleRemoteCmd"

@Composable
fun VehicleRemoteCmdScreen(
    onNavigateToClimate: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Remote Commands")
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = onNavigateToClimate) {
                Text(text = "Clima Controls")
            }
        }
    }
}

@Preview
@Composable
fun VehicleRemoteCmdScreenPreview() {
    ComposeBottomoNavMultiStackTheme {
        VehicleRemoteCmdScreen(onNavigateToClimate = {})
    }
}