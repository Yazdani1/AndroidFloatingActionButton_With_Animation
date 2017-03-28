package swe.sofolab.floatingactionbuttonwithanimation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_plus,fab_fab,fab_twitter,fab_instagram;

    TextView one,two,three;

    Animation FadeOpen,FadeClose;

    boolean isOpen=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        one=(TextView)findViewById(R.id.one);
        two=(TextView)findViewById(R.id.two);
        three=(TextView)findViewById(R.id.three);

        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus_xml);

        fab_fab=(FloatingActionButton)findViewById(R.id.fab_fab_xml);

        fab_twitter=(FloatingActionButton)findViewById(R.id.fab_twitter_xml);

        fab_instagram=(FloatingActionButton)findViewById(R.id.fab_instagrm_xml);




        FadeOpen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_open);

        FadeClose=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);



        fab_plus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Add();

                if (isOpen){

                    fab_fab.startAnimation(FadeClose);



                    fab_twitter.startAnimation(FadeClose);

                    fab_instagram.startAnimation(FadeClose);

                    fab_fab.setClickable(false);

                    fab_twitter.setClickable(false);

                    fab_instagram.setClickable(false);


                    one.startAnimation(FadeClose);
                    two.startAnimation(FadeClose);
                    three.startAnimation(FadeClose);

                    one.setClickable(false);
                    two.setClickable(false);
                    three.setClickable(false);

                    isOpen=false;


                }

                else {

                    fab_fab.startAnimation(FadeOpen);
                    fab_twitter.startAnimation(FadeOpen);
                    fab_instagram.startAnimation(FadeOpen);

                    one.startAnimation(FadeOpen);
                    two.startAnimation(FadeOpen);
                    three.startAnimation(FadeOpen);

                    one.setClickable(true);
                    two.setClickable(true);
                    three.setClickable(true);


                    fab_fab.setClickable(true);
                    fab_twitter.setClickable(true);
                    fab_instagram.setClickable(true);

                    isOpen=true;


                }




            }
        });



    }



    public  void Add(){


        fab_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Welcome to my Second Activity",Toast.LENGTH_SHORT).show();

                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                startActivity(i);
            }
        });


        fab_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Like Option",Toast.LENGTH_SHORT).show();
            }
        });


        fab_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Contact Option",Toast.LENGTH_SHORT).show();
            }
        });




    }


}
