// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1603 implements Runnable
{
    private static String[] field8953;
    public final /* synthetic */ long field8954;
    public final /* synthetic */ long field8955;
    public final /* synthetic */ float[] field8956;
    public final /* synthetic */ int field8957;
    public final /* synthetic */ Class14 field8958;
    public final /* synthetic */ long field8959;
    
    public Class1603(final long field8954, final long field8955, final float[] field8956, final int field8957, final Class14 field8958, final long field8959) {
        this.field8954 = field8954;
        this.field8955 = field8955;
        this.field8956 = field8956;
        this.field8957 = field8957;
        this.field8958 = field8958;
        this.field8959 = field8959;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2];
        for (long field8954 = this.field8954; field8954 < this.field8955; ++field8954) {
            array[0] = this.field8956[2 * (this.field8957 + (int)field8954)];
            array[1] = this.field8956[2 * (this.field8957 + (int)field8954) + 1];
            this.field8958.method197(this.field8959 + field8954, array);
        }
    }
}
