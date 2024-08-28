package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7058 implements Class7052<Class29> {
   public Class29 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(192L);
      int var6 = var1.readInt();
      var3.method29769(8L * (long)var6);
      byte[] var7 = new byte[var6];
      var1.readFully(var7);
      return new Class29(var7);
   }

   @Override
   public String method21975() {
      return "BYTE[]";
   }

   @Override
   public String method21976() {
      return "TAG_Byte_Array";
   }
}
