// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class447
{
    void method2164();
    
    default void method2267(final Object o) {
        if (o instanceof Class447) {
            ((Class447)o).method2164();
        }
    }
}
