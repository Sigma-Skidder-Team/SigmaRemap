// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.scrubber;

import com.thizzer.jtouchbar.scrubber.view.ScrubberView;
import com.thizzer.jtouchbar.item.view.TouchBarScrubber;

public interface ScrubberDataSource
{
    int getNumberOfItems(final TouchBarScrubber p0);
    
    ScrubberView getViewForIndex(final TouchBarScrubber p0, final long p1);
}
