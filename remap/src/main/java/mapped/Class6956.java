// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.stream.Stream;
import com.google.common.collect.Sets;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.function.Function;
import java.util.Set;

public class Class6956<T> implements Class6952<T>
{
    private final Set<Class7460<T>> field27232;
    private final Function<T, ResourceLocation> field27233;
    
    public Class6956(final Function<T, ResourceLocation> function, final List<Class7460<T>> list) {
        this(function, Sets.newHashSet((Iterable)list));
    }
    
    private Class6956(final Function<T, ResourceLocation> field27233, final Set<Class7460<T>> field27234) {
        this.field27232 = field27234;
        this.field27233 = field27233;
    }
    
    @Override
    public boolean method21340(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21341(final BlockPos class354, final T t, final int n, final Class1955 class355) {
        this.field27232.add(new Class7460<T>(class354, t, n, class355));
    }
    
    @Override
    public boolean method21342(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
        stream.forEach(this.field27232::add);
    }
    
    public Stream<Class7460<T>> method21357() {
        return this.field27232.stream();
    }
    
    public ListNBT method21358(final long n) {
        return Class6953.method21352(this.field27233, this.field27232, n);
    }
    
    public static <T> Class6956<T> method21359(final ListNBT class52, final Function<T, ResourceLocation> function, final Function<ResourceLocation, T> function2) {
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < class52.size(); ++i) {
            final CompoundNBT method346 = class52.method346(i);
            final T apply = function2.apply(new ResourceLocation(method346.getString("i")));
            if (apply != null) {
                hashSet.add(new Class7460(new BlockPos(method346.getInt("x"), method346.getInt("y"), method346.getInt("z")), apply, method346.getInt("t"), Class1955.method7940(method346.getInt("p"))));
            }
        }
        return new Class6956<T>((Function<Object, ResourceLocation>)function, hashSet);
    }
}
