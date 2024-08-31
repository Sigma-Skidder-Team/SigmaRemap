package mapped;

import net.minecraft.network.play.server.SCooldownPacket;

public class Class6461 extends Class6462 {
   private static String[] field28395;
   private final ServerPlayerEntity field28396;

   public Class6461(ServerPlayerEntity var1) {
      this.field28396 = var1;
   }

   @Override
   public void method19633(Item var1, int var2) {
      super.method19633(var1, var2);
      this.field28396.field4855.sendPacket(new SCooldownPacket(var1, var2));
   }

   @Override
   public void method19634(Item var1) {
      super.method19634(var1);
      this.field28396.field4855.sendPacket(new SCooldownPacket(var1, 0));
   }
}
