// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;

public class Class3961 extends Class3841
{
    public static final Direction[] field17900;
    public static final Class7115 field17901;
    public static final Class7112 field17902;
    
    public Class3961(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3961.field17902, 0)).method21773((Class7111<Comparable>)Class3961.field17901, Direction.NORTH));
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return class7096.method21772((Class7111<Integer>)Class3961.field17902);
    }
    
    @Override
    public void method11852(final Class1847 class1847, final Class512 class1848, final BlockPos class1849, final Class7096 class1850, final Class436 class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, class1850, class1851, class1852);
        if (!class1847.field10067) {
            if (class1851 instanceof Class438) {
                final Class438 class1853 = (Class438)class1851;
                if (Class8742.method30195(Class7882.field32366, class1852) == 0) {
                    class1853.method2218(class1848, class1850, Class2144.field12626);
                    class1847.method6783(class1849, this);
                    this.method12082(class1847, class1849);
                }
                Class7770.field31812.method13857((Class513)class1848, class1850.method21696(), class1852, class1853.method2221());
            }
        }
    }
    
    private void method12082(final Class1847 class1847, final BlockPos class1848) {
        final List<Entity> method7128 = class1847.method7128((Class<? extends Entity>)Class798.class, new AxisAlignedBB(class1848).method18495(8.0, 6.0, 8.0));
        if (!method7128.isEmpty()) {
            final List<Entity> method7129 = class1847.method7128((Class<? extends Entity>)Class512.class, new AxisAlignedBB(class1848).method18495(8.0, 6.0, 8.0));
            final int size = method7129.size();
            for (final Class798 class1849 : method7128) {
                if (class1849.method4152() != null) {
                    continue;
                }
                class1849.method4541(method7129.get(class1847.field10062.nextInt(size)));
            }
        }
    }
    
    public static void method12083(final Class1847 class1847, final BlockPos class1848) {
        Class3833.method11839(class1847, class1848, new ItemStack(Class7739.field31632, 3));
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        final ItemStack method2716 = method2715.method27641();
        final int intValue = class7096.method21772((Class7111<Integer>)Class3961.field17902);
        int n = 0;
        if (intValue >= 5) {
            if (method2715.method27622() != Class7739.field31426) {
                if (method2715.method27622() == Class7739.field31442) {
                    method2715.method27693(1);
                    class7097.method6706(class7099, class7099.getPosX(), class7099.getPosY(), class7099.getPosZ(), Class8520.field35041, Class286.field1584, 1.0f, 1.0f);
                    if (!method2715.method27620()) {
                        if (!class7099.field3006.method2362(new ItemStack(Class7739.field31635))) {
                            class7099.method2822(new ItemStack(Class7739.field31635), false);
                        }
                    }
                    else {
                        class7099.method2716(class7100, new ItemStack(Class7739.field31635));
                    }
                    n = 1;
                }
            }
            else {
                class7097.method6706(class7099, class7099.getPosX(), class7099.getPosY(), class7099.getPosZ(), Class8520.field35023, Class286.field1584, 1.0f, 1.0f);
                method12083(class7097, class7098);
                method2715.method27636(1, class7099, class7103 -> class7103.method2795(class7102));
                n = 1;
            }
        }
        if (n == 0) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        if (Class3918.method12033(class7097, class7098, 5)) {
            this.method12086(class7097, class7096, class7098);
            if (class7099 instanceof Class513) {
                Class7770.field31810.method13765((Class513)class7099, class7098, method2716);
            }
        }
        else {
            if (this.method12084(class7097, class7098)) {
                this.method12082(class7097, class7098);
            }
            this.method12085(class7097, class7096, class7098, class7099, Class2144.field12626);
        }
        return Class2201.field13400;
    }
    
    private boolean method12084(final Class1847 class1847, final BlockPos class1848) {
        final Class436 method6727 = class1847.method6727(class1848);
        return method6727 instanceof Class438 && !((Class438)method6727).method2216();
    }
    
    public void method12085(final Class1847 class1847, final Class7096 class1848, final BlockPos class1849, final Class512 class1850, final Class2144 class1851) {
        this.method12086(class1847, class1848, class1849);
        final Class436 method6727 = class1847.method6727(class1849);
        if (method6727 instanceof Class438) {
            ((Class438)method6727).method2218(class1850, class1848, class1851);
        }
    }
    
    public void method12086(final Class1847 class1847, final Class7096 class1848, final BlockPos class1849) {
        class1847.method6688(class1849, ((Class7097<O, Class7096>)class1848).method21773((Class7111<Comparable>)Class3961.field17902, 0), 3);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((Class7111<Integer>)Class3961.field17902) >= 5) {
            for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                this.method12087(class7097, class7098, class7096);
            }
        }
    }
    
    private void method12087(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849) {
        if (class1849.method21756().method21781()) {
            if (class1847.field10062.nextFloat() >= 0.3f) {
                final Class7702 method21727 = class1849.method21727(class1847, class1848);
                if (method21727.method24536(Axis.Y) >= 1.0) {
                    if (!class1849.method21755(Class7188.field27919)) {
                        final double method21728 = method21727.method24535(Axis.Y);
                        if (method21728 <= 0.0) {
                            final BlockPos method21729 = class1848.method1139();
                            final Class7096 method21730 = class1847.method6701(method21729);
                            if (method21730.method21727(class1847, method21729).method24536(Axis.Y) < 1.0 || !method21730.method21762(class1847, method21729)) {
                                if (method21730.method21756().method21781()) {
                                    this.method12088(class1847, class1848, method21727, class1848.getY() - 0.05);
                                }
                            }
                        }
                        else {
                            this.method12088(class1847, class1848, method21727, class1848.getY() + method21728 - 0.05);
                        }
                    }
                }
            }
        }
    }
    
    private void method12088(final Class1847 class1847, final BlockPos class1848, final Class7702 class1849, final double n) {
        this.method12089(class1847, class1848.getX() + class1849.method24535(Axis.X), class1848.getX() + class1849.method24536(Axis.X), class1848.getZ() + class1849.method24535(Axis.Z), class1848.getZ() + class1849.method24536(Axis.Z), n);
    }
    
    private void method12089(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5) {
        class1847.method6709(Class8432.field34655, MathHelper.method35701(class1847.field10062.nextDouble(), n, n2), n5, MathHelper.method35701(class1847.field10062.nextDouble(), n3, n4), 0.0, 0.0, 0.0);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3961.field17901, class7074.method21644().getOpposite());
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3961.field17902, Class3961.field17901);
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Nullable
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class438();
    }
    
    @Override
    public void method11870(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class512 class1850) {
        if (!class1847.field10067) {
            if (class1850.method2889()) {
                if (class1847.method6765().method31216(Class8878.field37320)) {
                    final Class436 method6727 = class1847.method6727(class1848);
                    if (method6727 instanceof Class438) {
                        final Class438 class1851 = (Class438)method6727;
                        final ItemStack class1852 = new ItemStack(this);
                        final int intValue = class1849.method21772((Class7111<Integer>)Class3961.field17902);
                        final boolean b = !class1851.method2216();
                        if (!b && intValue == 0) {
                            return;
                        }
                        if (b) {
                            final Class51 class1853 = new Class51();
                            class1853.method295("Bees", class1851.method2230());
                            class1852.method27676("BlockEntityTag", class1853);
                        }
                        final Class51 class1854 = new Class51();
                        class1854.method298("honey_level", intValue);
                        class1852.method27676("BlockStateTag", class1854);
                        final Class427 class1855 = new Class427(class1847, class1848.getX(), class1848.getY(), class1848.getZ(), class1852);
                        class1855.method2114();
                        class1847.method6886(class1855);
                    }
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public List<ItemStack> method11833(final Class7096 class7096, final Class9098 class7097) {
        final Entity class7098 = class7097.method32882(Class6683.field26362);
        if (!(class7098 instanceof Class510)) {
            if (!(class7098 instanceof Class765)) {
                if (!(class7098 instanceof Class421)) {
                    if (!(class7098 instanceof Class767)) {
                        if (!(class7098 instanceof Class432)) {
                            return super.method11833(class7096, class7097);
                        }
                    }
                }
            }
        }
        final Class436 class7099 = class7097.method32882(Class6683.field26369);
        if (class7099 instanceof Class438) {
            ((Class438)class7099).method2218(null, class7096, Class2144.field12626);
        }
        return super.method11833(class7096, class7097);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7099.method6701(class7101).method21696() instanceof Class4011) {
            final Class436 method6727 = class7099.method6727(class7100);
            if (method6727 instanceof Class438) {
                ((Class438)method6727).method2218(null, class7096, Class2144.field12626);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    static {
        field17900 = new Direction[] { Direction.WEST, Direction.EAST, Direction.SOUTH};
        field17901 = Class3892.field17564;
        field17902 = Class8970.field37785;
    }
}
