package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
   private Class1189 field4779;
   private List<Class5839> field4780;
   private Class5839 field4781;
   private Class877 field4782;
   private boolean field4783;
   private boolean field4784;
   private final Map<ResourceLocation, ITag<Item>> field4785 = Maps.newTreeMap();

   public CreativeScreen(PlayerEntity var1) {
      super(new Class5820(var1), var1.inventory, StringTextComponent.EMPTY);
      var1.field4905 = this.field4727;
      this.field4567 = true;
      this.field4722 = 136;
      this.field4721 = 195;
   }

   @Override
   public void tick() {
      if (this.field4562.playerController.isInCreativeMode()) {
         if (this.field4779 != null) {
            this.field4779.method5633();
         }
      } else {
         this.field4562.displayGuiScreen(new InventoryScreen(this.field4562.player));
      }
   }

   @Override
   public void method2626(Class5839 var1, int var2, int var3, Class2259 var4) {
      if (this.method2643(var1)) {
         this.field4779.method5652();
         this.field4779.method5668(0);
      }

      boolean var7 = var4 == Class2259.field14695;
      var4 = var2 == -999 && var4 == Class2259.field14694 ? Class2259.field14698 : var4;
      if (var1 == null && field4776 != ItemGroup.field31677.method23641() && var4 != Class2259.field14699) {
         PlayerInventory var16 = this.field4562.player.inventory;
         if (!var16.method4057().isEmpty() && this.field4784) {
            if (var3 == 0) {
               this.field4562.player.method2882(var16.method4057(), true);
               this.field4562.playerController.method23148(var16.method4057());
               var16.method4056(ItemStack.EMPTY);
            }

            if (var3 == 1) {
               ItemStack var21 = var16.method4057().method32106(1);
               this.field4562.player.method2882(var21, true);
               this.field4562.playerController.method23148(var21);
            }
         }
      } else {
         if (var1 != null && !var1.method18273(this.field4562.player)) {
            return;
         }

         if (var1 == this.field4781 && var7) {
            for (int var15 = 0; var15 < this.field4562.player.field4904.method18129().size(); var15++) {
               this.field4562.playerController.sendSlotPacket(ItemStack.EMPTY, var15);
            }
         } else if (field4776 != ItemGroup.field31677.method23641()) {
            if (var4 != Class2259.field14699 && var1.field25578 == field4774) {
               PlayerInventory var13 = this.field4562.player.inventory;
               ItemStack var18 = var13.method4057();
               ItemStack var22 = var1.method18265();
               if (var4 == Class2259.field14696) {
                  if (!var22.isEmpty()) {
                     ItemStack var25 = var22.copy();
                     var25.method32180(var25.method32113());
                     this.field4562.player.inventory.method3621(var3, var25);
                     this.field4562.player.field4904.method18130();
                  }

                  return;
               }

               if (var4 == Class2259.field14697) {
                  if (var13.method4057().isEmpty() && var1.method18266()) {
                     ItemStack var24 = var1.method18265().copy();
                     var24.method32180(var24.method32113());
                     var13.method4056(var24);
                  }

                  return;
               }

               if (var4 == Class2259.field14698) {
                  if (!var22.isEmpty()) {
                     ItemStack var23 = var22.copy();
                     var23.method32180(var3 != 0 ? var23.method32113() : 1);
                     this.field4562.player.method2882(var23, true);
                     this.field4562.playerController.method23148(var23);
                  }

                  return;
               }

               if (!var18.isEmpty() && !var22.isEmpty() && var18.method32132(var22) && ItemStack.method32127(var18, var22)) {
                  if (var3 != 0) {
                     var18.method32182(1);
                  } else if (!var7) {
                     if (var18.getCount() < var18.method32113()) {
                        var18.method32181(1);
                     }
                  } else {
                     var18.method32180(var18.method32113());
                  }
               } else if (!var22.isEmpty() && var18.isEmpty()) {
                  var13.method4056(var22.copy());
                  var18 = var13.method4057();
                  if (var7) {
                     var18.method32180(var18.method32113());
                  }
               } else if (var3 != 0) {
                  var13.method4057().method32182(1);
               } else {
                  var13.method4056(ItemStack.EMPTY);
               }
            } else if (this.field4727 != null) {
               ItemStack var8 = var1 != null ? this.field4727.method18131(var1.field25579).method18265() : ItemStack.EMPTY;
               this.field4727.method18132(var1 != null ? var1.field25579 : var2, var3, var4, this.field4562.player);
               if (Class5812.method18144(var3) != 2) {
                  if (var1 != null) {
                     ItemStack var9 = this.field4727.method18131(var1.field25579).method18265();
                     this.field4562.playerController.sendSlotPacket(var9, var1.field25579 - this.field4727.field25468.size() + 9 + 36);
                     int var10 = 45 + var3;
                     if (var4 != Class2259.field14696) {
                        if (var4 == Class2259.field14698 && !var8.isEmpty()) {
                           ItemStack var11 = var8.copy();
                           var11.method32180(var3 != 0 ? var11.method32113() : 1);
                           this.field4562.player.method2882(var11, true);
                           this.field4562.playerController.method23148(var11);
                        }
                     } else {
                        this.field4562.playerController.sendSlotPacket(var8, var10 - this.field4727.field25468.size() + 9 + 36);
                     }

                     this.field4562.player.field4904.method18130();
                  }
               } else {
                  for (int var17 = 0; var17 < 9; var17++) {
                     this.field4562.playerController.sendSlotPacket(this.field4727.method18131(45 + var17).method18265(), 36 + var17);
                  }
               }
            }
         } else if (var1 != this.field4781) {
            if (var4 == Class2259.field14698 && var1 != null && var1.method18266()) {
               ItemStack var14 = var1.method18272(var3 != 0 ? var1.method18265().method32113() : 1);
               ItemStack var20 = var1.method18265();
               this.field4562.player.method2882(var14, true);
               this.field4562.playerController.method23148(var14);
               this.field4562.playerController.sendSlotPacket(var20, Class5848.method18276((Class5848)var1).field25579);
            } else if (var4 == Class2259.field14698 && !this.field4562.player.inventory.method4057().isEmpty()) {
               this.field4562.player.method2882(this.field4562.player.inventory.method4057(), true);
               this.field4562.playerController.method23148(this.field4562.player.inventory.method4057());
               this.field4562.player.inventory.method4056(ItemStack.EMPTY);
            } else {
               this.field4562
                  .player
                  .field4904
                  .method18132(var1 != null ? Class5848.method18276((Class5848)var1).field25579 : var2, var3, var4, this.field4562.player);
               this.field4562.player.field4904.method18130();
            }
         } else {
            this.field4562.player.inventory.method4056(ItemStack.EMPTY);
         }
      }
   }

   private boolean method2643(Class5839 var1) {
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
   public void method1921() {
      if (!this.field4562.playerController.isInCreativeMode()) {
         this.field4562.displayGuiScreen(new InventoryScreen(this.field4562.player));
      } else {
         super.method1921();
         this.field4562.keyboardListener.method36347(true);
         this.field4779 = new Class1189(this.field4568, this.field4734 + 82, this.field4735 + 6, 80, 9, new TranslationTextComponent("itemGroup.search"));
         this.field4779.method5657(50);
         this.field4779.method5661(false);
         this.field4779.method5671(false);
         this.field4779.method5662(16777215);
         this.field4561.add(this.field4779);
         int var3 = field4776;
         field4776 = -1;
         this.method2648(ItemGroup.field31664[var3]);
         this.field4562.player.field4904.method18128(this.field4782);
         this.field4782 = new Class877(this.field4562);
         this.field4562.player.field4904.method18127(this.field4782);
      }
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field4779.method5636();
      this.init(var1, var2, var3);
      this.field4779.method5635(var6);
      if (!this.field4779.method5636().isEmpty()) {
         this.method2645();
      }
   }

   @Override
   public void onClose() {
      super.onClose();
      if (this.field4562.player != null && this.field4562.player.inventory != null) {
         this.field4562.player.field4904.method18128(this.field4782);
      }

      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1932(char var1, int var2) {
      if (!this.field4783) {
         if (field4776 == ItemGroup.SEARCH.method23641()) {
            String var5 = this.field4779.method5636();
            if (!this.field4779.method1932(var1, var2)) {
               return false;
            } else {
               if (!Objects.equals(var5, this.field4779.method5636())) {
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
   public boolean method1920(int var1, int var2, int var3) {
      this.field4783 = false;
      if (field4776 != ItemGroup.SEARCH.method23641()) {
         if (!this.field4562.gameSettings.keyBindChat.method8519(var1, var2)) {
            return super.method1920(var1, var2, var3);
         } else {
            this.field4783 = true;
            this.method2648(ItemGroup.SEARCH);
            return true;
         }
      } else {
         boolean var6 = !this.method2643(this.field4729) || this.field4729.method18266();
         boolean var7 = Class9798.method38637(var1, var2).method28103().isPresent();
         if (var6 && var7 && this.method2627(var1, var2)) {
            this.field4783 = true;
            return true;
         } else {
            String var8 = this.field4779.method5636();
            if (this.field4779.method1920(var1, var2, var3)) {
               if (!Objects.equals(var8, this.field4779.method5636())) {
                  this.method2645();
               }

               return true;
            } else {
               return this.field4779.method5746() && this.field4779.method5670() && var1 != 256 ? true : super.method1920(var1, var2, var3);
            }
         }
      }
   }

   @Override
   public boolean method2644(int var1, int var2, int var3) {
      this.field4783 = false;
      return super.method2644(var1, var2, var3);
   }

   private void method2645() {
      this.field4727.field25498.clear();
      this.field4785.clear();
      String var3 = this.field4779.method5636();
      if (!var3.isEmpty()) {
         IMutableSearchTree var4;
         if (!var3.startsWith("#")) {
            var4 = this.field4562.<ItemStack>getSearchTree(SearchTreeManager.ITEMS);
         } else {
            var3 = var3.substring(1);
            var4 = this.field4562.<ItemStack>getSearchTree(SearchTreeManager.TAGS);
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
         var7 = var2 -> var2.method8293().contains(var5) && var2.method8292().contains(var6);
      } else {
         var7 = var1x -> var1x.method8292().contains(var1);
      }

      Class7984<Item> var8 = Class5985.method18561();
      var8.method27137().stream().filter(var7).forEach(var2 -> {
         ITag var5x = this.field4785.put(var2, var8.method27135(var2));
      });
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      ItemGroup var6 = ItemGroup.field31664[field4776];
      if (var6.method23648()) {
         RenderSystem.disableBlend();
         this.field4568.method38805(var1, var6.method23643(), 8.0F, 6.0F, 4210752);
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
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

      return super.method1958(var1, var3, var5);
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
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

      return super.method2565(var1, var3, var5);
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
         CreativeSettings var5 = this.field4562.getCreativeSettings();

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
                     ITextComponent var10 = this.field4562.gameSettings.keyBindsHotbar[var6].method8521();
                     ITextComponent var11 = this.field4562.gameSettings.keyBindSaveToolbar.method8521();
                     var9.method32150(new TranslationTextComponent("inventory.hotbarInfo", var11, var10));
                     this.field4727.field25498.add(var9);
                  }
               }
            }
         }
      }

      if (var1 != ItemGroup.field31677) {
         if (var4 == ItemGroup.field31677.method23641()) {
            this.field4727.field25468.clear();
            this.field4727.field25468.addAll(this.field4780);
            this.field4780 = null;
         }
      } else {
         Class5830 var12 = this.field4562.player.field4904;
         if (this.field4780 == null) {
            this.field4780 = ImmutableList.copyOf(this.field4727.field25468);
         }

         this.field4727.field25468.clear();

         for (int var13 = 0; var13 < var12.field25468.size(); var13++) {
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

            Class5848 var18 = new Class5848(var12.field25468.get(var13), var13, var14, var15);
            this.field4727.field25468.add(var18);
         }

         this.field4781 = new Class5839(field4774, 0, 173, 112);
         this.field4727.field25468.add(this.field4781);
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
   public boolean method2649(double var1, double var3, double var5) {
      if (this.method2647()) {
         int var9 = (this.field4727.field25498.size() + 9 - 1) / 9 - 5;
         this.field4777 = (float)((double)this.field4777 - var5 / (double)var9);
         this.field4777 = MathHelper.method37777(this.field4777, 0.0F, 1.0F);
         this.field4727.method18176(this.field4777);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field4721) || var3 >= (double)(var6 + this.field4722);
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
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      if (!this.field4778) {
         return super.method2516(var1, var3, var5, var6, var8);
      } else {
         int var12 = this.field4735 + 18;
         int var13 = var12 + 112;
         this.field4777 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field4777 = MathHelper.method37777(this.field4777, 0.0F, 1.0F);
         this.field4727.method18176(this.field4777);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);

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

      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2457(MatrixStack var1, ItemStack var2, int var3, int var4) {
      if (field4776 != ItemGroup.SEARCH.method23641()) {
         super.method2457(var1, var2, var3, var4);
      } else {
         List var7 = var2.getTooltip(this.field4562.player, !this.field4562.gameSettings.field44588 ? TooltipFlags.NORMAL : TooltipFlags.field14481);
         ArrayList var8 = Lists.newArrayList(var7);
         Item var9 = var2.getItem();
         ItemGroup var10 = var9.method11739();
         if (var10 == null && var9 == Items.field38070) {
            Map var11 = Class7858.method26312(var2);
            if (var11.size() == 1) {
               Class6069 var12 = (Class6069)var11.keySet().iterator().next();

               for (ItemGroup var16 : ItemGroup.field31664) {
                  if (var16.method23657(var12.field27308)) {
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
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      ItemGroup var7 = ItemGroup.field31664[field4776];

      for (ItemGroup var11 : ItemGroup.field31664) {
         this.field4562.getTextureManager().bindTexture(field4773);
         if (var11.method23641() != field4776) {
            this.method2653(var1, var11);
         }
      }

      this.field4562.getTextureManager().bindTexture(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + var7.method23645()));
      this.method5696(var1, this.field4734, this.field4735, 0, 0, this.field4721, this.field4722);
      this.field4779.method1923(var1, var3, var4, var2);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      int var12 = this.field4734 + 175;
      int var13 = this.field4735 + 18;
      int var14 = var13 + 112;
      this.field4562.getTextureManager().bindTexture(field4773);
      if (var7.method23650()) {
         this.method5696(var1, var12, var13 + (int)((float)(var14 - var13 - 17) * this.field4777), 232 + (!this.method2647() ? 12 : 0), 0, 12, 15);
      }

      this.method2653(var1, var7);
      if (var7 == ItemGroup.field31677) {
         InventoryScreen.method2635(
            this.field4734 + 88,
            this.field4735 + 45,
            20,
            (float)(this.field4734 + 88 - var3),
            (float)(this.field4735 + 45 - 30 - var4),
            this.field4562.player
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
         var9 = this.field4721 - 28 * (6 - var8) + 2;
      }

      if (!var1.method23653()) {
         var10 += this.field4722;
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
         var8 = this.field4721 - 28 * (6 - var7) + 2;
      }

      if (!var2.method23653()) {
         var9 += this.field4722;
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
         var10 = this.field4734 + this.field4721 - 28 * (6 - var7);
      }

      if (!var6) {
         var9 += 64;
         var11 += this.field4722 - 4;
      } else {
         var11 -= 28;
      }

      this.method5696(var1, var10, var11, var8, var9, 28, 32);
      this.field4563.field847 = 100.0F;
      var10 += 6;
      var11 = var11 + 8 + (!var6 ? -1 : 1);
      RenderSystem.method27867();
      ItemStack var13 = var2.method23644();
      this.field4563.method793(var13, var10, var11);
      this.field4563.method797(this.field4568, var13, var10, var11);
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
               var8.set(var9, var6.inventory.method3618(var9).copy());
            }

            ITextComponent var11 = var0.gameSettings.keyBindsHotbar[var1].method8521();
            ITextComponent var10 = var0.gameSettings.keyBindLoadToolbar.method8521();
            var0.ingameGUI.method5985(new TranslationTextComponent("inventory.hotbarSaved", var10, var11), false);
            var7.method27628();
         }
      } else {
         for (int var12 = 0; var12 < PlayerInventory.method4029(); var12++) {
            ItemStack var13 = ((ItemStack)var8.get(var12)).copy();
            var6.inventory.method3621(var12, var13);
            var0.playerController.sendSlotPacket(var13, 36 + var12);
         }

         var6.field4904.method18130();
      }
   }

   // $VF: synthetic method
   public static Class927 method2660() {
      return field4774;
   }
}
