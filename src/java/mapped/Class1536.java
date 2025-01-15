// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1536 implements Runnable
{
    private static String[] field8579;
    public final /* synthetic */ long field8580;
    public final /* synthetic */ long field8581;
    public final /* synthetic */ Class12 field8582;
    public final /* synthetic */ long field8583;
    public final /* synthetic */ byte[] field8584;
    public final /* synthetic */ int field8585;
    
    public Class1536(final long field8580, final long field8581, final Class12 field8582, final long field8583, final byte[] field8584, final int field8585) {
        this.field8580 = field8580;
        this.field8581 = field8581;
        this.field8582 = field8582;
        this.field8583 = field8583;
        this.field8584 = field8584;
        this.field8585 = field8585;
    }
    
    @Override
    public void run() {
        for (long field8580 = this.field8580; field8580 < this.field8581; ++field8580) {
            this.field8582.method159(this.field8583 + field8580, this.field8584[this.field8585 + (int)field8580]);
        }
    }
}
