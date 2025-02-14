package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum Class2139 {
   field14003(SoundEvents.field27183),
   field14004(SoundEvents.field27184);

   private final SoundEvent field14005;
   private static final Class2139[] field14006 = new Class2139[]{field14003, field14004};

   private Class2139(SoundEvent var3) {
      this.field14005 = var3;
   }

   public void method8832(SoundHandler var1) {
      var1.play(SimpleSound.master(this.field14005, 1.0F, 1.0F));
   }
}
