// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class EntitySelectionContext implements ISelectionContext
{
    private static String[] field29923;
    public static final ISelectionContext DUMMY;
    private final boolean field29925;
    private final double field29926;
    private final Class3820 field29927;
    
    public EntitySelectionContext(final boolean field29925, final double field29926, final Class3820 field29927) {
        this.field29925 = field29925;
        this.field29926 = field29926;
        this.field29927 = field29927;
    }
    
    @Deprecated
    public EntitySelectionContext(final Entity class399) {
        this(class399.method1813(), class399.getPosY(), (class399 instanceof LivingEntity) ? ((LivingEntity)class399).method2713().method27622() : Class7739.field30754);
    }
    
    @Override
    public boolean hasItem(final Class3820 class3820) {
        return this.field29927 == class3820;
    }
    
    @Override
    public boolean func_225581_b_() {
        return this.field29925;
    }
    
    @Override
    public boolean func_216378_a(final Class7702 class7702, final BlockPos class7703, final boolean b) {
        return this.field29926 > class7703.getY() + class7702.method24536(Axis.Y) - 9.999999747378752E-6;
    }
    
    static {
        DUMMY = new Class7541(false, -1.7976931348623157E308, Class7739.field30754);
    }
}
