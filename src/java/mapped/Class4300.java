package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4300 extends Class4278 {
   private static String[] field20838;
   public int field20839;

   public Class4300(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13304(var7);
      this.method13251((var0, var1x) -> Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(Sounds.field27176, 1.0F)));
      this.field20839 = var8;
   }

   @Override
   public void method13027(float var1) {
      this.method13306(ResourceRegistry.field38868);
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class5628.method17688(this.field20839, !this.method13295() ? 0.25F : (!this.method13298() ? 0.4F : (!this.method13212() ? 0.5F : 0.6F)))
      );
      RenderUtil.method11429(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         2,
         Class5628.method17688(this.field20839, 0.2F)
      );
      RenderUtil.method11440(
         ResourceRegistry.field38868,
         (float)(this.method13263() + this.method13267() / 2),
         (float)(this.method13265() + this.method13269() / 2),
         this.field20912,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, !this.method13295() ? 0.5F : 1.0F),
         Class2218.field14492,
         Class2218.field14492
      );
      super.method13027(var1);
   }
}
