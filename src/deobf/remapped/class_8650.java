package remapped;

import java.io.IOException;

public class class_8650 extends class_527 {
   private static String[] field_44314;

   public class_8650() {
      this.field_3215 = true;
   }

   public class_8650(int var1, short var2, short var3, short var4, boolean var5) {
      super(var1);
      this.field_3209 = var2;
      this.field_3213 = var3;
      this.field_3207 = var4;
      this.field_3211 = var5;
      this.field_3215 = true;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      super.method_28775(var1);
      this.field_3209 = var1.readShort();
      this.field_3213 = var1.readShort();
      this.field_3207 = var1.readShort();
      this.field_3211 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      super.method_28776(var1);
      var1.writeShort(this.field_3209);
      var1.writeShort(this.field_3213);
      var1.writeShort(this.field_3207);
      var1.writeBoolean(this.field_3211);
   }
}
