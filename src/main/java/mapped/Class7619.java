// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import java.util.UUID;
import java.util.Set;

public interface Class7619
{
    Class8725 method23939();
    
    double method23940();
    
    void method23941(final double p0);
    
    Set<Class7919> method23942(final Class2157 p0);
    
    Set<Class7919> method23943();
    
    boolean method23944(final Class7919 p0);
    
    @Nullable
    Class7919 method23945(final UUID p0);
    
    void method23946(final Class7919 p0);
    
    void method23947(final Class7919 p0);
    
    void method23948(final UUID p0);
    
    void method23949();
    
    double method23950();
    
    default void method23951(final Class7619 class7619) {
        this.method23941(class7619.method23940());
        final Set<Class7919> method23943 = class7619.method23943();
        final Set<Class7919> method23944 = this.method23943();
        final ImmutableSet copy = ImmutableSet.copyOf((Collection)Sets.difference((Set)method23943, (Set)method23944));
        final ImmutableSet copy2 = ImmutableSet.copyOf((Collection)Sets.difference((Set)method23944, (Set)method23943));
        copy.forEach((Consumer)this::method23946);
        copy2.forEach((Consumer)this::method23947);
    }
}
