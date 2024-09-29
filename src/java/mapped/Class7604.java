package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.advancements.Advancement;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class7604 implements Class7601 {
   private static String[] field32643;
   private final Advancement field32644;
   private boolean field32645;

   public Class7604(Advancement var1) {
      this.field32644 = var1;
   }

   @Override
   public Class2139 method24894(MatrixStack var1, ToastGui var2, long var3) {
      var2.method5915().getTextureManager().bindTexture(field32630);
      RenderSystem.method27890(1.0F, 1.0F, 1.0F);
      Class9272 var7 = this.field32644.method27027();
      var2.blit(var1, 0, 0, 0, 0, this.method24898(), this.method24899());
      if (var7 == null) {
         return Class2139.field14004;
      } else {
         List<Class9125> var8 = var2.method5915().fontRenderer.trimStringToWidth(var7.method34934(), 125);
         int var9 = var7.method34938() != Class1965.field12815 ? 16776960 : 16746751;
         if (var8.size() != 1) {
            short var10 = 1500;
            float var11 = 300.0F;
            if (var3 >= 1500L) {
               int var12 = MathHelper.floor(MathHelper.clamp((float)(var3 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int var13 = this.method24899() / 2 - var8.size() * 9 / 2;

               for (Class9125 var15 : var8) {
                  var2.method5915().fontRenderer.method38804(var1, var15, 30.0F, (float)var13, 16777215 | var12);
                  var13 += 9;
               }
            } else {
               int var16 = MathHelper.floor(MathHelper.clamp((float)(1500L - var3) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               var2.method5915().fontRenderer.func_243248_b(var1, var7.method34938().method8245(), 30.0F, 11.0F, var9 | var16);
            }
         } else {
            var2.method5915().fontRenderer.func_243248_b(var1, var7.method34938().method8245(), 30.0F, 7.0F, var9 | 0xFF000000);
            var2.method5915().fontRenderer.method38804(var1, (Class9125)var8.get(0), 30.0F, 18.0F, -1);
         }

         if (!this.field32645 && var3 > 0L) {
            this.field32645 = true;
            if (var7.method34938() == Class1965.field12815) {
               var2.method5915().getSoundHandler().method1000(MinecraftSoundManager.method19293(SoundEvents.field27182, 1.0F, 1.0F));
            }
         }

         var2.method5915().getItemRenderer().method794(var7.method34936(), 8, 8);
         return var3 < 5000L ? Class2139.field14003 : Class2139.field14004;
      }
   }
}
