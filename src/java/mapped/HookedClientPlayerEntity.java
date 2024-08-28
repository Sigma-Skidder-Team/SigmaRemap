package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.unmapped.Class1537;

import java.util.UUID;

public class HookedClientPlayerEntity extends ClientPlayerEntity {
   private static UUID field6151 = UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7");

   public HookedClientPlayerEntity(Minecraft var1, Class1656 var2, ClientPlayNetHandler var3, Class8286 var4, Class6943 var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void onUpdateWalkingPlayer() {
      Class4404 var3 = new Class4404();
      Client.getInstance().getEventManager().call(var3);
      if (!var3.isCancelled()) {
         super.onUpdateWalkingPlayer();
      }
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      Class4435 var5 = new Class4435(var2);
      Client.getInstance().getEventManager().call(var5);
      if (!var5.isCancelled()) {
         super.move(var1, new Vector3d(var5.method13992(), var5.method13994(), var5.method13996()));
      }
   }

   @Override
   public void pushOutOfBlocks(double var1, double var3, double var5) {
      Class4425 var9 = new Class4425();
      Client.getInstance().getEventManager().call(var9);
      if (!var9.isCancelled()) {
         super.pushOutOfBlocks(var1, var3, var5);
      }
   }

   @Override
   public void tick() {
      TickEvent var3 = new TickEvent();
      if (Class1537.field8342 && this.field5055 > 1000) {
         try {
            if (this.field5055 % 150 == 0) {
               Thread.sleep((long)(1800.0 + 7000.0 * Math.random()));
            } else if (this.field5055 % 42 == 0 && Math.random() > 0.2F) {
               Thread.sleep((long)(200.0 + 300.0 * Math.random()));
            }
         } catch (InterruptedException var5) {
         }
      }

      Client.getInstance().getEventManager().call(var3);
      if (!var3.isCancelled()) {
         super.tick();
      }
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      Client.getInstance().getEventManager().call(new Class4409());
   }
}
