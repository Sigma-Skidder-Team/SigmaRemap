// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1645 implements Runnable
{
    private static String[] field9197;
    public final /* synthetic */ long field9198;
    public final /* synthetic */ long field9199;
    public final /* synthetic */ Class18 field9200;
    public final /* synthetic */ long field9201;
    public final /* synthetic */ Class18 field9202;
    public final /* synthetic */ long field9203;
    
    public Class1645(final long field9198, final long field9199, final Class18 field9200, final long field9201, final Class18 field9202, final long field9203) {
        this.field9198 = field9198;
        this.field9199 = field9199;
        this.field9200 = field9200;
        this.field9201 = field9201;
        this.field9202 = field9202;
        this.field9203 = field9203;
    }
    
    @Override
    public void run() {
        for (long field9198 = this.field9198; field9198 < this.field9199; ++field9198) {
            this.field9200.method159(this.field9201 + field9198, this.field9202.method125(this.field9203 + field9198));
        }
    }
}
