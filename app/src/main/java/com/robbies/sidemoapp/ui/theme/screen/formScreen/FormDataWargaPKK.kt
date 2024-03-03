package com.robbies.sidemoapp.ui.theme.screen.formScreen


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robbies.sidemoapp.R
import com.robbies.sidemoapp.ui.theme.data.ToggleableInfo

@RequiresApi(Build.VERSION_CODES.N)
@OptIn(ExperimentalMaterial3Api::class)
@Preview()
@Composable
fun FormDataWargaPKKScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(id = R.string.formHeaderDataWarga)) },
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
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                NumberInputForm(
                    labelValue = stringResource(id = R.string.dasaWismaContoh),
                    textValue = stringResource(id = R.string.dasaWismaLable)
                )
            }

            item {
                StringInputForm(
                    labelValue = stringResource(id = R.string.namaKepalaContoh),
                    textValue = stringResource(id = R.string.namaKepalaLable)
                )
            }

            item {
                NumberInputForm(
                    labelValue = stringResource(id = R.string.nomerRegistrasiContoh),
                    textValue = stringResource(id = R.string.nomerRegistrasiLable)
                )
            }

            item {
                NumberInputForm(
                    labelValue = stringResource(id = R.string.nomerKTPContoh),
                    textValue = stringResource(id = R.string.nomerKTPLable)
                )
            }

            item {
                StringInputForm(
                    labelValue = stringResource(id = R.string.namaWargaContoh),
                    textValue = stringResource(id = R.string.namaWargaLable)
                )
            }

            item {
                StringInputForm(
                    labelValue = stringResource(id = R.string.jabatanContoh),
                    textValue = stringResource(id = R.string.jabatanLable)
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.jenisKelaminLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.lakiLaki)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.perempuan)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.statusPerkawinanLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.menikahRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.lajangRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.jandaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.dudaRadioButton)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.statusDalamKeluargaLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.statusKepalaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.statusAnakRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.statusIstriRadioButton)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.agamaLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.islamRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.hinduRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.buddhaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.katholikRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.kristenRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.konghucuRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.lainnyaRadioButton)
                        ),
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.pendidikanLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.tidakTamatSDRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.SDRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.SMPRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.SMARadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.diplomaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.s1RadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.s2RadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.s3RadioButton)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.pekerjaanLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.petaniRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.PedagangRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.swastaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.wirausahaRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.pnsRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tniRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.lainnyaRadioButton)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.akseptorKBLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.aktifPosyanduLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.binaKeluargaLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.tabunganLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.kelompokBelajarLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.paketARadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.paketBRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.paketCRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.KFRadioButton)
                        ),
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.paudLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                RadioButtonForm(
                    textValue = stringResource(id = R.string.koperasiLable),
                    toggleableInfoList = listOf(
                        ToggleableInfo(
                            isChecked = true,
                            text = stringResource(id = R.string.iya)
                        ),
                        ToggleableInfo(
                            isChecked = false,
                            text = stringResource(id = R.string.tidak)
                        )
                    )
                )
            }

            item {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(48.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .padding(
                            start = 32.dp,
                            end = 32.dp
                        ),
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
    }
}

@Composable
fun StringInputForm(labelValue: String, textValue: String) {
    Box(
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    ) {
        val state = remember { mutableStateOf("") }
        Column {
            Text(text = textValue)

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(
                    text = labelValue,
                    color = colorResource(id = R.color.transparentBlack)
                )},
                value = state.value,
                onValueChange = {
                    state.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    cursorColor = Color.White,
                    focusedBorderColor = colorResource(id = R.color.transparentBlack),
                    unfocusedBorderColor = colorResource(id = R.color.transparentBlack),
                ),
                keyboardOptions = KeyboardOptions.Default,
            )
        }
    }
}

@Composable
fun NumberInputForm(labelValue: String, textValue: String) {
    Box(
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    ) {
        val state = remember { mutableStateOf("") }
        Column {
            Text(text = textValue)

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(
                    text = labelValue,
                    color = colorResource(id = R.color.transparentBlack)
                )},
                value = state.value,
                onValueChange = {
                    state.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    cursorColor = Color.White,
                    focusedBorderColor = colorResource(id = R.color.transparentBlack),
                    unfocusedBorderColor = colorResource(id = R.color.transparentBlack),
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
        }
    }
}

@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun RadioButtonForm(textValue: String, toggleableInfoList: List<ToggleableInfo>) {
    val radioButtons = remember {
        mutableStateListOf<ToggleableInfo>().apply {
            addAll(toggleableInfoList)
        }
    }

    Box(
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    ) {
        Column {
            Text(text = textValue)

            radioButtons.forEach { info ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            radioButtons.replaceAll {
                                it.copy(
                                    isChecked = it.text == info.text
                                )
                            }
                        }
                ) {
                    RadioButton(
                        selected = info.isChecked,
                        onClick = {
                            radioButtons.replaceAll {
                                it.copy(
                                    isChecked = it.text == info.text
                                )
                            }
                        }
                    )
                    Text(text = info.text)
                }
            }
        }
    }
}