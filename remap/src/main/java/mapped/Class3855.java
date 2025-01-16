// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3855 extends Class3854
{
    private static String[] field17464;
    public static final Class7113 field17474;
    private final VoxelShape[] field17475;
    private final VoxelShape[] field17476;
    
    public Class3855(final Class9288 class9288) {
        super(0.0f, 3.0f, 0.0f, 14.0f, 24.0f, class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3855.field17474, true)).with((IProperty<Comparable>)Class3855.field17465, false)).with((IProperty<Comparable>)Class3855.field17466, false)).with((IProperty<Comparable>)Class3855.field17467, false)).with((IProperty<Comparable>)Class3855.field17468, false)).with((IProperty<Comparable>)Class3855.field17469, false));
        this.field17475 = this.method11914(4.0f, 3.0f, 16.0f, 0.0f, 14.0f);
        this.field17476 = this.method11914(4.0f, 3.0f, 24.0f, 0.0f, 24.0f);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return class7096.get((IProperty<Boolean>)Class3855.field17474) ? this.field17475[this.method11916(class7096)] : super.method11808(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return class7096.get((IProperty<Boolean>)Class3855.field17474) ? this.field17476[this.method11916(class7096)] : super.method11809(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    private boolean method11919(final BlockState class7096, final boolean b, final Direction class7097) {
        final Block method21696 = class7096.getBlock();
        final boolean b2 = method21696.method11785(Class7188.field27904) || (method21696 instanceof Class3898 && Class3898.method11983(class7096, class7097));
        return (!Block.method11792(method21696) && b) || b2;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        final IFluidState method21656 = class7074.method21654().getFluidState(class7074.method21639());
        final BlockPos method21657 = method21655.method1141();
        final BlockPos method21658 = method21655.method1147();
        final BlockPos method21659 = method21655.method1143();
        final BlockPos method21660 = method21655.method1145();
        final BlockState method21661 = method21654.getBlockState(method21657);
        final BlockState method21662 = method21654.getBlockState(method21658);
        final BlockState method21663 = method21654.getBlockState(method21659);
        final BlockState method21664 = method21654.getBlockState(method21660);
        final boolean method21665 = this.method11919(method21661, method21661.isSolidSide(method21654, method21657, Direction.SOUTH), Direction.SOUTH);
        final boolean method21666 = this.method11919(method21662, method21662.isSolidSide(method21654, method21658, Direction.WEST), Direction.WEST);
        final boolean method21667 = this.method11919(method21663, method21663.isSolidSide(method21654, method21659, Direction.NORTH), Direction.NORTH);
        final boolean method21668 = this.method11919(method21664, method21664.isSolidSide(method21654, method21660, Direction.EAST), Direction.EAST);
        Label_0227: {
            if (method21665) {
                if (!method21666) {
                    if (method21667) {
                        if (!method21668) {
                            break Label_0227;
                        }
                    }
                }
            }
            if (!method21665) {
                if (method21666) {
                    if (!method21667) {
                        if (method21668) {
                            break Label_0227;
                        }
                    }
                }
            }
            final boolean b = true;
            return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3855.field17474, b || !method21654.method6961(method21655.method1137()))).with((IProperty<Comparable>)Class3855.field17465, method21665)).with((IProperty<Comparable>)Class3855.field17466, method21666)).with((IProperty<Comparable>)Class3855.field17467, method21667)).with((IProperty<Comparable>)Class3855.field17468, method21668)).with((IProperty<Comparable>)Class3855.field17469, method21656.getFluid() == Class7558.field29976);
        }
        final boolean b = false;
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3855.field17474, b || !method21654.method6961(method21655.method1137()))).with((IProperty<Comparable>)Class3855.field17465, method21665)).with((IProperty<Comparable>)Class3855.field17466, method21666)).with((IProperty<Comparable>)Class3855.field17467, method21667)).with((IProperty<Comparable>)Class3855.field17468, method21668)).with((IProperty<Comparable>)Class3855.field17469, method21656.getFluid() == Class7558.field29976);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3855.field17469)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        if (class7097 != Direction.DOWN) {
            final Direction method782 = class7097.getOpposite();
            final boolean b = (class7097 != Direction.NORTH) ? class7096.get((IProperty<Boolean>)Class3855.field17465) : this.method11919(class7098, class7098.isSolidSide(class7099, class7101, method782), method782);
            final boolean b2 = (class7097 != Direction.EAST) ? class7096.get((IProperty<Boolean>)Class3855.field17466) : this.method11919(class7098, class7098.isSolidSide(class7099, class7101, method782), method782);
            final boolean b3 = (class7097 != Direction.SOUTH) ? class7096.get((IProperty<Boolean>)Class3855.field17467) : this.method11919(class7098, class7098.isSolidSide(class7099, class7101, method782), method782);
            final boolean b4 = (class7097 != Direction.WEST) ? class7096.get((IProperty<Boolean>)Class3855.field17468) : this.method11919(class7098, class7098.isSolidSide(class7099, class7101, method782), method782);
            Label_0283: {
                if (b) {
                    if (!b2) {
                        if (b3) {
                            if (!b4) {
                                break Label_0283;
                            }
                        }
                    }
                }
                if (!b) {
                    if (b2) {
                        if (!b3) {
                            if (b4) {
                                break Label_0283;
                            }
                        }
                    }
                }
                final boolean b5 = true;
                return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3855.field17474, b5 || !class7099.method6961(class7100.method1137()))).with((IProperty<Comparable>)Class3855.field17465, b)).with((IProperty<Comparable>)Class3855.field17466, b2)).with((IProperty<Comparable>)Class3855.field17467, b3)).with((IProperty<Comparable>)Class3855.field17468, b4);
            }
            final boolean b5 = false;
            return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3855.field17474, b5 || !class7099.method6961(class7100.method1137()))).with((IProperty<Comparable>)Class3855.field17465, b)).with((IProperty<Comparable>)Class3855.field17466, b2)).with((IProperty<Comparable>)Class3855.field17467, b3)).with((IProperty<Comparable>)Class3855.field17468, b4);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3855.field17474, Class3855.field17465, Class3855.field17466, Class3855.field17468, Class3855.field17467, Class3855.field17469);
    }
    
    static {
        field17474 = Class8970.field37750;
    }
}
