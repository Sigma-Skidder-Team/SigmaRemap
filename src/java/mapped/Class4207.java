// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4207 extends Class4176
{
    private static String[] field18969;
    private byte[] field18970;
    
    public void method12671(final Class8157 class8157) throws AACException {
        final boolean method26942 = class8157.method26942();
        int method26943 = class8157.method26940(8);
        if (method26943 == 255) {
            method26943 += class8157.method26940(8);
        }
        if (method26942) {
            class8157.method26935();
        }
        this.field18970 = new byte[method26943];
        for (int i = 0; i < method26943; ++i) {
            this.field18970[i] = (byte)class8157.method26940(8);
        }
    }
}
