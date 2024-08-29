package mapped;

import net.minecraft.client.Minecraft;

public class Class7314 extends PlayerController {
   private static String[] field31356;

   public Class7314(Minecraft var1, ClientPlayNetHandler var2) {
      super(var1, var2);
   }

   @Override
   public ClientPlayerEntity createPlayer(ClientWorld var1, Class8286 var2, Class6943 var3) {
      return new HookedClientPlayerEntity(this.field31358, var1, this.field31359, var2, var3, false, false);
   }

   @Override
   public ClientPlayerEntity func_239167_a_(ClientWorld var1, Class8286 var2, Class6943 var3, boolean var4, boolean var5) {
      return new HookedClientPlayerEntity(this.field31358, var1, this.field31359, var2, var3, var4, var5);
   }
}
