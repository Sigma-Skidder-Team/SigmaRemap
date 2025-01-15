// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class7751 extends Class7750
{
    private static String[] field31682;
    public final /* synthetic */ Class798 field31683;
    
    public Class7751(final Class798 field31683, final Class759 class759, final World class760) {
        this.field31683 = field31683;
        super(class759, class760);
    }
    
    @Override
    public boolean method24739(final BlockPos class354) {
        return !this.field31658.method6701(class354.method1139()).method21706();
    }
    
    @Override
    public void method24728() {
        if (!Class3622.method11160(Class798.method4543(this.field31683))) {
            super.method24728();
        }
    }
}
