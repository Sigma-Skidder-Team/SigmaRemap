package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9044 extends Screen implements class_4361 {
   private static final class_4639 field_46301 = new class_4639("textures/gui/advancements/window.png");
   private static final class_4639 field_46297 = new class_4639("textures/gui/advancements/tabs.png");
public class class_9044 extends Screen implements class_4361 {
   private static final Identifier field_46301 = new Identifier("textures/gui/advancements/window.png");
   private static final Identifier field_46297 = new Identifier("textures/gui/advancements/tabs.png");
   private static final ITextComponent field_46295 = new TranslationTextComponent("advancements.sad_label");
   private static final ITextComponent field_46302 = new TranslationTextComponent("advancements.empty");
   private static final ITextComponent field_46298 = new TranslationTextComponent("gui.advancements");
   private final class_5692 field_46303;
   private final Map<class_3139, class_7797> field_46300 = Maps.newLinkedHashMap();
   private class_7797 field_46294;
   private boolean field_46299;

   public class_9044(class_5692 var1) {
      super(NarratorChatListener.field_38486);
      this.field_46303 = var1;
   }

   @Override
   public void method_1163() {
      this.field_46300.clear();
      this.field_46294 = null;
      this.field_46303.method_25747(this);
      if (this.field_46294 == null && !this.field_46300.isEmpty()) {
         this.field_46303.method_25746(this.field_46300.values().iterator().next().method_35369(), true);
      } else {
         this.field_46303.method_25746(this.field_46294 != null ? this.field_46294.method_35369() : null, true);
      }
   }

   @Override
   public void method_1162() {
      this.field_46303.method_25747((class_4361)null);
      class_1092 var3 = this.field_943.method_8614();
      if (var3 != null) {
         var3.method_4813(class_3906.method_18086());
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0) {
         int var8 = (this.field_941 - 252) / 2;
         int var9 = (this.field_940 - 140) / 2;

         for (class_7797 var11 : this.field_46300.values()) {
            if (var11.method_35368(var8, var9, var1, var3)) {
               this.field_46303.method_25746(var11.method_35369(), true);
               break;
            }
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.field_943.gameOptions.keyAdvancements.method_27062(var1, var2)) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609((Screen)null);
         this.field_943.field_9625.method_39834();
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      int var7 = (this.field_941 - 252) / 2;
      int var8 = (this.field_940 - 140) / 2;
      this.method_1183(var1);
      this.method_41521(var1, var2, var3, var7, var8);
      this.method_41519(var1, var7, var8);
      this.method_41523(var1, var2, var3, var7, var8);
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (var5 == 0) {
         if (this.field_46299) {
            if (this.field_46294 != null) {
               this.field_46294.method_35370(var6, var8);
            }
         } else {
            this.field_46299 = true;
         }

         return true;
      } else {
         this.field_46299 = false;
         return false;
      }
   }

   private void method_41521(class_7966 var1, int var2, int var3, int var4, int var5) {
      class_7797 var8 = this.field_46294;
      if (var8 != null) {
         RenderSystem.method_16438();
         RenderSystem.method_16413((float)(var4 + 9), (float)(var5 + 18), 0.0F);
         var8.method_35364(var1);
         RenderSystem.method_16489();
         RenderSystem.method_16457(515);
         RenderSystem.method_16491();
      } else {
         method_9774(var1, var4 + 9, var5 + 18, var4 + 9 + 234, var5 + 18 + 113, -16777216);
         int var9 = var4 + 9 + 117;
         method_9788(var1, this.field_948, field_46302, var9, var5 + 18 + 56 - 4, -1);
         method_9788(var1, this.field_948, field_46295, var9, var5 + 18 + 113 - 9, -1);
      }
   }

   public void method_41519(class_7966 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      this.field_943.getTextureManager().bindTexture(field_46301);
      this.method_9781(var1, var2, var3, 0, 0, 252, 140);
      if (this.field_46300.size() > 1) {
         this.field_943.getTextureManager().bindTexture(field_46297);

         for (class_7797 var7 : this.field_46300.values()) {
            var7.method_35361(var1, var2, var3, var7 == this.field_46294);
         }

         RenderSystem.method_16381();
         RenderSystem.defaultBlendFunc();

         for (class_7797 var9 : this.field_46300.values()) {
            var9.method_35365(var2, var3, this.field_945);
         }

         RenderSystem.disableBlend();
      }

      this.field_948.method_45378(var1, field_46298, (float)(var2 + 8), (float)(var3 + 6), 4210752);
   }

   private void method_41523(class_7966 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.field_46294 != null) {
         RenderSystem.method_16438();
         RenderSystem.enableDepthTest();
         RenderSystem.method_16413((float)(var4 + 9), (float)(var5 + 18), 400.0F);
         this.field_46294.method_35363(var1, var2 - var4 - 9, var3 - var5 - 18, var4, var5);
         RenderSystem.method_16491();
         RenderSystem.method_16489();
      }

      if (this.field_46300.size() > 1) {
         for (class_7797 var9 : this.field_46300.values()) {
            if (var9.method_35368(var4, var5, (double)var2, (double)var3)) {
               this.method_1176(var1, var9.method_35371(), var2, var3);
            }
         }
      }
   }

   public void Ꮀ玑哝뚔뚔瀳(class_3139 var1) {
      class_7797 var4 = class_7797.method_35367(this.field_943, this, this.field_46300.size(), var1);
      if (var4 != null) {
         this.field_46300.put(var1, var4);
      }
   }

   public void 唟䩜待硙眓渺(class_3139 var1) {
   }

   public void 侃㮃ꁈ䁞쥅揩(class_3139 var1) {
      class_7797 var4 = this.method_41520(var1);
      if (var4 != null) {
         var4.method_35359(var1);
      }
   }

   public void 펊붃㹔睬岋㱙(class_3139 var1) {
   }

   public void 驋㥇醧瀧贞亟(class_3139 var1, class_3604 var2) {
      class_4604 var5 = this.method_41522(var1);
      if (var5 != null) {
         var5.method_21339(var2);
      }
   }

   public void 펊붛䈔侃뼢贞(class_3139 var1) {
      this.field_46294 = this.field_46300.get(var1);
   }

   public void 낛躚䕦ꈍࢹ属() {
      this.field_46300.clear();
      this.field_46294 = null;
   }

   @Nullable
   public class_4604 method_41522(class_3139 var1) {
      class_7797 var4 = this.method_41520(var1);
      return var4 != null ? var4.method_35366(var1) : null;
   }

   @Nullable
   private class_7797 method_41520(class_3139 var1) {
      while (var1.method_14510() != null) {
         var1 = var1.method_14510();
      }

      return this.field_46300.get(var1);
   }
}
