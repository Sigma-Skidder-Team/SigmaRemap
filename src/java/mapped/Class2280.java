// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2280 extends Class2275 implements Serializable
{
    private static String[] field13877;
    public static final long field13878 = 8577680141580006740L;
    
    public Class2280(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public Class2280(final float[] array) {
        super(array);
    }
    
    public Class2280(final Class2280 class2280) {
        super(class2280);
    }
    
    public Class2280(final Class2275 class2275) {
        super(class2275);
    }
    
    public Class2280(final Class7 class7) {
        super(class7);
    }
    
    public Class2280(final Color color) {
        super(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);
    }
    
    public Class2280() {
    }
    
    public final void method8721(final Color color) {
        this.field13863 = color.getRed() / 255.0f;
        this.field13864 = color.getGreen() / 255.0f;
        this.field13865 = color.getBlue() / 255.0f;
        this.field13866 = color.getAlpha() / 255.0f;
    }
    
    public final Color method8722() {
        return new Color(Math.round(this.field13863 * 255.0f), Math.round(this.field13864 * 255.0f), Math.round(this.field13865 * 255.0f), Math.round(this.field13866 * 255.0f));
    }
}
