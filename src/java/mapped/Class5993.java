package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.FontRenderer;

import java.util.List;

public final class Class5993 implements Class5991 {
   private static String[] field26164;
   public final List<Class9806> field26165;
   public final FontRenderer field26166;

   public Class5993(List<Class9806> var1, FontRenderer var2) {
      this.field26165 = var1;
      this.field26166 = var2;
   }

   @Override
   public int method18588(MatrixStack var1, int var2, int var3) {
      return this.method18589(var1, var2, var3, 9, 16777215);
   }

   @Override
   public int method18589(MatrixStack var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (Class9806 var10 : this.field26165) {
         this.field26166.method38802(var1, Class9806.method38682(var10), (float)(var2 - Class9806.method38683(var10) / 2), (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method18590(MatrixStack var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (Class9806 var10 : this.field26165) {
         this.field26166.method38802(var1, Class9806.method38682(var10), (float)var2, (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method18591(MatrixStack var1, int var2, int var3, int var4, int var5) {
      int var8 = var3;

      for (Class9806 var10 : this.field26165) {
         this.field26166.method38804(var1, Class9806.method38682(var10), (float)var2, (float)var8, var5);
         var8 += var4;
      }

      return var8;
   }

   @Override
   public int method18592() {
      return this.field26165.size();
   }
}
