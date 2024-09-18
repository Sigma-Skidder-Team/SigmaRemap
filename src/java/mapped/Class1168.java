package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.AbstractGui;

import java.text.DateFormat;
import java.util.Date;

public class Class1168 extends Class1155<Class1168> {
   private final Class6122 field6333;
   public final Class807 field6334;

   public Class1168(Class807 var1, Class6122 var2) {
      this.field6334 = var1;
      this.field6333 = var2;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5573(var1, this.field6333, var4 - 40, var3, var7, var8);
   }

   private void method5573(MatrixStack var1, Class6122 var2, int var3, int var4, int var5, int var6) {
      int var9 = !var2.method18892() ? 16777215 : -8388737;
      Class807.method2196(this.field6334)
         .method38801(var1, "Backup (" + Class9740.method38174(var2.field27411) + ")", (float)(var3 + 40), (float)(var4 + 1), var9);
      Class807.method2197(this.field6334).method38801(var1, this.method5574(var2.field27411), (float)(var3 + 40), (float)(var4 + 12), 5000268);
      int var10 = this.field6334.width - 175;

      int var12 = var10 - 10;
      boolean var13 = false;
      if (!Class807.method2184(this.field6334).field27452) {
         this.method5575(var1, var10, var4 + -3, var5, var6);
      }

      if (!var2.field27415.isEmpty()) {
         this.method5576(var1, var12, var4 + 0, var5, var6);
      }
   }

   private String method5574(Date var1) {
      return DateFormat.getDateTimeInstance(3, 3).format(var1);
   }

   private void method5575(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 12 && var5 >= var3 && var5 <= var3 + 14 && var5 < this.field6334.height - 15 && var5 > 32;
      Class807.method2199(this.field6334).getTextureManager().bindTexture(Class807.method2198());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(0.5F, 0.5F, 0.5F);
      float var9 = !var8 ? 0.0F : 28.0F;
      AbstractGui.method5699(var1, var2 * 2, var3 * 2, 0.0F, var9, 23, 28, 23, 56);
      RenderSystem.popMatrix();
      if (var8) {
         Class807.method2200(this.field6334, Class807.method2201());
      }
   }

   private void method5576(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 8 && var5 >= var3 && var5 <= var3 + 8 && var5 < this.field6334.height - 15 && var5 > 32;
      Class807.method2203(this.field6334).getTextureManager().bindTexture(Class807.method2202());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(0.5F, 0.5F, 0.5F);
      float var9 = !var8 ? 0.0F : 15.0F;
      AbstractGui.method5699(var1, var2 * 2, var3 * 2, 0.0F, var9, 15, 15, 15, 30);
      RenderSystem.popMatrix();
      if (var8) {
         Class807.method2200(this.field6334, Class807.method2204());
      }
   }
}
