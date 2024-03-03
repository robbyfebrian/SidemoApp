package com.robbies.sidemoapp.ui.theme.screen.loginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robbies.sidemoapp.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 32.dp,
                    end = 32.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_kudus),
                    contentDescription = stringResource(
                        id = R.string.logoKudus
                    ),
                    modifier = Modifier
                        .height(80.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Box {
                    Column {
                        MultiStyleText(
                            fontSize = 32,
                            text1 = stringResource(id = R.string.greetingHeader),
                            color1 = colorResource(id = R.color.black),
                            text2 = stringResource(id = R.string.greetingSpan),
                            color2 = colorResource(id = R.color.primary))

                        Text(
                           text = stringResource(id = R.string.greetingSubheader),
                            fontSize = 14.sp
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        val emailState = remember { mutableStateOf("")}

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(text = stringResource(id = R.string.emailLabel))},
                            value = emailState.value,
                            onValueChange = {
                                emailState.value = it
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent,
                                cursorColor = Color.White,
                                focusedBorderColor = colorResource(id = R.color.secondary),
                                unfocusedBorderColor = colorResource(id = R.color.secondary),
                            ),
                            keyboardOptions = KeyboardOptions.Default,
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = stringResource(id = R.string.emailLabel))
                            }
                        )

                        val passwordVisibility = remember { mutableStateOf(false) }
                        val password = remember { mutableStateOf ("" ) }

                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth(),
                            value = password.value,
                            onValueChange = {
                                password.value = it
                            },
                            label = { Text(text = stringResource(id = R.string.passwordLabel))},
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent,
                                cursorColor = Color.White,
                                focusedBorderColor = colorResource(id = R.color.secondary),
                                unfocusedBorderColor = colorResource(id = R.color.secondary),
                            ),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Lock, contentDescription = stringResource(id = R.string.passwordLabel))
                            },
                            trailingIcon = {
                                IconButton(onClick = { passwordVisibility.value = !passwordVisibility.value }) {
                                    Icon(
                                        imageVector = if (passwordVisibility.value) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                        contentDescription = if (passwordVisibility.value) stringResource(id = R.string.hidePassword) else stringResource(
                                            id = R.string.showPassword
                                        ))
                                }
                            },
                            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation()
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Button(
                            onClick = { },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(48.dp)
                                .clip(shape = RoundedCornerShape(10.dp)),
                            contentPadding = PaddingValues(),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(48.dp)
                                    .background(
                                        brush = Brush.horizontalGradient(
                                            listOf(
                                                colorResource(id = R.color.primary),
                                                colorResource(id = R.color.primaryGradient)
                                            )
                                        ),
                                        shape = RoundedCornerShape(0.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = stringResource(id = R.string.loginButton),
                                    fontSize = 20.sp
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(60.dp))

                Box(
                    contentAlignment = Alignment.BottomCenter
                ) {
                    MultiStyleText(
                        fontSize = 14,
                        text1 = stringResource(id = R.string.loginFooter),
                        color1 = colorResource(id = R.color.black),
                        text2 = stringResource(id = R.string.loginSpan),
                        color2 = colorResource(id = R.color.secondary)
                    )
                }
            }
        }
    }
}

@Composable
fun MultiStyleText(fontSize: Int, text1: String, color1: Color, text2: String, color2: Color) {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(color = color1)) {
                append(text1)
            }
            withStyle(style = SpanStyle(color = color2)) {
                append(text2)
            }
        },
        style = TextStyle(
            fontSize = fontSize.sp
        )
    )
}