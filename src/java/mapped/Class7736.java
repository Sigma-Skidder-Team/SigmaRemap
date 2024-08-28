package mapped;

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

public class Class7736<T> {
   private static final boolean field33220 = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean field33221 = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger field33222 = LogManager.getLogger();
   public final List<T> field33223 = Lists.newArrayList();
   private final IntList field33224 = new IntArrayList();
   private final IntList field33225 = new IntArrayList();
   private IntList field33226 = new IntArrayList();
   private IntList field33227 = new IntArrayList();
   private int field33228;

   public void method25607(T var1, String var2) {
      this.field33228 = Math.max(this.field33228, var2.length());
      int var5 = this.field33223.size();
      this.field33223.add((T)var1);
      this.field33225.add(this.field33224.size());

      for (int var6 = 0; var6 < var2.length(); var6++) {
         this.field33226.add(var5);
         this.field33227.add(var6);
         this.field33224.add(var2.charAt(var6));
      }

      this.field33226.add(var5);
      this.field33227.add(var2.length());
      this.field33224.add(-1);
   }

   public void method25608() {
      int var3 = this.field33224.size();
      int[] var4 = new int[var3];
      int[] var5 = new int[var3];
      int[] var6 = new int[var3];
      int[] var7 = new int[var3];
      Class3601 var8 = new Class3601(this, var5, var6);
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
         var4[var10] = this.field33224.getInt(var10);
      }

      byte var15 = 1;

      for (int var11 = Math.min(var3, this.field33228); var15 * 2 < var11; var15 *= 2) {
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

      IntList var16 = this.field33226;
      IntList var18 = this.field33227;
      this.field33226 = new IntArrayList(var16.size());
      this.field33227 = new IntArrayList(var18.size());

      for (int var13 = 0; var13 < var3; var13++) {
         int var14 = var7[var13];
         this.field33226.add(var16.getInt(var14));
         this.field33227.add(var18.getInt(var14));
      }

      if (field33221) {
         this.method25609();
      }
   }

   private void method25609() {
      for (int var3 = 0; var3 < this.field33226.size(); var3++) {
         field33222.debug("{} {}", var3, this.method25610(var3));
      }

      field33222.debug("");
   }

   private String method25610(int var1) {
      int var4 = this.field33227.getInt(var1);
      int var5 = this.field33225.getInt(this.field33226.getInt(var1));
      StringBuilder var6 = new StringBuilder();

      for (int var7 = 0; var5 + var7 < this.field33224.size(); var7++) {
         if (var7 == var4) {
            var6.append('^');
         }

         int var8 = this.field33224.get(var5 + var7);
         if (var8 == -1) {
            break;
         }

         var6.append((char)var8);
      }

      return var6.toString();
   }

   private int method25611(String var1, int var2) {
      int var5 = this.field33225.getInt(this.field33226.getInt(var2));
      int var6 = this.field33227.getInt(var2);

      for (int var7 = 0; var7 < var1.length(); var7++) {
         int var8 = this.field33224.getInt(var5 + var6 + var7);
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

   public List<T> method25612(String var1) {
      int var4 = this.field33226.size();
      int var5 = 0;
      int var6 = var4;

      while (var5 < var6) {
         int var7 = var5 + (var6 - var5) / 2;
         int var8 = this.method25611(var1, var7);
         if (field33220) {
            field33222.debug("comparing lower \"{}\" with {} \"{}\": {}", var1, var7, this.method25610(var7), var8);
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
            int var9 = this.method25611(var1, var18);
            if (field33220) {
               field33222.debug("comparing upper \"{}\" with {} \"{}\": {}", var1, var18, this.method25610(var18), var9);
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
            var20.add(this.field33226.getInt(var10));
         }

         int[] var21 = var20.toIntArray();
         java.util.Arrays.sort(var21);
         LinkedHashSet var11 = Sets.newLinkedHashSet();

         for (int var15 : var21) {
            var11.add(this.field33223.get(var15));
         }

         return Lists.newArrayList(var11);
      } else {
         return Collections.<T>emptyList();
      }
   }
}
