package com.thizzer.jtouchbar.item;

import com.thizzer.jtouchbar.JTouchBarJNI;
import com.thizzer.jtouchbar.NativeLinkObject;
import com.thizzer.jtouchbar.item.view.TouchBarView;

import java.util.Observable;
import java.util.Observer;

public class TouchBarItem extends NativeLinkObject implements Observer {
    public static final String NSTouchBarItemIdentifierFixedSpaceSmall = "NSTouchBarItemIdentifierFixedSpaceSmall";
    public static final String NSTouchBarItemIdentifierFixedSpaceLarge = "NSTouchBarItemIdentifierFixedSpaceLarge";
    public static final String NSTouchBarItemIdentifierFlexibleSpace = "NSTouchBarItemIdentifierFlexibleSpace";
    public static final String NSTouchBarItemIdentifierOtherItemsProxy = "NSTouchBarItemIdentifierOtherItemsProxy";
    private String _identifier;
    private TouchBarView _view;
    private String _customizationLabel;
    private boolean _customizationAllowed;

    public TouchBarItem(String identifier) {
        this(identifier, null);
    }

    public TouchBarItem(String identifier, TouchBarView view) {
        this(identifier, view, false);
    }

    public TouchBarItem(String identifier, TouchBarView view, boolean customizationAllowed) {
        this._identifier = identifier;
        this._customizationAllowed = customizationAllowed;
        this.setView(view);
    }

    public String getIdentifier() {
        return this._identifier;
    }

    public void setIdentifier(String identifier) {
        this._identifier = identifier;
        this.update();
    }

    public TouchBarView getView() {
        return this._view;
    }

    public void setView(TouchBarView view) {
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

    public void setCustomizationLabel(String customizationLabel) {
        this._customizationLabel = customizationLabel;
        this.update();
    }

    public boolean isCustomizationAllowed() {
        return this._customizationAllowed;
    }

    public void setCustomizationAllowed(boolean customizationAllowed) {
        this._customizationAllowed = customizationAllowed;
        this.update();
    }

    @Override
    public void update(Observable observable, Object obj) {
        this.update();
    }

    public void update() {
        this.updateNativeInstance();
    }

    private void updateNativeInstance() {
        if (this.getNativeInstancePointer() != 0L) {
            JTouchBarJNI.updateTouchBarItem(this.getNativeInstancePointer());
        }
    }
}
