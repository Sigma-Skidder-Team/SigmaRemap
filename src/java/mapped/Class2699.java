package mapped;

public abstract class Class2699 extends Class2595 {
   public final Class1006 field17153;
   public final boolean field17154;
   private final boolean field17155;
   private int field17156;
   private int field17157;
   private int field17158;
   public Class880 field17159;
   public int field17160 = 60;

   public Class2699(Class1006 var1, boolean var2) {
      this(var1, var2, false);
   }

   public Class2699(Class1006 var1, boolean var2, boolean var3) {
      this.field17153 = var1;
      this.field17154 = var2;
      this.field17155 = var3;
   }

   @Override
   public boolean method10806() {
      Class880 var3 = this.field17153.method4232();
      if (var3 == null) {
         var3 = this.field17159;
      }

      if (var3 != null) {
         if (var3.isAlive()) {
            Team var4 = this.field17153.getTeam();
            Team var5 = var3.getTeam();
            if (var4 != null && var5 == var4) {
               return false;
            } else {
               double var6 = this.method10914();
               if (!(this.field17153.getDistanceSq(var3) > var6 * var6)) {
                  if (this.field17154) {
                     if (!this.field17153.method4231().method35460(var3)) {
                        if (++this.field17158 > this.field17160) {
                           return false;
                        }
                     } else {
                        this.field17158 = 0;
                     }
                  }

                  if (var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.field29606) {
                     return false;
                  } else {
                     this.field17153.method4233(var3);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public double method10914() {
      return this.field17153.method3086(Attributes.field42106);
   }

   @Override
   public void method10804() {
      this.field17156 = 0;
      this.field17157 = 0;
      this.field17158 = 0;
   }

   @Override
   public void method10807() {
      this.field17153.method4233((Class880)null);
      this.field17159 = null;
   }

   public boolean method10915(Class880 var1, Class8522 var2) {
      if (var1 != null) {
         if (var2.method30210(this.field17153, var1)) {
            if (this.field17153.method4287(var1.getPosition())) {
               if (this.field17155) {
                  if (--this.field17157 <= 0) {
                     this.field17156 = 0;
                  }

                  if (this.field17156 == 0) {
                     this.field17156 = !this.method10916(var1) ? 2 : 1;
                  }

                  if (this.field17156 == 2) {
                     return false;
                  }
               }

               return true;
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

   private boolean method10916(Class880 var1) {
      this.field17157 = 10 + this.field17153.method3013().nextInt(5);
      Class8238 var4 = this.field17153.method4230().method21652(var1, 0);
      if (var4 != null) {
         Class7176 var5 = var4.method28694();
         if (var5 != null) {
            int var6 = var5.field30847 - MathHelper.floor(var1.getPosX());
            int var7 = var5.field30849 - MathHelper.floor(var1.getPosZ());
            return (double)(var6 * var6 + var7 * var7) <= 2.25;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public Class2699 method10917(int var1) {
      this.field17160 = var1;
      return this;
   }
}
