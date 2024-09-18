package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class872 extends ContainerScreen<Class5821> {
   private static final ResourceLocation field4841 = new ResourceLocation("textures/gui/container/beacon.png");
   private static final ITextComponent field4842 = new TranslationTextComponent("block.minecraft.beacon.primary");
   private static final ITextComponent field4843 = new TranslationTextComponent("block.minecraft.beacon.secondary");
   private Class1203 field4844;
   private boolean field4845;
   private Effect field4846;
   private Effect field4847;

   public Class872(Class5821 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.xSize = 230;
      this.ySize = 219;
      var1.addListener(new Class1122(this, var1));
   }

   @Override
   public void init() {
      super.init();
      this.field4844 = this.<Class1203>addButton(new Class1203(this, this.field4734 + 164, this.field4735 + 107));
      this.<Class1204>addButton(new Class1204(this, this.field4734 + 190, this.field4735 + 107));
      this.field4845 = true;
      this.field4844.active = false;
   }

   @Override
   public void tick() {
      super.tick();
      int var3 = this.field4727.method18178();
      if (this.field4845 && var3 >= 0) {
         this.field4845 = false;

         for (int var4 = 0; var4 <= 2; var4++) {
            int var5 = Class950.field5338[var4].length;
            int var6 = var5 * 22 + (var5 - 1) * 2;

            for (int var7 = 0; var7 < var5; var7++) {
               Effect var8 = Class950.field5338[var4][var7];
               Class1205 var9 = new Class1205(this, this.field4734 + 76 + var7 * 24 - var6 / 2, this.field4735 + 22 + var4 * 25, var8, true);
               this.<Class1205>addButton(var9);
               if (var4 < var3) {
                  if (var8 == this.field4846) {
                     var9.method5762(true);
                  }
               } else {
                  var9.active = false;
               }
            }
         }

         byte var10 = 3;
         int var11 = Class950.field5338[3].length + 1;
         int var12 = var11 * 22 + (var11 - 1) * 2;

         for (int var13 = 0; var13 < var11 - 1; var13++) {
            Effect var15 = Class950.field5338[3][var13];
            Class1205 var16 = new Class1205(this, this.field4734 + 167 + var13 * 24 - var12 / 2, this.field4735 + 47, var15, false);
            this.<Class1205>addButton(var16);
            if (3 < var3) {
               if (var15 == this.field4847) {
                  var16.method5762(true);
               }
            } else {
               var16.active = false;
            }
         }

         if (this.field4846 != null) {
            Class1205 var14 = new Class1205(this, this.field4734 + 167 + (var11 - 1) * 24 - var12 / 2, this.field4735 + 47, this.field4846, false);
            this.<Class1205>addButton(var14);
            if (3 < var3) {
               if (this.field4846 == this.field4847) {
                  var14.method5762(true);
               }
            } else {
               var14.active = false;
            }
         }
      }

      this.field4844.active = this.field4727.method18182() && this.field4846 != null;
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      drawCenteredString(var1, this.fontRenderer, field4842, 62, 10, 14737632);
      drawCenteredString(var1, this.fontRenderer, field4843, 169, 10, 14737632);

      for (Widget var7 : this.field4566) {
         if (var7.method5737()) {
            var7.method5738(var1, var2 - this.field4734, var3 - this.field4735);
            break;
         }
      }
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4841);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      this.field4563.field847 = 100.0F;
      this.field4563.method793(new ItemStack(Items.field37803), var7 + 20, var8 + 109);
      this.field4563.method793(new ItemStack(Items.field38049), var7 + 41, var8 + 109);
      this.field4563.method793(new ItemStack(Items.field37800), var7 + 41 + 22, var8 + 109);
      this.field4563.method793(new ItemStack(Items.field37802), var7 + 42 + 44, var8 + 109);
      this.field4563.method793(new ItemStack(Items.field37801), var7 + 42 + 66, var8 + 109);
      this.field4563.field847 = 0.0F;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Effect method2701(Class872 var0, Effect var1) {
      return var0.field4846 = var1;
   }

   // $VF: synthetic method
   public static Effect method2702(Class872 var0, Effect var1) {
      return var0.field4847 = var1;
   }

   // $VF: synthetic method
   public static boolean method2703(Class872 var0, boolean var1) {
      return var0.field4845 = var1;
   }

   // $VF: synthetic method
   public static ResourceLocation method2704() {
      return field4841;
   }

   // $VF: synthetic method
   public static Minecraft method2705(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Minecraft method2706(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Minecraft method2707(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Effect method2708(Class872 var0) {
      return var0.field4846;
   }

   // $VF: synthetic method
   public static Effect method2709(Class872 var0) {
      return var0.field4847;
   }

   // $VF: synthetic method
   public static Minecraft method2710(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Minecraft method2711(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Minecraft method2712(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Minecraft method2713(Class872 var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static List method2714(Class872 var0) {
      return var0.field4566;
   }

   // $VF: synthetic method
   public static List method2715(Class872 var0) {
      return var0.field4561;
   }
}
