// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;

public class Class169 implements Predicate<BlockState>
{
    public static final Predicate<BlockState> field490;
    private final StateContainer<Block, BlockState> field491;
    private final Map<IProperty<?>, Predicate<Object>> field492;
    
    private Class169(final StateContainer<Block, BlockState> field491) {
        this.field492 = Maps.newHashMap();
        this.field491 = field491;
    }
    
    public static Class169 method766(final Block class3833) {
        return new Class169(class3833.getStateContainer());
    }
    
    @Override
    public boolean test(final BlockState class7096) {
        if (class7096 == null || !class7096.getBlock().equals(this.field491.method32904())) {
            return false;
        }
        if (!this.field492.isEmpty()) {
            for (final Map.Entry entry : this.field492.entrySet()) {
                if (this.method767(class7096, (IProperty<Comparable>)entry.getKey(), (Predicate<Object>)entry.getValue())) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return true;
    }
    
    public <T extends Comparable<T>> boolean method767(final BlockState class7096, final IProperty<T> class7097, final Predicate<Object> predicate) {
        return predicate.test(class7096.get(class7097));
    }
    
    public <V extends Comparable<V>> Class169 method768(final IProperty<V> obj, final Predicate<Object> predicate) {
        if (this.field491.method32905().contains(obj)) {
            this.field492.put(obj, predicate);
            return this;
        }
        throw new IllegalArgumentException(this.field491 + " cannot support property " + obj);
    }
    
    static {
        field490 = (p0 -> true);
    }
}
