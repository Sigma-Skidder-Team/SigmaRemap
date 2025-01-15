// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1562 implements Runnable
{
    private static String[] field8738;
    public final /* synthetic */ long field8739;
    public final /* synthetic */ long field8740;
    public final /* synthetic */ long field8741;
    public final /* synthetic */ long field8742;
    public final /* synthetic */ long field8743;
    public final /* synthetic */ Class22 field8744;
    public final /* synthetic */ Class6362 field8745;
    
    public Class1562(final Class6362 field8745, final long field8746, final long field8747, final long field8748, final long field8749, final long field8750, final Class22 field8751) {
        this.field8745 = field8745;
        this.field8739 = field8746;
        this.field8740 = field8747;
        this.field8741 = field8748;
        this.field8742 = field8749;
        this.field8743 = field8750;
        this.field8744 = field8751;
    }
    
    @Override
    public void run() {
        for (long field8739 = this.field8739; field8739 < this.field8740; ++field8739) {
            final long n = (Class6362.method19009(this.field8745) - field8739) % Class6362.method19009(this.field8745) * this.field8741;
            final long n2 = field8739 * this.field8741;
            for (long n3 = 1L; n3 < this.field8742; ++n3) {
                final long n4 = n2 + (Class6362.method19006(this.field8745) - n3) * this.field8743;
                final long n5 = n + n3 * this.field8743 + Class6362.method19008(this.field8745);
                final long n6 = n4 + Class6362.method19008(this.field8745);
                final long n7 = n4 + 1L;
                this.field8744.method169(n5, this.field8744.method135(n7));
                this.field8744.method169(n6, this.field8744.method135(n7));
                this.field8744.method169(n5 + 1L, -this.field8744.method135(n4));
                this.field8744.method169(n6 + 1L, this.field8744.method135(n4));
            }
        }
    }
}
