package com.example.goalkeeper.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.goalkeeper.LocalNavGraphViewModelStoreOwner
import com.example.goalkeeper.component.GoalKeeperButton
import com.example.goalkeeper.model.UserRoutine
import com.example.goalkeeper.style.AppStyles.korTitleStyle
import com.example.goalkeeper.viewmodel.GoalKeeperViewModel

@Composable
fun RoutineScreen(navController: NavHostController) {

    val viewModel: GoalKeeperViewModel =
        viewModel(viewModelStoreOwner = LocalNavGraphViewModelStoreOwner.current)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Routine Screen")

        GoalKeeperButton(
            width = 200,
            height = 60,
            text = "루틴 추가",
            textStyle = korTitleStyle
        ) {
            viewModel.insertRoutine(UserRoutine())
        }
        Spacer(modifier = Modifier.padding(15.dp))
        GoalKeeperButton(
            width = 200,
            height = 60,
            text = "돌아가기",
            textStyle = korTitleStyle
        ) {
            navController.popBackStack()
        }
    }
}