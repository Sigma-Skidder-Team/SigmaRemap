package net.minecraft.client.gui.screen.inventory;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.datafixers.util.Pair;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nullable;
import java.util.Set;

public abstract class ContainerScreen<T extends Container> extends Screen implements IHasContainer<T> {
   public static final ResourceLocation field4720 = new ResourceLocation("textures/gui/container/inventory.png");
   public int xSize = 176;
   public int ySize = 166;
   public int field4723;
   public int field4724;
   public int field4725;
   public int playerInventoryTitleY;
   public final T field4727;
   public final PlayerInventory field4728;
   public Slot field4729;
   private Slot field4730;
   private Slot field4731;
   private Slot field4732;
   private Slot field4733;
   public int field4734;
   public int field4735;
   private boolean field4736;
   private ItemStack field4737 = ItemStack.EMPTY;
   private int field4738;
   private int field4739;
   private long field4740;
   private ItemStack field4741 = ItemStack.EMPTY;
   private long field4742;
   public final Set<Slot> field4743 = Sets.newHashSet();
   public boolean field4744;
   private int field4745;
   private int field4746;
   private boolean field4747;
   private int field4748;
   private long field4749;
   private int field4750;
   private boolean field4751;
   private ItemStack field4752 = ItemStack.EMPTY;

   public ContainerScreen(T var1, PlayerInventory var2, ITextComponent var3) {
      super(var3);
      this.field4727 = (T)var1;
      this.field4728 = var2;
      this.field4747 = true;
      this.field4723 = 8;
      this.field4724 = 6;
      this.field4725 = 8;
      this.playerInventoryTitleY = this.ySize - 94;
   }

   @Override
   public void init() {
      super.init();
      this.field4734 = (this.width - this.xSize) / 2;
      this.field4735 = (this.height - this.ySize) / 2;
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
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method27867();
      this.field4729 = null;
      short var9 = 240;
      short var10 = 240;
      RenderSystem.method27905(33986, 240.0F, 240.0F);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < this.field4727.field25468.size(); var11++) {
         Slot var12 = this.field4727.field25468.get(var11);
         if (var12.isEnabled()) {
            this.method2619(var1, var12);
         }

         if (this.method2624(var12, (double)var2, (double)var3) && var12.isEnabled()) {
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
            var19.method32180(MathHelper.ceil((float)var19.getCount() / 2.0F));
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

   public void renderHoveredTooltip(MatrixStack var1, int var2, int var3) {
      if (this.mc.player.inventory.method4057().isEmpty() && this.field4729 != null && this.field4729.getHasStack()) {
         this.method2457(var1, this.field4729.getStack(), var2, var3);
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
      this.fontRenderer.func_243248_b(var1, this.field4728.getDisplayName(), (float)this.field4725, (float)this.playerInventoryTitleY, 4210752);
   }

   public abstract void method2618(MatrixStack var1, float var2, int var3, int var4);

   private void method2619(MatrixStack var1, Slot var2) {
      int var5 = var2.field25580;
      int var6 = var2.field25581;
      ItemStack var7 = var2.getStack();
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

         if (Container.canAddItemToSlot(var2, var10, true) && this.field4727.canDragIntoSlot(var2)) {
            var7 = var10.copy();
            var8 = true;
            Container.computeStackSize(this.field4743, this.field4745, var7, !var2.getStack().isEmpty() ? var2.getStack().getCount() : 0);
            int var12 = Math.min(var7.method32113(), var2.getItemStackLimit(var7));
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
      if (var7.isEmpty() && var2.isEnabled()) {
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

            for (Slot var5 : this.field4743) {
               ItemStack var6 = var3.copy();
               ItemStack var7 = var5.getStack();
               int var8 = !var7.isEmpty() ? var7.getCount() : 0;
               Container.computeStackSize(this.field4743, this.field4745, var6, var8);
               int var9 = Math.min(var6.method32113(), var5.getItemStackLimit(var6));
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
   private Slot method2621(double var1, double var3) {
      for (int var7 = 0; var7 < this.field4727.field25468.size(); var7++) {
         Slot var8 = this.field4727.field25468.get(var7);
         if (this.method2624(var8, var1, var3) && var8.isEnabled()) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (super.mouseClicked(var1, var3, var5)) {
         return true;
      } else {
         boolean var8 = this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5);
         Slot var9 = this.method2621(var1, var3);
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
                           this.method2626(var9, var15, var5, ClickType.field14697);
                        } else {
                           boolean var16 = var15 != -999
                              && (
                                 InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 340)
                                    || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 344)
                              );
                           ClickType var17 = ClickType.PICKUP;
                           if (!var16) {
                              if (var15 == -999) {
                                 var17 = ClickType.field14698;
                              }
                           } else {
                              this.field4752 = var9 != null && var9.getHasStack() ? var9.getStack().copy() : ItemStack.EMPTY;
                              var17 = ClickType.field14695;
                           }

                           this.method2626(var9, var15, var5, var17);
                        }

                        this.field4747 = true;
                     }
                  }
               } else if (var9 != null && var9.getHasStack()) {
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
            this.method2626(this.field4729, this.field4729.field25579, 40, ClickType.field14696);
            return;
         }

         for (int var4 = 0; var4 < 9; var4++) {
            if (this.mc.gameSettings.keyBindsHotbar[var4].matchesMouseKey(var1)) {
               this.method2626(this.field4729, this.field4729.field25579, var4, ClickType.field14696);
            }
         }
      }
   }

   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.xSize) || var3 >= (double)(var6 + this.ySize);
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      Slot var12 = this.method2621(var1, var3);
      ItemStack var13 = this.mc.player.inventory.method4057();
      if (this.field4730 != null && this.mc.gameSettings.touchscreen) {
         if (var5 == 0 || var5 == 1) {
            if (!this.field4737.isEmpty()) {
               if (this.field4737.getCount() > 1 && var12 != null && Container.canAddItemToSlot(var12, this.field4737, false)) {
                  long var14 = Util.milliTime();
                  if (this.field4732 != var12) {
                     this.field4732 = var12;
                     this.field4742 = var14;
                  } else if (var14 - this.field4742 > 500L) {
                     this.method2626(this.field4730, this.field4730.field25579, 0, ClickType.PICKUP);
                     this.method2626(var12, var12.field25579, 1, ClickType.PICKUP);
                     this.method2626(this.field4730, this.field4730.field25579, 0, ClickType.PICKUP);
                     this.field4742 = var14 + 750L;
                     this.field4737.method32182(1);
                  }
               }
            } else if (var12 != this.field4730 && !this.field4730.getStack().isEmpty()) {
               this.field4737 = this.field4730.getStack().copy();
            }
         }
      } else if (this.field4744
         && var12 != null
         && !var13.isEmpty()
         && (var13.getCount() > this.field4743.size() || this.field4745 == 2)
         && Container.canAddItemToSlot(var12, var13, true)
         && var12.isItemValid(var13)
         && this.field4727.canDragIntoSlot(var12)) {
         this.field4743.add(var12);
         this.method2620();
      }

      return true;
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      Slot var8 = this.method2621(var1, var3);
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

      if (this.field4751 && var8 != null && var5 == 0 && this.field4727.canMergeSlot(ItemStack.EMPTY, var8)) {
         if (!method2476()) {
            this.method2626(var8, var12, var5, ClickType.field14700);
         } else if (!this.field4752.isEmpty()) {
            for (Slot var18 : this.field4727.field25468) {
               if (var18 != null
                  && var18.canTakeStack(this.mc.player)
                  && var18.getHasStack()
                  && var18.field25578 == var8.field25578
                  && Container.canAddItemToSlot(var18, this.field4752, true)) {
                  this.method2626(var18, var18.field25579, var5, ClickType.field14695);
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
                  this.field4737 = this.field4730.getStack();
               }

               boolean var16 = Container.canAddItemToSlot(var8, this.field4737, false);
               if (var12 != -1 && !this.field4737.isEmpty() && var16) {
                  this.method2626(this.field4730, this.field4730.field25579, var5, ClickType.PICKUP);
                  this.method2626(var8, var12, 0, ClickType.PICKUP);
                  if (!this.mc.player.inventory.method4057().isEmpty()) {
                     this.method2626(this.field4730, this.field4730.field25579, var5, ClickType.PICKUP);
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
            this.method2626((Slot)null, -999, Container.getQuickcraftMask(0, this.field4745), ClickType.field14699);

            for (Slot var14 : this.field4743) {
               this.method2626(var14, var14.field25579, Container.getQuickcraftMask(1, this.field4745), ClickType.field14699);
            }

            this.method2626((Slot)null, -999, Container.getQuickcraftMask(2, this.field4745), ClickType.field14699);
         } else if (!this.mc.player.inventory.method4057().isEmpty()) {
            if (!this.mc.gameSettings.keyBindPickBlock.matchesMouseKey(var5)) {
               boolean var13 = var12 != -999
                  && (
                     InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 340)
                        || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 344)
                  );
               if (var13) {
                  this.field4752 = var8 != null && var8.getHasStack() ? var8.getStack().copy() : ItemStack.EMPTY;
               }

               this.method2626(var8, var12, var5, !var13 ? ClickType.PICKUP : ClickType.field14695);
            } else {
               this.method2626(var8, var12, var5, ClickType.field14697);
            }
         }
      }

      if (this.mc.player.inventory.method4057().isEmpty()) {
         this.field4749 = 0L;
      }

      this.field4744 = false;
      return true;
   }

   private boolean method2624(Slot var1, double var2, double var4) {
      return this.method2625(var1.field25580, var1.field25581, 16, 16, var2, var4);
   }

   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      int var11 = this.field4734;
      int var12 = this.field4735;
      var5 -= (double)var11;
      var7 -= (double)var12;
      return var5 >= (double)(var1 - 1) && var5 < (double)(var1 + var3 + 1) && var7 >= (double)(var2 - 1) && var7 < (double)(var2 + var4 + 1);
   }

   public void method2626(Slot var1, int var2, int var3, ClickType var4) {
      if (var1 != null) {
         var2 = var1.field25579;
      }

      this.mc.playerController.windowClick(this.field4727.field25471, var2, var3, var4, this.mc.player);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (!this.mc.gameSettings.keyBindInventory.matchesKey(var1, var2)) {
            this.method2627(var1, var2);
            if (this.field4729 != null && this.field4729.getHasStack()) {
               if (!this.mc.gameSettings.keyBindPickBlock.matchesKey(var1, var2)) {
                  if (this.mc.gameSettings.keyBindDrop.matchesKey(var1, var2)) {
                     this.method2626(this.field4729, this.field4729.field25579, ! hasControlDown() ? 0 : 1, ClickType.field14698);
                  }
               } else {
                  this.method2626(this.field4729, this.field4729.field25579, 0, ClickType.field14697);
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
            this.method2626(this.field4729, this.field4729.field25579, 40, ClickType.field14696);
            return true;
         }

         for (int var5 = 0; var5 < 9; var5++) {
            if (this.mc.gameSettings.keyBindsHotbar[var5].matchesKey(var1, var2)) {
               this.method2626(this.field4729, this.field4729.field25579, var5, ClickType.field14696);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void onClose() {
      if (this.mc.player != null) {
         this.field4727.onContainerClosed(this.mc.player);
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
