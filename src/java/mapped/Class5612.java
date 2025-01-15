// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5612 extends Class5611
{
    private static String[] field22983;
    public final /* synthetic */ Class5085 field22984;
    
    public Class5612(final Class5085 field22984, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field22984 = field22984;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Class5085.method15890(this.field22984, (Class5085.method15891(this.field22984) + 1) % this.field22984.field21934.length);
        this.method16925(Class5085.method15892(this.field22984));
        if (Class5085.method15893(this.field22984).equals(Class271.field1471)) {
            Class5085.method15894(this.field22984).method16917(Class5085.method15891(this.field22984) != 0);
            Class5085.method15894(this.field22984).method16925(Class5085.method15895(this.field22984));
        }
    }
}
