// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.JTouchBarJNI;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;
import com.thizzer.jtouchbar.common.Color;
import com.thizzer.jtouchbar.common.Image;

public class TouchBarButton extends TouchBarView
{
    private String _title;
    private String _alternateTitle;
    private Image _image;
    private Image _alternateImage;
    private int _imagePosition;
    private Color _bezelColor;
    private TouchBarViewAction _action;
    private TouchBarButton$ButtonType _type;
    private boolean _allowsMixedState;
    
    public TouchBarButton() {
        this._imagePosition = 6;
        this._type = TouchBarButton$ButtonType.MOMENTARY_LIGHT;
    }
    
    public String getTitle() {
        return this._title;
    }
    
    public void setTitle(final String title) {
        this._title = title;
        this.update();
    }
    
    public String getAlternateTitle() {
        return this._alternateTitle;
    }
    
    public void setAlternatTitle(final String alternateTitle) {
        this._alternateTitle = alternateTitle;
        this.update();
    }
    
    public Image getImage() {
        return this._image;
    }
    
    public void setImage(final Image image) {
        this._image = image;
        this.update();
    }
    
    public Image getAlternateImage() {
        return this._alternateImage;
    }
    
    public void setAlternateImage(final Image alternateImage) {
        this._alternateImage = alternateImage;
        this.update();
    }
    
    public int getImagePosition() {
        return this._imagePosition;
    }
    
    public void setImagePosition(final int imagePosition) {
        this._imagePosition = imagePosition;
        this.update();
    }
    
    public Color getBezelColor() {
        return this._bezelColor;
    }
    
    public void setBezelColor(final Color bezelColor) {
        this._bezelColor = bezelColor;
        this.update();
    }
    
    public TouchBarViewAction getAction() {
        return this._action;
    }
    
    public void setAction(final TouchBarViewAction action) {
        this._action = action;
        this.update();
    }
    
    public TouchBarButton$ButtonType getType() {
        return this._type;
    }
    
    public void setType(final TouchBarButton$ButtonType type) {
        this._type = type;
        this.update();
    }
    
    public int getButtonType() {
        return this._type.ordinal();
    }
    
    public boolean getAllowsMixedState() {
        return this._allowsMixedState;
    }
    
    public void setAllowsMixedState(final boolean allowsMixedState) {
        this._allowsMixedState = allowsMixedState;
        this.update();
    }
    
    public void setNextState() {
        JTouchBarJNI.callObjectSelector(this.getNativeInstancePointer(), "setNextState", true);
    }
    
    public int getState() {
        return JTouchBarJNI.callIntObjectSelector(this.getNativeInstancePointer(), "state");
    }
    
    public void trigger() {
        if (this._action == null) {
            return;
        }
        this._action.onCall(this);
    }
    
    public boolean isEnabled() {
        return this._action == null || this._action.isEnabled();
    }
    
    public void fireActionStateChanged() {
        if (this._action != null) {
            this.update();
        }
    }
}
