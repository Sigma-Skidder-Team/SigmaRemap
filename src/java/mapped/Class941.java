// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class941 implements Runnable
{
    private static String[] field4962;
    public final /* synthetic */ int field4963;
    public final /* synthetic */ int field4964;
    public final /* synthetic */ float[] field4965;
    public final /* synthetic */ int field4966;
    public final /* synthetic */ float[] field4967;
    public final /* synthetic */ Class7978 field4968;
    
    public Class941(final Class7978 field4968, final int field4969, final int field4970, final float[] field4971, final int field4972, final float[] field4973) {
        this.field4968 = field4968;
        this.field4963 = field4969;
        this.field4964 = field4970;
        this.field4965 = field4971;
        this.field4966 = field4972;
        this.field4967 = field4973;
    }
    
    @Override
    public void run() {
        for (int i = this.field4963; i < this.field4964; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            this.field4965[this.field4966 + i] = Class7978.method26004(this.field4968)[n] * this.field4967[n] - Class7978.method26004(this.field4968)[n2] * this.field4967[n2];
        }
    }
}
