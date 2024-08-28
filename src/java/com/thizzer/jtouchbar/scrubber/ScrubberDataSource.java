package com.thizzer.jtouchbar.scrubber;

import com.thizzer.jtouchbar.item.view.TouchBarScrubber;
import com.thizzer.jtouchbar.scrubber.view.ScrubberView;

public interface ScrubberDataSource {
    int getNumberOfItems(TouchBarScrubber var1);

    ScrubberView getViewForIndex(TouchBarScrubber var1, long var2);
}
