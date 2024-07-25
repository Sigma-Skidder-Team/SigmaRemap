package remapped;

import java.io.IOException;

public class class_8125 implements class_6310<class_1243> {
   private static String[] field_41623;
   private boolean field_41624;
   private boolean field_41622;

   public class_8125() {
   }

   public class_8125(boolean var1, boolean var2) {
      this.field_41624 = var1;
      this.field_41622 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41624 = var1.readBoolean();
      this.field_41622 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeBoolean(this.field_41624);
      var1.writeBoolean(this.field_41622);
   }

   public void method_36967(class_1243 var1) {
      var1.method_5553(this);
   }

   public boolean method_36966() {
      return this.field_41624;
   }

   public boolean method_36965() {
      return this.field_41622;
   }
}
