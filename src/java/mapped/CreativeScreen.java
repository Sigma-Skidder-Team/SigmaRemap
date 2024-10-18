package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.*;
import java.util.function.Predicate;

public class CreativeScreen extends Class860<Class5820> {
   private static final ResourceLocation field4773 = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
   private static final Class927 field4774 = new Class927(45);
   private static final ITextComponent field4775 = new TranslationTextComponent("inventory.binSlot");
   private static int field4776 = ItemGroup.field31665.method23641();
   private float field4777;
   private boolean field4778;
   private TextFieldWidget field4779;
   private List<Slot> field4780;
   private Slot field4781;
   private Class877 field4782;
   private boolean field4783;
   private boolean field4784;
   private final Map<ResourceLocation, ITag<Item>> field4785 = Maps.newTreeMap();

   public CreativeScreen(PlayerEntity var1) {
      super(new Class5820(var1), var1.inventory, StringTextComponent.EMPTY);
      var1.openContainer = this.field4727;
      this.passEvents = true;
      this.ySize = 136;
      this.xSize = 195;
   }

   @Override
   public void tick() {
      if (this.mc.playerController.isInCreativeMode()) {
         if (this.field4779 != null) {
            this.field4779.method5633();
         }
      } else {
         this.mc.displayGuiScreen(new InventoryScreen(this.mc.player));
      }
   }

   @Override
   public void method2626(Slot var1, int var2, int var3, ClickType var4) {
      if (this.method2643(var1)) {
         this.field4779.method5652();
         this.field4779.method5668(0);
      }

      boolean var7 = var4 == ClickType.QUICK_MOVE;
      var4 = var2 == -999 && var4 == ClickType.PICKUP ? ClickType.THROW : var4;
      if (var1 == null && field4776 != ItemGroup.field31677.method23641() && var4 != ClickType.QUICK_CRAFT) {
         PlayerInventory var16 = this.mc.player.inventory;
         if (!var16.getItemStack().isEmpty() && this.field4784) {
            if (var3 == 0) {
               this.mc.player.dropItem(var16.getItemStack(), true);
               this.mc.playerController.sendPacketDropItem(var16.getItemStack());
               var16.setItemStack(ItemStack.EMPTY);
            }

            if (var3 == 1) {
               ItemStack var21 = var16.getItemStack().split(1);
               this.mc.player.dropItem(var21, true);
               this.mc.playerController.sendPacketDropItem(var21);
            }
         }
      } else {
         if (var1 != null && !var1.canTakeStack(this.mc.player)) {
            return;
         }

         if (var1 == this.field4781 && var7) {
            for (int var15 = 0; var15 < this.mc.player.container.getInventory().size(); var15++) {
               this.mc.playerController.sendSlotPacket(ItemStack.EMPTY, var15);
            }
         } else if (field4776 != ItemGroup.field31677.method23641()) {
            if (var4 != ClickType.QUICK_CRAFT && var1.field25578 == field4774) {
               PlayerInventory var13 = this.mc.player.inventory;
               ItemStack var18 = var13.getItemStack();
               ItemStack var22 = var1.getStack();
               if (var4 == ClickType.SWAP) {
                  if (!var22.isEmpty()) {
                     ItemStack var25 = var22.copy();
                     var25.setCount(var25.getMaxStackSize());
                     this.mc.player.inventory.setInventorySlotContents(var3, var25);
                     this.mc.player.container.detectAndSendChanges();
                  }

                  return;
               }

               if (var4 == ClickType.CLONE) {
                  if (var13.getItemStack().isEmpty() && var1.getHasStack()) {
                     ItemStack var24 = var1.getStack().copy();
                     var24.setCount(var24.getMaxStackSize());
                     var13.setItemStack(var24);
                  }

                  return;
               }

               if (var4 == ClickType.THROW) {
                  if (!var22.isEmpty()) {
                     ItemStack var23 = var22.copy();
                     var23.setCount(var3 != 0 ? var23.getMaxStackSize() : 1);
                     this.mc.player.dropItem(var23, true);
                     this.mc.playerController.sendPacketDropItem(var23);
                  }

                  return;
               }

               if (!var18.isEmpty() && !var22.isEmpty() && var18.method32132(var22) && ItemStack.method32127(var18, var22)) {
                  if (var3 != 0) {
                     var18.shrink(1);
                  } else if (!var7) {
                     if (var18.getCount() < var18.getMaxStackSize()) {
                        var18.grow(1);
                     }
                  } else {
                     var18.setCount(var18.getMaxStackSize());
                  }
               } else if (!var22.isEmpty() && var18.isEmpty()) {
                  var13.setItemStack(var22.copy());
                  var18 = var13.getItemStack();
                  if (var7) {
                     var18.setCount(var18.getMaxStackSize());
                  }
               } else if (var3 != 0) {
                  var13.getItemStack().shrink(1);
               } else {
                  var13.setItemStack(ItemStack.EMPTY);
               }
            } else if (this.field4727 != null) {
               ItemStack var8 = var1 != null ? this.field4727.getSlot(var1.slotNumber).getStack() : ItemStack.EMPTY;
               this.field4727.slotClick(var1 != null ? var1.slotNumber : var2, var3, var4, this.mc.player);
               if (Container.getDragEvent(var3) != 2) {
                  if (var1 != null) {
                     ItemStack var9 = this.field4727.getSlot(var1.slotNumber).getStack();
                     this.mc.playerController.sendSlotPacket(var9, var1.slotNumber - this.field4727.inventorySlots.size() + 9 + 36);
                     int var10 = 45 + var3;
                     if (var4 != ClickType.SWAP) {
                        if (var4 == ClickType.THROW && !var8.isEmpty()) {
                           ItemStack var11 = var8.copy();
                           var11.setCount(var3 != 0 ? var11.getMaxStackSize() : 1);
                           this.mc.player.dropItem(var11, true);
                           this.mc.playerController.sendPacketDropItem(var11);
                        }
                     } else {
                        this.mc.playerController.sendSlotPacket(var8, var10 - this.field4727.inventorySlots.size() + 9 + 36);
                     }

                     this.mc.player.container.detectAndSendChanges();
                  }
               } else {
                  for (int var17 = 0; var17 < 9; var17++) {
                     this.mc.playerController.sendSlotPacket(this.field4727.getSlot(45 + var17).getStack(), 36 + var17);
                  }
               }
            }
         } else if (var1 != this.field4781) {
            if (var4 == ClickType.THROW && var1 != null && var1.getHasStack()) {
               ItemStack var14 = var1.decrStackSize(var3 != 0 ? var1.getStack().getMaxStackSize() : 1);
               ItemStack var20 = var1.getStack();
               this.mc.player.dropItem(var14, true);
               this.mc.playerController.sendPacketDropItem(var14);
               this.mc.playerController.sendSlotPacket(var20, Class5848.method18276((Class5848)var1).slotNumber);
            } else if (var4 == ClickType.THROW && !this.mc.player.inventory.getItemStack().isEmpty()) {
               this.mc.player.dropItem(this.mc.player.inventory.getItemStack(), true);
               this.mc.playerController.sendPacketDropItem(this.mc.player.inventory.getItemStack());
               this.mc.player.inventory.setItemStack(ItemStack.EMPTY);
            } else {
               this.mc
                  .player
                  .container
                  .slotClick(var1 != null ? Class5848.method18276((Class5848)var1).slotNumber : var2, var3, var4, this.mc.player);
               this.mc.player.container.detectAndSendChanges();
            }
         } else {
            this.mc.player.inventory.setItemStack(ItemStack.EMPTY);
         }
      }
   }

   private boolean method2643(Slot var1) {
      return var1 != null && var1.field25578 == field4774;
   }

   @Override
   public void method2638() {
      int var3 = this.field4734;
      super.method2638();
      if (this.field4779 != null && this.field4734 != var3) {
         this.field4779.method5674(this.field4734 + 82);
      }
   }

   @Override
   public void init() {
      if (!this.mc.playerController.isInCreativeMode()) {
         this.mc.displayGuiScreen(new InventoryScreen(this.mc.player));
      } else {
         super.init();
         this.mc.keyboardListener.enableRepeatEvents(true);
         this.field4779 = new TextFieldWidget(this.font, this.field4734 + 82, this.field4735 + 6, 80, 9, new TranslationTextComponent("itemGroup.search"));
         this.field4779.method5657(50);
         this.field4779.method5661(false);
         this.field4779.method5671(false);
         this.field4779.method5662(16777215);
         this.children.add(this.field4779);
         int var3 = field4776;
         field4776 = -1;
         this.method2648(ItemGroup.field31664[var3]);
         this.mc.player.container.removeListener(this.field4782);
         this.field4782 = new Class877(this.mc);
         this.mc.player.container.addListener(this.field4782);
      }
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field4779.getText();
      this.init(var1, var2, var3);
      this.field4779.method5635(var6);
      if (!this.field4779.getText().isEmpty()) {
         this.method2645();
      }
   }

   @Override
   public void onClose() {
      super.onClose();
      if (this.mc.player != null && this.mc.player.inventory != null) {
         this.mc.player.container.removeListener(this.field4782);
      }

      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      if (!this.field4783) {
         if (field4776 == ItemGroup.SEARCH.method23641()) {
            String var5 = this.field4779.getText();
            if (!this.field4779.charTyped(var1, var2)) {
               return false;
            } else {
               if (!Objects.equals(var5, this.field4779.getText())) {
                  this.method2645();
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      this.field4783 = false;
      if (field4776 != ItemGroup.SEARCH.method23641()) {
         if (!this.mc.gameSettings.keyBindChat.matchesKey(var1, var2)) {
            return super.keyPressed(var1, var2, var3);
         } else {
            this.field4783 = true;
            this.method2648(ItemGroup.SEARCH);
            return true;
         }
      } else {
         boolean var6 = !this.method2643(this.field4729) || this.field4729.getHasStack();
         boolean var7 = InputMappings.method38637(var1, var2).func_241552_e_().isPresent();
         if (var6 && var7 && this.method2627(var1, var2)) {
            this.field4783 = true;
            return true;
         } else {
            String var8 = this.field4779.getText();
            if (this.field4779.keyPressed(var1, var2, var3)) {
               if (!Objects.equals(var8, this.field4779.getText())) {
                  this.method2645();
               }

               return true;
            } else {
               return this.field4779.method5746() && this.field4779.method5670() && var1 != 256 ? true : super.keyPressed(var1, var2, var3);
            }
         }
      }
   }

   @Override
   public boolean keyReleased(int var1, int var2, int var3) {
      this.field4783 = false;
      return super.keyReleased(var1, var2, var3);
   }

   private void method2645() {
      this.field4727.field25498.clear();
      this.field4785.clear();
      String var3 = this.field4779.getText();
      if (!var3.isEmpty()) {
         IMutableSearchTree var4;
         if (!var3.startsWith("#")) {
            var4 = this.mc.<ItemStack>getSearchTree(SearchTreeManager.ITEMS);
         } else {
            var3 = var3.substring(1);
            var4 = this.mc.<ItemStack>getSearchTree(SearchTreeManager.TAGS);
            this.method2646(var3);
         }

         this.field4727.field25498.addAll(var4.method21737(var3.toLowerCase(Locale.ROOT)));
      } else {
         for (Item var5 : Registry.ITEM) {
            var5.fillItemGroup(ItemGroup.SEARCH, this.field4727.field25498);
         }
      }

      this.field4777 = 0.0F;
      this.field4727.method18176(0.0F);
   }

   private void method2646(String var1) {
      int var4 = var1.indexOf(58);
      Predicate<ResourceLocation> var7;
      if (var4 != -1) {
         String var5 = var1.substring(0, var4).trim();
         String var6 = var1.substring(var4 + 1).trim();
         var7 = var2 -> var2.getNamespace().contains(var5) && var2.getPath().contains(var6);
      } else {
         var7 = var1x -> var1x.getPath().contains(var1);
      }

      Class7984<Item> var8 = Class5985.method18561();
      var8.method27137().stream().filter(var7).forEach(var2 -> {
         ITag var5x = this.field4785.put(var2, var8.get(var2));
      });
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      ItemGroup var6 = ItemGroup.field31664[field4776];
      if (var6.method23648()) {
         RenderSystem.disableBlend();
         this.font.func_243248_b(var1, var6.method23643(), 8.0F, 6.0F, 4210752);
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var8 = var1 - (double)this.field4734;
         double var10 = var3 - (double)this.field4735;

         for (ItemGroup var15 : ItemGroup.field31664) {
            if (this.method2651(var15, var8, var10)) {
               return true;
            }
         }

         if (field4776 != ItemGroup.field31677.method23641() && this.method2650(var1, var3)) {
            this.field4778 = this.method2647();
            return true;
         }
      }

      return super.mouseClicked(var1, var3, var5);
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var8 = var1 - (double)this.field4734;
         double var10 = var3 - (double)this.field4735;
         this.field4778 = false;

         for (ItemGroup var15 : ItemGroup.field31664) {
            if (this.method2651(var15, var8, var10)) {
               this.method2648(var15);
               return true;
            }
         }
      }

      return super.mouseReleased(var1, var3, var5);
   }

   private boolean method2647() {
      return field4776 != ItemGroup.field31677.method23641() && ItemGroup.field31664[field4776].method23650() && this.field4727.method18177();
   }

   private void method2648(ItemGroup var1) {
      int var4 = field4776;
      field4776 = var1.method23641();
      this.field4743.clear();
      this.field4727.field25498.clear();
      if (var1 != ItemGroup.field31676) {
         if (var1 != ItemGroup.SEARCH) {
            var1.method23658(this.field4727.field25498);
         }
      } else {
         CreativeSettings var5 = this.mc.getCreativeSettings();

         for (int var6 = 0; var6 < 9; var6++) {
            Class2356 var7 = var5.method27629(var6);
            if (!var7.isEmpty()) {
               this.field4727.field25498.addAll(var7);
            } else {
               for (int var8 = 0; var8 < 9; var8++) {
                  if (var8 != var6) {
                     this.field4727.field25498.add(ItemStack.EMPTY);
                  } else {
                     ItemStack var9 = new ItemStack(Items.field37899);
                     var9.method32144("CustomCreativeLock");
                     ITextComponent var10 = this.mc.gameSettings.keyBindsHotbar[var6].func_238171_j_();
                     ITextComponent var11 = this.mc.gameSettings.keyBindSaveToolbar.func_238171_j_();
                     var9.method32150(new TranslationTextComponent("inventory.hotbarInfo", var11, var10));
                     this.field4727.field25498.add(var9);
                  }
               }
            }
         }
      }

      if (var1 != ItemGroup.field31677) {
         if (var4 == ItemGroup.field31677.method23641()) {
            this.field4727.inventorySlots.clear();
            this.field4727.inventorySlots.addAll(this.field4780);
            this.field4780 = null;
         }
      } else {
         PlayerContainer var12 = this.mc.player.container;
         if (this.field4780 == null) {
            this.field4780 = ImmutableList.copyOf(this.field4727.inventorySlots);
         }

         this.field4727.inventorySlots.clear();

         for (int var13 = 0; var13 < var12.inventorySlots.size(); var13++) {
            int var14;
            int var15;
            if (var13 >= 5 && var13 < 9) {
               int var17 = var13 - 5;
               int var20 = var17 / 2;
               int var22 = var17 % 2;
               var14 = 54 + var20 * 54;
               var15 = 6 + var22 * 27;
            } else if (var13 >= 0 && var13 < 5) {
               var14 = -2000;
               var15 = -2000;
            } else if (var13 != 45) {
               int var16 = var13 - 9;
               int var19 = var16 % 9;
               int var21 = var16 / 9;
               var14 = 9 + var19 * 18;
               if (var13 < 36) {
                  var15 = 54 + var21 * 18;
               } else {
                  var15 = 112;
               }
            } else {
               var14 = 35;
               var15 = 20;
            }

            Class5848 var18 = new Class5848(var12.inventorySlots.get(var13), var13, var14, var15);
            this.field4727.inventorySlots.add(var18);
         }

         this.field4781 = new Slot(field4774, 0, 173, 112);
         this.field4727.inventorySlots.add(this.field4781);
      }

      if (this.field4779 != null) {
         if (var1 != ItemGroup.SEARCH) {
            this.field4779.method5671(false);
            this.field4779.method5669(true);
            this.field4779.method5654(false);
            this.field4779.method5635("");
         } else {
            this.field4779.method5671(true);
            this.field4779.method5669(false);
            this.field4779.method5654(true);
            if (var4 != var1.method23641()) {
               this.field4779.method5635("");
            }

            this.method2645();
         }
      }

      this.field4777 = 0.0F;
      this.field4727.method18176(0.0F);
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      if (this.method2647()) {
         int var9 = (this.field4727.field25498.size() + 9 - 1) / 9 - 5;
         this.field4777 = (float)((double)this.field4777 - var5 / (double)var9);
         this.field4777 = MathHelper.clamp(this.field4777, 0.0F, 1.0F);
         this.field4727.method18176(this.field4777);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.xSize) || var3 >= (double)(var6 + this.ySize);
      this.field4784 = var10 && !this.method2651(ItemGroup.field31664[field4776], var1, var3);
      return this.field4784;
   }

   public boolean method2650(double var1, double var3) {
      int var7 = this.field4734;
      int var8 = this.field4735;
      int var9 = var7 + 175;
      int var10 = var8 + 18;
      int var11 = var9 + 14;
      int var12 = var10 + 112;
      return var1 >= (double)var9 && var3 >= (double)var10 && var1 < (double)var11 && var3 < (double)var12;
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (!this.field4778) {
         return super.mouseDragged(var1, var3, var5, var6, var8);
      } else {
         int var12 = this.field4735 + 18;
         int var13 = var12 + 112;
         this.field4777 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field4777 = MathHelper.clamp(this.field4777, 0.0F, 1.0F);
         this.field4727.method18176(this.field4777);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);

      for (ItemGroup var10 : ItemGroup.field31664) {
         if (this.method2652(var1, var10, var2, var3)) {
            break;
         }
      }

      if (this.field4781 != null
         && field4776 == ItemGroup.field31677.method23641()
         && this.method2625(this.field4781.field25580, this.field4781.field25581, 16, 16, (double)var2, (double)var3)) {
         this.method2459(var1, field4775, var2, var3);
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   @Override
   public void method2457(MatrixStack var1, ItemStack var2, int var3, int var4) {
      if (field4776 != ItemGroup.SEARCH.method23641()) {
         super.method2457(var1, var2, var3, var4);
      } else {
         List var7 = var2.getTooltip(this.mc.player, !this.mc.gameSettings.field44588 ? TooltipFlags.NORMAL : TooltipFlags.field14481);
         ArrayList var8 = Lists.newArrayList(var7);
         Item var9 = var2.getItem();
         ItemGroup var10 = var9.method11739();
         if (var10 == null && var9 == Items.field38070) {
            Map var11 = EnchantmentHelper.method26312(var2);
            if (var11.size() == 1) {
               Enchantment var12 = (Enchantment)var11.keySet().iterator().next();

               for (ItemGroup var16 : ItemGroup.field31664) {
                  if (var16.method23657(var12.type)) {
                     var10 = var16;
                     break;
                  }
               }
            }
         }

         this.field4785.forEach((var2x, var3x) -> {
            if (var3x.method24917(var9)) {
               var8.add(1, new StringTextComponent("#" + var2x).mergeStyle(TextFormatting.DARK_PURPLE));
            }
         });
         if (var10 != null) {
            var8.add(1, var10.method23643().deepCopy().mergeStyle(TextFormatting.BLUE));
         }

         this.method2460(var1, var8, var3, var4);
      }
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      ItemGroup var7 = ItemGroup.field31664[field4776];

      for (ItemGroup var11 : ItemGroup.field31664) {
         this.mc.getTextureManager().bindTexture(field4773);
         if (var11.method23641() != field4776) {
            this.method2653(var1, var11);
         }
      }

      this.mc.getTextureManager().bindTexture(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + var7.method23645()));
      this.blit(var1, this.field4734, this.field4735, 0, 0, this.xSize, this.ySize);
      this.field4779.render(var1, var3, var4, var2);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var12 = this.field4734 + 175;
      int var13 = this.field4735 + 18;
      int var14 = var13 + 112;
      this.mc.getTextureManager().bindTexture(field4773);
      if (var7.method23650()) {
         this.blit(var1, var12, var13 + (int)((float)(var14 - var13 - 17) * this.field4777), 232 + (!this.method2647() ? 12 : 0), 0, 12, 15);
      }

      this.method2653(var1, var7);
      if (var7 == ItemGroup.field31677) {
         InventoryScreen.drawEntityOnScreen(
            this.field4734 + 88,
            this.field4735 + 45,
            20,
            (float)(this.field4734 + 88 - var3),
            (float)(this.field4735 + 45 - 30 - var4),
            this.mc.player
         );
      }
   }

   public boolean method2651(ItemGroup var1, double var2, double var4) {
      int var8 = var1.method23652();
      int var9 = 28 * var8;
      int var10 = 0;
      if (!var1.method23654()) {
         if (var8 > 0) {
            var9 += var8;
         }
      } else {
         var9 = this.xSize - 28 * (6 - var8) + 2;
      }

      if (!var1.method23653()) {
         var10 += this.ySize;
      } else {
         var10 -= 32;
      }

      return var2 >= (double)var9 && var2 <= (double)(var9 + 28) && var4 >= (double)var10 && var4 <= (double)(var10 + 32);
   }

   public boolean method2652(MatrixStack var1, ItemGroup var2, int var3, int var4) {
      int var7 = var2.method23652();
      int var8 = 28 * var7;
      int var9 = 0;
      if (!var2.method23654()) {
         if (var7 > 0) {
            var8 += var7;
         }
      } else {
         var8 = this.xSize - 28 * (6 - var7) + 2;
      }

      if (!var2.method23653()) {
         var9 += this.ySize;
      } else {
         var9 -= 32;
      }

      if (!this.method2625(var8 + 3, var9 + 3, 23, 27, (double)var3, (double)var4)) {
         return false;
      } else {
         this.method2459(var1, var2.method23643(), var3, var4);
         return true;
      }
   }

   public void method2653(MatrixStack var1, ItemGroup var2) {
      boolean var5 = var2.method23641() == field4776;
      boolean var6 = var2.method23653();
      int var7 = var2.method23652();
      int var8 = var7 * 28;
      byte var9 = 0;
      int var10 = this.field4734 + 28 * var7;
      int var11 = this.field4735;
      byte var12 = 32;
      if (var5) {
         var9 += 32;
      }

      if (!var2.method23654()) {
         if (var7 > 0) {
            var10 += var7;
         }
      } else {
         var10 = this.field4734 + this.xSize - 28 * (6 - var7);
      }

      if (!var6) {
         var9 += 64;
         var11 += this.ySize - 4;
      } else {
         var11 -= 28;
      }

      this.blit(var1, var10, var11, var8, var9, 28, 32);
      this.field4563.field847 = 100.0F;
      var10 += 6;
      var11 = var11 + 8 + (!var6 ? -1 : 1);
      RenderSystem.enableRescaleNormal();
      ItemStack var13 = var2.method23644();
      this.field4563.method793(var13, var10, var11);
      this.field4563.method797(this.font, var13, var10, var11);
      this.field4563.field847 = 0.0F;
   }

   public int method2654() {
      return field4776;
   }

   public static void handleHotbarSnapshots(Minecraft var0, int var1, boolean var2, boolean var3) {
      ClientPlayerEntity var6 = var0.player;
      CreativeSettings var7 = var0.getCreativeSettings();
      Class2356 var8 = var7.method27629(var1);
      if (!var2) {
         if (var3) {
            for (int var9 = 0; var9 < PlayerInventory.method4029(); var9++) {
               var8.set(var9, var6.inventory.getStackInSlot(var9).copy());
            }

            ITextComponent var11 = var0.gameSettings.keyBindsHotbar[var1].func_238171_j_();
            ITextComponent var10 = var0.gameSettings.keyBindLoadToolbar.func_238171_j_();
            var0.ingameGUI.method5985(new TranslationTextComponent("inventory.hotbarSaved", var10, var11), false);
            var7.method27628();
         }
      } else {
         for (int var12 = 0; var12 < PlayerInventory.method4029(); var12++) {
            ItemStack var13 = ((ItemStack)var8.get(var12)).copy();
            var6.inventory.setInventorySlotContents(var12, var13);
            var0.playerController.sendSlotPacket(var13, 36 + var12);
         }

         var6.container.detectAndSendChanges();
      }
   }

   // $VF: synthetic method
   public static Class927 method2660() {
      return field4774;
   }
}
