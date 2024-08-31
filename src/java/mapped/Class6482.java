package mapped;

import net.minecraft.network.PacketBuffer;

public final class Class6482 implements Class6466<Class7436> {
   private static String[] field28429;

   public void method19646(PacketBuffer var1, Class7436 var2) {
      var1.writeVarInt(Registry.field16077.method9171(var2.method24011()));
      var2.method24009(var1);
   }

   public Class7436 method19645(PacketBuffer var1) {
      return this.<Class7436>method19648(var1, (Class7434<Class7436>) Registry.field16077.method9172(var1.method35714()));
   }

   private <T extends Class7436> T method19648(PacketBuffer var1, Class7434<T> var2) {
      return (T)var2.method24007().method20912(var2, var1);
   }

   public Class7436 method19644(Class7436 var1) {
      return var1;
   }
}
