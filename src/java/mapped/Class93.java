// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nonnull;

public class Class93<T> extends Class92<T>
{
    private final Class1932 field251;
    private T field252;
    
    public Class93(final String s) {
        this.field251 = new Class1932(s);
    }
    
    @Override
    public <V extends T> V method557(final int n, final Class1932 class1932, final V field252) {
        if (this.field251.equals(class1932)) {
            this.field252 = field252;
        }
        return super.method557(n, class1932, field252);
    }
    
    @Override
    public int method504(final T t) {
        final int method504 = super.method504(t);
        return (method504 != -1) ? method504 : super.method504(this.field252);
    }
    
    @Nonnull
    @Override
    public Class1932 method503(final T t) {
        final Class1932 method503 = super.method503(t);
        return (method503 != null) ? method503 : this.field251;
    }
    
    @Nonnull
    @Override
    public T method505(final Class1932 class1932) {
        final T method505 = super.method505(class1932);
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
    
    public Class1932 method560() {
        return this.field251;
    }
}
