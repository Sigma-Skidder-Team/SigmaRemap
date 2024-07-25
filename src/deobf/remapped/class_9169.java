package remapped;

import java.util.EnumSet;

public class class_9169 extends class_3599 {
   private static String[] field_46924;
   private final class_4109 field_46926;
   private final double field_46925;
   private double field_46921;
   private double field_46922;
   private double field_46923;

   public class_9169(class_4109 var1, double var2) {
      this.field_46926 = var1;
      this.field_46925 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_46926.method_19043() && this.field_46926.method_37151()) {
         class_1343 var3 = class_3425.method_15845(this.field_46926, 5, 4);
         if (var3 != null) {
            this.field_46921 = var3.field_7336;
            this.field_46922 = var3.field_7333;
            this.field_46923 = var3.field_7334;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_46926.method_26927().method_5595(this.field_46921, this.field_46922, this.field_46923, this.field_46925);
   }

   @Override
   public boolean method_16799() {
      return !this.field_46926.method_19043() && !this.field_46926.method_26927().method_5591() && this.field_46926.method_37151();
   }

   @Override
   public void method_16794() {
      if (!this.field_46926.method_19043() && this.field_46926.method_26594().nextInt(50) == 0) {
         Entity var3 = this.field_46926.method_37114().get(0);
         if (var3 == null) {
            return;
         }

         if (var3 instanceof class_704) {
            int var4 = this.field_46926.method_19062();
            int var5 = this.field_46926.method_19075();
            if (var5 > 0 && this.field_46926.method_26594().nextInt(var5) < var4) {
               this.field_46926.method_19038((class_704)var3);
               return;
            }

            this.field_46926.method_19074(5);
         }

         this.field_46926.method_37305();
         this.field_46926.method_19037();
         this.field_46926.world.method_29587(this.field_46926, (byte)6);
      }
   }
}
