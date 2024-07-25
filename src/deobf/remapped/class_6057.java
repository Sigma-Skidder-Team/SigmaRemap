package remapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.function.LongPredicate;

public abstract class class_6057 {
   private final int field_30986;
   private final LongLinkedOpenHashSet[] field_30988;
   private final Long2ByteMap field_30985;
   private int field_30987;
   private volatile boolean field_30984;

   public class_6057(int var1, int var2, int var3) {
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.field_30986 = var1;
         this.field_30988 = new LongLinkedOpenHashSet[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            this.field_30988[var6] = new class_2595(this, var2, 0.5F, var2);
         }

         this.field_30985 = new class_8041(this, var3, 0.5F, var3);
         this.field_30985.defaultReturnValue((byte)-1);
         this.field_30987 = var1;
      }
   }

   private int method_27699(int var1, int var2) {
      int var5 = var1;
      if (var1 > var2) {
         var5 = var2;
      }

      if (var5 > this.field_30986 - 1) {
         var5 = this.field_30986 - 1;
      }

      return var5;
   }

   private void method_27696(int var1) {
      int var4 = this.field_30987;
      this.field_30987 = var1;

      for (int var5 = var4 + 1; var5 < var1; var5++) {
         if (!this.field_30988[var5].isEmpty()) {
            this.field_30987 = var5;
            break;
         }
      }
   }

   public void method_27690(long var1) {
      int var5 = this.field_30985.get(var1) & 255;
      if (var5 != 255) {
         int var6 = this.method_27698(var1);
         int var7 = this.method_27699(var6, var5);
         this.method_27688(var1, var7, this.field_30986, true);
         this.field_30984 = this.field_30987 < this.field_30986;
      }
   }

   public void method_27694(LongPredicate var1) {
      LongArrayList var4 = new LongArrayList();
      this.field_30985.keySet().forEach(var2 -> {
         if (var1.test(var2)) {
            var4.add(var2);
         }
      });
      var4.forEach(this::method_27690);
   }

   private void method_27688(long var1, int var3, int var4, boolean var5) {
      if (var5) {
         this.field_30985.remove(var1);
      }

      this.field_30988[var3].remove(var1);
      if (this.field_30988[var3].isEmpty() && this.field_30987 == var3) {
         this.method_27696(var4);
      }
   }

   private void method_27704(long var1, int var3, int var4) {
      this.field_30985.put(var1, (byte)var3);
      this.field_30988[var4].add(var1);
      if (this.field_30987 > var4) {
         this.field_30987 = var4;
      }
   }

   public void method_27702(long var1) {
      this.method_27703(var1, var1, this.field_30986 - 1, false);
   }

   public void method_27703(long var1, long var3, int var5, boolean var6) {
      this.method_27686(var1, var3, var5, this.method_27698(var3), this.field_30985.get(var3) & 255, var6);
      this.field_30984 = this.field_30987 < this.field_30986;
   }

   private void method_27686(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.method_27692(var3)) {
         var5 = class_9299.method_42829(var5, 0, this.field_30986 - 1);
         var6 = class_9299.method_42829(var6, 0, this.field_30986 - 1);
         boolean var11;
         if (var7 != 255) {
            var11 = false;
         } else {
            var11 = true;
            var7 = var6;
         }

         int var12;
         if (!var8) {
            var12 = class_9299.method_42829(this.method_27695(var3, var1, var5), 0, this.field_30986 - 1);
         } else {
            var12 = Math.min(var7, var5);
         }

         int var13 = this.method_27699(var6, var7);
         if (var6 == var12) {
            if (!var11) {
               this.method_27688(var3, var13, this.field_30986, true);
            }
         } else {
            int var14 = this.method_27699(var6, var12);
            if (var13 != var14 && !var11) {
               this.method_27688(var3, var13, var14, false);
            }

            this.method_27704(var3, var12, var14);
         }
      }
   }

   public final void method_27687(long var1, long var3, int var5, boolean var6) {
      int var9 = this.field_30985.get(var3) & 255;
      int var10 = class_9299.method_42829(this.method_27700(var1, var3, var5), 0, this.field_30986 - 1);
      if (!var6) {
         int var11;
         boolean var12;
         if (var9 != 255) {
            var11 = var9;
            var12 = false;
         } else {
            var12 = true;
            var11 = class_9299.method_42829(this.method_27698(var3), 0, this.field_30986 - 1);
         }

         if (var10 == var11) {
            this.method_27686(var1, var3, this.field_30986 - 1, !var12 ? this.method_27698(var3) : var11, var9, false);
         }
      } else {
         this.method_27686(var1, var3, var10, this.method_27698(var3), var9, true);
      }
   }

   public final boolean method_27685() {
      return this.field_30984;
   }

   public final int method_27693(int var1) {
      if (this.field_30987 >= this.field_30986) {
         return var1;
      } else {
         while (this.field_30987 < this.field_30986 && var1 > 0) {
            var1--;
            LongLinkedOpenHashSet var4 = this.field_30988[this.field_30987];
            long var5 = var4.removeFirstLong();
            int var7 = class_9299.method_42829(this.method_27698(var5), 0, this.field_30986 - 1);
            if (var4.isEmpty()) {
               this.method_27696(this.field_30986);
            }

            if (this.field_30985.containsKey(var5)) {
               int var8 = this.field_30985.remove(var5) & 255;
               if (var8 >= var7) {
                  if (var8 > var7) {
                     this.method_27704(var5, var8, this.method_27699(this.field_30986 - 1, var8));
                     this.method_27689(var5, this.field_30986 - 1);
                     this.method_27701(var5, var7, false);
                  }
               } else {
                  this.method_27689(var5, var8);
                  this.method_27701(var5, var8, true);
               }
            }
         }

         this.field_30984 = this.field_30987 < this.field_30986;
         return var1;
      }
   }

   public int method_27697() {
      return this.field_30985.size();
   }

   public abstract boolean method_27692(long var1);

   public abstract int method_27695(long var1, long var3, int var5);

   public abstract void method_27701(long var1, int var3, boolean var4);

   public abstract int method_27698(long var1);

   public abstract void method_27689(long var1, int var3);

   public abstract int method_27700(long var1, long var3, int var5);
}
