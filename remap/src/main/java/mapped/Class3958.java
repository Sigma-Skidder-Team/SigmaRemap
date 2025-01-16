// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3958 extends Class3841
{
    private static String[] field17864;
    public static final Class7115 field17865;
    private static final Class7114<Class108> field17866;
    public static final Class7113 field17867;
    private static final VoxelShape field17868;
    private static final VoxelShape field17869;
    private static final VoxelShape field17870;
    private static final VoxelShape field17871;
    private static final VoxelShape field17872;
    private static final VoxelShape field17873;
    private static final VoxelShape field17874;
    private static final VoxelShape field17875;
    private static final VoxelShape field17876;
    private static final VoxelShape field17877;
    private static final VoxelShape field17878;
    private static final VoxelShape field17879;
    
    public Class3958(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3958.field17865, Direction.NORTH)).with(Class3958.field17866, Class108.field337)).with((IProperty<Comparable>)Class3958.field17867, false));
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        final boolean method6749 = class7097.method6749(class7098);
        if (method6749 != class7096.get((IProperty<Boolean>)Class3958.field17867)) {
            if (method6749) {
                this.method12076(class7097, class7098, null);
            }
            class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3958.field17867, method6749), 3);
        }
    }
    
    @Override
    public void onProjectileCollision(final World class1847, final BlockState class1848, final Class7005 class1849, final Entity class1850) {
        if (class1850 instanceof Class402) {
            final Entity method1973 = ((Class402)class1850).method1973();
            this.method12074(class1847, class1848, class1849, (method1973 instanceof Class512) ? ((Class512)method1973) : null, true);
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        return this.method12074(class7097, class7096, class7101, class7099, true) ? Class2201.field13400 : Class2201.field13402;
    }
    
    public boolean method12074(final World class1847, final BlockState class1848, final Class7005 class1849, final Class512 class1850, final boolean b) {
        final Direction method21448 = class1849.method21448();
        final BlockPos method21449 = class1849.method21447();
        if (b && !this.method12075(class1848, method21448, class1849.method21451().y - method21449.getY())) {
            return false;
        }
        if (this.method12076(class1847, method21449, method21448)) {
            if (class1850 != null) {
                class1850.method2857(Class8276.field34054);
            }
        }
        return true;
    }
    
    private boolean method12075(final BlockState class7096, final Direction class7097, final double n) {
        if (class7097.getAxis() == Axis.Y || n > 0.8123999834060669) {
            return false;
        }
        final Direction class7098 = class7096.get((IProperty<Direction>)Class3958.field17865);
        switch (Class7409.field28543[class7096.get(Class3958.field17866).ordinal()]) {
            case 1: {
                return class7098.getAxis() == class7097.getAxis();
            }
            case 2:
            case 3: {
                return class7098.getAxis() != class7097.getAxis();
            }
            case 4: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean method12076(final World class1847, final BlockPos class1848, Direction class1849) {
        final TileEntity method6727 = class1847.method6727(class1848);
        if (!class1847.isRemote && method6727 instanceof Class495) {
            if (class1849 == null) {
                class1849 = class1847.getBlockState(class1848).method21772((IProperty<Direction>)Class3958.field17865);
            }
            ((Class495)method6727).method2511(class1849);
            class1847.method6705(null, class1848, Class8520.field35025, Class286.field1582, 2.0f, 1.0f);
            return true;
        }
        return false;
    }
    
    private VoxelShape method12077(final BlockState class7096) {
        final Direction class7097 = class7096.get((IProperty<Direction>)Class3958.field17865);
        final Class108 class7098 = class7096.get(Class3958.field17866);
        if (class7098 == Class108.field337) {
            return (class7097 != Direction.NORTH && class7097 != Direction.SOUTH) ? Class3958.field17869 : Class3958.field17868;
        }
        if (class7098 == Class108.field338) {
            return Class3958.field17879;
        }
        if (class7098 == Class108.field340) {
            return (class7097 != Direction.NORTH && class7097 != Direction.SOUTH) ? Class3958.field17874 : Class3958.field17873;
        }
        if (class7097 == Direction.NORTH) {
            return Class3958.field17877;
        }
        if (class7097 != Direction.SOUTH) {
            return (class7097 != Direction.EAST) ? Class3958.field17875 : Class3958.field17876;
        }
        return Class3958.field17878;
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.method12077(class7096);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.method12077(class7096);
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final Direction method21648 = class7074.method21648();
        final BlockPos method21649 = class7074.method21639();
        final World method21650 = class7074.method21654();
        final Axis method21651 = method21648.getAxis();
        if (method21651 != Axis.Y) {
            boolean b = false;
            Label_0251: {
                Label_0178: {
                    if (method21651 == Axis.X) {
                        if (method21650.getBlockState(method21649.method1145()).method21761(method21650, method21649.method1145(), Direction.EAST)) {
                            if (method21650.getBlockState(method21649.method1147()).method21761(method21650, method21649.method1147(), Direction.WEST)) {
                                break Label_0178;
                            }
                        }
                    }
                    if (method21651 == Axis.Z) {
                        if (method21650.getBlockState(method21649.method1141()).method21761(method21650, method21649.method1141(), Direction.SOUTH)) {
                            if (method21650.getBlockState(method21649.method1143()).method21761(method21650, method21649.method1143(), Direction.NORTH)) {
                                break Label_0178;
                            }
                        }
                    }
                    b = false;
                    break Label_0251;
                }
                b = true;
            }
            final BlockState class7075 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3958.field17865, method21648.getOpposite())).with(Class3958.field17866, b ? Class108.field340 : Class108.field339);
            if (class7075.method21752(class7074.method21654(), class7074.method21639())) {
                return class7075;
            }
            final BlockState class7076 = ((StateHolder<Object, BlockState>)class7075).with(Class3958.field17866, method21650.getBlockState(method21649.method1139()).method21761(method21650, method21649.method1139(), Direction.UP) ? Class108.field337 : Class108.field338);
            if (class7076.method21752(class7074.method21654(), class7074.method21639())) {
                return class7076;
            }
        }
        else {
            final BlockState class7077 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with(Class3958.field17866, (method21648 != Direction.DOWN) ? Class108.field337 : Class108.field338)).with((IProperty<Comparable>)Class3958.field17865, class7074.method21644());
            if (class7077.method21752(class7074.method21654(), method21649)) {
                return class7077;
            }
        }
        return null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final Class108 class7102 = class7096.get(Class3958.field17866);
        final Direction method782 = method12078(class7096).getOpposite();
        if (method782 == class7097) {
            if (!class7096.method21752(class7099, class7100)) {
                if (class7102 != Class108.field340) {
                    return Class7521.field29147.getDefaultState();
                }
            }
        }
        if (class7097.getAxis() == class7096.get((IProperty<Direction>)Class3958.field17865).getAxis()) {
            if (class7102 == Class108.field340 && !class7098.isSolidSide(class7099, class7101, class7097)) {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with(Class3958.field17866, Class108.field339)).with((IProperty<Comparable>)Class3958.field17865, class7097.getOpposite());
            }
            if (class7102 == Class108.field339) {
                if (method782.getOpposite() == class7097) {
                    if (class7098.isSolidSide(class7099, class7101, class7096.get((IProperty<Direction>)Class3958.field17865))) {
                        return ((StateHolder<O, BlockState>)class7096).with(Class3958.field17866, Class108.field340);
                    }
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return Class3902.method12002(class7097, class7098, method12078(class7096).getOpposite());
    }
    
    private static Direction method12078(final BlockState class7096) {
        switch (Class7409.field28543[class7096.get(Class3958.field17866).ordinal()]) {
            case 1: {
                return Direction.UP;
            }
            case 4: {
                return Direction.DOWN;
            }
            default: {
                return class7096.get((IProperty<Direction>)Class3958.field17865).getOpposite();
            }
        }
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.DESTROY;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3958.field17865, Class3958.field17866, Class3958.field17867);
    }
    
    @Nullable
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class495();
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17865 = Class3892.field17564;
        field17866 = Class8970.field37760;
        field17867 = Class8970.field37741;
        field17868 = Block.method11778(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
        field17869 = Block.method11778(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
        field17870 = Block.method11778(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
        field17871 = Block.method11778(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
        field17872 = VoxelShapes.method24492(Class3958.field17871, Class3958.field17870);
        field17873 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
        field17874 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
        field17875 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
        field17876 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
        field17877 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
        field17878 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
        field17879 = VoxelShapes.method24492(Class3958.field17872, Block.method11778(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
    }
}
