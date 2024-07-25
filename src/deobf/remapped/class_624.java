package remapped;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

public class class_624 implements class_6310<class_392> {
   private int field_3539;
   private String field_3540;

   public class_624() {
   }

   public class_624(int var1, class_4399 var2) {
      this.field_3539 = var1;
      if (var2 != null) {
         this.field_3540 = var2.method_20490();
      } else {
         this.field_3540 = "";
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_3539 = var1.readByte();
      this.field_3540 = var1.method_37784(16);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_3539);
      var1.method_37760(this.field_3540);
   }

   public void method_2912(class_392 var1) {
      var1.method_1907(this);
   }

   public int method_2910() {
      return this.field_3539;
   }

   @Nullable
   public String method_2911() {
      return !Objects.equals(this.field_3540, "") ? this.field_3540 : null;
   }
}
