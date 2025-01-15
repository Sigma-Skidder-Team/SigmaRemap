// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2603 extends Class2466
{
    private static String[] field14674;
    public final /* synthetic */ Class3029 field14675;
    
    public Class2603(final Class3029 field14675) {
        this.field14675 = field14675;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6634 class8700 = class8699.method29841().method18207(Class6634.class);
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class7562 class8701 = class8699.method29818(Class5260.field22328, 0);
        if (class8701 != null && Class5224.method16343(class8701.method23740())) {
            class8700.method20105().add(intValue);
            return;
        }
        class8700.method20105().remove(intValue);
    }
}
