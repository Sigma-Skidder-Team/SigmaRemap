package remapped;

import java.io.IOException;

public class class_572 extends class_6926 {
   private boolean field_3363;
   private String field_3360;
   private String field_3362;

   public class_572() {
      super("Data Entry Urn Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_3363 = (this.field_35591 & 1) == 1;
      if (!this.field_3363) {
         this.field_3360 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         if (this.method_18113(var1) > 0L) {
            this.field_3362 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         }
      }
   }

   public boolean method_2704() {
      return this.field_3363;
   }

   public String method_2705() {
      return this.field_3360;
   }

   public String method_2703() {
      return this.field_3362;
   }
}
