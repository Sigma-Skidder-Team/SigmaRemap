// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class814 extends Class812
{
    private static String[] field4368;
    
    public Class814(final EntityType<? extends Class814> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public Class7795 method4160() {
        super.method4160();
        return Class8520.field35126;
    }
    
    @Override
    public Class7795 method2684() {
        super.method2684();
        return Class8520.field35129;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        super.method2683(class7929);
        return Class8520.field35130;
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        return class789 != this && (class789 instanceof Class814 || class789 instanceof Class808) && this.method4753() && ((Class806)class789).method4753();
    }
    
    @Override
    public Class788 method4349(final Class788 class788) {
        final Class806 class789 = ((class788 instanceof Class808) ? EntityType.field29006 : EntityType.field28970).method23371(this.world);
        this.method4754(class788, class789);
        return class789;
    }
}