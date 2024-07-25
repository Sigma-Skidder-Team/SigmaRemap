package remapped;

import java.io.IOException;

public class class_1202 extends class_2159 {
   private int field_6711;
   private int field_6710;

   public class_1202() {
      super("H.263 Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_10051(var1);
      this.field_6711 = var1.method_27531();
      this.field_6710 = var1.method_27531();
   }

   public int method_5325() {
      return this.field_6711;
   }

   public int method_5324() {
      return this.field_6710;
   }
}
