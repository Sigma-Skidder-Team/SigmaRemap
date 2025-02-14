package mapped;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Class4547<E> extends Class4548<E> implements ListIterator<E> {
   public final Class2357 field21914;
   private int field21916;

   public Class4547(Class2357 var1, int var2) {
      super(var1);
      this.field21914 = var1;
      this.field21916 = var2;
   }

   @Override
   public boolean hasPrevious() {
      return this.field21916 > 0;
   }

   @Override
   public int nextIndex() {
      return this.field21916;
   }

   @Override
   public int previousIndex() {
      return this.field21916 - 1;
   }

   @Override
   public E previous() {
      int var3 = this.field21916 - 1;
      if (var3 >= 0) {
         this.field21916 = var3;
         return (E)this.field21918.get(this.field21917 = var3);
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void set(E var1) {
      if (this.field21917 >= 0) {
         this.field21918.set(this.field21917, var1);
         this.field21914.set(this.field21917, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void add(E var1) {
      int var4 = this.field21916;
      this.field21918.add(var4, var1);
      this.field21914.add(var4, var1);
      this.field21916 = var4 + 1;
      this.field21917 = -1;
   }

   @Override
   public void forEachRemaining(Consumer action) {
      super.forEachRemaining(action);
   }
}
