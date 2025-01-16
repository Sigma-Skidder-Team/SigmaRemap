// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class475 extends Class456 implements Class476, Class439
{
    private Class2265<ItemStack> field2773;
    public float field2774;
    public float field2775;
    public int field2776;
    private int field2777;
    
    public Class475(final Class5412<?> class5412) {
        super(class5412);
        this.field2773 = Class2265.method8507(27, ItemStack.EMPTY);
    }
    
    public Class475() {
        this(Class5412.field22542);
    }
    
    @Override
    public int method2239() {
        return 27;
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.chest", new Object[0]);
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2773 = Class2265.method8507(this.method2239(), ItemStack.EMPTY);
        if (!this.method2324(class51)) {
            Class8508.method28426(class51, this.field2773);
        }
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        if (!this.method2325(class51)) {
            Class8508.method28424(class51, this.field2773);
        }
        return class51;
    }
    
    @Override
    public void method2229() {
        final int method1074 = this.field2657.getX();
        final int method1075 = this.field2657.getY();
        final int method1076 = this.field2657.getZ();
        ++this.field2777;
        this.field2776 = method2419(this.field2656, this, this.field2777, method1074, method1075, method1076, this.field2776);
        this.field2775 = this.field2774;
        if (this.field2776 > 0) {
            if (this.field2774 == 0.0f) {
                this.method2421(Class8520.field35067);
            }
        }
        Label_0129: {
            if (this.field2776 == 0 && this.field2774 > 0.0f) {
                break Label_0129;
            }
            if (this.field2776 > 0) {
                if (this.field2774 < 1.0f) {
                    break Label_0129;
                }
            }
            return;
        }
        final float field2774 = this.field2774;
        if (this.field2776 <= 0) {
            this.field2774 -= 0.1f;
        }
        else {
            this.field2774 += 0.1f;
        }
        if (this.field2774 > 1.0f) {
            this.field2774 = 1.0f;
        }
        if (this.field2774 < 0.5f) {
            if (field2774 >= 0.5f) {
                this.method2421(Class8520.field35065);
            }
        }
        if (this.field2774 >= 0.0f) {
            return;
        }
        this.field2774 = 0.0f;
    }
    
    public static int method2419(final World class1847, final Class460 class1848, final int n, final int n2, final int n3, final int n4, int method2420) {
        if (!class1847.isRemote) {
            if (method2420 != 0) {
                if ((n + n2 + n3 + n4) % 200 == 0) {
                    method2420 = method2420(class1847, class1848, n2, n3, n4);
                }
            }
        }
        return method2420;
    }
    
    public static int method2420(final World class1847, final Class460 class1848, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (final PlayerEntity class1849 : class1847.method7128((Class<? extends PlayerEntity>) PlayerEntity.class, new AxisAlignedBB(n - 5.0f, n2 - 5.0f, n3 - 5.0f, n + 1 + 5.0f, n2 + 1 + 5.0f, n3 + 1 + 5.0f))) {
            if (!(class1849.field3009 instanceof Class3438)) {
                continue;
            }
            final Class446 method10972 = ((Class3438)class1849.field3009).method10972();
            if (method10972 != class1848) {
                if (!(method10972 instanceof Class451)) {
                    continue;
                }
                if (!((Class451)method10972).method2284(class1848)) {
                    continue;
                }
            }
            ++n4;
        }
        return n4;
    }
    
    private void method2421(final Class7795 class7795) {
        final Class180 class7796 = this.method2194().get(Class3865.field17498);
        if (class7796 != Class180.field531) {
            double n = this.field2657.getX() + 0.5;
            final double n2 = this.field2657.getY() + 0.5;
            double n3 = this.field2657.getZ() + 0.5;
            if (class7796 == Class180.field532) {
                final Direction method11933 = Class3865.method11933(this.method2194());
                n += method11933.getXOffset() * 0.5;
                n3 += method11933.getZOffset() * 0.5;
            }
            this.field2656.method6706(null, n, n2, n3, class7795, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
        }
    }
    
    @Override
    public boolean method2200(final int n, final int field2776) {
        if (n != 1) {
            return super.method2200(n, field2776);
        }
        this.field2776 = field2776;
        return true;
    }
    
    @Override
    public void method2241(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            if (this.field2776 < 0) {
                this.field2776 = 0;
            }
            ++this.field2776;
            this.method2422();
        }
    }
    
    @Override
    public void method2242(final PlayerEntity playerEntity) {
        if (!playerEntity.isSpectator()) {
            --this.field2776;
            this.method2422();
        }
    }
    
    public void method2422() {
        final Block method21696 = this.method2194().getBlock();
        if (method21696 instanceof Class3865) {
            this.field2656.method6763(this.field2657, method21696, 1, this.field2776);
            this.field2656.method6696(this.field2657, method21696);
        }
    }
    
    @Override
    public Class2265<ItemStack> method2246() {
        return this.field2773;
    }
    
    @Override
    public void method2247(final Class2265<ItemStack> field2773) {
        this.field2773 = field2773;
    }
    
    @Override
    public float method2423(final float n) {
        return MathHelper.method35700(n, this.field2775, this.field2774);
    }
    
    public static int method2424(final IBlockReader class1855, final BlockPos class1856) {
        if (class1855.getBlockState(class1856).getBlock().method11802()) {
            final TileEntity method6727 = class1855.getTileEntity(class1856);
            if (method6727 instanceof Class475) {
                return ((Class475)method6727).field2776;
            }
        }
        return 0;
    }
    
    public static void method2425(final Class475 class475, final Class475 class476) {
        final Class2265<ItemStack> method2246 = class475.method2246();
        class475.method2247(class476.method2246());
        class476.method2247(method2246);
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return Class3438.method10970(n, class464, this);
    }
}
