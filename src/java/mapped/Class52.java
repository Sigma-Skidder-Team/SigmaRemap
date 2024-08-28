package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArrays;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Class52<T> extends AbstractSet<T> {
   private final Comparator<T> field109;
   private T[] field110;
   private int field111;

   private Class52(int var1, Comparator<T> var2) {
      this.field109 = var2;
      if (var1 >= 0) {
         this.field110 = (T[])method180(new Object[var1]);
      } else {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      }
   }

   public static <T extends Comparable<T>> Class52<T> method179(int var0) {
      return new Class52<T>(var0, Comparator.<T>naturalOrder());
   }

   private static <T> T[] method180(Object[] var0) {
      return (T[])var0;
   }

   private int method181(T var1) {
      return Arrays.binarySearch(this.field110, 0, this.field111, var1, this.field109);
   }

   private static int method182(int var0) {
      return -var0 - 1;
   }

   @Override
   public boolean add(T var1) {
      int var4 = this.method181((T)var1);
      if (var4 < 0) {
         int var5 = method182(var4);
         this.method184((T)var1, var5);
         return true;
      } else {
         return false;
      }
   }

   private void method183(int var1) {
      if (var1 > this.field110.length) {
         if (this.field110 == ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            if (var1 < 10) {
               var1 = 10;
            }
         } else {
            var1 = (int)Math.max(Math.min((long)this.field110.length + (long)(this.field110.length >> 1), 2147483639L), (long)var1);
         }

         Object[] var4 = new Object[var1];
         System.arraycopy(this.field110, 0, var4, 0, this.field111);
         this.field110 = (T[])method180(var4);
      }
   }

   private void method184(T var1, int var2) {
      this.method183(this.field111 + 1);
      if (var2 != this.field111) {
         System.arraycopy(this.field110, var2, this.field110, var2 + 1, this.field111 - var2);
      }

      this.field110[var2] = (T)var1;
      this.field111++;
   }

   private void method185(int var1) {
      this.field111--;
      if (var1 != this.field111) {
         System.arraycopy(this.field110, var1 + 1, this.field110, var1, this.field111 - var1);
      }

      this.field110[this.field111] = null;
   }

   private T method186(int var1) {
      return this.field110[var1];
   }

   public T method187(T var1) {
      int var4 = this.method181((T)var1);
      if (var4 < 0) {
         this.method184((T)var1, method182(var4));
         return (T)var1;
      } else {
         return this.method186(var4);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int var4 = this.method181((T)var1);
      if (var4 < 0) {
         return false;
      } else {
         this.method185(var4);
         return true;
      }
   }

   public T method188() {
      return this.method186(0);
   }

   @Override
   public boolean contains(Object var1) {
      int var4 = this.method181((T)var1);
      return var4 >= 0;
   }

   @Override
   public Iterator<T> iterator() {
      return new Class4539(this);
   }

   @Override
   public int size() {
      return this.field111;
   }

   @Override
   public Object[] toArray() {
      return (Object[])this.field110.clone();
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length >= this.field111) {
         System.arraycopy(this.field110, 0, var1, 0, this.field111);
         if (var1.length > this.field111) {
            var1[this.field111] = null;
         }

         return (U[])var1;
      } else {
         return (U[])Arrays.copyOf(this.field110, this.field111, (Class<? extends T[]>)var1.getClass());
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.field110, 0, this.field111, null);
      this.field111 = 0;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof Class52) {
            Class52 var4 = (Class52)var1;
            if (this.field109.equals(var4.field109)) {
               return this.field111 == var4.field111 && Arrays.equals(this.field110, var4.field110);
            }
         }

         return super.equals(var1);
      }
   }

   // $VF: synthetic method
   public static int method189(Class52 var0) {
      return var0.field111;
   }

   // $VF: synthetic method
   public static Object[] method190(Class52 var0) {
      return var0.field110;
   }

   // $VF: synthetic method
   public static void method191(Class52 var0, int var1) {
      var0.method185(var1);
   }
}
