// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1346 implements Runnable
{
    private static String[] field7363;
    public final /* synthetic */ long field7364;
    public final /* synthetic */ long field7365;
    public final /* synthetic */ Class22 field7366;
    public final /* synthetic */ boolean field7367;
    public final /* synthetic */ Class6362 field7368;
    
    public Class1346(final Class6362 field7368, final long field7369, final long field7370, final Class22 field7371, final boolean field7372) {
        this.field7368 = field7368;
        this.field7364 = field7369;
        this.field7365 = field7370;
        this.field7366 = field7371;
        this.field7367 = field7372;
    }
    
    @Override
    public void run() {
        for (long field7364 = this.field7364; field7364 < this.field7365; ++field7364) {
            final long n = field7364 * Class6362.method19005(this.field7368);
            for (long n2 = 0L; n2 < Class6362.method19006(this.field7368); ++n2) {
                Class6362.method19000(this.field7368).method25932(this.field7366, n + n2 * Class6362.method19007(this.field7368), this.field7367);
            }
        }
    }
}
