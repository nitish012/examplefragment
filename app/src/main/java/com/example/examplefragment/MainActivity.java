package com.example.examplefragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

class MainActivity extends AppCompatActivity {

    Button bn;
    boolean status=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=findViewById(R.id.bn);


        bn.setOnClickListener(new View.OnClickListener() {

            FragmentManager fragmentManager = getSupportFragmentManager();



            @Override
            public void onClick(View v) {

                if(!status){
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    subfragment f1=new subfragment();
                    fragmentTransaction.add(R.id.layout_fragment,f1);
                   // fragmentTransaction.replace(R.id.layout_fragment, newFragemnt);

                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    bn.setText("Load second fragment");
                    status=true;

                }

                else
                {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    subfragment1 f2=new subfragment1();
                    fragmentTransaction.replace(R.id.layout_fragment,f2);
                    // fragmentTransaction.replace(R.id.layout_fragment, newFragemnt);

                   // fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    bn.setText("Load first fragment");

                    status=true;
                }

            }
        });
    }
}
