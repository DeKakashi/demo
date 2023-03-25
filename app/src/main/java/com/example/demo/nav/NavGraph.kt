package com.example.demo.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.demo.screens.MainScreen
import com.example.demo.screens.PeerReview
import com.example.demo.screens.TermsAndCondition

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = NavRoute.MainScreen.route) {

        composable(route = NavRoute.MainScreen.route) {
            MainScreen(navController = navController)
        }

        composable(route = NavRoute.TermsAndCondition.route) {
            TermsAndCondition(navController = navController)
        }

        composable(route = NavRoute.PeerReview.route) {
            PeerReview(navController = navController)
        }

        composable(route = NavRoute.VisitSponsor.route) {
//            (navController = navController)
        }

        composable(route = NavRoute.PeerReview.route) {
            PeerReview(navController = navController)
        }

    }

}