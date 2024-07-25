package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class class_6459 extends class_4569 {
   private final class_7781 field_32924;
   private final class_7781 field_32928;
   private final class_7781 field_32926;
   private final class_5319[] field_32925;

   public class_6459(class_8938 var1, class_7781 var2, class_7781 var3, class_7781 var4, class_5319[] var5) {
      super(class_8281.method_38162(), var1);
      this.field_32924 = var2;
      this.field_32928 = var3;
      this.field_32926 = var4;
      this.field_32925 = var5;
   }

   public static class_6459 method_29433(class_5319... var0) {
      return new class_6459(class_8938.field_45798, class_7781.field_39439, class_7781.field_39439, class_7781.field_39439, var0);
   }

   public static class_6459 method_29434(class_8525... var0) {
      class_5319[] var3 = new class_5319[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         var3[var4] = new class_5319(
            (class_2307<class_2451>)null,
            var0[var4].method_10803(),
            class_7781.field_39439,
            class_7781.field_39439,
            class_5187.field_26690,
            class_5187.field_26690,
            (class_6004)null,
            class_6000.field_30559
         );
      }

      return method_29433(var3);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (!this.field_32924.method_27852() || !this.field_32928.method_27852() || !this.field_32926.method_27852()) {
         JsonObject var5 = new JsonObject();
         var5.add("occupied", this.field_32924.method_27853());
         var5.add("full", this.field_32928.method_27853());
         var5.add("empty", this.field_32926.method_27853());
         var4.add("slots", var5);
      }

      if (this.field_32925.length > 0) {
         JsonArray var10 = new JsonArray();

         for (class_5319 var9 : this.field_32925) {
            var10.add(var9.method_24265());
         }

         var4.add("items", var10);
      }

      return var4;
   }

   public boolean method_29435(class_7051 var1, ItemStack var2, int var3, int var4, int var5) {
      if (!this.field_32928.method_35307(var3)) {
         return false;
      } else if (!this.field_32926.method_35307(var4)) {
         return false;
      } else if (!this.field_32924.method_35307(var5)) {
         return false;
      } else {
         int var8 = this.field_32925.length;
         if (var8 == 0) {
            return true;
         } else if (var8 == 1) {
            return !var2.method_28022() && this.field_32925[0].method_24266(var2);
         } else {
            ObjectArrayList var9 = new ObjectArrayList(this.field_32925);
            int var10 = var1.method_31505();

            for (int var11 = 0; var11 < var10; var11++) {
               if (var9.isEmpty()) {
                  return true;
               }

               ItemStack var12 = var1.method_31498(var11);
               if (!var12.method_28022()) {
                  var9.removeIf(var1x -> var1x.method_24266(var12));
               }
            }

            return var9.isEmpty();
         }
      }
   }
}
