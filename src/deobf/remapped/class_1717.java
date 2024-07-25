package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_1717 implements class_3265<class_5064> {
   public class_5064 method_7695(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(192L);
      int var6 = var1.readInt();
      var3.method_21668(8L * (long)var6);
      byte[] var7 = new byte[var6];
      var1.readFully(var7);
      return new class_5064(var7);
   }

   @Override
   public String method_14892() {
      return "BYTE[]";
   }

   @Override
   public String method_14888() {
      return "TAG_Byte_Array";
   }
}
