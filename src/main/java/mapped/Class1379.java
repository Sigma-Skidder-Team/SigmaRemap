// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1379 implements Runnable
{
    private static String[] field7586;
    public final /* synthetic */ long field7587;
    public final /* synthetic */ long field7588;
    public final /* synthetic */ Class22 field7589;
    public final /* synthetic */ Class6362 field7590;
    
    public Class1379(final Class6362 field7590, final long field7591, final long field7592, final Class22 field7593) {
        this.field7590 = field7590;
        this.field7587 = field7591;
        this.field7588 = field7592;
        this.field7589 = field7593;
    }
    
    @Override
    public void run() {
        for (long field7587 = this.field7587; field7587 < this.field7588; ++field7587) {
            final long n = field7587 * Class6362.method19005(this.field7590);
            for (long n2 = 0L; n2 < Class6362.method19006(this.field7590); ++n2) {
                Class6362.method19000(this.field7590).method25928(this.field7589, n + n2 * Class6362.method19007(this.field7590));
            }
        }
    }
}
