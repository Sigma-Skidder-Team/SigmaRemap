package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SortedArraySet<T> extends AbstractSet<T> {
   private final Comparator<T> comparator;
   private T[] storage;
   private int maxIndex;

   private SortedArraySet(int var1, Comparator<T> var2) {
      this.comparator = var2;
      if (var1 >= 0) {
         this.storage = cast(new Object[var1]);
      } else {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      }
   }

   public static <T extends Comparable<T>> SortedArraySet<T> newSet(int var0) {
      return new SortedArraySet<T>(var0, Comparator.<T>naturalOrder());
   }

   private static <T> T[] cast(Object[] var0) {
      return (T[])var0;
   }

   private int binarySearch(T var1) {
      return Arrays.binarySearch(this.storage, 0, this.maxIndex, var1, this.comparator);
   }

   private static int func_226179_b_(int var0) {
      return -var0 - 1;
   }

   @Override
   public boolean add(T var1) {
      int var4 = this.binarySearch((T)var1);
      if (var4 < 0) {
         int var5 = func_226179_b_(var4);
         this.func_226176_a_((T)var1, var5);
         return true;
      } else {
         return false;
      }
   }

   private void func_226181_c_(int var1) {
      if (var1 > this.storage.length) {
         if (this.storage == ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            if (var1 < 10) {
               var1 = 10;
            }
         } else {
            var1 = (int)Math.max(Math.min((long)this.storage.length + (long)(this.storage.length >> 1), 2147483639L), (long)var1);
         }

         Object[] var4 = new Object[var1];
         System.arraycopy(this.storage, 0, var4, 0, this.maxIndex);
         this.storage = (T[]) cast(var4);
      }
   }

   private void func_226176_a_(T var1, int var2) {
      this.func_226181_c_(this.maxIndex + 1);
      if (var2 != this.maxIndex) {
         System.arraycopy(this.storage, var2, this.storage, var2 + 1, this.maxIndex - var2);
      }

      this.storage[var2] = (T)var1;
      this.maxIndex++;
   }

   private void func_226183_d_(int var1) {
      this.maxIndex--;
      if (var1 != this.maxIndex) {
         System.arraycopy(this.storage, var1 + 1, this.storage, var1, this.maxIndex - var1);
      }

      this.storage[this.maxIndex] = null;
   }

   private T func_226184_e_(int var1) {
      return this.storage[var1];
   }

   public T func_226175_a_(T var1) {
      int var4 = this.binarySearch((T)var1);
      if (var4 < 0) {
         this.func_226176_a_((T)var1, func_226179_b_(var4));
         return (T)var1;
      } else {
         return this.func_226184_e_(var4);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int var4 = this.binarySearch((T)var1);
      if (var4 < 0) {
         return false;
      } else {
         this.func_226183_d_(var4);
         return true;
      }
   }

   public T getSmallest() {
      return this.func_226184_e_(0);
   }

   public boolean contains(Object var1) {
      int var4 = this.binarySearch((T)var1);
      return var4 >= 0;
   }

   public @NotNull Iterator<T> iterator() {
      return new Itr();
   }

   public int size() {
      return this.maxIndex;
   }

   public Object @NotNull [] toArray() {
      return this.storage.clone();
   }

   public <U> U @NotNull [] toArray(U[] p_toArray_1_) {
      if (p_toArray_1_.length < this.maxIndex)
      {
         return (U[])(Arrays.copyOf(this.storage, this.maxIndex, p_toArray_1_.getClass()));
      }
      else
      {
         System.arraycopy(this.storage, 0, p_toArray_1_, 0, this.maxIndex);

         if (p_toArray_1_.length > this.maxIndex)
         {
            p_toArray_1_[this.maxIndex] = null;
         }

         return p_toArray_1_;
      }
   }

   public void clear() {
      Arrays.fill(this.storage, 0, this.maxIndex, (Object)null);
      this.maxIndex = 0;
   }

   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_)
      {
         return true;
      }
      else
      {
         if (p_equals_1_ instanceof SortedArraySet)
         {
            SortedArraySet<?> sortedarrayset = (SortedArraySet)p_equals_1_;

            if (this.comparator.equals(sortedarrayset.comparator))
            {
               return this.maxIndex == sortedarrayset.maxIndex && Arrays.equals(this.storage, sortedarrayset.storage);
            }
         }

         return super.equals(p_equals_1_);
      }
   }

   class Itr implements Iterator<T> {
      private int field_226186_b_;
      private int field_226187_c_;

      private Itr() {

      }

      public boolean hasNext() {
         return this.field_226186_b_ < SortedArraySet.this.maxIndex;
      }

      public T next() {
         if (this.field_226186_b_ >= SortedArraySet.this.maxIndex)
         {
            throw new NoSuchElementException();
         }
         else
         {
            this.field_226187_c_ = this.field_226186_b_++;
            return (T) SortedArraySet.this.storage[this.field_226187_c_];
         }
      }

      @Override
      public void remove() {
         if (this.field_226187_c_ == -1)
         {
            throw new IllegalStateException();
         }
         else
         {
            SortedArraySet.this.func_226183_d_(this.field_226187_c_);
            --this.field_226186_b_;
            this.field_226187_c_ = -1;
         }
      }
   }
}
