package remapped;

import java.io.IOException;

public class class_7719 extends class_6926 {
   private int field_39136;
   private int field_39139;
   private String field_39142;
   private String field_39137;
   private String field_39141;
   private long field_39140;
   private class_7866 field_39143;

   public class_7719() {
      super("Item Information Entry");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      if (this.field_35590 == 0 || this.field_35590 == 1) {
         this.field_39136 = (int)var1.method_27524(2);
         this.field_39139 = (int)var1.method_27524(2);
         this.field_39142 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         this.field_39137 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
         this.field_39141 = var1.method_27539((int)this.method_18113(var1), "UTF-8");
      }

      if (this.field_35590 == 1 && this.method_18113(var1) > 0L) {
         this.field_39140 = var1.method_27524(4);
         if (this.method_18113(var1) > 0L) {
            this.field_39143 = class_7866.method_35607((int)this.field_39140);
            if (this.field_39143 != null) {
               this.field_39143.method_35605(var1);
            }
         }
      }
   }

   public int method_34914() {
      return this.field_39136;
   }

   public int method_34919() {
      return this.field_39139;
   }

   public String method_34918() {
      return this.field_39142;
   }

   public String method_34915() {
      return this.field_39137;
   }

   public String method_34920() {
      return this.field_39141;
   }

   public long method_34917() {
      return this.field_39140;
   }

   public class_7866 method_34916() {
      return this.field_39143;
   }
}
