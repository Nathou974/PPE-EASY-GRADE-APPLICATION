package com.boulet.mapremiereapplication;
/*
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
*/
//N'oubliez pas de déclarer le bon package dans lequel se trouve le fichier !

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends Activity
{
	/*
	private String hello = null;
	*/
	
	private RelativeLayout layout = null;
	private TextView text = null;
	private Button bouton = null;
	

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      
      /*
      hello = getResources().getString(R.string.hello_world);
      hello = hello.replace("world", "les Zéros");
      
      text = new TextView(this);
      texte.setText(hello);
      setContentView(text);
      */
      
      
      // On récupère notre layout par désérialisation. La méthode inflate retourne un View
      layout = (RelativeLayout) RelativeLayout.inflate(this, R.layout.activity_main, null);
      
      // … puis on récupère TextView grâce à son identifiant
      text = (TextView) layout.findViewById(R.id.text);
      text.setText("Et cette fois, ça fonctionne !");
      text.setPadding(90, 60, 70, 90);
      
      bouton = (Button) layout.findViewById(R.id.button);
      bouton.setText("Click meee"); 
      
      setContentView(layout);
      // On aurait très bien pu utiliser « setContentView(R.layout.activity_main) » bien sûr !
  } 
}