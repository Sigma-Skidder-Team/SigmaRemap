package remapped;

import java.io.IOException;

public class class_7707 extends class_6926 {
   private long field_39105;

   public class_7707() {
      super("Movie Fragment Random Access Offset Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_39105 = var1.method_27524(4);
   }

   public long method_34889() {
      return this.field_39105;
   }
}
