package remapped;

import java.io.IOException;

public class class_4928 extends class_2955 {
   private int field_25495;
   private int field_25493;
   private int field_25494;
   private double field_25496;

   public class_4928() {
      super("FD Hint Sample Entry");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_25495 = (int)var1.method_27524(2);
      this.field_25493 = (int)var1.method_27524(2);
      this.field_25494 = (int)var1.method_27524(2);
      this.field_25496 = var1.method_27530(8, 8);
      this.method_18110(var1);
   }

   public int method_22592() {
      return this.field_25494;
   }

   public double method_22591() {
      return this.field_25496;
   }
}
