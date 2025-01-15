// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2289 extends Class2285 implements Serializable
{
    private static String[] field13917;
    public static final long field13918 = -1861792981817493659L;
    
    public Class2289(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public Class2289(final float[] array) {
        super(array);
    }
    
    public Class2289(final Class2289 class2289) {
        super(class2289);
    }
    
    public Class2289(final Class2285 class2285) {
        super(class2285);
    }
    
    public Class2289(final Class2271 class2271) {
        super(class2271);
    }
    
    public Class2289(final Color color) {
        super(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f);
    }
    
    public Class2289() {
    }
    
    public final void method8989(final Color color) {
        this.field13909 = color.getRed() / 255.0f;
        this.field13910 = color.getGreen() / 255.0f;
        this.field13911 = color.getBlue() / 255.0f;
    }
    
    public final Color method8990() {
        return new Color(Math.round(this.field13909 * 255.0f), Math.round(this.field13910 * 255.0f), Math.round(this.field13911 * 255.0f));
    }
}
