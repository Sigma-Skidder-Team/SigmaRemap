package remapped;

import java.io.IOException;

public class class_5460 extends class_6926 {
   private String field_27815;
   private String field_27816;

   public class_5460() {
      super("Copyright Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      if (this.field_19001.method_34615() != 1969517665L) {
         if (this.field_19001.method_34615() == 1768715124L) {
            this.method_18110(var1);
         }
      } else {
         super.method_18109(var1);
         this.field_27815 = class_504.method_2502(var1.method_27524(2));
         this.field_27816 = var1.method_27538((int)this.method_18113(var1));
      }
   }

   public String method_24851() {
      return this.field_27815;
   }

   public String method_24852() {
      return this.field_27816;
   }
}
