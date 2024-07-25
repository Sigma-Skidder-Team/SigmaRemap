package remapped;

import java.util.EnumSet;

public class class_2650 extends class_3335 {
   private static String[] field_13049;
   private double field_13047;
   private double field_13045;
   private int field_13048;
   private int field_13046;

   public class_2650(class_5542 var1) {
      super(var1, null);
      this.field_13050 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return this.field_13050.method_26531() == null
         && this.field_13050.method_26594().nextFloat() < 0.02F
         && !this.field_13050.method_26507()
         && this.field_13050.method_17809() == null
         && this.field_13050.method_26927().method_5591()
         && !this.method_15297()
         && !this.field_13050.method_25188()
         && !this.field_13050.method_37382();
   }

   @Override
   public boolean method_16799() {
      return this.field_13046 > 0;
   }

   @Override
   public void method_16796() {
      this.method_11964();
      this.field_13046 = 2 + this.field_13050.method_26594().nextInt(3);
      this.field_13050.method_25196(true);
      this.field_13050.method_26927().method_5620();
   }

   @Override
   public void method_16793() {
      this.field_13050.method_25196(false);
   }

   @Override
   public void method_16794() {
      this.field_13048--;
      if (this.field_13048 <= 0) {
         this.field_13046--;
         this.method_11964();
      }

      this.field_13050
         .method_26865()
         .method_17231(
            this.field_13050.method_37302() + this.field_13047,
            this.field_13050.method_37388(),
            this.field_13050.method_37156() + this.field_13045,
            (float)this.field_13050.method_26903(),
            (float)this.field_13050.method_26862()
         );
   }

   private void method_11964() {
      double var3 = (Math.PI * 2) * this.field_13050.method_26594().nextDouble();
      this.field_13047 = Math.cos(var3);
      this.field_13045 = Math.sin(var3);
      this.field_13048 = 80 + this.field_13050.method_26594().nextInt(20);
   }
}
