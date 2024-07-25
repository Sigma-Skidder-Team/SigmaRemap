package remapped;

import java.io.IOException;

public class class_8879 implements class_6310<class_1243> {
   private static String[] field_45382;
   private int field_45380;
   private int field_45381;

   public class_8879() {
   }

   public class_8879(int var1, int var2) {
      this.field_45380 = var1;
      this.field_45381 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_45380 = var1.method_37778();
      this.field_45381 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_45380);
      var1.method_37743(this.field_45381);
   }

   public void method_40854(class_1243 var1) {
      var1.method_5541(this);
   }

   public int method_40852() {
      return this.field_45380;
   }

   public int method_40851() {
      return this.field_45381;
   }
}
