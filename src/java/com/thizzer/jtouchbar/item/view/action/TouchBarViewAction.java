// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.item.view.action;

import com.thizzer.jtouchbar.item.view.TouchBarView;

public interface TouchBarViewAction
{
    void onCall(final TouchBarView p0);
    
    default boolean isEnabled() {
        return true;
    }
}
