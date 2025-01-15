// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4151 implements Class4150
{
    private static String[] field18508;
    private final Class4150 field18509;
    private final Class1912 field18510;
    
    public Class4151(final Class4150 field18509, final Class1912 field18510) {
        this.field18509 = field18509;
        this.field18510 = field18510;
    }
    
    @Override
    public Class4150 method12432(final double n, final double n2, final double n3) {
        return this.field18509.method12432(n, n2, n3);
    }
    
    @Override
    public Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        return this.field18509.method12399(n, n2, n3, n4);
    }
    
    @Override
    public Class4150 method12391(final float n, final float n2) {
        return this.field18509.method12391(this.field18510.method7499(n * 16.0f), this.field18510.method7502(n2 * 16.0f));
    }
    
    @Override
    public Class4150 method12433(final int n, final int n2) {
        return this.field18509.method12433(n, n2);
    }
    
    @Override
    public Class4150 method12434(final int n, final int n2) {
        return this.field18509.method12434(n, n2);
    }
    
    @Override
    public Class4150 method12436(final float n, final float n2, final float n3) {
        return this.field18509.method12436(n, n2, n3);
    }
    
    @Override
    public void method12397() {
        this.field18509.method12397();
    }
    
    @Override
    public void method12400(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10, final int n11, final float n12, final float n13, final float n14) {
        this.field18509.method12400(n, n2, n3, n4, n5, n6, n7, this.field18510.method7499(n8 * 16.0f), this.field18510.method7502(n9 * 16.0f), n10, n11, n12, n13, n14);
    }
}
