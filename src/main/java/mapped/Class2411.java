package mapped;

import java.io.Serializable;

public abstract class Class2411 implements Serializable, Cloneable {
   public static final long field16388 = 7068460319248845763L;
   public float field16389;
   public float field16390;
   public float field16391;
   public float field16392;

   public Class2411(float var1, float var2, float var3, float var4) {
      this.field16389 = var1;
      this.field16390 = var2;
      this.field16391 = var3;
      this.field16392 = var4;
   }

   public Class2411(float[] var1) {
      this.field16389 = var1[0];
      this.field16390 = var1[1];
      this.field16391 = var1[2];
      this.field16392 = var1[3];
   }

   public Class2411(Class2411 var1) {
      this.field16389 = var1.field16389;
      this.field16390 = var1.field16390;
      this.field16391 = var1.field16391;
      this.field16392 = var1.field16392;
   }

   public Class2411(Class2387 var1) {
      this.field16389 = (float)var1.field16274;
      this.field16390 = (float)var1.field16275;
      this.field16391 = (float)var1.field16276;
      this.field16392 = (float)var1.field16277;
   }

   public Class2411() {
      this.field16389 = 0.0F;
      this.field16390 = 0.0F;
      this.field16391 = 0.0F;
      this.field16392 = 0.0F;
   }

   public final void method10173(float var1, float var2, float var3, float var4) {
      this.field16389 = var1;
      this.field16390 = var2;
      this.field16391 = var3;
      this.field16392 = var4;
   }

   public final void method10174(float[] var1) {
      this.field16389 = var1[0];
      this.field16390 = var1[1];
      this.field16391 = var1[2];
      this.field16392 = var1[3];
   }

   public final void method10175(Class2411 var1) {
      this.field16389 = var1.field16389;
      this.field16390 = var1.field16390;
      this.field16391 = var1.field16391;
      this.field16392 = var1.field16392;
   }

   public final void method10176(Class2387 var1) {
      this.field16389 = (float)var1.field16274;
      this.field16390 = (float)var1.field16275;
      this.field16391 = (float)var1.field16276;
      this.field16392 = (float)var1.field16277;
   }

   public final void method10177(float[] var1) {
      var1[0] = this.field16389;
      var1[1] = this.field16390;
      var1[2] = this.field16391;
      var1[3] = this.field16392;
   }

   public final void method10178(Class2411 var1) {
      var1.field16389 = this.field16389;
      var1.field16390 = this.field16390;
      var1.field16391 = this.field16391;
      var1.field16392 = this.field16392;
   }

   public final void method10179(Class2411 var1, Class2411 var2) {
      this.field16389 = var1.field16389 + var2.field16389;
      this.field16390 = var1.field16390 + var2.field16390;
      this.field16391 = var1.field16391 + var2.field16391;
      this.field16392 = var1.field16392 + var2.field16392;
   }

   public final void method10180(Class2411 var1) {
      this.field16389 = this.field16389 + var1.field16389;
      this.field16390 = this.field16390 + var1.field16390;
      this.field16391 = this.field16391 + var1.field16391;
      this.field16392 = this.field16392 + var1.field16392;
   }

   public final void method10181(Class2411 var1, Class2411 var2) {
      this.field16389 = var1.field16389 - var2.field16389;
      this.field16390 = var1.field16390 - var2.field16390;
      this.field16391 = var1.field16391 - var2.field16391;
      this.field16392 = var1.field16392 - var2.field16392;
   }

   public final void method10182(Class2411 var1) {
      this.field16389 = this.field16389 - var1.field16389;
      this.field16390 = this.field16390 - var1.field16390;
      this.field16391 = this.field16391 - var1.field16391;
      this.field16392 = this.field16392 - var1.field16392;
   }

   public final void method10183(Class2411 var1) {
      this.field16389 = -var1.field16389;
      this.field16390 = -var1.field16390;
      this.field16391 = -var1.field16391;
      this.field16392 = -var1.field16392;
   }

   public final void method10184() {
      this.field16389 = -this.field16389;
      this.field16390 = -this.field16390;
      this.field16391 = -this.field16391;
      this.field16392 = -this.field16392;
   }

   public final void method10185(float var1, Class2411 var2) {
      this.field16389 = var1 * var2.field16389;
      this.field16390 = var1 * var2.field16390;
      this.field16391 = var1 * var2.field16391;
      this.field16392 = var1 * var2.field16392;
   }

   public final void method10186(float var1) {
      this.field16389 *= var1;
      this.field16390 *= var1;
      this.field16391 *= var1;
      this.field16392 *= var1;
   }

   public final void method10187(float var1, Class2411 var2, Class2411 var3) {
      this.field16389 = var1 * var2.field16389 + var3.field16389;
      this.field16390 = var1 * var2.field16390 + var3.field16390;
      this.field16391 = var1 * var2.field16391 + var3.field16391;
      this.field16392 = var1 * var2.field16392 + var3.field16392;
   }

   public final void method10188(float var1, Class2411 var2) {
      this.field16389 = var1 * this.field16389 + var2.field16389;
      this.field16390 = var1 * this.field16390 + var2.field16390;
      this.field16391 = var1 * this.field16391 + var2.field16391;
      this.field16392 = var1 * this.field16392 + var2.field16392;
   }

   @Override
   public String toString() {
      return "(" + this.field16389 + ", " + this.field16390 + ", " + this.field16391 + ", " + this.field16392 + ")";
   }

   public boolean equals(Class2411 var1) {
      try {
         return this.field16389 == var1.field16389
            && this.field16390 == var1.field16390
            && this.field16391 == var1.field16391
            && this.field16392 == var1.field16392;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2411 var4 = (Class2411)var1;
         return this.field16389 == var4.field16389
            && this.field16390 == var4.field16390
            && this.field16391 == var4.field16391
            && this.field16392 == var4.field16392;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method10189(Class2411 var1, float var2) {
      float var5 = this.field16389 - var1.field16389;
      if (!Float.isNaN(var5)) {
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field16390 - var1.field16390;
            if (!Float.isNaN(var5)) {
               if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                  var5 = this.field16391 - var1.field16391;
                  if (!Float.isNaN(var5)) {
                     if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
                        var5 = this.field16392 - var1.field16392;
                        return !Float.isNaN(var5) ? !((!(var5 < 0.0F) ? var5 : -var5) > var2) : false;
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
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
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16389);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16390);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16391);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16392);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method10190(float var1, float var2, Class2411 var3) {
      if (!(var3.field16389 > var2)) {
         if (!(var3.field16389 < var1)) {
            this.field16389 = var3.field16389;
         } else {
            this.field16389 = var1;
         }
      } else {
         this.field16389 = var2;
      }

      if (!(var3.field16390 > var2)) {
         if (!(var3.field16390 < var1)) {
            this.field16390 = var3.field16390;
         } else {
            this.field16390 = var1;
         }
      } else {
         this.field16390 = var2;
      }

      if (!(var3.field16391 > var2)) {
         if (!(var3.field16391 < var1)) {
            this.field16391 = var3.field16391;
         } else {
            this.field16391 = var1;
         }
      } else {
         this.field16391 = var2;
      }

      if (!(var3.field16392 > var2)) {
         if (!(var3.field16392 < var1)) {
            this.field16392 = var3.field16392;
         } else {
            this.field16392 = var1;
         }
      } else {
         this.field16392 = var2;
      }
   }

   public final void method10191(float var1, Class2411 var2) {
      if (!(var2.field16389 < var1)) {
         this.field16389 = var2.field16389;
      } else {
         this.field16389 = var1;
      }

      if (!(var2.field16390 < var1)) {
         this.field16390 = var2.field16390;
      } else {
         this.field16390 = var1;
      }

      if (!(var2.field16391 < var1)) {
         this.field16391 = var2.field16391;
      } else {
         this.field16391 = var1;
      }

      if (!(var2.field16392 < var1)) {
         this.field16392 = var2.field16392;
      } else {
         this.field16392 = var1;
      }
   }

   public final void method10192(float var1, Class2411 var2) {
      if (!(var2.field16389 > var1)) {
         this.field16389 = var2.field16389;
      } else {
         this.field16389 = var1;
      }

      if (!(var2.field16390 > var1)) {
         this.field16390 = var2.field16390;
      } else {
         this.field16390 = var1;
      }

      if (!(var2.field16391 > var1)) {
         this.field16391 = var2.field16391;
      } else {
         this.field16391 = var1;
      }

      if (!(var2.field16392 > var1)) {
         this.field16392 = var2.field16391;
      } else {
         this.field16392 = var1;
      }
   }

   public final void method10193(Class2411 var1) {
      this.field16389 = Math.abs(var1.field16389);
      this.field16390 = Math.abs(var1.field16390);
      this.field16391 = Math.abs(var1.field16391);
      this.field16392 = Math.abs(var1.field16392);
   }

   public final void method10194(float var1, float var2) {
      if (!(this.field16389 > var2)) {
         if (this.field16389 < var1) {
            this.field16389 = var1;
         }
      } else {
         this.field16389 = var2;
      }

      if (!(this.field16390 > var2)) {
         if (this.field16390 < var1) {
            this.field16390 = var1;
         }
      } else {
         this.field16390 = var2;
      }

      if (!(this.field16391 > var2)) {
         if (this.field16391 < var1) {
            this.field16391 = var1;
         }
      } else {
         this.field16391 = var2;
      }

      if (!(this.field16392 > var2)) {
         if (this.field16392 < var1) {
            this.field16392 = var1;
         }
      } else {
         this.field16392 = var2;
      }
   }

   public final void method10195(float var1) {
      if (this.field16389 < var1) {
         this.field16389 = var1;
      }

      if (this.field16390 < var1) {
         this.field16390 = var1;
      }

      if (this.field16391 < var1) {
         this.field16391 = var1;
      }

      if (this.field16392 < var1) {
         this.field16392 = var1;
      }
   }

   public final void method10196(float var1) {
      if (this.field16389 > var1) {
         this.field16389 = var1;
      }

      if (this.field16390 > var1) {
         this.field16390 = var1;
      }

      if (this.field16391 > var1) {
         this.field16391 = var1;
      }

      if (this.field16392 > var1) {
         this.field16392 = var1;
      }
   }

   public final void method10197() {
      this.field16389 = Math.abs(this.field16389);
      this.field16390 = Math.abs(this.field16390);
      this.field16391 = Math.abs(this.field16391);
      this.field16392 = Math.abs(this.field16392);
   }

   public void method10198(Class2411 var1, Class2411 var2, float var3) {
      this.field16389 = (1.0F - var3) * var1.field16389 + var3 * var2.field16389;
      this.field16390 = (1.0F - var3) * var1.field16390 + var3 * var2.field16390;
      this.field16391 = (1.0F - var3) * var1.field16391 + var3 * var2.field16391;
      this.field16392 = (1.0F - var3) * var1.field16392 + var3 * var2.field16392;
   }

   public void method10199(Class2411 var1, float var2) {
      this.field16389 = (1.0F - var2) * this.field16389 + var2 * var1.field16389;
      this.field16390 = (1.0F - var2) * this.field16390 + var2 * var1.field16390;
      this.field16391 = (1.0F - var2) * this.field16391 + var2 * var1.field16391;
      this.field16392 = (1.0F - var2) * this.field16392 + var2 * var1.field16392;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final float method10200() {
      return this.field16389;
   }

   public final void method10201(float var1) {
      this.field16389 = var1;
   }

   public final float method10202() {
      return this.field16390;
   }

   public final void method10203(float var1) {
      this.field16390 = var1;
   }

   public final float method10204() {
      return this.field16391;
   }

   public final void method10205(float var1) {
      this.field16391 = var1;
   }

   public final float method10206() {
      return this.field16392;
   }

   public final void method10207(float var1) {
      this.field16392 = var1;
   }
}
