// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class811 extends Class806
{
    private static String[] field4365;
    
    public Class811(final EntityType<? extends Class811> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(15.0);
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
        this.method2710(Class811.field4333).method23941(this.method4764());
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public Class7795 method4160() {
        super.method4160();
        return Class8520.field35758;
    }
    
    @Override
    public Class7795 method2684() {
        super.method2684();
        return Class8520.field35759;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        super.method2683(class7929);
        return Class8520.field35760;
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return EntityType.field29053.method23371(this.world);
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (!this.method4715()) {
            return false;
        }
        if (this.method2625()) {
            return super.method4195(playerEntity, class513);
        }
        if (playerEntity.method2804()) {
            this.method4740(playerEntity);
            return true;
        }
        if (!this.isBeingRidden()) {
            if (!method2715.method27620()) {
                if (!this.method4736() && method2715.getItem() == Items.field31353) {
                    this.method4740(playerEntity);
                    return true;
                }
                if (method2715.method27640(playerEntity, this, class513)) {
                    return true;
                }
            }
            this.method4742(playerEntity);
            return true;
        }
        return super.method4195(playerEntity, class513);
    }
    
    @Override
    public void method4712() {
    }
}