package remapped;

import java.io.IOException;

public class class_2854 extends class_6926 {
   private long field_13974;

   public class_2854() {
      super("Movie Fragment Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_13974 = var1.method_27524(4);
   }

   public long method_12970() {
      return this.field_13974;
   }
}
