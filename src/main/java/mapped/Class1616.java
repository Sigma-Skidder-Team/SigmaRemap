// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1616 implements Runnable
{
    private static String[] field9025;
    public final /* synthetic */ long field9026;
    public final /* synthetic */ long field9027;
    public final /* synthetic */ double[] field9028;
    public final /* synthetic */ int field9029;
    public final /* synthetic */ Class21 field9030;
    public final /* synthetic */ long field9031;
    
    public Class1616(final long field9026, final long field9027, final double[] field9028, final int field9029, final Class21 field9030, final long field9031) {
        this.field9026 = field9026;
        this.field9027 = field9027;
        this.field9028 = field9028;
        this.field9029 = field9029;
        this.field9030 = field9030;
        this.field9031 = field9031;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2];
        for (long field9026 = this.field9026; field9026 < this.field9027; ++field9026) {
            array[0] = this.field9028[2 * (this.field9029 + (int)field9026)];
            array[1] = this.field9028[2 * (this.field9029 + (int)field9026) + 1];
            this.field9030.method227(this.field9031 + field9026, array);
        }
    }
}
