package com.example.demo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(
    navController: NavController
) {

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Terms and Condition")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Peer Review")
        }

    }

}

@Composable
fun TermsAndCondition(
    navController: NavController
) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Enquiry")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Visit Sponsor Website")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .size(80.dp),
            shape = CircleShape,
            onClick = {
                navController.popBackStack()
            }) {
            Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null)
        }

    }
}

@Composable
fun PeerReview(
    navController: NavController
) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Applied")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Bookmark")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .size(80.dp),
            shape = CircleShape,
            onClick = {
                navController.popBackStack()
            }) {
            Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null)
        }

    }
}

@Composable
fun VisitSponsor(
    navController: NavController
) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Applied")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Blue),
            onClick = {

            }) {
            Text(text = "Bookmark")
        }

        OutlinedButton(
            modifier = Modifier
                .padding(top = 40.dp)
                .size(80.dp),
            shape = CircleShape,
            onClick = {
                navController.popBackStack()
            }) {
            Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null)
        }

    }
}