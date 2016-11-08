package com.soho.yvtc.yvn110305a;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yvtc on 2016/11/8.
 */

public class MyAdapter1 extends BaseAdapter {
    Context context;
    String[] data;
    public MyAdapter1(Context c, String[] f)
    {
        context = c;
        data = f;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from( context);
        View v = inflater.inflate(R.layout.myitem, null);

        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data[position]);

        Button btn = (Button) v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, data[position], Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
