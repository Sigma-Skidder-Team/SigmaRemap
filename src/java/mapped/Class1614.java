// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1614 implements Runnable
{
    private static String[] field9016;
    public final /* synthetic */ int field9017;
    public final /* synthetic */ int field9018;
    public final /* synthetic */ int field9019;
    public final /* synthetic */ int field9020;
    public final /* synthetic */ int field9021;
    public final /* synthetic */ float[] field9022;
    public final /* synthetic */ Class6362 field9023;
    
    public Class1614(final Class6362 field9023, final int field9024, final int field9025, final int field9026, final int field9027, final int field9028, final float[] field9029) {
        this.field9023 = field9023;
        this.field9017 = field9024;
        this.field9018 = field9025;
        this.field9019 = field9026;
        this.field9020 = field9027;
        this.field9021 = field9028;
        this.field9022 = field9029;
    }
    
    @Override
    public void run() {
        for (int i = this.field9017; i < this.field9018; ++i) {
            final int n = (Class6362.method19003(this.field9023) - i) % Class6362.method19003(this.field9023) * this.field9019;
            final int n2 = i * this.field9019;
            for (int j = 1; j < this.field9020; ++j) {
                final int n3 = n2 + (Class6362.method18998(this.field9023) - j) * this.field9021;
                final int n4 = n + j * this.field9021 + Class6362.method19001(this.field9023);
                final int n5 = n3 + Class6362.method19001(this.field9023);
                final int n6 = n3 + 1;
                this.field9022[n4] = this.field9022[n6];
                this.field9022[n5] = this.field9022[n6];
                this.field9022[n4 + 1] = -this.field9022[n3];
                this.field9022[n5 + 1] = this.field9022[n3];
            }
        }
    }
}
