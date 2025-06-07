package com.oavslab.proyectomoviles.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.oavslab.proyectomoviles.R

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF0F5FBD)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.robot_login),
                contentDescription = "Robot",
                modifier = Modifier.size(180.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Coder Plus",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "¡La forma más divertida, efectiva y\nGRATIS de aprender C++!",
                fontSize = 16.sp,
                color = Color.White,
                lineHeight = 20.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
            )

            Spacer(modifier = Modifier.height(36.dp))

            Button(
                onClick = { /* TODO: Acción */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF003366)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
            ) {
                Text("¡Empieza Ahora!", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("or", color = Color.White)

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedButton(
                onClick = { /* TODO: Registro con Google */ },
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Google Logo",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Regístrate con Google", color = Color.Black)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
