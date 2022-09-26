package ubu.com.example.miniproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recyler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Friend>friends = new ArrayList<Friend>();
        Friend friend = new Friend();
        friend.setFriend_name("ริว");
        friend.setFriend_immage("https://cdn.discordapp.com/attachments/1021807247531192401/1021807333443112990/friend6.jpg");
        friends.add(friend);
        Friend friend2 = new Friend();
        friend2.setFriend_name("ต่อ");
        friend2.setFriend_immage("https://cdn.discordapp.com/attachments/1021807247531192401/1021807332813983794/friend4.jpg");
        friends.add(friend2);
        Friend friend3 = new Friend();
        friend3.setFriend_name("เบล");
        friend3.setFriend_immage("https://cdn.discordapp.com/attachments/1021807247531192401/1021807331337584730/friend2.jpg");
        friends.add(friend3);
        Friend friend4 = new Friend();
        friend4.setFriend_name("โย");
        friend4.setFriend_immage("https://cdn.discordapp.com/attachments/1021807247531192401/1021807332436480020/friend3.jpg");
        friends.add(friend4);
        Friend friend5 = new Friend();
        friend5.setFriend_name("เก็ต");
        friend5.setFriend_immage("https://cdn.discordapp.com/attachments/1021807247531192401/1021807331052363856/friend1.jpg");
        friends.add(friend5);

        mAdapter = new MyAdapter(friends, this);
        recyclerView.setAdapter(mAdapter);
    }
}