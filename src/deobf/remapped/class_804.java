package remapped;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class class_804 extends class_4403 {
   @Override
   public String method_20527() {
      return "displayleaks";
   }

   @Override
   public String method_20529() {
      return "Try to hunt memory leaks!";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      if (ResourceLeakDetector.getLevel() == Level.ADVANCED) {
         ResourceLeakDetector.setLevel(Level.DISABLED);
      } else {
         ResourceLeakDetector.setLevel(Level.ADVANCED);
      }

      this.method_20528(var1, "&6Leak detector is now %s", new Object[]{ResourceLeakDetector.getLevel() != Level.ADVANCED ? "&cdisabled" : "&aenabled"});
      return true;
   }
}
