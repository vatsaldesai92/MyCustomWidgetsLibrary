package com.desai.vatsal.mycustomwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by vatsaldesai on 03-11-2016.
 */

public class MyCustomTextView extends TextView {

    private Context context;

    public MyCustomTextView(Context context) {
        super(context);
        this.context = context;
    }

    public MyCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    private void init(AttributeSet attrs) {

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyCustomTextView, 0, 0);

            try {

                String strFontPath = a.getString(R.styleable.MyCustomTextView_fontPath);

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
