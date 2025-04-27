// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2579 extends Class2466
{
    private static String[] field14630;
    public final /* synthetic */ Class2795 field14631;
    
    public Class2579(final Class2795 field14631) {
        this.field14631 = field14631;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6637 class8700 = class8699.method29841().method18207(Class6637.class);
        final Class6562 class8701 = class8699.method29822(new Class5280(class8700));
        class8699.method29823(new Class5279(class8700), class8701);
        if (class8701.method19887()) {
            final int[] method19890 = class8701.method19890();
            final int[] array = new int[1024];
            if (method19890 != null) {
                for (int i = 0; i < 4; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        array[i << 2 | j] = method19890[(i << 2) + 2 << 4 | (j << 2) + 2];
                    }
                }
                for (int k = 1; k < 64; ++k) {
                    System.arraycopy(array, 0, array, k * 16, 16);
                }
            }
            class8701.method19898(array);
        }
        for (int l = 0; l < 16; ++l) {
            final Class7668 class8702 = class8701.method19889()[l];
            if (class8702 != null) {
                for (int n = 0; n < class8702.method24327(); ++n) {
                    class8702.method24329(n, Class5209.method16320(class8702.method24328(n)));
                }
            }
        }
    }
}
