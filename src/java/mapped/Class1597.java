// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1597 implements Runnable
{
    private static String[] field8912;
    public final /* synthetic */ long field8913;
    public final /* synthetic */ long field8914;
    public final /* synthetic */ long field8915;
    public final /* synthetic */ long field8916;
    public final /* synthetic */ Class22 field8917;
    public final /* synthetic */ Class22 field8918;
    public final /* synthetic */ long field8919;
    public final /* synthetic */ Class8328 field8920;
    
    public Class1597(final Class8328 field8920, final long field8921, final long field8922, final long field8923, final long field8924, final Class22 field8925, final Class22 field8926, final long field8927) {
        this.field8920 = field8920;
        this.field8913 = field8921;
        this.field8914 = field8922;
        this.field8915 = field8923;
        this.field8916 = field8924;
        this.field8917 = field8925;
        this.field8918 = field8926;
        this.field8919 = field8927;
    }
    
    @Override
    public void run() {
        for (long field8913 = this.field8913; field8913 < this.field8914; ++field8913) {
            final long n = 2L * field8913;
            for (long n2 = 0L; n2 < this.field8915; ++n2) {
                final long n3 = field8913 * this.field8916 + 2L * n2;
                this.field8917.method171(n3, this.field8918.method135(n2 * this.field8919 + n));
                this.field8917.method171(n3 + 1L, this.field8918.method135(n2 * this.field8919 + n + 1L));
            }
        }
    }
}
