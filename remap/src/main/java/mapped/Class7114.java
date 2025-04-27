// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.IStringSerializable;

public class Class7114<T extends Enum<T> & IStringSerializable> extends Class7110<T>
{
    private final ImmutableSet<T> field27743;
    private final Map<String, T> field27744;
    
    public Class7114(final String s, final Class<T> clazz, final Collection<T> collection) {
        super(s, clazz);
        this.field27744 = Maps.newHashMap();
        this.field27743 = (ImmutableSet<T>)ImmutableSet.copyOf((Collection)collection);
    }
    
    @Override
    public Collection<T> getAllowedValues() {
        return this.field27743;
    }
    
    @Override
    public Optional<T> parseValue(final String value) {
        return Optional.ofNullable(this.field27744.get(value));
    }

    @Override
    public String getName(T value) {
        return "";
    }

    public String method21836(final T t) {
        return t.getName();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class7114 && super.equals(o)) {
            final Class7114 class7114 = (Class7114)o;
            return this.field27743.equals(class7114.field27743) && this.field27744.equals(class7114.field27744);
        }
        return false;
    }
    
    @Override
    public int method21828() {
        return 31 * (31 * super.method21828() + this.field27743.hashCode()) + this.field27744.hashCode();
    }
    
    public static <T extends Enum<T> & IStringSerializable> Class7114<T> method21840(final String s, final Class<T> clazz, final Collection<T> collection) {
        return new Class7114<T>(s, clazz, collection);
    }
}
