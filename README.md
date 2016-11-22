# MyCustomWidgetsLibrary
This is an Android Library for developer to use android customized widgets and change fonts style easily.

<img src="https://raw.githubusercontent.com/L4Digital/FastScroll/master/fastscroll_example.png" alt="screenshot" width="270">


##Download

####Gradle:
~~~groovy
dependencies {
    compile 'com.github.vatsaldesai92:MyCustomWidgetsLibrary:1.0.1'
}
~~~

####Maven:
    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
~~~



##Usage
`FastScrollRecyclerView` extends Android's `RecyclerView` and can be setup the same way.

~~~java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    FastScrollRecyclerView recyclerView = (FastScrollRecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new ExampleAdapter());
}
~~~

Add the `FastScrollRecyclerView` to your xml layout and set your customizations using attributes.  

*The parent ViewGroup must be a CoordinatorLayout, FrameLayout, or RelativeLayout in order for the FastScroller to be properly displayed on top of the RecyclerView.*

~~~xml
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.l4digital.fastscroll.FastScrollRecyclerView
        android:id="@+id/recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:bubbleColor="#00bb00"
        app:bubbleTextColor="#ffffff"
        app:handleColor="#999999"
        app:trackColor="#bbbbbb"
        app:hideScrollbar="false"
        app:showTrack="false" />

</FrameLayout>
~~~

Implement the `FastScroller.SectionIndexer` interface in your RecyclerView Adapter and override `getSectionText()`.

~~~java
class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ViewHolder> implements FastScroller.SectionIndexer {

    ...

    @Override
    public String getSectionText(int position) {
        return getItem(position).getIndex();
    }
}
~~~



##License
    Apache Version 2.0

    Copyright 2016.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
