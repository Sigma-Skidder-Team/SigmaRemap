// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item.view;

import com.thizzer.jtouchbar.scrubber.ScrubberDataSource;
import com.thizzer.jtouchbar.scrubber.ScrubberActionListener;
import com.thizzer.jtouchbar.common.Color;

public class TouchBarScrubber extends TouchBarView
{
    private int _mode;
    private boolean _showsArrowButtons;
    private Color _backgroundColor;
    private int _selectionOverlayStyle;
    private int _selectionBackgroundStyle;
    private ScrubberActionListener _actionListener;
    private ScrubberDataSource _dataSource;
    
    public int getMode() {
        return this._mode;
    }
    
    public void setMode(final int mode) {
        this._mode = mode;
        this.update();
    }
    
    public boolean getShowsArrowButtons() {
        return this._showsArrowButtons;
    }
    
    public void setShowsArrowButtons(final boolean showsArrowButtons) {
        this._showsArrowButtons = showsArrowButtons;
        this.update();
    }
    
    public Color getBackgroundColor() {
        return this._backgroundColor;
    }
    
    public void setBackgroundColor(final Color backgroundColor) {
        this._backgroundColor = backgroundColor;
        this.update();
    }
    
    public int getSelectionOverlayStyle() {
        return this._selectionOverlayStyle;
    }
    
    public void setSelectionOverlayStyle(final int selectionOverlayStyle) {
        this._selectionOverlayStyle = selectionOverlayStyle;
        this.update();
    }
    
    public int getSelectionBackgroundStyle() {
        return this._selectionBackgroundStyle;
    }
    
    public void setSelectionBackgroundStyle(final int selectionBackgroundStyle) {
        this._selectionBackgroundStyle = selectionBackgroundStyle;
        this.update();
    }
    
    public ScrubberActionListener getActionListener() {
        return this._actionListener;
    }
    
    public void setActionListener(final ScrubberActionListener actionListener) {
        this._actionListener = actionListener;
    }
    
    public ScrubberDataSource getDataSource() {
        return this._dataSource;
    }
    
    public void setDataSource(final ScrubberDataSource dataSource) {
        this._dataSource = dataSource;
    }
}
