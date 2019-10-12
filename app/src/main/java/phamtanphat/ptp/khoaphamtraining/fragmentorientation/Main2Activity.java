package phamtanphat.ptp.khoaphamtraining.fragmentorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text= intent.getStringExtra("chuoi");

        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLandDetail);
        if (detailFragment != null){
            detailFragment.txtChitiet.setText(text);
        }
    }
}
