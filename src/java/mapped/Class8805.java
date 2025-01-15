// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8805
{
    private static String[] field37009;
    private static final long field37010 = 4294967295L;
    
    public static String method30719(final long n) {
        return new String(new char[] { (char)((n >> 10 & 0x1FL) + 96L), (char)((n >> 5 & 0x1FL) + 96L), (char)((n & 0x1FL) + 96L) });
    }
    
    public static long method30720(final long n) {
        long n2;
        if (n != 4294967295L) {
            n2 = n;
        }
        else {
            n2 = -1L;
        }
        return n2;
    }
}
