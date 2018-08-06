package e.vishal.wardi_pkt;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.TextView);

       if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
       {
          myText.setText("See,I told you");
       }
       else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE);
        {
            myText.setText("Don’t you get bored of me");
        }


    }
}
