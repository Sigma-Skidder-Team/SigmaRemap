// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5667 extends Class5611
{
    private static String[] field23082;
    public final /* synthetic */ Class5087 field23083;
    
    public Class5667(final Class5087 field23083, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23083 = field23083;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        final int n = Class5087.method15942().indexOf(this.method16924()) + 1;
        final Class5078 class5078 = new Class5078(this.field23083, Class5087.method15943(this.field23083), this.field23083);
        if (n != Class5087.method15943(this.field23083).field28688 || Class5087.method15943(this.field23083).field28687.equals(Class271.field1472)) {
            class5078.method15722(n);
        }
        class5078.method15721(14);
        Realms.setScreen(class5078);
    }
}
