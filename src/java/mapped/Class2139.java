package mapped;

import net.minecraft.util.SoundEvent;

public enum Class2139 {
   field14003(Sounds.field27183),
   field14004(Sounds.field27184);

   private final SoundEvent field14005;
   private static final Class2139[] field14006 = new Class2139[]{field14003, field14004};

   private Class2139(SoundEvent var3) {
      this.field14005 = var3;
   }

   public void method8832(SoundHandler var1) {
      var1.method1000(MinecraftSoundManager.method19293(this.field14005, 1.0F, 1.0F));
   }
}
