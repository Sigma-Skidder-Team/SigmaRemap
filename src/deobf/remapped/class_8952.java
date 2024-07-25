package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_8952 implements class_3265<class_6222> {
   public class_6222 method_41102(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(192L);
      int var6 = var1.readInt();
      var3.method_21668(32L * (long)var6);
      int[] var7 = new int[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = var1.readInt();
      }

      return new class_6222(var7);
   }

   @Override
   public String method_14892() {
      return "INT[]";
   }

   @Override
   public String method_14888() {
      return "TAG_Int_Array";
   }
}
