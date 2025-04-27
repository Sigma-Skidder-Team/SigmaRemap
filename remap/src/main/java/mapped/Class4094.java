// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.LinkedHashMultiset;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;

public class Class4094 extends Class4093
{
    public Class4094(final Properties properties) {
        super(properties);
    }
    
    public static ItemStack method12326(final World class1847, final int n, final int n2, final byte b, final boolean b2, final boolean b3) {
        final ItemStack class1848 = new ItemStack(Items.field31425);
        method12330(class1848, class1847, n, n2, b, b2, b3, class1847.dimension.getType());
        return class1848;
    }
    
    @Nullable
    public static Class6356 method12327(final ItemStack class8321, final World class8322) {
        return class8322.method6774(method12331(method12329(class8321)));
    }
    
    @Nullable
    public static Class6356 method12328(final ItemStack class8321, final World class8322) {
        Class6356 class8323 = method12327(class8321, class8322);
        if (class8323 == null) {
            if (!class8322.isRemote) {
                class8323 = method12330(class8321, class8322, class8322.method6764().method29536(), class8322.method6764().method29538(), 3, false, false, class8322.dimension.getType());
            }
        }
        return class8323;
    }
    
    public static int method12329(final ItemStack class8321) {
        final CompoundNBT method27657 = class8321.method27657();
        return (method27657 != null && method27657.contains("map", 99)) ? method27657.getInt("map") : 0;
    }
    
    private static Class6356 method12330(final ItemStack class8321, final World class8322, final int n, final int n2, final int n3, final boolean b, final boolean b2, final DimensionType class8323) {
        final int method6776 = class8322.method6776();
        final Class6356 class8324 = new Class6356(method12331(method6776));
        class8324.method18913(n, n2, n3, b, b2, class8323);
        class8322.method6775(class8324);
        class8321.method27658().putInt("map", method6776);
        return class8324;
    }
    
    public static String method12331(final int i) {
        return "map_" + i;
    }
    
    public void method12332(final World class1847, final Entity class1848, final Class6356 class1849) {
        if (class1847.dimension.getType() == class1849.field25422) {
            if (class1848 instanceof PlayerEntity) {
                final int n = 1 << class1849.field25425;
                final int field25420 = class1849.field25420;
                final int field25421 = class1849.field25421;
                final int n2 = MathHelper.floor(class1848.getPosX() - field25420) / n + 64;
                final int n3 = MathHelper.floor(class1848.getPosZ() - field25421) / n + 64;
                int n4 = 128 / n;
                if (class1847.dimension.method20504()) {
                    n4 /= 2;
                }
                final Class9244 method18921;
                final Class9244 class1850 = method18921 = class1849.method18921((PlayerEntity)class1848);
                ++method18921.field39650;
                int n5 = 0;
                for (int i = n2 - n4 + 1; i < n2 + n4; ++i) {
                    if ((i & 0xF) == (class1850.field39650 & 0xF) || n5 != 0) {
                        n5 = 0;
                        double n6 = 0.0;
                        for (int j = n3 - n4 - 1; j < n3 + n4; ++j) {
                            if (i >= 0) {
                                if (j >= -1) {
                                    if (i < 128) {
                                        if (j < 128) {
                                            final int n7 = i - n2;
                                            final int n8 = j - n3;
                                            final boolean b = n7 * n7 + n8 * n8 > (n4 - 2) * (n4 - 2);
                                            final int n9 = (field25420 / n + i - 64) * n;
                                            final int n10 = (field25421 / n + j - 64) * n;
                                            final LinkedHashMultiset create = LinkedHashMultiset.create();
                                            final Chunk method18922 = class1847.method6685(new BlockPos(n9, 0, n10));
                                            if (!method18922.method7062()) {
                                                final ChunkPos method18923 = method18922.method7019();
                                                final int n11 = n9 & 0xF;
                                                final int n12 = n10 & 0xF;
                                                int n13 = 0;
                                                double n14 = 0.0;
                                                if (!class1847.dimension.method20504()) {
                                                    final Mutable class1851 = new Mutable();
                                                    final Mutable class1852 = new Mutable();
                                                    for (int k = 0; k < n; ++k) {
                                                        for (int l = 0; l < n; ++l) {
                                                            int n15 = method18922.method7018(HeightmapType.field11522, k + n11, l + n12) + 1;
                                                            Class7096 class1853;
                                                            if (n15 > 1) {
                                                                do {
                                                                    --n15;
                                                                    class1851.setPos(method18923.method25426() + k + n11, n15, method18923.method25427() + l + n12);
                                                                    class1853 = method18922.getBlockState(class1851);
                                                                } while (class1853.method21707(class1847, class1851) == MaterialColor.AIR && n15 > 0);
                                                                if (n15 > 0) {
                                                                    if (!class1853.method21756().method21781()) {
                                                                        int n16 = n15 - 1;
                                                                        class1852.method1287(class1851);
                                                                        Class7096 method18924;
                                                                        do {
                                                                            class1852.method1294(n16--);
                                                                            method18924 = method18922.getBlockState(class1852);
                                                                            ++n13;
                                                                        } while (n16 > 0 && !method18924.method21756().method21781());
                                                                        class1853 = this.method12333(class1847, class1853, class1851);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                class1853 = Blocks.field29172.getDefaultState();
                                                            }
                                                            class1849.method18923(class1847, method18923.method25426() + k + n11, method18923.method25427() + l + n12);
                                                            n14 += n15 / (double)(n * n);
                                                            create.add((Object)class1853.method21707(class1847, class1851));
                                                        }
                                                    }
                                                }
                                                else {
                                                    final int n17 = n9 + n10 * 231871;
                                                    if ((n17 * n17 * 31287121 + n17 * 11 >> 20 & 0x1) != 0x0) {
                                                        create.add(Blocks.STONE.getDefaultState().method21707(class1847, BlockPos.ZERO), 100);
                                                    }
                                                    else {
                                                        create.add(Blocks.DIRT.getDefaultState().method21707(class1847, BlockPos.ZERO), 10);
                                                    }
                                                    n14 = 100.0;
                                                }
                                                final int n18 = n13 / (n * n);
                                                final double n19 = (n14 - n6) * 4.0 / (n + 4) + ((i + j & 0x1) - 0.5) * 0.4;
                                                int n20 = 1;
                                                if (n19 > 0.6) {
                                                    n20 = 2;
                                                }
                                                if (n19 < -0.6) {
                                                    n20 = 0;
                                                }
                                                final MaterialColor class1854 = (MaterialColor)Iterables.getFirst(Multisets.copyHighestCountFirst(create), (Object) MaterialColor.AIR);
                                                if (class1854 == MaterialColor.WATER) {
                                                    final double n21 = n18 * 0.1 + (i + j & 0x1) * 0.2;
                                                    n20 = 1;
                                                    if (n21 < 0.5) {
                                                        n20 = 2;
                                                    }
                                                    if (n21 > 0.9) {
                                                        n20 = 0;
                                                    }
                                                }
                                                n6 = n14;
                                                if (j >= 0) {
                                                    if (n7 * n7 + n8 * n8 < n4 * n4) {
                                                        if (!b || (i + j & 0x1) != 0x0) {
                                                            final byte b2 = class1849.field25426[i + j * 128];
                                                            final byte b3 = (byte)(class1854.colorIndex * 4 + n20);
                                                            if (b2 != b3) {
                                                                class1849.field25426[i + j * 128] = b3;
                                                                class1849.method18920(i, j);
                                                                n5 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private Class7096 method12333(final World class1847, final Class7096 class1848, final BlockPos class1849) {
        final IFluidState method21756 = class1848.method21756();
        return (!method21756.isEmpty() && !class1848.method21761(class1847, class1849, Direction.UP)) ? method21756.getBlockState() : class1848;
    }
    
    private static boolean method12334(final Class3090[] array, final int n, final int n2, final int n3) {
        return array[n2 * n + n3 * n * 128 * n].method9862() >= 0.0f;
    }
    
    public static void method12335(final Class1849 class1849, final ItemStack class1850) {
        final Class6356 method12328 = method12328(class1850, class1849);
        if (method12328 != null) {
            if (class1849.dimension.getType() == method12328.field25422) {
                final int n = 1 << method12328.field25425;
                final int field25420 = method12328.field25420;
                final int field25421 = method12328.field25421;
                final Class3090[] array = new Class3090[128 * n * 128 * n];
                for (int i = 0; i < 128 * n; ++i) {
                    for (int j = 0; j < 128 * n; ++j) {
                        array[i * 128 * n + j] = class1849.method6959(new BlockPos((field25420 / n - 64) * n + j, 0, (field25421 / n - 64) * n + i));
                    }
                }
                for (int k = 0; k < 128; ++k) {
                    for (int l = 0; l < 128; ++l) {
                        if (k > 0) {
                            if (l > 0) {
                                if (k < 127) {
                                    if (l < 127) {
                                        final Class3090 class1851 = array[k * n + l * n * 128 * n];
                                        int n2 = 8;
                                        if (method12334(array, n, k - 1, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k - 1, l + 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k - 1, l)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l + 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k, l + 1)) {
                                            --n2;
                                        }
                                        int n3 = 3;
                                        MaterialColor class1852 = MaterialColor.AIR;
                                        if (class1851.method9862() >= 0.0f) {
                                            if (n2 > 0) {
                                                class1852 = MaterialColor.BROWN;
                                                if (n2 <= 3) {
                                                    n3 = 3;
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                        }
                                        else {
                                            class1852 = MaterialColor.ADOBE;
                                            if (n2 > 7 && l % 2 == 0) {
                                                n3 = (k + (int)(MathHelper.sin(l + 0.0f) * 7.0f)) / 8 % 5;
                                                if (n3 != 3) {
                                                    if (n3 == 4) {
                                                        n3 = 0;
                                                    }
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                            else if (n2 <= 7) {
                                                if (n2 <= 5) {
                                                    if (n2 <= 3) {
                                                        if (n2 > 1) {
                                                            n3 = 0;
                                                        }
                                                    }
                                                    else {
                                                        n3 = 0;
                                                    }
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                            else {
                                                class1852 = MaterialColor.AIR;
                                            }
                                        }
                                        if (class1852 != MaterialColor.AIR) {
                                            method12328.field25426[k + l * 128] = (byte)(class1852.colorIndex * 4 + n3);
                                            method12328.method18920(k, l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method11722(final ItemStack class8321, final World class8322, final Entity class8323, final int n, final boolean b) {
        if (!class8322.isRemote) {
            final Class6356 method12328 = method12328(class8321, class8322);
            if (method12328 != null) {
                if (class8323 instanceof PlayerEntity) {
                    method12328.method18916((PlayerEntity)class8323, class8321);
                }
                if (!method12328.field25427) {
                    if (!b) {
                        if (!(class8323 instanceof PlayerEntity)) {
                            return;
                        }
                        if (((PlayerEntity)class8323).method2714() != class8321) {
                            return;
                        }
                    }
                    this.method12332(class8322, class8323, method12328);
                }
            }
        }
    }
    
    @Nullable
    @Override
    public IPacket<?> method12325(final ItemStack class8321, final World class8322, final PlayerEntity class8323) {
        return method12328(class8321, class8322).method18919(class8321, class8322, class8323);
    }
    
    @Override
    public void method11723(final ItemStack class8321, final World class8322, final PlayerEntity class8323) {
        final CompoundNBT method27657 = class8321.method27657();
        if (method27657 != null) {
            if (method27657.contains("map_scale_direction", 99)) {
                method12336(class8321, class8322, method27657.getInt("map_scale_direction"));
                method27657.remove("map_scale_direction");
            }
        }
    }
    
    public static void method12336(final ItemStack class8321, final World class8322, final int n) {
        final Class6356 method12328 = method12328(class8321, class8322);
        if (method12328 != null) {
            method12330(class8321, class8322, method12328.field25420, method12328.field25421, MathHelper.method35651(method12328.field25425 + n, 0, 4), method12328.field25423, method12328.field25424, method12328.field25422);
        }
    }
    
    @Nullable
    public static ItemStack method12337(final World class1847, final ItemStack class1848) {
        final Class6356 method12328 = method12328(class1848, class1847);
        if (method12328 == null) {
            return null;
        }
        final ItemStack method12329 = class1848.method27641();
        method12330(method12329, class1847, 0, 0, method12328.field25425, method12328.field25423, method12328.field25424, method12328.field25422).method18915(method12328);
        return method12329;
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        final Class6356 class8324 = (class8322 != null) ? method12328(class8321, class8322) : null;
        if (class8324 != null) {
            if (class8324.field25427) {
                list.add(new Class2259("filled_map.locked", method12329(class8321)).applyTextStyle(TextFormatting.GRAY));
            }
        }
        if (class8323.method7991()) {
            if (class8324 == null) {
                list.add(new Class2259("filled_map.unknown").applyTextStyle(TextFormatting.GRAY));
            }
            else {
                list.add(new Class2259("filled_map.id", method12329(class8321)).applyTextStyle(TextFormatting.GRAY));
                list.add(new Class2259("filled_map.scale", 1 << class8324.field25425).applyTextStyle(TextFormatting.GRAY));
                list.add(new Class2259("filled_map.level", class8324.field25425, 4).applyTextStyle(TextFormatting.GRAY));
            }
        }
    }
    
    public static int method12338(final ItemStack class8321) {
        final CompoundNBT method27660 = class8321.method27660("display");
        if (method27660 != null && method27660.contains("MapColor", 99)) {
            return 0xFF000000 | (method27660.getInt("MapColor") & 0xFFFFFF);
        }
        return -12173266;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        if (!class7075.method21654().getBlockState(class7075.method21639()).method21755(Class7188.field27900)) {
            return super.method11694(class7075);
        }
        if (!class7075.field27554.isRemote) {
            method12328(class7075.method21651(), class7075.method21654()).method18922(class7075.method21654(), class7075.method21639());
        }
        return Class2201.field13400;
    }
}
