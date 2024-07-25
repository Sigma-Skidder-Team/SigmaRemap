package remapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_8996 extends class_7186 {
   private final Map<Integer, class_2452> field_46053 = Maps.newHashMap();
   private final class_6331 field_46054;
   private int field_46057;
   private int field_46055;

   public class_8996(class_6331 var1) {
      super(method_41270(var1.method_22572()));
      this.field_46054 = var1;
      this.field_46057 = 1;
      this.method_32923();
   }

   public class_2452 method_41269(int var1) {
      return this.field_46053.get(var1);
   }

   public void method_41276() {
      this.field_46055++;
      Iterator var3 = this.field_46053.values().iterator();

      while (var3.hasNext()) {
         class_2452 var4 = (class_2452)var3.next();
         if (this.field_46054.method_29537().method_1285(class_291.field_1045)) {
            var4.method_11271();
         }

         if (!var4.method_11277()) {
            var4.method_11261();
         } else {
            var3.remove();
            this.method_32923();
         }
      }

      if (this.field_46055 % 200 == 0) {
         this.method_32923();
      }

      class_1892.method_8431(this.field_46054, this.field_46053.values());
   }

   public static boolean method_41275(AbstractRaiderEntity var0, class_2452 var1) {
      return var0 != null && var1 != null && var1.method_11267() != null
         ? var0.isAlive() && var0.method_18593() && var0.method_26532() <= 2400 && var0.world.method_22572() == var1.method_11267().method_22572()
         : false;
   }

   @Nullable
   public class_2452 method_41271(class_9359 var1) {
      if (var1.method_37221()) {
         return null;
      } else if (this.field_46054.method_29537().method_1285(class_291.field_1045)) {
         return null;
      } else {
         class_8760 var4 = var1.world.method_22572();
         if (!var4.method_40239()) {
            return null;
         } else {
            BlockPos var5 = var1.method_37075();
            List var6 = this.field_46054.method_28969().method_6877(class_236.field_768, var5, 64, class_8122.field_41618).collect(Collectors.toList());
            int var7 = 0;
            class_1343 var8 = class_1343.field_7335;

            for (class_8009 var10 : var6) {
               BlockPos var11 = var10.method_36337();
               var8 = var8.method_6214((double)var11.method_12173(), (double)var11.method_12165(), (double)var11.method_12185());
               var7++;
            }

            BlockPos var13;
            if (var7 <= 0) {
               var13 = var5;
            } else {
               var8 = var8.method_6209(1.0 / (double)var7);
               var13 = new BlockPos(var8);
            }

            class_2452 var14 = this.method_41274(var1.method_43235(), var13);
            boolean var15 = false;
            if (var14.method_11301()) {
               if (var14.method_11296() >= var14.method_11294()) {
                  var1.removeEffect(Effects.field_19721);
                  var1.field_47794.method_4156(new class_295(var1, (byte)43));
               } else {
                  var15 = true;
               }
            } else {
               if (!this.field_46053.containsKey(var14.method_11288())) {
                  this.field_46053.put(var14.method_11288(), var14);
               }

               var15 = true;
            }

            if (var15) {
               var14.method_11258(var1);
               var1.field_47794.method_4156(new class_295(var1, (byte)43));
               if (!var14.method_11291()) {
                  var1.method_3209(class_6234.field_31884);
                  class_8807.field_45053.method_7409(var1);
               }
            }

            this.method_32923();
            return var14;
         }
      }
   }

   private class_2452 method_41274(class_6331 var1, BlockPos var2) {
      class_2452 var5 = var1.method_28984(var2);
      return var5 == null ? new class_2452(this.method_41273(), var1, var2) : var5;
   }

   @Override
   public void method_32924(CompoundNBT var1) {
      this.field_46057 = var1.method_25947("NextAvailableID");
      this.field_46055 = var1.method_25947("Tick");
      class_3416 var4 = var1.method_25927("Raids", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         CompoundNBT var6 = var4.method_15764(var5);
         class_2452 var7 = new class_2452(this.field_46054, var6);
         this.field_46053.put(var7.method_11288(), var7);
      }
   }

   @Override
   public CompoundNBT method_32920(CompoundNBT var1) {
      var1.method_25931("NextAvailableID", this.field_46057);
      var1.method_25931("Tick", this.field_46055);
      class_3416 var4 = new class_3416();

      for (class_2452 var6 : this.field_46053.values()) {
         CompoundNBT var7 = new CompoundNBT();
         var6.method_11279(var7);
         var4.add(var7);
      }

      var1.put("Raids", var4);
      return var1;
   }

   public static String method_41270(class_8760 var0) {
      return "raids" + var0.method_40237();
   }

   private int method_41273() {
      return ++this.field_46057;
   }

   @Nullable
   public class_2452 method_41272(BlockPos var1, int var2) {
      class_2452 var5 = null;
      double var6 = (double)var2;

      for (class_2452 var9 : this.field_46053.values()) {
         double var10 = var9.method_11269().method_12180(var1);
         if (var9.method_11306() && var10 < var6) {
            var5 = var9;
            var6 = var10;
         }
      }

      return var5;
   }
}
