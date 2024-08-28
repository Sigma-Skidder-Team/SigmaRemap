package com.thizzer.jtouchbar.scrubber.view;

import com.thizzer.jtouchbar.common.Image;

public class ScrubberImageItemView extends ScrubberView {
    private Image _image;
    private int _alignment;

    public Image getImage() {
        return this._image;
    }

    public void setImage(Image image) {
        this._image = image;
    }

    public int getAlignment() {
        return this._alignment;
    }

    public void setAlignment(int alignment) {
        this._alignment = alignment;
    }
}
