// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;

public class Class7411 implements Class7410
{
    private static String[] field28546;
    private final Iterable<? extends Class7410> field28547;
    
    public Class7411(final Iterable<? extends Class7410> field28547) {
        this.field28547 = field28547;
    }
    
    @Override
    public Predicate<BlockState> method22768(final StateContainer<Block, BlockState> class9104) {
        return p1 -> {
            final Object o = Streams.stream((Iterable)this.field28547).map(p1 -> {}).collect(Collectors.toList());
            return list.stream().anyMatch(predicate -> predicate.test(class9105));
        };
    }
}
