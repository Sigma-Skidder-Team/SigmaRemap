package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8002 extends AbstractGui implements IRenderable, class_5888, class_5140, class_2855<class_8137> {
   public static final Identifier field_40990 = new Identifier("textures/gui/recipe_book.png");
   private static final ITextComponent field_41003 = new TranslationTextComponent("gui.recipebook.search_hint")
      .mergeStyle(TextFormatting.ITALIC)
      .mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_40998 = new TranslationTextComponent("gui.recipebook.toggleRecipes.craftable");
   private static final ITextComponent field_40996 = new TranslationTextComponent("gui.recipebook.toggleRecipes.all");
   private int field_40993;
   private int field_41007;
   private int field_41009;
   public final class_7590 field_41000 = new class_7590();
   private final List<class_5206> field_41008 = Lists.newArrayList();
   private class_5206 field_40999;
   public class_5986 field_40991;
   public class_3954<?> field_41004;
   public MinecraftClient field_41006;
   private class_1863 field_41002;
   private String field_41001 = "";
   private ClientRecipeBook field_40992;
   private final class_65 field_41005 = new class_65();
   private final class_534 field_40995 = new class_534();
   private int field_40994;
   private boolean field_41010;

   public void method_36308(int var1, int var2, MinecraftClient var3, boolean var4, class_3954<?> var5) {
      this.field_41006 = var3;
      this.field_41007 = var1;
      this.field_41009 = var2;
      this.field_41004 = var5;
      var3.thePlayer.field_3874 = var5;
      this.field_40992 = var3.thePlayer.method_27334();
      this.field_40994 = var3.thePlayer.inventory.method_32399();
      if (this.method_36314()) {
         this.method_36323(var4);
      }

      var3.field_9600.method_38887(true);
   }

   public void method_36323(boolean var1) {
      this.field_40993 = !var1 ? 86 : 0;
      int var4 = (this.field_41007 - 147) / 2 - this.field_40993;
      int var5 = (this.field_41009 - 166) / 2;
      this.field_40995.method_2602();
      this.field_41006.thePlayer.inventory.method_32409(this.field_40995);
      this.field_41004.method_18269(this.field_40995);
      String var6 = this.field_41002 == null ? "" : this.field_41002.method_8246();
      this.field_41002 = new class_1863(this.field_41006.textRenderer, var4 + 25, var5 + 14, 80, 14, new TranslationTextComponent("itemGroup.search"));
      this.field_41002.method_8255(50);
      this.field_41002.method_8258(false);
      this.field_41002.method_8270(true);
      this.field_41002.method_8250(16777215);
      this.field_41002.method_8281(var6);
      this.field_41005.method_49(this.field_41006, var4, var5);
      this.field_41005.method_52(this);
      this.field_40991 = new class_5986(var4 + 110, var5 + 12, 26, 16, this.field_40992.method_5079(this.field_41004));
      this.method_36317();
      this.field_41008.clear();

      for (class_1296 var8 : class_1296.method_5873(this.field_41004.method_18263())) {
         this.field_41008.add(new class_5206(var8));
      }

      if (this.field_40999 != null) {
         this.field_40999 = this.field_41008
            .stream()
            .filter(var1x -> var1x.method_23884().equals(this.field_40999.method_23884()))
            .findFirst()
            .orElse((class_5206)null);
      }

      if (this.field_40999 == null) {
         this.field_40999 = this.field_41008.get(0);
      }

      this.field_40999.method_27296(true);
      this.method_36305(false);
      this.method_36313();
   }

   @Override
   public boolean method_26942(boolean var1) {
      return false;
   }

   public void method_36317() {
      this.field_40991.method_27297(152, 41, 28, 18, field_40990);
   }

   public void method_36311() {
      this.field_41002 = null;
      this.field_40999 = null;
      this.field_41006.field_9600.method_38887(false);
   }

   public int method_36325(boolean var1, int var2, int var3) {
      int var6;
      if (this.method_36314() && !var1) {
         var6 = 177 + (var2 - var3 - 200) / 2;
      } else {
         var6 = (var2 - var3) / 2;
      }

      return var6;
   }

   public void method_36326() {
      this.method_36324(!this.method_36314());
   }

   public boolean method_36314() {
      return this.field_40992.method_5075(this.field_41004.method_18263());
   }

   public void method_36324(boolean var1) {
      this.field_40992.method_5076(this.field_41004.method_18263(), var1);
      if (!var1) {
         this.field_41005.method_51();
      }

      this.method_36303();
   }

   public void method_36309(class_7934 var1) {
      if (var1 != null && var1.field_40588 < this.field_41004.method_18265()) {
         this.field_41000.method_34484();
         if (this.method_36314()) {
            this.method_36306();
         }
      }
   }

   private void method_36305(boolean var1) {
      List var4 = this.field_40992.method_12233(this.field_40999.method_23884());
      var4.forEach(var1x -> var1x.method_35009(this.field_40995, this.field_41004.method_18268(), this.field_41004.method_18266(), this.field_40992));
      ArrayList var5 = Lists.newArrayList(var4);
      var5.removeIf(var0 -> !var0.method_35012());
      var5.removeIf(var0 -> !var0.method_35010());
      String var6 = this.field_41002.method_8246();
      if (!var6.isEmpty()) {
         ObjectLinkedOpenHashSet var7 = new ObjectLinkedOpenHashSet(
            this.field_41006.<class_7735>method_8532(SearchManager.field_4278).method_14476(var6.toLowerCase(Locale.ROOT))
         );
         var5.removeIf(var1x -> !var7.contains(var1x));
      }

      if (this.field_40992.method_5079(this.field_41004)) {
         var5.removeIf(var0 -> !var0.method_35013());
      }

      this.field_41005.method_58(var5, var1);
   }

   private void method_36313() {
      int var3 = (this.field_41007 - 147) / 2 - this.field_40993 - 30;
      int var4 = (this.field_41009 - 166) / 2 + 3;
      byte var5 = 27;
      int var6 = 0;

      for (class_5206 var8 : this.field_41008) {
         class_1296 var9 = var8.method_23884();
         if (var9 == class_1296.field_7144 || var9 == class_1296.field_7126) {
            var8.field_36677 = true;
            var8.method_27298(var3, var4 + 27 * var6++);
         } else if (var8.method_23882(this.field_40992)) {
            var8.method_27298(var3, var4 + 27 * var6++);
            var8.method_23881(this.field_41006);
         }
      }
   }

   public void method_36315() {
      if (this.method_36314()) {
         if (this.field_40994 != this.field_41006.thePlayer.inventory.method_32399()) {
            this.method_36306();
            this.field_40994 = this.field_41006.thePlayer.inventory.method_32399();
         }

         this.field_41002.method_8279();
      }
   }

   private void method_36306() {
      this.field_40995.method_2602();
      this.field_41006.thePlayer.inventory.method_32409(this.field_40995);
      this.field_41004.method_18269(this.field_40995);
      this.method_36305(false);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.method_36314()) {
         RenderSystem.method_16438();
         RenderSystem.method_16413(0.0F, 0.0F, 100.0F);
         this.field_41006.getTextureManager().bindTexture(field_40990);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var7 = (this.field_41007 - 147) / 2 - this.field_40993;
         int var8 = (this.field_41009 - 166) / 2;
         this.method_9781(var1, var7, var8, 1, 1, 147, 166);
         if (!this.field_41002.method_32691() && this.field_41002.method_8246().isEmpty()) {
            method_9771(var1, this.field_41006.textRenderer, field_41003, var7 + 25, var8 + 14, -1);
         } else {
            this.field_41002.method_6767(var1, var2, var3, var4);
         }

         for (class_5206 var10 : this.field_41008) {
            var10.method_6767(var1, var2, var3, var4);
         }

         this.field_40991.method_6767(var1, var2, var3, var4);
         this.field_41005.method_45(var1, var7, var8, var2, var3, var4);
         RenderSystem.method_16489();
      }
   }

   public void method_36301(class_7966 var1, int var2, int var3, int var4, int var5) {
      if (this.method_36314()) {
         this.field_41005.method_54(var1, var4, var5);
         if (this.field_40991.method_32703()) {
            ITextComponent var8 = this.method_36312();
            if (this.field_41006.field_9623 != null) {
               this.field_41006.field_9623.method_1176(var1, var8, var4, var5);
            }
         }

         this.method_36310(var1, var2, var3, var4, var5);
      }
   }

   private ITextComponent method_36312() {
      return !this.field_40991.method_27299() ? field_40996 : this.method_36319();
   }

   public ITextComponent method_36319() {
      return field_40998;
   }

   private void method_36310(class_7966 var1, int var2, int var3, int var4, int var5) {
      ItemStack var8 = null;

      for (int var9 = 0; var9 < this.field_41000.method_34492(); var9++) {
         class_3482 var10 = this.field_41000.method_34487(var9);
         int var11 = var10.method_15981() + var2;
         int var12 = var10.method_15979() + var3;
         if (var4 >= var11 && var5 >= var12 && var4 < var11 + 16 && var5 < var12 + 16) {
            var8 = var10.method_15980();
         }
      }

      if (var8 != null && this.field_41006.field_9623 != null) {
         this.field_41006.field_9623.method_1160(var1, this.field_41006.field_9623.method_1179(var8), var4, var5);
      }
   }

   public void method_36322(class_7966 var1, int var2, int var3, boolean var4, float var5) {
      this.field_41000.method_34485(var1, this.field_41006, var2, var3, var4, var5);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.method_36314() && !this.field_41006.thePlayer.method_37221()) {
         if (this.field_41005.method_53(var1, var3, var5, (this.field_41007 - 147) / 2 - this.field_40993, (this.field_41009 - 166) / 2, 147, 166)) {
            class_8932 var11 = this.field_41005.method_55();
            class_7735 var12 = this.field_41005.method_57();
            if (var11 != null && var12 != null) {
               if (!var12.method_35014(var11) && this.field_41000.method_34486() == var11) {
                  return false;
               }

               this.field_41000.method_34484();
               this.field_41006.playerController.method_42151(this.field_41006.thePlayer.field_3874.field_19925, var11, Screen.method_1190());
               if (!this.method_36307()) {
                  this.method_36324(false);
               }
            }

            return true;
         } else if (this.field_41002.method_26940(var1, var3, var5)) {
            return true;
         } else if (this.field_40991.method_26940(var1, var3, var5)) {
            boolean var10 = this.method_36316();
            this.field_40991.method_27296(var10);
            this.method_36303();
            this.method_36305(false);
            return true;
         } else {
            for (class_5206 var9 : this.field_41008) {
               if (var9.method_26940(var1, var3, var5)) {
                  if (this.field_40999 != var9) {
                     this.field_40999.method_27296(false);
                     this.field_40999 = var9;
                     this.field_40999.method_27296(true);
                     this.method_36305(true);
                  }

                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_36316() {
      class_4269 var3 = this.field_41004.method_18263();
      boolean var4 = !this.field_40992.method_5082(var3);
      this.field_40992.method_5071(var3, var4);
      return var4;
   }

   public boolean method_36304(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      if (!this.method_36314()) {
         return true;
      } else {
         boolean var12 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + var7) || var3 >= (double)(var6 + var8);
         boolean var13 = (double)(var5 - 147) < var1 && var1 < (double)var5 && (double)var6 < var3 && var3 < (double)(var6 + var8);
         return var12 && !var13 && !this.field_40999.method_32703();
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      this.field_41010 = false;
      if (!this.method_36314() || this.field_41006.thePlayer.method_37221()) {
         return false;
      } else if (var1 == 256 && !this.method_36307()) {
         this.method_36324(false);
         return true;
      } else if (this.field_41002.method_26946(var1, var2, var3)) {
         this.method_36320();
         return true;
      } else if (this.field_41002.method_32691() && this.field_41002.method_8274() && var1 != 256) {
         return true;
      } else if (this.field_41006.gameOptions.keyOpenChat.method_27062(var1, var2) && !this.field_41002.method_32691()) {
         this.field_41010 = true;
         this.field_41002.method_8273(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26939(int var1, int var2, int var3) {
      this.field_41010 = false;
      return class_5888.super.method_26939(var1, var2, var3);
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      if (!this.field_41010) {
         if (!this.method_36314() || this.field_41006.thePlayer.method_37221()) {
            return false;
         } else if (!this.field_41002.method_26938(var1, var2)) {
            return class_5888.super.method_26938(var1, var2);
         } else {
            this.method_36320();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return false;
   }

   private void method_36320() {
      String var3 = this.field_41002.method_8246().toLowerCase(Locale.ROOT);
      this.method_36318(var3);
      if (!var3.equals(this.field_41001)) {
         this.method_36305(false);
         this.field_41001 = var3;
      }
   }

   private void method_36318(String var1) {
      if ("excitedze".equals(var1)) {
         class_2435 var4 = this.field_41006.method_8561();
         class_7395 var5 = var4.method_11095("en_pt");
         if (var4.method_11096().compareTo(var5) == 0) {
            return;
         }

         var4.method_11097(var5);
         this.field_41006.gameOptions.field_45437 = var5.getCode();
         this.field_41006.method_8524();
         this.field_41006.gameOptions.method_40873();
      }
   }

   private boolean method_36307() {
      return this.field_40993 == 86;
   }

   public void method_36321() {
      this.method_36313();
      if (this.method_36314()) {
         this.method_36305(false);
      }
   }

   @Override
   public void method_23554(List<class_8932<?>> var1) {
      for (class_8932 var5 : var1) {
         this.field_41006.thePlayer.method_27326(var5);
      }
   }

   public void method_36302(class_8932<?> var1, List<class_7934> var2) {
      ItemStack var5 = var1.method_41044();
      this.field_41000.method_34490(var1);
      this.field_41000.method_34491(class_8137.method_37029(var5), ((class_7934)var2.get(0)).field_40589, ((class_7934)var2.get(0)).field_40590);
      this.method_12972(
         this.field_41004.method_18268(), this.field_41004.method_18266(), this.field_41004.method_18262(), var1, var1.method_41043().iterator(), 0
      );
   }

   @Override
   public void method_12971(Iterator<class_8137> var1, int var2, int var3, int var4, int var5) {
      class_8137 var8 = (class_8137)var1.next();
      if (!var8.method_37033()) {
         class_7934 var9 = this.field_41004.field_19926.get(var2);
         this.field_41000.method_34491(var8, var9.field_40589, var9.field_40590);
      }
   }

   public void method_36303() {
      if (this.field_41006.method_8614() != null) {
         class_4269 var3 = this.field_41004.method_18263();
         boolean var4 = this.field_40992.method_5074().method_34301(var3);
         boolean var5 = this.field_40992.method_5074().method_34305(var3);
         this.field_41006.method_8614().method_4813(new class_9066(var3, var4, var5));
      }
   }
}
