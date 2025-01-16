// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class202 implements Class201
{
    private static String[] field687;
    private static final int field688;
    private static final int field689;
    private static final int field690;
    private static final int field691;
    private static final int field692;
    private static final int field693;
    private static final int field694;
    private static final int field695;
    private static final int field696;
    private static final int field697;
    private static final int field698;
    private static final int field699;
    private static final int field700;
    private static final int field701;
    private static final int field702;
    private static final int field703;
    private static final int[] field704;
    private static final int[] field705;
    private static final int[] field706;
    private static final int[] field707;
    private static final int[] field708;
    private final int field709;
    private int[] field710;
    
    public Class202(final Class9505 class9505, final int field709) {
        this.field710 = Class202.field705;
        if (class9505 != Class9505.field40899) {
            this.field709 = field709;
        }
        else {
            this.field710 = Class202.field704;
            this.field709 = -1;
        }
    }
    
    @Override
    public int method845(final Class6433 class6433, int n) {
        if (this.field709 >= 0) {
            return this.field709;
        }
        final int n2 = (n & 0xF00) >> 8;
        n &= 0xFFFFF0FF;
        if (Class7983.method26038(n) || n == Class202.field696) {
            return n;
        }
        switch (n) {
            case 1: {
                if (n2 > 0) {
                    return (class6433.method19189(3) == 0) ? Class202.field694 : Class202.field695;
                }
                return this.field710[class6433.method19189(this.field710.length)];
            }
            case 2: {
                if (n2 > 0) {
                    return Class202.field693;
                }
                return Class202.field706[class6433.method19189(Class202.field706.length)];
            }
            case 3: {
                if (n2 > 0) {
                    return Class202.field698;
                }
                return Class202.field707[class6433.method19189(Class202.field707.length)];
            }
            case 4: {
                return Class202.field708[class6433.method19189(Class202.field708.length)];
            }
            default: {
                return Class202.field696;
            }
        }
    }
    
    static {
        field688 = Registry.field217.getId(Class7102.field27659);
        field689 = Registry.field217.getId(Class7102.field27634);
        field690 = Registry.field217.getId(Class7102.field27635);
        field691 = Registry.field217.getId(Class7102.field27636);
        field692 = Registry.field217.getId(Class7102.field27644);
        field693 = Registry.field217.getId(Class7102.field27653);
        field694 = Registry.field217.getId(Class7102.field27671);
        field695 = Registry.field217.getId(Class7102.field27670);
        field696 = Registry.field217.getId(Class7102.field27646);
        field697 = Registry.field217.getId(Class7102.field27633);
        field698 = Registry.field217.getId(Class7102.field27664);
        field699 = Registry.field217.getId(Class7102.field27661);
        field700 = Registry.field217.getId(Class7102.field27667);
        field701 = Registry.field217.getId(Class7102.field27638);
        field702 = Registry.field217.getId(Class7102.field27637);
        field703 = Registry.field217.getId(Class7102.field27662);
        field704 = new int[] { Class202.field689, Class202.field691, Class202.field690, Class202.field701, Class202.field697, Class202.field702 };
        field705 = new int[] { Class202.field689, Class202.field689, Class202.field689, Class202.field700, Class202.field700, Class202.field697 };
        field706 = new int[] { Class202.field691, Class202.field699, Class202.field690, Class202.field697, Class202.field688, Class202.field701 };
        field707 = new int[] { Class202.field691, Class202.field690, Class202.field702, Class202.field697 };
        field708 = new int[] { Class202.field692, Class202.field692, Class202.field692, Class202.field703 };
    }
}
