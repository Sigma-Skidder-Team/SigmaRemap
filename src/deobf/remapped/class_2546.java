package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2546 extends class_9331<class_7333> {
   private static final Identifier field_12617 = new Identifier("textures/gui/container/creative_inventory/tabs.png");
   private static final class_4657 field_12610 = new class_4657(45);
   private static final ITextComponent field_12614 = new TranslationTextComponent("inventory.binSlot");
   private static int field_12605 = class_8230.field_42278.method_37688();
   private float field_12609;
   private boolean field_12606;
   private class_1863 field_12608;
   private List<class_7934> field_12612;
   private class_7934 field_12611;
   private class_6487 field_12615;
   private boolean field_12613;
   private boolean field_12604;
   private final Map<Identifier, class_2307<class_2451>> field_12616 = Maps.newTreeMap();

   public class_2546(class_704 var1) {
      super(new class_7333(var1), var1.inventory, StringTextComponent.EMPTY);
      var1.field_3874 = this.field_10956;
      this.field_951 = true;
      this.field_10973 = 136;
      this.field_10981 = 195;
   }

   @Override
   public void method_5312() {
      if (this.field_943.playerController.method_42140()) {
         if (this.field_12608 != null) {
            this.field_12608.method_8279();
         }
      } else {
         this.field_943.method_8609(new class_3431(this.field_943.thePlayer));
      }
   }

   @Override
   public void method_10217(class_7934 var1, int var2, int var3, class_6269 var4) {
      if (this.method_11592(var1)) {
         this.field_12608.method_8278();
         this.field_12608.method_8248(0);
      }

      boolean var7 = var4 == class_6269.field_32019;
      var4 = var2 == -999 && var4 == class_6269.field_32027 ? class_6269.field_32024 : var4;
      if (var1 == null && field_12605 != class_8230.field_42263.method_37688() && var4 != class_6269.field_32022) {
         class_7051 var16 = this.field_943.thePlayer.inventory;
         if (!var16.method_32424().method_28022() && this.field_12604) {
            if (var3 == 0) {
               this.field_943.thePlayer.method_3153(var16.method_32424(), true);
               this.field_943.playerController.method_42157(var16.method_32424());
               var16.method_32408(ItemStack.EMPTY);
            }

            if (var3 == 1) {
               ItemStack var21 = var16.method_32424().method_27953(1);
               this.field_943.thePlayer.method_3153(var21, true);
               this.field_943.playerController.method_42157(var21);
            }
         }
      } else {
         if (var1 != null && !var1.method_35895(this.field_943.thePlayer)) {
            return;
         }

         if (var1 == this.field_12611 && var7) {
            for (int var15 = 0; var15 < this.field_943.thePlayer.field_3869.method_18868().size(); var15++) {
               this.field_943.playerController.method_42148(ItemStack.EMPTY, var15);
            }
         } else if (field_12605 != class_8230.field_42263.method_37688()) {
            if (var4 != class_6269.field_32022 && var1.field_40591 == field_12610) {
               class_7051 var13 = this.field_943.thePlayer.inventory;
               ItemStack var18 = var13.method_32424();
               ItemStack var22 = var1.method_35898();
               if (var4 == class_6269.field_32026) {
                  if (!var22.method_28022()) {
                     ItemStack var25 = var22.method_27973();
                     var25.method_28017(var25.method_28016());
                     this.field_943.thePlayer.inventory.method_31503(var3, var25);
                     this.field_943.thePlayer.field_3869.method_18877();
                  }

                  return;
               }

               if (var4 == class_6269.field_32025) {
                  if (var13.method_32424().method_28022() && var1.method_35884()) {
                     ItemStack var24 = var1.method_35898().method_27973();
                     var24.method_28017(var24.method_28016());
                     var13.method_32408(var24);
                  }

                  return;
               }

               if (var4 == class_6269.field_32024) {
                  if (!var22.method_28022()) {
                     ItemStack var23 = var22.method_27973();
                     var23.method_28017(var3 != 0 ? var23.method_28016() : 1);
                     this.field_943.thePlayer.method_3153(var23, true);
                     this.field_943.playerController.method_42157(var23);
                  }

                  return;
               }

               if (!var18.method_28022() && !var22.method_28022() && var18.method_27991(var22) && ItemStack.method_27956(var18, var22)) {
                  if (var3 != 0) {
                     var18.method_27970(1);
                  } else if (!var7) {
                     if (var18.method_27997() < var18.method_28016()) {
                        var18.method_28030(1);
                     }
                  } else {
                     var18.method_28017(var18.method_28016());
                  }
               } else if (!var22.method_28022() && var18.method_28022()) {
                  var13.method_32408(var22.method_27973());
                  var18 = var13.method_32424();
                  if (var7) {
                     var18.method_28017(var18.method_28016());
                  }
               } else if (var3 != 0) {
                  var13.method_32424().method_27970(1);
               } else {
                  var13.method_32408(ItemStack.EMPTY);
               }
            } else if (this.field_10956 != null) {
               ItemStack var8 = var1 != null ? this.field_10956.method_18878(var1.field_40588).method_35898() : ItemStack.EMPTY;
               this.field_10956.method_18865(var1 != null ? var1.field_40588 : var2, var3, var4, this.field_943.thePlayer);
               if (class_4088.method_18860(var3) != 2) {
                  if (var1 != null) {
                     ItemStack var9 = this.field_10956.method_18878(var1.field_40588).method_35898();
                     this.field_943.playerController.method_42148(var9, var1.field_40588 - this.field_10956.field_19926.size() + 9 + 36);
                     int var10 = 45 + var3;
                     if (var4 != class_6269.field_32026) {
                        if (var4 == class_6269.field_32024 && !var8.method_28022()) {
                           ItemStack var11 = var8.method_27973();
                           var11.method_28017(var3 != 0 ? var11.method_28016() : 1);
                           this.field_943.thePlayer.method_3153(var11, true);
                           this.field_943.playerController.method_42157(var11);
                        }
                     } else {
                        this.field_943.playerController.method_42148(var8, var10 - this.field_10956.field_19926.size() + 9 + 36);
                     }

                     this.field_943.thePlayer.field_3869.method_18877();
                  }
               } else {
                  for (int var17 = 0; var17 < 9; var17++) {
                     this.field_943.playerController.method_42148(this.field_10956.method_18878(45 + var17).method_35898(), 36 + var17);
                  }
               }
            }
         } else if (var1 != this.field_12611) {
            if (var4 == class_6269.field_32024 && var1 != null && var1.method_35884()) {
               ItemStack var14 = var1.method_35899(var3 != 0 ? var1.method_35898().method_28016() : 1);
               ItemStack var20 = var1.method_35898();
               this.field_943.thePlayer.method_3153(var14, true);
               this.field_943.playerController.method_42157(var14);
               this.field_943.playerController.method_42148(var20, class_6239.method_28501((class_6239)var1).field_40588);
            } else if (var4 == class_6269.field_32024 && !this.field_943.thePlayer.inventory.method_32424().method_28022()) {
               this.field_943.thePlayer.method_3153(this.field_943.thePlayer.inventory.method_32424(), true);
               this.field_943.playerController.method_42157(this.field_943.thePlayer.inventory.method_32424());
               this.field_943.thePlayer.inventory.method_32408(ItemStack.EMPTY);
            } else {
               this.field_943
                  .thePlayer
                  .field_3869
                  .method_18865(var1 != null ? class_6239.method_28501((class_6239)var1).field_40588 : var2, var3, var4, this.field_943.thePlayer);
               this.field_943.thePlayer.field_3869.method_18877();
            }
         } else {
            this.field_943.thePlayer.inventory.method_32408(ItemStack.EMPTY);
         }
      }
   }

   private boolean method_11592(class_7934 var1) {
      return var1 != null && var1.field_40591 == field_12610;
   }

   @Override
   public void method_43081() {
      int var3 = this.field_10984;
      super.method_43081();
      if (this.field_12608 != null && this.field_10984 != var3) {
         this.field_12608.method_8264(this.field_10984 + 82);
      }
   }

   @Override
   public void method_1163() {
      if (!this.field_943.playerController.method_42140()) {
         this.field_943.method_8609(new class_3431(this.field_943.thePlayer));
      } else {
         super.method_1163();
         this.field_943.field_9600.method_38887(true);
         this.field_12608 = new class_1863(this.field_948, this.field_10984 + 82, this.field_10962 + 6, 80, 9, new TranslationTextComponent("itemGroup.search"));
         this.field_12608.method_8255(50);
         this.field_12608.method_8258(false);
         this.field_12608.method_8270(false);
         this.field_12608.method_8250(16777215);
         this.field_942.add(this.field_12608);
         int var3 = field_12605;
         field_12605 = -1;
         this.method_11585(class_8230.field_42279[var3]);
         this.field_943.thePlayer.field_3869.method_18880(this.field_12615);
         this.field_12615 = new class_6487(this.field_943);
         this.field_943.thePlayer.field_3869.method_18888(this.field_12615);
      }
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_12608.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_12608.method_8281(var6);
      if (!this.field_12608.method_8246().isEmpty()) {
         this.method_11593();
      }
   }

   @Override
   public void method_1162() {
      super.method_1162();
      if (this.field_943.thePlayer != null && this.field_943.thePlayer.inventory != null) {
         this.field_943.thePlayer.field_3869.method_18880(this.field_12615);
      }

      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      if (!this.field_12613) {
         if (field_12605 == class_8230.field_42264.method_37688()) {
            String var5 = this.field_12608.method_8246();
            if (!this.field_12608.method_26938(var1, var2)) {
               return false;
            } else {
               if (!Objects.equals(var5, this.field_12608.method_8246())) {
                  this.method_11593();
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
   public boolean method_26946(int var1, int var2, int var3) {
      this.field_12613 = false;
      if (field_12605 != class_8230.field_42264.method_37688()) {
         if (!this.field_943.gameOptions.keyOpenChat.method_27062(var1, var2)) {
            return super.method_26946(var1, var2, var3);
         } else {
            this.field_12613 = true;
            this.method_11585(class_8230.field_42264);
            return true;
         }
      } else {
         boolean var6 = !this.method_11592(this.field_10954) || this.field_10954.method_35884();
         boolean var7 = class_9732.method_44940(var1, var2).method_16987().isPresent();
         if (var6 && var7 && this.method_10220(var1, var2)) {
            this.field_12613 = true;
            return true;
         } else {
            String var8 = this.field_12608.method_8246();
            if (this.field_12608.method_26946(var1, var2, var3)) {
               if (!Objects.equals(var8, this.field_12608.method_8246())) {
                  this.method_11593();
               }

               return true;
            } else {
               return this.field_12608.method_32691() && this.field_12608.method_8274() && var1 != 256 ? true : super.method_26946(var1, var2, var3);
            }
         }
      }
   }

   @Override
   public boolean method_26939(int var1, int var2, int var3) {
      this.field_12613 = false;
      return super.method_26939(var1, var2, var3);
   }

   private void method_11593() {
      this.field_10956.field_37486.clear();
      this.field_12616.clear();
      String var3 = this.field_12608.method_8246();
      if (!var3.isEmpty()) {
         class_1272 var4;
         if (!var3.startsWith("#")) {
            var4 = this.field_943.<ItemStack>method_8532(SearchManager.field_4279);
         } else {
            var3 = var3.substring(1);
            var4 = this.field_943.<ItemStack>method_8532(SearchManager.field_4275);
            this.method_11587(var3);
         }

         this.field_10956.field_37486.addAll(var4.method_14476(var3.toLowerCase(Locale.ROOT)));
      } else {
         for (class_2451 var5 : class_8669.field_44382) {
            var5.method_11239(class_8230.field_42264, this.field_10956.field_37486);
         }
      }

      this.field_12609 = 0.0F;
      this.field_10956.method_33420(0.0F);
   }

   private void method_11587(String var1) {
      int var4 = var1.indexOf(58);
      Predicate var7;
      if (var4 != -1) {
         String var5 = var1.substring(0, var4).trim();
         String var6 = var1.substring(var4 + 1).trim();
         var7 = var2 -> var2.method_21461().contains(var5) && var2.method_21456().contains(var6);
      } else {
         var7 = var1x -> var1x.method_21456().contains(var1);
      }

      class_9349 var8 = class_391.method_1891();
      var8.method_43141().stream().filter(var7).forEach(var2 -> {
         class_2307 var5x = this.field_12616.put(var2, var8.method_43140(var2));
      });
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      class_8230 var6 = class_8230.field_42279[field_12605];
      if (var6.method_37694()) {
         RenderSystem.method_16448();
         this.field_948.method_45378(var1, var6.method_37699(), 8.0F, 6.0F, 4210752);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var8 = var1 - (double)this.field_10984;
         double var10 = var3 - (double)this.field_10962;

         for (class_8230 var15 : class_8230.field_42279) {
            if (this.method_11586(var15, var8, var10)) {
               return true;
            }
         }

         if (field_12605 != class_8230.field_42263.method_37688() && this.method_11588(var1, var3)) {
            this.field_12606 = this.method_11584();
            return true;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var8 = var1 - (double)this.field_10984;
         double var10 = var3 - (double)this.field_10962;
         this.field_12606 = false;

         for (class_8230 var15 : class_8230.field_42279) {
            if (this.method_11586(var15, var8, var10)) {
               this.method_11585(var15);
               return true;
            }
         }
      }

      return super.method_26941(var1, var3, var5);
   }

   private boolean method_11584() {
      return field_12605 != class_8230.field_42263.method_37688() && class_8230.field_42279[field_12605].method_37689() && this.field_10956.method_33421();
   }

   private void method_11585(class_8230 var1) {
      int var4 = field_12605;
      field_12605 = var1.method_37688();
      this.field_10961.clear();
      this.field_10956.field_37486.clear();
      if (var1 != class_8230.field_42266) {
         if (var1 != class_8230.field_42264) {
            var1.method_37685(this.field_10956.field_37486);
         }
      } else {
         class_3459 var5 = this.field_943.method_8598();

         for (int var6 = 0; var6 < 9; var6++) {
            class_2024 var7 = var5.method_15915(var6);
            if (!var7.isEmpty()) {
               this.field_10956.field_37486.addAll(var7);
            } else {
               for (int var8 = 0; var8 < 9; var8++) {
                  if (var8 != var6) {
                     this.field_10956.field_37486.add(ItemStack.EMPTY);
                  } else {
                     ItemStack var9 = new ItemStack(class_4897.field_24622);
                     var9.method_27978("CustomCreativeLock");
                     ITextComponent var10 = this.field_943.gameOptions.hotbarKeys[var6].method_27061();
                     ITextComponent var11 = this.field_943.gameOptions.field_45562.method_27061();
                     var9.method_28032(new TranslationTextComponent("inventory.hotbarInfo", var11, var10));
                     this.field_10956.field_37486.add(var9);
                  }
               }
            }
         }
      }

      if (var1 != class_8230.field_42263) {
         if (var4 == class_8230.field_42263.method_37688()) {
            this.field_10956.field_19926.clear();
            this.field_10956.field_19926.addAll(this.field_12612);
            this.field_12612 = null;
         }
      } else {
         class_3683 var12 = this.field_943.thePlayer.field_3869;
         if (this.field_12612 == null) {
            this.field_12612 = ImmutableList.copyOf(this.field_10956.field_19926);
         }

         this.field_10956.field_19926.clear();

         for (int var13 = 0; var13 < var12.field_19926.size(); var13++) {
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

            class_6239 var18 = new class_6239(var12.field_19926.get(var13), var13, var14, var15);
            this.field_10956.field_19926.add(var18);
         }

         this.field_12611 = new class_7934(field_12610, 0, 173, 112);
         this.field_10956.field_19926.add(this.field_12611);
      }

      if (this.field_12608 != null) {
         if (var1 != class_8230.field_42264) {
            this.field_12608.method_8270(false);
            this.field_12608.method_8269(true);
            this.field_12608.method_8273(false);
            this.field_12608.method_8281("");
         } else {
            this.field_12608.method_8270(true);
            this.field_12608.method_8269(false);
            this.field_12608.method_8273(true);
            if (var4 != var1.method_37688()) {
               this.field_12608.method_8281("");
            }

            this.method_11593();
         }
      }

      this.field_12609 = 0.0F;
      this.field_10956.method_33420(0.0F);
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      if (this.method_11584()) {
         int var9 = (this.field_10956.field_37486.size() + 9 - 1) / 9 - 5;
         this.field_12609 = (float)((double)this.field_12609 - var5 / (double)var9);
         this.field_12609 = class_9299.method_42828(this.field_12609, 0.0F, 1.0F);
         this.field_10956.method_33420(this.field_12609);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
      this.field_12604 = var10 && !this.method_11586(class_8230.field_42279[field_12605], var1, var3);
      return this.field_12604;
   }

   public boolean method_11588(double var1, double var3) {
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      int var9 = var7 + 175;
      int var10 = var8 + 18;
      int var11 = var9 + 14;
      int var12 = var10 + 112;
      return var1 >= (double)var9 && var3 >= (double)var10 && var1 < (double)var11 && var3 < (double)var12;
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (!this.field_12606) {
         return super.method_26944(var1, var3, var5, var6, var8);
      } else {
         int var12 = this.field_10962 + 18;
         int var13 = var12 + 112;
         this.field_12609 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field_12609 = class_9299.method_42828(this.field_12609, 0.0F, 1.0F);
         this.field_10956.method_33420(this.field_12609);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);

      for (class_8230 var10 : class_8230.field_42279) {
         if (this.method_11591(var1, var10, var2, var3)) {
            break;
         }
      }

      if (this.field_12611 != null
         && field_12605 == class_8230.field_42263.method_37688()
         && this.method_10222(this.field_12611.field_40589, this.field_12611.field_40590, 16, 16, (double)var2, (double)var3)) {
         this.method_1176(var1, field_12614, var2, var3);
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_1177(class_7966 var1, ItemStack var2, int var3, int var4) {
      if (field_12605 != class_8230.field_42264.method_37688()) {
         super.method_1177(var1, var2, var3, var4);
      } else {
         List var7 = var2.method_28012(this.field_943.thePlayer, !this.field_943.gameOptions.field_45482 ? class_2575.field_12746 : class_2575.field_12747);
         ArrayList var8 = Lists.newArrayList(var7);
         class_2451 var9 = var2.method_27960();
         class_8230 var10 = var9.method_11226();
         if (var10 == null && var9 == class_4897.field_24879) {
            Map var11 = class_2931.method_13402(var2);
            if (var11.size() == 1) {
               class_4382 var12 = (class_4382)var11.keySet().iterator().next();

               for (class_8230 var16 : class_8230.field_42279) {
                  if (var16.method_37687(var12.field_21496)) {
                     var10 = var16;
                     break;
                  }
               }
            }
         }

         this.field_12616.forEach((var2x, var3x) -> {
            if (var3x.method_10609(var9)) {
               var8.add(1, new StringTextComponent("#" + var2x).mergeStyle(TextFormatting.DARK_PURPLE));
            }
         });
         if (var10 != null) {
            var8.add(1, var10.method_37699().deepCopy().mergeStyle(TextFormatting.BLUE));
         }

         this.method_1160(var1, var8, var3, var4);
      }
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      class_8230 var7 = class_8230.field_42279[field_12605];

      for (class_8230 var11 : class_8230.field_42279) {
         this.field_943.getTextureManager().bindTexture(field_12617);
         if (var11.method_37688() != field_12605) {
            this.method_11594(var1, var11);
         }
      }

      this.field_943.getTextureManager().bindTexture(new Identifier("textures/gui/container/creative_inventory/tab_" + var7.method_37703()));
      this.method_9781(var1, this.field_10984, this.field_10962, 0, 0, this.field_10981, this.field_10973);
      this.field_12608.method_6767(var1, var3, var4, var2);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var12 = this.field_10984 + 175;
      int var13 = this.field_10962 + 18;
      int var14 = var13 + 112;
      this.field_943.getTextureManager().bindTexture(field_12617);
      if (var7.method_37689()) {
         this.method_9781(var1, var12, var13 + (int)((float)(var14 - var13 - 17) * this.field_12609), 232 + (!this.method_11584() ? 12 : 0), 0, 12, 15);
      }

      this.method_11594(var1, var7);
      if (var7 == class_8230.field_42263) {
         class_3431.method_15860(
            this.field_10984 + 88,
            this.field_10962 + 45,
            20,
            (float)(this.field_10984 + 88 - var3),
            (float)(this.field_10962 + 45 - 30 - var4),
            this.field_943.thePlayer
         );
      }
   }

   public boolean method_11586(class_8230 var1, double var2, double var4) {
      int var8 = var1.method_37695();
      int var9 = 28 * var8;
      int var10 = 0;
      if (!var1.method_37686()) {
         if (var8 > 0) {
            var9 += var8;
         }
      } else {
         var9 = this.field_10981 - 28 * (6 - var8) + 2;
      }

      if (!var1.method_37700()) {
         var10 += this.field_10973;
      } else {
         var10 -= 32;
      }

      return var2 >= (double)var9 && var2 <= (double)(var9 + 28) && var4 >= (double)var10 && var4 <= (double)(var10 + 32);
   }

   public boolean method_11591(class_7966 var1, class_8230 var2, int var3, int var4) {
      int var7 = var2.method_37695();
      int var8 = 28 * var7;
      int var9 = 0;
      if (!var2.method_37686()) {
         if (var7 > 0) {
            var8 += var7;
         }
      } else {
         var8 = this.field_10981 - 28 * (6 - var7) + 2;
      }

      if (!var2.method_37700()) {
         var9 += this.field_10973;
      } else {
         var9 -= 32;
      }

      if (!this.method_10222(var8 + 3, var9 + 3, 23, 27, (double)var3, (double)var4)) {
         return false;
      } else {
         this.method_1176(var1, var2.method_37699(), var3, var4);
         return true;
      }
   }

   public void method_11594(class_7966 var1, class_8230 var2) {
      boolean var5 = var2.method_37688() == field_12605;
      boolean var6 = var2.method_37700();
      int var7 = var2.method_37695();
      int var8 = var7 * 28;
      byte var9 = 0;
      int var10 = this.field_10984 + 28 * var7;
      int var11 = this.field_10962;
      byte var12 = 32;
      if (var5) {
         var9 += 32;
      }

      if (!var2.method_37686()) {
         if (var7 > 0) {
            var10 += var7;
         }
      } else {
         var10 = this.field_10984 + this.field_10981 - 28 * (6 - var7);
      }

      if (!var6) {
         var9 += 64;
         var11 += this.field_10973 - 4;
      } else {
         var11 -= 28;
      }

      this.method_9781(var1, var10, var11, var8, var9, 28, 32);
      this.field_945.field_44875 = 100.0F;
      var10 += 6;
      var11 = var11 + 8 + (!var6 ? -1 : 1);
      RenderSystem.method_16381();
      ItemStack var13 = var2.method_37692();
      this.field_945.method_40274(var13, var10, var11);
      this.field_945.method_40281(this.field_948, var13, var10, var11);
      this.field_945.field_44875 = 0.0F;
   }

   public int method_11595() {
      return field_12605;
   }

   public static void method_11590(MinecraftClient var0, int var1, boolean var2, boolean var3) {
      class_5989 var6 = var0.thePlayer;
      class_3459 var7 = var0.method_8598();
      class_2024 var8 = var7.method_15915(var1);
      if (!var2) {
         if (var3) {
            for (int var9 = 0; var9 < class_7051.method_32422(); var9++) {
               var8.set(var9, var6.inventory.method_31498(var9).method_27973());
            }

            ITextComponent var11 = var0.gameOptions.hotbarKeys[var1].method_27061();
            ITextComponent var10 = var0.gameOptions.field_45486.method_27061();
            var0.field_9614.method_13982(new TranslationTextComponent("inventory.hotbarSaved", var10, var11), false);
            var7.method_15917();
         }
      } else {
         for (int var12 = 0; var12 < class_7051.method_32422(); var12++) {
            ItemStack var13 = ((ItemStack)var8.get(var12)).method_27973();
            var6.inventory.method_31503(var12, var13);
            var0.playerController.method_42148(var13, 36 + var12);
         }

         var6.field_3869.method_18877();
      }
   }
}
