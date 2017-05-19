package com.example.qqmusiclrc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.example.qqmusiclrc.view.LRCTextView;

public class LrcActivity extends Activity implements OnSeekBarChangeListener {
	private LRCTextView lrcTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lrcTv = (LRCTextView) findViewById(R.id.lrcTv);
		((SeekBar) findViewById(R.id.seekBar1))
				.setOnSeekBarChangeListener(this);
	}

	@Override
	public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
		double pro = progress;
		double diver = 100;
		float p = (float) (pro / diver);
		lrcTv.setPercent(p);
	}

	@Override
	public void onStartTrackingTouch(SeekBar arg0) {

	}

	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
	}
}
