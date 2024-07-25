package remapped;

import java.io.IOException;

public class class_2528 extends class_6926 {
   private boolean field_12531;
   private int field_12528;
   private int field_12529;
   private int field_12532;

   public class_2528() {
      super("Sample Scale Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_12531 = (var1.method_27531() & 1) == 1;
      this.field_12528 = var1.method_27531();
      this.field_12529 = (int)var1.method_27524(2);
      this.field_12532 = (int)var1.method_27524(2);
   }

   public boolean method_11521() {
      return this.field_12531;
   }

   public int method_11522() {
      return this.field_12529;
   }

   public int method_11523() {
      return this.field_12532;
   }

   public int method_11524() {
      return this.field_12528;
   }
}
