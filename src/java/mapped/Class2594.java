// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2594 extends Class2466
{
    private static String[] field14659;
    public final /* synthetic */ Class2883 field14660;
    
    public Class2594(final Class2883 field14660) {
        this.field14660 = field14660;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6562 class8700 = class8699.method29824((Class5260<Class6562>)new Class5284(class8699.method29841().method18207(Class6637.class)));
        final List<Class74> method19892 = class8700.method19892();
        for (int i = 0; i < class8700.method19889().length; ++i) {
            final Class7668 class8701 = class8700.method19889()[i];
            if (class8701 != null) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        for (int l = 0; l < 16; ++l) {
                            final int method19893 = class8701.method24320(l, j, k);
                            if (Class7205.method22105(method19893)) {
                                method19892.add(Class7205.method22106(l + (class8700.method19885() << 4), j + (i << 4), k + (class8700.method19886() << 4), method19893));
                            }
                        }
                    }
                }
            }
        }
        class8699.method29823(Class5260.field22323, class8700.method19892().toArray(new Class74[0]));
    }
}
