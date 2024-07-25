package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.List;

public class class_4927 {
   private static String[] field_25486;
   private final class_8932<?> field_25487;
   private final List<class_8137> field_25488;
   private final int field_25491;
   private final int[] field_25485;
   private final int field_25490;
   private final BitSet field_25484;
   private final IntList field_25489;

   public class_4927(class_8932<?> var1, class_8932 var2) {
      this.field_25492 = var1;
      this.field_25488 = Lists.newArrayList();
      this.field_25489 = new IntArrayList();
      this.field_25487 = var2;
      this.field_25488.addAll(var2.method_41043());
      this.field_25488.removeIf(class_8137::method_37033);
      this.field_25491 = this.field_25488.size();
      this.field_25485 = this.method_22576();
      this.field_25490 = this.field_25485.length;
      this.field_25484 = new BitSet(this.field_25491 + this.field_25490 + this.field_25491 + this.field_25491 * this.field_25490);

      for (int var5 = 0; var5 < this.field_25488.size(); var5++) {
         IntList var6 = this.field_25488.get(var5).method_37021();

         for (int var7 = 0; var7 < this.field_25490; var7++) {
            if (var6.contains(this.field_25485[var7])) {
               this.field_25484.set(this.method_22589(true, var7, var5));
            }
         }
      }
   }

   public boolean method_22587(int var1, IntList var2) {
      if (var1 <= 0) {
         return true;
      } else {
         int var5;
         for (var5 = 0; this.method_22578(var1); var5++) {
            class_534.method_2612(this.field_25492, this.field_25485[this.field_25489.getInt(0)], var1);
            int var6 = this.field_25489.size() - 1;
            this.method_22590(this.field_25489.getInt(var6));

            for (int var7 = 0; var7 < var6; var7++) {
               this.method_22579((var7 & 1) == 0, this.field_25489.get(var7), this.field_25489.get(var7 + 1));
            }

            this.field_25489.clear();
            this.field_25484.clear(0, this.field_25491 + this.field_25490);
         }

         boolean var12 = var5 == this.field_25491;
         boolean var13 = var12 && var2 != null;
         if (var13) {
            var2.clear();
         }

         this.field_25484.clear(0, this.field_25491 + this.field_25490 + this.field_25491);
         int var8 = 0;
         class_2831 var9 = this.field_25487.method_41043();

         for (int var10 = 0; var10 < var9.size(); var10++) {
            if (var13 && ((class_8137)var9.get(var10)).method_37033()) {
               var2.add(0);
            } else {
               for (int var11 = 0; var11 < this.field_25490; var11++) {
                  if (this.method_22577(false, var8, var11)) {
                     this.method_22579(true, var11, var8);
                     class_534.method_2607(this.field_25492, this.field_25485[var11], var1);
                     if (var13) {
                        var2.add(this.field_25485[var11]);
                     }
                  }
               }

               var8++;
            }
         }

         return var12;
      }
   }

   private int[] method_22576() {
      IntAVLTreeSet var3 = new IntAVLTreeSet();

      for (class_8137 var5 : this.field_25488) {
         var3.addAll(var5.method_37021());
      }

      IntIterator var6 = var3.iterator();

      while (var6.hasNext()) {
         if (!class_534.method_2609(this.field_25492, var6.nextInt())) {
            var6.remove();
         }
      }

      return var3.toIntArray();
   }

   private boolean method_22578(int var1) {
      int var4 = this.field_25490;

      for (int var5 = 0; var5 < var4; var5++) {
         if (this.field_25492.field_3242.get(this.field_25485[var5]) >= var1) {
            this.method_22583(false, var5);

            while (!this.field_25489.isEmpty()) {
               int var6 = this.field_25489.size();
               boolean var7 = (var6 & 1) == 1;
               int var8 = this.field_25489.getInt(var6 - 1);
               if (!var7 && !this.method_22585(var8)) {
                  break;
               }

               int var9 = !var7 ? var4 : this.field_25491;
               int var10 = 0;

               while (true) {
                  if (var10 < var9) {
                     if (this.method_22584(var7, var10) || !this.method_22586(var7, var8, var10) || !this.method_22577(var7, var8, var10)) {
                        var10++;
                        continue;
                     }

                     this.method_22583(var7, var10);
                  }

                  var10 = this.field_25489.size();
                  if (var10 == var6) {
                     this.field_25489.removeInt(var10 - 1);
                  }
                  break;
               }
            }

            if (!this.field_25489.isEmpty()) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_22585(int var1) {
      return this.field_25484.get(this.method_22588(var1));
   }

   private void method_22590(int var1) {
      this.field_25484.set(this.method_22588(var1));
   }

   private int method_22588(int var1) {
      return this.field_25491 + this.field_25490 + var1;
   }

   private boolean method_22586(boolean var1, int var2, int var3) {
      return this.field_25484.get(this.method_22589(var1, var2, var3));
   }

   private boolean method_22577(boolean var1, int var2, int var3) {
      return var1 != this.field_25484.get(1 + this.method_22589(var1, var2, var3));
   }

   private void method_22579(boolean var1, int var2, int var3) {
      this.field_25484.flip(1 + this.method_22589(var1, var2, var3));
   }

   private int method_22589(boolean var1, int var2, int var3) {
      int var6 = !var1 ? var3 * this.field_25491 + var2 : var2 * this.field_25491 + var3;
      return this.field_25491 + this.field_25490 + this.field_25491 + 2 * var6;
   }

   private void method_22583(boolean var1, int var2) {
      this.field_25484.set(this.method_22580(var1, var2));
      this.field_25489.add(var2);
   }

   private boolean method_22584(boolean var1, int var2) {
      return this.field_25484.get(this.method_22580(var1, var2));
   }

   private int method_22580(boolean var1, int var2) {
      return (!var1 ? this.field_25491 : 0) + var2;
   }

   public int method_22581(int var1, IntList var2) {
      int var5 = 0;
      int var6 = Math.min(var1, this.method_22575()) + 1;

      while (true) {
         int var7 = (var5 + var6) / 2;
         if (!this.method_22587(var7, (IntList)null)) {
            var6 = var7;
         } else {
            if (var6 - var5 <= 1) {
               if (var7 > 0) {
                  this.method_22587(var7, var2);
               }

               return var7;
            }

            var5 = var7;
         }
      }
   }

   private int method_22575() {
      int var3 = Integer.MAX_VALUE;

      for (class_8137 var5 : this.field_25488) {
         int var6 = 0;
         IntListIterator var7 = var5.method_37021().iterator();

         while (var7.hasNext()) {
            int var8 = (Integer)var7.next();
            var6 = Math.max(var6, this.field_25492.field_3242.get(var8));
         }

         if (var3 > 0) {
            var3 = Math.min(var3, var6);
         }
      }

      return var3;
   }
}
