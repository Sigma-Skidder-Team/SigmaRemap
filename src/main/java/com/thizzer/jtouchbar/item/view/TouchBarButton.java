package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.JTouchBarJNI;
import com.thizzer.jtouchbar.common.Color;
import com.thizzer.jtouchbar.common.Image;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

public class TouchBarButton extends TouchBarView {
    private String _title;
    private String _alternateTitle;
    private Image _image;
    private Image _alternateImage;
    private int _imagePosition = 6;
    private Color _bezelColor;
    private TouchBarViewAction _action;
    private TouchBarButton$ButtonType _type = TouchBarButton$ButtonType.MOMENTARY_LIGHT;
    private boolean _allowsMixedState;

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String title) {
        this._title = title;
        this.update();
    }

    public String getAlternateTitle() {
        return this._alternateTitle;
    }

    public void setAlternatTitle(String alternateTitle) {
        this._alternateTitle = alternateTitle;
        this.update();
    }

    public Image getImage() {
        return this._image;
    }

    public void setImage(Image image) {
        this._image = image;
        this.update();
    }

    public Image getAlternateImage() {
        return this._alternateImage;
    }

    public void setAlternateImage(Image alternateImage) {
        this._alternateImage = alternateImage;
        this.update();
    }

    public int getImagePosition() {
        return this._imagePosition;
    }

    public void setImagePosition(int imagePosition) {
        this._imagePosition = imagePosition;
        this.update();
    }

    public Color getBezelColor() {
        return this._bezelColor;
    }

    public void setBezelColor(Color bezelColor) {
        this._bezelColor = bezelColor;
        this.update();
    }

    public TouchBarViewAction getAction() {
        return this._action;
    }

    public void setAction(TouchBarViewAction action) {
        this._action = action;
        this.update();
    }

    public TouchBarButton$ButtonType getType() {
        return this._type;
    }

    public void setType(TouchBarButton$ButtonType type) {
        this._type = type;
        this.update();
    }

    public int getButtonType() {
        return this._type.ordinal();
    }

    public boolean getAllowsMixedState() {
        return this._allowsMixedState;
    }

    public void setAllowsMixedState(boolean allowsMixedState) {
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
        if (this._action != null) {
            this._action.onCall(this);
        }
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
