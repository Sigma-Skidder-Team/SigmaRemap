// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

public interface Class6959 extends Class6963
{
    Class958 method21371(final Class961 p0, final Class9122 p1);
    
    Class958 method21372(final Class961 p0, final List<Class9122> p1);
    
    ByteChannel method21375(final SocketChannel p0, final SelectionKey p1) throws IOException;
    
    void method21374();
}
