// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1447 implements Runnable
{
    private static String[] field8015;
    public final /* synthetic */ int field8016;
    public final /* synthetic */ int field8017;
    public final /* synthetic */ int field8018;
    public final /* synthetic */ int field8019;
    public final /* synthetic */ float[][] field8020;
    public final /* synthetic */ boolean field8021;
    public final /* synthetic */ Class8328 field8022;
    
    public Class1447(final Class8328 field8022, final int field8023, final int field8024, final int field8025, final int field8026, final float[][] field8027, final boolean field8028) {
        this.field8022 = field8022;
        this.field8016 = field8023;
        this.field8017 = field8024;
        this.field8018 = field8025;
        this.field8019 = field8026;
        this.field8020 = field8027;
        this.field8021 = field8028;
    }
    
    @Override
    public void run() {
        if (this.field8016 != 0) {
            if (this.field8017 != 1) {
                for (int i = this.field8018; i < Class8328.method27760(this.field8022); i += this.field8019) {
                    Class8328.method27759(this.field8022).method25941(this.field8020[i], this.field8021);
                }
            }
            else {
                for (int j = this.field8018; j < Class8328.method27760(this.field8022); j += this.field8019) {
                    Class8328.method27759(this.field8022).method25933(this.field8020[j]);
                }
            }
        }
        else if (this.field8017 != -1) {
            for (int k = this.field8018; k < Class8328.method27760(this.field8022); k += this.field8019) {
                Class8328.method27759(this.field8022).method25929(this.field8020[k], this.field8021);
            }
        }
        else {
            for (int l = this.field8018; l < Class8328.method27760(this.field8022); l += this.field8019) {
                Class8328.method27759(this.field8022).method25925(this.field8020[l]);
            }
        }
    }
}
