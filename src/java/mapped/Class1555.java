// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1555 implements Runnable
{
    private static String[] field8694;
    public final /* synthetic */ long field8695;
    public final /* synthetic */ long field8696;
    public final /* synthetic */ long field8697;
    public final /* synthetic */ long field8698;
    public final /* synthetic */ Class22 field8699;
    public final /* synthetic */ boolean field8700;
    public final /* synthetic */ long field8701;
    public final /* synthetic */ Class6362 field8702;
    
    public Class1555(final Class6362 field8702, final long field8703, final long field8704, final long field8705, final long field8706, final Class22 field8707, final boolean field8708, final long field8709) {
        this.field8702 = field8702;
        this.field8695 = field8703;
        this.field8696 = field8704;
        this.field8697 = field8705;
        this.field8698 = field8706;
        this.field8699 = field8707;
        this.field8700 = field8708;
        this.field8701 = field8709;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8695);
        for (long field8696 = this.field8696; field8696 >= this.field8697; --field8696) {
            final long n = field8696 * Class6362.method19005(this.field8702);
            final long n2 = field8696 * this.field8698;
            for (long n3 = Class6362.method19006(this.field8702) - 1L; n3 >= 0L; --n3) {
                Class8601.method29152(this.field8699, n + n3 * Class6362.method19007(this.field8702), class22, 0L, Class6362.method19008(this.field8702));
                Class6362.method19000(this.field8702).method25946(class22, this.field8700);
                Class8601.method29152(class22, 0L, this.field8699, n2 + n3 * this.field8701, this.field8695);
            }
        }
    }
}
