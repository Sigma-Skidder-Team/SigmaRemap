package mapped;

import com.google.common.base.Preconditions;
import com.mentalfrostbyte.jello.viaversion.data.PlayerHandler;
import com.mentalfrostbyte.jello.viaversion.event.EventHandler;
import com.mentalfrostbyte.jello.viaversion.managers.AbstractResourceManager;

public class ViaVersion3 {
   private static Class8006 field34549;
   private static ViaVersion1 field34550;

   public static void initialize(ViaVersion1 var0) {
      field34549 = var0.method34423();
      field34550 = var0;
   }

   public static PlayerHandler method27611() {
      Preconditions.checkArgument(field34549 != null, "ViaVersion has not loaded the Platform");
      return field34549.getEventHandler();
   }

   public static AbstractResourceManager method27612() {
      Preconditions.checkArgument(field34549 != null, "ViaVersion has not loaded the Platform");
      return field34549.getResourceManager();
   }

   public static Class8006 method27613() {
      return field34549;
   }

   public static ViaVersion1 getInstance() {
      return field34550;
   }
}
