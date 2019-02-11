package com.actionbar_and_menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	ActionBar actionBar;
	Button show_hide_actionbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Getting actionbar
		actionBar = getSupportActionBar();

		// Setting up logo over actionbar
		actionBar.setDisplayUseLogoEnabled(true);
		actionBar.setDisplayShowHomeEnabled(true);
		actionBar.setLogo(R.drawable.androhub_logo);

		// setting actionbar title
		// actionBar.setTitle("Main Activity");

		// setting actionbar subtitle
		actionBar.setSubtitle("Sub Title");

		show_hide_actionbar = (Button) findViewById(R.id.show_hide_actionbar);

		// Implementing click listener over all buttons
		show_hide_actionbar.setOnClickListener(this);
		findViewById(R.id.custom_menu).setOnClickListener(this);
		findViewById(R.id.custom_actionbar).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		// Finding search menu item
		final MenuItem searchItem = menu.findItem(R.id.search);
		SearchView searchView = (SearchView) MenuItemCompat
				.getActionView(searchItem);

		// Setting hint over search menu
		searchView.setQueryHint("Search here....");

		// Calling query listener on search menu
		SearchView.OnQueryTextListener textListener = new SearchView.OnQueryTextListener() {

			@Override
			public boolean onQueryTextSubmit(String query) {

				// Showing text that is entered in search menu
				Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT)
						.show();

				return false;
			}

			@Override
			public boolean onQueryTextChange(String newText) {

				return true;

			}
		};

		// Implementing query listener
		searchView.setOnQueryTextListener(textListener);
		return true;
	}

	// Implementing click listeners over all menu icons and displaying there
	// texts
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.search:
			Toast.makeText(MainActivity.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;

		case R.id.save:
			Toast.makeText(MainActivity.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.attachment:
			Toast.makeText(MainActivity.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.email:
			Toast.makeText(MainActivity.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;

		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.show_hide_actionbar:

			// Checking if actionbar is visible or not and according to it
			// hiding and showing the actionbar and changing text of button
			if (actionBar.isShowing()) {
				actionBar.hide();
				show_hide_actionbar.setText(R.string.show);
			} else {
				actionBar.show();
				show_hide_actionbar.setText(R.string.hide);
			}

			break;

		// Starting a new activity
		case R.id.custom_menu:
			startActivity(new Intent(MainActivity.this, CustomMenu.class));

			break;
		case R.id.custom_actionbar:
			startActivity(new Intent(MainActivity.this, CustomActionBar.class));

			break;
		}

	}
}
