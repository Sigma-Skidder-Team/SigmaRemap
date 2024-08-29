package mapped;

import java.util.Random;

public class MusicTicker {
   private static String[] field41438;
   private final Random field41439 = new Random();
   private final Minecraft field41440;
   private Class6340 field41441;
   private int field41442 = 100;

   public MusicTicker(Minecraft var1) {
      this.field41440 = var1;
   }

   public void tick() {
      BackgroundMusicSelector var3 = this.field41440.getBackgroundMusicSelector();
      if (this.field41441 != null) {
         if (!var3.method12189().method36383().equals(this.field41441.method19279()) && var3.method12192()) {
            this.field41440.getSoundHandler().method1009(this.field41441);
            this.field41442 = MathHelper.method37782(this.field41439, 0, var3.method12190() / 2);
         }

         if (!this.field41440.getSoundHandler().method1010(this.field41441)) {
            this.field41441 = null;
            this.field41442 = Math.min(this.field41442, MathHelper.method37782(this.field41439, var3.method12190(), var3.method12191()));
         }
      }

      this.field41442 = Math.min(this.field41442, var3.method12191());
      if (this.field41441 == null && this.field41442-- <= 0) {
         this.method33667(var3);
      }
   }

   public void method33667(BackgroundMusicSelector var1) {
      this.field41441 = MinecraftSoundManager.method19294(var1.method12189());
      if (this.field41441.method19281() != SoundHandler.field1051) {
         this.field41440.getSoundHandler().method1000(this.field41441);
      }

      this.field41442 = Integer.MAX_VALUE;
   }

   public void method33668() {
      if (this.field41441 != null) {
         this.field41440.getSoundHandler().method1009(this.field41441);
         this.field41441 = null;
      }

      this.field41442 += 100;
   }

   public boolean isBackgroundMusicPlaying(BackgroundMusicSelector var1) {
      return this.field41441 != null ? var1.method12189().method36383().equals(this.field41441.method19279()) : false;
   }
}
