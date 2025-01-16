// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nonnull;

public class Class93<T> extends Class92<T>
{
    private final ResourceLocation field251;
    private T field252;
    
    public Class93(final String s) {
        this.field251 = new ResourceLocation(s);
    }
    
    @Override
    public <V extends T> V method557(final int n, final ResourceLocation class1932, final V field252) {
        if (this.field251.equals(class1932)) {
            this.field252 = field252;
        }
        return super.method557(n, class1932, field252);
    }
    
    @Override
    public int getId(final T t) {
        final int method504 = super.getId(t);
        return (method504 != -1) ? method504 : super.getId(this.field252);
    }
    
    @Nonnull
    @Override
    public ResourceLocation getKey(final T t) {
        final ResourceLocation method503 = super.getKey(t);
        return (method503 != null) ? method503 : this.field251;
    }
    
    @Nonnull
    @Override
    public T getOrDefault(final ResourceLocation class1932) {
        final T method505 = super.getOrDefault(class1932);
        return (method505 != null) ? method505 : this.field252;
    }
    
    @Nonnull
    @Override
    public T method499(final int n) {
        final T method499 = super.method499(n);
        return (method499 != null) ? method499 : this.field252;
    }
    
    @Nonnull
    @Override
    public T method508(final Random random) {
        final T method508 = super.method508(random);
        return (method508 != null) ? method508 : this.field252;
    }
    
    public ResourceLocation method560() {
        return this.field251;
    }
}
