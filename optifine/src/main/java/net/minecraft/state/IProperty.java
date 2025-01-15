package net.minecraft.state;

import java.util.Collection;
import java.util.Optional;

public interface IProperty<T extends Comparable<T>>
{
    String getName();

    Collection<T> getAllowedValues();

    Class<T> getValueClass();

    Optional<T> parseValue(String value);

    String getName(T value);
}
