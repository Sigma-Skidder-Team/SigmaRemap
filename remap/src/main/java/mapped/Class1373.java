// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1373 implements Runnable
{
    private static String[] field7538;
    public final /* synthetic */ int field7539;
    public final /* synthetic */ int field7540;
    public final /* synthetic */ int field7541;
    public final /* synthetic */ float[] field7542;
    public final /* synthetic */ int field7543;
    public final /* synthetic */ float[] field7544;
    public final /* synthetic */ Class7978 field7545;
    
    public Class1373(final Class7978 field7545, final int field7546, final int field7547, final int field7548, final float[] field7549, final int field7550, final float[] field7551) {
        this.field7545 = field7545;
        this.field7539 = field7546;
        this.field7540 = field7547;
        this.field7541 = field7548;
        this.field7542 = field7549;
        this.field7543 = field7550;
        this.field7544 = field7551;
    }
    
    @Override
    public void run() {
        if (this.field7539 <= 0) {
            for (int i = this.field7540; i < this.field7541; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                this.field7542[this.field7543 + n] = Class7978.method26004(this.field7545)[n] * this.field7544[n] + Class7978.method26004(this.field7545)[n2] * this.field7544[n2];
                this.field7542[this.field7543 + n2] = -Class7978.method26004(this.field7545)[n2] * this.field7544[n] + Class7978.method26004(this.field7545)[n] * this.field7544[n2];
            }
        }
        else {
            for (int j = this.field7540; j < this.field7541; ++j) {
                final int n3 = 2 * j;
                final int n4 = n3 + 1;
                this.field7542[this.field7543 + n3] = Class7978.method26004(this.field7545)[n3] * this.field7544[n3] - Class7978.method26004(this.field7545)[n4] * this.field7544[n4];
                this.field7542[this.field7543 + n4] = Class7978.method26004(this.field7545)[n4] * this.field7544[n3] + Class7978.method26004(this.field7545)[n3] * this.field7544[n4];
            }
        }
    }
}
