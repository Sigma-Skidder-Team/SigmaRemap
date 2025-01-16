// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class Class3903 extends Class3902
{
    public static final VoxelShape field17619;
    public static final VoxelShape field17620;
    public static final VoxelShape field17621;
    public static final VoxelShape field17622;
    public static final VoxelShape field17623;
    public static final VoxelShape field17624;
    public static final VoxelShape field17625;
    public static final VoxelShape field17626;
    public static final VoxelShape field17627;
    public static final VoxelShape field17628;
    public static final VoxelShape field17629;
    public static final VoxelShape field17630;
    public static final VoxelShape field17631;
    public static final VoxelShape field17632;
    public static final VoxelShape field17633;
    public static final VoxelShape field17634;
    public static final VoxelShape field17635;
    public static final VoxelShape field17636;
    public static final VoxelShape field17637;
    public static final VoxelShape field17638;
    public static final VoxelShape field17639;
    public static final VoxelShape field17640;
    public static final VoxelShape field17641;
    public static final VoxelShape field17642;
    public static final VoxelShape field17643;
    public static final VoxelShape field17644;
    public static final VoxelShape field17645;
    public static final VoxelShape field17646;
    public static final VoxelShape field17647;
    public static final VoxelShape field17648;
    public static final VoxelShape field17649;
    public static final VoxelShape field17650;
    public static final VoxelShape field17651;
    public static final VoxelShape field17652;
    public static final VoxelShape field17653;
    public static final VoxelShape field17654;
    public static final VoxelShape field17655;
    public static final VoxelShape field17656;
    public static final VoxelShape field17657;
    public static final VoxelShape field17658;
    public static final VoxelShape field17659;
    public static final VoxelShape field17660;
    public static final VoxelShape field17661;
    public static final VoxelShape field17662;
    public static final VoxelShape field17663;
    public static final VoxelShape field17664;
    public static final VoxelShape field17665;
    public static final VoxelShape field17666;
    public static final VoxelShape field17667;
    public static final VoxelShape field17668;
    public static final VoxelShape field17669;
    public static final VoxelShape field17670;
    public static final VoxelShape field17671;
    public static final VoxelShape field17672;
    public static final VoxelShape field17673;
    public static final VoxelShape field17674;
    public static final VoxelShape field17675;
    public static final VoxelShape field17676;
    public static final VoxelShape field17677;
    public static final VoxelShape field17678;
    public static final VoxelShape field17679;
    public static final VoxelShape field17680;
    public static final VoxelShape field17681;
    public static final VoxelShape field17682;
    private static final Class2259 field17683;
    
    public Class3903(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3903.field17564, Direction.NORTH)).with(Class3903.field17618, Class107.field333));
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    private VoxelShape method12004(final BlockState class7096) {
        final Direction class7097 = class7096.get((IProperty<Direction>)Class3903.field17564);
        switch (Class9270.field39751[class7096.get(Class3903.field17618).ordinal()]) {
            case 1: {
                if (class7097 != Direction.NORTH && class7097 != Direction.SOUTH) {
                    return Class3903.field17634;
                }
                return Class3903.field17626;
            }
            case 2: {
                if (class7097 == Direction.NORTH) {
                    return Class3903.field17650;
                }
                if (class7097 == Direction.SOUTH) {
                    return Class3903.field17642;
                }
                if (class7097 == Direction.EAST) {
                    return Class3903.field17666;
                }
                return Class3903.field17658;
            }
            case 3: {
                if (class7097 != Direction.NORTH && class7097 != Direction.SOUTH) {
                    return Class3903.field17682;
                }
                return Class3903.field17674;
            }
            default: {
                return Class3903.field17634;
            }
        }
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.method12004(class7096);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.method12004(class7096);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.isRemote) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34058);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class434 method11827(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3440(n, class1849, Class7318.method22434(class7097, class7098)), Class3903.field17683);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3903.field17564, class7097.method8142(class7096.get((IProperty<Direction>)Class3903.field17564)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3903.field17564)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3903.field17564, Class3903.field17618);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17619 = Block.method11778(2.0, 0.0, 6.0, 4.0, 7.0, 10.0);
        field17620 = Block.method11778(12.0, 0.0, 6.0, 14.0, 7.0, 10.0);
        field17621 = Block.method11778(2.0, 7.0, 5.0, 4.0, 13.0, 11.0);
        field17622 = Block.method11778(12.0, 7.0, 5.0, 14.0, 13.0, 11.0);
        field17623 = VoxelShapes.method24492(Class3903.field17619, Class3903.field17621);
        field17624 = VoxelShapes.method24492(Class3903.field17620, Class3903.field17622);
        field17625 = VoxelShapes.method24492(Class3903.field17623, Class3903.field17624);
        field17626 = VoxelShapes.method24492(Class3903.field17625, Block.method11778(4.0, 4.0, 2.0, 12.0, 16.0, 14.0));
        field17627 = Block.method11778(6.0, 0.0, 2.0, 10.0, 7.0, 4.0);
        field17628 = Block.method11778(6.0, 0.0, 12.0, 10.0, 7.0, 14.0);
        field17629 = Block.method11778(5.0, 7.0, 2.0, 11.0, 13.0, 4.0);
        field17630 = Block.method11778(5.0, 7.0, 12.0, 11.0, 13.0, 14.0);
        field17631 = VoxelShapes.method24492(Class3903.field17627, Class3903.field17629);
        field17632 = VoxelShapes.method24492(Class3903.field17628, Class3903.field17630);
        field17633 = VoxelShapes.method24492(Class3903.field17631, Class3903.field17632);
        field17634 = VoxelShapes.method24492(Class3903.field17633, Block.method11778(2.0, 4.0, 4.0, 14.0, 16.0, 12.0));
        field17635 = Block.method11778(2.0, 6.0, 0.0, 4.0, 10.0, 7.0);
        field17636 = Block.method11778(12.0, 6.0, 0.0, 14.0, 10.0, 7.0);
        field17637 = Block.method11778(2.0, 5.0, 7.0, 4.0, 11.0, 13.0);
        field17638 = Block.method11778(12.0, 5.0, 7.0, 14.0, 11.0, 13.0);
        field17639 = VoxelShapes.method24492(Class3903.field17635, Class3903.field17637);
        field17640 = VoxelShapes.method24492(Class3903.field17636, Class3903.field17638);
        field17641 = VoxelShapes.method24492(Class3903.field17639, Class3903.field17640);
        field17642 = VoxelShapes.method24492(Class3903.field17641, Block.method11778(4.0, 2.0, 4.0, 12.0, 14.0, 16.0));
        field17643 = Block.method11778(2.0, 6.0, 7.0, 4.0, 10.0, 16.0);
        field17644 = Block.method11778(12.0, 6.0, 7.0, 14.0, 10.0, 16.0);
        field17645 = Block.method11778(2.0, 5.0, 3.0, 4.0, 11.0, 9.0);
        field17646 = Block.method11778(12.0, 5.0, 3.0, 14.0, 11.0, 9.0);
        field17647 = VoxelShapes.method24492(Class3903.field17643, Class3903.field17645);
        field17648 = VoxelShapes.method24492(Class3903.field17644, Class3903.field17646);
        field17649 = VoxelShapes.method24492(Class3903.field17647, Class3903.field17648);
        field17650 = VoxelShapes.method24492(Class3903.field17649, Block.method11778(4.0, 2.0, 0.0, 12.0, 14.0, 12.0));
        field17651 = Block.method11778(7.0, 6.0, 2.0, 16.0, 10.0, 4.0);
        field17652 = Block.method11778(7.0, 6.0, 12.0, 16.0, 10.0, 14.0);
        field17653 = Block.method11778(3.0, 5.0, 2.0, 9.0, 11.0, 4.0);
        field17654 = Block.method11778(3.0, 5.0, 12.0, 9.0, 11.0, 14.0);
        field17655 = VoxelShapes.method24492(Class3903.field17651, Class3903.field17653);
        field17656 = VoxelShapes.method24492(Class3903.field17652, Class3903.field17654);
        field17657 = VoxelShapes.method24492(Class3903.field17655, Class3903.field17656);
        field17658 = VoxelShapes.method24492(Class3903.field17657, Block.method11778(0.0, 2.0, 4.0, 12.0, 14.0, 12.0));
        field17659 = Block.method11778(0.0, 6.0, 2.0, 9.0, 10.0, 4.0);
        field17660 = Block.method11778(0.0, 6.0, 12.0, 9.0, 10.0, 14.0);
        field17661 = Block.method11778(7.0, 5.0, 2.0, 13.0, 11.0, 4.0);
        field17662 = Block.method11778(7.0, 5.0, 12.0, 13.0, 11.0, 14.0);
        field17663 = VoxelShapes.method24492(Class3903.field17659, Class3903.field17661);
        field17664 = VoxelShapes.method24492(Class3903.field17660, Class3903.field17662);
        field17665 = VoxelShapes.method24492(Class3903.field17663, Class3903.field17664);
        field17666 = VoxelShapes.method24492(Class3903.field17665, Block.method11778(4.0, 2.0, 4.0, 16.0, 14.0, 12.0));
        field17667 = Block.method11778(2.0, 9.0, 6.0, 4.0, 16.0, 10.0);
        field17668 = Block.method11778(12.0, 9.0, 6.0, 14.0, 16.0, 10.0);
        field17669 = Block.method11778(2.0, 3.0, 5.0, 4.0, 9.0, 11.0);
        field17670 = Block.method11778(12.0, 3.0, 5.0, 14.0, 9.0, 11.0);
        field17671 = VoxelShapes.method24492(Class3903.field17667, Class3903.field17669);
        field17672 = VoxelShapes.method24492(Class3903.field17668, Class3903.field17670);
        field17673 = VoxelShapes.method24492(Class3903.field17671, Class3903.field17672);
        field17674 = VoxelShapes.method24492(Class3903.field17673, Block.method11778(4.0, 0.0, 2.0, 12.0, 12.0, 14.0));
        field17675 = Block.method11778(6.0, 9.0, 2.0, 10.0, 16.0, 4.0);
        field17676 = Block.method11778(6.0, 9.0, 12.0, 10.0, 16.0, 14.0);
        field17677 = Block.method11778(5.0, 3.0, 2.0, 11.0, 9.0, 4.0);
        field17678 = Block.method11778(5.0, 3.0, 12.0, 11.0, 9.0, 14.0);
        field17679 = VoxelShapes.method24492(Class3903.field17675, Class3903.field17677);
        field17680 = VoxelShapes.method24492(Class3903.field17676, Class3903.field17678);
        field17681 = VoxelShapes.method24492(Class3903.field17679, Class3903.field17680);
        field17682 = VoxelShapes.method24492(Class3903.field17681, Block.method11778(2.0, 0.0, 4.0, 14.0, 12.0, 12.0));
        field17683 = new Class2259("container.grindstone_title", new Object[0]);
    }
}
