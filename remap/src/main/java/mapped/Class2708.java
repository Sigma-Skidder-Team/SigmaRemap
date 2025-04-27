// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2708 extends Class2466
{
    public final /* synthetic */ Class3021 field14871;
    
    public Class2708(final Class3021 field14871) {
        this.field14871 = field14871;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6637 class8700 = class8699.method29841().method18207(Class6637.class);
        final Class6562 class8701 = class8699.method29822(new Class5285(class8700));
        class8699.method29823(new Class5280(class8700), class8701);
        final int[] array = new int[256];
        final int[] array2 = new int[256];
        for (int i = 0; i < 16; ++i) {
            final Class7668 class8702 = class8701.method19889()[i];
            if (class8702 != null) {
                int n = 0;
                for (int j = 0; j < class8702.method24327(); ++j) {
                    final int method16325 = Class5213.method16325(class8702.method24328(j));
                    if (n == 0) {
                        if (method16325 != Class9499.method35372()) {
                            if (method16325 != Class9499.method35373()) {
                                if (method16325 != Class9499.method35374()) {
                                    n = 1;
                                }
                            }
                        }
                    }
                    class8702.method24329(j, method16325);
                }
                if (n != 0) {
                    int n2 = 0;
                    for (int k = 0; k < 16; ++k) {
                        for (int l = 0; l < 16; ++l) {
                            for (int n3 = 0; n3 < 16; ++n3) {
                                final int method16326 = class8702.method24322(k, l, n3);
                                if (method16326 != Class9499.method35372()) {
                                    if (method16326 != Class9499.method35373()) {
                                        if (method16326 != Class9499.method35374()) {
                                            ++n2;
                                            array2[k + n3 * 16] = l + i * 16 + 1;
                                        }
                                    }
                                }
                                if (Class7504.field29092.contains(method16326)) {
                                    array[k + n3 * 16] = l + i * 16 + 1;
                                }
                                if (Class8563.method28792().method23310()) {
                                    if (Class7504.field29093.contains(method16326)) {
                                        Class9499.method35375(class8701, class8702, i, k, l, n3);
                                    }
                                }
                            }
                        }
                    }
                    class8702.method24348(n2);
                }
                else {
                    class8702.method24348(0);
                }
            }
        }
        final Class74 class8703 = new Class74("");
        class8703.method420(new Class75("MOTION_BLOCKING", Class9499.method35376(array)));
        class8703.method420(new Class75("WORLD_SURFACE", Class9499.method35376(array2)));
        class8701.method19899(class8703);
        final Class8699 method16327 = class8699.method29836(36);
        method16327.method29823(Class5260.field22312, class8701.method19885());
        method16327.method29823(Class5260.field22312, class8701.method19886());
        int m = class8701.method19887() ? 262143 : 0;
        int i2 = 0;
        for (int n4 = 0; n4 < class8701.method19889().length; ++n4) {
            final Class7668 class8704 = class8701.method19889()[n4];
            if (class8704 != null) {
                if (!class8701.method19887()) {
                    if (class8704.method24345()) {
                        m |= 1 << n4 + 1;
                    }
                }
                i2 |= 1 << n4 + 1;
            }
        }
        method16327.method29823(Class5260.field22312, m);
        method16327.method29823(Class5260.field22312, i2);
        method16327.method29823(Class5260.field22312, 0);
        method16327.method29823(Class5260.field22312, 0);
        if (class8701.method19887()) {
            method16327.method29823(Class5260.field22290, Class9499.method35377());
        }
        for (final Class7668 class8705 : class8701.method19889()) {
            if (class8705 != null && class8705.method24345()) {
                method16327.method29823(Class5260.field22290, this.method9803(class8705.method24338()));
            }
            else if (class8701.method19887()) {
                method16327.method29823(Class5260.field22290, Class9499.method35377());
            }
        }
        if (class8701.method19887()) {
            method16327.method29823(Class5260.field22290, Class9499.method35377());
        }
        for (final Class7668 class8706 : class8701.method19889()) {
            if (class8706 != null) {
                method16327.method29823(Class5260.field22290, this.method9803(class8706.method24336()));
            }
        }
        final Class6639 class8707 = class8699.method29841().method18207(Class6639.class);
        final int abs = Math.abs(class8707.method20157() - class8701.method19885());
        final int abs2 = Math.abs(class8707.method20158() - class8701.method19886());
        Label_1099: {
            if (!class8707.method20155()) {
                if (abs < 64) {
                    if (abs2 < 64) {
                        break Label_1099;
                    }
                }
            }
            final Class8699 method16330 = class8699.method29836(64);
            method16330.method29823(Class5260.field22312, class8701.method19885());
            method16330.method29823(Class5260.field22312, class8701.method19886());
            method16330.method29831(Class5213.class, true, true);
            class8707.method20159(class8701.method19885());
            class8707.method20160(class8701.method19886());
        }
        method16327.method29831(Class5213.class, true, true);
    }
    
    private Byte[] method9803(final byte[] array) {
        final Byte[] array2 = new Byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
}
