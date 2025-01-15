package net.minecraft.state;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.util.IStringSerializable;

public class EnumProperty<T extends Enum<T> & IStringSerializable> extends Property<T>
{
    private final ImmutableSet<T> allowedValues;
    private final Map<String, T> nameToValue = Maps.newHashMap();

    protected EnumProperty(String p_i1935_1_, Class<T> p_i1935_2_, Collection<T> p_i1935_3_)
    {
        super(p_i1935_1_, p_i1935_2_);
        this.allowedValues = ImmutableSet.copyOf(p_i1935_3_);

        for (T t : p_i1935_3_)
        {
            String s = ((IStringSerializable)t).getName();

            if (this.nameToValue.containsKey(s))
            {
                throw new IllegalArgumentException("Multiple values have the same name '" + s + "'");
            }

            this.nameToValue.put(s, t);
        }
    }

    public Collection<T> getAllowedValues()
    {
        return this.allowedValues;
    }

    public Optional<T> parseValue(String value)
    {
        return Optional.ofNullable(this.nameToValue.get(value));
    }

    public String getName(T value)
    {
        return ((IStringSerializable)value).getName();
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ instanceof EnumProperty && super.equals(p_equals_1_))
        {
            EnumProperty<?> enumproperty = (EnumProperty)p_equals_1_;
            return this.allowedValues.equals(enumproperty.allowedValues) && this.nameToValue.equals(enumproperty.nameToValue);
        }
        else
        {
            return false;
        }
    }

    public int computeHashCode()
    {
        int i = super.computeHashCode();
        i = 31 * i + this.allowedValues.hashCode();
        i = 31 * i + this.nameToValue.hashCode();
        return i;
    }

    public static <T extends Enum<T> & IStringSerializable> EnumProperty<T> create(String name, Class<T> clazz)
    {
        return create(name, clazz, Predicates.alwaysTrue());
    }

    public static <T extends Enum<T> & IStringSerializable> EnumProperty<T> create(String name, Class<T> clazz, Predicate<T> filter)
    {
        return create(name, clazz, Arrays.<T>stream(clazz.getEnumConstants()).filter(filter).collect(Collectors.toList()));
    }

    public static <T extends Enum<T> & IStringSerializable> EnumProperty<T> create(String name, Class<T> clazz, T... values)
    {
        return create(name, clazz, Lists.newArrayList(values));
    }

    public static <T extends Enum<T> & IStringSerializable> EnumProperty<T> create(String name, Class<T> clazz, Collection<T> values)
    {
        return new EnumProperty<>(name, clazz, values);
    }
}
