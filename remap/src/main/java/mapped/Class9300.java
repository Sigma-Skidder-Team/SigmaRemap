// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class9300
{
    private int field39900;
    private int field39901;
    private int field39902;
    private int field39903;
    private byte[] field39904;
    
    public static Class9300 method34383(final Class8699 class8699, final boolean b) throws Exception {
        final Class9300 class8700 = new Class9300();
        class8700.method34389(class8699.method29822(Class5260.field22296));
        class8700.method34390(class8699.method29822(Class5260.field22296));
        class8700.method34391(class8699.method29822(Class5260.field22306));
        final int bitCount = Integer.bitCount(class8700.method34386());
        class8700.method34392(bitCount * 10240 + (b ? (bitCount * 2048) : 0) + 256);
        return class8700;
    }
    
    public int method34384() {
        return this.field39900;
    }
    
    public int method34385() {
        return this.field39901;
    }
    
    public int method34386() {
        return this.field39902;
    }
    
    public int method34387() {
        return this.field39903;
    }
    
    public byte[] method34388() {
        return this.field39904;
    }
    
    public void method34389(final int field39900) {
        this.field39900 = field39900;
    }
    
    public void method34390(final int field39901) {
        this.field39901 = field39901;
    }
    
    public void method34391(final int field39902) {
        this.field39902 = field39902;
    }
    
    public void method34392(final int field39903) {
        this.field39903 = field39903;
    }
    
    public void method34393(final byte[] field39904) {
        this.field39904 = field39904;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class9300) {
            final Class9300 class9300 = (Class9300)o;
            return class9300.method34394(this) && this.method34384() == class9300.method34384() && this.method34385() == class9300.method34385() && this.method34386() == class9300.method34386() && this.method34387() == class9300.method34387() && Arrays.equals(this.method34388(), class9300.method34388());
        }
        return false;
    }
    
    public boolean method34394(final Object o) {
        return o instanceof Class9300;
    }
    
    @Override
    public int hashCode() {
        return ((((1 * 59 + this.method34384()) * 59 + this.method34385()) * 59 + this.method34386()) * 59 + this.method34387()) * 59 + Arrays.hashCode(this.method34388());
    }
    
    @Override
    public String toString() {
        return "BulkChunkTranslatorProvider.ChunkBulkSection(x=" + this.method34384() + ", z=" + this.method34385() + ", bitMask=" + this.method34386() + ", length=" + this.method34387() + ", data=" + Arrays.toString(this.method34388()) + ")";
    }
}
