package com.actionbar_and_menus;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class CustomActionBar extends ActionBarActivity {
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

		// Setting back button on actionbar
		actionBar.setDisplayHomeAsUpEnabled(true);

		// Disabling the title over actionbar since we are using custom layout
		// for it
		actionBar.setDisplayShowTitleEnabled(false);

		// Layout inflater service for custom layout
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		// Inflating layout
		View view = inflater.inflate(R.layout.cusotm_actionbar, null);

		// Implementing click listeners over actionbar custom title i.e textview
		// and showing a toast
		view.findViewById(R.id.custom_actionbar_title).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Toast.makeText(CustomActionBar.this,
								"Custom title clicked.", Toast.LENGTH_SHORT)
								.show();

					}
				});

		// setting custom view over actionbar
		actionBar.setCustomView(view);

		// enabling custom view
		actionBar.setDisplayShowCustomEnabled(true);

	}
}
