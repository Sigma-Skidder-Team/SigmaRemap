package remapped;

import java.io.IOException;

public class class_8030 extends class_5535 {
   private int field_41103;

   public class_8030() {
      super("3GPP Album Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_41103 = this.method_18113(var1) <= 0L ? -1 : var1.method_27531();
   }

   public int method_36462() {
      return this.field_41103;
   }
}
