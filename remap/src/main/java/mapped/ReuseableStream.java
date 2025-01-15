// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;
import com.google.common.collect.Lists;
import java.util.stream.Stream;
import java.util.Spliterator;
import java.util.List;

public class ReuseableStream<T>
{
    private final List<T> cachedValues;
    private final Spliterator<T> field_219809_b;
    
    public ReuseableStream(final Stream<T> stream) {
        this.cachedValues = Lists.newArrayList();
        this.field_219809_b = stream.spliterator();
    }
    
    public Stream<T> createStream() {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<T>(Long.MAX_VALUE, 0)
        {
            private int nextIdx;
            public boolean tryAdvance(Consumer<? super T > p_tryAdvance_1_)
            {
                while (true)
                {
                    if (this.nextIdx >= ReuseableStream.this.cachedValues.size())
                    {
                        if (ReuseableStream.this.field_219809_b.tryAdvance(ReuseableStream.this.cachedValues::add))
                        {
                            continue;
                        }

                        return false;
                    }

                    p_tryAdvance_1_.accept(ReuseableStream.this.cachedValues.get(this.nextIdx++));
                    return true;
                }
            }
        }, false);
    }
}
