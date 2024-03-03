package com.robbies.sidemoapp.ui.theme.screen.rekapitulasiScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robbies.sidemoapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RekapitulasiScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(
                    text = stringResource(id = R.string.formHeaderRekapitulasiData),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppinsmedium)),
                        fontSize = 24.sp
                    )
                )},
                navigationIcon = { Icon(
                    imageVector = Icons.Filled.ArrowBackIosNew,
                    contentDescription = stringResource(
                        id = R.string.backArrow
                    )
                )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 32.dp,
                        end = 32.dp
                    ),
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color.Transparent)
            )
        }
    ) {
        contentPadding ->


        LazyColumn(
            modifier = Modifier
                .padding(contentPadding),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                DataCard()
            }

            item {
                DataCard()
            }

            item {
                DataCard()
            }

            item {
                DataCard()
            }

            item {
                DataCard()
            }

            item {
                DataCard()
            }
        }
    }
}

@Composable
fun DataCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(
                start = 32.dp,
                end = 32.dp
            )
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        colorResource(id = R.color.primary),
                        colorResource(id = R.color.primaryGradient)
                    )
                ),
                shape = RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier
                .padding(
                    start = 20.dp
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Supardi Djojodiningrat",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppinsregular)),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )

                Text(
                    text = "3319010602030001",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.poppinslight)),
                        color = Color.White
                    )
                )
            }
        }
    }
}