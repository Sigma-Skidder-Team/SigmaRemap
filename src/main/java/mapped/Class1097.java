// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1097 implements Runnable
{
    private static String[] field5921;
    public final /* synthetic */ long field5922;
    public final /* synthetic */ long field5923;
    public final /* synthetic */ Class22 field5924;
    public final /* synthetic */ boolean field5925;
    public final /* synthetic */ Class5934 field5926;
    
    public Class1097(final Class5934 field5926, final long field5927, final long field5928, final Class22 field5929, final boolean field5930) {
        this.field5926 = field5926;
        this.field5922 = field5927;
        this.field5923 = field5928;
        this.field5924 = field5929;
        this.field5925 = field5930;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class5934.method17847(this.field5926), false);
        for (long field5922 = this.field5922; field5922 < this.field5923; ++field5922) {
            final long n = field5922 * Class5934.method17849(this.field5926);
            for (long n2 = 0L; n2 < Class5934.method17846(this.field5926); ++n2) {
                for (long n3 = 0L; n3 < Class5934.method17847(this.field5926); ++n3) {
                    class22.method169(n3, this.field5924.method135(n3 * Class5934.method17848(this.field5926) + n + n2));
                }
                Class5934.method17844(this.field5926).method30450(class22, this.field5925);
                for (long n4 = 0L; n4 < Class5934.method17847(this.field5926); ++n4) {
                    this.field5924.method169(n4 * Class5934.method17848(this.field5926) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
