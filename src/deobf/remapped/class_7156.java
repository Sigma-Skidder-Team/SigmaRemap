package remapped;

import java.util.EnumSet;
import java.util.Random;
import javax.annotation.Nullable;

public class class_7156 extends class_3599 {
   private static String[] field_36855;
   private final class_4612 field_36854;
   private double field_36856;
   private double field_36859;
   private double field_36858;
   private final double field_36857;
   private final World field_36860;

   public class_7156(class_4612 var1, double var2) {
      this.field_36854 = var1;
      this.field_36857 = var2;
      this.field_36860 = var1.world;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (this.field_36860.method_29602()) {
         if (!this.field_36854.method_37285()) {
            class_1343 var3 = this.method_32848();
            if (var3 != null) {
               this.field_36856 = var3.field_7336;
               this.field_36859 = var3.field_7333;
               this.field_36858 = var3.field_7334;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_36854.method_26927().method_5591();
   }

   @Override
   public void method_16796() {
      this.field_36854.method_26927().method_5595(this.field_36856, this.field_36859, this.field_36858, this.field_36857);
   }

   @Nullable
   private class_1343 method_32848() {
      Random var3 = this.field_36854.method_26594();
      BlockPos var4 = this.field_36854.method_37075();

      for (int var5 = 0; var5 < 10; var5++) {
         BlockPos var6 = var4.method_6104(var3.nextInt(20) - 10, 2 - var3.nextInt(8), var3.nextInt(20) - 10);
         if (this.field_36860.method_28262(var6).method_8350(class_4783.field_23900)) {
            return class_1343.method_6200(var6);
         }
      }

      return null;
   }
}
