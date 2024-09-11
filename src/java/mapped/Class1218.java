package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.datafixers.util.Pair;
import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Class1218 extends Button implements IScreen {
   public static final ResourceLocation field6535 = new ResourceLocation("realms", "textures/gui/realms/slot_frame.png");
   public static final ResourceLocation field6536 = new ResourceLocation("realms", "textures/gui/realms/empty_frame.png");
   public static final ResourceLocation field6537 = new ResourceLocation("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final ResourceLocation field6538 = new ResourceLocation("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final ResourceLocation field6539 = new ResourceLocation("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ITextComponent field6540 = new TranslationTextComponent("mco.configure.world.slot.tooltip.active");
   private static final ITextComponent field6541 = new TranslationTextComponent("mco.configure.world.slot.tooltip.minigame");
   private static final ITextComponent field6542 = new TranslationTextComponent("mco.configure.world.slot.tooltip");
   private final Supplier<RealmsServer> field6543;
   private final Consumer<ITextComponent> field6544;
   private final int field6545;
   private int field6546;
   private Class8638 field6547;

   public Class1218(int var1, int var2, int var3, int var4, Supplier<RealmsServer> var5, Consumer<ITextComponent> var6, int var7, Class7192 var8) {
      super(var1, var2, var3, var4, StringTextComponent.EMPTY, var8);
      this.field6543 = var5;
      this.field6545 = var7;
      this.field6544 = var6;
   }

   @Nullable
   public Class8638 method5775() {
      return this.field6547;
   }

   @Override
   public void tick() {
      this.field6546++;
      RealmsServer var3 = this.field6543.get();
      if (var3 != null) {
         Class6125 var4 = var3.field27451.get(this.field6545);
         boolean var5 = this.field6545 == 4;
         boolean var6;
         String var7;
         long var8;
         String var10;
         boolean var11;
         if (var5) {
            var6 = var3.field27455 == Class2049.field13370;
            var7 = "Minigame";
            var8 = (long)var3.field27458;
            var10 = var3.field27459;
            var11 = var3.field27458 == -1;
         } else {
            var6 = var3.field27456 == this.field6545 && var3.field27455 != Class2049.field13370;
            var7 = var4.method18901(this.field6545);
            var8 = var4.field27431;
            var10 = var4.field27432;
            var11 = var4.field27434;
         }

         Class2194 var12 = method5776(var3, var6, var5);
         Pair var13 = this.method5777(var3, var7, var11, var5, var12);
         this.field6547 = new Class8638(var6, var7, var8, var10, var11, var5, var12, (ITextComponent)var13.getFirst());
         this.setMessage((ITextComponent)var13.getSecond());
      }
   }

   private static Class2194 method5776(RealmsServer var0, boolean var1, boolean var2) {
      if (!var1) {
         if (!var2) {
            return Class2194.field14339;
         }

         if (!var0.field27452) {
            return Class2194.field14339;
         }
      } else if (!var0.field27452 && var0.field27447 != Class2261.field14708) {
         return Class2194.field14340;
      }

      return Class2194.field14338;
   }

   private Pair<ITextComponent, ITextComponent> method5777(RealmsServer var1, String var2, boolean var3, boolean var4, Class2194 var5) {
      if (var5 != Class2194.field14338) {
         Object var8;
         if (!var4) {
            var8 = new StringTextComponent(" ").appendString(var2);
         } else if (!var3) {
            var8 = new StringTextComponent(" ").appendString(var2).appendString(" ").appendString(var1.field27457);
         } else {
            var8 = StringTextComponent.EMPTY;
         }

         ITextComponent var9;
         if (var5 != Class2194.field14340) {
            var9 = !var4 ? field6542 : field6541;
         } else {
            var9 = field6540;
         }

         IFormattableTextComponent var10 = var9.deepCopy().append((ITextComponent)var8);
         return Pair.of(var9, var10);
      } else {
         return Pair.of((ITextComponent)null, new StringTextComponent(var2));
      }
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6547 != null) {
         this.method5778(
            var1,
            this.field6477,
            this.field6478,
            var2,
            var3,
            Class8638.method31029(this.field6547),
            Class8638.method31030(this.field6547),
            this.field6545,
            Class8638.method31031(this.field6547),
            Class8638.method31032(this.field6547),
            this.field6547.field38885,
            this.field6547.field38886,
            this.field6547.field38887,
            Class8638.method31033(this.field6547)
         );
      }
   }

   private void method5778(
      MatrixStack var1,
      int var2,
      int var3,
      int var4,
      int var5,
      boolean var6,
      String var7,
      int var8,
      long var9,
      String var11,
      boolean var12,
      boolean var13,
      Class2194 var14,
      ITextComponent var15
   ) {
      boolean var18 = this.method5737();
      if (this.isMouseOver((double)var4, (double)var5) && var15 != null) {
         this.field6544.accept(var15);
      }

      Minecraft var19 = Minecraft.getInstance();
      TextureManager var20 = var19.getTextureManager();
      if (!var13) {
         if (!var12) {
            if (var11 != null && var9 != -1L) {
               Class8087.method27972(String.valueOf(var9), var11);
            } else if (var8 != 1) {
               if (var8 != 2) {
                  if (var8 == 3) {
                     var20.bindTexture(field6539);
                  }
               } else {
                  var20.bindTexture(field6538);
               }
            } else {
               var20.bindTexture(field6537);
            }
         } else {
            var20.bindTexture(field6536);
         }
      } else {
         Class8087.method27972(String.valueOf(var9), var11);
      }

      if (!var6) {
         RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
      } else {
         float var21 = 0.85F + 0.15F * MathHelper.cos((float)this.field6546 * 0.2F);
         RenderSystem.color4f(var21, var21, var21, 1.0F);
      }

      method5699(var1, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      var20.bindTexture(field6535);
      boolean var22 = var18 && var14 != Class2194.field14338;
      if (!var22) {
         if (!var6) {
            RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
         } else {
            RenderSystem.color4f(0.8F, 0.8F, 0.8F, 1.0F);
         }
      } else {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      method5699(var1, var2, var3, 0.0F, 0.0F, 80, 80, 80, 80);
      method5690(var1, var19.fontRenderer, var7, var2 + 40, var3 + 66, 16777215);
   }
}
