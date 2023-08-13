package com.esm.myrecyclerapplication.model

data class EmployeeUiModel(
    val name: String,
    val biography: String,
    val role: EmployeeRole,
    val gender: EmployeeGender,
    val imageUrl: String
) {
}