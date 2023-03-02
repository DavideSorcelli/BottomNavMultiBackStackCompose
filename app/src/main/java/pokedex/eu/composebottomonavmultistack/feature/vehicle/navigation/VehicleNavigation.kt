package pokedex.eu.composebottomonavmultistack.feature.vehicle.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import pokedex.eu.composebottomonavmultistack.feature.vehicle.VehicleScreen
import pokedex.eu.composebottomonavmultistack.feature.vehicle.vehicleRoute

private const val vehicleGraphRoutePattern = "vehicle_graph"
const val interestsRoute = "vehicle_route"

fun NavController.navigateToVehicleGraph(navOptions: NavOptions? = null) {
    this.navigate(vehicleGraphRoutePattern, navOptions)
}

fun NavGraphBuilder.vehicleGraph(
    onRemoteCmdClick: () -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = vehicleGraphRoutePattern,
        startDestination = vehicleRoute
    ) {
        composable(route = vehicleRoute) {
            VehicleScreen(onNavigateToVehicleRemoteCmd = onRemoteCmdClick)
        }
        nestedGraphs()
    }
}