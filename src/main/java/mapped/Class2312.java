// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2312 extends Class4 implements Serializable
{
    private static String[] field14031;
    public static final long field6 = -105080578052502155L;
    
    public Class2312(final byte b, final byte b2, final byte b3, final byte b4) {
        super(b, b2, b3, b4);
    }
    
    public Class2312(final byte[] array) {
        super(array);
    }
    
    public Class2312(final Class2312 class2312) {
        super(class2312);
    }
    
    public Class2312(final Class4 class4) {
        super(class4);
    }
    
    public Class2312(final Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue(), (byte)color.getAlpha());
    }
    
    public Class2312() {
    }
    
    public final void method9418(final Color color) {
        this.field7 = (byte)color.getRed();
        this.field8 = (byte)color.getGreen();
        this.field9 = (byte)color.getBlue();
        this.field10 = (byte)color.getAlpha();
    }
    
    public final Color method9419() {
        return new Color(this.field7 & 0xFF, this.field8 & 0xFF, this.field9 & 0xFF, this.field10 & 0xFF);
    }
}
