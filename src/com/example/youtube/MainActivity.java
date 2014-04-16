package com.example.youtube;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity
{
	WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		webView = (WebView)findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setPluginState(PluginState.ON);
		webView.getSettings().setPluginsEnabled(true);
		webView.setBackgroundColor(Color.parseColor("#00000000"));
		
		String iframe = "<iframe " +
				"src=\"http://www.youtube.com/embed/mDjnBETrctY\"" +
				" frameborder=\"0\" allowfullscreen></iframe>";
		
		webView.loadData(iframe, "text/html", "utf-8");	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
