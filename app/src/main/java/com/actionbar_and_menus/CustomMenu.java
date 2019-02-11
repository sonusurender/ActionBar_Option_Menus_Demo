package com.actionbar_and_menus;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CustomMenu extends ActionBarActivity {

	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// Using the same layout but hiding all widgets
		setContentView(R.layout.activity_main);
		findViewById(R.id.show_hide_actionbar).setVisibility(View.GONE);
		findViewById(R.id.custom_menu).setVisibility(View.GONE);
		findViewById(R.id.custom_actionbar).setVisibility(View.GONE);

		actionBar = getSupportActionBar();

		// Showing a back button over actionbar
		actionBar.setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflating actionbar custom menu
		getMenuInflater().inflate(R.menu.custom_menu, menu);

		// Finding id of custom menu
		MenuItem custom = menu.findItem(R.id.custom);

		// Getting actionview of the menu item
		LinearLayout custom_layout = (LinearLayout) MenuItemCompat
				.getActionView(custom);

		// Implementing click listners over custom menu textview and showing a
		// toast
		custom_layout.findViewById(R.id.custom_text_menu).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Toast.makeText(CustomMenu.this, "Text Menu pressed.",
								Toast.LENGTH_SHORT).show();

					}
				});

		// Implementing focus listener over edittext and showing a toast
		custom_layout.findViewById(R.id.custom_edittext_menu)
				.setOnFocusChangeListener(new OnFocusChangeListener() {

					@Override
					public void onFocusChange(View arg0, boolean focus) {

						if (focus) {
							Toast.makeText(CustomMenu.this,
									"Edit Text Focused.", Toast.LENGTH_SHORT)
									.show();
						} else {
							Toast.makeText(CustomMenu.this,
									"Edit Text Focused  changed.",
									Toast.LENGTH_SHORT).show();
						}
					}
				});

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		// Over riding actionbar back button and showing a toast
		case android.R.id.home:
			Toast.makeText(CustomMenu.this, "Home button pressed.",
					Toast.LENGTH_SHORT).show();
			break;

		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// Over riding back pressed button and showing a toast
		Toast.makeText(CustomMenu.this, "Back button pressed.",
				Toast.LENGTH_SHORT).show();
		super.onBackPressed();
	}
}
