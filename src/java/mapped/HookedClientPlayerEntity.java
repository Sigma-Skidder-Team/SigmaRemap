package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.unmapped.RandomModuleThread;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.util.ClientRecipeBook;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.vector.Vector3d;

import java.util.UUID;

public class HookedClientPlayerEntity extends ClientPlayerEntity {
   private static UUID field6151 = UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7");

   public HookedClientPlayerEntity(Minecraft var1, ClientWorld var2, ClientPlayNetHandler var3, Class8286 var4, ClientRecipeBook var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void onUpdateWalkingPlayer() {
      EventWalkingUpdate var3 = new EventWalkingUpdate();
      Client.getInstance().getEventManager().call(var3);
      if (!var3.isCancelled()) {
         super.onUpdateWalkingPlayer();
      }
   }

   @Override
   public void move(MoverType var1, Vector3d var2) {
      EventMove var5 = new EventMove(var2);
      Client.getInstance().getEventManager().call(var5);
      if (!var5.isCancelled()) {
         super.move(var1, new Vector3d(var5.getX(), var5.getY(), var5.getZ()));
      }
   }

   @Override
   public void pushOutOfBlocks(double var1, double var3, double var5) {
      EventPushBlock var9 = new EventPushBlock();
      Client.getInstance().getEventManager().call(var9);
      if (!var9.isCancelled()) {
         super.pushOutOfBlocks(var1, var3, var5);
      }
   }

   @Override
   public void tick() {
      TickEvent var3 = new TickEvent();
      if (RandomModuleThread.field8342 && this.ticksExisted > 1000) {

      }

      Client.getInstance().getEventManager().call(var3);
      if (!var3.isCancelled()) {
         super.tick();
      }
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      Client.getInstance().getEventManager().call(new EventEntityActionState());
   }
}
