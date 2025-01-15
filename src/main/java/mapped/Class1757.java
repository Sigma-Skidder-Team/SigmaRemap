// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.channels.SocketChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

@Deprecated
public class Class1757 implements Class1754
{
    private static String[] field9773;
    private final ByteChannel field9774;
    
    @Deprecated
    public Class1757(final ByteChannel field9774) {
        this.field9774 = field9774;
    }
    
    @Deprecated
    public Class1757(final Class1754 field9774) {
        this.field9774 = field9774;
    }
    
    @Override
    public int read(final ByteBuffer byteBuffer) throws IOException {
        return this.field9774.read(byteBuffer);
    }
    
    @Override
    public boolean isOpen() {
        return this.field9774.isOpen();
    }
    
    @Override
    public void close() throws IOException {
        this.field9774.close();
    }
    
    @Override
    public int write(final ByteBuffer byteBuffer) throws IOException {
        return this.field9774.write(byteBuffer);
    }
    
    @Override
    public boolean method6207() {
        return this.field9774 instanceof Class1754 && ((Class1754)this.field9774).method6207();
    }
    
    @Override
    public void method6208() throws IOException {
        if (this.field9774 instanceof Class1754) {
            ((Class1754)this.field9774).method6208();
        }
    }
    
    @Override
    public boolean method6209() {
        return this.field9774 instanceof Class1754 && ((Class1754)this.field9774).method6209();
    }
    
    @Override
    public int method6210(final ByteBuffer byteBuffer) throws IOException {
        return (this.field9774 instanceof Class1754) ? ((Class1754)this.field9774).method6210(byteBuffer) : 0;
    }
    
    @Override
    public boolean method6211() {
        if (!(this.field9774 instanceof SocketChannel)) {
            return this.field9774 instanceof Class1754 && ((Class1754)this.field9774).method6211();
        }
        return ((SocketChannel)this.field9774).isBlocking();
    }
}
