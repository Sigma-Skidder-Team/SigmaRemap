package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7057 implements Class7052<Class34> {
   public Class34 method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(128L);
      return Class34.method93(var1.readDouble());
   }

   @Override
   public String method21975() {
      return "DOUBLE";
   }

   @Override
   public String method21976() {
      return "TAG_Double";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
