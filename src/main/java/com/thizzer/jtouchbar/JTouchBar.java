package com.thizzer.jtouchbar;

import com.thizzer.jtouchbar.awt.AWTUtils;
import com.thizzer.jtouchbar.item.TouchBarItem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class JTouchBar {
    private String _customizationIdentifier;
    private String _principalItemIdentifier;
    private List<TouchBarItem> _items;

    public String getCustomizationIdentifier() {
        return this._customizationIdentifier;
    }

    public void setCustomizationIdentifier(String customizationIdentifier) {
        this._customizationIdentifier = customizationIdentifier;
    }

    public String getPrincipalItemIdentifier() {
        return this._principalItemIdentifier;
    }

    public void setPrincipalItemIdentifier(String principalItemIdentifier) {
        this._principalItemIdentifier = principalItemIdentifier;
    }

    public List<TouchBarItem> getItems() {
        if (this._items == null) {
            this._items = new ArrayList<TouchBarItem>();
        }

        return this._items;
    }

    public void setItems(List<TouchBarItem> items) {
        this._items = items;
    }

    public void addItem(TouchBarItem touchBarItem) {
        this.getItems().add(touchBarItem);
    }

    public void show(Component c) {
        long var4 = AWTUtils.getViewPointer(c);
        JTouchBarJNI.setTouchBar0(var4, this);
    }

    public void show(long window) {
        JTouchBarJNI.setTouchBar0(window, this);
    }

    public void hide(Component c) {
        if (c != null) {
            long var4 = AWTUtils.getViewPointer(c);
            JTouchBarJNI.setTouchBar0(var4, null);
        }
    }

    public void hide(long window) {
        JTouchBarJNI.setTouchBar0(window, null);
    }
}
