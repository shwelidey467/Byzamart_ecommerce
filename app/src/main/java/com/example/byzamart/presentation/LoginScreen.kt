package com.example.byzamart.presentation

import android.R.attr.onClick
import android.R.attr.text
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.byzamart.presentation.Fields.CustomTextFields
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.base.Defaults

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    val context= LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().padding(top=60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text="Welcome to ByzaMart", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shopping Cart", tint = Color.Blue, modifier = Modifier.size(70.dp).padding(top = 30.dp))
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(top=0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
            Text(text="ByzaMart",fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        CustomTextFields(
            value = email,
            onValueChange = { email = it },
            label = "Email",
            leadingIcon = Icons.Default.Email,
        )
        Spacer(modifier = Modifier.height(16.dp))
        CustomTextFields(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = Icons.Default.Lock,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick={
                if(email.isNotEmpty() && password.isNotEmpty()){
                    Toast.makeText(context, "Logging in Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Please enter email and password", Toast.LENGTH_SHORT).show()
                }
            }
        ) {
            Text(text = "Login", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Forgot Password?", fontSize = 14.sp, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.padding(top = 16.dp)
        ){
            Text(text = "Don't have an account?", fontSize = 14.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Sign Up",
                fontSize = 14.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {
                    Toast.makeText(context, "Going to Sign Up Screen", Toast.LENGTH_SHORT).show()
                })
        }
        Row(
            modifier =Modifier.fillMaxWidth(0.9f).padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.Black)
            Text(text = "OR", modifier = Modifier.padding(horizontal = 8.dp), color = Color.Gray)
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.Black)
        }
        OutlinedButton(
            onClick ={
                Toast.makeText(context, "Sign Up with Google", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth(0.8f).padding(vertical = 12.dp),
            shape= RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Black,
                contentColor = Color.Black
            ),
        ) {
            Image(painter = painterResource(id = com.example.byzamart.R.drawable.google), contentDescription = null, modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign Up with Google", fontSize = 14.sp, fontWeight = FontWeight.Bold,color =Color.White)


        }
    }
    }