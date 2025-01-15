// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Flushable;
import java.io.Closeable;

public interface Class1676 extends Closeable, Flushable
{
    void method5920(final Class1680 p0, final long p1) throws IOException;
    
    void flush() throws IOException;
    
    Class8020 method5921();
    
    void close() throws IOException;
}
