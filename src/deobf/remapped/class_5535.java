package remapped;

import java.io.IOException;

public class class_5535 extends class_6926 {
   private static String[] field_28213;
   private String field_28215;
   private String field_28214;

   public class_5535(String var1) {
      super(var1);
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_25141(var1);
      this.field_28214 = var1.method_27538((int)this.method_18113(var1));
   }

   public void method_25141(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_28215 = class_504.method_2502(var1.method_27524(2));
   }

   public String method_25140() {
      return this.field_28215;
   }

   public String method_25142() {
      return this.field_28214;
   }
}
