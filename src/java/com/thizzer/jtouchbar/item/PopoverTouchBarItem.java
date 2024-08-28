package com.thizzer.jtouchbar.item;

import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.JTouchBarJNI;
import com.thizzer.jtouchbar.common.Image;
import com.thizzer.jtouchbar.item.view.TouchBarView;

public class PopoverTouchBarItem extends TouchBarItem {
    private TouchBarView _collapsedRepresentation;
    private Image _collapsedRepresentationImage;
    private String _collapsedRepresentationLabel;
    private JTouchBar _popoverTouchBar;
    private JTouchBar _pressAndHoldTouchBar;
    private Boolean _showsCloseButton;

    public PopoverTouchBarItem(String identifier) {
        super(identifier);
    }

    public TouchBarView getCollapsedRepresentation() {
        return this._collapsedRepresentation;
    }

    public void setCollapsedRepresentation(TouchBarView collapsedRepresentation) {
        this._collapsedRepresentation = collapsedRepresentation;
        this.update();
    }

    public Image getCollapsedRepresentationImage() {
        return this._collapsedRepresentationImage;
    }

    public void setCollapsedRepresentationImage(Image collapsedRepresentationImage) {
        this._collapsedRepresentationImage = collapsedRepresentationImage;
        this.update();
    }

    public String getCollapsedRepresentationLabel() {
        return this._collapsedRepresentationLabel;
    }

    public void setCollapsedRepresentationLabel(String collapsedRepresentationLabel) {
        this._collapsedRepresentationLabel = collapsedRepresentationLabel;
        this.update();
    }

    public JTouchBar getPopoverTouchBar() {
        return this._popoverTouchBar;
    }

    public void setPopoverTouchBar(JTouchBar popoverTouchBar) {
        this._popoverTouchBar = popoverTouchBar;
        this.update();
    }

    public JTouchBar getPressAndHoldTouchBar() {
        return this._pressAndHoldTouchBar;
    }

    public void setPressAndHoldTouchBar(JTouchBar pressAndHoldTouchBar) {
        this._pressAndHoldTouchBar = pressAndHoldTouchBar;
        this.update();
    }

    public void showPopover() {
        JTouchBarJNI.callObjectSelector(this.getNativeInstancePointer(), "showPopover", true);
    }

    public void dismissPopover() {
        JTouchBarJNI.callObjectSelector(this.getNativeInstancePointer(), "dismissPopover", true);
    }

    public Boolean isShowsCloseButton() {
        return this._showsCloseButton;
    }

    public void setShowsCloseButton(Boolean showsCloseButton) {
        this._showsCloseButton = showsCloseButton;
        this.update();
    }
}
