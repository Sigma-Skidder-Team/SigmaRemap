// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1609 implements Runnable
{
    private static String[] field8980;
    public final /* synthetic */ long field8981;
    public final /* synthetic */ long field8982;
    public final /* synthetic */ Class16 field8983;
    public final /* synthetic */ long field8984;
    public final /* synthetic */ Class16 field8985;
    public final /* synthetic */ long field8986;
    
    public Class1609(final long field8981, final long field8982, final Class16 field8983, final long field8984, final Class16 field8985, final long field8986) {
        this.field8981 = field8981;
        this.field8982 = field8982;
        this.field8983 = field8983;
        this.field8984 = field8984;
        this.field8985 = field8985;
        this.field8986 = field8986;
    }
    
    @Override
    public void run() {
        for (long field8981 = this.field8981; field8981 < this.field8982; ++field8981) {
            this.field8983.method163(this.field8984 + field8981, this.field8985.method129(this.field8986 + field8981));
        }
    }
}
