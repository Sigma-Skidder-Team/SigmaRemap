package com.thizzer.jtouchbar.item.view.action;

import com.thizzer.jtouchbar.item.view.TouchBarView;

public interface TouchBarViewAction {
    void onCall(TouchBarView var1);

    default boolean isEnabled() {
        return true;
    }
}
