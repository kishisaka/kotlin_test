package com.pinger.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.content_name_list.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var nameAdapter: NameAdapter? = null

    private fun getNameList(): List<Name> {
        val nameList = ArrayList<Name>()
        nameList.add(Name("test1  ", "408 940 2344"))
        nameList.add(Name("test1  ", "408 941 2343"))
        nameList.add(Name("hest3  ", "408 840 2342"))
        nameList.add(Name("mest4  ", "408 799 2345"))
        nameList.add(Name("rest1  ", "408 140 2346"))
        nameList.add(Name("rest1  ", "408 340 2390"))
        nameList.add(Name("test1  ", "408 245 2343"))
        nameList.add(Name("gest1  ", "408 640 2348"))
        nameList.add(Name("hest1  ", "408 941 2346"))
        nameList.add(Name("jest1  ", "408 643 2343"))
        return nameList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_list)
        nameAdapter = NameAdapter(getNameList())
        name_list.apply {
            adapter = nameAdapter;
        }
        name_list.adapter = nameAdapter
    }
}
