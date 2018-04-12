package udacity.designvilla;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import com.example.android.splashscreenjava.R;

public class MainActivity extends AppCompatActivity {

    public final static int TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);
    }
}
