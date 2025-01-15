// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.function.Supplier;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class6674<T extends ArgumentType<?>> implements Class6672<T>
{
    private static String[] field26357;
    private final Supplier<T> field26358;
    
    public Class6674(final Supplier<T> field26358) {
        this.field26358 = field26358;
    }
    
    @Override
    public void method20301(final T t, final Class8654 class8654) {
    }
    
    @Override
    public T method20297(final Class8654 class8654) {
        return this.field26358.get();
    }
    
    @Override
    public void method20300(final T t, final JsonObject jsonObject) {
    }
}
