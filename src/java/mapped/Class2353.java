package mapped;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;

public class Class2353<K> implements Class2347<K> {
   private static final Object field16157 = null;
   private K[] field16158;
   private int[] field16159;
   private K[] field16160;
   private int field16161;
   private int field16162;

   public Class2353(int var1) {
      var1 = (int)((float)var1 / 0.8F);
      this.field16158 = (K[])(new Object[var1]);
      this.field16159 = new int[var1];
      this.field16160 = (K[])(new Object[var1]);
   }

   @Override
   public int method9171(K var1) {
      return this.method9271(this.method9277((K)var1, this.method9276((K)var1)));
   }

   @Nullable
   @Override
   public K method9172(int var1) {
      return var1 >= 0 && var1 < this.field16160.length ? this.field16160[var1] : null;
   }

   private int method9271(int var1) {
      return var1 != -1 ? this.field16159[var1] : -1;
   }

   public int method9272(K var1) {
      int var4 = this.method9273();
      this.method9275((K)var1, var4);
      return var4;
   }

   private int method9273() {
      while (this.field16161 < this.field16160.length && this.field16160[this.field16161] != null) {
         this.field16161++;
      }

      return this.field16161;
   }

   private void method9274(int var1) {
      Object[] var4 = this.field16158;
      int[] var5 = this.field16159;
      this.field16158 = (K[])(new Object[var1]);
      this.field16159 = new int[var1];
      this.field16160 = (K[])(new Object[var1]);
      this.field16161 = 0;
      this.field16162 = 0;

      for (int var6 = 0; var6 < var4.length; var6++) {
         if (var4[var6] != null) {
            this.method9275((K)var4[var6], var5[var6]);
         }
      }
   }

   public void method9275(K var1, int var2) {
      int var5 = Math.max(var2, this.field16162 + 1);
      if ((float)var5 >= (float)this.field16158.length * 0.8F) {
         int var6 = this.field16158.length << 1;

         while (var6 < var2) {
            var6 <<= 1;
         }

         this.method9274(var6);
      }

      int var7 = this.method9278(this.method9276((K)var1));
      this.field16158[var7] = (K)var1;
      this.field16159[var7] = var2;
      this.field16160[var2] = (K)var1;
      this.field16162++;
      if (var2 == this.field16161) {
         this.field16161++;
      }
   }

   private int method9276(K var1) {
      return (Class9679.method37819(System.identityHashCode(var1)) & 2147483647) % this.field16158.length;
   }

   private int method9277(K var1, int var2) {
      for (int var5 = var2; var5 < this.field16158.length; var5++) {
         if (this.field16158[var5] == var1) {
            return var5;
         }

         if (this.field16158[var5] == field16157) {
            return -1;
         }
      }

      for (int var6 = 0; var6 < var2; var6++) {
         if (this.field16158[var6] == var1) {
            return var6;
         }

         if (this.field16158[var6] == field16157) {
            return -1;
         }
      }

      return -1;
   }

   private int method9278(int var1) {
      for (int var4 = var1; var4 < this.field16158.length; var4++) {
         if (this.field16158[var4] == field16157) {
            return var4;
         }
      }

      for (int var5 = 0; var5 < var1; var5++) {
         if (this.field16158[var5] == field16157) {
            return var5;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }

   @Override
   public Iterator<K> iterator() {
      return Iterators.filter(Iterators.forArray(this.field16160), Predicates.notNull());
   }

   public void method9279() {
      Arrays.fill(this.field16158, null);
      Arrays.fill(this.field16160, null);
      this.field16161 = 0;
      this.field16162 = 0;
   }

   public int method9280() {
      return this.field16162;
   }
}
