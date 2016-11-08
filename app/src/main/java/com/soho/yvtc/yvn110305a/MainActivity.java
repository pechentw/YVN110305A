package com.soho.yvtc.yvn110305a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] fruits = {"蘋果", "香蕉", "鳳梨", "芭樂", "檸檬","a","b","c","d","f","g","h","i"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        MyAdapter1 adapter = new MyAdapter1(MainActivity.this, fruits);
        lv.setAdapter(adapter);
    }
//    class MyAdapter extends BaseAdapter {
//        @Override
//        public int getCount() {
//            return fruits.length;
//        }
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
//            View v = inflater.inflate(R.layout.myitem, null);
//
//            TextView tv = (TextView) v.findViewById(R.id.textView);
//            tv.setText(fruits[position]);
//            return v;
//        }
//    }
}

