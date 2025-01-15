// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2630 extends Class2466
{
    public final /* synthetic */ Class2913 field14723;
    
    public Class2630(final Class2913 field14723) {
        this.field14723 = field14723;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6636 class8700 = class8699.method29841().method18207(Class6636.class);
        final short shortValue = class8699.method29818(Class5260.field22304, 0);
        if (class8700.method20122() != null) {
            if (class8700.method20122().equals("minecraft:brewing_stand")) {
                if (shortValue >= 4) {
                    class8699.method29821(Class5260.field22304, 0, (short)(shortValue + 1));
                }
            }
        }
    }
}
