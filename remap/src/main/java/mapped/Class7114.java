// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Predicate;
import com.google.common.base.Predicates;
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
        for (final Enum<T> & IStringSerializable enum1 : collection) {
            final String method596 = enum1.getName();
            if (this.field27744.containsKey(method596)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + method596 + "'");
            }
            this.field27744.put(method596, (T)enum1);
        }
    }
    
    @Override
    public Collection<T> getAllowedValues() {
        return this.field27743;
    }
    
    @Override
    public Optional<T> parseValue(final String value) {
        return Optional.ofNullable(this.field27744.get(value));
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
    
    public static <T extends Enum<T> & IStringSerializable> Class7114<T> method21837(final String s, final Class<T> clazz) {
        return method21838(s, clazz, Predicates.alwaysTrue());
    }
    
    public static <T extends Enum<T> & IStringSerializable> Class7114<T> method21838(final String s, final Class<T> clazz, final Predicate<T> predicate) {
        return method21840(s, clazz, Arrays.stream(clazz.getEnumConstants()).filter(predicate).collect((Collector<? super T, ?, Collection<T>>)Collectors.toList()));
    }
    
    public static <T extends Enum<T> & IStringSerializable> Class7114<T> method21839(final String s, final Class<T> clazz, final T... array) {
        return method21840(s, clazz, Lists.newArrayList((Object[])array));
    }
    
    public static <T extends Enum<T> & IStringSerializable> Class7114<T> method21840(final String s, final Class<T> clazz, final Collection<T> collection) {
        return new Class7114<T>(s, clazz, collection);
    }
}
