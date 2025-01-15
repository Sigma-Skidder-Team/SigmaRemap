// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1121 implements Runnable
{
    private static String[] field6040;
    public final /* synthetic */ long field6041;
    public final /* synthetic */ int field6042;
    public final /* synthetic */ long field6043;
    public final /* synthetic */ int field6044;
    public final /* synthetic */ Class22 field6045;
    public final /* synthetic */ boolean field6046;
    public final /* synthetic */ Class8328 field6047;
    
    public Class1121(final Class8328 field6047, final long field6048, final int field6049, final long field6050, final int field6051, final Class22 field6052, final boolean field6053) {
        this.field6047 = field6047;
        this.field6041 = field6048;
        this.field6042 = field6049;
        this.field6043 = field6050;
        this.field6044 = field6051;
        this.field6045 = field6052;
        this.field6046 = field6053;
    }
    
    @Override
    public void run() {
        if (this.field6041 != 0L) {
            if (this.field6042 != 1) {
                for (long field6043 = this.field6043; field6043 < Class8328.method27762(this.field6047); field6043 += this.field6044) {
                    Class8328.method27759(this.field6047).method25950(this.field6045, field6043 * Class8328.method27764(this.field6047), this.field6046);
                }
            }
            else {
                for (long field6044 = this.field6043; field6044 < Class8328.method27762(this.field6047); field6044 += this.field6044) {
                    Class8328.method27759(this.field6047).method25936(this.field6045, field6044 * Class8328.method27764(this.field6047));
                }
            }
        }
        else if (this.field6042 != -1) {
            for (long field6045 = this.field6043; field6045 < Class8328.method27762(this.field6047); field6045 += this.field6044) {
                Class8328.method27759(this.field6047).method25932(this.field6045, field6045 * Class8328.method27764(this.field6047), this.field6046);
            }
        }
        else {
            for (long field6046 = this.field6043; field6046 < Class8328.method27762(this.field6047); field6046 += this.field6044) {
                Class8328.method27759(this.field6047).method25928(this.field6045, field6046 * Class8328.method27764(this.field6047));
            }
        }
    }
}
