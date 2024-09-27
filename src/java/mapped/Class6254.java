package mapped;

import com.mentalfrostbyte.jello.viaversion.data.PlayerData;
import com.mentalfrostbyte.jello.viaversion.managers.ResourceManager;

public class Class6254 extends Class6255 {
   @Override
   public String method19220() {
      return "probe";
   }

   @Override
   public String method19221() {
      return "Forces ViaVersion to scan server protocol versions "
         + (((ResourceManager) ViaVersion3.method27612()).setVelocityPingInterval() != -1 ? "(Also happens at an interval)" : "");
   }

   @Override
   public boolean method19222(PlayerData var1, String[] var2) {
      Class512.method1894().run();
      this.method19227(var1, "&6Started searching for protocol versions", new Object[0]);
      return true;
   }
}
