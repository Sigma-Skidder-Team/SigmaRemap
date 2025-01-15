// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class8478
{
    private static String[] field34788;
    private final Vec3d field34789;
    private final Vec3d field34790;
    private final Class2040 field34791;
    private final Class2191 field34792;
    private final Class7543 field34793;
    
    public Class8478(final Vec3d field34789, final Vec3d field34790, final Class2040 field34791, final Class2191 field34792, final Entity class399) {
        this.field34789 = field34789;
        this.field34790 = field34790;
        this.field34791 = field34791;
        this.field34792 = field34792;
        this.field34793 = Class7543.method23630(class399);
    }
    
    public Vec3d method28307() {
        return this.field34790;
    }
    
    public Vec3d method28308() {
        return this.field34789;
    }
    
    public Class7702 method28309(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return this.field34791.method8120(class7096, class7097, class7098, this.field34793);
    }
    
    public Class7702 method28310(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101) {
        return this.field34792.method8359(class7099) ? class7099.method21798(class7100, class7101) : Class7698.method24486();
    }
}
