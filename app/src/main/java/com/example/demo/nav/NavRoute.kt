package com.example.demo.nav

sealed class NavRoute(val route: String) {
    object MainScreen: NavRoute(route = "main_screen")
    object TermsAndCondition: NavRoute(route = "terms_and_condition")
    object PeerReview: NavRoute(route = "peer_review")
    object Enquiry: NavRoute(route = "enquiry_screen")
    object VisitSponsor: NavRoute(route = "visit_sponsor")
    object AppliedScreen: NavRoute(route = "applied_screen")
    object BookmarkScreen: NavRoute(route = "bookmark_screen")
}
