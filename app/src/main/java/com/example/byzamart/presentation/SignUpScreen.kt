package com.example.byzamart.presentation

import android.R.attr.label
import android.R.attr.text
import android.R.attr.top
import android.graphics.drawable.Icon
import android.provider.ContactsContract
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.key.Key.Companion.F
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.byzamart.presentation.Fields.CustomTextFields


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreen() {
    val context= LocalContext.current
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "SignUp", fontSize = 25.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 16.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Create an Your account",textDecoration = TextDecoration.Underline, fontWeight =FontWeight.Light, fontSize = 16.sp, modifier = Modifier.padding(top = 10.dp))
        CustomTextFields(
            value = firstName,
            onValueChange = { firstName = it },
            label = "First Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier.padding(top = 16.dp)
        )
        CustomTextFields(
            value = lastName,
            onValueChange = { lastName = it },
            label = "Last Name",
                leadingIcon = Icons.Default.Person,
            modifier = Modifier.padding(top = 16.dp)
        )
        CustomTextFields(
            value = phonenumber
            , onValueChange = { phonenumber = it },
            label = "Phone Number",
            leadingIcon = Icons.Default.Phone,
            modifier = Modifier.padding(top = 16.dp)
        )
        CustomTextFields(
            value = email,
            onValueChange = { email= it },
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier.padding(top = 16.dp)
        )
        CustomTextFields(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.padding(top = 16.dp)
        )
        CustomTextFields(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = "Confirm Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.padding(top = 16.dp),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick ={
                if(firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && phonenumber.isNotEmpty()){
                    if(password == confirmPassword) {
                        Toast.makeText(context, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        Toast.makeText(context, "Passwords do not match", Toast.LENGTH_SHORT).show()
                    }
            }
            else{
                    Toast.makeText(context, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
        ){
            Text(text = "Sign Up", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }
        Row(
            modifier = Modifier.padding(top = 16.dp)
        ){
            Text(text = "Already have an account?", fontSize = 14.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Login",
                fontSize = 14.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {
                Toast.makeText(context, "Going to Login Screen", Toast.LENGTH_SHORT).show()
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
