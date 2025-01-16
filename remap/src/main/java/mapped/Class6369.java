// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public abstract class Class6369 extends Class6368
{
    public final Class6368[] field25475;
    private final Class6373 field25476;
    
    public Class6369(final Class6368[] field25475, final Class122[] array) {
        super(array);
        this.field25475 = field25475;
        this.field25476 = this.method19020(field25475);
    }
    
    @Override
    public void method19015(final Class7790 class7790) {
        super.method19015(class7790);
        if (this.field25475.length == 0) {
            class7790.method25014("Empty children list");
        }
        for (int i = 0; i < this.field25475.length; ++i) {
            this.field25475[i].method19015(class7790.method25015(".entry[" + i + "]"));
        }
    }
    
    public abstract Class6373 method19020(final Class6373[] p0);
    
    @Override
    public final boolean method19016(final Class7529 class7529, final Consumer<Class7182> consumer) {
        return this.method19019(class7529) && this.field25476.method19016(class7529, consumer);
    }
    
    public static <T extends Class6369> Class6530<T> method19021(final ResourceLocation class1932, final Class<T> clazz, final Class9303<T> class1933) {
        return (Class6530<T>)new Class6531(class1932, clazz, class1933);
    }
}
