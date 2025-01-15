// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class Class6095<T extends Class3662<?>> implements Class6096<T>
{
    private static String[] field24731;
    private final Function<Class1932, T> field24732;
    
    public Class6095(final Function<Class1932, T> field24732) {
        this.field24732 = field24732;
    }
    
    @Override
    public T method18179(final Class1932 class1932, final JsonObject jsonObject) {
        return this.field24732.apply(class1932);
    }
    
    @Override
    public T method18180(final Class1932 class1932, final Class8654 class1933) {
        return this.field24732.apply(class1932);
    }
    
    @Override
    public void method18181(final Class8654 class8654, final T t) {
    }
}
