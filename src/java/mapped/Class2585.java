package mapped;

import com.google.gson.JsonObject;

public class Class2585 implements Class2586<Class8700> {
   public void method10796(Class8700 var1, PacketBuffer var2) {
      byte var5 = 0;
      if (Class8700.method31356(var1)) {
         var5 = (byte)(var5 | 1);
      }

      if (Class8700.method31357(var1)) {
         var5 = (byte)(var5 | 2);
      }

      var2.writeByte(var5);
   }

   public Class8700 method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      return new Class8700(false, false);
   }

   @Override
   public void method10794(Class8700 var1, JsonObject var2) {
      var2.addProperty("amount", !Class8700.method31356(var1) ? "multiple" : "single");
      var2.addProperty("type", !Class8700.method31357(var1) ? "entities" : "players");
   }
}
