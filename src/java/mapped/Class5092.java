package mapped;

import java.util.Random;

public class Class5092 implements Class5093 {
   private static String[] field23179;
   public Effect field23180;

   public void method15575(Random var1) {
      int var4 = var1.nextInt(5);
      if (var4 > 1) {
         if (var4 > 2) {
            if (var4 > 3) {
               if (var4 <= 4) {
                  this.field23180 = Effects.INVISIBILITY;
               }
            } else {
               this.field23180 = Effects.REGENERATION;
            }
         } else {
            this.field23180 = Effects.STRENGTH;
         }
      } else {
         this.field23180 = Effects.SPEED;
      }
   }
}
