package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import net.minecraft.util.math.MathHelper;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

public abstract class Class202 {
   private final int field754;
   private final LongLinkedOpenHashSet[] field755;
   private final Long2ByteMap field756;
   private int field757;
   private volatile boolean field758;

   public Class202(int var1, int var2, int var3) {
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.field754 = var1;
         this.field755 = new LongLinkedOpenHashSet[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            this.field755[var6] = new Class2359(this, var2, 0.5F, var2);
         }

         this.field756 = new Class21(this, var3, 0.5F, var3);
         this.field756.defaultReturnValue((byte)-1);
         this.field757 = var1;
      }
   }

   private int method666(int var1, int var2) {
      int var5 = var1;
      if (var1 > var2) {
         var5 = var2;
      }

      if (var5 > this.field754 - 1) {
         var5 = this.field754 - 1;
      }

      return var5;
   }

   private void method667(int var1) {
      int var4 = this.field757;
      this.field757 = var1;

      for (int var5 = var4 + 1; var5 < var1; var5++) {
         if (!this.field755[var5].isEmpty()) {
            this.field757 = var5;
            break;
         }
      }
   }

   public void method668(long var1) {
      int var5 = this.field756.get(var1) & 255;
      if (var5 != 255) {
         int var6 = this.method652(var1);
         int var7 = this.method666(var6, var5);
         this.method670(var1, var7, this.field754, true);
         this.field758 = this.field757 < this.field754;
      }
   }

   public void method669(LongPredicate var1) {
      LongArrayList var4 = new LongArrayList();
      this.field756.keySet().forEach((long var2) -> {
         if (var1.test(var2)) {
            var4.add(var2);
         }
      });
      var4.forEach((LongConsumer) this::method668);
   }

   private void method670(long var1, int var3, int var4, boolean var5) {
      if (var5) {
         this.field756.remove(var1);
      }

      this.field755[var3].remove(var1);
      if (this.field755[var3].isEmpty() && this.field757 == var3) {
         this.method667(var4);
      }
   }

   private void method671(long var1, int var3, int var4) {
      this.field756.put(var1, (byte)var3);
      this.field755[var4].add(var1);
      if (this.field757 > var4) {
         this.field757 = var4;
      }
   }

   public void method644(long var1) {
      this.method672(var1, var1, this.field754 - 1, false);
   }

   public void method672(long var1, long var3, int var5, boolean var6) {
      this.method673(var1, var3, var5, this.method652(var3), this.field756.get(var3) & 255, var6);
      this.field758 = this.field757 < this.field754;
   }

   private void method673(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.method650(var3)) {
         var5 = MathHelper.clamp(var5, 0, this.field754 - 1);
         var6 = MathHelper.clamp(var6, 0, this.field754 - 1);
         boolean var11;
         if (var7 != 255) {
            var11 = false;
         } else {
            var11 = true;
            var7 = var6;
         }

         int var12;
         if (!var8) {
            var12 = MathHelper.clamp(this.method651(var3, var1, var5), 0, this.field754 - 1);
         } else {
            var12 = Math.min(var7, var5);
         }

         int var13 = this.method666(var6, var7);
         if (var6 == var12) {
            if (!var11) {
               this.method670(var3, var13, this.field754, true);
            }
         } else {
            int var14 = this.method666(var6, var12);
            if (var13 != var14 && !var11) {
               this.method670(var3, var13, var14, false);
            }

            this.method671(var3, var12, var14);
         }
      }
   }

   public final void method674(long var1, long var3, int var5, boolean var6) {
      int var9 = this.field756.get(var3) & 255;
      int var10 = MathHelper.clamp(this.method655(var1, var3, var5), 0, this.field754 - 1);
      if (!var6) {
         int var11;
         boolean var12;
         if (var9 != 255) {
            var11 = var9;
            var12 = false;
         } else {
            var12 = true;
            var11 = MathHelper.clamp(this.method652(var3), 0, this.field754 - 1);
         }

         if (var10 == var11) {
            this.method673(var1, var3, this.field754 - 1, !var12 ? this.method652(var3) : var11, var9, false);
         }
      } else {
         this.method673(var1, var3, var10, this.method652(var3), var9, true);
      }
   }

   public final boolean method675() {
      return this.field758;
   }

   public final int method676(int var1) {
      if (this.field757 >= this.field754) {
         return var1;
      } else {
         while (this.field757 < this.field754 && var1 > 0) {
            var1--;
            LongLinkedOpenHashSet var4 = this.field755[this.field757];
            long var5 = var4.removeFirstLong();
            int var7 = MathHelper.clamp(this.method652(var5), 0, this.field754 - 1);
            if (var4.isEmpty()) {
               this.method667(this.field754);
            }

            if (this.field756.containsKey(var5)) {
               int var8 = this.field756.remove(var5) & 255;
               if (var8 >= var7) {
                  if (var8 > var7) {
                     this.method671(var5, var8, this.method666(this.field754 - 1, var8));
                     this.method654(var5, this.field754 - 1);
                     this.method665(var5, var7, false);
                  }
               } else {
                  this.method654(var5, var8);
                  this.method665(var5, var8, true);
               }
            }
         }

         this.field758 = this.field757 < this.field754;
         return var1;
      }
   }

   public int method677() {
      return this.field756.size();
   }

   public abstract boolean method650(long var1);

   public abstract int method651(long var1, long var3, int var5);

   public abstract void method665(long var1, int var3, boolean var4);

   public abstract int method652(long var1);

   public abstract void method654(long var1, int var3);

   public abstract int method655(long var1, long var3, int var5);
}
