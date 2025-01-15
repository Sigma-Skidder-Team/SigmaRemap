// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public abstract class Class3634 extends Class3446
{
    public final /* synthetic */ Class851 field16871;
    
    public Class3634(final Class851 field16871) {
        this.field16871 = field16871;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    public boolean method11167() {
        return Class851.method5090(this.field16871).method16747(this.field16871.getPosX(), this.field16871.getPosY(), this.field16871.getPosZ()) < 4.0;
    }
}
