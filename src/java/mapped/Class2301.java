// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2301 extends Class2300 implements Serializable
{
    private static String[] field13954;
    public static final long field13950 = 6632576088353444794L;
    
    public Class2301(final byte b, final byte b2, final byte b3) {
        super(b, b2, b3);
    }
    
    public Class2301(final byte[] array) {
        super(array);
    }
    
    public Class2301(final Class2301 class2301) {
        super(class2301);
    }
    
    public Class2301(final Class2300 class2300) {
        super(class2300);
    }
    
    public Class2301(final Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue());
    }
    
    public Class2301() {
    }
    
    public final void method9190(final Color color) {
        this.field13951 = (byte)color.getRed();
        this.field13952 = (byte)color.getGreen();
        this.field13953 = (byte)color.getBlue();
    }
    
    public final Color method9191() {
        return new Color(this.field13951 & 0xFF, this.field13952 & 0xFF, this.field13953 & 0xFF);
    }
}
