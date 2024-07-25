package remapped;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6397 {
   private static final Logger field_32662 = LogManager.getLogger();
   public static final class_6397 field_32658 = new class_6397();
   private static final class_3162[] field_32659 = class_3162.values();
   private final EnumSet<class_3162> field_32665 = EnumSet.<class_3162>noneOf(class_3162.class);
   private final int[][] field_32663 = new int[16][];
   private static final Map<class_6414, class_9433> field_32664 = new IdentityHashMap<class_6414, class_9433>();
   private static final Set<class_9433> field_32660 = Sets.newHashSet();

   private class_6397() {
   }

   public class_6397(CompoundNBT var1) {
      this();
      if (var1.contains("Indices", 10)) {
         CompoundNBT var4 = var1.getCompound("Indices");

         for (int var5 = 0; var5 < this.field_32663.length; var5++) {
            String var6 = String.valueOf(var5);
            if (var4.contains(var6, 11)) {
               this.field_32663[var5] = var4.method_25922(var6);
            }
         }
      }

      int var9 = var1.method_25947("Sides");

      for (class_3162 var8 : class_3162.values()) {
         if ((var9 & 1 << var8.ordinal()) != 0) {
            this.field_32665.add(var8);
         }
      }
   }

   public void method_29207(class_2654 var1) {
      this.method_29203(var1);

      for (class_3162 var7 : field_32659) {
         method_29209(var1, var7);
      }

      World var8 = var1.method_11997();
      field_32660.forEach(var1x -> var1x.method_43652(var8));
   }

   private static void method_29209(class_2654 var0, class_3162 var1) {
      World var4 = var0.method_11997();
      if (var0.method_27343().field_32665.remove(var1)) {
         Set var5 = var1.method_14594();
         boolean var6 = false;
         byte var7 = 15;
         boolean var8 = var5.contains(Direction.field_804);
         boolean var9 = var5.contains(Direction.field_809);
         boolean var10 = var5.contains(Direction.field_800);
         boolean var11 = var5.contains(Direction.field_818);
         boolean var12 = var5.size() == 1;
         class_2034 var13 = var0.method_27352();
         int var14 = var13.method_9535() + (!var12 || !var11 && !var10 ? (!var9 ? 15 : 0) : 1);
         int var15 = var13.method_9535() + (!var12 || !var11 && !var10 ? (!var9 ? 15 : 0) : 14);
         int var16 = var13.method_9545() + (!var12 || !var8 && !var9 ? (!var11 ? 15 : 0) : 1);
         int var17 = var13.method_9545() + (!var12 || !var8 && !var9 ? (!var11 ? 15 : 0) : 14);
         Direction[] var18 = Direction.values();
         class_2921 var19 = new class_2921();

         for (BlockPos var21 : BlockPos.method_6075(var14, 0, var16, var15, var4.method_28261() - 1, var17)) {
            class_2522 var22 = var4.method_28262(var21);
            class_2522 var23 = var22;

            for (Direction var27 : var18) {
               var19.method_13371(var21, var27);
               var23 = method_29204(var23, var27, var4, var21, var19);
            }

            class_6414.method_29305(var22, var23, var4, var21, 18);
         }
      }
   }

   private static class_2522 method_29204(class_2522 var0, Direction var1, class_9379 var2, BlockPos var3, BlockPos var4) {
      return field_32664.getOrDefault(var0.method_8360(), class_3823.field_18691).method_43653(var0, var1, var2.method_28262(var4), var2, var3, var4);
   }

   private void method_29203(class_2654 var1) {
      class_2921 var4 = new class_2921();
      class_2921 var5 = new class_2921();
      class_2034 var6 = var1.method_27352();
      World var7 = var1.method_11997();

      for (int var8 = 0; var8 < 16; var8++) {
         class_1315 var9 = var1.method_27349()[var8];
         int[] var10 = this.field_32663[var8];
         this.field_32663[var8] = null;
         if (var9 != null && var10 != null && var10.length > 0) {
            Direction[] var11 = Direction.values();
            class_5427 var12 = var9.method_6006();

            for (int var16 : var10) {
               int var17 = var16 & 15;
               int var18 = var16 >> 8 & 15;
               int var19 = var16 >> 4 & 15;
               var4.method_13362(var6.method_9535() + var17, (var8 << 4) + var18, var6.method_9545() + var19);
               class_2522 var20 = (class_2522)var12.method_24688(var16);
               class_2522 var21 = var20;

               for (Direction var25 : var11) {
                  var5.method_13371(var4, var25);
                  if (var4.method_12173() >> 4 == var6.field_10328 && var4.method_12185() >> 4 == var6.field_10327) {
                     var21 = method_29204(var21, var25, var7, var4, var5);
                  }
               }

               class_6414.method_29305(var20, var21, var7, var4, 18);
            }
         }
      }

      for (int var26 = 0; var26 < this.field_32663.length; var26++) {
         if (this.field_32663[var26] != null) {
            field_32662.warn("Discarding update data for section {} for chunk ({} {})", var26, var6.field_10328, var6.field_10327);
         }

         this.field_32663[var26] = null;
      }
   }

   public boolean method_29208() {
      for (int[] var6 : this.field_32663) {
         if (var6 != null) {
            return false;
         }
      }

      return this.field_32665.isEmpty();
   }

   public CompoundNBT method_29205() {
      CompoundNBT var3 = new CompoundNBT();
      CompoundNBT var4 = new CompoundNBT();

      for (int var5 = 0; var5 < this.field_32663.length; var5++) {
         String var6 = String.valueOf(var5);
         if (this.field_32663[var5] != null && this.field_32663[var5].length != 0) {
            var4.method_25969(var6, this.field_32663[var5]);
         }
      }

      if (!var4.method_25940()) {
         var3.put("Indices", var4);
      }

      int var8 = 0;

      for (class_3162 var7 : this.field_32665) {
         var8 |= 1 << var7.ordinal();
      }

      var3.method_25921("Sides", (byte)var8);
      return var3;
   }
}
