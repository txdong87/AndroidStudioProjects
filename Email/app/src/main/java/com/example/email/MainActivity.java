package com.example.email;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<Inbox> inboxList = new LinkedList<>();
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private InboxAdapter adapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();


        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new InboxAdapter(this, inboxList);
        recyclerView.setAdapter(adapter);
        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(mDividerItemDecoration);


    }

    private void addData() {
        inboxList.add(new Inbox("Finhay", "Yêu cầu đặt lại mật khẩu tài khoản Finhay", "XÁC NHẬN THAY ĐỔI MẬT KHẨU", "12 thg 6", false));
        inboxList.add(new Inbox("Codeforces", "Educational Codeforces Round 130 (Rated for Div. 2)", " Hello, 0534194020_DongTX. Welcome to Educational Codeforces Round.The round will be rated for ratings up to 2100.", "12 thg 6", false));
        inboxList.add(new Inbox("Linkedln", "VNG Corporation and others share their thoughts on Linkedln", "Here are your network highlights", "10 thg 6", true));
        inboxList.add(new Inbox("Google","Cảnh báo bảo mật","Mới đăng nhập trên Windows","8 thg 6",false));
        inboxList.add(new Inbox("TopDev","07/06 Cơ hội việc làm IT mới và hấp dẫn tại TopDev. Khám phá ngay bạn nhé","TopDev - Việc làm IT hàng đầu IT Jobs","7 thg 6",false));

    }

}