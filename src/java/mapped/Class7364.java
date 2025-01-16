package mapped;

import net.minecraft.util.SoundEvents;

public class Class7364 extends Class7362 {
   private static String[] field31524;
   private int field31525;

   public Class7364(EnderDragonEntity var1) {
      super(var1);
   }

   @Override
   public void method23359() {
      this.field31519
         .world
         .method6745(
            this.field31519.getPosX(),
            this.field31519.getPosY(),
            this.field31519.getPosZ(),
            SoundEvents.field26540,
            this.field31519.getSoundCategory(),
            2.5F,
            0.8F + this.field31519.getRNG().nextFloat() * 0.3F,
            false
         );
   }

   @Override
   public void method23360() {
      if (this.field31525++ >= 40) {
         this.field31519.method4336().method32671(Class9598.field44901);
      }
   }

   @Override
   public void method23362() {
      this.field31525 = 0;
   }

   @Override
   public Class9598<Class7364> method23368() {
      return Class9598.field44903;
   }
}
