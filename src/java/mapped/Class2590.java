package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;
import net.minecraft.network.PacketBuffer;

public class Class2590 implements Class2586<FloatArgumentType> {
   public void method10796(FloatArgumentType var1, PacketBuffer var2) {
      boolean var5 = var1.getMinimum() != -Float.MAX_VALUE;
      boolean var6 = var1.getMaximum() != Float.MAX_VALUE;
      var2.writeByte(Class6397.method19494(var5, var6));
      if (var5) {
         var2.writeFloat(var1.getMinimum());
      }

      if (var6) {
         var2.writeFloat(var1.getMaximum());
      }
   }

   public FloatArgumentType method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      float var5 = !Class6397.method19495(var4) ? -Float.MAX_VALUE : var1.readFloat();
      float var6 = !Class6397.method19496(var4) ? Float.MAX_VALUE : var1.readFloat();
      return FloatArgumentType.floatArg(var5, var6);
   }

   @Override
   public void method10794(FloatArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Float.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Float.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
