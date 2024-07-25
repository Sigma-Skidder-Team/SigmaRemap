package remapped;

import java.io.IOException;

public class class_500 extends class_6926 {
   private byte[] field_3114;

   public class_500() {
      super("OMA Content Object Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = (int)var1.method_27524(4);
      this.field_3114 = new byte[var4];
      var1.method_27525(this.field_3114);
   }

   public byte[] method_2488() {
      return this.field_3114;
   }
}
