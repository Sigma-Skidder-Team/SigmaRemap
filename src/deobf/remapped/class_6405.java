package remapped;

import java.util.EnumSet;

public class class_6405 extends class_3599 {
   private static String[] field_32693;
   private static final class_4931 field_32690 = new class_4931().method_22607(6.0).method_22601().method_22603();
   private final IronGolemEntity field_32694;
   private class_7666 field_32691;
   private int field_32692;

   public class_6405(IronGolemEntity var1) {
      this.field_32694 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      if (this.field_32694.world.method_29602()) {
         if (this.field_32694.method_26594().nextInt(8000) == 0) {
            this.field_32691 = this.field_32694
               .world
               .<class_7666>method_25865(
                  class_7666.class,
                  field_32690,
                  this.field_32694,
                  this.field_32694.getPosX(),
                  this.field_32694.method_37309(),
                  this.field_32694.getPosZ(),
                  this.field_32694.method_37241().method_18899(6.0, 2.0, 6.0)
               );
            return this.field_32691 != null;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.field_32692 > 0;
   }

   @Override
   public void method_16796() {
      this.field_32692 = 400;
      this.field_32694.method_36973(true);
   }

   @Override
   public void method_16793() {
      this.field_32694.method_36973(false);
      this.field_32691 = null;
   }

   @Override
   public void method_16794() {
      this.field_32694.method_26865().method_17240(this.field_32691, 30.0F, 30.0F);
      this.field_32692--;
   }
}
