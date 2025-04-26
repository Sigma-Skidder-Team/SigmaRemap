// 
// Decompiled by Procyon v0.6.0
// 

package org.newdawn.slick;

public interface Font
{
    int getWidth(final String str);
    
    int getHeight(final String str);
    
    int getLineHeight();
    
    void drawString(final float x, final float y, final String text);
    
    void drawString(final float x, final float y, final String text, final Color color);
    
    void drawString(final float x, final float y, final String text, final Color color, final int startIndex, final int endIndex);
}
