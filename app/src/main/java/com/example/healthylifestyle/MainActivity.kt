package com.example.healthylifestyle

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.healthylifestyle.data.HealthFactor
import com.example.healthylifestyle.data.healthFactors
import com.example.healthylifestyle.ui.theme.HealthyLifestyleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthyLifestyleTheme {
                HLApp()
            }
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HLApp() {
    Scaffold(topBar = {HLTopBar()}) {
        LazyColumn() {
            items(healthFactors) {
            HLCard(it)
            }
        }
    }
}


/**
 * Composable that displays a list item containing a factor that affects health and information
 * including source about it
 *
 * @param healthFactor contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
private fun HLCard(healthFactor: HealthFactor, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = 4.dp,
        modifier = modifier.padding(8.dp).animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    ) {
        Column(
            modifier = modifier
                .clickable(onClick = { expanded = !expanded })
                .padding(8.dp)
        ) {
            Image(painter = painterResource(
                    id = healthFactor.imageResourceId),
                    contentDescription = null,

                )
                Text(
                    text = stringResource(healthFactor.titleResourceId),
                    style = MaterialTheme.typography.h2,

                )
            if(expanded) {
                HealthFactorInfo(healthFactor.infoResourceId, healthFactor.sourceResourceId)
            }
        }
    }
}


@Composable
fun HealthFactorInfo(
    @StringRes infoResourceId: Int,
    @StringRes sourceResourceId: Int,
    modifier: Modifier = Modifier
) {
    Column() {
    Text(
        text = stringResource(infoResourceId),
        style = MaterialTheme.typography.body1,
        modifier = modifier.padding(top = 8.dp, bottom = 4.dp)
    )
    }
}


@Composable
fun HLTopBar() {
    Text(
        text = stringResource(R.string.app_name),
        style = MaterialTheme.typography.h1
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HealthyLifestyleTheme {
        HLApp()

    }
}