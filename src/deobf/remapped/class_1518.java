package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_1518 implements class_3265<class_8944> {
   public class_1518(int var1) {
      this.field_8080 = var1;
   }

   public class_8944 method_6938(DataInput var1, int var2, class_4694 var3) throws IOException {
      throw new IllegalArgumentException("Invalid tag id: " + this.field_8080);
   }

   @Override
   public String method_14892() {
      return "INVALID[" + this.field_8080 + "]";
   }

   @Override
   public String method_14888() {
      return "UNKNOWN_" + this.field_8080;
   }
}
