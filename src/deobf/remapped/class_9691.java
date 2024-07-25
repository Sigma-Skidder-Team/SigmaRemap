package remapped;

import java.util.EnumSet;

public class class_9691 extends class_3599 {
   private static String[] field_49304;
   private final class_5886 field_49308;
   private double field_49306;
   private double field_49305;
   private int field_49307;

   public class_9691(class_5886 var1) {
      this.field_49308 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      return this.field_49308.method_26594().nextFloat() < 0.02F;
   }

   @Override
   public boolean method_16799() {
      return this.field_49307 >= 0;
   }

   @Override
   public void method_16796() {
      double var3 = (Math.PI * 2) * this.field_49308.method_26594().nextDouble();
      this.field_49306 = Math.cos(var3);
      this.field_49305 = Math.sin(var3);
      this.field_49307 = 20 + this.field_49308.method_26594().nextInt(20);
   }

   @Override
   public void method_16794() {
      this.field_49307--;
      this.field_49308
         .method_26865()
         .method_17230(this.field_49308.method_37302() + this.field_49306, this.field_49308.method_37388(), this.field_49308.method_37156() + this.field_49305);
   }
}
