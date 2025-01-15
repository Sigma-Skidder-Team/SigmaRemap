// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7280 extends Class7281
{
    private static String[] field28204;
    
    public Class7280() {
        super(128);
    }
    
    public Class7280(final Class7281 class7281, final int n) {
        super(128);
        System.arraycopy(class7281.method22321(), n * 128, this.field28205, 0, 128);
    }
    
    @Override
    public int method22320(final int n, final int n2, final int n3) {
        return n3 << 4 | n;
    }
    
    @Override
    public byte[] method22321() {
        final byte[] array = new byte[2048];
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(this.field28205, 0, array, i * 128, 128);
        }
        return array;
    }
}
