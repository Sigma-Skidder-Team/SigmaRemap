package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_6632 implements class_3265<class_1129> {
   public class_1129 method_30493(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(192L);
      int var6 = var1.readInt();
      var3.method_21668(64L * (long)var6);
      long[] var7 = new long[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = var1.readLong();
      }

      return new class_1129(var7);
   }

   @Override
   public String method_14892() {
      return "LONG[]";
   }

   @Override
   public String method_14888() {
      return "TAG_Long_Array";
   }
}
