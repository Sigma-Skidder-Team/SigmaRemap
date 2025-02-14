package mapped;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class Class4553<T> extends AbstractIterator<T> {
   private static String[] field21952;
   private final PeekingIterator<T> field21953;
   private final PeekingIterator<T> field21954;
   private final Comparator<T> field21955;

   public Class4553(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.field21953 = Iterators.peekingIterator(var1);
      this.field21954 = Iterators.peekingIterator(var2);
      this.field21955 = var3;
   }

   public T computeNext() {
      boolean var3 = !this.field21953.hasNext();
      boolean var4 = !this.field21954.hasNext();
      if (var3 && var4) {
         return (T)this.endOfData();
      } else if (!var3) {
         if (!var4) {
            int var5 = this.field21955.compare((T)this.field21953.peek(), (T)this.field21954.peek());
            if (var5 == 0) {
               this.field21954.next();
            }

            return (T)(var5 > 0 ? this.field21954.next() : this.field21953.next());
         } else {
            return (T)this.field21953.next();
         }
      } else {
         return (T)this.field21954.next();
      }
   }
}
