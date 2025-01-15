// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1466 implements Runnable
{
    private static String[] field8137;
    public final /* synthetic */ int field8138;
    public final /* synthetic */ int field8139;
    public final /* synthetic */ int field8140;
    public final /* synthetic */ int field8141;
    public final /* synthetic */ float[][] field8142;
    public final /* synthetic */ boolean field8143;
    public final /* synthetic */ Class8328 field8144;
    
    public Class1466(final Class8328 field8144, final int field8145, final int field8146, final int field8147, final int field8148, final float[][] field8149, final boolean field8150) {
        this.field8144 = field8144;
        this.field8138 = field8145;
        this.field8139 = field8146;
        this.field8140 = field8147;
        this.field8141 = field8148;
        this.field8142 = field8149;
        this.field8143 = field8150;
    }
    
    @Override
    public void run() {
        if (this.field8138 != 0) {
            if (this.field8139 != 1) {
                for (int i = this.field8140; i < Class8328.method27760(this.field8144); i += this.field8141) {
                    Class8328.method27759(this.field8144).method25949(this.field8142[i], 0, this.field8143);
                }
            }
            else {
                for (int j = this.field8140; j < Class8328.method27760(this.field8144); j += this.field8141) {
                    Class8328.method27759(this.field8144).method25933(this.field8142[j]);
                }
            }
        }
        else if (this.field8139 != -1) {
            for (int k = this.field8140; k < Class8328.method27760(this.field8144); k += this.field8141) {
                Class8328.method27759(this.field8144).method25929(this.field8142[k], this.field8143);
            }
        }
        else {
            for (int l = this.field8140; l < Class8328.method27760(this.field8144); l += this.field8141) {
                Class8328.method27759(this.field8144).method25925(this.field8142[l]);
            }
        }
    }
}
