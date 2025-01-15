// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3903 extends Class3902
{
    public static final Class7702 field17619;
    public static final Class7702 field17620;
    public static final Class7702 field17621;
    public static final Class7702 field17622;
    public static final Class7702 field17623;
    public static final Class7702 field17624;
    public static final Class7702 field17625;
    public static final Class7702 field17626;
    public static final Class7702 field17627;
    public static final Class7702 field17628;
    public static final Class7702 field17629;
    public static final Class7702 field17630;
    public static final Class7702 field17631;
    public static final Class7702 field17632;
    public static final Class7702 field17633;
    public static final Class7702 field17634;
    public static final Class7702 field17635;
    public static final Class7702 field17636;
    public static final Class7702 field17637;
    public static final Class7702 field17638;
    public static final Class7702 field17639;
    public static final Class7702 field17640;
    public static final Class7702 field17641;
    public static final Class7702 field17642;
    public static final Class7702 field17643;
    public static final Class7702 field17644;
    public static final Class7702 field17645;
    public static final Class7702 field17646;
    public static final Class7702 field17647;
    public static final Class7702 field17648;
    public static final Class7702 field17649;
    public static final Class7702 field17650;
    public static final Class7702 field17651;
    public static final Class7702 field17652;
    public static final Class7702 field17653;
    public static final Class7702 field17654;
    public static final Class7702 field17655;
    public static final Class7702 field17656;
    public static final Class7702 field17657;
    public static final Class7702 field17658;
    public static final Class7702 field17659;
    public static final Class7702 field17660;
    public static final Class7702 field17661;
    public static final Class7702 field17662;
    public static final Class7702 field17663;
    public static final Class7702 field17664;
    public static final Class7702 field17665;
    public static final Class7702 field17666;
    public static final Class7702 field17667;
    public static final Class7702 field17668;
    public static final Class7702 field17669;
    public static final Class7702 field17670;
    public static final Class7702 field17671;
    public static final Class7702 field17672;
    public static final Class7702 field17673;
    public static final Class7702 field17674;
    public static final Class7702 field17675;
    public static final Class7702 field17676;
    public static final Class7702 field17677;
    public static final Class7702 field17678;
    public static final Class7702 field17679;
    public static final Class7702 field17680;
    public static final Class7702 field17681;
    public static final Class7702 field17682;
    private static final Class2259 field17683;
    
    public Class3903(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3903.field17564, Direction.NORTH)).method21773(Class3903.field17618, Class107.field333));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    private Class7702 method12004(final Class7096 class7096) {
        final Direction class7097 = class7096.method21772((Class7111<Direction>)Class3903.field17564);
        switch (Class9270.field39751[class7096.method21772(Class3903.field17618).ordinal()]) {
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
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return this.method12004(class7096);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return this.method12004(class7096);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34058);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3440(n, class1849, Class7318.method22434(class7097, class7098)), Class3903.field17683);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3903.field17564, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3903.field17564)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3903.field17564)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3903.field17564, Class3903.field17618);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17619 = Class3833.method11778(2.0, 0.0, 6.0, 4.0, 7.0, 10.0);
        field17620 = Class3833.method11778(12.0, 0.0, 6.0, 14.0, 7.0, 10.0);
        field17621 = Class3833.method11778(2.0, 7.0, 5.0, 4.0, 13.0, 11.0);
        field17622 = Class3833.method11778(12.0, 7.0, 5.0, 14.0, 13.0, 11.0);
        field17623 = Class7698.method24492(Class3903.field17619, Class3903.field17621);
        field17624 = Class7698.method24492(Class3903.field17620, Class3903.field17622);
        field17625 = Class7698.method24492(Class3903.field17623, Class3903.field17624);
        field17626 = Class7698.method24492(Class3903.field17625, Class3833.method11778(4.0, 4.0, 2.0, 12.0, 16.0, 14.0));
        field17627 = Class3833.method11778(6.0, 0.0, 2.0, 10.0, 7.0, 4.0);
        field17628 = Class3833.method11778(6.0, 0.0, 12.0, 10.0, 7.0, 14.0);
        field17629 = Class3833.method11778(5.0, 7.0, 2.0, 11.0, 13.0, 4.0);
        field17630 = Class3833.method11778(5.0, 7.0, 12.0, 11.0, 13.0, 14.0);
        field17631 = Class7698.method24492(Class3903.field17627, Class3903.field17629);
        field17632 = Class7698.method24492(Class3903.field17628, Class3903.field17630);
        field17633 = Class7698.method24492(Class3903.field17631, Class3903.field17632);
        field17634 = Class7698.method24492(Class3903.field17633, Class3833.method11778(2.0, 4.0, 4.0, 14.0, 16.0, 12.0));
        field17635 = Class3833.method11778(2.0, 6.0, 0.0, 4.0, 10.0, 7.0);
        field17636 = Class3833.method11778(12.0, 6.0, 0.0, 14.0, 10.0, 7.0);
        field17637 = Class3833.method11778(2.0, 5.0, 7.0, 4.0, 11.0, 13.0);
        field17638 = Class3833.method11778(12.0, 5.0, 7.0, 14.0, 11.0, 13.0);
        field17639 = Class7698.method24492(Class3903.field17635, Class3903.field17637);
        field17640 = Class7698.method24492(Class3903.field17636, Class3903.field17638);
        field17641 = Class7698.method24492(Class3903.field17639, Class3903.field17640);
        field17642 = Class7698.method24492(Class3903.field17641, Class3833.method11778(4.0, 2.0, 4.0, 12.0, 14.0, 16.0));
        field17643 = Class3833.method11778(2.0, 6.0, 7.0, 4.0, 10.0, 16.0);
        field17644 = Class3833.method11778(12.0, 6.0, 7.0, 14.0, 10.0, 16.0);
        field17645 = Class3833.method11778(2.0, 5.0, 3.0, 4.0, 11.0, 9.0);
        field17646 = Class3833.method11778(12.0, 5.0, 3.0, 14.0, 11.0, 9.0);
        field17647 = Class7698.method24492(Class3903.field17643, Class3903.field17645);
        field17648 = Class7698.method24492(Class3903.field17644, Class3903.field17646);
        field17649 = Class7698.method24492(Class3903.field17647, Class3903.field17648);
        field17650 = Class7698.method24492(Class3903.field17649, Class3833.method11778(4.0, 2.0, 0.0, 12.0, 14.0, 12.0));
        field17651 = Class3833.method11778(7.0, 6.0, 2.0, 16.0, 10.0, 4.0);
        field17652 = Class3833.method11778(7.0, 6.0, 12.0, 16.0, 10.0, 14.0);
        field17653 = Class3833.method11778(3.0, 5.0, 2.0, 9.0, 11.0, 4.0);
        field17654 = Class3833.method11778(3.0, 5.0, 12.0, 9.0, 11.0, 14.0);
        field17655 = Class7698.method24492(Class3903.field17651, Class3903.field17653);
        field17656 = Class7698.method24492(Class3903.field17652, Class3903.field17654);
        field17657 = Class7698.method24492(Class3903.field17655, Class3903.field17656);
        field17658 = Class7698.method24492(Class3903.field17657, Class3833.method11778(0.0, 2.0, 4.0, 12.0, 14.0, 12.0));
        field17659 = Class3833.method11778(0.0, 6.0, 2.0, 9.0, 10.0, 4.0);
        field17660 = Class3833.method11778(0.0, 6.0, 12.0, 9.0, 10.0, 14.0);
        field17661 = Class3833.method11778(7.0, 5.0, 2.0, 13.0, 11.0, 4.0);
        field17662 = Class3833.method11778(7.0, 5.0, 12.0, 13.0, 11.0, 14.0);
        field17663 = Class7698.method24492(Class3903.field17659, Class3903.field17661);
        field17664 = Class7698.method24492(Class3903.field17660, Class3903.field17662);
        field17665 = Class7698.method24492(Class3903.field17663, Class3903.field17664);
        field17666 = Class7698.method24492(Class3903.field17665, Class3833.method11778(4.0, 2.0, 4.0, 16.0, 14.0, 12.0));
        field17667 = Class3833.method11778(2.0, 9.0, 6.0, 4.0, 16.0, 10.0);
        field17668 = Class3833.method11778(12.0, 9.0, 6.0, 14.0, 16.0, 10.0);
        field17669 = Class3833.method11778(2.0, 3.0, 5.0, 4.0, 9.0, 11.0);
        field17670 = Class3833.method11778(12.0, 3.0, 5.0, 14.0, 9.0, 11.0);
        field17671 = Class7698.method24492(Class3903.field17667, Class3903.field17669);
        field17672 = Class7698.method24492(Class3903.field17668, Class3903.field17670);
        field17673 = Class7698.method24492(Class3903.field17671, Class3903.field17672);
        field17674 = Class7698.method24492(Class3903.field17673, Class3833.method11778(4.0, 0.0, 2.0, 12.0, 12.0, 14.0));
        field17675 = Class3833.method11778(6.0, 9.0, 2.0, 10.0, 16.0, 4.0);
        field17676 = Class3833.method11778(6.0, 9.0, 12.0, 10.0, 16.0, 14.0);
        field17677 = Class3833.method11778(5.0, 3.0, 2.0, 11.0, 9.0, 4.0);
        field17678 = Class3833.method11778(5.0, 3.0, 12.0, 11.0, 9.0, 14.0);
        field17679 = Class7698.method24492(Class3903.field17675, Class3903.field17677);
        field17680 = Class7698.method24492(Class3903.field17676, Class3903.field17678);
        field17681 = Class7698.method24492(Class3903.field17679, Class3903.field17680);
        field17682 = Class7698.method24492(Class3903.field17681, Class3833.method11778(2.0, 0.0, 4.0, 14.0, 12.0, 12.0));
        field17683 = new Class2259("container.grindstone_title", new Object[0]);
    }
}
