package a00891437.set3s.comp3975.bankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickLogin(final View view){
        // EditText cardNum = (EditText)findViewById(R.id.cardNumber);
        // EditText passWord = (EditText)findViewById(R.id.password);
        // int card  = Integer.parseInt(cardNum.getText().toString());
        //  String pass = passWord.getText().toString();

        // if(card == 123 && pass == "123"){
        Intent i = new Intent(this, MyRightDrawer.class);
        startActivity(i);
        // }
        // else{
        //  Log.d("MainActivity", "password incorrect");
        //  }
    }
}
