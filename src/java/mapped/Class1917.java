// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.lwjgl.system.MemoryUtil;
import java.nio.channels.SeekableByteChannel;

public class Class1917 extends Class1915
{
    private static String[] field10420;
    private final SeekableByteChannel field10421;
    
    private Class1917(final SeekableByteChannel field10421) {
        super(null);
        this.field10421 = field10421;
    }
    
    @Override
    public int method7584(final long n, final int n2) throws IOException {
        return this.field10421.read(MemoryUtil.memByteBuffer(n, n2));
    }
    
    @Override
    public void method7585(final int n) throws IOException {
        this.field10421.position(this.field10421.position() + n);
    }
    
    @Override
    public int method7583(final long n) {
        return (super.method7583(n) != 0 && this.field10421.isOpen()) ? 1 : 0;
    }
    
    @Override
    public void close() throws IOException {
        this.field10421.close();
    }
}
