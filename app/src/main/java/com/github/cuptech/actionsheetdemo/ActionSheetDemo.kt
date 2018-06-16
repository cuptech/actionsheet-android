package com.github.cuptech.actionsheetdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.github.cuptech.actionsheet.ActionSheet
import com.github.cuptech.actionsheet.ItemAction

class ActionSheetDemo : AppCompatActivity(), ActionSheet.ActionSheetListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_sheet_demo)
    }

    override fun onDismiss(actionSheet: ActionSheet?, isCancel: Boolean) {
        Log.d("ActionSheetDemo", "onDismiss")
    }

    override fun onActionButtonClick(actionSheet: ActionSheet?, index: Int) {
        Log.d("ActionSheetDemo", "onActionButtonClick")
    }

    private fun showActionSheet(title:String, subTitle:String){

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
    }

    public fun showFullActionSheet(view:View){
        showActionSheet("Action Title", "This is place where you want to show sub title")
    }
    public fun showWithoutSubTitle(view:View){
        showActionSheet("Action Title", "")
    }
    public fun showWithoutTitle(view:View){
        showActionSheet("", "This is place where you want to show sub title")
    }
    public fun showEmpty(view:View){
        showActionSheet("", "")
    }
}
