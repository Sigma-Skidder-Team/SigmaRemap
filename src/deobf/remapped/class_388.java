package remapped;

import java.io.IOException;

public class class_388 extends class_6926 {
   private long field_1578;

   public class_388() {
      super("Movie Extends Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = this.field_35590 != 1 ? 4 : 8;
      this.field_1578 = var1.method_27524(var4);
   }

   public long method_1883() {
      return this.field_1578;
   }
}
