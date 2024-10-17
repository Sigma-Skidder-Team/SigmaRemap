package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.render.animation.Direction;

import java.util.ArrayList;
import java.util.List;

public class Class4356 extends Class4247 {
   private List<ButtonPanel> field21295 = new ArrayList<ButtonPanel>();
   public int field21296;

   public Class4356(IconPanel var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 200, 18, ColorHelper.field27961, false);
      byte var13 = 0;
      boolean var7 = true;

      for (Class2060 var11 : Class2060.values()) {
         String var10004 = "badge" + var11.field13427;
         var13 += 25;
         Class4245 var12;
         this.addToList(var12 = new Class4245(this, var10004, var13, 0, var11));
         if (var7) {
            var12.field20598 = true;
            this.field21296 = var11.field13428;
         }

         var12.doThis((var1x, var2x) -> {
            for (IconPanel var6 : var1x.getIcoPanel().method13241()) {
               if (var6 instanceof Class4245) {
                  ((Class4245)var6).field20598 = false;
                  ((Class4245)var6).field20599.changeDirection(Direction.BACKWARDS);
               }
            }

            ((Class4245)var1x).field20598 = true;
            ((Class4245)var1x).field20599.changeDirection(Direction.FORWARDS);
            this.field21296 = ((Class4245)var1x).field20597.field13428;
         });
         var7 = false;
      }
   }
}
