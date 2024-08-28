package mapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class4548<E> implements Iterator<E> {
   public int field21916;
   public int field21917;
   public final Class2357 field21918;
   public final Class2357 field21914;

   public Class4548(Class2357 var1) {
      this.field21914 = var1;
      this.field21916 = 0;
      this.field21917 = -1;
      this.field21918 = (Class2357)var1.clone();
   }

   @Override
   public boolean hasNext() {
      return this.field21916 < this.field21918.size();
   }

   @Override
   public E next() {
      int n = this.field21916;
      if (n < this.field21918.size()) {
         this.field21916 = n + 1;
         this.field21917 = n;
         return (E) this.field21918.get(this.field21917);
      }
      throw new NoSuchElementException();
   }

   @Override
   public void remove() {
      if (this.field21917 >= 0) {
         this.field21918.remove(this.field21917);
         this.field21914.remove(this.field21917);
         this.field21916 = this.field21917;
         this.field21917 = -1;
      } else {
         throw new IllegalStateException();
      }
   }
}
