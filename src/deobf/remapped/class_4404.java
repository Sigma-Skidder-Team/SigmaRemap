package remapped;

import java.io.IOException;

public class class_4404 extends class_2159 {
   private int field_21550;
   private int field_21551;
   private int field_21553;

   public class_4404() {
      super("AMR Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_10051(var1);
      this.field_21550 = (int)var1.method_27524(2);
      this.field_21551 = var1.method_27531();
      this.field_21553 = var1.method_27531();
   }

   public int method_20530() {
      return this.field_21550;
   }

   public int method_20531() {
      return this.field_21551;
   }

   public int method_20532() {
      return this.field_21553;
   }
}
