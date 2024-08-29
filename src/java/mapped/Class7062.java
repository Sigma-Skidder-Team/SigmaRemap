package mapped;

import java.io.DataInput;
import java.io.IOException;

public final class Class7062 implements Class7052<StringNBT> {
   public StringNBT method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(288L);
      String var6 = var1.readUTF();
      var3.method29769((long)(16 * var6.length()));
      return StringNBT.valueOf(var6);
   }

   @Override
   public String method21975() {
      return "STRING";
   }

   @Override
   public String method21976() {
      return "TAG_String";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
