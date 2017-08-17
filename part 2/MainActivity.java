package com.example.dmitry.billioner2;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> q;//questions
    private List<String> lans1,lans2,lans3,lans4;//answer list
    private List<Integer> rans;//right answers
    private List<Integer> hasNum;

    private Integer count=10;
    private Integer current=0;
    private Integer num=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateQuestions();
        Random rnd=new Random();

        final TextView question = (TextView) findViewById(R.id.question);
        final Button ans1 = (Button) findViewById(R.id.ans1);
        final Button ans2 = (Button) findViewById(R.id.ans2);
        final Button ans3 = (Button) findViewById(R.id.ans3);
        final Button ans4 = (Button) findViewById(R.id.ans4);

        num=rnd.nextInt(count+1);
        hasNum.add(num);

        question.setText(q.get(num));
        ans1.setText(lans1.get(num));
        ans2.setText(lans2.get(num));
        ans3.setText(lans3.get(num));
        ans4.setText(lans4.get(num));



        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ansNum = Integer.valueOf(v.getTag().toString());
                if (rans.get(num)!=ansNum){
                    Toast.makeText(MainActivity.this,"Неверно",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Верно",Toast.LENGTH_SHORT).show();
                }

                if (current<count){
                    Random rnd=new Random();
                    while(true){
                        num=rnd.nextInt(count+1);
                        if (!hasNum.contains(num)){
                            hasNum.add(num);
                            break;
                        }
                    }
                    question.setText(q.get(num));
                    ans1.setText(lans1.get(num));
                    ans2.setText(lans2.get(num));
                    ans3.setText(lans3.get(num));
                    ans4.setText(lans4.get(num));
                    current++;
                }else{
                    Toast.makeText(MainActivity.this,"Игра закончена!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void generateQuestions() {
        q.add(("Красный на английском?").toString());
        q.add("Синий на английском?");
        q.add("Белый на английском?");
        q.add("Зеленый на английском?");
        q.add("Крупнейшая российская it компания?");
        q.add("Крупнейшая иностранная it компания");
        q.add("Вода по английски?");
        q.add("Стена по английски?");
        q.add("Монитор по английски?");
        q.add("Мышь по английски?");

        lans1.add("Red");
        lans1.add("Red");
        lans1.add("Red");
        lans1.add("Red");
        lans1.add("Yandex");
        lans1.add("Google");
        lans1.add("red");
        lans1.add("red");
        lans1.add("monitor");
        lans1.add("mouse");

        lans2.add("blue");
        lans2.add("Red");
        lans2.add("White");
        lans2.add("Red");
        lans2.add("Балтика?");
        lans2.add("Балтика");
        lans2.add("blue");
        lans2.add("blue");
        lans2.add("blue");
        lans2.add("mouse");

        lans3.add("blue");
        lans3.add("Blue");
        lans3.add("Red");
        lans3.add("Red");
        lans3.add("Балтика");
        lans3.add("Балтика");
        lans3.add("blue");
        lans3.add("wall");
        lans3.add("blue");
        lans3.add("blue");

        lans4.add("blue");
        lans4.add("Red");
        lans4.add("Red");
        lans4.add("Green");
        lans4.add("Балтика?");
        lans4.add("Балтика");
        lans4.add("water");
        lans4.add("blue");
        lans4.add("blue");
        lans4.add("mouse");

        rans.add(1);
        rans.add(3);
        rans.add(2);
        rans.add(4);
        rans.add(1);
        rans.add(1);
        rans.add(4);
        rans.add(3);
        rans.add(1);
        rans.add(1);
    }
}
