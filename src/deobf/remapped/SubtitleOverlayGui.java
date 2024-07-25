package remapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class SubtitleOverlayGui extends AbstractGui implements class_4440 {
   private final MinecraftClient field_21493;
   private final List<class_7064> field_21494 = Lists.newArrayList();
   private boolean field_21492;

   public SubtitleOverlayGui(MinecraftClient var1) {
      this.field_21493 = var1;
   }

   public void method_20416(class_7966 var1) {
      if (!this.field_21492 && this.field_21493.gameOptions.field_45445) {
         this.field_21493.getSoundHandler().method_16343(this);
         this.field_21492 = true;
      } else if (this.field_21492 && !this.field_21493.gameOptions.field_45445) {
         this.field_21493.getSoundHandler().method_16347(this);
         this.field_21492 = false;
      }

      if (this.field_21492 && !this.field_21494.isEmpty()) {
         RenderSystem.method_16438();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         class_1343 var4 = new class_1343(
            this.field_21493.thePlayer.getPosX(), this.field_21493.thePlayer.method_37388(), this.field_21493.thePlayer.getPosZ()
         );
         class_1343 var5 = new class_1343(0.0, 0.0, -1.0)
            .method_6212(-this.field_21493.thePlayer.rotationPitch * (float) (Math.PI / 180.0))
            .method_6192(-this.field_21493.thePlayer.rotationYaw * (float) (Math.PI / 180.0));
         class_1343 var6 = new class_1343(0.0, 1.0, 0.0)
            .method_6212(-this.field_21493.thePlayer.rotationPitch * (float) (Math.PI / 180.0))
            .method_6192(-this.field_21493.thePlayer.rotationYaw * (float) (Math.PI / 180.0));
         class_1343 var7 = var5.method_6196(var6);
         int var8 = 0;
         int var9 = 0;
         Iterator var10 = this.field_21494.iterator();

         while (var10.hasNext()) {
            class_7064 var11 = (class_7064)var10.next();
            if (var11.method_32539() + 3000L > Util.getMeasuringTimeMs()) {
               var9 = Math.max(var9, this.field_21493.textRenderer.method_45379(var11.method_32537()));
            } else {
               var10.remove();
            }
         }

         var9 = var9
            + this.field_21493.textRenderer.method_45395("<")
            + this.field_21493.textRenderer.method_45395(" ")
            + this.field_21493.textRenderer.method_45395(">")
            + this.field_21493.textRenderer.method_45395(" ");

         for (class_7064 var12 : this.field_21494) {
            short var13 = 255;
            ITextComponent var14 = var12.method_32537();
            class_1343 var15 = var12.method_32536().method_6194(var4).method_6213();
            double var16 = -var7.method_6206(var15);
            double var18 = -var5.method_6206(var15);
            boolean var20 = var18 > 0.5;
            int var21 = var9 / 2;
            byte var22 = 9;
            int var23 = var22 / 2;
            float var24 = 1.0F;
            int var25 = this.field_21493.textRenderer.method_45379(var14);
            int var26 = class_9299.method_42847(
               class_9299.method_42841(255.0, 75.0, (double)((float)(Util.getMeasuringTimeMs() - var12.method_32539()) / 3000.0F))
            );
            int var27 = var26 << 16 | var26 << 8 | var26;
            RenderSystem.method_16438();
            RenderSystem.method_16413(
               (float)this.field_21493.getMainWindow().getScaledWidth() - (float)var21 * 1.0F - 2.0F,
               (float)(this.field_21493.getMainWindow().getScaledHeight() - 30) - (float)(var8 * (var22 + 1)) * 1.0F,
               0.0F
            );
            RenderSystem.method_16403(1.0F, 1.0F, 1.0F);
            method_9774(var1, -var21 - 1, -var23 - 1, var21 + 1, var23 + 1, this.field_21493.gameOptions.method_40888(0.8F));
            RenderSystem.enableBlend();
            if (!var20) {
               if (!(var16 > 0.0)) {
                  if (var16 < 0.0) {
                     this.field_21493.textRenderer.method_45385(var1, "<", (float)(-var21), (float)(-var23), var27 + -16777216);
                  }
               } else {
                  this.field_21493
                     .textRenderer
                     .method_45385(var1, ">", (float)(var21 - this.field_21493.textRenderer.method_45395(">")), (float)(-var23), var27 + -16777216);
               }
            }

            this.field_21493.textRenderer.method_45378(var1, var14, (float)(-var25 / 2), (float)(-var23), var27 + -16777216);
            RenderSystem.method_16489();
            var8++;
         }

         RenderSystem.disableBlend();
         RenderSystem.method_16489();
      }
   }

   public void 鏟㻣褕붃ꈍ泹(class_3560 var1, class_7633 var2) {
      if (var2.method_34585() != null) {
         ITextComponent var5 = var2.method_34585();
         if (!this.field_21494.isEmpty()) {
            for (class_7064 var7 : this.field_21494) {
               if (var7.method_32537().equals(var5)) {
                  var7.method_32538(new class_1343(var1.method_16548(), var1.method_16557(), var1.method_16561()));
                  return;
               }
            }
         }

         this.field_21494.add(new class_7064(this, var5, new class_1343(var1.method_16548(), var1.method_16557(), var1.method_16561())));
      }
   }
}
