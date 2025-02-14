package mapped;

import java.util.EnumSet;

public class Class2693 extends Class2692 {
   private static String[] field17134;
   private int field17135;
   public final FoxEntity field17133;

   public Class2693(FoxEntity var1) {
      super(var1);
      this.field17133 = var1;
      this.field17135 = FoxEntity.method5177(this.field17133).nextInt(140);
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658, Class2240.field14659));
   }

   @Override
   public boolean method10803() {
      return this.field17133.moveStrafing == 0.0F && this.field17133.moveVertical == 0.0F && this.field17133.moveForward == 0.0F
         ? this.method10912() || this.field17133.isSleeping()
         : false;
   }

   @Override
   public boolean method10806() {
      return this.method10912();
   }

   private boolean method10912() {
      if (this.field17135 > 0) {
         this.field17135--;
         return false;
      } else {
         return this.field17133.world.method6740() && this.method10910() && !this.method10911();
      }
   }

   @Override
   public void method10807() {
      this.field17135 = FoxEntity.method5178(this.field17133).nextInt(140);
      FoxEntity.method5167(this.field17133);
   }

   @Override
   public void method10804() {
      this.field17133.method5130(false);
      this.field17133.method5143(false);
      this.field17133.method5144(false);
      this.field17133.setJumping(false);
      FoxEntity.method5179(this.field17133, true);
      this.field17133.method4230().method21666();
      this.field17133.method4228().method20813(this.field17133.getPosX(), this.field17133.getPosY(), this.field17133.getPosZ(), 0.0);
   }
}
