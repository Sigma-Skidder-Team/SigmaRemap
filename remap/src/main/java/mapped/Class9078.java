// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.FloatBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class Class9078
{
    private static String[] field38435;
    
    public static synchronized ByteBuffer method32715(final int capacity) {
        return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
    }
    
    public static FloatBuffer method32716(final int n) {
        return method32715(n << 2).asFloatBuffer();
    }
}
