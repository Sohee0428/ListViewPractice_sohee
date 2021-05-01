package com.example.listviewpractice_sohee.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice_sohee.datas.Student

class StudentAdapter(
        val mContext : Context,
        val resId : Int,
        val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}