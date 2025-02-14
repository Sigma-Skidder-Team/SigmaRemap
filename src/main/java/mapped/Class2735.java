package mapped;

import java.util.EnumSet;

public class Class2735 extends Class2595 {
   private static String[] field17255;
   private final SlimeEntity field17256;

   public Class2735(SlimeEntity var1) {
      this.field17256 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
      var1.method4230().method21674(true);
   }

   @Override
   public boolean method10803() {
      return (this.field17256.isInWater() || this.field17256.isInLava()) && this.field17256.method4228() instanceof Class6841;
   }

   @Override
   public void method10805() {
      if (this.field17256.getRNG().nextFloat() < 0.8F) {
         this.field17256.method4229().method27049();
      }

      ((Class6841)this.field17256.method4228()).method20823(1.2);
   }
}
