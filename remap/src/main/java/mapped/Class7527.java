// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Color;
import slick2d.Font;

import java.io.UnsupportedEncodingException;

public class Class7527 implements Font
{
    private Class7765 field29883;
    private char field29884;
    private int field29885;
    private int field29886;
    private int field29887;
    private int field29888;
    
    public Class7527(final Class7765 field29883, final char field29884) {
        this.field29883 = field29883;
        this.field29884 = field29884;
        this.field29887 = field29883.method24861();
        final int method24862 = field29883.method24862();
        this.field29885 = field29883.method24843() / this.field29887;
        this.field29886 = field29883.method24844() / method24862;
        this.field29888 = this.field29887 * method24862;
    }
    
    @Override
    public void drawString(final float x, final float y, final String text) {
        this.drawString(x, y, text, Color.field14355);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color) {
        this.drawString(x, y, text, color, 0, text.length() - 1);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color, final int startIndex, final int endIndex) {
        try {
            final byte[] bytes = text.getBytes("US-ASCII");
            for (int i = 0; i < bytes.length; ++i) {
                final int n5 = bytes[i] - this.field29884;
                if (n5 < this.field29888) {
                    final int n6 = n5 % this.field29887;
                    final int n7 = n5 / this.field29887;
                    if (i >= startIndex || i <= endIndex) {
                        this.field29883.method24860(n6, n7).method24776(x + i * this.field29885, y, color);
                    }
                }
            }
        }
        catch (final UnsupportedEncodingException ex) {
            Class8452.method28203(ex);
        }
    }
    
    @Override
    public int getHeight(final String str) {
        return this.field29886;
    }
    
    @Override
    public int getWidth(final String str) {
        return this.field29885 * str.length();
    }
    
    @Override
    public int getLineHeight() {
        return this.field29886;
    }
}
