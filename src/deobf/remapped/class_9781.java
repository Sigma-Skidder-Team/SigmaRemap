package remapped;

import java.io.IOException;

public class class_9781 extends class_6926 {
   private String field_49643;
   private String field_49642;

   public class_9781() {
      super("Genre Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      if (this.field_19001.method_34615() != 1969517665L) {
         this.method_18110(var1);
      } else {
         super.method_18109(var1);
         this.field_49643 = class_504.method_2502(var1.method_27524(2));
         byte[] var4 = var1.method_27537((int)this.method_18113(var1), 0);
         this.field_49642 = new String(var4, "UTF-8");
      }
   }

   public String method_45150() {
      return this.field_49643;
   }

   public String method_45149() {
      return this.field_49642;
   }
}
