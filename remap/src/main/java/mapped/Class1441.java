// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1441 implements Runnable
{
    private static String[] field7976;
    public final /* synthetic */ long field7977;
    public final /* synthetic */ long field7978;
    public final /* synthetic */ Class22 field7979;
    public final /* synthetic */ Class22 field7980;
    public final /* synthetic */ long field7981;
    public final /* synthetic */ Class6362 field7982;
    
    public Class1441(final Class6362 field7982, final long field7983, final long field7984, final Class22 field7985, final Class22 field7986, final long field7987) {
        this.field7982 = field7982;
        this.field7977 = field7983;
        this.field7978 = field7984;
        this.field7979 = field7985;
        this.field7980 = field7986;
        this.field7981 = field7987;
    }
    
    @Override
    public void run() {
        for (long field7977 = this.field7977; field7977 < this.field7978; ++field7977) {
            final long n = field7977 * Class6362.method19005(this.field7982);
            for (long n2 = 0L; n2 < Class6362.method19006(this.field7982); ++n2) {
                Class8601.method29152(this.field7979, n + n2 * Class6362.method19007(this.field7982), this.field7980, field7977 * Class6362.method19006(this.field7982) * this.field7981 + n2 * this.field7981, Class6362.method19008(this.field7982));
                Class6362.method19000(this.field7982).method25940(this.field7980, field7977 * Class6362.method19006(this.field7982) * this.field7981 + n2 * this.field7981);
            }
        }
    }
}
