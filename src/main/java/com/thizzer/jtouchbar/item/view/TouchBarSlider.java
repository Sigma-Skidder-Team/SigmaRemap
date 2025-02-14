package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.slider.SliderActionListener;

public class TouchBarSlider extends TouchBarView {
    private double _minValue;
    private double _maxValue;
    private SliderActionListener _actionListener;

    public SliderActionListener getActionListener() {
        return this._actionListener;
    }

    public void setActionListener(SliderActionListener actionListener) {
        this._actionListener = actionListener;
    }

    public double getMinValue() {
        return this._minValue;
    }

    public void setMinValue(double minValue) {
        this._minValue = minValue;
        this.update();
    }

    public double getMaxValue() {
        return this._maxValue;
    }

    public void setMaxValue(double maxValue) {
        this._maxValue = maxValue;
        this.update();
    }
}
