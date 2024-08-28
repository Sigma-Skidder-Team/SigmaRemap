package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7061 implements Class7052<Class42> {
   public Class42 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(192L);
      int var6 = var1.readInt();
      var3.method29769(64L * (long)var6);
      long[] var7 = new long[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = var1.readLong();
      }

      return new Class42(var7);
   }

   @Override
   public String method21975() {
      return "LONG[]";
   }

   @Override
   public String method21976() {
      return "TAG_Long_Array";
   }
}
