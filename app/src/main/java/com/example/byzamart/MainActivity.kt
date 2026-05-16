package com.example.byzamart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "ByzaMart",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") }
                )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") }
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = { }
                ) {
                    Text("Login")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Continue as Buyer")

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Continue as Seller")
            }
        }
    }
}