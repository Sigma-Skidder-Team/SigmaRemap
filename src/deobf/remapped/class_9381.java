package remapped;

import java.io.IOException;

public class class_9381 implements Packet<class_392> {
   private static String[] field_47948;
   private int field_47947;
   private class_2795 field_47949;
   private int field_47950;
   private int field_47944;
   private boolean field_47946;
   private boolean field_47945;

   public class_9381() {
   }

   public class_9381(int var1, class_2795 var2, int var3, int var4, boolean var5, boolean var6) {
      this.field_47947 = var1;
      this.field_47949 = var2;
      this.field_47950 = var3;
      this.field_47944 = var4;
      this.field_47946 = var5;
      this.field_47945 = var6;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_47947 = var1.method_37778();
      this.field_47949 = class_2795.method_12714(var1);
      this.field_47950 = var1.method_37778();
      this.field_47944 = var1.method_37778();
      this.field_47946 = var1.readBoolean();
      this.field_47945 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_47947);
      this.field_47949.method_12712(var1);
      var1.method_37743(this.field_47950);
      var1.method_37743(this.field_47944);
      var1.writeBoolean(this.field_47946);
      var1.writeBoolean(this.field_47945);
   }

   public void method_43382(class_392 var1) {
      var1.method_1975(this);
   }

   public int method_43377() {
      return this.field_47947;
   }

   public class_2795 method_43380() {
      return this.field_47949;
   }

   public int method_43379() {
      return this.field_47950;
   }

   public int method_43376() {
      return this.field_47944;
   }

   public boolean method_43378() {
      return this.field_47946;
   }

   public boolean method_43381() {
      return this.field_47945;
   }
}
