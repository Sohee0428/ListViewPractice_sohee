package com.example.listviewpractice_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

        for (std in mStudentList) {
            Log.d("학생 이름", std.name)
        }


        for ( i in 0 until 5) {
            Log.d("숫자", i.toString())
        }

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListVIew.adapter = mAdapter

        studentListVIew.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}이 클릭 됨", Toast.LENGTH_SHORT).show()


        }


        studentListVIew.setOnItemLongClickListener { parent, view, position, id ->

            mStudentList.removeAt(position)

            mAdapter.notifyDataSetChanged()


            return@setOnItemLongClickListener true
        }
    }


}