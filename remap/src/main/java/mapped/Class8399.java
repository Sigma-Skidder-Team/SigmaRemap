// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.function.Consumer;
import com.google.common.collect.Sets;
import java.util.concurrent.Executor;
import java.util.Set;

public class Class8399
{
    private static String[] field34427;
    private final Set<Class9196> field34428;
    private final Class7278 field34429;
    private final Executor field34430;
    
    public Class8399(final Class7278 field34429, final Executor field34430) {
        this.field34428 = Sets.newIdentityHashSet();
        this.field34429 = field34429;
        this.field34430 = field34430;
    }
    
    public Class9196 method28008(final Class269 class269) {
        final Class9196 class270 = new Class9196(this);
        this.field34430.execute(() -> {
            this.field34429.method22313(class271);
            final Class9383 class273;
            if (class273 != null) {
                Class9196.method33653(class272, class273);
                this.field34428.add(class272);
            }
        });
        return class270;
    }
    
    public void method28009(final Consumer<Stream<Class9383>> consumer) {
        this.field34430.execute(() -> consumer2.accept(this.field34428.stream().map(class9196 -> Class9196.method33652(class9196)).filter(Objects::nonNull)));
    }
    
    public void method28010() {
        this.field34430.execute(() -> {
            this.field34428.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Class9196 class9196 = iterator.next();
                Class9196.method33652(class9196).method34886();
                if (!Class9196.method33652(class9196).method34874()) {
                    continue;
                }
                else {
                    class9196.method33650();
                    iterator.remove();
                }
            }
        });
    }
    
    public void method28011() {
        this.field34428.forEach(Class9196::method33650);
        this.field34428.clear();
    }
}
