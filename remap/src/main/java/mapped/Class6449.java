// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public class Class6449
{
    private static final BlockPos field25655;
    private static final Class1932[] field25656;
    private static final Class1932[] field25657;
    
    public static void method19302(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final List<Class4473> list, final Random random, final Class5125 class1798) {
        list.add(new Class4519(class1795, class1798.field22076 ? Class6449.field25656[random.nextInt(Class6449.field25656.length)] : Class6449.field25657[random.nextInt(Class6449.field25657.length)], class1796, class1797, class1798.field22076));
    }
    
    static {
        field25655 = new BlockPos(4, 0, 15);
        field25656 = new Class1932[] { new Class1932("shipwreck/with_mast"), new Class1932("shipwreck/sideways_full"), new Class1932("shipwreck/sideways_fronthalf"), new Class1932("shipwreck/sideways_backhalf"), new Class1932("shipwreck/rightsideup_full"), new Class1932("shipwreck/rightsideup_fronthalf"), new Class1932("shipwreck/rightsideup_backhalf"), new Class1932("shipwreck/with_mast_degraded"), new Class1932("shipwreck/rightsideup_full_degraded"), new Class1932("shipwreck/rightsideup_fronthalf_degraded"), new Class1932("shipwreck/rightsideup_backhalf_degraded") };
        field25657 = new Class1932[] { new Class1932("shipwreck/with_mast"), new Class1932("shipwreck/upsidedown_full"), new Class1932("shipwreck/upsidedown_fronthalf"), new Class1932("shipwreck/upsidedown_backhalf"), new Class1932("shipwreck/sideways_full"), new Class1932("shipwreck/sideways_fronthalf"), new Class1932("shipwreck/sideways_backhalf"), new Class1932("shipwreck/rightsideup_full"), new Class1932("shipwreck/rightsideup_fronthalf"), new Class1932("shipwreck/rightsideup_backhalf"), new Class1932("shipwreck/with_mast_degraded"), new Class1932("shipwreck/upsidedown_full_degraded"), new Class1932("shipwreck/upsidedown_fronthalf_degraded"), new Class1932("shipwreck/upsidedown_backhalf_degraded"), new Class1932("shipwreck/sideways_full_degraded"), new Class1932("shipwreck/sideways_fronthalf_degraded"), new Class1932("shipwreck/sideways_backhalf_degraded"), new Class1932("shipwreck/rightsideup_full_degraded"), new Class1932("shipwreck/rightsideup_fronthalf_degraded"), new Class1932("shipwreck/rightsideup_backhalf_degraded") };
    }
}
