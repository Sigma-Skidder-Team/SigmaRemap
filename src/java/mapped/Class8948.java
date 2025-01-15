// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.SortedSet;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public interface Class8948<T>
{
    int method31749(final T p0);
    
    int method31739(final UUID p0);
    
    @Deprecated
    boolean method31740(final UUID p0);
    
    String method31741();
    
    void method31748(final T p0, final ByteBuf p1) throws IllegalArgumentException;
    
    void method31742(final UUID p0, final ByteBuf p1) throws IllegalArgumentException;
    
    Class8254 method31744(final String p0, final Class320 p1, final Class2163 p2);
    
    Class8254 method31745(final String p0, final float p1, final Class320 p2, final Class2163 p3);
    
    SortedSet<Integer> method31746();
}
