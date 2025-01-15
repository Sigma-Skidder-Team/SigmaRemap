// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;

public final class Class9414
{
    private static String[] field40391;
    private static final int field40392 = 8192;
    private final byte[] field40393;
    private final ByteBuffer field40394;
    private final FileChannel field40395;
    
    public Class9414(final FileChannel field40395) {
        this.field40393 = new byte[8192];
        this.field40394 = ByteBuffer.wrap(this.field40393);
        this.field40395 = field40395;
    }
    
    public void method35011(long n, final Class1680 class1680, long b) throws IOException {
        if (b < 0L || b > class1680.method5949()) {
            throw new IndexOutOfBoundsException();
        }
        while (b > 0L) {
            try {
                final int n2 = (int)Math.min(8192L, b);
                class1680.method5993(this.field40393, 0, n2);
                this.field40394.limit();
                do {
                    n += this.field40395.write(this.field40394, n);
                } while (this.field40394.hasRemaining());
                b -= n2;
            }
            finally {
                this.field40394.clear();
            }
        }
    }
    
    public void method35012(long n, final Class1680 class1680, long b) throws IOException {
        if (b < 0L) {
            throw new IndexOutOfBoundsException();
        }
        while (b > 0L) {
            try {
                this.field40394.limit();
                if (this.field40395.read(this.field40394, n) == -1) {
                    throw new EOFException();
                }
                final int position = this.field40394.position();
                class1680.method6003(this.field40393, 0, position);
                n += position;
                b -= position;
            }
            finally {
                this.field40394.clear();
            }
        }
    }
}
