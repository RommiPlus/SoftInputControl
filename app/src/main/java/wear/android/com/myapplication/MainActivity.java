package wear.android.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter mAdapter;

    private ListView mDataListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ButterKnife.bind(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataListView = (ListView) findViewById(R.id.listview_consultation);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, makeItems());
        mDataListView.setAdapter(mAdapter);
    }

    public List<String> makeItems () {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String item = getString(R.string.info, String.valueOf(i));
            list.add(item);
        }
        return list;
    }
}
