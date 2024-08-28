package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class Class2593 implements Class2586<IntegerArgumentType> {
   public void method10796(IntegerArgumentType var1, PacketBuffer var2) {
      boolean var5 = var1.getMinimum() != Integer.MIN_VALUE;
      boolean var6 = var1.getMaximum() != Integer.MAX_VALUE;
      var2.writeByte(Class6397.method19494(var5, var6));
      if (var5) {
         var2.writeInt(var1.getMinimum());
      }

      if (var6) {
         var2.writeInt(var1.getMaximum());
      }
   }

   public IntegerArgumentType method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      int var5 = !Class6397.method19495(var4) ? Integer.MIN_VALUE : var1.readInt();
      int var6 = !Class6397.method19496(var4) ? Integer.MAX_VALUE : var1.readInt();
      return IntegerArgumentType.integer(var5, var6);
   }

   @Override
   public void method10794(IntegerArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Integer.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Integer.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
