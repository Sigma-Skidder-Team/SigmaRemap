// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public abstract class Class4176 implements Class4178
{
    private int field18606;
    private Class4197 field18607;
    
    public void method12511(final Class8157 class8157) throws AACException {
        this.field18606 = class8157.method26940(4);
    }
    
    public int method12512() {
        return this.field18606;
    }
    
    public void method12513(final Class8157 class8157, final Class2077 class8158, final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4) throws AACException {
        if (this.field18607 == null) {
            this.field18607 = new Class4197(b4, this.field18606 == 1, class8158, b3);
        }
        this.field18607.method12610(class8157, n);
    }
    
    public boolean method12514() {
        return this.field18607 != null;
    }
    
    public Class4197 method12515() {
        return this.field18607;
    }
}
