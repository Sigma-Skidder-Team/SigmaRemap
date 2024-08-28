package mapped;

import java.util.List;

public class Class996 extends Class995 {
   private static String[] field5490;

   public Class996(Class8992<? extends Class996> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class996(Class1655 var1, BlockPos var2) {
      super(Class8992.field41045, var1, var2);
      this.method3215((double)var2.method8304() + 0.5, (double)var2.getY() + 0.5, (double)var2.method8306() + 0.5);
      float var5 = 0.125F;
      float var6 = 0.1875F;
      float var7 = 0.25F;
      this.method3391(
         new Class6488(
            this.getPosX() - 0.1875,
            this.getPosY() - 0.25 + 0.125,
            this.getPosZ() - 0.1875,
            this.getPosX() + 0.1875,
            this.getPosY() + 0.25 + 0.125,
            this.getPosZ() + 0.1875
         )
      );
      this.field5023 = true;
   }

   @Override
   public void method3215(double var1, double var3, double var5) {
      super.method3215((double)Class9679.method37769(var1) + 0.5, (double)Class9679.method37769(var3) + 0.5, (double)Class9679.method37769(var5) + 0.5);
   }

   @Override
   public void method4078() {
      this.method3446((double)this.field5488.method8304() + 0.5, (double)this.field5488.getY() + 0.5, (double)this.field5488.method8306() + 0.5);
   }

   @Override
   public void method4077(Direction var1) {
   }

   @Override
   public int method4081() {
      return 9;
   }

   @Override
   public int method4082() {
      return 9;
   }

   @Override
   public float method3181(Class2090 var1, Class8847 var2) {
      return -0.0625F;
   }

   @Override
   public boolean method3291(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public void method4083(Entity var1) {
      this.method2863(Class6067.field26728, 1.0F, 1.0F);
   }

   @Override
   public void method2724(Class39 var1) {
   }

   @Override
   public void method2723(Class39 var1) {
   }

   @Override
   public Class2274 method3304(PlayerEntity var1, Class79 var2) {
      if (this.field5024.field9020) {
         return Class2274.field14818;
      } else {
         boolean var5 = false;
         double var6 = 7.0;
         List<Class1006> var8 = this.field5024
            .<Class1006>method7182(
               Class1006.class,
               new Class6488(
                  this.getPosX() - 7.0,
                  this.getPosY() - 7.0,
                  this.getPosZ() - 7.0,
                  this.getPosX() + 7.0,
                  this.getPosY() + 7.0,
                  this.getPosZ() + 7.0
               )
            );

         for (Class1006 var10 : var8) {
            if (var10.method4297() == var1) {
               var10.method4298(this, true);
               var5 = true;
            }
         }

         if (!var5) {
            this.method2904();
            if (var1.field4919.field29609) {
               for (Class1006 var12 : var8) {
                  if (var12.method4296() && var12.method4297() == this) {
                     var12.method4294(true, false);
                  }
               }
            }
         }

         return Class2274.field14819;
      }
   }

   @Override
   public boolean method4080() {
      return this.field5024.method6738(this.field5488).method23383().method11540(Class7645.field32771);
   }

   public static Class996 method4087(Class1655 var0, BlockPos var1) {
      int var4 = var1.method8304();
      int var5 = var1.getY();
      int var6 = var1.method8306();

      for (Class996 var8 : var0.<Class996>method7182(
         Class996.class, new Class6488((double)var4 - 1.0, (double)var5 - 1.0, (double)var6 - 1.0, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)
      )) {
         if (var8.method4085().equals(var1)) {
            return var8;
         }
      }

      Class996 var9 = new Class996(var0, var1);
      var0.method6916(var9);
      var9.method4084();
      return var9;
   }

   @Override
   public void method4084() {
      this.method2863(Class6067.field26729, 1.0F, 1.0F);
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this, this.method3204(), 0, this.method4085());
   }

   @Override
   public Vector3d method2986(float var1) {
      return this.method3288(var1).method11339(0.0, 0.2, 0.0);
   }
}
