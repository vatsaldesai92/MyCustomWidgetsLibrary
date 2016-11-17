package com.desai.vatsal.mycustomwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ToggleButton;

/**
 * Created by vatsaldesai on 03-11-2016.
 */

public class MyCustomToggleButton extends ToggleButton {

    private Context context;

    public MyCustomToggleButton(Context context) {
        super(context);
        this.context = context;
    }

    public MyCustomToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    private void init(AttributeSet attrs) {

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyCustomToggleButton, 0, 0);

            try {

                String strFontPath = a.getString(R.styleable.MyCustomToggleButton_fontPath);

                if (!TextUtils.isEmpty(strFontPath)) {
                    Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), strFontPath);
                    setTypeface(myTypeface);
                }

            } catch (Exception e) {
                Log.e("e", String.valueOf(e));
            } finally {
                a.recycle();
            }

        }

    }


}
