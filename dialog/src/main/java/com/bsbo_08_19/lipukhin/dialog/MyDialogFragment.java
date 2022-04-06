package com.bsbo_08_19.lipukhin.dialog;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle("Здравствуй МИРЭА!")
                .setMessage("Успех близок?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Иду дальше", (dialog, id) -> {
                    ((MainActivity) requireActivity()).onOkClicked();
                    dialog.cancel();
                })
                .setNeutralButton("На паузе",
                        (dialog, id) -> {
                            ((MainActivity) requireActivity()).onNeutralClicked();
                        })
                .setNegativeButton("Нет",
                        (dialog, id) -> {
                            ((MainActivity) requireActivity()).onCancelClicked();
                        });
        return builder.create();
    }
}
