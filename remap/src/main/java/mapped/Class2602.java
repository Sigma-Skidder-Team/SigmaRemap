// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2602 extends Class2466
{
    private static String[] field14672;
    public final /* synthetic */ Class2940 field14673;
    
    public Class2602(final Class2940 field14673) {
        this.field14673 = field14673;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29822(Class5260.field22312);
        class8699.method29827();
        class8699.method29847(8);
        class8699.method29823(Class5260.field22300, -1L);
        class8699.method29823(Class5260.field22289, (Byte)(-1));
        final Class7562 method16342 = Class5224.method16342(class8699.method29841());
        if (Class8563.method28792().method23267()) {
            final Class6634 class8700 = class8699.method29841().method18207(Class6634.class);
            if (method16342 != null && Class5224.method16343(method16342.method23738())) {
                if (intValue == 0) {
                    if (!class8700.method20108()) {
                        class8700.method20115(true);
                        class8700.method20088(new Class7562((short)442, (byte)1, (short)0, null));
                    }
                    class8699.method29839();
                }
            }
            else {
                class8700.method20088(null);
                class8700.method20115(false);
            }
        }
        class8699.method29823(Class5260.field22328, method16342);
        class8699.method29823(Class5260.field22289, (Byte)0);
        class8699.method29823(Class5260.field22289, (Byte)0);
        class8699.method29823(Class5260.field22289, (Byte)0);
    }
}
