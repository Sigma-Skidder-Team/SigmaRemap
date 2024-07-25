package remapped;

import java.io.IOException;

public class class_8849 implements Packet<class_392> {
   private static String[] field_45253;
   private int field_45254;
   private int field_45255;

   public class_8849() {
   }

   public class_8849(int var1, int var2) {
      this.field_45254 = var1;
      this.field_45255 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_45254 = var1.method_37778();
      this.field_45255 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_45254);
      var1.method_37743(this.field_45255);
   }

   public void method_40712(class_392 var1) {
      var1.method_1948(this);
   }

   public int method_40710() {
      return this.field_45254;
   }

   public int method_40713() {
      return this.field_45255;
   }
}
