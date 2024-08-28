package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7063 implements Class7052<Class33> {
   public Class33 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(72L);
      return Class33.method91(var1.readByte());
   }

   @Override
   public String method21975() {
      return "BYTE";
   }

   @Override
   public String method21976() {
      return "TAG_Byte";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
