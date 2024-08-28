package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Class1255 extends Class1254 {
   private Iterator<Class3257> field6650;
   private Set<Class3257> field6651;
   private Class5839 field6652;
   private Class3257 field6653;
   private float field6654;

   @Override
   public void method5835() {
      this.field6640.method5821(152, 182, 28, 18, field6630);
   }

   @Override
   public void method5841(Class5839 var1) {
      super.method5841(var1);
      if (var1 != null && var1.field25579 < this.field6641.method18226()) {
         this.field6652 = null;
      }
   }

   @Override
   public void method5858(Class4843<?> var1, List<Class5839> var2) {
      ItemStack var5 = var1.method14966();
      this.field6637.method34738(var1);
      this.field6637.method34734(Class120.method340(var5), ((Class5839)var2.get(2)).field25580, ((Class5839)var2.get(2)).field25581);
      Class25 var6 = var1.method14969();
      this.field6652 = (Class5839)var2.get(1);
      if (this.field6651 == null) {
         this.field6651 = this.method5866();
      }

      this.field6650 = this.field6651.iterator();
      this.field6653 = null;
      Iterator var7 = var6.iterator();

      for (int var8 = 0; var8 < 2; var8++) {
         if (!var7.hasNext()) {
            return;
         }

         Class120 var9 = (Class120)var7.next();
         if (!var9.method337()) {
            Class5839 var10 = (Class5839)var2.get(var8);
            this.field6637.method34734(var9, var10.field25580, var10.field25581);
         }
      }
   }

   public abstract Set<Class3257> method5866();

   @Override
   public void method5850(Class9332 var1, int var2, int var3, boolean var4, float var5) {
      super.method5850(var1, var2, var3, var4, var5);
      if (this.field6652 != null) {
         if (!Screen.method2475()) {
            this.field6654 += var5;
         }

         int var8 = this.field6652.field25580 + var2;
         int var9 = this.field6652.field25581 + var3;
         Class1193.method5686(var1, var8, var9, var8 + 16, var9 + 16, 822018048);
         this.field6642.method1555().method795(this.field6642.field1339, this.method5867().method11742(), var8, var9);
         RenderSystem.depthFunc(516);
         Class1193.method5686(var1, var8, var9, var8 + 16, var9 + 16, 822083583);
         RenderSystem.depthFunc(515);
      }
   }

   private Class3257 method5867() {
      if (this.field6653 == null || this.field6654 > 30.0F) {
         this.field6654 = 0.0F;
         if (this.field6650 == null || !this.field6650.hasNext()) {
            if (this.field6651 == null) {
               this.field6651 = this.method5866();
            }

            this.field6650 = this.field6651.iterator();
         }

         this.field6653 = this.field6650.next();
      }

      return this.field6653;
   }
}
