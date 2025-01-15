// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1384 implements Runnable
{
    private static String[] field7615;
    public final /* synthetic */ long field7616;
    public final /* synthetic */ long field7617;
    public final /* synthetic */ Class17 field7618;
    public final /* synthetic */ boolean field7619;
    public final /* synthetic */ Class7796 field7620;
    
    public Class1384(final Class7796 field7620, final long field7621, final long field7622, final Class17 field7623, final boolean field7624) {
        this.field7620 = field7620;
        this.field7616 = field7621;
        this.field7617 = field7622;
        this.field7618 = field7623;
        this.field7619 = field7624;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7796.method25152(this.field7620), false);
        for (long field7616 = this.field7616; field7616 < this.field7617; ++field7616) {
            final long n = field7616 * Class7796.method25151(this.field7620);
            for (long n2 = 0L; n2 < Class7796.method25154(this.field7620); ++n2) {
                for (long n3 = 0L; n3 < Class7796.method25152(this.field7620); ++n3) {
                    class17.method171(n3, this.field7618.method137(n + n3 * Class7796.method25153(this.field7620) + n2));
                }
                Class7796.method25148(this.field7620).method18037(class17, this.field7619);
                for (long n4 = 0L; n4 < Class7796.method25152(this.field7620); ++n4) {
                    this.field7618.method171(n + n4 * Class7796.method25153(this.field7620) + n2, class17.method137(n4));
                }
            }
        }
    }
}
