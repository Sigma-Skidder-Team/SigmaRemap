package mapped;

import java.util.Random;

public class Class217 implements Class215 {
   private final Class9736 field853;
   private final Class7551 field854;
   private final Class4829 field855;
   private final Random field856 = new Random();
   private final Class8396 field857;

   public Class217(Class9736 var1, Class8396 var2) {
      this.field853 = var1;
      this.field857 = var2;
      if (!Class9299.field42820.method20241()) {
         this.field854 = new Class7551(this.field857);
      } else {
         this.field854 = (Class7551)Class9299.method35087(Class9299.field42820, this.field857);
      }

      this.field855 = new Class4829();
   }

   public Class9736 method806() {
      return this.field853;
   }

   public void method807(Class7380 var1, BlockPos var2, Class1663 var3, MatrixStack var4, Class5422 var5) {
      this.method808(var1, var2, var3, var4, var5, Class7181.field30863);
   }

   public void method808(Class7380 var1, BlockPos var2, Class1663 var3, MatrixStack var4, Class5422 var5, Class7180 var6) {
      if (var1.method23397() == Class1855.field9887) {
         Class7202 var9 = this.field853.method38153(var1);
         long var10 = var1.method23451(var2);
         this.field854.method24680(var3, var9, var1, var2, var4, var5, true, this.field856, var10, Class213.field798, var6);
      }
   }

   public boolean method809(Class7380 var1, BlockPos var2, Class1663 var3, MatrixStack var4, Class5422 var5, boolean var6, Random var7) {
      return this.method810(var1, var2, var3, var4, var5, var6, var7, Class7181.field30863);
   }

   public boolean method810(Class7380 var1, BlockPos var2, Class1663 var3, MatrixStack var4, Class5422 var5, boolean var6, Random var7, Class7180 var8) {
      try {
         Class1855 var11 = var1.method23397();
         return var11 != Class1855.field9887
            ? false
            : this.field854.method24680(var3, this.method813(var1), var1, var2, var4, var5, var6, var7, var1.method23451(var2), Class213.field798, var8);
      } catch (Throwable var14) {
         Class4526 var12 = Class4526.method14413(var14, "Tesselating block in world");
         Class8965 var13 = var12.method14410("Block being tesselated");
         Class8965.method32814(var13, var2, var1);
         throw new Class2506(var12);
      }
   }

   public boolean method811(BlockPos var1, Class1663 var2, Class5422 var3, Class7379 var4) {
      try {
         return this.field855.method14925(var2, var1, var3, var4);
      } catch (Throwable var10) {
         Class4526 var8 = Class4526.method14413(var10, "Tesselating liquid in world");
         Class8965 var9 = var8.method14410("Block being tesselated");
         Class8965.method32814(var9, var1, (Class7380)null);
         throw new Class2506(var8);
      }
   }

   public Class7551 method812() {
      return this.field854;
   }

   public Class7202 method813(Class7380 var1) {
      return this.field853.method38153(var1);
   }

   public void method814(Class7380 var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      this.method815(var1, var2, var3, var4, var5, Class7181.field30863);
   }

   public void method815(Class7380 var1, MatrixStack var2, Class7733 var3, int var4, int var5, Class7180 var6) {
      Class1855 var9 = var1.method23397();
      if (var9 != Class1855.field9885) {
         switch (Class6624.field29144[var9.ordinal()]) {
            case 1:
               Class7202 var10 = this.method813(var1);
               int var11 = this.field857.method29465(var1, (Class1663)null, (BlockPos)null, 0);
               float var12 = (float)(var11 >> 16 & 0xFF) / 255.0F;
               float var13 = (float)(var11 >> 8 & 0xFF) / 255.0F;
               float var14 = (float)(var11 & 0xFF) / 255.0F;
               this.field854
                  .method24690(var2.method35296(), var3.method25597(Class8928.method32632(var1, false)), var1, var10, var12, var13, var14, var4, var5, var6);
               break;
            case 2:
               if (Class9299.field42913.method20214()) {
                  ItemStack var15 = new ItemStack(var1.method23383());
                  Class9809 var16 = (Class9809)Class9299.method35070(var15.method32107(), Class9299.field42913);
                  var16.method38685(var15, Class2327.field15924, var2, var3, var4, var5);
               } else {
                  Class9809.field45844.method38685(new ItemStack(var1.method23383()), Class2327.field15924, var2, var3, var4, var5);
               }
         }
      }
   }

   @Override
   public void method737(Class191 var1) {
      this.field855.method14919();
   }

   public Class1991 method816() {
      return Class1990.field12988;
   }
}
