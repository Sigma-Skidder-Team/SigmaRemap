// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;

public class Class7839
{
    private static String[] field32093;
    
    private Class7839() {
    }
    
    public static byte[] method25324(final byte[][] array) {
        int n = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i].length;
        }
        return method25325(array, n);
    }
    
    public static byte[] method25325(final byte[][] array, final int capacity) {
        if (array.length == 0) {
            return new byte[0];
        }
        if (array.length != 1) {
            final ByteBuffer allocate = ByteBuffer.allocate(capacity);
            for (int length = array.length, i = 0; i < length; ++i) {
                allocate.put(array[i]);
            }
            return allocate.array();
        }
        return array[0];
    }
}
