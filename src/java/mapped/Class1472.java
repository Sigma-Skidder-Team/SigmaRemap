// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1472 implements Runnable
{
    private static String[] field8170;
    public final /* synthetic */ long field8171;
    public final /* synthetic */ long field8172;
    public final /* synthetic */ Class21 field8173;
    public final /* synthetic */ long field8174;
    public final /* synthetic */ Class21 field8175;
    public final /* synthetic */ long field8176;
    
    public Class1472(final long field8171, final long field8172, final Class21 field8173, final long field8174, final Class21 field8175, final long field8176) {
        this.field8171 = field8171;
        this.field8172 = field8172;
        this.field8173 = field8173;
        this.field8174 = field8174;
        this.field8175 = field8175;
        this.field8176 = field8176;
    }
    
    @Override
    public void run() {
        for (long field8171 = this.field8171; field8171 < this.field8172; ++field8171) {
            this.field8173.method227(this.field8174 + field8171, this.field8175.method222(this.field8176 + field8171));
        }
    }
}
