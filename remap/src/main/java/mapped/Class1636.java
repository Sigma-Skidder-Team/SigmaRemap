// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1636 implements Runnable
{
    private static String[] field9138;
    public final /* synthetic */ int field9139;
    public final /* synthetic */ long field9140;
    public final /* synthetic */ long field9141;
    public final /* synthetic */ long field9142;
    public final /* synthetic */ Class22 field9143;
    public final /* synthetic */ Class22 field9144;
    public final /* synthetic */ Class7978 field9145;
    
    public Class1636(final Class7978 field9145, final int field9146, final long field9147, final long field9148, final long field9149, final Class22 field9150, final Class22 field9151) {
        this.field9145 = field9145;
        this.field9139 = field9146;
        this.field9140 = field9147;
        this.field9141 = field9148;
        this.field9142 = field9149;
        this.field9143 = field9150;
        this.field9144 = field9151;
    }
    
    @Override
    public void run() {
        if (this.field9139 <= 0) {
            for (long field9140 = this.field9140; field9140 < this.field9141; ++field9140) {
                final long n = 2L * field9140;
                final long n2 = n + 1L;
                final long n3 = this.field9142 + n;
                final long n4 = this.field9142 + n2;
                this.field9143.method169(n3, Class7978.method26006(this.field9145).method135(n) * this.field9144.method135(n) + Class7978.method26006(this.field9145).method135(n2) * this.field9144.method135(n2));
                this.field9143.method169(n4, -Class7978.method26006(this.field9145).method135(n2) * this.field9144.method135(n) + Class7978.method26006(this.field9145).method135(n) * this.field9144.method135(n2));
            }
        }
        else {
            for (long field9141 = this.field9140; field9141 < this.field9141; ++field9141) {
                final long n5 = 2L * field9141;
                final long n6 = n5 + 1L;
                final long n7 = this.field9142 + n5;
                final long n8 = this.field9142 + n6;
                this.field9143.method169(n7, Class7978.method26006(this.field9145).method135(n5) * this.field9144.method135(n5) - Class7978.method26006(this.field9145).method135(n6) * this.field9144.method135(n6));
                this.field9143.method169(n8, Class7978.method26006(this.field9145).method135(n6) * this.field9144.method135(n5) + Class7978.method26006(this.field9145).method135(n5) * this.field9144.method135(n6));
            }
        }
    }
}
