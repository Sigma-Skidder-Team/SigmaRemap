package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_7994 implements class_3265<class_473> {
   public class_473 method_36272(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(288L);
      String var6 = var1.readUTF();
      var3.method_21668((long)(16 * var6.length()));
      return class_473.method_2261(var6);
   }

   @Override
   public String method_14892() {
      return "STRING";
   }

   @Override
   public String method_14888() {
      return "TAG_String";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
