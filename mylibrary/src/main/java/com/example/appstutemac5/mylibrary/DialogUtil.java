package com.example.appstutemac5.mylibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogUtil {
	private static AlertDialog alertDialog;

	public static void show(Context mContext, String title, String msg,
			String positiveButtonText, String negativeButtonText,
			DialogInterface.OnClickListener positiveListener,
			DialogInterface.OnClickListener negativeListener) {

		// display invalid user name or password
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				mContext);
		alertDialogBuilder.setCancelable(false);
		// set title
		if (title != null)
			alertDialogBuilder.setTitle(title);
		// set dialog message
		if (msg != null)
			alertDialogBuilder.setMessage(msg);
		// Positive button
		if (!TextUtil.isEmpty(positiveButtonText))
			alertDialogBuilder.setPositiveButton(positiveButtonText,
					positiveListener);
		// Negative button
		if (!TextUtil.isEmpty(negativeButtonText))
			alertDialogBuilder.setPositiveButton(negativeButtonText,
					negativeListener);
		// create alert dialog
		if (alertDialog != null)
			alertDialog.dismiss();
		alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	public static void dismiss() {
		if (alertDialog != null)
			alertDialog.dismiss();
	}
}
