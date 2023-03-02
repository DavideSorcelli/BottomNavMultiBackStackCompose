package pokedex.eu.composebottomonavmultistack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import pokedex.eu.composebottomonavmultistack.navigation.BottomNavigationBar
import pokedex.eu.composebottomonavmultistack.navigation.MainNavHost
import pokedex.eu.composebottomonavmultistack.theme.ComposeBottomoNavMultiStackTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeBottomoNavMultiStackTheme {

                val navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(navController = navController)
                    }
                ) { paddingValues ->
                    MainNavHost(
                        navController = navController,
                        modifier = Modifier.padding(paddingValues)
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBottomoNavMultiStackTheme {
        Greeting("Android")
    }
}