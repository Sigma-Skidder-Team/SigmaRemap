// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7036 extends Class7037
{
    private static String[] field27406;
    private final short[] field27407;
    private final int[] field27408;
    private final int field27409;
    private final int field27410;
    
    public Class7036(final int field27410, final int field27411) {
        this.field27407 = new short[2304];
        this.field27408 = new int[2];
        this.field27409 = field27411;
        this.field27410 = field27410;
        for (int i = 0; i < field27411; ++i) {
            this.field27408[i] = (short)i;
        }
    }
    
    public int method21519() {
        return this.field27409;
    }
    
    public int method21520() {
        return this.field27410;
    }
    
    public short[] method21521() {
        return this.field27407;
    }
    
    public int method21522() {
        return this.field27408[0];
    }
    
    @Override
    public void method21523(final int n, final short n2) {
        this.field27407[this.field27408[n]] = n2;
        final int[] field27408 = this.field27408;
        field27408[n] += this.field27409;
    }
    
    @Override
    public void method21524(final int n, final float[] array) {
        int n2 = this.field27408[n];
        float n3;
        for (int i = 0; i < 32; n3 = array[i++], this.field27407[n2] = (short)((n3 <= 32767.0f) ? ((n3 >= -32767.0f) ? n3 : -32767.0f) : 32767.0f), n2 += this.field27409) {}
        this.field27408[n] = n2;
    }
    
    @Override
    public void method21525(final int n) {
    }
    
    @Override
    public void method21526() {
    }
    
    @Override
    public void method21527() {
        for (int i = 0; i < this.field27409; ++i) {
            this.field27408[i] = (short)i;
        }
    }
    
    @Override
    public void method21528() {
    }
}
