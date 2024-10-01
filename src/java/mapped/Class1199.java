package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.ArrayList;
import java.util.List;

public class Class1199 extends Widget {
   private static final ResourceLocation field6491 = new ResourceLocation("textures/gui/recipe_book.png");
   private static final ITextComponent field6492 = new TranslationTextComponent("gui.recipebook.moreRecipes");
   private Class5828<?> field6493;
   private Class6941 field6494;
   private RecipeList field6495;
   private float field6496;
   private float field6497;
   private int field6498;

   public Class1199() {
      super(0, 0, 25, 25, StringTextComponent.EMPTY);
   }

   public void method5752(RecipeList var1, Class2954 var2) {
      this.field6495 = var1;
      this.field6493 = (Class5828<?>)var2.method11318().player.openContainer;
      this.field6494 = var2.method11319();
      List<IRecipe<?>> var5 = var1.method34893(this.field6494.method21370(this.field6493));

      for (IRecipe var7 : var5) {
         if (this.field6494.method21364(var7)) {
            var2.method11317(var5);
            this.field6497 = 15.0F;
            break;
         }
      }
   }

   public RecipeList method5753() {
      return this.field6495;
   }

   public void method5754(int var1, int var2) {
      this.field6477 = var1;
      this.field6478 = var2;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      if (!Screen.hasControlDown()) {
         this.field6496 += var4;
      }

      Minecraft var7 = Minecraft.getInstance();
      var7.getTextureManager().bindTexture(field6491);
      int var8 = 29;
      if (!this.field6495.method34890()) {
         var8 += 25;
      }

      int var9 = 206;
      if (this.field6495.method34893(this.field6494.method21370(this.field6493)).size() > 1) {
         var9 += 25;
      }

      boolean var10 = this.field6497 > 0.0F;
      if (var10) {
         float var11 = 1.0F + 0.1F * (float)Math.sin((double)(this.field6497 / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.field6477 + 8), (float)(this.field6478 + 12), 0.0F);
         RenderSystem.scalef(var11, var11, 1.0F);
         RenderSystem.translatef((float)(-(this.field6477 + 8)), (float)(-(this.field6478 + 12)), 0.0F);
         this.field6497 -= var4;
      }

      this.blit(var1, this.field6477, this.field6478, var8, var9, this.field6475, this.field6476);
      List var14 = this.method5755();
      this.field6498 = MathHelper.floor(this.field6496 / 30.0F) % var14.size();
      ItemStack var12 = ((IRecipe)var14.get(this.field6498)).getRecipeOutput();
      int var13 = 4;
      if (this.field6495.method34895() && this.method5755().size() > 1) {
         var7.getItemRenderer().method793(var12, this.field6477 + var13 + 1, this.field6478 + var13 + 1);
         var13--;
      }

      var7.getItemRenderer().method794(var12, this.field6477 + var13, this.field6478 + var13);
      if (var10) {
         RenderSystem.popMatrix();
      }
   }

   private List<IRecipe<?>> method5755() {
      List var3 = this.field6495.method34894(true);
      if (!this.field6494.method21370(this.field6493)) {
         var3.addAll(this.field6495.method34894(false));
      }

      return var3;
   }

   public boolean method5756() {
      return this.method5755().size() == 1;
   }

   public IRecipe<?> method5757() {
      List var3 = this.method5755();
      return (IRecipe<?>)var3.get(this.field6498);
   }

   public List<ITextComponent> method5758(Screen var1) {
      ItemStack var4 = this.method5755().get(this.field6498).getRecipeOutput();
      ArrayList var5 = Lists.newArrayList(var1.method2458(var4));
      if (this.field6495.method34893(this.field6494.method21370(this.field6493)).size() > 1) {
         var5.add(field6492);
      }

      return var5;
   }

   @Override
   public int method5740() {
      return 25;
   }

   @Override
   public boolean method5735(int var1) {
      return var1 == 0 || var1 == 1;
   }
}
