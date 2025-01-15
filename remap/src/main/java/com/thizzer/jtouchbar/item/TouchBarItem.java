// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item;

import com.thizzer.jtouchbar.JTouchBarJNI;
import java.util.Observable;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import java.util.Observer;
import com.thizzer.jtouchbar.NativeLinkObject;

public class TouchBarItem extends NativeLinkObject implements Observer
{
    public static final String NSTouchBarItemIdentifierFixedSpaceSmall = "NSTouchBarItemIdentifierFixedSpaceSmall";
    public static final String NSTouchBarItemIdentifierFixedSpaceLarge = "NSTouchBarItemIdentifierFixedSpaceLarge";
    public static final String NSTouchBarItemIdentifierFlexibleSpace = "NSTouchBarItemIdentifierFlexibleSpace";
    public static final String NSTouchBarItemIdentifierOtherItemsProxy = "NSTouchBarItemIdentifierOtherItemsProxy";
    private String _identifier;
    private TouchBarView _view;
    private String _customizationLabel;
    private boolean _customizationAllowed;
    
    public TouchBarItem(final String identifier) {
        this(identifier, null);
    }
    
    public TouchBarItem(final String identifier, final TouchBarView view) {
        this(identifier, view, false);
    }
    
    public TouchBarItem(final String identifier, final TouchBarView view, final boolean customizationAllowed) {
        this._identifier = identifier;
        this._customizationAllowed = customizationAllowed;
        this.setView(view);
    }
    
    public String getIdentifier() {
        return this._identifier;
    }
    
    public void setIdentifier(final String identifier) {
        this._identifier = identifier;
        this.update();
    }
    
    public TouchBarView getView() {
        return this._view;
    }
    
    public void setView(final TouchBarView view) {
        this._view = view;
        if (this._view != null) {
            this._view.deleteObservers();
            this._view.addObserver(this);
        }
        this.update();
    }
    
    public String getCustomizationLabel() {
        return this._customizationLabel;
    }
    
    public void setCustomizationLabel(final String customizationLabel) {
        this._customizationLabel = customizationLabel;
        this.update();
    }
    
    public boolean isCustomizationAllowed() {
        return this._customizationAllowed;
    }
    
    public void setCustomizationAllowed(final boolean customizationAllowed) {
        this._customizationAllowed = customizationAllowed;
        this.update();
    }
    
    @Override
    public void update(final Observable observable, final Object obj) {
        this.update();
    }
    
    public void update() {
        this.updateNativeInstance();
    }
    
    private void updateNativeInstance() {
        if (this.getNativeInstancePointer() == 0L) {
            return;
        }
        JTouchBarJNI.updateTouchBarItem(this.getNativeInstancePointer());
    }
}
