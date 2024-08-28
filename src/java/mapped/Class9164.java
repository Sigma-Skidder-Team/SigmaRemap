package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;

public class Class9164 {
   private static String[] field42070;
   private Minecraft field42071 = Minecraft.getInstance();

   public void method34210() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   private void method34211(TickEvent var1) {
   }
}
