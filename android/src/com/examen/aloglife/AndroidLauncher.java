package com.examen.aloglife;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.examen.aloglife.libgdxrun;

public class AndroidLauncher extends AndroidApplication {
	RelativeLayout spineView;
	Button steps;
	int stepTotal;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app);
		stepTotal = getIntent().getExtras().getInt("steps");
		spineView = (RelativeLayout) findViewById(R.id.spineViewID);
		steps = (Button) findViewById(R.id.stepsBTN);
		steps.setText("Steps: " + stepTotal);

		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		spineView.addView(initializeForView(new SimpleTest1(),config));
		//initialize(new SimpleTest1(), config);
	}
}
