// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Arrays;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.Set;

public class Class490 extends TileEntity implements INamedContainerProvider, Class439
{
    public static final Class5328[][] field2807;
    private static final Set<Class5328> field2808;
    private List<Class8392> field2809;
    private List<Class8392> field2810;
    private int field2811;
    private int field2812;
    private Class5328 field2813;
    private Class5328 field2814;
    private ITextComponent field2815;
    private Class9115 field2816;
    private final Class7604 field2817;
    
    public Class490() {
        super(Class5412.field22554);
        this.field2809 = Lists.newArrayList();
        this.field2810 = Lists.newArrayList();
        this.field2812 = -1;
        this.field2816 = Class9115.field38616;
        this.field2817 = new Class7606(this);
    }
    
    @Override
    public void method2229() {
        final int method1074 = this.field2657.getX();
        final int method1075 = this.field2657.getY();
        final int method1076 = this.field2657.getZ();
        BlockPos class354;
        if (this.field2812 >= method1075) {
            class354 = new BlockPos(method1074, this.field2812 + 1, method1076);
        }
        else {
            class354 = this.field2657;
            this.field2810 = Lists.newArrayList();
            this.field2812 = class354.getY() - 1;
        }
        Class8392 class355 = this.field2810.isEmpty() ? null : this.field2810.get(this.field2810.size() - 1);
        final int method1077 = this.field2656.method6699(HeightmapType.field11522, method1074, method1076);
        for (int i = 0; i < 10; ++i) {
            if (class354.getY() > method1077) {
                break;
            }
            final BlockState method1078 = this.field2656.getBlockState(class354);
            final Block method1079 = method1078.getBlock();
            if (!(method1079 instanceof Class3843)) {
                if (class355 == null || (method1078.getOpacity(this.field2656, class354) >= 15 && method1079 != Blocks.field29172)) {
                    this.field2810.clear();
                    this.field2812 = method1077;
                    break;
                }
                class355.method27974();
            }
            else {
                final float[] method1080 = ((Class3843)method1079).method11900().method815();
                if (this.field2810.size() > 1) {
                    if (class355 != null) {
                        if (!Arrays.equals(method1080, Class8392.method27977(class355))) {
                            class355 = new Class8392(new float[] { (Class8392.method27977(class355)[0] + method1080[0]) / 2.0f, (Class8392.method27977(class355)[1] + method1080[1]) / 2.0f, (Class8392.method27977(class355)[2] + method1080[2]) / 2.0f });
                            this.field2810.add(class355);
                        }
                        else {
                            class355.method27974();
                        }
                    }
                }
                else {
                    class355 = new Class8392(method1080);
                    this.field2810.add(class355);
                }
            }
            class354 = class354.method1137();
            ++this.field2812;
        }
        final int field2811 = this.field2811;
        if (this.field2656.method6754() % 80L == 0L) {
            if (!this.field2809.isEmpty()) {
                this.method2447(method1074, method1075, method1076);
            }
            if (this.field2811 > 0) {
                if (!this.field2809.isEmpty()) {
                    this.method2448();
                    this.method2449(Class8520.field35011);
                }
            }
        }
        if (this.field2812 >= method1077) {
            this.field2812 = -1;
            final boolean b = field2811 > 0;
            this.field2809 = this.field2810;
            if (!this.field2656.isRemote) {
                final boolean b2 = this.field2811 > 0;
                if (!b && b2) {
                    this.method2449(Class8520.field35010);
                    final Iterator<Class513> iterator = this.field2656.method7128((Class<? extends Class513>)Class513.class, new AxisAlignedBB(method1074, method1075, method1076, method1074, method1075 - 4, method1076).grow(10.0, 5.0, 10.0)).iterator();
                    while (iterator.hasNext()) {
                        Class7770.field31786.method13852(iterator.next(), this);
                    }
                }
                else if (b) {
                    if (!b2) {
                        this.method2449(Class8520.field35012);
                    }
                }
            }
        }
    }
    
    private void method2447(final int n, final int n2, final int n3) {
        this.field2811 = 0;
        for (int i = 1; i <= 4; this.field2811 = i++) {
            final int n4 = n2 - i;
            if (n4 < 0) {
                break;
            }
            int n5 = 1;
            for (int n6 = n - i; n6 <= n + i && n5 != 0; ++n6) {
                for (int j = n3 - i; j <= n3 + i; ++j) {
                    final Block method21696 = this.field2656.getBlockState(new BlockPos(n6, n4, j)).method21696();
                    if (method21696 != Blocks.field29412) {
                        if (method21696 != Blocks.GOLD_BLOCK) {
                            if (method21696 != Blocks.DIAMOND_BLOCK) {
                                if (method21696 != Blocks.IRON_BLOCK) {
                                    n5 = 0;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (n5 == 0) {
                break;
            }
        }
    }
    
    @Override
    public void method2198() {
        this.method2449(Class8520.field35012);
        super.method2198();
    }
    
    private void method2448() {
        if (!this.field2656.isRemote) {
            if (this.field2813 != null) {
                final double n = this.field2811 * 10 + 10;
                boolean b = false;
                if (this.field2811 >= 4) {
                    if (this.field2813 == this.field2814) {
                        b = true;
                    }
                }
                final int n2 = (9 + this.field2811 * 2) * 20;
                final List<Entity> method7128 = this.field2656.method7128((Class<? extends PlayerEntity>) PlayerEntity.class, new AxisAlignedBB(this.field2657).intersect(n).expand(0.0, this.field2656.getHeight(), 0.0));
                final Iterator<Entity> iterator = method7128.iterator();
                while (iterator.hasNext()) {
                    iterator.next().method2655(new Class1948(this.field2813, n2, b ? 1 : 0, true, true));
                }
                if (this.field2811 >= 4) {
                    if (this.field2813 != this.field2814) {
                        if (this.field2814 != null) {
                            final Iterator<PlayerEntity> iterator2 = method7128.iterator();
                            while (iterator2.hasNext()) {
                                iterator2.next().method2655(new Class1948(this.field2814, n2, 0, true, true));
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method2449(final Class7795 class7795) {
        this.field2656.method6705(null, this.field2657, class7795, Class286.field1582, 1.0f, 1.0f);
    }
    
    public List<Class8392> method2450() {
        return (this.field2811 != 0) ? this.field2809 : ImmutableList.of();
    }
    
    public int method2451() {
        return this.field2811;
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 3, this.method2196());
    }
    
    @Override
    public CompoundNBT method2196() {
        return this.method2180(new CompoundNBT());
    }
    
    @Override
    public double method2192() {
        return 65536.0;
    }
    
    @Nullable
    private static Class5328 method2452(final int n) {
        final Class5328 method16450 = Class5328.method16450(n);
        return Class490.field2808.contains(method16450) ? method16450 : null;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2813 = method2452(class51.getInt("Primary"));
        this.field2814 = method2452(class51.getInt("Secondary"));
        if (class51.contains("CustomName", 8)) {
            this.field2815 = Class5953.method17871(class51.getString("CustomName"));
        }
        this.field2816 = Class9115.method32978(class51);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        class51.putInt("Primary", Class5328.method16451(this.field2813));
        class51.putInt("Secondary", Class5328.method16451(this.field2814));
        class51.putInt("Levels", this.field2811);
        if (this.field2815 != null) {
            class51.putString("CustomName", Class5953.method17869(this.field2815));
        }
        this.field2816.method32977(class51);
        return class51;
    }
    
    public void method2453(final ITextComponent field2815) {
        this.field2815 = field2815;
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        return Class460.method2336(class465, this.field2816, this.method1871()) ? new Class3436(n, class464, this.field2817, Class7318.method22434(this.field2656, this.getPos())) : null;
    }
    
    @Override
    public ITextComponent method1871() {
        return (this.field2815 == null) ? new Class2259("container.beacon") : this.field2815;
    }
    
    static {
        field2807 = new Class5328[][] { { Class9439.field40474, Class9439.field40476 }, { Class9439.field40484, Class9439.field40481 }, { Class9439.field40478 }, { Class9439.field40483 } };
        field2808 = Arrays.stream(Class490.field2807).flatMap((Function<? super Class5328[], ? extends Stream<?>>)Arrays::stream).collect((Collector<? super Object, ?, Set<Class5328>>)Collectors.toSet());
    }
}
