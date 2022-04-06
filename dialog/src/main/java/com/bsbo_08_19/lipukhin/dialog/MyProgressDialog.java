package com.bsbo_08_19.lipukhin.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle saveInstance) {
        ProgressDialog progressDialog = new ProgressDialog(this.getContext());
        progressDialog.setProgressStyle(STYLE_NORMAL);
        progressDialog.setMessage("Загрузка");
        return progressDialog;
    }
}
