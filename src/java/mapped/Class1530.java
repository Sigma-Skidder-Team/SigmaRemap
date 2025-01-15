// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1530 implements Runnable
{
    private static String[] field8539;
    public final /* synthetic */ long field8540;
    public final /* synthetic */ long field8541;
    public final /* synthetic */ Class22 field8542;
    public final /* synthetic */ Class5934 field8543;
    
    public Class1530(final Class5934 field8543, final long field8544, final long field8545, final Class22 field8546) {
        this.field8543 = field8543;
        this.field8540 = field8544;
        this.field8541 = field8545;
        this.field8542 = field8546;
    }
    
    @Override
    public void run() {
        for (long field8540 = this.field8540; field8540 < this.field8541; ++field8540) {
            final long n = field8540 * Class5934.method17837(this.field8543);
            for (long n2 = 0L; n2 < Class5934.method17845(this.field8543); ++n2) {
                Class5934.method17840(this.field8543).method30448(this.field8542, n + n2 * Class5934.method17839(this.field8543));
            }
        }
    }
}
