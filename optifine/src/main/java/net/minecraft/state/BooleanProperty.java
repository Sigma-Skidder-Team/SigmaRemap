package net.minecraft.state;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class BooleanProperty extends Property<Boolean>
{
    private final ImmutableSet<Boolean> allowedValues = ImmutableSet.of(true, false);

    protected BooleanProperty(String p_i3302_1_)
    {
        super(p_i3302_1_, Boolean.class);
    }

    public Collection<Boolean> getAllowedValues()
    {
        return this.allowedValues;
    }

    public static BooleanProperty create(String name)
    {
        return new BooleanProperty(name);
    }

    public Optional<Boolean> parseValue(String value)
    {
        return !"true".equals(value) && !"false".equals(value) ? Optional.empty() : Optional.of(Boolean.valueOf(value));
    }

    public String getName(Boolean value)
    {
        return value.toString();
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ instanceof BooleanProperty && super.equals(p_equals_1_))
        {
            BooleanProperty booleanproperty = (BooleanProperty)p_equals_1_;
            return this.allowedValues.equals(booleanproperty.allowedValues);
        }
        else
        {
            return false;
        }
    }

    public int computeHashCode()
    {
        return 31 * super.computeHashCode() + this.allowedValues.hashCode();
    }
}
