// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;

public class Class8833
{
    private static String[] field37131;
    
    private Class8833() {
    }
    
    public static int method30846(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new IllegalArgumentException();
        }
        final int remaining = byteBuffer.remaining();
        final int remaining2 = byteBuffer2.remaining();
        if (remaining <= remaining2) {
            byteBuffer2.put(byteBuffer);
            return remaining;
        }
        final int min = Math.min(remaining, remaining2);
        byteBuffer.limit();
        byteBuffer2.put(byteBuffer);
        return min;
    }
    
    public static ByteBuffer method30847() {
        return ByteBuffer.allocate(0);
    }
}
