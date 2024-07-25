package remapped;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class class_6731<T> extends AbstractIterator<T> {
   private static String[] field_34766;
   private final PeekingIterator<T> field_34768;
   private final PeekingIterator<T> field_34767;
   private final Comparator<T> field_34765;

   public class_6731(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.field_34768 = Iterators.peekingIterator(var1);
      this.field_34767 = Iterators.peekingIterator(var2);
      this.field_34765 = var3;
   }

   public T computeNext() {
      while (this.field_34768.hasNext() && this.field_34767.hasNext()) {
         int var3 = this.field_34765.compare((T)this.field_34768.peek(), (T)this.field_34767.peek());
         if (var3 == 0) {
            this.field_34767.next();
            return (T)this.field_34768.next();
         }

         if (var3 >= 0) {
            this.field_34767.next();
         } else {
            this.field_34768.next();
         }
      }

      return (T)this.endOfData();
   }
}
