package pokedex.eu.composebottomonavmultistack.feature.dse.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import pokedex.eu.composebottomonavmultistack.feature.dse.DseScreen

const val dseRoute: String = "dse_route"

fun NavController.navigateToDse(navOptions: NavOptions? = null) {
    navigate(dseRoute, navOptions)
}

fun NavGraphBuilder.dseScreen() {
    composable(route = dseRoute) {
        DseScreen()
    }
}