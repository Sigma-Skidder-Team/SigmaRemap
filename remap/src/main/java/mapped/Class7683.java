// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

import com.mojang.datafixers.util.Pair;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import java.util.List;

public class Class7683 implements Class7684
{
    private static String[] field30513;
    private final List<Class2124> field30514;
    
    public Class7683(final List<Class2124> field30514) {
        this.field30514 = field30514;
    }
    
    public List<Class2124> method24380() {
        return this.field30514;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class7683 && this.field30514.equals(((Class7683)o).field30514));
    }
    
    @Override
    public int hashCode() {
        return this.field30514.hashCode();
    }
    
    @Override
    public Collection<ResourceLocation> method24381() {
        return this.method24380().stream().map((Function<? super Object, ?>)Class2124::method8279).collect((Collector<? super Object, ?, Collection<ResourceLocation>>)Collectors.toSet());
    }
    
    @Override
    public Collection<Class3687> method24382(final Function<ResourceLocation, Class7684> function, final Set<Pair<String, String>> set) {
        return this.method24380().stream().map((Function<? super Object, ?>)Class2124::method8279).distinct().flatMap(class1932 -> function2.apply(class1932).method24382(function2, set2).stream()).collect((Collector<? super Object, ?, Collection<Class3687>>)Collectors.toSet());
    }
    
    @Nullable
    @Override
    public Class6313 method24383(final Class7637 class7637, final Function<Class3687, TextureAtlasSprite> function, final Class2123 class7638, final ResourceLocation class7639) {
        if (!this.method24380().isEmpty()) {
            final Class8765 class7640 = new Class8765();
            for (final Class2124 class7641 : this.method24380()) {
                class7640.method30396(class7637.method24020(class7641.method8279(), class7641), class7641.method8280());
            }
            return class7640.method30397();
        }
        return null;
    }
}
