// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2605 extends Class2466
{
    public final /* synthetic */ Class2950 field14678;
    
    public Class2605(final Class2950 field14678) {
        this.field14678 = field14678;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final short shortValue = class8699.method29818(Class5260.field22292, 0);
        if (shortValue == 1) {
            final Class74 class8700 = class8699.method29818(Class5260.field22322, 0);
            if (class8700 != null) {
                if (!class8700.method418("EntityId")) {
                    final Class74 class8701 = new Class74("SpawnData");
                    class8701.method420(new Class71("id", "AreaEffectCloud"));
                    class8700.method420(class8701);
                }
                else {
                    final String s = (String)class8700.method419("EntityId").method374();
                    final Class74 class8702 = new Class74("SpawnData");
                    class8702.method420(new Class71("id", s));
                    class8700.method420(class8702);
                }
            }
        }
        if (shortValue == 2) {
            Class8563.method28794().method33549().method29950(Class6482.class).method19509(class8699.method29841(), class8699.method29818(Class5260.field22318, 0), class8699.method29818(Class5260.field22322, 0));
            class8699.method29839();
        }
    }
}
