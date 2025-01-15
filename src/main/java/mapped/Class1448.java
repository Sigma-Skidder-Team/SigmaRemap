// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1448 implements Runnable
{
    private static String[] field8023;
    public final /* synthetic */ long field8024;
    public final /* synthetic */ long field8025;
    public final /* synthetic */ Class22 field8026;
    public final /* synthetic */ boolean field8027;
    public final /* synthetic */ Class6710 field8028;
    
    public Class1448(final Class6710 field8028, final long field8029, final long field8030, final Class22 field8031, final boolean field8032) {
        this.field8028 = field8028;
        this.field8024 = field8029;
        this.field8025 = field8030;
        this.field8026 = field8031;
        this.field8027 = field8032;
    }
    
    @Override
    public void run() {
        for (long field8024 = this.field8024; field8024 < this.field8025; ++field8024) {
            Class6710.method20381(this.field8028).method34188(this.field8026, field8024 * Class6710.method20384(this.field8028), this.field8027);
        }
    }
}
