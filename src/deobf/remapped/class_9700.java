package remapped;

import java.io.IOException;

public class class_9700 extends class_6926 {
   private String field_49343;

   public class_9700() {
      super("Encoder Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      if (this.field_19001.method_34615() != 1768715124L) {
         super.method_18109(var1);
         this.field_49343 = var1.method_27533((int)this.method_18113(var1));
      } else {
         this.method_18110(var1);
      }
   }

   public String method_44827() {
      return this.field_49343;
   }
}
