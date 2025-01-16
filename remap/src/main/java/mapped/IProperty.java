// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Collection;

public interface IProperty<T extends Comparable<T>>
{
    String getName();

    Collection<T> getAllowedValues();
    
    Class<T> getValueClass();
    
    Optional<T> parseValue(final String value);
    
    String getName(final T value);
}
