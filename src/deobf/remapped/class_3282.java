package remapped;

import java.util.EnumSet;

public class class_3282 extends class_3599 {
   private static String[] field_16254;
   private final class_378 field_16255;
   private int field_16256;

   public class_3282(class_378 var1) {
      this.field_16255 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_16255.method_17809();
      if (var3 != null) {
         if (!var3.method_37330()) {
            return false;
         } else {
            return var3 instanceof class_704 && ((class_704)var3).playerAbilities.disableDamage ? false : this.field_16255.method_26905() instanceof class_8509;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_16256 = 300;
      super.method_16796();
   }

   @Override
   public boolean method_16799() {
      class_5834 var3 = this.field_16255.method_17809();
      if (var3 != null) {
         if (var3.method_37330()) {
            return var3 instanceof class_704 && ((class_704)var3).playerAbilities.disableDamage ? false : --this.field_16256 > 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      this.field_16255.method_26914(this.field_16255.method_17809(), 10.0F, 10.0F);
      ((class_8509)this.field_16255.method_26905()).method_39183(this.field_16255.field_41701, this.field_16255.method_1857());
   }
}
