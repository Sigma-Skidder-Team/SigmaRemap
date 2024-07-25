package remapped;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class class_186<T> extends AbstractIterator<T> {
   private static String[] field_623;
   private final PeekingIterator<T> field_622;
   private final PeekingIterator<T> field_621;
   private final Comparator<T> field_624;

   public class_186(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.field_622 = Iterators.peekingIterator(var1);
      this.field_621 = Iterators.peekingIterator(var2);
      this.field_624 = var3;
   }

   public T computeNext() {
      boolean var3 = !this.field_622.hasNext();
      boolean var4 = !this.field_621.hasNext();
      if (var3 && var4) {
         return (T)this.endOfData();
      } else if (!var3) {
         if (!var4) {
            int var5 = this.field_624.compare((T)this.field_622.peek(), (T)this.field_621.peek());
            if (var5 == 0) {
               this.field_621.next();
            }

            return (T)(var5 > 0 ? this.field_621.next() : this.field_622.next());
         } else {
            return (T)this.field_622.next();
         }
      } else {
         return (T)this.field_621.next();
      }
   }
}
