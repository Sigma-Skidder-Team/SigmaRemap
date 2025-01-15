// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1476 implements Runnable
{
    private static String[] field8194;
    public final /* synthetic */ long field8195;
    public final /* synthetic */ long field8196;
    public final /* synthetic */ Class22 field8197;
    public final /* synthetic */ long field8198;
    public final /* synthetic */ Class22 field8199;
    public final /* synthetic */ Class7978 field8200;
    
    public Class1476(final Class7978 field8200, final long field8201, final long field8202, final Class22 field8203, final long field8204, final Class22 field8205) {
        this.field8200 = field8200;
        this.field8195 = field8201;
        this.field8196 = field8202;
        this.field8197 = field8203;
        this.field8198 = field8204;
        this.field8199 = field8205;
    }
    
    @Override
    public void run() {
        for (long field8195 = this.field8195; field8195 < this.field8196; ++field8195) {
            final long n = 2L * field8195;
            final long n2 = n + 1L;
            this.field8197.method169(this.field8198 + field8195, Class7978.method26006(this.field8200).method135(n) * this.field8199.method135(n) - Class7978.method26006(this.field8200).method135(n2) * this.field8199.method135(n2));
        }
    }
}
