package pokedex.eu.composebottomonavmultistack.feature.dashboard.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import pokedex.eu.composebottomonavmultistack.feature.dashboard.DashboardScreen

const val dashboardRoute: String = "dashboard_route"

fun NavController.navigateToDashboard(navOptions: NavOptions? = null) {
    navigate(dashboardRoute, navOptions)
}

fun NavGraphBuilder.dashboardScreen() {
    composable(route = dashboardRoute) {
        DashboardScreen()
    }
}