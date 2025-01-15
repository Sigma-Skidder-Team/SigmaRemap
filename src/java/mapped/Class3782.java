// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.awt.Color;

public class Class3782 extends Class3703
{
    private long field17267;
    private Color field17268;
    
    public Class3782() {
        super("Video Media Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17267 = class9131.method33137(2);
        final int[] array = new int[3];
        for (int i = 0; i < 3; ++i) {
            array[i] = ((class9131.method33135() & 0xFF) | (class9131.method33135() << 8 & 0xFF));
        }
        this.field17268 = new Color(array[0], array[1], array[2]);
    }
    
    public long method11604() {
        return this.field17267;
    }
    
    public Color method11605() {
        return this.field17268;
    }
}
