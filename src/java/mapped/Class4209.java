// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4209 extends Class4176
{
    private static String[] field18999;
    private final Class4192 field19000;
    
    public Class4209(final int n) {
        this.field19000 = new Class4192(n);
    }
    
    public void method12677(final Class8157 class8157, final Class4179 class8158) throws AACException {
        this.method12511(class8157);
        this.field19000.method12582(class8157, false, class8158);
    }
    
    public Class4192 method12678() {
        return this.field19000;
    }
}
