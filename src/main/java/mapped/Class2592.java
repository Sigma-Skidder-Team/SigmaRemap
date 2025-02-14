package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import net.minecraft.network.PacketBuffer;

public class Class2592 implements Class2586<DoubleArgumentType> {
   public void method10796(DoubleArgumentType var1, PacketBuffer var2) {
      boolean var5 = var1.getMinimum() != -Double.MAX_VALUE;
      boolean var6 = var1.getMaximum() != Double.MAX_VALUE;
      var2.writeByte(Class6397.method19494(var5, var6));
      if (var5) {
         var2.writeDouble(var1.getMinimum());
      }

      if (var6) {
         var2.writeDouble(var1.getMaximum());
      }
   }

   public DoubleArgumentType method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      double var5 = !Class6397.method19495(var4) ? -Double.MAX_VALUE : var1.readDouble();
      double var7 = !Class6397.method19496(var4) ? Double.MAX_VALUE : var1.readDouble();
      return DoubleArgumentType.doubleArg(var5, var7);
   }

   @Override
   public void method10794(DoubleArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Double.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Double.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
