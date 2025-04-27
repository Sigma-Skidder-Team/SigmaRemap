// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9263
{
    private static String[] field39733;
    private final Class8771 field39734;
    private final List<Class7478> field39735;
    
    public Class9263(final Class8771 field39734) {
        this.field39735 = Lists.newArrayList();
        this.field39734 = field39734;
    }
    
    public Class9263 method34170(final int n, final Class7635 class7635) {
        this.field39735.add(new Class7478(n, class7635));
        return this;
    }
    
    public Class8771 method34171() {
        this.field39735.stream().map((Function<? super Object, ?>)Class7478::method23108).collect((Collector<? super Object, ?, Set<? super Object>>)Collectors.toSet()).forEach((Consumer<? super Object>)this.field39734::method30456);
        this.field39735.forEach(class7478 -> {
            class7478.method23108();
            final Class7635 class7479;
            this.field39734.method30458(class7479).forEach(class7481 -> class7481.method28442(class7480.method23107(), 0.0f));
            this.field39734.method30457(class7479).method28442(class7478.method23107(), 1.0f);
        });
        return this.field39734;
    }
}
