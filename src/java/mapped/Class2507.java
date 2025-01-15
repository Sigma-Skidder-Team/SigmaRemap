// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2507 extends Class2466
{
    private static String[] field14498;
    public final /* synthetic */ Class2922 field14499;
    
    public Class2507(final Class2922 field14499) {
        this.field14499 = field14499;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        final Class238 method877 = Class238.method877(s);
        int method878 = 0;
        String method879 = s;
        if (method877 != null) {
            method878 = method877.method880().method8014();
            method879 = method877.method879();
        }
        class8699.method29821(Class5260.field22308, 0, method879);
        class8699.method29823(Class5260.field22312, method878);
        if (method877 != null) {
            if (method877.method881()) {
                if (class8699.method29841().method18207(Class6634.class).method20091((int)Math.floor(class8699.method29824(Class5260.field22296) / 8.0), (int)Math.floor(class8699.method29824(Class5260.field22296) / 8.0), (int)Math.floor(class8699.method29824(Class5260.field22296) / 8.0))) {
                    class8699.method29839();
                }
            }
        }
    }
}
