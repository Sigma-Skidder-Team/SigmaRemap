package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.StringTextComponent;

import java.util.Iterator;
import java.util.List;

public class Class1251 extends Widget implements Class1253<Class120> {
   private static String[] field6623;
   private final IRecipe<?> field6624;
   private final boolean field6625;
   public final List<Class8834> field6626;
   public final Class1263 field6627;

   public Class1251(Class1263 var0, int var1, int var2, IRecipe<?> var3, boolean var4) {
      super(var1, var2, 200, 20, StringTextComponent.EMPTY);
      this.field6627 = var0;
      this.field6626 = Lists.newArrayList();
      this.width = 24;
      this.height = 24;
      this.field6624 = var3;
      this.field6625 = var4;
      this.method5829(var3);
   }

   public void method5829(IRecipe<?> var1) {
      this.method5832(3, 3, -1, var1, var1.method14969().iterator(), 0);
   }

   @Override
   public void method5830(Iterator<Class120> var1, int var2, int var3, int var4, int var5) {
      ItemStack[] var8 = ((Class120)var1.next()).method332();
      if (var8.length != 0) {
         this.field6626.add(new Class8834(this, 3 + var5 * 7, 3 + var4 * 7, var8));
      }
   }

   @Override
   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      RenderSystem.enableAlphaTest();
      Class1263.method5908(this.field6627).getTextureManager().bindTexture(Class1263.method5907());
      int var7 = 152;
      if (!this.field6625) {
         var7 += 26;
      }

      int var8 = !Class1263.method5909(this.field6627) ? 78 : 130;
      if (this.isHovered()) {
         var8 += 26;
      }

      this.blit(var1, this.x, this.y, var7, var8, this.width, this.height);

      for (Class8834 var10 : this.field6626) {
         RenderSystem.pushMatrix();
         int var12 = (int)((float)(this.x + var10.field39895) / 0.42F - 3.0F);
         int var13 = (int)((float)(this.y + var10.field39896) / 0.42F - 3.0F);
         RenderSystem.scalef(0.42F, 0.42F, 1.0F);
         Class1263.method5908(this.field6627)
            .getItemRenderer()
            .method793(var10.field39894[MathHelper.floor(Class1263.method5910(this.field6627) / 30.0F) % var10.field39894.length], var12, var13);
         RenderSystem.popMatrix();
      }

      RenderSystem.disableAlphaTest();
   }

   // $VF: synthetic method
   public static IRecipe method5831(Class1251 var0) {
      return var0.field6624;
   }
}
