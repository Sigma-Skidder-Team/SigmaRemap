// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1345 implements Runnable
{
    private static String[] field7358;
    public final /* synthetic */ long field7359;
    public final /* synthetic */ long field7360;
    public final /* synthetic */ Class22 field7361;
    public final /* synthetic */ Class5934 field7362;
    
    public Class1345(final Class5934 field7362, final long field7363, final long field7364, final Class22 field7365) {
        this.field7362 = field7362;
        this.field7359 = field7363;
        this.field7360 = field7364;
        this.field7361 = field7365;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class5934.method17845(this.field7362), false);
        for (long field7359 = this.field7359; field7359 < this.field7360; ++field7359) {
            final long n = field7359 * Class5934.method17837(this.field7362);
            for (long n2 = 0L; n2 < Class5934.method17846(this.field7362); ++n2) {
                for (long n3 = 0L; n3 < Class5934.method17845(this.field7362); ++n3) {
                    class22.method169(n3, this.field7361.method135(n + n3 * Class5934.method17839(this.field7362) + n2));
                }
                Class5934.method17842(this.field7362).method30446(class22);
                for (long n4 = 0L; n4 < Class5934.method17845(this.field7362); ++n4) {
                    this.field7361.method169(n + n4 * Class5934.method17839(this.field7362) + n2, class22.method135(n4));
                }
            }
        }
    }
}
