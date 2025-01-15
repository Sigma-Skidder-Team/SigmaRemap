// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1652 implements Runnable
{
    private static String[] field9247;
    public final /* synthetic */ long field9248;
    public final /* synthetic */ long field9249;
    public final /* synthetic */ long field9250;
    public final /* synthetic */ long field9251;
    public final /* synthetic */ long field9252;
    public final /* synthetic */ Class17 field9253;
    public final /* synthetic */ Class6733 field9254;
    
    public Class1652(final Class6733 field9254, final long field9255, final long field9256, final long field9257, final long field9258, final long field9259, final Class17 field9260) {
        this.field9254 = field9254;
        this.field9248 = field9255;
        this.field9249 = field9256;
        this.field9250 = field9257;
        this.field9251 = field9258;
        this.field9252 = field9259;
        this.field9253 = field9260;
    }
    
    @Override
    public void run() {
        for (long field9248 = this.field9248; field9248 < this.field9249; ++field9248) {
            final long n = (Class6733.method20485(this.field9254) - field9248) % Class6733.method20485(this.field9254) * this.field9250;
            final long n2 = field9248 * this.field9250;
            for (long n3 = 1L; n3 < this.field9251; ++n3) {
                final long n4 = n2 + (Class6733.method20482(this.field9254) - n3) * this.field9252;
                final long n5 = n + n3 * this.field9252 + Class6733.method20484(this.field9254);
                final long n6 = n4 + Class6733.method20484(this.field9254);
                final long n7 = n4 + 1L;
                this.field9253.method171(n5, this.field9253.method137(n7));
                this.field9253.method171(n6, this.field9253.method137(n7));
                this.field9253.method171(n5 + 1L, -this.field9253.method137(n4));
                this.field9253.method171(n6 + 1L, this.field9253.method137(n4));
            }
        }
    }
}
