// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import java.util.stream.IntStream;

public class Class3916 extends Block implements Class3856
{
    private static String[] field17731;
    public static final Class7115 field17732;
    public static final Class7114<Class109> field17733;
    public static final Class7114<Class183> field17734;
    public static final Class7113 field17735;
    public static final VoxelShape field17736;
    public static final VoxelShape field17737;
    public static final VoxelShape field17738;
    public static final VoxelShape field17739;
    public static final VoxelShape field17740;
    public static final VoxelShape field17741;
    public static final VoxelShape field17742;
    public static final VoxelShape field17743;
    public static final VoxelShape field17744;
    public static final VoxelShape field17745;
    public static final VoxelShape[] field17746;
    public static final VoxelShape[] field17747;
    private static final int[] field17748;
    private final Block field17749;
    private final Class7096 field17750;
    
    private static VoxelShape[] method12021(final VoxelShape class7702, final VoxelShape class7703, final VoxelShape class7704, final VoxelShape class7705, final VoxelShape class7706) {
        return IntStream.range(0, 16).mapToObj(n2 -> method12022(n2, class7707, class7708, class7709, class7710, class7711)).toArray(VoxelShape[]::new);
    }
    
    private static VoxelShape method12022(final int n, final VoxelShape class7702, final VoxelShape class7703, final VoxelShape class7704, final VoxelShape class7705, final VoxelShape class7706) {
    Label_0025_Outer:
        while (true) {
            final int n2;
            while (true) {
                Label_0044: {
                    if ((n2 & 0x8000000) == 0x0) {
                        break Label_0044;
                    }
                    if ((n2 & 0x10000000) != 0x0) {}
                    if ((n2 & 0x100000) != 0x0) {
                        if ((n2 & 0x1000) != 0x0) {
                            continue Label_0025_Outer;
                        }
                    }
                }
                if ((n2 & 0x2000000) != 0x0) {
                    continue;
                }
                break;
            }
            if ((n2 & 0x100) != 0x0) {
                break;
            }
        }
        return class7702;
    }
    
    public Class3916(final Class7096 field17750, final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3916.field17732, Direction.NORTH)).with(Class3916.field17733, Class109.field344)).with(Class3916.field17734, Class183.field567)).with((IProperty<Comparable>)Class3916.field17735, false));
        this.field17749 = field17750.method21696();
        this.field17750 = field17750;
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return ((class7096.method21772(Class3916.field17733) != Class109.field343) ? Class3916.field17747 : Class3916.field17746)[Class3916.field17748[this.method12023(class7096)]];
    }
    
    private int method12023(final Class7096 class7096) {
        return class7096.method21772(Class3916.field17734).ordinal() * 4 + class7096.method21772((IProperty<Direction>)Class3916.field17732).getHorizontalIndex();
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        this.field17749.method11823(class7096, class7097, class7098, random);
    }
    
    @Override
    public void method11847(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        this.field17750.method21745(class7097, class7098, class7099);
    }
    
    @Override
    public void method11824(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853) {
        this.field17749.method11824(class1851, class1852, class1853);
    }
    
    @Override
    public float method11841() {
        return this.field17749.method11841();
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return this.field17749.method11826(class1852);
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7096.method21696()) {
            this.field17750.method21734(class7097, class7098, Blocks.AIR, class7098, false);
            this.field17749.method11828(this.field17750, class7097, class7098, class7099, false);
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            this.field17750.method21738(class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public void method11845(final World class1847, final BlockPos class1848, final Entity class1849) {
        this.field17749.method11845(class1847, class1848, class1849);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.field17749.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        return this.field17750.method21744(class7097, class7099, class7100, class7101);
    }
    
    @Override
    public void method11842(final World class1847, final BlockPos class1848, final Explosion class1849) {
        this.field17749.method11842(class1847, class1848, class1849);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Direction method21648 = class7074.method21648();
        final BlockPos method21649 = class7074.method21639();
        final Class7096 class7075 = ((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, class7074.method21644())).with(Class3916.field17733, (method21648 != Direction.DOWN && (method21648 == Direction.UP || class7074.method21649().y - method21649.getY() <= 0.5)) ? Class109.field344 : Class109.field343)).with((IProperty<Comparable>)Class3916.field17735, class7074.method21654().getFluidState(method21649).getFluid() == Class7558.field29976);
        return ((StateHolder<O, Class7096>)class7075).with(Class3916.field17734, method12024(class7075, class7074.method21654(), method21649));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((IProperty<Boolean>)Class3916.field17735)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return class7097.getAxis().isHorizontal() ? ((StateHolder<O, Class7096>)class7096).with(Class3916.field17734, method12024(class7096, class7099, class7100)) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public static Class183 method12024(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        final Direction class7099 = class7096.method21772((IProperty<Direction>)Class3916.field17732);
        final Class7096 method6701 = class7097.getBlockState(class7098.method1149(class7099));
        if (method12026(method6701)) {
            if (class7096.method21772(Class3916.field17733) == method6701.method21772(Class3916.field17733)) {
                final Direction class7100 = method6701.method21772((IProperty<Direction>)Class3916.field17732);
                if (class7100.getAxis() != class7096.method21772((IProperty<Direction>)Class3916.field17732).getAxis()) {
                    if (method12025(class7096, class7097, class7098, class7100.getOpposite())) {
                        if (class7100 != class7099.method784()) {
                            return Class183.field571;
                        }
                        return Class183.field570;
                    }
                }
            }
        }
        final Class7096 method6702 = class7097.getBlockState(class7098.method1149(class7099.getOpposite()));
        if (method12026(method6702)) {
            if (class7096.method21772(Class3916.field17733) == method6702.method21772(Class3916.field17733)) {
                final Direction class7101 = method6702.method21772((IProperty<Direction>)Class3916.field17732);
                if (class7101.getAxis() != class7096.method21772((IProperty<Direction>)Class3916.field17732).getAxis()) {
                    if (method12025(class7096, class7097, class7098, class7101)) {
                        if (class7101 != class7099.method784()) {
                            return Class183.field569;
                        }
                        return Class183.field568;
                    }
                }
            }
        }
        return Class183.field567;
    }
    
    private static boolean method12025(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        final Class7096 method6701 = class7097.getBlockState(class7098.method1149(class7099));
        if (method12026(method6701)) {
            if (((StateHolder<Object, Object>)method6701).get((IProperty<Comparable>)Class3916.field17732) == class7096.method21772((IProperty<Comparable>)Class3916.field17732)) {
                if (((StateHolder<Object, Object>)method6701).get(Class3916.field17733) == class7096.method21772(Class3916.field17733)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean method12026(final Class7096 class7096) {
        return class7096.method21696() instanceof Class3916;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3916.field17732, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3916.field17732)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        final Direction class7098 = class7096.method21772((IProperty<Direction>)Class3916.field17732);
        final Class183 class7099 = class7096.method21772(Class3916.field17734);
        Label_0354: {
            switch (Class7570.field30022[class7097.ordinal()]) {
                case 1: {
                    if (class7098.getAxis() != Direction.Axis.Z) {
                        break;
                    }
                    switch (Class7570.field30021[class7099.ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field569);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field568);
                        }
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field571);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field570);
                        }
                        default: {
                            return class7096.method21708(Class2052.field11709);
                        }
                    }
                    break;
                }
                case 2: {
                    if (class7098.getAxis() != Direction.Axis.X) {
                        break;
                    }
                    switch (Class7570.field30021[class7099.ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field568);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field569);
                        }
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field571);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096.method21708(Class2052.field11709)).with(Class3916.field17734, Class183.field570);
                        }
                        case 5: {
                            return class7096.method21708(Class2052.field11709);
                        }
                        default: {
                            break Label_0354;
                        }
                    }
                    break;
                }
            }
        }
        return super.method11791(class7096, class7097);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3916.field17732, Class3916.field17733, Class3916.field17734, Class3916.field17735);
    }
    
    @Override
    public IFluidState method11864(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class3916.field17735) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17732 = Class3892.field17564;
        field17733 = Class8970.field37766;
        field17734 = Class8970.field37801;
        field17735 = Class8970.field37747;
        field17736 = Class3921.field17780;
        field17737 = Class3921.field17779;
        field17738 = Block.method11778(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
        field17739 = Block.method11778(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
        field17740 = Block.method11778(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
        field17741 = Block.method11778(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
        field17742 = Block.method11778(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
        field17743 = Block.method11778(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
        field17744 = Block.method11778(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
        field17745 = Block.method11778(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
        field17746 = method12021(Class3916.field17736, Class3916.field17738, Class3916.field17742, Class3916.field17739, Class3916.field17743);
        field17747 = method12021(Class3916.field17737, Class3916.field17740, Class3916.field17744, Class3916.field17741, Class3916.field17745);
        field17748 = new int[] { 12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8 };
    }
}
