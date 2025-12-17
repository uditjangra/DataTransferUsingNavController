package com.udit.datatransferinnavcontroller

import android.R.attr.text
import android.R.id.input
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(nav : NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
        {
        OutlinedTextField(
            value = input,
            onValueChange = {input = it},
            label = {Text("Enter any text")},
            modifier = Modifier.fillMaxWidth().padding(20,dp))
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {nav.popBackStack()}){
                Text("Back")
            }
    }
}