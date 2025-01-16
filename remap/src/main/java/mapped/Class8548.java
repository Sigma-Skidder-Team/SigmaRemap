// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8548
{
    private static String[] field35894;
    private static final ByteNBT[] field35895;
    
    static {
        field35895 = new ByteNBT[256];
        for (int i = 0; i < Class8548.field35895.length; ++i) {
            Class8548.field35895[i] = new ByteNBT((byte)(i - 128), null);
        }
    }
}
