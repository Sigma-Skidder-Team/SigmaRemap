package com.thizzer.jtouchbar.item;

import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.item.view.TouchBarView;

public class GroupTouchBarItem extends TouchBarItem {
    private JTouchBar _groupTouchBar;
    private boolean _prefersEqualWidths;
    private float _preferredItemWidth;

    public GroupTouchBarItem(String identifier) {
        super(identifier);
    }

    public GroupTouchBarItem(String identifier, TouchBarView view) {
        super(identifier, view);
    }

    public JTouchBar getGroupTouchBar() {
        if (this._groupTouchBar == null) {
            this._groupTouchBar = new JTouchBar();
        }

        return this._groupTouchBar;
    }

    public void setGroupTouchBar(JTouchBar groupTouchBar) {
        this._groupTouchBar = groupTouchBar;
    }

    public boolean isPrefersEqualWidths() {
        return this._prefersEqualWidths;
    }

    public void setPrefersEqualWidths(boolean prefersEqualWidths) {
        this._prefersEqualWidths = prefersEqualWidths;
    }

    public float getPreferredItemWidth() {
        return this._preferredItemWidth;
    }

    public void setPreferredItemWidth(float preferredItemWidth) {
        this._preferredItemWidth = preferredItemWidth;
    }
}
