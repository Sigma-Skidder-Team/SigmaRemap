package mapped;

import java.util.EnumSet;

public class Class2647 extends Class2595 {
   private static String[] field16989;
   public final Class1046 field16990;
   private final double field16991;
   private final boolean field16992;
   private Class8238 field16993;
   private double field16994;
   private double field16995;
   private double field16996;
   private int field16997;
   private int field16998;
   private final int field16999 = 20;
   private long field17000;

   public Class2647(Class1046 var1, double var2, boolean var4) {
      this.field16990 = var1;
      this.field16991 = var2;
      this.field16992 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      long var3 = this.field16990.field5024.method6783();
      if (var3 - this.field17000 >= 20L) {
         this.field17000 = var3;
         Class880 var5 = this.field16990.method4232();
         if (var5 != null) {
            if (var5.method3066()) {
               this.field16993 = this.field16990.method4230().method21652(var5, 0);
               return this.field16993 == null
                  ? this.method10859(var5) >= this.field16990.method3276(var5.getPosX(), var5.getPosY(), var5.getPosZ())
                  : true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      Class880 var3 = this.field16990.method4232();
      if (var3 != null) {
         if (!var3.method3066()) {
            return false;
         } else if (this.field16992) {
            return !this.field16990.method4287(var3.method3432()) ? false : !(var3 instanceof PlayerEntity) || !var3.method2800() && !((PlayerEntity)var3).method2801();
         } else {
            return !this.field16990.method4230().method21664();
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16990.method4230().method21656(this.field16993, this.field16991);
      this.field16990.method4304(true);
      this.field16997 = 0;
      this.field16998 = 0;
   }

   @Override
   public void method10807() {
      Class880 var3 = this.field16990.method4232();
      if (!Class8088.field34761.test(var3)) {
         this.field16990.method4233((Class880)null);
      }

      this.field16990.method4304(false);
      this.field16990.method4230().method21666();
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field16990.method4232();
      this.field16990.method4227().method28040(var3, 30.0F, 30.0F);
      double var4 = this.field16990.method3276(var3.getPosX(), var3.getPosY(), var3.getPosZ());
      this.field16997 = Math.max(this.field16997 - 1, 0);
      if ((this.field16992 || this.field16990.method4231().method35460(var3))
         && this.field16997 <= 0
         && (
            this.field16994 == 0.0 && this.field16995 == 0.0 && this.field16996 == 0.0
               || var3.method3276(this.field16994, this.field16995, this.field16996) >= 1.0
               || this.field16990.method3013().nextFloat() < 0.05F
         )) {
         this.field16994 = var3.getPosX();
         this.field16995 = var3.getPosY();
         this.field16996 = var3.getPosZ();
         this.field16997 = 4 + this.field16990.method3013().nextInt(7);
         if (!(var4 > 1024.0)) {
            if (var4 > 256.0) {
               this.field16997 += 5;
            }
         } else {
            this.field16997 += 10;
         }

         if (!this.field16990.method4230().method21655(var3, this.field16991)) {
            this.field16997 += 15;
         }
      }

      this.field16998 = Math.max(this.field16998 - 1, 0);
      this.method10854(var3, var4);
   }

   public void method10854(Class880 var1, double var2) {
      double var6 = this.method10859(var1);
      if (var2 <= var6 && this.field16998 <= 0) {
         this.method10855();
         this.field16990.swingArm(Hand.field182);
         this.field16990.method3114(var1);
      }
   }

   public void method10855() {
      this.field16998 = 20;
   }

   public boolean method10856() {
      return this.field16998 <= 0;
   }

   public int method10857() {
      return this.field16998;
   }

   public int method10858() {
      return 20;
   }

   public double method10859(Class880 var1) {
      return (double)(this.field16990.method3429() * 2.0F * this.field16990.method3429() * 2.0F + var1.method3429());
   }
}