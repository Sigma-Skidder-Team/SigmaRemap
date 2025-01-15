// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class845 extends Class844
{
    private static String[] field4496;
    public static final float field4508;
    
    public Class845(final EntityType<? extends Class845> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4190();
        if (this.field4507 != null) {
            this.field4507.method11073(400);
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2710(Class8107.field33410).method23941(8.0);
        this.method2710(Class8107.field33405).method23941(80.0);
    }
    
    @Override
    public int method5056() {
        return 60;
    }
    
    @Override
    public Class7795 method4160() {
        return this.method1711() ? Class8520.field35141 : Class8520.field35142;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method1711() ? Class8520.field35147 : Class8520.field35148;
    }
    
    @Override
    public Class7795 method2684() {
        return this.method1711() ? Class8520.field35144 : Class8520.field35145;
    }
    
    @Override
    public Class7795 method5060() {
        return Class8520.field35146;
    }
    
    @Override
    public void method4172() {
        super.method4172();
        if ((this.ticksExisted + this.getEntityId()) % 1200 == 0) {
            final Class5328 field40477 = Class9439.field40477;
            for (final Class513 class513 : ((Class1849)this.world).method6883(class514 -> this.method1734(class514) < 2500.0 && class514.field3041.method26483())) {
                if (class513.method2653(field40477)) {
                    if (class513.method2654(field40477).method7908() >= 2) {
                        if (class513.method2654(field40477).method7907() >= 1200) {
                            continue;
                        }
                    }
                }
                class513.field3039.method17469(new Class4306(10, 0.0f));
                class513.method2655(new Class1948(field40477, 6000, 2));
            }
        }
        if (!this.method4201()) {
            this.method4198(new BlockPos(this), 16);
        }
    }
    
    static {
        field4508 = EntityType.field28974.method23369() / EntityType.field28988.method23369();
    }
}
