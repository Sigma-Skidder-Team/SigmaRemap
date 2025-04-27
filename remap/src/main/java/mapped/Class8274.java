// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.Rectangle;
import java.awt.Shape;

public class Class8274
{
    private static String[] field33969;
    private final int field33970;
    private short field33971;
    private short field33972;
    private short field33973;
    private final boolean field33974;
    private Shape field33975;
    private Class7764 field33976;
    
    public Class8274(final int field33970, final Rectangle rectangle, final GlyphVector glyphVector, final int glyphIndex, final Class7522 class7522) {
        this.field33970 = field33970;
        final GlyphMetrics glyphMetrics = glyphVector.getGlyphMetrics(glyphIndex);
        int n = (int)glyphMetrics.getLSB();
        if (n > 0) {
            n = 0;
        }
        int n2 = (int)glyphMetrics.getRSB();
        if (n2 > 0) {
            n2 = 0;
        }
        final int n3 = rectangle.width - n - n2;
        final int height = rectangle.height;
        if (n3 > 0) {
            if (height > 0) {
                final int method23509 = class7522.method23509();
                final int method23510 = class7522.method23515();
                final int method23511 = class7522.method23513();
                final int method23512 = class7522.method23511();
                final int n4 = 1;
                this.field33971 = (short)(n3 + method23512 + method23510 + n4);
                this.field33972 = (short)(height + method23509 + method23511 + n4);
                this.field33973 = (short)(class7522.method23522() + rectangle.y - method23509);
            }
        }
        this.field33975 = glyphVector.getGlyphOutline(glyphIndex, (float)(-rectangle.x + class7522.method23511()), (float)(-rectangle.y + class7522.method23509()));
        this.field33974 = !class7522.method23508().canDisplay((char)field33970);
    }
    
    public int method27501() {
        return this.field33970;
    }
    
    public boolean method27502() {
        return this.field33974;
    }
    
    public int method27503() {
        return this.field33971;
    }
    
    public int method27504() {
        return this.field33972;
    }
    
    public Shape method27505() {
        return this.field33975;
    }
    
    public void method27506(final Shape field33975) {
        this.field33975 = field33975;
    }
    
    public Class7764 method27507() {
        return this.field33976;
    }
    
    public void method27508(final Class7764 field33976) {
        this.field33976 = field33976;
    }
    
    public int method27509() {
        return this.field33973;
    }
}
