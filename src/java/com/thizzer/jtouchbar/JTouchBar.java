// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar;

import com.thizzer.jtouchbar.awt.AWTUtils;
import java.awt.Component;
import java.util.ArrayList;
import com.thizzer.jtouchbar.item.TouchBarItem;
import java.util.List;

public class JTouchBar
{
    private String _customizationIdentifier;
    private String _principalItemIdentifier;
    private List<TouchBarItem> _items;
    
    public String getCustomizationIdentifier() {
        return this._customizationIdentifier;
    }
    
    public void setCustomizationIdentifier(final String customizationIdentifier) {
        this._customizationIdentifier = customizationIdentifier;
    }
    
    public String getPrincipalItemIdentifier() {
        return this._principalItemIdentifier;
    }
    
    public void setPrincipalItemIdentifier(final String principalItemIdentifier) {
        this._principalItemIdentifier = principalItemIdentifier;
    }
    
    public List<TouchBarItem> getItems() {
        if (this._items == null) {
            this._items = new ArrayList<TouchBarItem>();
        }
        return this._items;
    }
    
    public void setItems(final List<TouchBarItem> items) {
        this._items = items;
    }
    
    public void addItem(final TouchBarItem touchBarItem) {
        this.getItems().add(touchBarItem);
    }
    
    public void show(final Component c) {
        JTouchBarJNI.setTouchBar0(AWTUtils.getViewPointer(c), this);
    }
    
    public void show(final long window) {
        JTouchBarJNI.setTouchBar0(window, this);
    }
    
    public void hide(final Component c) {
        if (c == null) {
            return;
        }
        JTouchBarJNI.setTouchBar0(AWTUtils.getViewPointer(c), null);
    }
    
    public void hide(final long window) {
        JTouchBarJNI.setTouchBar0(window, null);
    }
}
