package com.example.ezio.myapplication;



import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class Maptest extends AppCompatActivity {


    ImageView imageView;
    Matrix matrix=new Matrix();
    Float scale=1f;
    ScaleGestureDetector SGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maptest);

        imageView= (ImageView) findViewById(R.id.imageView);
        SGD=new ScaleGestureDetector(this,new ScaleListener());

    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale = scale * detector.getScaleFactor();
            scale = Math.max(0.1f,Math.min(scale, 5f));
            matrix.setScale(scale, scale);
            imageView.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        SGD.onTouchEvent(event);
        return true;
    }
}
