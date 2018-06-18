# ActionSheet-Android
ActionSheet for android like iOS

<p>
   <img src="https://github.com/cuptech/actionsheet-android/blob/master/Screenshot.png" width="320" alt="Screenshot"/>
</p>

# Usage

### Add dependency

### Add this to your root build.gradle file:
```groovy
repositories {
    mavenCentral()
    jcenter()
}
```

### Now add the dependency to your app build.gradle file:
```groovy
dependencies {
    compile 'com.github.cuptech:actionsheet-android:1.0'
}
```

### Create ActionSheet and show

```kotlin
val actionItems = arrayOf(
    ActionItem(1, "Save"),
    ActionItem(2, "Delete", true))

ActionSheet.createBuilder(this, supportFragmentManager)
    .setTitle(title)
    .setSubTitle(subTitle)
    .setCancelActionTitle("Cancel")
    .setActionItems(actionItems)
    .setCancelableOnTouchOutside(true)
    .setListener(this).show()
```

### Methods

* `setTitle()` Title, (String)
* `setSubTitle()` Subtitle, (String)
* `setCancelActionTitle()` Cancel button title, (String)
* `setActionItems()` Item buttons title，(String[])
* `setCancelableOnTouchOutside()` Touch outside to close, (boolean)
* `setListener()` set a Listener to listen event
* `show()` Show ActionSheet, return `ActionSheet` Object，call `dismiss()` method of `ActionSheet` to close.

### Listen event

implementing `ActionSheetListener` interface.
* `onOtherButtonClick()` Click item event，`index` is item index.
* `onDismiss()` Dismiss event.

```kotlin
override fun onDismiss(actionSheet: ActionSheet?, isCancel: Boolean) {
    Log.d("ActionSheetDemo", "onDismiss")
}
    
override fun onActionButtonClick(actionSheet: ActionSheet?, index: Int) {
    Log.d("ActionSheetDemo", "onActionButtonClick")
}
```

### Style

You can custom style, can refer to ActionSheetStyleiOS6/ActionSheetStyleiOS7 writing.

```xml
 <!-- Style -->
 <style name="ActionSheetStyle">
     <item name="actionBackground">@android:color/transparent</item>
     <item name="actionTitleBackground">@drawable/slt_as_title</item>
     <item name="actionTitleSingleBackground">@drawable/slt_as_title_single</item>
     <item name="actionSubTitleBackground">@drawable/slt_as_sub_title</item>
     <item name="cancelActionBackground">@drawable/slt_as_action_cancel</item>
     <item name="actionButtonTopBackground">@drawable/slt_as_action_top</item>
     <item name="actionButtonMiddleBackground">@drawable/slt_as_action_middle</item>
     <item name="actionButtonBottomBackground">@drawable/slt_as_action_bottom</item>
     <item name="actionButtonSingleBackground">@drawable/slt_as_action_single</item>
     <item name="actionTitleTextColor">#666666</item>
     <item name="actionSubTitleTextColor">#666666</item>
     <item name="cancelActionTextColor">#1E82FF</item>
     <item name="actionButtonTextColor">#1E82FF</item>
     <item name="actionPadding">30dp</item>
     <item name="actionButtonSpacing">0dp</item>
     <item name="cancelActionMarginTop">10dp</item>
     <item name="actionTextSize">16sp</item>
 </style>
```

### Style attributes
* `actionBackground`
* `actionTitleBackground`
* `actionTitleSingleBackground`
* `actionSubTitleBackground`
* `cancelActionBackground`
* `actionButtonTopBackground`
* `actionButtonMiddleBackground`
* `actionButtonBottomBackground`
* `actionButtonSingleBackground`
* `actionTitleTextColor`
* `actionSubTitleTextColor`
* `cancelActionTextColor`
* `actionButtonTextColor`
* `actionPadding`
* `actionButtonSpacing`
* `cancelActionMarginTop`
* `actionTextSize`

### Customize from
https://github.com/baoyongzhang/android-ActionSheet


The MIT License (MIT)

Copyright (c) 2018 com.github.cuptech

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.