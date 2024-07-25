package remapped;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class class_1548<T> extends AbstractSet<T> {
   private final Comparator<T> field_8178;
   private T[] field_8179;
   private int field_8177;

   private class_1548(int var1, Comparator<T> var2) {
      this.field_8178 = var2;
      if (var1 >= 0) {
         this.field_8179 = (T[])method_7025(new Object[var1]);
      } else {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      }
   }

   public static <T extends Comparable<T>> class_1548<T> method_7021(int var0) {
      return new class_1548<T>(var0, Comparator.<T>naturalOrder());
   }

   private static <T> T[] method_7025(Object[] var0) {
      return (T[])var0;
   }

   private int method_7022(T var1) {
      return Arrays.binarySearch(this.field_8179, 0, this.field_8177, var1, this.field_8178);
   }

   private static int method_7019(int var0) {
      return -var0 - 1;
   }

   @Override
   public boolean add(T var1) {
      int var4 = this.method_7022((T)var1);
      if (var4 < 0) {
         int var5 = method_7019(var4);
         this.method_7031((T)var1, var5);
         return true;
      } else {
         return false;
      }
   }

   private void method_7028(int var1) {
      if (var1 > this.field_8179.length) {
         if (this.field_8179 == ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            if (var1 < 10) {
               var1 = 10;
            }
         } else {
            var1 = (int)Math.max(Math.min((long)this.field_8179.length + (long)(this.field_8179.length >> 1), 2147483639L), (long)var1);
         }

         Object[] var4 = new Object[var1];
         System.arraycopy(this.field_8179, 0, var4, 0, this.field_8177);
         this.field_8179 = (T[])method_7025(var4);
      }
   }

   private void method_7031(T var1, int var2) {
      this.method_7028(this.field_8177 + 1);
      if (var2 != this.field_8177) {
         System.arraycopy(this.field_8179, var2, this.field_8179, var2 + 1, this.field_8177 - var2);
      }

      this.field_8179[var2] = (T)var1;
      this.field_8177++;
   }

   private void method_7032(int var1) {
      this.field_8177--;
      if (var1 != this.field_8177) {
         System.arraycopy(this.field_8179, var1 + 1, this.field_8179, var1, this.field_8177 - var1);
      }

      this.field_8179[this.field_8177] = null;
   }

   private T method_7029(int var1) {
      return this.field_8179[var1];
   }

   public T method_7030(T var1) {
      int var4 = this.method_7022((T)var1);
      if (var4 < 0) {
         this.method_7031((T)var1, method_7019(var4));
         return (T)var1;
      } else {
         return this.method_7029(var4);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int var4 = this.method_7022((T)var1);
      if (var4 < 0) {
         return false;
      } else {
         this.method_7032(var4);
         return true;
      }
   }

   public T method_7024() {
      return this.method_7029(0);
   }

   @Override
   public boolean contains(Object var1) {
      int var4 = this.method_7022((T)var1);
      return var4 >= 0;
   }

   @Override
   public Iterator<T> iterator() {
      return new class_431(this, null);
   }

   @Override
   public int size() {
      return this.field_8177;
   }

   @Override
   public Object[] toArray() {
      return (Object[])this.field_8179.clone();
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length >= this.field_8177) {
         System.arraycopy(this.field_8179, 0, var1, 0, this.field_8177);
         if (var1.length > this.field_8177) {
            var1[this.field_8177] = null;
         }

         return (U[])var1;
      } else {
         return (U[])Arrays.copyOf(this.field_8179, this.field_8177, (Class<? extends T[]>)var1.getClass());
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.field_8179, 0, this.field_8177, null);
      this.field_8177 = 0;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof class_1548) {
            class_1548 var4 = (class_1548)var1;
            if (this.field_8178.equals(var4.field_8178)) {
               return this.field_8177 == var4.field_8177 && Arrays.equals(this.field_8179, var4.field_8179);
            }
         }

         return super.equals(var1);
      }
   }
}
