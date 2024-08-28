package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class Class9235 {
   private static String[] field42509;
   private Class4843<?> field42510;
   private final List<Class8055> field42511 = Lists.newArrayList();
   private float field42512;

   public void method34733() {
      this.field42510 = null;
      this.field42511.clear();
      this.field42512 = 0.0F;
   }

   public void method34734(Class120 var1, int var2, int var3) {
      this.field42511.add(new Class8055(this, var1, var2, var3));
   }

   public Class8055 method34735(int var1) {
      return this.field42511.get(var1);
   }

   public int method34736() {
      return this.field42511.size();
   }

   @Nullable
   public Class4843<?> method34737() {
      return this.field42510;
   }

   public void method34738(Class4843<?> var1) {
      this.field42510 = var1;
   }

   public void method34739(Class9332 var1, Minecraft var2, int var3, int var4, boolean var5, float var6) {
      if (!Screen.method2475()) {
         this.field42512 += var6;
      }

      for (int var9 = 0; var9 < this.field42511.size(); var9++) {
         Class8055 var10 = this.field42511.get(var9);
         int var11 = var10.method27660() + var3;
         int var12 = var10.method27661() + var4;
         if (var9 == 0 && var5) {
            Class1193.method5686(var1, var11 - 4, var12 - 4, var11 + 20, var12 + 20, 822018048);
         } else {
            Class1193.method5686(var1, var11, var12, var11 + 16, var12 + 16, 822018048);
         }

         ItemStack var13 = var10.method27662();
         Class216 var14 = var2.method1555();
         var14.method794(var13, var11, var12);
         RenderSystem.depthFunc(516);
         Class1193.method5686(var1, var11, var12, var11 + 16, var12 + 16, 822083583);
         RenderSystem.depthFunc(515);
         if (var9 == 0) {
            var14.method797(var2.field1294, var13, var11, var12);
         }
      }
   }

   // $VF: synthetic method
   public static float method34740(Class9235 var0) {
      return var0.field42512;
   }
}
