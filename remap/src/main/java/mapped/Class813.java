// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class813 extends Class812
{
    private static String[] field4367;
    
    public Class813(final EntityType<? extends Class813> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public Class7795 method4160() {
        super.method4160();
        return Class8520.field35374;
    }
    
    @Override
    public Class7795 method2684() {
        super.method2684();
        return Class8520.field35376;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        super.method2683(class7929);
        return Class8520.field35377;
    }
    
    @Override
    public void method4782() {
        this.method1695(Class8520.field35375, 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
    }
    
    @Override
    public Class788 method4349(final Class788 class788) {
        return EntityType.field29006.method23371(this.world);
    }
}
