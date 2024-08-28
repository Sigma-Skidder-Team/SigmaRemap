package mapped;

import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

public class Class966 extends Class944 implements Class935 {
   private static String[] field5414;
   private long field5415;
   public int field5416;
   public boolean field5417;
   public Direction field5418;
   private List<Class880> field5419;
   private boolean field5420;
   private int field5421;

   public Class966() {
      super(Class4387.field21450);
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.method3992();
         this.field5421 = 0;
         this.field5418 = Direction.method546(var2);
         this.field5416 = 0;
         this.field5417 = true;
         return true;
      }
   }

   @Override
   public void method3647() {
      if (this.field5417) {
         this.field5416++;
      }

      if (this.field5416 >= 50) {
         this.field5417 = false;
         this.field5416 = 0;
      }

      if (this.field5416 >= 5 && this.field5421 == 0 && this.method3993()) {
         this.field5420 = true;
         this.method3990();
      }

      if (this.field5420) {
         if (this.field5421 >= 40) {
            this.method3994(this.field5324);
            this.method3995(this.field5324);
            this.field5420 = false;
         } else {
            this.field5421++;
         }
      }
   }

   private void method3990() {
      this.field5324.method6742((PlayerEntity)null, this.method3774(), Class6067.field26401, Class2266.field14732, 1.0F, 1.0F);
   }

   public void method3991(Direction var1) {
      BlockPos var4 = this.method3774();
      this.field5418 = var1;
      if (!this.field5417) {
         this.field5417 = true;
      } else {
         this.field5416 = 0;
      }

      this.field5324.method6787(var4, this.method3775().method23383(), 1, var1.method533());
   }

   private void method3992() {
      BlockPos var3 = this.method3774();
      if (this.field5324.method6783() > this.field5415 + 60L || this.field5419 == null) {
         this.field5415 = this.field5324.method6783();
         Class6488 var4 = new Class6488(var3).method19664(48.0);
         this.field5419 = this.field5324.<Class880>method7182(Class880.class, var4);
      }

      if (!this.field5324.field9020) {
         for (Class880 var5 : this.field5419) {
            if (var5.method3066() && !var5.field5041 && var3.method8317(var5.getPositionVec(), 32.0)) {
               var5.method2992().method21406(Class8830.field39840, this.field5324.method6783());
            }
         }
      }
   }

   private boolean method3993() {
      BlockPos var3 = this.method3774();

      for (Class880 var5 : this.field5419) {
         if (var5.method3066() && !var5.field5041 && var3.method8317(var5.getPositionVec(), 32.0) && var5.method3204().method33228(Class8613.field38735)) {
            return true;
         }
      }

      return false;
   }

   private void method3994(World var1) {
      if (!var1.field9020) {
         this.field5419.stream().filter(this::method3996).forEach(this::method3997);
      }
   }

   private void method3995(World var1) {
      if (var1.field9020) {
         BlockPos var4 = this.method3774();
         MutableInt var5 = new MutableInt(16700985);
         int var6 = (int)this.field5419.stream().filter(var1x -> var4.method8317(var1x.getPositionVec(), 48.0)).count();
         this.field5419
            .stream()
            .filter(this::method3996)
            .forEach(
               var4x -> {
                  float var7 = 1.0F;
                  float var8 = MathHelper.method37766(
                     (var4x.getPosX() - (double)var4.method8304()) * (var4x.getPosX() - (double)var4.method8304())
                        + (var4x.getPosZ() - (double)var4.method8306()) * (var4x.getPosZ() - (double)var4.method8306())
                  );
                  double var9 = (double)((float)var4.method8304() + 0.5F) + (double)(1.0F / var8) * (var4x.getPosX() - (double)var4.method8304());
                  double var11 = (double)((float)var4.method8306() + 0.5F) + (double)(1.0F / var8) * (var4x.getPosZ() - (double)var4.method8306());
                  int var13 = MathHelper.method37775((var6 - 21) / -2, 3, 15);

                  for (int var14 = 0; var14 < var13; var14++) {
                     int var15 = var5.addAndGet(5);
                     double var16 = (double)Class9470.method36517(var15) / 255.0;
                     double var18 = (double)Class9470.method36518(var15) / 255.0;
                     double var20 = (double)Class9470.method36519(var15) / 255.0;
                     var1.method6746(Class7940.field34068, var9, (double)((float)var4.getY() + 0.5F), var11, var16, var18, var20);
                  }
               }
            );
      }
   }

   private boolean method3996(Class880 var1) {
      return var1.method3066()
         && !var1.field5041
         && this.method3774().method8317(var1.getPositionVec(), 48.0)
         && var1.method3204().method33228(Class8613.field38735);
   }

   private void method3997(Class880 var1) {
      var1.method3035(new Class2023(Class8254.field35490, 60));
   }
}