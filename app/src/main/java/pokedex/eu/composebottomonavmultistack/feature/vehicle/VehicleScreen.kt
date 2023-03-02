package pokedex.eu.composebottomonavmultistack.feature.vehicle

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

const val vehicleRoute: String = "vehicle"

@Composable
fun VehicleScreen(
    onNavigateToVehicleRemoteCmd: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Vehicle screen")
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = onNavigateToVehicleRemoteCmd) {
                Text(text = "Remote Commands")
            }
        }
    }
}

@Preview
@Composable
fun VehicleScreenPreview() {
    ComposeBottomoNavMultiStackTheme {
        VehicleScreen(onNavigateToVehicleRemoteCmd = {})
    }
}