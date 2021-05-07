package com.example.listviewpractice_sohee.datas

import android.util.Log

// 학생 하위 정보 - 이름, 출생년도

class Student(
    val name: String,
    val birthYear: Int) {

//  2021년 나의 나이를 결과로 내보내주는 함수

    fun getMyAgeIn2021() : Int {

        val myAge = 2021 - this.birthYear + 1

        return myAge
    }

}