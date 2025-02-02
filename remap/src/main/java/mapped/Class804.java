// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class804 extends Class789
{
    private static String[] field4326;
    
    public Class804(final EntityType<? extends Class804> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3607(this, 2.0));
        this.field4114.method22062(2, new Class3587(this, 1.0));
        this.field4114.method22062(3, new Class3472(this, 1.25, Ingredient.method618(Items.field31315), false));
        this.field4114.method22062(4, new Class3456(this, 1.25));
        this.field4114.method22062(5, new Class3517(this, 1.0));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(7, new Class3503(this));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35095;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35097;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35096;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35099, 0.15f, 1.0f);
    }
    
    @Override
    public float method2720() {
        return 0.4f;
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() == Items.field31349) {
            if (!playerEntity.field3025.field27304) {
                if (!this.method2625()) {
                    playerEntity.method1695(Class8520.field35098, 1.0f, 1.0f);
                    method2715.method27693(1);
                    if (!method2715.method27620()) {
                        if (!playerEntity.inventory.method2362(new ItemStack(Items.field31358))) {
                            playerEntity.method2822(new ItemStack(Items.field31358), false);
                        }
                    }
                    else {
                        playerEntity.method2716(class513, new ItemStack(Items.field31358));
                    }
                    return true;
                }
            }
        }
        return super.method4195(playerEntity, class513);
    }
    
    public Class804 method4704(final Class788 class788) {
        return EntityType.field28968.method23371(this.world);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return this.method2625() ? (class291.field34098 * 0.95f) : 1.3f;
    }
}
