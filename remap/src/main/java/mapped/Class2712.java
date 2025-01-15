// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2712 extends Class2466
{
    public final /* synthetic */ Class2857 field14878;
    
    public Class2712(final Class2857 field14878) {
        this.field14878 = field14878;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        if (s.equalsIgnoreCase("MC|BOpen")) {
            class8699.method29822(Class5260.field22291);
            class8699.method29823(Class5260.field22312, 0);
        }
        if (s.equalsIgnoreCase("MC|TrList")) {
            class8699.method29824(Class5260.field22296);
            final Short n = class8699.method29824(Class5260.field22292);
            for (short n2 = 0; n2 < n; ++n2) {
                Class8458.method28227(class8699.method29824(Class5260.field22328));
                Class8458.method28227(class8699.method29824(Class5260.field22328));
                if (class8699.method29824(Class5260.field22294)) {
                    Class8458.method28227(class8699.method29824(Class5260.field22328));
                }
                class8699.method29824(Class5260.field22294);
                class8699.method29824(Class5260.field22296);
                class8699.method29824(Class5260.field22296);
            }
        }
    }
}
