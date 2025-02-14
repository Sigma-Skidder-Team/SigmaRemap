package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerController;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.util.ClientRecipeBook;
import net.minecraft.client.world.ClientWorld;

public class Class7314 extends PlayerController {
   private static String[] field31356;

   public Class7314(Minecraft var1, ClientPlayNetHandler var2) {
      super(var1, var2);
   }

   @Override
   public ClientPlayerEntity createPlayer(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3) {
      return new HookedClientPlayerEntity(this.mc, var1, this.connection, var2, var3, false, false);
   }

   @Override
   public ClientPlayerEntity func_239167_a_(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3, boolean var4, boolean var5) {
      return new HookedClientPlayerEntity(this.mc, var1, this.connection, var2, var3, var4, var5);
   }
}
