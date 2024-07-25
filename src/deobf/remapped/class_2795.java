package remapped;

import java.util.ArrayList;
import javax.annotation.Nullable;

public class class_2795 extends ArrayList<class_8014> {
   public class_2795() {
   }

   public class_2795(CompoundNBT var1) {
      class_3416 var4 = var1.method_25927("Recipes", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.add(new class_8014(var4.method_15764(var5)));
      }
   }

   @Nullable
   public class_8014 method_12710(ItemStack var1, ItemStack var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         class_8014 var8 = this.get(var3);
         return !var8.method_36373(var1, var2) ? null : var8;
      } else {
         for (int var6 = 0; var6 < this.size(); var6++) {
            class_8014 var7 = this.get(var6);
            if (var7.method_36373(var1, var2)) {
               return var7;
            }
         }

         return null;
      }
   }

   public void method_12712(class_8248 var1) {
      var1.writeByte((byte)(this.size() & 0xFF));

      for (int var4 = 0; var4 < this.size(); var4++) {
         class_8014 var5 = this.get(var4);
         var1.method_37764(var5.method_36365());
         var1.method_37764(var5.method_36362());
         ItemStack var6 = var5.method_36377();
         var1.writeBoolean(!var6.method_28022());
         if (!var6.method_28022()) {
            var1.method_37764(var6);
         }

         var1.writeBoolean(var5.method_36378());
         var1.writeInt(var5.method_36366());
         var1.writeInt(var5.method_36380());
         var1.writeInt(var5.method_36363());
         var1.writeInt(var5.method_36379());
         var1.writeFloat(var5.method_36376());
         var1.writeInt(var5.method_36367());
      }
   }

   public static class_2795 method_12714(class_8248 var0) {
      class_2795 var3 = new class_2795();
      int var4 = var0.readByte() & 255;

      for (int var5 = 0; var5 < var4; var5++) {
         ItemStack var6 = var0.method_37755();
         ItemStack var7 = var0.method_37755();
         ItemStack var8 = ItemStack.EMPTY;
         if (var0.readBoolean()) {
            var8 = var0.method_37755();
         }

         boolean var9 = var0.readBoolean();
         int var10 = var0.readInt();
         int var11 = var0.readInt();
         int var12 = var0.readInt();
         int var13 = var0.readInt();
         float var14 = var0.readFloat();
         int var15 = var0.readInt();
         class_8014 var16 = new class_8014(var6, var8, var7, var10, var11, var12, var14, var15);
         if (var9) {
            var16.method_36364();
         }

         var16.method_36359(var13);
         var3.add(var16);
      }

      return var3;
   }

   public CompoundNBT method_12711() {
      CompoundNBT var3 = new CompoundNBT();
      class_3416 var4 = new class_3416();

      for (int var5 = 0; var5 < this.size(); var5++) {
         class_8014 var6 = this.get(var5);
         var4.add(var6.method_36383());
      }

      var3.put("Recipes", var4);
      return var3;
   }
}
