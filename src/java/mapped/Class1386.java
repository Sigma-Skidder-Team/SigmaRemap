// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1386 implements Runnable
{
    private static String[] field7629;
    public final /* synthetic */ long field7630;
    public final /* synthetic */ long field7631;
    public final /* synthetic */ Class22 field7632;
    public final /* synthetic */ long field7633;
    public final /* synthetic */ Class8328 field7634;
    
    public Class1386(final Class8328 field7634, final long field7635, final long field7636, final Class22 field7637, final long field7638) {
        this.field7634 = field7634;
        this.field7630 = field7635;
        this.field7631 = field7636;
        this.field7632 = field7637;
        this.field7633 = field7638;
    }
    
    @Override
    public void run() {
        for (long field7630 = this.field7630; field7630 < this.field7631; ++field7630) {
            Class8328.method27759(this.field7634).method25928(this.field7632, field7630 * this.field7633);
        }
    }
}
