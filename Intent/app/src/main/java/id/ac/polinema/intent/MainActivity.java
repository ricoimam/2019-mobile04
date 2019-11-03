
package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent i = new Intent(this, ExplicitIntentActivity.class);
        startActivity(i);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImlicitIntent(View view) {
        Intent i = new Intent(this, ImplicitIntentActivity.class);
        startActivity(i);
    }

    public void handlerBundle(View view) {
        Intent i = new Intent(this, BundleActivity.class);
        startActivity(i);
    }

    public void handleParcel(View view) {
        Intent i = new Intent(this, ParcelableActivity.class);
        startActivity(i);
    }
}