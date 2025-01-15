// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2495 extends Class2466
{
    private static String[] field14475;
    public final /* synthetic */ Class2800 field14476;
    
    public Class2495(final Class2800 field14476) {
        this.field14476 = field14476;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22296, 0);
        final int intValue2 = class8699.method29818(Class5260.field22296, 1);
        final Class6108 method29841 = class8699.method29841();
        final Class9119[] array2;
        final Class9119[] array = array2 = class8699.method29818(Class5260.field22331, 0);
        for (final Class9119 class8700 : array2) {
            final int method29842 = Class7559.method23731(class8700.method33017());
            final Class8322 class8701 = new Class8322((class8700.method33015() >> 4 & 0xF) + (long)(intValue * 16), (long)class8700.method33016(), (class8700.method33015() & 0xF) + (long)(intValue2 * 16));
            if (Class8563.method28792().method23299()) {
                Class8881.method31254(method29841, class8701, method29842);
            }
            class8700.method33020(Class7559.method23733(class8699.method29841(), class8701, method29842));
        }
        if (Class8563.method28792().method23299()) {
            for (final Class9119 class8702 : array) {
                final int method29843 = class8702.method33017();
                final Class8322 class8703 = new Class8322((class8702.method33015() >> 4 & 0xF) + (long)(intValue * 16), (long)class8702.method33016(), (class8702.method33015() & 0xF) + (long)(intValue2 * 16));
                final Class3643 method29844 = Class8881.method31262(method29843);
                if (method29844 != null) {
                    class8702.method33020(method29844.method11202(method29841, class8703, method29843));
                }
            }
            class8699.method29831(Class5215.class, true, true);
            class8699.method29839();
            for (final Class9119 class8704 : array) {
                Class8881.method31250(method29841, new Class8322((class8704.method33015() >> 4 & 0xF) + (long)(intValue * 16), (long)class8704.method33016(), (class8704.method33015() & 0xF) + (long)(intValue2 * 16)));
            }
        }
    }
}
