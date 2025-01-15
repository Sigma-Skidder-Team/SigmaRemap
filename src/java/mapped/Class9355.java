// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9355<T>
{
    private static String[] field40134;
    private final Class2201 field40135;
    private final T field40136;
    
    public Class9355(final Class2201 field40135, final T field40136) {
        this.field40135 = field40135;
        this.field40136 = field40136;
    }
    
    public Class2201 method34672() {
        return this.field40135;
    }
    
    public T method34673() {
        return this.field40136;
    }
    
    public static <T> Class9355<T> method34674(final T t) {
        return new Class9355<T>(Class2201.field13400, t);
    }
    
    public static <T> Class9355<T> method34675(final T t) {
        return new Class9355<T>(Class2201.field13401, t);
    }
    
    public static <T> Class9355<T> method34676(final T t) {
        return new Class9355<T>(Class2201.field13402, t);
    }
    
    public static <T> Class9355<T> method34677(final T t) {
        return new Class9355<T>(Class2201.field13403, t);
    }
}
