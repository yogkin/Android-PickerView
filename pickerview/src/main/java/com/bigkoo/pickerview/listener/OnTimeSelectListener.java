package com.bigkoo.pickerview.listener;

import android.view.View;

import com.bigkoo.pickerview.view.TimePickerView;

import java.util.Date;

/**
 * Created by xiaosong on 2018/3/20.
 */

public interface OnTimeSelectListener {

    void onTimeSelect(Date date, View v);
}
