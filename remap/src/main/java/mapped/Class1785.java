// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Stream;

public abstract class Class1785 extends Class1776<Class9430> implements AutoCloseable
{
    private final Class1774 field9901;
    private final String field9902;
    
    public Class1785(final Class1663 class1663, final ResourceLocation class1664, final String field9902) {
        this.field9902 = field9902;
        this.field9901 = new Class1774(class1664);
        class1663.method5851(this.field9901.method6340(), this.field9901);
    }
    
    public abstract Stream<ResourceLocation> method6439();
    
    public TextureAtlasSprite method6440(final ResourceLocation class1932) {
        return this.field9901.method6338(this.method6441(class1932));
    }
    
    private ResourceLocation method6441(final ResourceLocation class1932) {
        return new ResourceLocation(class1932.method7798(), this.field9902 + "/" + class1932.method7797());
    }
    
    public Class9430 method6442(final Class6582 class6582, final IProfiler class6583) {
        class6583.method15295();
        class6583.startSection("stitching");
        final Class9430 method6332 = this.field9901.method6332(class6582, this.method6439().map((Function<? super ResourceLocation, ? extends ResourceLocation>)this::method6441), class6583, 0);
        class6583.endSection();
        class6583.method15296();
        return method6332;
    }
    
    public void method6443(final Class9430 class9430, final Class6582 class9431, final IProfiler class9432) {
        class9432.method15295();
        class9432.startSection("upload");
        this.field9901.method6331(class9430);
        class9432.endSection();
        class9432.method15296();
    }
    
    @Override
    public void close() {
        this.field9901.method6339();
    }
}
