# ActionSheet-Android
ActionSheet for android like iOS

<p>
   <img src="https://github.com/cuptech/actionsheet-android/blob/master/Screenshot.png" width="320" alt="Screenshot"/>
</p>

# Usage

### Add dependency

```groovy
dependencies {
    compile 'Todo'
}
```

### Create ActionSheet and show

```kotlin
val itemActions = arrayOf(
    ItemAction(1, "Save"), 
    ItemAction(2, "Delete", true))

ActionSheet.createBuilder(this, supportFragmentManager)
    .setTitle(title)
    .setSubTitle(subTitle)
    .setCancelActionTitle("Cancel")
    .setActionItems(itemActions)
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