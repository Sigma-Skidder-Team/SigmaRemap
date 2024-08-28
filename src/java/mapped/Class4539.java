package mapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class4539<T> implements Iterator<T> {
   private static String[] field21882;
   private int field21883;
   private int field21884;
   public final Class52 field21885;

   public Class4539(Class52 var1) {
      this.field21885 = var1;
      this.field21884 = -1;
   }

   @Override
   public boolean hasNext() {
      return this.field21883 < Class52.method189(this.field21885);
   }

   @Override
   public T next() {
      if (this.field21883 < Class52.method189(this.field21885)) {
         this.field21884 = this.field21883++;
         return (T)Class52.method190(this.field21885)[this.field21884];
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field21884 != -1) {
         Class52.method191(this.field21885, this.field21884);
         this.field21883--;
         this.field21884 = -1;
      } else {
         throw new IllegalStateException();
      }
   }
}
