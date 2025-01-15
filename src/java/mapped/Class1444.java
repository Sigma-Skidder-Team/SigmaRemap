// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1444 implements Runnable
{
    private static String[] field7994;
    public final /* synthetic */ int field7995;
    public final /* synthetic */ int field7996;
    public final /* synthetic */ int field7997;
    public final /* synthetic */ float[] field7998;
    public final /* synthetic */ float[] field7999;
    public final /* synthetic */ Class7978 field8000;
    
    public Class1444(final Class7978 field8000, final int field8001, final int field8002, final int field8003, final float[] field8004, final float[] field8005) {
        this.field8000 = field8000;
        this.field7995 = field8001;
        this.field7996 = field8002;
        this.field7997 = field8003;
        this.field7998 = field8004;
        this.field7999 = field8005;
    }
    
    @Override
    public void run() {
        for (int i = this.field7995; i < this.field7996; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final int n3 = this.field7997 + i;
            this.field7998[n] = this.field7999[n3] * Class7978.method26004(this.field8000)[n];
            this.field7998[n2] = -this.field7999[n3] * Class7978.method26004(this.field8000)[n2];
        }
    }
}
