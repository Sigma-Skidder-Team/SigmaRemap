package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7056 implements Class7052<Class32> {
   public Class32 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(96L);
      return Class32.method90(var1.readFloat());
   }

   @Override
   public String method21975() {
      return "FLOAT";
   }

   @Override
   public String method21976() {
      return "TAG_Float";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
