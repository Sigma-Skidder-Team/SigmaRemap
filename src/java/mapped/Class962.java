package mapped;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class962 extends Class944 implements Class935 {
   private final List<Class9327> field5392 = Lists.newArrayList();
   private BlockPos field5393 = null;

   public Class962() {
      super(Class4387.field21453);
   }

   @Override
   public void method3622() {
      if (this.method3912()) {
         this.method3915((PlayerEntity)null, this.field5324.method6738(this.method3774()), Class2084.field13573);
      }

      super.method3622();
   }

   public boolean method3912() {
      if (this.field5324 == null) {
         return false;
      } else {
         for (BlockPos var4 : BlockPos.method8359(this.field5325.method8336(-1, -1, -1), this.field5325.method8336(1, 1, 1))) {
            if (this.field5324.method6738(var4).method23383() instanceof Class3399) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method3913() {
      return this.field5392.isEmpty();
   }

   public boolean method3914() {
      return this.field5392.size() == 3;
   }

   public void method3915(PlayerEntity var1, Class7380 var2, Class2084 var3) {
      List<Entity> var6 = this.method3916(var2, var3);
      if (var1 != null) {
         for (Entity var8 : var6) {
            if (var8 instanceof Class1017) {
               Class1017 var9 = (Class1017)var8;
               if (var1.method3431().method11342(var8.method3431()) <= 16.0) {
                  if (this.method3920()) {
                     var9.method4426(400);
                  } else {
                     var9.method4233(var1);
                  }
               }
            }
         }
      }
   }

   private List<Entity> method3916(Class7380 var1, Class2084 var2) {
      ArrayList var5 = Lists.newArrayList();
      this.field5392.removeIf(var4 -> this.method3923(var1, var4, var5, var2));
      return var5;
   }

   public void method3917(Entity var1, boolean var2) {
      this.method3922(var1, var2, 0);
   }

   public int method3918() {
      return this.field5392.size();
   }

   public static int method3919(Class7380 var0) {
      return var0.<Integer>method23463(Class3366.field18936);
   }

   public boolean method3920() {
      return Class3244.method11654(this.field5324, this.method3774());
   }

   public void method3921() {
      Class7393.method23624(this);
   }

   public void method3922(Entity var1, boolean var2, int var3) {
      if (this.field5392.size() < 3) {
         var1.method2759();
         var1.method3315();
         Class39 var6 = new Class39();
         var1.method3293(var6);
         this.field5392.add(new Class9327(var6, var3, !var2 ? 600 : 2400));
         if (this.field5324 != null) {
            if (var1 instanceof Class1017) {
               Class1017 var7 = (Class1017)var1;
               if (var7.method4422() && (!this.method3925() || this.field5324.field9016.nextBoolean())) {
                  this.field5393 = var7.method4421();
               }
            }

            BlockPos var8 = this.method3774();
            this.field5324
               .method6743(
                  (PlayerEntity)null,
                  (double)var8.method8304(),
                  (double)var8.getY(),
                  (double)var8.method8306(),
                  Class6067.field26396,
                  Class2266.field14732,
                  1.0F,
                  1.0F
               );
         }

         var1.method2904();
      }
   }

   private boolean method3923(Class7380 var1, Class9327 var2, List<Entity> var3, Class2084 var4) {
      if ((this.field5324.method6741() || this.field5324.method6795()) && var4 != Class2084.field13573) {
         return false;
      } else {
         BlockPos var7 = this.method3774();
         Class39 var8 = Class9327.method35245(var2);
         var8.method133("Passengers");
         var8.method133("Leash");
         var8.method133("UUID");
         Direction var9 = var1.<Direction>method23463(Class3366.field18935);
         BlockPos var10 = var7.method8349(var9);
         boolean var11 = !this.field5324.method6738(var10).method23414(this.field5324, var10).method19516();
         if (var11 && var4 != Class2084.field13573) {
            return false;
         } else {
            Entity var12 = Class8992.method33223(var8, this.field5324, var0 -> var0);
            if (var12 == null) {
               return false;
            } else if (var12.method3204().method33228(Class8613.field38736)) {
               if (var12 instanceof Class1017) {
                  Class1017 var13 = (Class1017)var12;
                  if (this.method3925() && !var13.method4422() && this.field5324.field9016.nextFloat() < 0.9F) {
                     var13.method4423(this.field5393);
                  }

                  if (var4 == Class2084.field13571) {
                     var13.method4449();
                     if (var1.method23383().method11540(Class7645.field32794)) {
                        int var14 = method3919(var1);
                        if (var14 < 5) {
                           int var15 = this.field5324.field9016.nextInt(100) != 0 ? 1 : 2;
                           if (var14 + var15 > 5) {
                              var15--;
                           }

                           this.field5324.method6730(this.method3774(), var1.method23465(Class3366.field18936, Integer.valueOf(var14 + var15)));
                        }
                     }
                  }

                  this.method3924(Class9327.method35246(var2), var13);
                  if (var3 != null) {
                     var3.add(var13);
                  }

                  float var24 = var12.method3429();
                  double var16 = !var11 ? 0.55 + (double)(var24 / 2.0F) : 0.0;
                  double var18 = (double)var7.method8304() + 0.5 + var16 * (double)var9.method539();
                  double var20 = (double)var7.getY() + 0.5 - (double)(var12.method3430() / 2.0F);
                  double var22 = (double)var7.method8306() + 0.5 + var16 * (double)var9.method541();
                  var12.method3273(var18, var20, var22, var12.field5031, var12.field5032);
               }

               this.field5324.method6742((PlayerEntity)null, var7, Class6067.field26397, Class2266.field14732, 1.0F, 1.0F);
               return this.field5324.method6916(var12);
            } else {
               return false;
            }
         }
      }
   }

   private void method3924(int var1, Class1017 var2) {
      int var5 = var2.method4767();
      if (var5 >= 0) {
         if (var5 > 0) {
            var2.method4770(Math.max(0, var5 - var1));
         }
      } else {
         var2.method4770(Math.min(0, var5 + var1));
      }

      var2.method4504(Math.max(0, var2.method4505() - var1));
      var2.method4429();
   }

   private boolean method3925() {
      return this.field5393 != null;
   }

   private void method3926() {
      Iterator var3 = this.field5392.iterator();
      Class7380 var4 = this.method3775();

      while (var3.hasNext()) {
         Class9327 var5 = (Class9327)var3.next();
         if (Class9327.method35246(var5) > Class9327.method35248(var5)) {
            Class2084 var6 = !Class9327.method35245(var5).method132("HasNectar") ? Class2084.field13572 : Class2084.field13571;
            if (this.method3923(var4, var5, (List<Entity>)null, var6)) {
               var3.remove();
            }
         }

         Class9327.method35247(var5);
      }
   }

   @Override
   public void method3647() {
      if (!this.field5324.field9020) {
         this.method3926();
         BlockPos var3 = this.method3774();
         if (this.field5392.size() > 0 && this.field5324.method6814().nextDouble() < 0.005) {
            double var4 = (double)var3.method8304() + 0.5;
            double var6 = (double)var3.getY();
            double var8 = (double)var3.method8306() + 0.5;
            this.field5324.method6743((PlayerEntity)null, var4, var6, var8, Class6067.field26399, Class2266.field14732, 1.0F, 1.0F);
         }

         this.method3921();
      }
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5392.clear();
      Class41 var5 = var2.method131("Bees", 10);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         Class39 var7 = var5.method153(var6);
         Class9327 var8 = new Class9327(var7.method130("EntityData"), var7.method122("TicksInHive"), var7.method122("MinOccupationTicks"));
         this.field5392.add(var8);
      }

      this.field5393 = null;
      if (var2.method118("FlowerPos")) {
         this.field5393 = Class8354.method29283(var2.method130("FlowerPos"));
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method99("Bees", this.method3927());
      if (this.method3925()) {
         var1.method99("FlowerPos", Class8354.method29284(this.field5393));
      }

      return var1;
   }

   public Class41 method3927() {
      Class41 var3 = new Class41();

      for (Class9327 var5 : this.field5392) {
         Class9327.method35245(var5).method133("UUID");
         Class39 var6 = new Class39();
         var6.method99("EntityData", Class9327.method35245(var5));
         var6.method102("TicksInHive", Class9327.method35246(var5));
         var6.method102("MinOccupationTicks", Class9327.method35248(var5));
         var3.add(var6);
      }

      return var3;
   }
}
