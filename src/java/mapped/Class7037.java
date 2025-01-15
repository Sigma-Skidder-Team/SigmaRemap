// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class7037
{
    public static final int field27411 = 2304;
    public static final int field27412 = 2;
    
    public abstract void method21523(final int p0, final short p1);
    
    public void method21524(final int n, final float[] array) {
        int i = 0;
        while (i < 32) {
            this.method21523(n, this.method21529(array[i++]));
        }
    }
    
    private final short method21529(final float n) {
        return (short)((n <= 32767.0f) ? ((n >= -32768.0f) ? ((short)n) : -32768) : 32767);
    }
    
    public abstract void method21525(final int p0);
    
    public abstract void method21526();
    
    public abstract void method21527();
    
    public abstract void method21528();
}
