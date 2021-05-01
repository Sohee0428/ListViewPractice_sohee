package com.example.listviewpractice_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_sohee.adapters.StudentAdapter
import com.example.listviewpractice_sohee.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter: StudentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("권소희", 1997))
        mStudentList.add(Student("정상훈", 1994))
        mStudentList.add(Student("김지영", 1997))
        mStudentList.add(Student("권재훈", 1999))
        mStudentList.add(Student("김도아", 2020))
        mStudentList.add(Student("전영주", 1997))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListVIew.adapter = mAdapter
    }


}