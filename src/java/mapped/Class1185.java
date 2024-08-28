package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.*;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Class1185 extends Class1178<Class1185> {
   private final Minecraft field6388;
   private final List<Class1152> field6389;
   private final UUID field6390;
   private final String field6391;
   private final Supplier<ResourceLocation> field6392;
   private boolean field6393;
   private Class1206 field6394;
   private Class1206 field6395;
   private final List<Class9125> field6396;
   private final List<Class9125> field6397;
   private float field6398;
   private static final ITextComponent field6399 = new TranslationTextComponent("gui.socialInteractions.status_hidden").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field6400 = new TranslationTextComponent("gui.socialInteractions.status_blocked").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field6401 = new TranslationTextComponent("gui.socialInteractions.status_offline").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field6402 = new TranslationTextComponent("gui.socialInteractions.status_hidden_offline")
      .mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field6403 = new TranslationTextComponent("gui.socialInteractions.status_blocked_offline")
      .mergeStyle(TextFormatting.ITALIC);
   public static final int field6404 = Class9470.method36520(190, 0, 0, 0);
   public static final int field6405 = Class9470.method36520(255, 74, 74, 74);
   public static final int field6406 = Class9470.method36520(255, 48, 48, 48);
   public static final int field6407 = Class9470.method36520(255, 255, 255, 255);
   public static final int field6408 = Class9470.method36520(140, 255, 255, 255);

   public Class1185(Minecraft var1, Class1147 var2, UUID var3, String var4, Supplier<ResourceLocation> var5) {
      this.field6388 = var1;
      this.field6390 = var3;
      this.field6391 = var4;
      this.field6392 = var5;
      this.field6396 = var1.field1294.method38828(new TranslationTextComponent("gui.socialInteractions.tooltip.hide", var4), 150);
      this.field6397 = var1.field1294.method38828(new TranslationTextComponent("gui.socialInteractions.tooltip.show", var4), 150);
      Class9645 var8 = var1.method1578();
      if (!var1.player.getGameProfile().getId().equals(var3) && !var8.method37608(var3)) {
         this.field6394 = new Class1244(this, 0, 0, 20, 20, 0, 38, 20, Class1147.field6215, 256, 256, var4x -> {
            var8.method37604(var3);
            this.method5618(true, new TranslationTextComponent("gui.socialInteractions.hidden_in_chat", var4));
         }, (var3x, var4x, var5x, var6) -> {
            this.field6398 = this.field6398 + var1.method1563();
            if (this.field6398 >= 10.0F) {
               var2.method5491(() -> method5621(var2, var4x, this.field6396, var5x, var6));
            }
         }, new TranslationTextComponent("gui.socialInteractions.hide"));
         this.field6395 = new Class1245(this, 0, 0, 20, 20, 20, 38, 20, Class1147.field6215, 256, 256, var4x -> {
            var8.method37605(var3);
            this.method5618(false, new TranslationTextComponent("gui.socialInteractions.shown_in_chat", var4));
         }, (var3x, var4x, var5x, var6) -> {
            this.field6398 = this.field6398 + var1.method1563();
            if (this.field6398 >= 10.0F) {
               var2.method5491(() -> method5621(var2, var4x, this.field6397, var5x, var6));
            }
         }, new TranslationTextComponent("gui.socialInteractions.show"));
         this.field6395.field6483 = var8.method37607(var3);
         this.field6394.field6483 = !this.field6395.field6483;
         this.field6389 = ImmutableList.of(this.field6394, this.field6395);
      } else {
         this.field6389 = ImmutableList.of();
      }
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var13 = var4 + 4;
      int var14 = var3 + (var6 - 24) / 2;
      int var15 = var13 + 24 + 4;
      ITextComponent var16 = this.method5620();
      int var17;
      if (var16 != StringTextComponent.EMPTY) {
         Class1193.method5686(var1, var4, var3, var4 + var5, var3 + var6, field6406);
         var17 = var3 + (var6 - 18) / 2;
         this.field6388.field1294.method38805(var1, var16, (float)var15, (float)(var17 + 12), field6408);
      } else {
         Class1193.method5686(var1, var4, var3, var4 + var5, var3 + var6, field6405);
         var17 = var3 + (var6 - 9) / 2;
      }

      this.field6388.getTextureManager().bindTexture(this.field6392.get());
      Class1193.method5698(var1, var13, var14, 24, 24, 8.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.enableBlend();
      Class1193.method5698(var1, var13, var14, 24, 24, 40.0F, 8.0F, 8, 8, 64, 64);
      RenderSystem.disableBlend();
      this.field6388.field1294.method38801(var1, this.field6391, (float)var15, (float)var17, field6407);
      if (this.field6393) {
         Class1193.method5686(var1, var13, var14, var13 + 24, var14 + 24, field6404);
      }

      if (this.field6394 != null && this.field6395 != null) {
         float var18 = this.field6398;
         this.field6394.field6477 = var4 + (var5 - this.field6394.method5740() - 4);
         this.field6394.field6478 = var3 + (var6 - this.field6394.method5728()) / 2;
         this.field6394.method1923(var1, var7, var8, var10);
         this.field6395.field6477 = var4 + (var5 - this.field6395.method5740() - 4);
         this.field6395.field6478 = var3 + (var6 - this.field6395.method5728()) / 2;
         this.field6395.method1923(var1, var7, var8, var10);
         if (var18 == this.field6398) {
            this.field6398 = 0.0F;
         }
      }
   }

   @Override
   public List<? extends Class1152> method2468() {
      return this.field6389;
   }

   public String method5615() {
      return this.field6391;
   }

   public UUID method5616() {
      return this.field6390;
   }

   public void method5617(boolean var1) {
      this.field6393 = var1;
   }

   private void method5618(boolean var1, ITextComponent var2) {
      this.field6395.field6483 = var1;
      this.field6394.field6483 = !var1;
      this.field6388.ingameGUI.getChatGUI().method5930(var2);
      NarratorChatListener.INSTANCE.say(var2.getString());
   }

   private IFormattableTextComponent method5619(IFormattableTextComponent var1) {
      ITextComponent var4 = this.method5620();
      return var4 != StringTextComponent.EMPTY
         ? new StringTextComponent(this.field6391).appendString(", ").append(var4).appendString(", ").append(var1)
         : new StringTextComponent(this.field6391).appendString(", ").append(var1);
   }

   private ITextComponent method5620() {
      boolean var3 = this.field6388.method1578().method37607(this.field6390);
      boolean var4 = this.field6388.method1578().method37608(this.field6390);
      if (var4 && this.field6393) {
         return field6403;
      } else if (var3 && this.field6393) {
         return field6402;
      } else if (!var4) {
         if (!var3) {
            return !this.field6393 ? StringTextComponent.EMPTY : field6401;
         } else {
            return field6399;
         }
      } else {
         return field6400;
      }
   }

   private static void method5621(Class1147 var0, MatrixStack var1, List<Class9125> var2, int var3, int var4) {
      var0.method2461(var1, var2, var3, var4);
      var0.method5491((Runnable)null);
   }

   // $VF: synthetic method
   public static IFormattableTextComponent method5628(Class1185 var0, IFormattableTextComponent var1) {
      return var0.method5619(var1);
   }
}
