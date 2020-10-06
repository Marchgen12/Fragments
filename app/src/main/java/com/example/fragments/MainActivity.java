package com.example.fragments;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;

        import android.os.Bundle;
        import android.app.Fragment;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View v){
        if (v == findViewById(R.id.fragment01)){
            Fragment01 fragment01 = new Fragment01();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentview, fragment01);
            ft.commit();
        }
        if (v == findViewById(R.id.fragment02)){
            Fragment02 fragment02 = new Fragment02();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentview, fragment02);
            ft.commit();
        }
    }
}
