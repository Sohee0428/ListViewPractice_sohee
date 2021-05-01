package com.example.listviewpractice_sohee.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpractice_sohee.R
import com.example.listviewpractice_sohee.datas.Student

class StudentAdapter(
        val mContext: Context,
        val resId: Int,
        val mList: ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)

        }

        val row = tempRow!!


        val studentData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)


        nameTxt.text = studentData.name


//        출생년도를 가지고 => (2021년 한국식)나이로 변환해서 보여주기

        val koreanAge = 2021 - studentData.birthYear + 1

        birthYearTxt.text = "(${koreanAge}세)"

        return row

    }
}