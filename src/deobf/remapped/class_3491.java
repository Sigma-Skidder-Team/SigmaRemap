package remapped;

import java.io.IOException;

public class class_3491 implements Packet<class_392> {
   private static String[] field_17142;
   private int field_17139;
   private double field_17140;
   private double field_17144;
   private double field_17141;
   private int field_17143;

   public class_3491() {
   }

   public class_3491(class_5614 var1) {
      this.field_17139 = var1.method_37145();
      this.field_17140 = var1.method_37302();
      this.field_17144 = var1.method_37309();
      this.field_17141 = var1.method_37156();
      this.field_17143 = var1.method_25471();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_17139 = var1.method_37778();
      this.field_17140 = var1.readDouble();
      this.field_17144 = var1.readDouble();
      this.field_17141 = var1.readDouble();
      this.field_17143 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_17139);
      var1.writeDouble(this.field_17140);
      var1.writeDouble(this.field_17144);
      var1.writeDouble(this.field_17141);
      var1.writeShort(this.field_17143);
   }

   public void method_16048(class_392 var1) {
      var1.method_1934(this);
   }

   public int method_16045() {
      return this.field_17139;
   }

   public double method_16046() {
      return this.field_17140;
   }

   public double method_16044() {
      return this.field_17144;
   }

   public double method_16043() {
      return this.field_17141;
   }

   public int method_16049() {
      return this.field_17143;
   }
}
