package mapped;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class Class4552<T> extends AbstractIterator<T> {
   private static String[] field21948;
   private final PeekingIterator<T> field21949;
   private final PeekingIterator<T> field21950;
   private final Comparator<T> field21951;

   public Class4552(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.field21949 = Iterators.peekingIterator(var1);
      this.field21950 = Iterators.peekingIterator(var2);
      this.field21951 = var3;
   }

   public T computeNext() {
      while (this.field21949.hasNext() && this.field21950.hasNext()) {
         int var3 = this.field21951.compare((T)this.field21949.peek(), (T)this.field21950.peek());
         if (var3 == 0) {
            this.field21950.next();
            return (T)this.field21949.next();
         }

         if (var3 >= 0) {
            this.field21950.next();
         } else {
            this.field21949.next();
         }
      }

      return (T)this.endOfData();
   }
}
