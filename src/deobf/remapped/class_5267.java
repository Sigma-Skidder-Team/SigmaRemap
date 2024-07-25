package remapped;

import java.io.IOException;

public class class_5267 extends class_6926 {
   private String field_26923;
   private byte[] field_26924;

   public class_5267() {
      super("ID3 Tag Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_26923 = class_504.method_2502(var1.method_27524(2));
      this.field_26924 = new byte[(int)this.method_18113(var1)];
      var1.method_27525(this.field_26924);
   }

   public byte[] method_24032() {
      return this.field_26924;
   }

   public String method_24033() {
      return this.field_26923;
   }
}
