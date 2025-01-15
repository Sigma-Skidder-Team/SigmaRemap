// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Comparator;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.AbstractIterator;

public class Class7250<T> extends AbstractIterator<T>
{
    private static String[] field28110;
    private final PeekingIterator<T> field28111;
    private final PeekingIterator<T> field28112;
    private final Comparator<T> field28113;
    
    public Class7250(final Iterator<T> iterator, final Iterator<T> iterator2, final Comparator<T> field28113) {
        this.field28111 = (PeekingIterator<T>)Iterators.peekingIterator((Iterator)iterator);
        this.field28112 = (PeekingIterator<T>)Iterators.peekingIterator((Iterator)iterator2);
        this.field28113 = field28113;
    }
    
    public T computeNext() {
        while (this.field28111.hasNext() && this.field28112.hasNext()) {
            final int compare = this.field28113.compare((T)this.field28111.peek(), (T)this.field28112.peek());
            if (compare == 0) {
                this.field28112.next();
                return (T)this.field28111.next();
            }
            if (compare >= 0) {
                this.field28112.next();
            }
            else {
                this.field28111.next();
            }
        }
        return (T)this.endOfData();
    }
}
