package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7053 implements Class7052<Class28> {
   public Class28 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(192L);
      int var6 = var1.readInt();
      var3.method29769(32L * (long)var6);
      int[] var7 = new int[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = var1.readInt();
      }

      return new Class28(var7);
   }

   @Override
   public String method21975() {
      return "INT[]";
   }

   @Override
   public String method21976() {
      return "TAG_Int_Array";
   }
}
