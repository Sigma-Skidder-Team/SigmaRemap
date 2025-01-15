// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2656 extends Class2466
{
    private static String[] field14772;
    public final /* synthetic */ Class2871 field14773;
    
    public Class2656(final Class2871 field14773) {
        this.field14773 = field14773;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29822(Class5260.field22312);
        if (Class8563.method28792().method23307()) {
            if (intValue == 0) {
                class8699.method29821(Class5260.field22292, 0, (short)(class8699.method29818(Class5260.field22292, 0) | 0x80));
            }
        }
        class8699.method29844(Class5224.class, true, true);
        class8699.method29839();
        Class8563.method28794().method33549().method29950(Class6495.class).method19536(class8699.method29841(), intValue);
    }
}
