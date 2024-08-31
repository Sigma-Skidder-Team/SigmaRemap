package mapped;

import com.google.gson.JsonObject;
import net.minecraft.network.PacketBuffer;

public class Class2589 implements Class2586<Class7591> {
   public void method10796(Class7591 var1, PacketBuffer var2) {
      byte var5 = 0;
      if (Class7591.method24868(var1)) {
         var5 = (byte)(var5 | 1);
      }

      var2.writeByte(var5);
   }

   public Class7591 method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      boolean var5 = false;
      return new Class7591(var5);
   }

   @Override
   public void method10794(Class7591 var1, JsonObject var2) {
      var2.addProperty("amount", !Class7591.method24868(var1) ? "single" : "multiple");
   }
}
