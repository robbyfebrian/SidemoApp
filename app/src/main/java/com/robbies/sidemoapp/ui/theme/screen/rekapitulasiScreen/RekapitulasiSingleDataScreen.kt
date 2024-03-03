package com.robbies.sidemoapp.ui.theme.screen.rekapitulasiScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robbies.sidemoapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RekapitulasiSingleDataScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(id = R.string.formHeaderRekapitulasiData)) },
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
                SingleData(stringResource(id = R.string.dasaWismaLable))
            }

            item {
                SingleData(stringResource(id = R.string.namaKepalaLable))
            }

            item {
                SingleData(stringResource(id = R.string.nomerRegistrasiLable))
            }

            item {
                SingleData(stringResource(id = R.string.nomerKTPLable))
            }

            item {
                SingleData(stringResource(id = R.string.namaWargaLable))
            }

            item {
                SingleData(stringResource(id = R.string.jabatanLable))
            }

            item {
                SingleData(stringResource(id = R.string.jenisKelaminLable))
            }

            item {
                SingleData(stringResource(id = R.string.dasaWismaLable))
            }

            item {
                SingleData(stringResource(id = R.string.namaKepalaLable))
            }

            item {
                SingleData(stringResource(id = R.string.nomerRegistrasiLable))
            }

            item {
                SingleData(stringResource(id = R.string.nomerKTPLable))
            }

            item {
                SingleData(stringResource(id = R.string.namaWargaLable))
            }

            item {
                SingleData(stringResource(id = R.string.jabatanLable))
            }

            item {
                SingleData(stringResource(id = R.string.jenisKelaminLable))
            }
        }
    }
}

@Composable
fun SingleData(labelValue: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 16.dp,
                end = 16.dp
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
                    text = labelValue,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.transparentBlack)
                    )
                )

                Text(
                    text = "Hussain Abdillah",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = colorResource(id = R.color.black)
                    )
                )
            }
        }
    }
}