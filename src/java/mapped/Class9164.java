package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;

public class Class9164 {
   private static String[] field42070;
   private Minecraft field42071 = Minecraft.getInstance();

   public void method34210() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   private void method34211(Class4428 var1) {
   }
}
