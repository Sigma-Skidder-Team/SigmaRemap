// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class4410<T>
{
    void method13347(final Class8654 p0, final T p1);
    
    T method13346(final Class8654 p0);
    
    default Class8810<T> method13348(final int n) {
        return new Class8810<T>(n, this);
    }
    
    T method13345(final T p0);
}
