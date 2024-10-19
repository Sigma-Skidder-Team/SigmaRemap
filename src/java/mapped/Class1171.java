package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.item.Item;

public class Class1171 extends Class1155<Class1171> {
   public final Class1282 field6346;

   public Class1171(Class1282 var1) {
      this.field6346 = var1;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Item var13 = Class1305.method6196(this.field6346.field6846).field6842.get(var2);
      Class1305.method6197(this.field6346.field6846, var1, var4 + 40, var3, var13);

      for (int var14 = 0; var14 < Class1305.method6196(this.field6346.field6846).field6838.size(); var14++) {
         Class9007 var15;
         if (!(var13 instanceof Class3292)) {
            var15 = null;
         } else {
            var15 = Class1305.method6196(this.field6346.field6846).field6838.get(var14).method172(((Class3292)var13).method11845());
         }

         this.method5577(var1, var15, var4 + Class1305.method6194(this.field6346.field6846, var14), var3, var2 % 2 == 0);
      }

      for (int var16 = 0; var16 < Class1305.method6196(this.field6346.field6846).field6839.size(); var16++) {
         this.method5577(
            var1,
            Class1305.method6196(this.field6346.field6846).field6839.get(var16).method172(var13),
            var4 + Class1305.method6194(this.field6346.field6846, var16 + Class1305.method6196(this.field6346.field6846).field6838.size()),
            var3,
            var2 % 2 == 0
         );
      }
   }

   public void method5577(MatrixStack var1, Class9007<?> var2, int var3, int var4, boolean var5) {
      String var8 = var2 != null ? var2.method33277(Class1305.method6193(this.field6346.field6846).method28961(var2)) : "-";
      AbstractGui.drawString(
         var1, this.field6346.field6846.font, var8, var3 - this.field6346.field6846.font.getStringWidth(var8), var4 + 5, !var5 ? 9474192 : 16777215
      );
   }
}
