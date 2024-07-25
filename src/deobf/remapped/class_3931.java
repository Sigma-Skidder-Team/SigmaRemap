package remapped;

import java.io.IOException;

public class class_3931 implements class_6310<class_392> {
   private static String[] field_19106;
   private double field_19108;
   private double field_19105;
   private double field_19107;
   private float field_19103;
   private float field_19104;

   public class_3931() {
   }

   public class_3931(class_8145 var1) {
      this.field_19108 = var1.method_37302();
      this.field_19105 = var1.method_37309();
      this.field_19107 = var1.method_37156();
      this.field_19103 = var1.field_41701;
      this.field_19104 = var1.field_41755;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19108 = var1.readDouble();
      this.field_19105 = var1.readDouble();
      this.field_19107 = var1.readDouble();
      this.field_19103 = var1.readFloat();
      this.field_19104 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeDouble(this.field_19108);
      var1.writeDouble(this.field_19105);
      var1.writeDouble(this.field_19107);
      var1.writeFloat(this.field_19103);
      var1.writeFloat(this.field_19104);
   }

   public void method_18200(class_392 var1) {
      var1.method_1980(this);
   }

   public double method_18197() {
      return this.field_19108;
   }

   public double method_18199() {
      return this.field_19105;
   }

   public double method_18196() {
      return this.field_19107;
   }

   public float method_18201() {
      return this.field_19103;
   }

   public float method_18195() {
      return this.field_19104;
   }
}
