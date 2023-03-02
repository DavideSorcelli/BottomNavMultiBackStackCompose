package pokedex.eu.composebottomonavmultistack.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import pokedex.eu.composebottomonavmultistack.feature.dashboard.navigation.navigateToDashboard
import pokedex.eu.composebottomonavmultistack.feature.dse.navigation.navigateToDse
import pokedex.eu.composebottomonavmultistack.feature.vehicle.navigation.navigateToVehicleGraph
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOptions = navOptions {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
        when (topLevelDestination) {
            TopLevelDestination.Dashboard -> navController.navigateToDashboard(topLevelNavOptions)
            TopLevelDestination.Dse -> navController.navigateToDse(topLevelNavOptions)
            TopLevelDestination.Vehicle -> navController.navigateToVehicleGraph(topLevelNavOptions)
        }
    }

    val destinations = TopLevelDestination.values().asList()

    NavigationBar {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        destinations.forEach { destination ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = null) },
                label = { Text("NavItem") },
                selected = currentDestination.isTopLevelDestinationInHierarchy(destination),
                onClick = { navigateToTopLevelDestination(destination) }
            )
        }

    }

}

private fun NavDestination?.isTopLevelDestinationInHierarchy(destination: TopLevelDestination) =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false


@Preview
@Composable
fun BottomNavigationBarPreview() {
    ComposeBottomoNavMultiStackTheme {
        BottomNavigationBar(navController = rememberNavController())
    }
}