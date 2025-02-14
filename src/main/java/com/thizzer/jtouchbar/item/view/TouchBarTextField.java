package com.thizzer.jtouchbar.item.view;

public class TouchBarTextField extends TouchBarView {
    private String _stringValue;

    public String getStringValue() {
        return this._stringValue;
    }

    public void setStringValue(String stringValue) {
        this._stringValue = stringValue;
        this.update();
    }
}
