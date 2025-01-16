// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3976 extends Block
{
    private static String[] field17964;
    public static final Class7113 field17965;
    
    public Class3976(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3976.field17965, false));
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            if (class7097.method6749(class7098)) {
                method12118(class7097, class7098);
                class7097.method6690(class7098, false);
            }
        }
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (class7097.method6749(class7098)) {
            method12118(class7097, class7098);
            class7097.method6690(class7098, false);
        }
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        if (!class1847.isRemote()) {
            if (!class1850.method2889()) {
                if (class1849.get((IProperty<Boolean>)Class3976.field17965)) {
                    method12118(class1847, class1848);
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11842(final World class1847, final BlockPos class1848, final Explosion class1849) {
        if (!class1847.isRemote) {
            final Class510 class1850 = new Class510(class1847, class1848.getX() + 0.5f, class1848.getY(), class1848.getZ() + 0.5f, class1849.method18414());
            class1850.method2615((short)(class1847.rand.nextInt(class1850.method2617() / 4) + class1850.method2617() / 8));
            class1847.method6886(class1850);
        }
    }
    
    public static void method12118(final World class1847, final BlockPos class1848) {
        method12119(class1847, class1848, null);
    }
    
    private static void method12119(final World class1847, final BlockPos class1848, final LivingEntity class1849) {
        if (!class1847.isRemote) {
            final Class510 class1850 = new Class510(class1847, class1848.getX() + 0.5, class1848.getY(), class1848.getZ() + 0.5, class1849);
            class1847.method6886(class1850);
            class1847.method6706(null, class1850.getPosX(), class1850.getPosY(), class1850.getPosZ(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        final Item method2716 = method2715.getItem();
        if (method2716 != Items.field31277 && method2716 != Items.field31511) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        method12119(class7097, class7098, class7099);
        class7097.setBlockState(class7098, Blocks.AIR.getDefaultState(), 11);
        if (!class7099.method2889()) {
            if (method2716 != Items.field31277) {
                method2715.method27693(1);
            }
            else {
                method2715.method27636(1, class7099, class7103 -> class7103.method2795(class7102));
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public void onProjectileCollision(final World class1847, final BlockState class1848, final BlockRayTraceResult class1849, final Entity class1850) {
        if (!class1847.isRemote) {
            if (class1850 instanceof Class402) {
                final Class402 class1851 = (Class402)class1850;
                final Entity method1973 = class1851.method1973();
                if (class1851.method1804()) {
                    final BlockPos method1974 = class1849.getPos();
                    method12119(class1847, method1974, (method1973 instanceof LivingEntity) ? ((LivingEntity)method1973) : null);
                    class1847.method6690(method1974, false);
                }
            }
        }
    }
    
    @Override
    public boolean method11872(final Explosion explosion) {
        return false;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3976.field17965);
    }
    
    static {
        field17965 = Class8970.field37746;
    }
}
