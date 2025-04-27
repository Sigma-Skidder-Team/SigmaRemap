// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Comparator;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.AbstractIterator;

public class Class7249<T> extends AbstractIterator<T>
{
    private static String[] field28106;
    private final PeekingIterator<T> field28107;
    private final PeekingIterator<T> field28108;
    private final Comparator<T> field28109;
    
    public Class7249(final Iterator<T> iterator, final Iterator<T> iterator2, final Comparator<T> field28109) {
        this.field28107 = (PeekingIterator<T>)Iterators.peekingIterator((Iterator)iterator);
        this.field28108 = (PeekingIterator<T>)Iterators.peekingIterator((Iterator)iterator2);
        this.field28109 = field28109;
    }
    
    public T computeNext() {
        final boolean b = !this.field28107.hasNext();
        final boolean b2 = !this.field28108.hasNext();
        if (b && b2) {
            return this.endOfData();
        }
        if (b) {
            return this.field28108.next();
        }
        if (!b2) {
            final int compare = this.field28109.compare(this.field28107.peek(), this.field28108.peek());
            if (compare == 0) {
                this.field28108.next();
            }
            return (compare > 0) ? this.field28108.next() : this.field28107.next();
        }
        return this.field28107.next();
    }
}
