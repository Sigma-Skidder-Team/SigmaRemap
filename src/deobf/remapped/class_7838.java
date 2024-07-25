package remapped;

import java.io.IOException;

public class class_7838 extends class_6926 {
   private class_1237 field_39735;
   private class_1237[] field_39734;

   public class_7838() {
      super("IPMP Control Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_39735 = class_1237.method_5492(var1);
      int var4 = var1.method_27531();
      this.field_39734 = new class_1237[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_39734[var5] = class_1237.method_5492(var1);
      }
   }

   public class_1237 method_35468() {
      return this.field_39735;
   }

   public class_1237[] method_35469() {
      return this.field_39734;
   }
}
