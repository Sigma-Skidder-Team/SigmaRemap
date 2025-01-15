// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class976 implements Runnable
{
    private static String[] field5202;
    public final /* synthetic */ int field5203;
    public final /* synthetic */ long field5204;
    public final /* synthetic */ long field5205;
    public final /* synthetic */ Class22 field5206;
    public final /* synthetic */ Class7978 field5207;
    
    public Class976(final Class7978 field5207, final int field5208, final long field5209, final long field5210, final Class22 field5211) {
        this.field5207 = field5207;
        this.field5203 = field5208;
        this.field5204 = field5209;
        this.field5205 = field5210;
        this.field5206 = field5211;
    }
    
    @Override
    public void run() {
        if (this.field5203 <= 0) {
            for (long field5204 = this.field5204; field5204 < this.field5205; ++field5204) {
                final long n = 2L * field5204;
                final long n2 = n + 1L;
                final float n3 = this.field5206.method135(n) * Class7978.method26007(this.field5207).method135(n2) + this.field5206.method135(n2) * Class7978.method26007(this.field5207).method135(n);
                this.field5206.method169(n, this.field5206.method135(n) * Class7978.method26007(this.field5207).method135(n) - this.field5206.method135(n2) * Class7978.method26007(this.field5207).method135(n2));
                this.field5206.method169(n2, n3);
            }
        }
        else {
            for (long field5205 = this.field5204; field5205 < this.field5205; ++field5205) {
                final long n4 = 2L * field5205;
                final long n5 = n4 + 1L;
                final float n6 = -this.field5206.method135(n4) * Class7978.method26007(this.field5207).method135(n5) + this.field5206.method135(n5) * Class7978.method26007(this.field5207).method135(n4);
                this.field5206.method169(n4, this.field5206.method135(n4) * Class7978.method26007(this.field5207).method135(n4) + this.field5206.method135(n5) * Class7978.method26007(this.field5207).method135(n5));
                this.field5206.method169(n5, n6);
            }
        }
    }
}
