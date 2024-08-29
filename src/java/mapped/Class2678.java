package mapped;

import java.util.EnumSet;

public class Class2678 extends Class2595 {
   private static String[] field17073;
   public final Class1100 field17074;

   public Class2678(Class1100 var1) {
      this.field17074 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return !this.field17074.method4228().method20811() && Class1100.method5283(this.field17074).nextInt(7) == 0;
   }

   @Override
   public boolean method10806() {
      return false;
   }

   @Override
   public void method10805() {
      BlockPos var3 = this.field17074.method5271();
      if (var3 == null) {
         var3 = this.field17074.getPosition();
      }

      for (int var4 = 0; var4 < 3; var4++) {
         BlockPos var5 = var3.method8336(
            Class1100.method5284(this.field17074).nextInt(15) - 7,
            Class1100.method5285(this.field17074).nextInt(11) - 5,
            Class1100.method5286(this.field17074).nextInt(15) - 7
         );
         if (this.field17074.world.method7007(var5)) {
            Class1100.method5287(this.field17074)
               .method20813((double)var5.getX() + 0.5, (double)var5.getY() + 0.5, (double)var5.getZ() + 0.5, 0.25);
            if (this.field17074.method4232() == null) {
               this.field17074
                  .method4227()
                  .method28042((double)var5.getX() + 0.5, (double)var5.getY() + 0.5, (double)var5.getZ() + 0.5, 180.0F, 20.0F);
            }
            break;
         }
      }
   }
}
