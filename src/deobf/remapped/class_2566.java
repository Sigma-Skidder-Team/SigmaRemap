package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2566<T> {
   private static final boolean field_12689 = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean field_12688 = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger field_12696 = LogManager.getLogger();
   public final List<T> field_12687 = Lists.newArrayList();
   private final IntList field_12695 = new IntArrayList();
   private final IntList field_12693 = new IntArrayList();
   private IntList field_12692 = new IntArrayList();
   private IntList field_12691 = new IntArrayList();
   private int field_12694;

   public void method_11650(T var1, String var2) {
      this.field_12694 = Math.max(this.field_12694, var2.length());
      int var5 = this.field_12687.size();
      this.field_12687.add((T)var1);
      this.field_12693.add(this.field_12695.size());

      for (int var6 = 0; var6 < var2.length(); var6++) {
         this.field_12692.add(var5);
         this.field_12691.add(var6);
         this.field_12695.add(var2.charAt(var6));
      }

      this.field_12692.add(var5);
      this.field_12691.add(var2.length());
      this.field_12695.add(-1);
   }

   public void method_11653() {
      int var3 = this.field_12695.size();
      int[] var4 = new int[var3];
      int[] var5 = new int[var3];
      int[] var6 = new int[var3];
      int[] var7 = new int[var3];
      class_4212 var8 = new class_4212(this, var5, var6);
      Swapper var9 = (var3x, var4x) -> {
         if (var3x != var4x) {
            int var7x = var5[var3x];
            var5[var3x] = var5[var4x];
            var5[var4x] = var7x;
            var7x = var6[var3x];
            var6[var3x] = var6[var4x];
            var6[var4x] = var7x;
            var7x = var7[var3x];
            var7[var3x] = var7[var4x];
            var7[var4x] = var7x;
         }
      };

      for (int var10 = 0; var10 < var3; var10++) {
         var4[var10] = this.field_12695.getInt(var10);
      }

      byte var15 = 1;

      for (int var11 = Math.min(var3, this.field_12694); var15 * 2 < var11; var15 *= 2) {
         for (int var12 = 0; var12 < var3; var7[var12] = var12++) {
            var5[var12] = var4[var12];
            var6[var12] = var12 + var15 >= var3 ? -2 : var4[var12 + var15];
         }

         Arrays.quickSort(0, var3, var8, var9);

         for (int var17 = 0; var17 < var3; var17++) {
            if (var17 > 0 && var5[var17] == var5[var17 - 1] && var6[var17] == var6[var17 - 1]) {
               var4[var7[var17]] = var4[var7[var17 - 1]];
            } else {
               var4[var7[var17]] = var17;
            }
         }
      }

      IntList var16 = this.field_12692;
      IntList var18 = this.field_12691;
      this.field_12692 = new IntArrayList(var16.size());
      this.field_12691 = new IntArrayList(var18.size());

      for (int var13 = 0; var13 < var3; var13++) {
         int var14 = var7[var13];
         this.field_12692.add(var16.getInt(var14));
         this.field_12691.add(var18.getInt(var14));
      }

      if (field_12688) {
         this.method_11654();
      }
   }

   private void method_11654() {
      for (int var3 = 0; var3 < this.field_12692.size(); var3++) {
         field_12696.debug("{} {}", var3, this.method_11655(var3));
      }

      field_12696.debug("");
   }

   private String method_11655(int var1) {
      int var4 = this.field_12691.getInt(var1);
      int var5 = this.field_12693.getInt(this.field_12692.getInt(var1));
      StringBuilder var6 = new StringBuilder();

      for (int var7 = 0; var5 + var7 < this.field_12695.size(); var7++) {
         if (var7 == var4) {
            var6.append('^');
         }

         int var8 = this.field_12695.get(var5 + var7);
         if (var8 == -1) {
            break;
         }

         var6.append((char)var8);
      }

      return var6.toString();
   }

   private int method_11651(String var1, int var2) {
      int var5 = this.field_12693.getInt(this.field_12692.getInt(var2));
      int var6 = this.field_12691.getInt(var2);

      for (int var7 = 0; var7 < var1.length(); var7++) {
         int var8 = this.field_12695.getInt(var5 + var6 + var7);
         if (var8 == -1) {
            return 1;
         }

         char var9 = var1.charAt(var7);
         char var10 = (char)var8;
         if (var9 < var10) {
            return -1;
         }

         if (var9 > var10) {
            return 1;
         }
      }

      return 0;
   }

   public List<T> method_11652(String var1) {
      int var4 = this.field_12692.size();
      int var5 = 0;
      int var6 = var4;

      while (var5 < var6) {
         int var7 = var5 + (var6 - var5) / 2;
         int var8 = this.method_11651(var1, var7);
         if (field_12689) {
            field_12696.debug("comparing lower \"{}\" with {} \"{}\": {}", var1, var7, this.method_11655(var7), var8);
         }

         if (var8 <= 0) {
            var6 = var7;
         } else {
            var5 = var7 + 1;
         }
      }

      if (var5 >= 0 && var5 < var4) {
         int var17 = var5;
         var6 = var4;

         while (var5 < var6) {
            int var18 = var5 + (var6 - var5) / 2;
            int var9 = this.method_11651(var1, var18);
            if (field_12689) {
               field_12696.debug("comparing upper \"{}\" with {} \"{}\": {}", var1, var18, this.method_11655(var18), var9);
            }

            if (var9 < 0) {
               var6 = var18;
            } else {
               var5 = var18 + 1;
            }
         }

         int var19 = var5;
         IntOpenHashSet var20 = new IntOpenHashSet();

         for (int var10 = var17; var10 < var19; var10++) {
            var20.add(this.field_12692.getInt(var10));
         }

         int[] var21 = var20.toIntArray();
         java.util.Arrays.sort(var21);
         LinkedHashSet var11 = Sets.newLinkedHashSet();

         for (int var15 : var21) {
            var11.add(this.field_12687.get(var15));
         }

         return Lists.newArrayList(var11);
      } else {
         return Collections.<T>emptyList();
      }
   }
}
