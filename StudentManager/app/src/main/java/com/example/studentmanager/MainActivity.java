package com.example.studentmanager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements StudentAdapter.OnStudentClickListener {

    private Toolbar toolbar;
    private RecyclerView recyclerView;

    DatabaseHandler db;
    private List<StudentModel> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHandler(this);
        db.addStudent(new StudentModel("20194020", "Tran Xuan Dong", "dong.tx194020@sis.hust.edu.vn", "26/05/2001"));
        db.addStudent(new StudentModel("20194020", "Tran Xuan Dong", "dong.tx194020@sis.hust.edu.vn", "26/05/2001"));
        db.addStudent(new StudentModel("20194020", "Tran Xuan Dong", "dong.tx194020@sis.hust.edu.vn", "26/05/2001"));
        db.addStudent(new StudentModel("20194020", "Tran Xuan Dong", "dong.tx194020@sis.hust.edu.vn", "26/05/2001"));
        db.addStudent(new StudentModel("20194020", "Tran Xuan Dong", "dong.tx194020@sis.hust.edu.vn", "26/05/2001"));


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(mDividerItemDecoration);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentList = db.getAllStudents();
        recyclerView.setAdapter(new StudentAdapter(MainActivity.this, MainActivity.this, studentList));
    }

    @Override

    public void onStudentClick(StudentModel student) {

    }
}