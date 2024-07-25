package remapped;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;

public class class_6834<K> implements class_3072<K> {
   private static final Object field_35234 = null;
   private K[] field_35235;
   private int[] field_35236;
   private K[] field_35239;
   private int field_35237;
   private int field_35233;

   public class_6834(int var1) {
      var1 = (int)((float)var1 / 0.8F);
      this.field_35235 = (K[])(new Object[var1]);
      this.field_35236 = new int[var1];
      this.field_35239 = (K[])(new Object[var1]);
   }

   @Override
   public int method_14041(K var1) {
      return this.method_31338(this.method_31337((K)var1, this.method_31345((K)var1)));
   }

   @Nullable
   @Override
   public K method_14040(int var1) {
      return var1 >= 0 && var1 < this.field_35239.length ? this.field_35239[var1] : null;
   }

   private int method_31338(int var1) {
      return var1 != -1 ? this.field_35236[var1] : -1;
   }

   public int method_31341(K var1) {
      int var4 = this.method_31344();
      this.method_31342((K)var1, var4);
      return var4;
   }

   private int method_31344() {
      while (this.field_35237 < this.field_35239.length && this.field_35239[this.field_35237] != null) {
         this.field_35237++;
      }

      return this.field_35237;
   }

   private void method_31339(int var1) {
      Object[] var4 = this.field_35235;
      int[] var5 = this.field_35236;
      this.field_35235 = (K[])(new Object[var1]);
      this.field_35236 = new int[var1];
      this.field_35239 = (K[])(new Object[var1]);
      this.field_35237 = 0;
      this.field_35233 = 0;

      for (int var6 = 0; var6 < var4.length; var6++) {
         if (var4[var6] != null) {
            this.method_31342((K)var4[var6], var5[var6]);
         }
      }
   }

   public void method_31342(K var1, int var2) {
      int var5 = Math.max(var2, this.field_35233 + 1);
      if ((float)var5 >= (float)this.field_35235.length * 0.8F) {
         int var6 = this.field_35235.length << 1;

         while (var6 < var2) {
            var6 <<= 1;
         }

         this.method_31339(var6);
      }

      int var7 = this.method_31343(this.method_31345((K)var1));
      this.field_35235[var7] = (K)var1;
      this.field_35236[var7] = var2;
      this.field_35239[var2] = (K)var1;
      this.field_35233++;
      if (var2 == this.field_35237) {
         this.field_35237++;
      }
   }

   private int method_31345(K var1) {
      return (MathHelper.hash(System.identityHashCode(var1)) & 2147483647) % this.field_35235.length;
   }

   private int method_31337(K var1, int var2) {
      for (int var5 = var2; var5 < this.field_35235.length; var5++) {
         if (this.field_35235[var5] == var1) {
            return var5;
         }

         if (this.field_35235[var5] == field_35234) {
            return -1;
         }
      }

      for (int var6 = 0; var6 < var2; var6++) {
         if (this.field_35235[var6] == var1) {
            return var6;
         }

         if (this.field_35235[var6] == field_35234) {
            return -1;
         }
      }

      return -1;
   }

   private int method_31343(int var1) {
      for (int var4 = var1; var4 < this.field_35235.length; var4++) {
         if (this.field_35235[var4] == field_35234) {
            return var4;
         }
      }

      for (int var5 = 0; var5 < var1; var5++) {
         if (this.field_35235[var5] == field_35234) {
            return var5;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }

   @Override
   public Iterator<K> iterator() {
      return Iterators.filter(Iterators.forArray(this.field_35239), Predicates.notNull());
   }

   public void method_31336() {
      Arrays.fill(this.field_35235, null);
      Arrays.fill(this.field_35239, null);
      this.field_35237 = 0;
      this.field_35233 = 0;
   }

   public int method_31346() {
      return this.field_35233;
   }
}
