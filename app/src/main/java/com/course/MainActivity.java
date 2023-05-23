package com.course;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int [] ICONS ={R.drawable.cba, R.drawable.cc, R.drawable.ce, R.drawable.cl, R.drawable.clas, R.drawable.gs};
    String [] NAMES = {"College of Business & Accountancy","College of Criminology", "College of Education", "College of Law", "College of Liberal Arts and Sciences", "Graduate Studies"};
    String [] ACROYNM = {"CBA","CC","CE","CL","CLAS", "GS"};

    ListView courselist;


    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView Icons = (ImageView)view.findViewById(R.id.ImgIcon);
            TextView Course = (TextView)view.findViewById(R.id.txtCourse);
            TextView Acrynm = (TextView)view.findViewById(R.id.txtAcroynm);
            Icons.setImageResource(ICONS[i]);
            Course.setText(NAMES[i].toString());
            Acrynm.setText(ACROYNM[i].toString());

            return view;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courselist = (ListView)findViewById(R.id.lvlist);
        CustomAdapter adapter = new CustomAdapter();
        courselist.setAdapter(adapter);
    }
}