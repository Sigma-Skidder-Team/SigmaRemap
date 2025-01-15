// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

public class Class6958 implements Class6959
{
    private static String[] field27235;
    
    @Override
    public Class958 method21371(final Class961 class961, final Class9122 class962) {
        return new Class958(class961, class962);
    }
    
    @Override
    public Class958 method21372(final Class961 class961, final List<Class9122> list) {
        return new Class958(class961, list);
    }
    
    public SocketChannel method21373(final SocketChannel socketChannel, final SelectionKey selectionKey) {
        return socketChannel;
    }
    
    @Override
    public void method21374() {
    }
}
