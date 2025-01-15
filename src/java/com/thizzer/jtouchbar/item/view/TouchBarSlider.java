// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.slider.SliderActionListener;

public class TouchBarSlider extends TouchBarView
{
    private double _minValue;
    private double _maxValue;
    private SliderActionListener _actionListener;
    
    public SliderActionListener getActionListener() {
        return this._actionListener;
    }
    
    public void setActionListener(final SliderActionListener actionListener) {
        this._actionListener = actionListener;
    }
    
    public double getMinValue() {
        return this._minValue;
    }
    
    public void setMinValue(final double minValue) {
        this._minValue = minValue;
        this.update();
    }
    
    public double getMaxValue() {
        return this._maxValue;
    }
    
    public void setMaxValue(final double maxValue) {
        this._maxValue = maxValue;
        this.update();
    }
}
