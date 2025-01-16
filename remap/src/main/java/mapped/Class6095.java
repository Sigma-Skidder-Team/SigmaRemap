// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class Class6095<T extends IRecipe<?>> implements Class6096<T>
{
    private static String[] field24731;
    private final Function<ResourceLocation, T> field24732;
    
    public Class6095(final Function<ResourceLocation, T> field24732) {
        this.field24732 = field24732;
    }
    
    @Override
    public T method18179(final ResourceLocation class1932, final JsonObject jsonObject) {
        return this.field24732.apply(class1932);
    }
    
    @Override
    public T method18180(final ResourceLocation class1932, final PacketBuffer class1933) {
        return this.field24732.apply(class1932);
    }
    
    @Override
    public void method18181(final PacketBuffer class8654, final T t) {
    }
}
