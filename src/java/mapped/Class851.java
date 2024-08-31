package mapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nullable;
import java.util.Set;

public abstract class Class851<T extends Class5812> extends Screen implements Class867<T> {
   public static final ResourceLocation field4720 = new ResourceLocation("textures/gui/container/inventory.png");
   public int field4721 = 176;
   public int field4722 = 166;
   public int field4723;
   public int field4724;
   public int field4725;
   public int field4726;
   public final T field4727;
   public final PlayerInventory field4728;
   public Class5839 field4729;
   private Class5839 field4730;
   private Class5839 field4731;
   private Class5839 field4732;
   private Class5839 field4733;
   public int field4734;
   public int field4735;
   private boolean field4736;
   private ItemStack field4737 = ItemStack.EMPTY;
   private int field4738;
   private int field4739;
   private long field4740;
   private ItemStack field4741 = ItemStack.EMPTY;
   private long field4742;
   public final Set<Class5839> field4743 = Sets.newHashSet();
   public boolean field4744;
   private int field4745;
   private int field4746;
   private boolean field4747;
   private int field4748;
   private long field4749;
   private int field4750;
   private boolean field4751;
   private ItemStack field4752 = ItemStack.EMPTY;

   public Class851(T var1, PlayerInventory var2, ITextComponent var3) {
      super(var3);
      this.field4727 = (T)var1;
      this.field4728 = var2;
      this.field4747 = true;
      this.field4723 = 8;
      this.field4724 = 6;
      this.field4725 = 8;
      this.field4726 = this.field4722 - 94;
   }

   @Override
   public void init() {
      super.init();
      this.field4734 = (this.width - this.field4721) / 2;
      this.field4735 = (this.height - this.field4722) / 2;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.method2618(var1, var4, var2, var3);
      RenderSystem.method27868();
      RenderSystem.disableDepthTest();
      super.render(var1, var2, var3, var4);
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)var7, (float)var8, 0.0F);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method27867();
      this.field4729 = null;
      short var9 = 240;
      short var10 = 240;
      RenderSystem.method27905(33986, 240.0F, 240.0F);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < this.field4727.field25468.size(); var11++) {
         Class5839 var12 = this.field4727.field25468.get(var11);
         if (var12.method18274()) {
            this.method2619(var1, var12);
         }

         if (this.method2624(var12, (double)var2, (double)var3) && var12.method18274()) {
            this.field4729 = var12;
            RenderSystem.disableDepthTest();
            int var13 = var12.field25580;
            int var14 = var12.field25581;
            RenderSystem.method27870(true, true, true, false);
            this.method5688(var1, var13, var14, var13 + 16, var14 + 16, -2130706433, -2130706433);
            RenderSystem.method27870(true, true, true, true);
            RenderSystem.enableDepthTest();
         }
      }

      this.method2617(var1, var2, var3);
      PlayerInventory var18 = this.mc.player.inventory;
      ItemStack var19 = !this.field4737.isEmpty() ? this.field4737 : var18.method4057();
      if (!var19.isEmpty()) {
         byte var20 = 8;
         int var22 = !this.field4737.isEmpty() ? 16 : 8;
         String var15 = null;
         if (!this.field4737.isEmpty() && this.field4736) {
            var19 = var19.copy();
            var19.method32180(MathHelper.method37773((float)var19.getCount() / 2.0F));
         } else if (this.field4744 && this.field4743.size() > 1) {
            var19 = var19.copy();
            var19.method32180(this.field4748);
            if (var19.isEmpty()) {
               var15 = "" + TextFormatting.YELLOW + "0";
            }
         }

         this.method2616(var19, var2 - var7 - 8, var3 - var8 - var22, var15);
      }

      if (!this.field4741.isEmpty()) {
         float var21 = (float)(Util.milliTime() - this.field4740) / 100.0F;
         if (var21 >= 1.0F) {
            var21 = 1.0F;
            this.field4741 = ItemStack.EMPTY;
         }

         int var23 = this.field4731.field25580 - this.field4738;
         int var24 = this.field4731.field25581 - this.field4739;
         int var16 = this.field4738 + (int)((float)var23 * var21);
         int var17 = this.field4739 + (int)((float)var24 * var21);
         this.method2616(this.field4741, var16, var17, (String)null);
      }

      RenderSystem.popMatrix();
      RenderSystem.enableDepthTest();
   }

   public void method2615(MatrixStack var1, int var2, int var3) {
      if (this.mc.player.inventory.method4057().isEmpty() && this.field4729 != null && this.field4729.method18266()) {
         this.method2457(var1, this.field4729.method18265(), var2, var3);
      }
   }

   private void method2616(ItemStack var1, int var2, int var3, String var4) {
      RenderSystem.translatef(0.0F, 0.0F, 32.0F);
      this.method5703(200);
      this.field4563.field847 = 200.0F;
      this.field4563.method793(var1, var2, var3);
      this.field4563.method798(this.fontRenderer, var1, var2, var3 - (!this.field4737.isEmpty() ? 8 : 0), var4);
      this.method5703(0);
      this.field4563.field847 = 0.0F;
   }

   public void method2617(MatrixStack var1, int var2, int var3) {
      this.fontRenderer.func_243248_b(var1, this.title, (float)this.field4723, (float)this.field4724, 4210752);
      this.fontRenderer.func_243248_b(var1, this.field4728.getDisplayName(), (float)this.field4725, (float)this.field4726, 4210752);
   }

   public abstract void method2618(MatrixStack var1, float var2, int var3, int var4);

   private void method2619(MatrixStack var1, Class5839 var2) {
      int var5 = var2.field25580;
      int var6 = var2.field25581;
      ItemStack var7 = var2.method18265();
      boolean var8 = false;
      boolean var9 = var2 == this.field4730 && !this.field4737.isEmpty() && !this.field4736;
      ItemStack var10 = this.mc.player.inventory.method4057();
      String var11 = null;
      if (var2 == this.field4730 && !this.field4737.isEmpty() && this.field4736 && !var7.isEmpty()) {
         var7 = var7.copy();
         var7.method32180(var7.getCount() / 2);
      } else if (this.field4744 && this.field4743.contains(var2) && !var10.isEmpty()) {
         if (this.field4743.size() == 1) {
            return;
         }

         if (Class5812.method18148(var2, var10, true) && this.field4727.method18150(var2)) {
            var7 = var10.copy();
            var8 = true;
            Class5812.method18149(this.field4743, this.field4745, var7, !var2.method18265().isEmpty() ? var2.method18265().getCount() : 0);
            int var12 = Math.min(var7.method32113(), var2.method18270(var7));
            if (var7.getCount() > var12) {
               var11 = TextFormatting.YELLOW.toString() + var12;
               var7.method32180(var12);
            }
         } else {
            this.field4743.remove(var2);
            this.method2620();
         }
      }

      this.method5703(100);
      this.field4563.field847 = 100.0F;
      if (var7.isEmpty() && var2.method18274()) {
         Pair var14 = var2.method18271();
         if (var14 != null) {
            TextureAtlasSprite var13 = this.mc.getAtlasSpriteGetter((ResourceLocation)var14.getFirst()).apply((ResourceLocation)var14.getSecond());
            this.mc.getTextureManager().bindTexture(var13.getAtlasTexture().getTextureLocation());
            method5695(var1, var5, var6, this.method5702(), 16, 16, var13);
            var9 = true;
         }
      }

      if (!var9) {
         if (var8) {
            method5686(var1, var5, var6, var5 + 16, var6 + 16, -2130706433);
         }

         RenderSystem.enableDepthTest();
         this.field4563.method795(this.mc.player, var7, var5, var6);
         this.field4563.method798(this.fontRenderer, var7, var5, var6, var11);
      }

      this.field4563.field847 = 0.0F;
      this.method5703(0);
   }

   private void method2620() {
      ItemStack var3 = this.mc.player.inventory.method4057();
      if (!var3.isEmpty() && this.field4744) {
         if (this.field4745 != 2) {
            this.field4748 = var3.getCount();

            for (Class5839 var5 : this.field4743) {
               ItemStack var6 = var3.copy();
               ItemStack var7 = var5.method18265();
               int var8 = !var7.isEmpty() ? var7.getCount() : 0;
               Class5812.method18149(this.field4743, this.field4745, var6, var8);
               int var9 = Math.min(var6.method32113(), var5.method18270(var6));
               if (var6.getCount() > var9) {
                  var6.method32180(var9);
               }

               this.field4748 = this.field4748 - (var6.getCount() - var8);
            }
         } else {
            this.field4748 = var3.method32113();
         }
      }
   }

   @Nullable
   private Class5839 method2621(double var1, double var3) {
      for (int var7 = 0; var7 < this.field4727.field25468.size(); var7++) {
         Class5839 var8 = this.field4727.field25468.get(var7);
         if (this.method2624(var8, var1, var3) && var8.method18274()) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (super.method1958(var1, var3, var5)) {
         return true;
      } else {
         boolean var8 = this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5);
         Class5839 var9 = this.method2621(var1, var3);
         long var10 = Util.milliTime();
         this.field4751 = this.field4733 == var9 && var10 - this.field4749 < 250L && this.field4750 == var5;
         this.field4747 = false;
         if (var5 != 0 && var5 != 1 && !var8) {
            this.method2622(var5);
         } else {
            int var12 = this.field4734;
            int var13 = this.field4735;
            boolean var14 = this.method2623(var1, var3, var12, var13, var5);
            int var15 = -1;
            if (var9 != null) {
               var15 = var9.field25579;
            }

            if (var14) {
               var15 = -999;
            }

            if (this.mc.gameSettings.touchscreen && var14 && this.mc.player.inventory.method4057().isEmpty()) {
               this.mc.displayGuiScreen((Screen)null);
               return true;
            }

            if (var15 != -1) {
               if (!this.mc.gameSettings.touchscreen) {
                  if (!this.field4744) {
                     if (!this.mc.player.inventory.method4057().isEmpty()) {
                        this.field4744 = true;
                        this.field4746 = var5;
                        this.field4743.clear();
                        if (var5 != 0) {
                           if (var5 != 1) {
                              if (this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5)) {
                                 this.field4745 = 2;
                              }
                           } else {
                              this.field4745 = 1;
                           }
                        } else {
                           this.field4745 = 0;
                        }
                     } else {
                        if (this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5)) {
                           this.method2626(var9, var15, var5, Class2259.field14697);
                        } else {
                           boolean var16 = var15 != -999
                              && (
                                 InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 340)
                                    || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 344)
                              );
                           Class2259 var17 = Class2259.field14694;
                           if (!var16) {
                              if (var15 == -999) {
                                 var17 = Class2259.field14698;
                              }
                           } else {
                              this.field4752 = var9 != null && var9.method18266() ? var9.method18265().copy() : ItemStack.EMPTY;
                              var17 = Class2259.field14695;
                           }

                           this.method2626(var9, var15, var5, var17);
                        }

                        this.field4747 = true;
                     }
                  }
               } else if (var9 != null && var9.method18266()) {
                  this.field4730 = var9;
                  this.field4737 = ItemStack.EMPTY;
                  this.field4736 = var5 == 1;
               } else {
                  this.field4730 = null;
               }
            }
         }

         this.field4733 = var9;
         this.field4749 = var10;
         this.field4750 = var5;
         return true;
      }
   }

   private void method2622(int var1) {
      if (this.field4729 != null && this.mc.player.inventory.method4057().isEmpty()) {
         if (this.mc.gameSettings.keyBindSwapHands.matchesMouseKey(var1)) {
            this.method2626(this.field4729, this.field4729.field25579, 40, Class2259.field14696);
            return;
         }

         for (int var4 = 0; var4 < 9; var4++) {
            if (this.mc.gameSettings.keyBindsHotbar[var4].matchesMouseKey(var1)) {
               this.method2626(this.field4729, this.field4729.field25579, var4, Class2259.field14696);
            }
         }
      }
   }

   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field4721) || var3 >= (double)(var6 + this.field4722);
   }

   @Override
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      Class5839 var12 = this.method2621(var1, var3);
      ItemStack var13 = this.mc.player.inventory.method4057();
      if (this.field4730 != null && this.mc.gameSettings.touchscreen) {
         if (var5 == 0 || var5 == 1) {
            if (!this.field4737.isEmpty()) {
               if (this.field4737.getCount() > 1 && var12 != null && Class5812.method18148(var12, this.field4737, false)) {
                  long var14 = Util.milliTime();
                  if (this.field4732 != var12) {
                     this.field4732 = var12;
                     this.field4742 = var14;
                  } else if (var14 - this.field4742 > 500L) {
                     this.method2626(this.field4730, this.field4730.field25579, 0, Class2259.field14694);
                     this.method2626(var12, var12.field25579, 1, Class2259.field14694);
                     this.method2626(this.field4730, this.field4730.field25579, 0, Class2259.field14694);
                     this.field4742 = var14 + 750L;
                     this.field4737.method32182(1);
                  }
               }
            } else if (var12 != this.field4730 && !this.field4730.method18265().isEmpty()) {
               this.field4737 = this.field4730.method18265().copy();
            }
         }
      } else if (this.field4744
         && var12 != null
         && !var13.isEmpty()
         && (var13.getCount() > this.field4743.size() || this.field4745 == 2)
         && Class5812.method18148(var12, var13, true)
         && var12.method18259(var13)
         && this.field4727.method18150(var12)) {
         this.field4743.add(var12);
         this.method2620();
      }

      return true;
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
      Class5839 var8 = this.method2621(var1, var3);
      int var9 = this.field4734;
      int var10 = this.field4735;
      boolean var11 = this.method2623(var1, var3, var9, var10, var5);
      int var12 = -1;
      if (var8 != null) {
         var12 = var8.field25579;
      }

      if (var11) {
         var12 = -999;
      }

      if (this.field4751 && var8 != null && var5 == 0 && this.field4727.method18111(ItemStack.EMPTY, var8)) {
         if (!method2476()) {
            this.method2626(var8, var12, var5, Class2259.field14700);
         } else if (!this.field4752.isEmpty()) {
            for (Class5839 var18 : this.field4727.field25468) {
               if (var18 != null
                  && var18.method18273(this.mc.player)
                  && var18.method18266()
                  && var18.field25578 == var8.field25578
                  && Class5812.method18148(var18, this.field4752, true)) {
                  this.method2626(var18, var18.field25579, var5, Class2259.field14695);
               }
            }
         }

         this.field4751 = false;
         this.field4749 = 0L;
      } else {
         if (this.field4744 && this.field4746 != var5) {
            this.field4744 = false;
            this.field4743.clear();
            this.field4747 = true;
            return true;
         }

         if (this.field4747) {
            this.field4747 = false;
            return true;
         }

         if (this.field4730 != null && this.mc.gameSettings.touchscreen) {
            if (var5 == 0 || var5 == 1) {
               if (this.field4737.isEmpty() && var8 != this.field4730) {
                  this.field4737 = this.field4730.method18265();
               }

               boolean var16 = Class5812.method18148(var8, this.field4737, false);
               if (var12 != -1 && !this.field4737.isEmpty() && var16) {
                  this.method2626(this.field4730, this.field4730.field25579, var5, Class2259.field14694);
                  this.method2626(var8, var12, 0, Class2259.field14694);
                  if (!this.mc.player.inventory.method4057().isEmpty()) {
                     this.method2626(this.field4730, this.field4730.field25579, var5, Class2259.field14694);
                     this.field4738 = MathHelper.floor(var1 - (double)var9);
                     this.field4739 = MathHelper.floor(var3 - (double)var10);
                     this.field4731 = this.field4730;
                     this.field4741 = this.field4737;
                     this.field4740 = Util.milliTime();
                  } else {
                     this.field4741 = ItemStack.EMPTY;
                  }
               } else if (!this.field4737.isEmpty()) {
                  this.field4738 = MathHelper.floor(var1 - (double)var9);
                  this.field4739 = MathHelper.floor(var3 - (double)var10);
                  this.field4731 = this.field4730;
                  this.field4741 = this.field4737;
                  this.field4740 = Util.milliTime();
               }

               this.field4737 = ItemStack.EMPTY;
               this.field4730 = null;
            }
         } else if (this.field4744 && !this.field4743.isEmpty()) {
            this.method2626((Class5839)null, -999, Class5812.method18145(0, this.field4745), Class2259.field14699);

            for (Class5839 var14 : this.field4743) {
               this.method2626(var14, var14.field25579, Class5812.method18145(1, this.field4745), Class2259.field14699);
            }

            this.method2626((Class5839)null, -999, Class5812.method18145(2, this.field4745), Class2259.field14699);
         } else if (!this.mc.player.inventory.method4057().isEmpty()) {
            if (!this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5)) {
               boolean var13 = var12 != -999
                  && (
                     InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 340)
                        || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 344)
                  );
               if (var13) {
                  this.field4752 = var8 != null && var8.method18266() ? var8.method18265().copy() : ItemStack.EMPTY;
               }

               this.method2626(var8, var12, var5, !var13 ? Class2259.field14694 : Class2259.field14695);
            } else {
               this.method2626(var8, var12, var5, Class2259.field14697);
            }
         }
      }

      if (this.mc.player.inventory.method4057().isEmpty()) {
         this.field4749 = 0L;
      }

      this.field4744 = false;
      return true;
   }

   private boolean method2624(Class5839 var1, double var2, double var4) {
      return this.method2625(var1.field25580, var1.field25581, 16, 16, var2, var4);
   }

   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      int var11 = this.field4734;
      int var12 = this.field4735;
      var5 -= (double)var11;
      var7 -= (double)var12;
      return var5 >= (double)(var1 - 1) && var5 < (double)(var1 + var3 + 1) && var7 >= (double)(var2 - 1) && var7 < (double)(var2 + var4 + 1);
   }

   public void method2626(Class5839 var1, int var2, int var3, Class2259 var4) {
      if (var1 != null) {
         var2 = var1.field25579;
      }

      this.mc.playerController.method23144(this.field4727.field25471, var2, var3, var4, this.mc.player);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (!this.mc.gameSettings.keyBindInventory.matchesKey(var1, var2)) {
            this.method2627(var1, var2);
            if (this.field4729 != null && this.field4729.method18266()) {
               if (!this.mc.gameSettings.keyBindPickBlock.matchesKey(var1, var2)) {
                  if (this.mc.gameSettings.keyBindDrop.matchesKey(var1, var2)) {
                     this.method2626(this.field4729, this.field4729.field25579, ! hasControlDown() ? 0 : 1, Class2259.field14698);
                  }
               } else {
                  this.method2626(this.field4729, this.field4729.field25579, 0, Class2259.field14697);
               }
            }

            return true;
         } else {
            this.method1945();
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method2627(int var1, int var2) {
      if (this.mc.player.inventory.method4057().isEmpty() && this.field4729 != null) {
         if (this.mc.gameSettings.keyBindSwapHands.matchesKey(var1, var2)) {
            this.method2626(this.field4729, this.field4729.field25579, 40, Class2259.field14696);
            return true;
         }

         for (int var5 = 0; var5 < 9; var5++) {
            if (this.mc.gameSettings.keyBindsHotbar[var5].matchesKey(var1, var2)) {
               this.method2626(this.field4729, this.field4729.field25579, var5, Class2259.field14696);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void onClose() {
      if (this.mc.player != null) {
         this.field4727.method18113(this.mc.player);
      }
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.mc.player.isAlive() || this.mc.player.removed) {
         this.mc.player.method2772();
      }
   }

   @Override
   public T method2628() {
      return this.field4727;
   }

   @Override
   public void method1945() {
      this.mc.player.method2772();
      super.method1945();
   }
}
