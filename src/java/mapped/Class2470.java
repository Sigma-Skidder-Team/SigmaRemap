// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class2470 extends Class2466
{
    public final /* synthetic */ Class3006 field14432;
    
    public Class2470(final Class3006 field14432) {
        this.field14432 = field14432;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6637 class8700 = class8699.method29841().method18207(Class6637.class);
        final Class6647 class8701 = class8699.method29841().method18207(Class6647.class);
        final Class5282 class8702 = new Class5282(class8700);
        final Class5285 class8703 = new Class5285(class8700);
        final Class6562 class8704 = class8699.method29822((Class5260<Class6562>)class8702);
        class8699.method29823((Class5260<Class6562>)class8703, class8704);
        for (int i = 0; i < class8704.method19889().length; ++i) {
            final Class7668 class8705 = class8704.method19889()[i];
            if (class8705 != null) {
                for (int j = 0; j < class8705.method24327(); ++j) {
                    class8705.method24329(j, Class7559.method23731(class8705.method24328(j)));
                }
                int n = 0;
                for (int k = 0; k < class8705.method24327(); ++k) {
                    if (class8701.method20192(class8705.method24328(k))) {
                        n = 1;
                        break;
                    }
                }
                int n2 = 0;
                if (Class8563.method28792().method23299()) {
                    if (Class8881.method31256()) {
                        for (int l = 0; l < class8705.method24327(); ++l) {
                            if (Class8881.method31259(class8705.method24328(l))) {
                                n2 = 1;
                                break;
                            }
                        }
                    }
                }
                if (n != 0) {
                    for (int n3 = 0; n3 < 16; ++n3) {
                        for (int n4 = 0; n4 < 16; ++n4) {
                            for (int n5 = 0; n5 < 16; ++n5) {
                                final int method24322 = class8705.method24322(n5, n3, n4);
                                if (class8701.method20192(method24322)) {
                                    class8701.method20190(new Class8322((long)(n5 + (class8704.method19885() << 4)), (long)(n3 + (i << 4)), (long)(n4 + (class8704.method19886() << 4))), method24322);
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) {
                    for (int n6 = 0; n6 < 16; ++n6) {
                        for (int n7 = 0; n7 < 16; ++n7) {
                            for (int n8 = 0; n8 < 16; ++n8) {
                                final int method24323 = class8705.method24322(n8, n6, n7);
                                if (Class8881.method31259(method24323)) {
                                    Class8881.method31253().method19530(class8699.method29841(), n8 + (class8704.method19885() << 4), n6 + (i << 4), n7 + (class8704.method19886() << 4), method24323);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (class8704.method19884()) {
            int n9 = Integer.MIN_VALUE;
            for (int n10 = 0; n10 < 256; ++n10) {
                final int n11 = class8704.method19890()[n10];
                if (!Class7559.method23734().contains(n11)) {
                    if (n11 != 255) {
                        if (n9 != n11) {
                            if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                                Class8563.method28793().method34742().warning("Received invalid biome id " + n11);
                            }
                            n9 = n11;
                        }
                    }
                    class8704.method19890()[n10] = 1;
                }
            }
        }
        final Class6478 class8706 = Class8563.method28794().method33549().method29950(Class6478.class);
        for (final Class74 class8707 : class8704.method19892()) {
            final int method24324 = class8706.method19502(class8699.method29841(), null, class8707, false);
            if (method24324 == -1) {
                continue;
            }
            final int intValue = (int)class8707.method419("x").method374();
            final int intValue2 = (int)class8707.method419("y").method374();
            final int intValue3 = (int)class8707.method419("z").method374();
            final Class8322 class8708 = new Class8322((long)intValue, (long)intValue2, (long)intValue3);
            if (class8701.method20193(class8708)) {
                class8701.method20194(class8708).method18140(method24324);
            }
            class8704.method19889()[intValue2 >> 4].method24319(intValue & 0xF, intValue2 & 0xF, intValue3 & 0xF, method24324);
        }
        if (Class8563.method28792().method23299()) {
            Class8881.method31257(class8699.method29841(), class8704);
            class8699.method29831(Class5215.class, true, true);
            class8699.method29839();
            for (int n12 = 0; n12 < class8704.method19889().length; ++n12) {
                if (class8704.method19889()[n12] != null) {
                    Class8881.method31251(class8699.method29841(), class8704.method19885(), class8704.method19886(), n12);
                }
            }
        }
    }
}
