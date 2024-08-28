package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class Class2588 implements Class2586<LongArgumentType> {
   public void method10796(LongArgumentType var1, PacketBuffer var2) {
      boolean var5 = var1.getMinimum() != Long.MIN_VALUE;
      boolean var6 = var1.getMaximum() != Long.MAX_VALUE;
      var2.writeByte(Class6397.method19494(var5, var6));
      if (var5) {
         var2.writeLong(var1.getMinimum());
      }

      if (var6) {
         var2.writeLong(var1.getMaximum());
      }
   }

   public LongArgumentType method10795(PacketBuffer var1) {
      byte var4 = var1.readByte();
      long var5 = !Class6397.method19495(var4) ? Long.MIN_VALUE : var1.readLong();
      long var7 = !Class6397.method19496(var4) ? Long.MAX_VALUE : var1.readLong();
      return LongArgumentType.longArg(var5, var7);
   }

   @Override
   public void method10794(LongArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Long.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Long.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
