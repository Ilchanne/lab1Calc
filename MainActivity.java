package com.example.lab1_ilchenko204;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ///Ильченко 204 группа
    EditText na;
    EditText nb;
    TextView otv;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        na = findViewById(R.id.Num1);
        nb = findViewById(R.id.Num2);
        otv = findViewById(R.id.res);
    }


    public void add_click (View v)
    {
        try
        {
            String sa = na.getText().toString();
            String sb = nb.getText().toString();

            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = a + b;

            String sc = String.valueOf(c);
///Ильченко 204 группа
            otv.setText(sc);
        }
        catch(Exception exception)
        {
            otv.setText("Try again");
            return;
        }
    }
    public void sub_click (View v)
    {
        try
        {
            String sa = na.getText().toString();
            String sb = nb.getText().toString();

            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = a - b;

            String sc = String.valueOf(c);

            otv.setText(sc);
        }
        catch (Exception exception)
        {
            otv.setText("Try again");
            return;
        }
    }
    public void mul_click (View v)
    {
        try
        {
            String sa = na.getText().toString();
            String sb = nb.getText().toString();

            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = a * b;

            String sc = String.valueOf(c);
///Ильченко 204
            otv.setText(sc);
        }
        catch(Exception exception)
        {
            otv.setText("Try again");
            return;
        }
    }
    public void div_click (View v)
    {
        try
        {
            String sa = na.getText().toString();
            String sb = nb.getText().toString();

            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);
            int c = a / b;

            String sc = String.valueOf(c);

            otv.setText(sc);
        }
        catch (Exception exception)
        {
            otv.setText("Try again");
            return;
        }
    }
}