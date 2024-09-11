package mapped;

import com.mentalfrostbyte.jello.viaversion.data.PlayerData;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class Class6256 extends Class6255 {
   @Override
   public String method19220() {
      return "displayleaks";
   }

   @Override
   public String method19221() {
      return "Try to hunt memory leaks!";
   }

   @Override
   public boolean method19222(PlayerData var1, String[] var2) {
      if (ResourceLeakDetector.getLevel() == Level.ADVANCED) {
         ResourceLeakDetector.setLevel(Level.DISABLED);
      } else {
         ResourceLeakDetector.setLevel(Level.ADVANCED);
      }

      this.method19227(var1, "&6Leak detector is now %s", new Object[]{ResourceLeakDetector.getLevel() != Level.ADVANCED ? "&cdisabled" : "&aenabled"});
      return true;
   }
}
