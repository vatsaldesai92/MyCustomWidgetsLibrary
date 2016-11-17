package com.desai.vatsal.mycustomwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by vatsaldesai on 03-11-2016.
 */

public class MyCustomMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    private Context context;

    public MyCustomMultiAutoCompleteTextView(Context context) {
        super(context);
        this.context = context;
    }

    public MyCustomMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    private void init(AttributeSet attrs) {

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyCustomMultiAutoCompleteTextView, 0, 0);

            try {

                String strFontPath = a.getString(R.styleable.MyCustomMultiAutoCompleteTextView_fontPath);

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
