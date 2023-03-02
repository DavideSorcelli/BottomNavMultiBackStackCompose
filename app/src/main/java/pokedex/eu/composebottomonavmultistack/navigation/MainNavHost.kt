package pokedex.eu.composebottomonavmultistack.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pokedex.eu.composebottomonavmultistack.feature.dashboard.navigation.dashboardRoute
import pokedex.eu.composebottomonavmultistack.feature.dashboard.navigation.dashboardScreen
import pokedex.eu.composebottomonavmultistack.feature.dse.navigation.dseScreen
import pokedex.eu.composebottomonavmultistack.feature.vehicle.navigation.vehicleGraph
import pokedex.eu.composebottomonavmultistack.feature.vehicle.remote_commands.VehicleRemoteCmdScreen
import pokedex.eu.composebottomonavmultistack.feature.vehicle.remote_commands.vehicleRemoteCmdRoute


@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = dashboardRoute,
        modifier = modifier
    ) {

        dashboardScreen()

        dseScreen()

        vehicleGraph(
            onRemoteCmdClick = {
                navController.navigate(vehicleRemoteCmdRoute)
            },
            nestedGraphs = {
                composable(route = vehicleRemoteCmdRoute) {
                    VehicleRemoteCmdScreen(onNavigateToClimate = {

                    })
                }
            }
        )

    }

}
