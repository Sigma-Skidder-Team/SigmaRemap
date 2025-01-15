// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.ByteBuffer;

public class Class8100
{
    private Class8100() {
        throw new IllegalStateException("Utility class");
    }
    
    public static boolean method26619(final ByteBuffer byteBuffer, final Class958 class958, final ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        final int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read != -1) {
            return read != 0;
        }
        class958.method5520();
        return false;
    }
    
    public static boolean method26620(final ByteBuffer byteBuffer, final Class958 class958, final Class1754 class959) throws IOException {
        byteBuffer.clear();
        final int method6210 = class959.method6210(byteBuffer);
        byteBuffer.flip();
        if (method6210 != -1) {
            return class959.method6209();
        }
        class958.method5520();
        return false;
    }
    
    public static boolean method26621(final Class958 class958, final ByteChannel byteChannel) throws IOException {
        if (class958 != null) {
            ByteBuffer byteBuffer = class958.field5080.peek();
            Class1754 class959 = null;
            if (byteBuffer != null) {
                do {
                    byteChannel.write(byteBuffer);
                    if (byteBuffer.remaining() > 0) {
                        return false;
                    }
                    class958.field5080.poll();
                    byteBuffer = class958.field5080.peek();
                } while (byteBuffer != null);
            }
            else if (byteChannel instanceof Class1754) {
                class959 = (Class1754)byteChannel;
                if (class959.method6207()) {
                    class959.method6208();
                }
            }
            if (class958.field5080.isEmpty()) {
                if (class958.method5490()) {
                    if (class958.method5445() != null) {
                        if (class958.method5445().method33079() != null) {
                            if (class958.method5445().method33079() == Class2091.field12096) {
                                class958.method5518();
                            }
                        }
                    }
                }
            }
            return class959 == null || !((Class1754)byteChannel).method6207();
        }
        return false;
    }
}
