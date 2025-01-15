// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1307 implements Runnable
{
    private static String[] field7161;
    public final /* synthetic */ int field7162;
    public final /* synthetic */ long field7163;
    public final /* synthetic */ long field7164;
    public final /* synthetic */ long field7165;
    public final /* synthetic */ Class22 field7166;
    public final /* synthetic */ Class22 field7167;
    public final /* synthetic */ Class7978 field7168;
    
    public Class1307(final Class7978 field7168, final int field7169, final long field7170, final long field7171, final long field7172, final Class22 field7173, final Class22 field7174) {
        this.field7168 = field7168;
        this.field7162 = field7169;
        this.field7163 = field7170;
        this.field7164 = field7171;
        this.field7165 = field7172;
        this.field7166 = field7173;
        this.field7167 = field7174;
    }
    
    @Override
    public void run() {
        if (this.field7162 <= 0) {
            for (long field7163 = this.field7163; field7163 < this.field7164; ++field7163) {
                final long n = 2L * field7163;
                final long n2 = n + 1L;
                final long n3 = this.field7165 + n;
                final long n4 = this.field7165 + n2;
                this.field7166.method169(n, this.field7167.method135(n3) * Class7978.method26006(this.field7168).method135(n) + this.field7167.method135(n4) * Class7978.method26006(this.field7168).method135(n2));
                this.field7166.method169(n2, -this.field7167.method135(n3) * Class7978.method26006(this.field7168).method135(n2) + this.field7167.method135(n4) * Class7978.method26006(this.field7168).method135(n));
            }
        }
        else {
            for (long field7164 = this.field7163; field7164 < this.field7164; ++field7164) {
                final long n5 = 2L * field7164;
                final long n6 = n5 + 1L;
                final long n7 = this.field7165 + n5;
                final long n8 = this.field7165 + n6;
                this.field7166.method169(n5, this.field7167.method135(n7) * Class7978.method26006(this.field7168).method135(n5) - this.field7167.method135(n8) * Class7978.method26006(this.field7168).method135(n6));
                this.field7166.method169(n6, this.field7167.method135(n7) * Class7978.method26006(this.field7168).method135(n6) + this.field7167.method135(n8) * Class7978.method26006(this.field7168).method135(n5));
            }
        }
    }
}
