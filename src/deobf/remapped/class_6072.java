package remapped;

import java.io.IOException;

public class class_6072 implements class_6310<class_1243> {
   private static String[] field_31084;
   private int field_31083;
   private Identifier field_31081;
   private boolean field_31082;

   public class_6072() {
   }

   public class_6072(int var1, class_8932<?> var2, boolean var3) {
      this.field_31083 = var1;
      this.field_31081 = var2.method_41050();
      this.field_31082 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31083 = var1.readByte();
      this.field_31081 = var1.method_37768();
      this.field_31082 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_31083);
      var1.method_37780(this.field_31081);
      var1.writeBoolean(this.field_31082);
   }

   public void method_27813(class_1243 var1) {
      var1.method_5548(this);
   }

   public int method_27810() {
      return this.field_31083;
   }

   public Identifier method_27812() {
      return this.field_31081;
   }

   public boolean method_27811() {
      return this.field_31082;
   }
}
