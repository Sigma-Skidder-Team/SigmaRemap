// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2487 extends Class2466
{
    public final /* synthetic */ Class3057 field14462;
    
    public Class2487(final Class3057 field14462) {
        this.field14462 = field14462;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6562 class8700 = class8699.method29824((Class5260<Class6562>)new Class5282(class8699.method29841().method18207(Class6637.class)));
        for (int i = 0; i < class8700.method19889().length; ++i) {
            final Class7668 class8701 = class8700.method19889()[i];
            if (class8701 != null) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        for (int l = 0; l < 16; ++l) {
                            if (class8701.method24320(l, j, k) == 26) {
                                final Class74 class8702 = new Class74("");
                                class8702.method420(new Class68("color", 14));
                                class8702.method420(new Class68("x", l + (class8700.method19885() << 4)));
                                class8702.method420(new Class68("y", j + (i << 4)));
                                class8702.method420(new Class68("z", k + (class8700.method19886() << 4)));
                                class8702.method420(new Class71("id", "minecraft:bed"));
                                class8700.method19892().add(class8702);
                            }
                        }
                    }
                }
            }
        }
    }
}
