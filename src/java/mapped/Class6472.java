package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;

public final class Class6472 implements Class6466<Class7921> {
   private static String[] field28419;

   public void method19646(PacketBuffer var1, Class7921 var2) {
      var1.writeVarInt(Registry.field16089.getId(var2.method26570()));
      var1.writeVarInt(Registry.field16090.getId(var2.method26571()));
      var1.writeVarInt(var2.method26572());
   }

   public Class7921 method19645(PacketBuffer var1) {
      return new Class7921(Registry.field16089.method9172(var1.readVarInt()), Registry.field16090.method9172(var1.readVarInt()), var1.readVarInt());
   }

   public Class7921 method19644(Class7921 var1) {
      return var1;
   }
}
