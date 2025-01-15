// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2669 extends Class2466
{
    private static String[] field14797;
    public final /* synthetic */ Class2808 field14798;
    
    public Class2669(final Class2808 field14798) {
        this.field14798 = field14798;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final float floatValue = class8699.method29822(Class5260.field22302);
        final long longValue = class8699.method29822(Class5260.field22315);
        class8699.method29822(Class5260.field22289).byteValue();
        Class8699 class8700 = class8699;
        Class8699 class8701 = class8699;
        Class8699 class8702 = class8699;
        Class5260<Boolean> class8705;
        Class5260<Boolean> class8704;
        Class5260<Boolean> class8703 = class8704 = (class8705 = Class5260.field22294);
    Label_0089_Outer:
        while (true) {
            final int n;
            while (true) {
                Label_0126: {
                    if ((n & 0x10) == 0x0) {
                        break Label_0126;
                    }
                    if ((n & 0x8000) != 0x0) {
                        break Label_0089;
                    }
                    boolean b2;
                    boolean b = b2 = false;
                    while (true) {
                        Label_0109: {
                            if ((n & 0x8) == 0x0) {
                                break Label_0109;
                            }
                            class8702.method29823(class8704, b2);
                            class8700 = class8699;
                            class8701 = class8699;
                            class8702 = class8699;
                            class8703 = (class8704 = (class8705 = Class5260.field22294));
                            if ((n & 0x40000000) == 0x0) {
                                break Label_0126;
                            }
                            if ((n & 0x8) == 0x0) {
                                continue Label_0089_Outer;
                            }
                            b = (b2 = false);
                        }
                        if ((n & 0x10) == 0x0) {
                            continue;
                        }
                        break;
                    }
                    class8701.method29823(class8703, b);
                    class8700 = class8699;
                    class8701 = class8699;
                    class8702 = class8699;
                    class8703 = (class8704 = (class8705 = Class5260.field22294));
                }
                if ((n & 0x40000000) == 0x0) {
                    continue;
                }
                break;
            }
            if ((n & 0x800000) == 0x0) {
                continue Label_0089_Outer;
            }
            break;
        }
        class8700.method29823(class8705, false);
        class8699.method29823(Class5260.field22302, floatValue);
        class8699.method29823(Class5260.field22315, longValue);
    }
}
