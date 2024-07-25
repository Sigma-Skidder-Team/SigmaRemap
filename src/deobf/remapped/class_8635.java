package remapped;

import java.io.IOException;

public class class_8635 implements class_6310<class_1243> {
   private static String[] field_44280;
   private int field_44279;
   private int field_44281;

   public class_8635() {
   }

   public class_8635(int var1, int var2) {
      this.field_44279 = var1;
      this.field_44281 = var2;
   }

   public void method_39641(class_1243 var1) {
      var1.method_5566(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_44279 = var1.readByte();
      this.field_44281 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_44279);
      var1.writeByte(this.field_44281);
   }

   public int method_39639() {
      return this.field_44279;
   }

   public int method_39640() {
      return this.field_44281;
   }
}
