package com.example.juexingzhe.annotaioncompiletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.juexingzhe.annotationroute.AnnotationRouteFinder;

import com.example.RouteAnnotation;

@RouteAnnotation(name = "RouteName_MainActivity")
public class MainActivity extends AppCompatActivity {

    TextView mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = (TextView) findViewById(R.id.text_route);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new AnnotationRouteFinder().getActivityRouteName(this.getClass().getSimpleName()))
                .append("\n")
                .append(new AnnotationRouteFinder().getActivityRouteName(Activity2.class.getSimpleName()));
        mTv.setText(stringBuilder.toString());

    }


}
