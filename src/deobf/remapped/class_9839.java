package remapped;

import java.io.IOException;

public class class_9839 extends class_6926 {
   private boolean field_49825;
   private String field_49824;

   public class_9839() {
      super("Data Entry Url Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_49825 = (this.field_35591 & 1) == 1;
      if (!this.field_49825) {
         this.field_49824 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
      }
   }

   public boolean method_45333() {
      return this.field_49825;
   }

   public String method_45334() {
      return this.field_49824;
   }
}
