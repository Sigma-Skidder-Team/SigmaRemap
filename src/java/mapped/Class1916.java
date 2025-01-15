// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import java.nio.channels.ReadableByteChannel;

public class Class1916 extends Class1915
{
    private final ReadableByteChannel field10415;
    private long field10416;
    private int field10417;
    private int field10418;
    private int field10419;
    
    private Class1916(final ReadableByteChannel field10415) {
        super(null);
        this.field10416 = MemoryUtil.nmemAlloc(128L);
        this.field10417 = 128;
        this.field10415 = field10415;
    }
    
    private void method7586(final int n) throws IOException {
        ByteBuffer byteBuffer = MemoryUtil.memByteBuffer(this.field10416, this.field10417);
        if (n + this.field10419 > this.field10417) {
            this.field10417 = n + this.field10419;
            byteBuffer = MemoryUtil.memRealloc(byteBuffer, this.field10417);
            this.field10416 = MemoryUtil.memAddress(byteBuffer);
        }
        byteBuffer.position();
        while (n + this.field10419 > this.field10418) {
            try {
                if (this.field10415.read(byteBuffer) == -1) {
                    break;
                }
                continue;
            }
            finally {
                this.field10418 = byteBuffer.position();
            }
        }
    }
    
    @Override
    public int method7584(final long n, int n2) throws IOException {
        this.method7586(n2);
        if (n2 + this.field10419 > this.field10418) {
            n2 = this.field10418 - this.field10419;
        }
        MemoryUtil.memCopy(this.field10416 + this.field10419, n, (long)n2);
        this.field10419 += n2;
        return n2;
    }
    
    @Override
    public void method7585(final int n) throws IOException {
        if (n > 0) {
            this.method7586(n);
            if (n + this.field10419 > this.field10418) {
                throw new EOFException("Can't skip past the EOF.");
            }
        }
        if (this.field10419 + n >= 0) {
            this.field10419 += n;
            return;
        }
        throw new IOException("Can't seek before the beginning: " + (this.field10419 + n));
    }
    
    @Override
    public void close() throws IOException {
        MemoryUtil.nmemFree(this.field10416);
        this.field10415.close();
    }
}
