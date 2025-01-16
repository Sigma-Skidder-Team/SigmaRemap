// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class4088 extends Item
{
    private static String[] field18193;
    
    public Class4088(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockPos method21656 = method21655.method1149(class7075.method21648());
        if (method12322(class7075.method21651(), method21654, method21655)) {
            if (!method21654.isRemote) {
                method21654.method6955(2005, method21655, 0);
            }
            return Class2201.field13400;
        }
        if (method21654.getBlockState(method21655).method21761(method21654, method21655, class7075.method21648()) && method12323(class7075.method21651(), method21654, method21656, class7075.method21648())) {
            if (!method21654.isRemote) {
                method21654.method6955(2005, method21656, 0);
            }
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public static boolean method12322(final ItemStack class8321, final World class8322, final BlockPos class8323) {
        final Class7096 method6701 = class8322.getBlockState(class8323);
        if (method6701.method21696() instanceof Class3872) {
            final Class3872 class8324 = (Class3872)method6701.method21696();
            if (class8324.method11945(class8322, class8323, method6701, class8322.isRemote)) {
                if (class8322 instanceof Class1849) {
                    if (class8324.method11946(class8322, class8322.rand, class8323, method6701)) {
                        class8324.method11947((Class1849)class8322, class8322.rand, class8323, method6701);
                    }
                    class8321.method27693(1);
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean method12323(final ItemStack class8321, final World class8322, final BlockPos class8323, final Direction class8324) {
        if (class8322.getBlockState(class8323).method21696() != Class7521.field29173 || class8322.getFluidState(class8323).getLevel() != 8) {
            return false;
        }
        if (class8322 instanceof Class1849) {
            int i = 0;
        Label_0053:
            while (i < 128) {
                BlockPos method1134 = class8323;
                Class3090 class8325 = class8322.method6959(class8323);
                Class7096 class8326 = Class7521.field29244.getDefaultState();
                while (true) {
                    for (int j = 0; j < i / 16; ++j) {
                        method1134 = method1134.add(Class4088.field17363.nextInt(3) - 1, (Class4088.field17363.nextInt(3) - 1) * Class4088.field17363.nextInt(3) / 2, Class4088.field17363.nextInt(3) - 1);
                        class8325 = class8322.method6959(method1134);
                        if (class8322.getBlockState(method1134).method21762(class8322, method1134)) {
                            ++i;
                            continue Label_0053;
                        }
                    }
                    Label_0123: {
                        if (class8325 == Class7102.field27676 || class8325 == Class7102.field27679) {
                            if (i == 0) {
                                if (class8324 != null) {
                                    if (class8324.getAxis().isHorizontal()) {
                                        class8326 = ((StateHolder<O, Class7096>)Class7188.field27922.method25620(class8322.rand).getDefaultState()).with((IProperty<Comparable>)Class3926.field17791, class8324);
                                        break Label_0123;
                                    }
                                }
                            }
                            if (Class4088.field17363.nextInt(4) == 0) {
                                class8326 = Class7188.field27920.method25620(Class4088.field17363).getDefaultState();
                            }
                        }
                    }
                    if (class8326.method21696().method11785(Class7188.field27922)) {
                        for (int n = 0; !class8326.method21752(class8322, method1134); class8326 = ((StateHolder<Object, Class7096>)class8326).with((IProperty<Comparable>)Class3926.field17791, Plane.HORIZONTAL.method576(Class4088.field17363)), ++n) {
                            if (n >= 4) {
                                break;
                            }
                        }
                    }
                    if (!class8326.method21752(class8322, method1134)) {
                        continue;
                    }
                    final Class7096 method1135 = class8322.getBlockState(method1134);
                    if (method1135.method21696() == Class7521.field29173 && class8322.getFluidState(method1134).getLevel() == 8) {
                        class8322.setBlockState(method1134, class8326, 3);
                        continue;
                    }
                    if (method1135.method21696() != Class7521.field29244) {
                        continue;
                    }
                    if (Class4088.field17363.nextInt(10) != 0) {
                        continue;
                    }
                    ((Class3872)Class7521.field29244).method11947((Class1849)class8322, Class4088.field17363, method1134, method1135);
                    continue;
                }
            }
            class8321.method27693(1);
            return true;
        }
        return true;
    }
    
    public static void method12324(final Class1851 class1851, final BlockPos class1852, int n) {
        if (n == 0) {
            n = 15;
        }
        final Class7096 method6701 = class1851.getBlockState(class1852);
        if (!method6701.method21706()) {
            for (int i = 0; i < n; ++i) {
                class1851.method6709(Class8432.field34625, class1852.getX() + Class4088.field17363.nextFloat(), class1852.getY() + Class4088.field17363.nextFloat() * method6701.method21725(class1851, class1852).method24536(Direction.Axis.Y), class1852.getZ() + Class4088.field17363.nextFloat(), Class4088.field17363.nextGaussian() * 0.02, Class4088.field17363.nextGaussian() * 0.02, Class4088.field17363.nextGaussian() * 0.02);
            }
        }
    }
}
