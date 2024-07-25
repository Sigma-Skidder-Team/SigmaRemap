package remapped;

import java.io.Serializable;

public class class_2856 implements Serializable, Cloneable {
   public static final long field_13980 = -8405036035410109353L;
   public float field_13977;
   public float field_13991;
   public float field_13976;
   public float field_13984;
   public float field_13993;
   public float field_13979;
   public float field_13989;
   public float field_13982;
   public float field_13983;
   public float field_13992;
   public float field_13978;
   public float field_13990;
   public float field_13975;
   public float field_13985;
   public float field_13986;
   public float field_13988;
   private static final double field_13987 = 1.0E-8;

   public class_2856(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.field_13977 = var1;
      this.field_13991 = var2;
      this.field_13976 = var3;
      this.field_13984 = var4;
      this.field_13993 = var5;
      this.field_13979 = var6;
      this.field_13989 = var7;
      this.field_13982 = var8;
      this.field_13983 = var9;
      this.field_13992 = var10;
      this.field_13978 = var11;
      this.field_13990 = var12;
      this.field_13975 = var13;
      this.field_13985 = var14;
      this.field_13986 = var15;
      this.field_13988 = var16;
   }

   public class_2856(float[] var1) {
      this.field_13977 = var1[0];
      this.field_13991 = var1[1];
      this.field_13976 = var1[2];
      this.field_13984 = var1[3];
      this.field_13993 = var1[4];
      this.field_13979 = var1[5];
      this.field_13989 = var1[6];
      this.field_13982 = var1[7];
      this.field_13983 = var1[8];
      this.field_13992 = var1[9];
      this.field_13978 = var1[10];
      this.field_13990 = var1[11];
      this.field_13975 = var1[12];
      this.field_13985 = var1[13];
      this.field_13986 = var1[14];
      this.field_13988 = var1[15];
   }

   public class_2856(class_8778 var1, class_6181 var2, float var3) {
      this.field_13977 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013)
      );
      this.field_13993 = (float)((double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013));
      this.field_13983 = (float)((double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016));
      this.field_13991 = (float)((double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013));
      this.field_13979 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013)
      );
      this.field_13992 = (float)((double)var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014));
      this.field_13976 = (float)((double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016));
      this.field_13989 = (float)((double)var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014));
      this.field_13978 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016)
      );
      this.field_13984 = var2.field_4390;
      this.field_13982 = var2.field_4391;
      this.field_13990 = var2.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public class_2856(class_9076 var1) {
      this.field_13977 = (float)var1.field_46473;
      this.field_13991 = (float)var1.field_46466;
      this.field_13976 = (float)var1.field_46474;
      this.field_13984 = (float)var1.field_46460;
      this.field_13993 = (float)var1.field_46458;
      this.field_13979 = (float)var1.field_46467;
      this.field_13989 = (float)var1.field_46464;
      this.field_13982 = (float)var1.field_46461;
      this.field_13983 = (float)var1.field_46470;
      this.field_13992 = (float)var1.field_46469;
      this.field_13978 = (float)var1.field_46468;
      this.field_13990 = (float)var1.field_46475;
      this.field_13975 = (float)var1.field_46472;
      this.field_13985 = (float)var1.field_46471;
      this.field_13986 = (float)var1.field_46463;
      this.field_13988 = (float)var1.field_46457;
   }

   public class_2856(class_2856 var1) {
      this.field_13977 = var1.field_13977;
      this.field_13991 = var1.field_13991;
      this.field_13976 = var1.field_13976;
      this.field_13984 = var1.field_13984;
      this.field_13993 = var1.field_13993;
      this.field_13979 = var1.field_13979;
      this.field_13989 = var1.field_13989;
      this.field_13982 = var1.field_13982;
      this.field_13983 = var1.field_13983;
      this.field_13992 = var1.field_13992;
      this.field_13978 = var1.field_13978;
      this.field_13990 = var1.field_13990;
      this.field_13975 = var1.field_13975;
      this.field_13985 = var1.field_13985;
      this.field_13986 = var1.field_13986;
      this.field_13988 = var1.field_13988;
   }

   public class_2856(class_3367 var1, class_6181 var2, float var3) {
      this.field_13977 = var1.field_16607 * var3;
      this.field_13991 = var1.field_16596 * var3;
      this.field_13976 = var1.field_16597 * var3;
      this.field_13984 = var2.field_4390;
      this.field_13993 = var1.field_16606 * var3;
      this.field_13979 = var1.field_16602 * var3;
      this.field_13989 = var1.field_16599 * var3;
      this.field_13982 = var2.field_4391;
      this.field_13983 = var1.field_16604 * var3;
      this.field_13992 = var1.field_16605 * var3;
      this.field_13978 = var1.field_16600 * var3;
      this.field_13990 = var2.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public class_2856() {
      this.field_13977 = 0.0F;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = 0.0F;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 0.0F;
   }

   @Override
   public String toString() {
      return this.field_13977
         + ", "
         + this.field_13991
         + ", "
         + this.field_13976
         + ", "
         + this.field_13984
         + "\n"
         + this.field_13993
         + ", "
         + this.field_13979
         + ", "
         + this.field_13989
         + ", "
         + this.field_13982
         + "\n"
         + this.field_13983
         + ", "
         + this.field_13992
         + ", "
         + this.field_13978
         + ", "
         + this.field_13990
         + "\n"
         + this.field_13975
         + ", "
         + this.field_13985
         + ", "
         + this.field_13986
         + ", "
         + this.field_13988
         + "\n";
   }

   public final void method_13047() {
      this.field_13977 = 1.0F;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = 1.0F;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = 1.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13038(int var1, int var2, float var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field_13977 = var3;
                  return;
               case 1:
                  this.field_13991 = var3;
                  return;
               case 2:
                  this.field_13976 = var3;
                  return;
               case 3:
                  this.field_13984 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field_13993 = var3;
                  return;
               case 1:
                  this.field_13979 = var3;
                  return;
               case 2:
                  this.field_13989 = var3;
                  return;
               case 3:
                  this.field_13982 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field_13983 = var3;
                  return;
               case 1:
                  this.field_13992 = var3;
                  return;
               case 2:
                  this.field_13978 = var3;
                  return;
               case 3:
                  this.field_13990 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f0"));
            }
         case 3:
            switch (var2) {
               case 0:
                  this.field_13975 = var3;
                  return;
               case 1:
                  this.field_13985 = var3;
                  return;
               case 2:
                  this.field_13986 = var3;
                  return;
               case 3:
                  this.field_13988 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f0"));
      }
   }

   public final float method_12983(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field_13977;
               case 1:
                  return this.field_13991;
               case 2:
                  return this.field_13976;
               case 3:
                  return this.field_13984;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field_13993;
               case 1:
                  return this.field_13979;
               case 2:
                  return this.field_13989;
               case 3:
                  return this.field_13982;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field_13983;
               case 1:
                  return this.field_13992;
               case 2:
                  return this.field_13978;
               case 3:
                  return this.field_13990;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f1"));
            }
         case 3:
            switch (var2) {
               case 0:
                  return this.field_13975;
               case 1:
                  return this.field_13985;
               case 2:
                  return this.field_13986;
               case 3:
                  return this.field_13988;
            }
      }

      throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f1"));
   }

   public final void method_13084(int var1, class_4586 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f2"));
               }

               var2.field_9014 = this.field_13975;
               var2.field_9016 = this.field_13985;
               var2.field_9013 = this.field_13986;
               var2.field_9012 = this.field_13988;
            } else {
               var2.field_9014 = this.field_13983;
               var2.field_9016 = this.field_13992;
               var2.field_9013 = this.field_13978;
               var2.field_9012 = this.field_13990;
            }
         } else {
            var2.field_9014 = this.field_13993;
            var2.field_9016 = this.field_13979;
            var2.field_9013 = this.field_13989;
            var2.field_9012 = this.field_13982;
         }
      } else {
         var2.field_9014 = this.field_13977;
         var2.field_9016 = this.field_13991;
         var2.field_9013 = this.field_13976;
         var2.field_9012 = this.field_13984;
      }
   }

   public final void method_13085(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f2"));
               }

               var2[0] = this.field_13975;
               var2[1] = this.field_13985;
               var2[2] = this.field_13986;
               var2[3] = this.field_13988;
            } else {
               var2[0] = this.field_13983;
               var2[1] = this.field_13992;
               var2[2] = this.field_13978;
               var2[3] = this.field_13990;
            }
         } else {
            var2[0] = this.field_13993;
            var2[1] = this.field_13979;
            var2[2] = this.field_13989;
            var2[3] = this.field_13982;
         }
      } else {
         var2[0] = this.field_13977;
         var2[1] = this.field_13991;
         var2[2] = this.field_13976;
         var2[3] = this.field_13984;
      }
   }

   public final void method_13073(int var1, class_4586 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f4"));
               }

               var2.field_9014 = this.field_13984;
               var2.field_9016 = this.field_13982;
               var2.field_9013 = this.field_13990;
               var2.field_9012 = this.field_13988;
            } else {
               var2.field_9014 = this.field_13976;
               var2.field_9016 = this.field_13989;
               var2.field_9013 = this.field_13978;
               var2.field_9012 = this.field_13986;
            }
         } else {
            var2.field_9014 = this.field_13991;
            var2.field_9016 = this.field_13979;
            var2.field_9013 = this.field_13992;
            var2.field_9012 = this.field_13985;
         }
      } else {
         var2.field_9014 = this.field_13977;
         var2.field_9016 = this.field_13993;
         var2.field_9013 = this.field_13983;
         var2.field_9012 = this.field_13975;
      }
   }

   public final void method_13074(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f4"));
               }

               var2[0] = this.field_13984;
               var2[1] = this.field_13982;
               var2[2] = this.field_13990;
               var2[3] = this.field_13988;
            } else {
               var2[0] = this.field_13976;
               var2[1] = this.field_13989;
               var2[2] = this.field_13978;
               var2[3] = this.field_13986;
            }
         } else {
            var2[0] = this.field_13991;
            var2[1] = this.field_13979;
            var2[2] = this.field_13992;
            var2[3] = this.field_13985;
         }
      } else {
         var2[0] = this.field_13977;
         var2[1] = this.field_13993;
         var2[2] = this.field_13983;
         var2[3] = this.field_13975;
      }
   }

   public final void method_12978(float var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      this.field_13977 = (float)(var4[0] * (double)var1);
      this.field_13991 = (float)(var4[1] * (double)var1);
      this.field_13976 = (float)(var4[2] * (double)var1);
      this.field_13993 = (float)(var4[3] * (double)var1);
      this.field_13979 = (float)(var4[4] * (double)var1);
      this.field_13989 = (float)(var4[5] * (double)var1);
      this.field_13983 = (float)(var4[6] * (double)var1);
      this.field_13992 = (float)(var4[7] * (double)var1);
      this.field_13978 = (float)(var4[8] * (double)var1);
   }

   public final void method_13027(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      var1.field_20304 = var4[0];
      var1.field_20313 = var4[1];
      var1.field_20311 = var4[2];
      var1.field_20312 = var4[3];
      var1.field_20305 = var4[4];
      var1.field_20319 = var4[5];
      var1.field_20314 = var4[6];
      var1.field_20322 = var4[7];
      var1.field_20307 = var4[8];
   }

   public final void method_13025(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      var1.field_16607 = (float)var4[0];
      var1.field_16596 = (float)var4[1];
      var1.field_16597 = (float)var4[2];
      var1.field_16606 = (float)var4[3];
      var1.field_16602 = (float)var4[4];
      var1.field_16599 = (float)var4[5];
      var1.field_16604 = (float)var4[6];
      var1.field_16605 = (float)var4[7];
      var1.field_16600 = (float)var4[8];
   }

   public final float method_13026(class_3367 var1, class_6181 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method_13041(var6, var5);
      var1.field_16607 = (float)var5[0];
      var1.field_16596 = (float)var5[1];
      var1.field_16597 = (float)var5[2];
      var1.field_16606 = (float)var5[3];
      var1.field_16602 = (float)var5[4];
      var1.field_16599 = (float)var5[5];
      var1.field_16604 = (float)var5[6];
      var1.field_16605 = (float)var5[7];
      var1.field_16600 = (float)var5[8];
      var2.field_4390 = this.field_13984;
      var2.field_4391 = this.field_13982;
      var2.field_4393 = this.field_13990;
      return (float)class_4173.method_19359(var6);
   }

   public final void method_13029(class_8778 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      double var6 = 0.25 * (1.0 + var4[0] + var4[4] + var4[8]);
      if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
         var1.field_9012 = 0.0F;
         var6 = -0.5 * (var4[4] + var4[8]);
         if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
            var1.field_9014 = 0.0F;
            var6 = 0.5 * (1.0 - var4[8]);
            if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
               var1.field_9016 = 0.0F;
               var1.field_9013 = 1.0F;
            } else {
               var1.field_9016 = (float)Math.sqrt(var6);
               var1.field_9013 = (float)(var4[7] / (2.0 * (double)var1.field_9016));
            }
         } else {
            var1.field_9014 = (float)Math.sqrt(var6);
            var6 = 0.5 / (double)var1.field_9014;
            var1.field_9016 = (float)(var4[3] * var6);
            var1.field_9013 = (float)(var4[6] * var6);
         }
      } else {
         var1.field_9012 = (float)Math.sqrt(var6);
         var6 = 0.25 / (double)var1.field_9012;
         var1.field_9014 = (float)((var4[7] - var4[5]) * var6);
         var1.field_9016 = (float)((var4[2] - var4[6]) * var6);
         var1.field_9013 = (float)((var4[3] - var4[1]) * var6);
      }
   }

   public final void method_13028(class_6181 var1) {
      var1.field_4390 = this.field_13984;
      var1.field_4391 = this.field_13982;
      var1.field_4393 = this.field_13990;
   }

   public final void method_12984(class_3367 var1) {
      var1.field_16607 = this.field_13977;
      var1.field_16596 = this.field_13991;
      var1.field_16597 = this.field_13976;
      var1.field_16606 = this.field_13993;
      var1.field_16602 = this.field_13979;
      var1.field_16599 = this.field_13989;
      var1.field_16604 = this.field_13983;
      var1.field_16605 = this.field_13992;
      var1.field_16600 = this.field_13978;
   }

   public final float method_13062() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method_13041(var4, var3);
      return (float)class_4173.method_19359(var4);
   }

   public final void method_13053(class_3367 var1) {
      this.field_13977 = var1.field_16607;
      this.field_13991 = var1.field_16596;
      this.field_13976 = var1.field_16597;
      this.field_13993 = var1.field_16606;
      this.field_13979 = var1.field_16602;
      this.field_13989 = var1.field_16599;
      this.field_13983 = var1.field_16604;
      this.field_13992 = var1.field_16605;
      this.field_13978 = var1.field_16600;
   }

   public final void method_13059(int var1, float var2, float var3, float var4, float var5) {
      switch (var1) {
         case 0:
            this.field_13977 = var2;
            this.field_13991 = var3;
            this.field_13976 = var4;
            this.field_13984 = var5;
            break;
         case 1:
            this.field_13993 = var2;
            this.field_13979 = var3;
            this.field_13989 = var4;
            this.field_13982 = var5;
            break;
         case 2:
            this.field_13983 = var2;
            this.field_13992 = var3;
            this.field_13978 = var4;
            this.field_13990 = var5;
            break;
         case 3:
            this.field_13975 = var2;
            this.field_13985 = var3;
            this.field_13986 = var4;
            this.field_13988 = var5;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f6"));
      }
   }

   public final void method_13060(int var1, class_4586 var2) {
      switch (var1) {
         case 0:
            this.field_13977 = var2.field_9014;
            this.field_13991 = var2.field_9016;
            this.field_13976 = var2.field_9013;
            this.field_13984 = var2.field_9012;
            break;
         case 1:
            this.field_13993 = var2.field_9014;
            this.field_13979 = var2.field_9016;
            this.field_13989 = var2.field_9013;
            this.field_13982 = var2.field_9012;
            break;
         case 2:
            this.field_13983 = var2.field_9014;
            this.field_13992 = var2.field_9016;
            this.field_13978 = var2.field_9013;
            this.field_13990 = var2.field_9012;
            break;
         case 3:
            this.field_13975 = var2.field_9014;
            this.field_13985 = var2.field_9016;
            this.field_13986 = var2.field_9013;
            this.field_13988 = var2.field_9012;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f6"));
      }
   }

   public final void method_13061(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field_13977 = var2[0];
            this.field_13991 = var2[1];
            this.field_13976 = var2[2];
            this.field_13984 = var2[3];
            break;
         case 1:
            this.field_13993 = var2[0];
            this.field_13979 = var2[1];
            this.field_13989 = var2[2];
            this.field_13982 = var2[3];
            break;
         case 2:
            this.field_13983 = var2[0];
            this.field_13992 = var2[1];
            this.field_13978 = var2[2];
            this.field_13990 = var2[3];
            break;
         case 3:
            this.field_13975 = var2[0];
            this.field_13985 = var2[1];
            this.field_13986 = var2[2];
            this.field_13988 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f6"));
      }
   }

   public final void method_13043(int var1, float var2, float var3, float var4, float var5) {
      switch (var1) {
         case 0:
            this.field_13977 = var2;
            this.field_13993 = var3;
            this.field_13983 = var4;
            this.field_13975 = var5;
            break;
         case 1:
            this.field_13991 = var2;
            this.field_13979 = var3;
            this.field_13992 = var4;
            this.field_13985 = var5;
            break;
         case 2:
            this.field_13976 = var2;
            this.field_13989 = var3;
            this.field_13978 = var4;
            this.field_13986 = var5;
            break;
         case 3:
            this.field_13984 = var2;
            this.field_13982 = var3;
            this.field_13990 = var4;
            this.field_13988 = var5;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f9"));
      }
   }

   public final void method_13044(int var1, class_4586 var2) {
      switch (var1) {
         case 0:
            this.field_13977 = var2.field_9014;
            this.field_13993 = var2.field_9016;
            this.field_13983 = var2.field_9013;
            this.field_13975 = var2.field_9012;
            break;
         case 1:
            this.field_13991 = var2.field_9014;
            this.field_13979 = var2.field_9016;
            this.field_13992 = var2.field_9013;
            this.field_13985 = var2.field_9012;
            break;
         case 2:
            this.field_13976 = var2.field_9014;
            this.field_13989 = var2.field_9016;
            this.field_13978 = var2.field_9013;
            this.field_13986 = var2.field_9012;
            break;
         case 3:
            this.field_13984 = var2.field_9014;
            this.field_13982 = var2.field_9016;
            this.field_13990 = var2.field_9013;
            this.field_13988 = var2.field_9012;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f9"));
      }
   }

   public final void method_13045(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field_13977 = var2[0];
            this.field_13993 = var2[1];
            this.field_13983 = var2[2];
            this.field_13975 = var2[3];
            break;
         case 1:
            this.field_13991 = var2[0];
            this.field_13979 = var2[1];
            this.field_13992 = var2[2];
            this.field_13985 = var2[3];
            break;
         case 2:
            this.field_13976 = var2[0];
            this.field_13989 = var2[1];
            this.field_13978 = var2[2];
            this.field_13986 = var2[3];
            break;
         case 3:
            this.field_13984 = var2[0];
            this.field_13982 = var2[1];
            this.field_13990 = var2[2];
            this.field_13988 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4f9"));
      }
   }

   public final void method_13014(float var1) {
      this.field_13977 += var1;
      this.field_13991 += var1;
      this.field_13976 += var1;
      this.field_13984 += var1;
      this.field_13993 += var1;
      this.field_13979 += var1;
      this.field_13989 += var1;
      this.field_13982 += var1;
      this.field_13983 += var1;
      this.field_13992 += var1;
      this.field_13978 += var1;
      this.field_13990 += var1;
      this.field_13975 += var1;
      this.field_13985 += var1;
      this.field_13986 += var1;
      this.field_13988 += var1;
   }

   public final void method_13015(float var1, class_2856 var2) {
      this.field_13977 = var2.field_13977 + var1;
      this.field_13991 = var2.field_13991 + var1;
      this.field_13976 = var2.field_13976 + var1;
      this.field_13984 = var2.field_13984 + var1;
      this.field_13993 = var2.field_13993 + var1;
      this.field_13979 = var2.field_13979 + var1;
      this.field_13989 = var2.field_13989 + var1;
      this.field_13982 = var2.field_13982 + var1;
      this.field_13983 = var2.field_13983 + var1;
      this.field_13992 = var2.field_13992 + var1;
      this.field_13978 = var2.field_13978 + var1;
      this.field_13990 = var2.field_13990 + var1;
      this.field_13975 = var2.field_13975 + var1;
      this.field_13985 = var2.field_13985 + var1;
      this.field_13986 = var2.field_13986 + var1;
      this.field_13988 = var2.field_13988 + var1;
   }

   public final void method_13017(class_2856 var1, class_2856 var2) {
      this.field_13977 = var1.field_13977 + var2.field_13977;
      this.field_13991 = var1.field_13991 + var2.field_13991;
      this.field_13976 = var1.field_13976 + var2.field_13976;
      this.field_13984 = var1.field_13984 + var2.field_13984;
      this.field_13993 = var1.field_13993 + var2.field_13993;
      this.field_13979 = var1.field_13979 + var2.field_13979;
      this.field_13989 = var1.field_13989 + var2.field_13989;
      this.field_13982 = var1.field_13982 + var2.field_13982;
      this.field_13983 = var1.field_13983 + var2.field_13983;
      this.field_13992 = var1.field_13992 + var2.field_13992;
      this.field_13978 = var1.field_13978 + var2.field_13978;
      this.field_13990 = var1.field_13990 + var2.field_13990;
      this.field_13975 = var1.field_13975 + var2.field_13975;
      this.field_13985 = var1.field_13985 + var2.field_13985;
      this.field_13986 = var1.field_13986 + var2.field_13986;
      this.field_13988 = var1.field_13988 + var2.field_13988;
   }

   public final void method_13016(class_2856 var1) {
      this.field_13977 = this.field_13977 + var1.field_13977;
      this.field_13991 = this.field_13991 + var1.field_13991;
      this.field_13976 = this.field_13976 + var1.field_13976;
      this.field_13984 = this.field_13984 + var1.field_13984;
      this.field_13993 = this.field_13993 + var1.field_13993;
      this.field_13979 = this.field_13979 + var1.field_13979;
      this.field_13989 = this.field_13989 + var1.field_13989;
      this.field_13982 = this.field_13982 + var1.field_13982;
      this.field_13983 = this.field_13983 + var1.field_13983;
      this.field_13992 = this.field_13992 + var1.field_13992;
      this.field_13978 = this.field_13978 + var1.field_13978;
      this.field_13990 = this.field_13990 + var1.field_13990;
      this.field_13975 = this.field_13975 + var1.field_13975;
      this.field_13985 = this.field_13985 + var1.field_13985;
      this.field_13986 = this.field_13986 + var1.field_13986;
      this.field_13988 = this.field_13988 + var1.field_13988;
   }

   public final void method_13035(class_2856 var1, class_2856 var2) {
      this.field_13977 = var1.field_13977 - var2.field_13977;
      this.field_13991 = var1.field_13991 - var2.field_13991;
      this.field_13976 = var1.field_13976 - var2.field_13976;
      this.field_13984 = var1.field_13984 - var2.field_13984;
      this.field_13993 = var1.field_13993 - var2.field_13993;
      this.field_13979 = var1.field_13979 - var2.field_13979;
      this.field_13989 = var1.field_13989 - var2.field_13989;
      this.field_13982 = var1.field_13982 - var2.field_13982;
      this.field_13983 = var1.field_13983 - var2.field_13983;
      this.field_13992 = var1.field_13992 - var2.field_13992;
      this.field_13978 = var1.field_13978 - var2.field_13978;
      this.field_13990 = var1.field_13990 - var2.field_13990;
      this.field_13975 = var1.field_13975 - var2.field_13975;
      this.field_13985 = var1.field_13985 - var2.field_13985;
      this.field_13986 = var1.field_13986 - var2.field_13986;
      this.field_13988 = var1.field_13988 - var2.field_13988;
   }

   public final void method_13034(class_2856 var1) {
      this.field_13977 = this.field_13977 - var1.field_13977;
      this.field_13991 = this.field_13991 - var1.field_13991;
      this.field_13976 = this.field_13976 - var1.field_13976;
      this.field_13984 = this.field_13984 - var1.field_13984;
      this.field_13993 = this.field_13993 - var1.field_13993;
      this.field_13979 = this.field_13979 - var1.field_13979;
      this.field_13989 = this.field_13989 - var1.field_13989;
      this.field_13982 = this.field_13982 - var1.field_13982;
      this.field_13983 = this.field_13983 - var1.field_13983;
      this.field_13992 = this.field_13992 - var1.field_13992;
      this.field_13978 = this.field_13978 - var1.field_13978;
      this.field_13990 = this.field_13990 - var1.field_13990;
      this.field_13975 = this.field_13975 - var1.field_13975;
      this.field_13985 = this.field_13985 - var1.field_13985;
      this.field_13986 = this.field_13986 - var1.field_13986;
      this.field_13988 = this.field_13988 - var1.field_13988;
   }

   public final void method_13036() {
      float var3 = this.field_13993;
      this.field_13993 = this.field_13991;
      this.field_13991 = var3;
      var3 = this.field_13983;
      this.field_13983 = this.field_13976;
      this.field_13976 = var3;
      var3 = this.field_13975;
      this.field_13975 = this.field_13984;
      this.field_13984 = var3;
      var3 = this.field_13992;
      this.field_13992 = this.field_13989;
      this.field_13989 = var3;
      var3 = this.field_13985;
      this.field_13985 = this.field_13982;
      this.field_13982 = var3;
      var3 = this.field_13986;
      this.field_13986 = this.field_13990;
      this.field_13990 = var3;
   }

   public final void method_13037(class_2856 var1) {
      if (this == var1) {
         this.method_13036();
      } else {
         this.field_13977 = var1.field_13977;
         this.field_13991 = var1.field_13993;
         this.field_13976 = var1.field_13983;
         this.field_13984 = var1.field_13975;
         this.field_13993 = var1.field_13991;
         this.field_13979 = var1.field_13979;
         this.field_13989 = var1.field_13992;
         this.field_13982 = var1.field_13985;
         this.field_13983 = var1.field_13976;
         this.field_13992 = var1.field_13989;
         this.field_13978 = var1.field_13978;
         this.field_13990 = var1.field_13986;
         this.field_13975 = var1.field_13984;
         this.field_13985 = var1.field_13982;
         this.field_13986 = var1.field_13990;
         this.field_13988 = var1.field_13988;
      }
   }

   public final void method_13006(class_8778 var1) {
      this.field_13977 = 1.0F - 2.0F * var1.field_9016 * var1.field_9016 - 2.0F * var1.field_9013 * var1.field_9013;
      this.field_13993 = 2.0F * (var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_13983 = 2.0F * (var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_13991 = 2.0F * (var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_13979 = 1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9013 * var1.field_9013;
      this.field_13992 = 2.0F * (var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_13976 = 2.0F * (var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_13989 = 2.0F * (var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_13978 = 1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9016 * var1.field_9016;
      this.field_13984 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13005(class_7441 var1) {
      float var4 = (float)Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!((double)var4 < 1.0E-8)) {
         var4 = 1.0F / var4;
         float var5 = var1.field_37928 * var4;
         float var6 = var1.field_37931 * var4;
         float var7 = var1.field_37927 * var4;
         float var8 = (float)Math.sin((double)var1.field_37925);
         float var9 = (float)Math.cos((double)var1.field_37925);
         float var10 = 1.0F - var9;
         float var11 = var5 * var7;
         float var12 = var5 * var6;
         float var13 = var6 * var7;
         this.field_13977 = var10 * var5 * var5 + var9;
         this.field_13991 = var10 * var12 - var8 * var7;
         this.field_13976 = var10 * var11 + var8 * var6;
         this.field_13993 = var10 * var12 + var8 * var7;
         this.field_13979 = var10 * var6 * var6 + var9;
         this.field_13989 = var10 * var13 - var8 * var5;
         this.field_13983 = var10 * var11 - var8 * var6;
         this.field_13992 = var10 * var13 + var8 * var5;
         this.field_13978 = var10 * var7 * var7 + var9;
      } else {
         this.field_13977 = 1.0F;
         this.field_13991 = 0.0F;
         this.field_13976 = 0.0F;
         this.field_13993 = 0.0F;
         this.field_13979 = 1.0F;
         this.field_13989 = 0.0F;
         this.field_13983 = 0.0F;
         this.field_13992 = 0.0F;
         this.field_13978 = 1.0F;
      }

      this.field_13984 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13010(class_9400 var1) {
      this.field_13977 = (float)(1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_13993 = (float)(2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828));
      this.field_13983 = (float)(2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830));
      this.field_13991 = (float)(2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828));
      this.field_13979 = (float)(1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_13992 = (float)(2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829));
      this.field_13976 = (float)(2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830));
      this.field_13989 = (float)(2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829));
      this.field_13978 = (float)(1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830);
      this.field_13984 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13009(class_9179 var1) {
      double var4 = Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      if (!(var4 < 1.0E-8)) {
         var4 = 1.0 / var4;
         double var6 = var1.field_46964 * var4;
         double var8 = var1.field_46963 * var4;
         double var10 = var1.field_46965 * var4;
         float var12 = (float)Math.sin(var1.field_46968);
         float var13 = (float)Math.cos(var1.field_46968);
         float var14 = 1.0F - var13;
         float var15 = (float)(var6 * var10);
         float var16 = (float)(var6 * var8);
         float var17 = (float)(var8 * var10);
         this.field_13977 = var14 * (float)(var6 * var6) + var13;
         this.field_13991 = var14 * var16 - var12 * (float)var10;
         this.field_13976 = var14 * var15 + var12 * (float)var8;
         this.field_13993 = var14 * var16 + var12 * (float)var10;
         this.field_13979 = var14 * (float)(var8 * var8) + var13;
         this.field_13989 = var14 * var17 - var12 * (float)var6;
         this.field_13983 = var14 * var15 - var12 * (float)var8;
         this.field_13992 = var14 * var17 + var12 * (float)var6;
         this.field_13978 = var14 * (float)(var10 * var10) + var13;
      } else {
         this.field_13977 = 1.0F;
         this.field_13991 = 0.0F;
         this.field_13976 = 0.0F;
         this.field_13993 = 0.0F;
         this.field_13979 = 1.0F;
         this.field_13989 = 0.0F;
         this.field_13983 = 0.0F;
         this.field_13992 = 0.0F;
         this.field_13978 = 1.0F;
      }

      this.field_13984 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13011(class_9400 var1, class_2627 var2, double var3) {
      this.field_13977 = (float)(var3 * (1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828));
      this.field_13993 = (float)(var3 * 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828));
      this.field_13983 = (float)(var3 * 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830));
      this.field_13991 = (float)(var3 * 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828));
      this.field_13979 = (float)(var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828));
      this.field_13992 = (float)(var3 * 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829));
      this.field_13976 = (float)(var3 * 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830));
      this.field_13989 = (float)(var3 * 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829));
      this.field_13978 = (float)(var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830));
      this.field_13984 = (float)var2.field_17244;
      this.field_13982 = (float)var2.field_17242;
      this.field_13990 = (float)var2.field_17241;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13007(class_8778 var1, class_6181 var2, float var3) {
      this.field_13977 = var3 * (1.0F - 2.0F * var1.field_9016 * var1.field_9016 - 2.0F * var1.field_9013 * var1.field_9013);
      this.field_13993 = var3 * 2.0F * (var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_13983 = var3 * 2.0F * (var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_13991 = var3 * 2.0F * (var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_13979 = var3 * (1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9013 * var1.field_9013);
      this.field_13992 = var3 * 2.0F * (var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_13976 = var3 * 2.0F * (var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_13989 = var3 * 2.0F * (var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_13978 = var3 * (1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9016 * var1.field_9016);
      this.field_13984 = var2.field_4390;
      this.field_13982 = var2.field_4391;
      this.field_13990 = var2.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13008(class_9076 var1) {
      this.field_13977 = (float)var1.field_46473;
      this.field_13991 = (float)var1.field_46466;
      this.field_13976 = (float)var1.field_46474;
      this.field_13984 = (float)var1.field_46460;
      this.field_13993 = (float)var1.field_46458;
      this.field_13979 = (float)var1.field_46467;
      this.field_13989 = (float)var1.field_46464;
      this.field_13982 = (float)var1.field_46461;
      this.field_13983 = (float)var1.field_46470;
      this.field_13992 = (float)var1.field_46469;
      this.field_13978 = (float)var1.field_46468;
      this.field_13990 = (float)var1.field_46475;
      this.field_13975 = (float)var1.field_46472;
      this.field_13985 = (float)var1.field_46471;
      this.field_13986 = (float)var1.field_46463;
      this.field_13988 = (float)var1.field_46457;
   }

   public final void method_12998(class_2856 var1) {
      this.field_13977 = var1.field_13977;
      this.field_13991 = var1.field_13991;
      this.field_13976 = var1.field_13976;
      this.field_13984 = var1.field_13984;
      this.field_13993 = var1.field_13993;
      this.field_13979 = var1.field_13979;
      this.field_13989 = var1.field_13989;
      this.field_13982 = var1.field_13982;
      this.field_13983 = var1.field_13983;
      this.field_13992 = var1.field_13992;
      this.field_13978 = var1.field_13978;
      this.field_13990 = var1.field_13990;
      this.field_13975 = var1.field_13975;
      this.field_13985 = var1.field_13985;
      this.field_13986 = var1.field_13986;
      this.field_13988 = var1.field_13988;
   }

   public final void method_13052(class_2856 var1) {
      this.method_13039(var1);
   }

   public final void method_13051() {
      this.method_13039(this);
   }

   public final void method_13039(class_2856 var1) {
      double[] var4 = new double[16];
      double[] var5 = new double[16];
      int[] var6 = new int[4];
      var4[0] = (double)var1.field_13977;
      var4[1] = (double)var1.field_13991;
      var4[2] = (double)var1.field_13976;
      var4[3] = (double)var1.field_13984;
      var4[4] = (double)var1.field_13993;
      var4[5] = (double)var1.field_13979;
      var4[6] = (double)var1.field_13989;
      var4[7] = (double)var1.field_13982;
      var4[8] = (double)var1.field_13983;
      var4[9] = (double)var1.field_13992;
      var4[10] = (double)var1.field_13978;
      var4[11] = (double)var1.field_13990;
      var4[12] = (double)var1.field_13975;
      var4[13] = (double)var1.field_13985;
      var4[14] = (double)var1.field_13986;
      var4[15] = (double)var1.field_13988;
      if (!method_13081(var4, var6)) {
         throw new class_5059(class_3730.method_17283("Matrix4f12"));
      } else {
         for (int var7 = 0; var7 < 16; var7++) {
            var5[var7] = 0.0;
         }

         var5[0] = 1.0;
         var5[5] = 1.0;
         var5[10] = 1.0;
         var5[15] = 1.0;
         method_13032(var4, var6, var5);
         this.field_13977 = (float)var5[0];
         this.field_13991 = (float)var5[1];
         this.field_13976 = (float)var5[2];
         this.field_13984 = (float)var5[3];
         this.field_13993 = (float)var5[4];
         this.field_13979 = (float)var5[5];
         this.field_13989 = (float)var5[6];
         this.field_13982 = (float)var5[7];
         this.field_13983 = (float)var5[8];
         this.field_13992 = (float)var5[9];
         this.field_13978 = (float)var5[10];
         this.field_13990 = (float)var5[11];
         this.field_13975 = (float)var5[12];
         this.field_13985 = (float)var5[13];
         this.field_13986 = (float)var5[14];
         this.field_13988 = (float)var5[15];
      }
   }

   public static boolean method_13081(double[] var0, int[] var1) {
      double[] var4 = new double[4];
      int var5 = 0;
      int var6 = 0;
      int var7 = 4;

      while (var7-- != 0) {
         double var9 = 0.0;
         int var8 = 4;

         while (var8-- != 0) {
            double var11 = var0[var5++];
            var11 = Math.abs(var11);
            if (var11 > var9) {
               var9 = var11;
            }
         }

         if (var9 == 0.0) {
            return false;
         }

         var4[var6++] = 1.0 / var9;
      }

      byte var28 = 0;

      for (int var27 = 0; var27 < 4; var27++) {
         for (int var23 = 0; var23 < var27; var23++) {
            int var15 = var28 + 4 * var23 + var27;
            double var16 = var0[var15];
            int var18 = var23;
            int var19 = var28 + 4 * var23;

            for (int var20 = var28 + var27; var18-- != 0; var20 += 4) {
               var16 -= var0[var19] * var0[var20];
               var19++;
            }

            var0[var15] = var16;
         }

         double var13 = 0.0;
         var6 = -1;

         for (int var24 = var27; var24 < 4; var24++) {
            int var30 = var28 + 4 * var24 + var27;
            double var32 = var0[var30];
            int var33 = var27;
            int var35 = var28 + 4 * var24;

            for (int var37 = var28 + var27; var33-- != 0; var37 += 4) {
               var32 -= var0[var35] * var0[var37];
               var35++;
            }

            var0[var30] = var32;
            double var21;
            if ((var21 = var4[var24] * Math.abs(var32)) >= var13) {
               var13 = var21;
               var6 = var24;
            }
         }

         if (var6 < 0) {
            throw new RuntimeException(class_3730.method_17283("Matrix4f13"));
         }

         if (var27 != var6) {
            int var34 = 4;
            int var36 = var28 + 4 * var6;
            int var38 = var28 + 4 * var27;

            while (var34-- != 0) {
               double var39 = var0[var36];
               var0[var36++] = var0[var38];
               var0[var38++] = var39;
            }

            var4[var6] = var4[var27];
         }

         var1[var27] = var6;
         if (var0[var28 + 4 * var27 + var27] == 0.0) {
            return false;
         }

         if (var27 != 3) {
            double var40 = 1.0 / var0[var28 + 4 * var27 + var27];
            int var31 = var28 + 4 * (var27 + 1) + var27;

            for (int var25 = 3 - var27; var25-- != 0; var31 += 4) {
               var0[var31] *= var40;
            }
         }
      }

      return true;
   }

   public static void method_13032(double[] var0, int[] var1, double[] var2) {
      byte var5 = 0;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6;
         int var8 = -1;

         for (int var9 = 0; var9 < 4; var9++) {
            int var11 = var1[var5 + var9];
            double var12 = var2[var7 + 4 * var11];
            var2[var7 + 4 * var11] = var2[var7 + 4 * var9];
            if (var8 < 0) {
               if (var12 != 0.0) {
                  var8 = var9;
               }
            } else {
               int var10 = var9 * 4;

               for (int var14 = var8; var14 <= var9 - 1; var14++) {
                  var12 -= var0[var10 + var14] * var2[var7 + 4 * var14];
               }
            }

            var2[var7 + 4 * var9] = var12;
         }

         int var15 = 12;
         var2[var7 + 12] = var2[var7 + 12] / var0[var15 + 3];
         var15 -= 4;
         var2[var7 + 8] = (var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12]) / var0[var15 + 2];
         var15 -= 4;
         var2[var7 + 4] = (var2[var7 + 4] - var0[var15 + 2] * var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12]) / var0[var15 + 1];
         var15 -= 4;
         var2[var7 + 0] = (var2[var7 + 0] - var0[var15 + 1] * var2[var7 + 4] - var0[var15 + 2] * var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12])
            / var0[var15 + 0];
      }
   }

   public final float method_13075() {
      float var3 = this.field_13977
         * (
            this.field_13979 * this.field_13978 * this.field_13988
               + this.field_13989 * this.field_13990 * this.field_13985
               + this.field_13982 * this.field_13992 * this.field_13986
               - this.field_13982 * this.field_13978 * this.field_13985
               - this.field_13979 * this.field_13990 * this.field_13986
               - this.field_13989 * this.field_13992 * this.field_13988
         );
      var3 -= this.field_13991
         * (
            this.field_13993 * this.field_13978 * this.field_13988
               + this.field_13989 * this.field_13990 * this.field_13975
               + this.field_13982 * this.field_13983 * this.field_13986
               - this.field_13982 * this.field_13978 * this.field_13975
               - this.field_13993 * this.field_13990 * this.field_13986
               - this.field_13989 * this.field_13983 * this.field_13988
         );
      var3 += this.field_13976
         * (
            this.field_13993 * this.field_13992 * this.field_13988
               + this.field_13979 * this.field_13990 * this.field_13975
               + this.field_13982 * this.field_13983 * this.field_13985
               - this.field_13982 * this.field_13992 * this.field_13975
               - this.field_13993 * this.field_13990 * this.field_13985
               - this.field_13979 * this.field_13983 * this.field_13988
         );
      return var3
         - this.field_13984
            * (
               this.field_13993 * this.field_13992 * this.field_13986
                  + this.field_13979 * this.field_13978 * this.field_13975
                  + this.field_13989 * this.field_13983 * this.field_13985
                  - this.field_13989 * this.field_13992 * this.field_13975
                  - this.field_13993 * this.field_13978 * this.field_13985
                  - this.field_13979 * this.field_13983 * this.field_13986
            );
   }

   public final void method_12999(class_3367 var1) {
      this.field_13977 = var1.field_16607;
      this.field_13991 = var1.field_16596;
      this.field_13976 = var1.field_16597;
      this.field_13984 = 0.0F;
      this.field_13993 = var1.field_16606;
      this.field_13979 = var1.field_16602;
      this.field_13989 = var1.field_16599;
      this.field_13982 = 0.0F;
      this.field_13983 = var1.field_16604;
      this.field_13992 = var1.field_16605;
      this.field_13978 = var1.field_16600;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13001(class_4173 var1) {
      this.field_13977 = (float)var1.field_20304;
      this.field_13991 = (float)var1.field_20313;
      this.field_13976 = (float)var1.field_20311;
      this.field_13984 = 0.0F;
      this.field_13993 = (float)var1.field_20312;
      this.field_13979 = (float)var1.field_20305;
      this.field_13989 = (float)var1.field_20319;
      this.field_13982 = 0.0F;
      this.field_13983 = (float)var1.field_20314;
      this.field_13992 = (float)var1.field_20322;
      this.field_13978 = (float)var1.field_20307;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_12996(float var1) {
      this.field_13977 = var1;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = var1;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = var1;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13012(float[] var1) {
      this.field_13977 = var1[0];
      this.field_13991 = var1[1];
      this.field_13976 = var1[2];
      this.field_13984 = var1[3];
      this.field_13993 = var1[4];
      this.field_13979 = var1[5];
      this.field_13989 = var1[6];
      this.field_13982 = var1[7];
      this.field_13983 = var1[8];
      this.field_13992 = var1[9];
      this.field_13978 = var1[10];
      this.field_13990 = var1[11];
      this.field_13975 = var1[12];
      this.field_13985 = var1[13];
      this.field_13986 = var1[14];
      this.field_13988 = var1[15];
   }

   public final void method_13003(class_6181 var1) {
      this.field_13977 = 1.0F;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = var1.field_4390;
      this.field_13993 = 0.0F;
      this.field_13979 = 1.0F;
      this.field_13989 = 0.0F;
      this.field_13982 = var1.field_4391;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = 1.0F;
      this.field_13990 = var1.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_12997(float var1, class_6181 var2) {
      this.field_13977 = var1;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = var2.field_4390;
      this.field_13993 = 0.0F;
      this.field_13979 = var1;
      this.field_13989 = 0.0F;
      this.field_13982 = var2.field_4391;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = var1;
      this.field_13990 = var2.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13004(class_6181 var1, float var2) {
      this.field_13977 = var2;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = var2 * var1.field_4390;
      this.field_13993 = 0.0F;
      this.field_13979 = var2;
      this.field_13989 = 0.0F;
      this.field_13982 = var2 * var1.field_4391;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = var2;
      this.field_13990 = var2 * var1.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13000(class_3367 var1, class_6181 var2, float var3) {
      this.field_13977 = var1.field_16607 * var3;
      this.field_13991 = var1.field_16596 * var3;
      this.field_13976 = var1.field_16597 * var3;
      this.field_13984 = var2.field_4390;
      this.field_13993 = var1.field_16606 * var3;
      this.field_13979 = var1.field_16602 * var3;
      this.field_13989 = var1.field_16599 * var3;
      this.field_13982 = var2.field_4391;
      this.field_13983 = var1.field_16604 * var3;
      this.field_13992 = var1.field_16605 * var3;
      this.field_13978 = var1.field_16600 * var3;
      this.field_13990 = var2.field_4393;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13002(class_4173 var1, class_2627 var2, double var3) {
      this.field_13977 = (float)(var1.field_20304 * var3);
      this.field_13991 = (float)(var1.field_20313 * var3);
      this.field_13976 = (float)(var1.field_20311 * var3);
      this.field_13984 = (float)var2.field_17244;
      this.field_13993 = (float)(var1.field_20312 * var3);
      this.field_13979 = (float)(var1.field_20305 * var3);
      this.field_13989 = (float)(var1.field_20319 * var3);
      this.field_13982 = (float)var2.field_17242;
      this.field_13983 = (float)(var1.field_20314 * var3);
      this.field_13992 = (float)(var1.field_20322 * var3);
      this.field_13978 = (float)(var1.field_20307 * var3);
      this.field_13990 = (float)var2.field_17241;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_12980(class_6181 var1) {
      this.field_13984 = var1.field_4390;
      this.field_13982 = var1.field_4391;
      this.field_13990 = var1.field_4393;
   }

   public final void method_13076(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_13977 = 1.0F;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = var5;
      this.field_13989 = -var4;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = var4;
      this.field_13978 = var5;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_12986(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_13977 = var5;
      this.field_13991 = 0.0F;
      this.field_13976 = var4;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = 1.0F;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = -var4;
      this.field_13992 = 0.0F;
      this.field_13978 = var5;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13054(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_13977 = var5;
      this.field_13991 = -var4;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = var4;
      this.field_13979 = var5;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = 1.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 1.0F;
   }

   public final void method_13068(float var1) {
      this.field_13977 *= var1;
      this.field_13991 *= var1;
      this.field_13976 *= var1;
      this.field_13984 *= var1;
      this.field_13993 *= var1;
      this.field_13979 *= var1;
      this.field_13989 *= var1;
      this.field_13982 *= var1;
      this.field_13983 *= var1;
      this.field_13992 *= var1;
      this.field_13978 *= var1;
      this.field_13990 *= var1;
      this.field_13975 *= var1;
      this.field_13985 *= var1;
      this.field_13986 *= var1;
      this.field_13988 *= var1;
   }

   public final void method_13069(float var1, class_2856 var2) {
      this.field_13977 = var2.field_13977 * var1;
      this.field_13991 = var2.field_13991 * var1;
      this.field_13976 = var2.field_13976 * var1;
      this.field_13984 = var2.field_13984 * var1;
      this.field_13993 = var2.field_13993 * var1;
      this.field_13979 = var2.field_13979 * var1;
      this.field_13989 = var2.field_13989 * var1;
      this.field_13982 = var2.field_13982 * var1;
      this.field_13983 = var2.field_13983 * var1;
      this.field_13992 = var2.field_13992 * var1;
      this.field_13978 = var2.field_13978 * var1;
      this.field_13990 = var2.field_13990 * var1;
      this.field_13975 = var2.field_13975 * var1;
      this.field_13985 = var2.field_13985 * var1;
      this.field_13986 = var2.field_13986 * var1;
      this.field_13988 = var2.field_13988 * var1;
   }

   public final void method_13070(class_2856 var1) {
      float var4 = this.field_13977 * var1.field_13977
         + this.field_13991 * var1.field_13993
         + this.field_13976 * var1.field_13983
         + this.field_13984 * var1.field_13975;
      float var5 = this.field_13977 * var1.field_13991
         + this.field_13991 * var1.field_13979
         + this.field_13976 * var1.field_13992
         + this.field_13984 * var1.field_13985;
      float var6 = this.field_13977 * var1.field_13976
         + this.field_13991 * var1.field_13989
         + this.field_13976 * var1.field_13978
         + this.field_13984 * var1.field_13986;
      float var7 = this.field_13977 * var1.field_13984
         + this.field_13991 * var1.field_13982
         + this.field_13976 * var1.field_13990
         + this.field_13984 * var1.field_13988;
      float var8 = this.field_13993 * var1.field_13977
         + this.field_13979 * var1.field_13993
         + this.field_13989 * var1.field_13983
         + this.field_13982 * var1.field_13975;
      float var9 = this.field_13993 * var1.field_13991
         + this.field_13979 * var1.field_13979
         + this.field_13989 * var1.field_13992
         + this.field_13982 * var1.field_13985;
      float var10 = this.field_13993 * var1.field_13976
         + this.field_13979 * var1.field_13989
         + this.field_13989 * var1.field_13978
         + this.field_13982 * var1.field_13986;
      float var11 = this.field_13993 * var1.field_13984
         + this.field_13979 * var1.field_13982
         + this.field_13989 * var1.field_13990
         + this.field_13982 * var1.field_13988;
      float var12 = this.field_13983 * var1.field_13977
         + this.field_13992 * var1.field_13993
         + this.field_13978 * var1.field_13983
         + this.field_13990 * var1.field_13975;
      float var13 = this.field_13983 * var1.field_13991
         + this.field_13992 * var1.field_13979
         + this.field_13978 * var1.field_13992
         + this.field_13990 * var1.field_13985;
      float var14 = this.field_13983 * var1.field_13976
         + this.field_13992 * var1.field_13989
         + this.field_13978 * var1.field_13978
         + this.field_13990 * var1.field_13986;
      float var15 = this.field_13983 * var1.field_13984
         + this.field_13992 * var1.field_13982
         + this.field_13978 * var1.field_13990
         + this.field_13990 * var1.field_13988;
      float var16 = this.field_13975 * var1.field_13977
         + this.field_13985 * var1.field_13993
         + this.field_13986 * var1.field_13983
         + this.field_13988 * var1.field_13975;
      float var17 = this.field_13975 * var1.field_13991
         + this.field_13985 * var1.field_13979
         + this.field_13986 * var1.field_13992
         + this.field_13988 * var1.field_13985;
      float var18 = this.field_13975 * var1.field_13976
         + this.field_13985 * var1.field_13989
         + this.field_13986 * var1.field_13978
         + this.field_13988 * var1.field_13986;
      float var19 = this.field_13975 * var1.field_13984
         + this.field_13985 * var1.field_13982
         + this.field_13986 * var1.field_13990
         + this.field_13988 * var1.field_13988;
      this.field_13977 = var4;
      this.field_13991 = var5;
      this.field_13976 = var6;
      this.field_13984 = var7;
      this.field_13993 = var8;
      this.field_13979 = var9;
      this.field_13989 = var10;
      this.field_13982 = var11;
      this.field_13983 = var12;
      this.field_13992 = var13;
      this.field_13978 = var14;
      this.field_13990 = var15;
      this.field_13975 = var16;
      this.field_13985 = var17;
      this.field_13986 = var18;
      this.field_13988 = var19;
   }

   public final void method_13071(class_2856 var1, class_2856 var2) {
      if (this != var1 && this != var2) {
         this.field_13977 = var1.field_13977 * var2.field_13977
            + var1.field_13991 * var2.field_13993
            + var1.field_13976 * var2.field_13983
            + var1.field_13984 * var2.field_13975;
         this.field_13991 = var1.field_13977 * var2.field_13991
            + var1.field_13991 * var2.field_13979
            + var1.field_13976 * var2.field_13992
            + var1.field_13984 * var2.field_13985;
         this.field_13976 = var1.field_13977 * var2.field_13976
            + var1.field_13991 * var2.field_13989
            + var1.field_13976 * var2.field_13978
            + var1.field_13984 * var2.field_13986;
         this.field_13984 = var1.field_13977 * var2.field_13984
            + var1.field_13991 * var2.field_13982
            + var1.field_13976 * var2.field_13990
            + var1.field_13984 * var2.field_13988;
         this.field_13993 = var1.field_13993 * var2.field_13977
            + var1.field_13979 * var2.field_13993
            + var1.field_13989 * var2.field_13983
            + var1.field_13982 * var2.field_13975;
         this.field_13979 = var1.field_13993 * var2.field_13991
            + var1.field_13979 * var2.field_13979
            + var1.field_13989 * var2.field_13992
            + var1.field_13982 * var2.field_13985;
         this.field_13989 = var1.field_13993 * var2.field_13976
            + var1.field_13979 * var2.field_13989
            + var1.field_13989 * var2.field_13978
            + var1.field_13982 * var2.field_13986;
         this.field_13982 = var1.field_13993 * var2.field_13984
            + var1.field_13979 * var2.field_13982
            + var1.field_13989 * var2.field_13990
            + var1.field_13982 * var2.field_13988;
         this.field_13983 = var1.field_13983 * var2.field_13977
            + var1.field_13992 * var2.field_13993
            + var1.field_13978 * var2.field_13983
            + var1.field_13990 * var2.field_13975;
         this.field_13992 = var1.field_13983 * var2.field_13991
            + var1.field_13992 * var2.field_13979
            + var1.field_13978 * var2.field_13992
            + var1.field_13990 * var2.field_13985;
         this.field_13978 = var1.field_13983 * var2.field_13976
            + var1.field_13992 * var2.field_13989
            + var1.field_13978 * var2.field_13978
            + var1.field_13990 * var2.field_13986;
         this.field_13990 = var1.field_13983 * var2.field_13984
            + var1.field_13992 * var2.field_13982
            + var1.field_13978 * var2.field_13990
            + var1.field_13990 * var2.field_13988;
         this.field_13975 = var1.field_13975 * var2.field_13977
            + var1.field_13985 * var2.field_13993
            + var1.field_13986 * var2.field_13983
            + var1.field_13988 * var2.field_13975;
         this.field_13985 = var1.field_13975 * var2.field_13991
            + var1.field_13985 * var2.field_13979
            + var1.field_13986 * var2.field_13992
            + var1.field_13988 * var2.field_13985;
         this.field_13986 = var1.field_13975 * var2.field_13976
            + var1.field_13985 * var2.field_13989
            + var1.field_13986 * var2.field_13978
            + var1.field_13988 * var2.field_13986;
         this.field_13988 = var1.field_13975 * var2.field_13984
            + var1.field_13985 * var2.field_13982
            + var1.field_13986 * var2.field_13990
            + var1.field_13988 * var2.field_13988;
      } else {
         float var5 = var1.field_13977 * var2.field_13977
            + var1.field_13991 * var2.field_13993
            + var1.field_13976 * var2.field_13983
            + var1.field_13984 * var2.field_13975;
         float var6 = var1.field_13977 * var2.field_13991
            + var1.field_13991 * var2.field_13979
            + var1.field_13976 * var2.field_13992
            + var1.field_13984 * var2.field_13985;
         float var7 = var1.field_13977 * var2.field_13976
            + var1.field_13991 * var2.field_13989
            + var1.field_13976 * var2.field_13978
            + var1.field_13984 * var2.field_13986;
         float var8 = var1.field_13977 * var2.field_13984
            + var1.field_13991 * var2.field_13982
            + var1.field_13976 * var2.field_13990
            + var1.field_13984 * var2.field_13988;
         float var9 = var1.field_13993 * var2.field_13977
            + var1.field_13979 * var2.field_13993
            + var1.field_13989 * var2.field_13983
            + var1.field_13982 * var2.field_13975;
         float var10 = var1.field_13993 * var2.field_13991
            + var1.field_13979 * var2.field_13979
            + var1.field_13989 * var2.field_13992
            + var1.field_13982 * var2.field_13985;
         float var11 = var1.field_13993 * var2.field_13976
            + var1.field_13979 * var2.field_13989
            + var1.field_13989 * var2.field_13978
            + var1.field_13982 * var2.field_13986;
         float var12 = var1.field_13993 * var2.field_13984
            + var1.field_13979 * var2.field_13982
            + var1.field_13989 * var2.field_13990
            + var1.field_13982 * var2.field_13988;
         float var13 = var1.field_13983 * var2.field_13977
            + var1.field_13992 * var2.field_13993
            + var1.field_13978 * var2.field_13983
            + var1.field_13990 * var2.field_13975;
         float var14 = var1.field_13983 * var2.field_13991
            + var1.field_13992 * var2.field_13979
            + var1.field_13978 * var2.field_13992
            + var1.field_13990 * var2.field_13985;
         float var15 = var1.field_13983 * var2.field_13976
            + var1.field_13992 * var2.field_13989
            + var1.field_13978 * var2.field_13978
            + var1.field_13990 * var2.field_13986;
         float var16 = var1.field_13983 * var2.field_13984
            + var1.field_13992 * var2.field_13982
            + var1.field_13978 * var2.field_13990
            + var1.field_13990 * var2.field_13988;
         float var17 = var1.field_13975 * var2.field_13977
            + var1.field_13985 * var2.field_13993
            + var1.field_13986 * var2.field_13983
            + var1.field_13988 * var2.field_13975;
         float var18 = var1.field_13975 * var2.field_13991
            + var1.field_13985 * var2.field_13979
            + var1.field_13986 * var2.field_13992
            + var1.field_13988 * var2.field_13985;
         float var19 = var1.field_13975 * var2.field_13976
            + var1.field_13985 * var2.field_13989
            + var1.field_13986 * var2.field_13978
            + var1.field_13988 * var2.field_13986;
         float var20 = var1.field_13975 * var2.field_13984
            + var1.field_13985 * var2.field_13982
            + var1.field_13986 * var2.field_13990
            + var1.field_13988 * var2.field_13988;
         this.field_13977 = var5;
         this.field_13991 = var6;
         this.field_13976 = var7;
         this.field_13984 = var8;
         this.field_13993 = var9;
         this.field_13979 = var10;
         this.field_13989 = var11;
         this.field_13982 = var12;
         this.field_13983 = var13;
         this.field_13992 = var14;
         this.field_13978 = var15;
         this.field_13990 = var16;
         this.field_13975 = var17;
         this.field_13985 = var18;
         this.field_13986 = var19;
         this.field_13988 = var20;
      }
   }

   public final void method_12989(class_2856 var1, class_2856 var2) {
      if (this != var1 && this != var2) {
         this.field_13977 = var1.field_13977 * var2.field_13977
            + var1.field_13993 * var2.field_13991
            + var1.field_13983 * var2.field_13976
            + var1.field_13975 * var2.field_13984;
         this.field_13991 = var1.field_13977 * var2.field_13993
            + var1.field_13993 * var2.field_13979
            + var1.field_13983 * var2.field_13989
            + var1.field_13975 * var2.field_13982;
         this.field_13976 = var1.field_13977 * var2.field_13983
            + var1.field_13993 * var2.field_13992
            + var1.field_13983 * var2.field_13978
            + var1.field_13975 * var2.field_13990;
         this.field_13984 = var1.field_13977 * var2.field_13975
            + var1.field_13993 * var2.field_13985
            + var1.field_13983 * var2.field_13986
            + var1.field_13975 * var2.field_13988;
         this.field_13993 = var1.field_13991 * var2.field_13977
            + var1.field_13979 * var2.field_13991
            + var1.field_13992 * var2.field_13976
            + var1.field_13985 * var2.field_13984;
         this.field_13979 = var1.field_13991 * var2.field_13993
            + var1.field_13979 * var2.field_13979
            + var1.field_13992 * var2.field_13989
            + var1.field_13985 * var2.field_13982;
         this.field_13989 = var1.field_13991 * var2.field_13983
            + var1.field_13979 * var2.field_13992
            + var1.field_13992 * var2.field_13978
            + var1.field_13985 * var2.field_13990;
         this.field_13982 = var1.field_13991 * var2.field_13975
            + var1.field_13979 * var2.field_13985
            + var1.field_13992 * var2.field_13986
            + var1.field_13985 * var2.field_13988;
         this.field_13983 = var1.field_13976 * var2.field_13977
            + var1.field_13989 * var2.field_13991
            + var1.field_13978 * var2.field_13976
            + var1.field_13986 * var2.field_13984;
         this.field_13992 = var1.field_13976 * var2.field_13993
            + var1.field_13989 * var2.field_13979
            + var1.field_13978 * var2.field_13989
            + var1.field_13986 * var2.field_13982;
         this.field_13978 = var1.field_13976 * var2.field_13983
            + var1.field_13989 * var2.field_13992
            + var1.field_13978 * var2.field_13978
            + var1.field_13986 * var2.field_13990;
         this.field_13990 = var1.field_13976 * var2.field_13975
            + var1.field_13989 * var2.field_13985
            + var1.field_13978 * var2.field_13986
            + var1.field_13986 * var2.field_13988;
         this.field_13975 = var1.field_13984 * var2.field_13977
            + var1.field_13982 * var2.field_13991
            + var1.field_13990 * var2.field_13976
            + var1.field_13988 * var2.field_13984;
         this.field_13985 = var1.field_13984 * var2.field_13993
            + var1.field_13982 * var2.field_13979
            + var1.field_13990 * var2.field_13989
            + var1.field_13988 * var2.field_13982;
         this.field_13986 = var1.field_13984 * var2.field_13983
            + var1.field_13982 * var2.field_13992
            + var1.field_13990 * var2.field_13978
            + var1.field_13988 * var2.field_13990;
         this.field_13988 = var1.field_13984 * var2.field_13975
            + var1.field_13982 * var2.field_13985
            + var1.field_13990 * var2.field_13986
            + var1.field_13988 * var2.field_13988;
      } else {
         float var5 = var1.field_13977 * var2.field_13977
            + var1.field_13993 * var2.field_13991
            + var1.field_13983 * var2.field_13976
            + var1.field_13975 * var2.field_13984;
         float var6 = var1.field_13977 * var2.field_13993
            + var1.field_13993 * var2.field_13979
            + var1.field_13983 * var2.field_13989
            + var1.field_13975 * var2.field_13982;
         float var7 = var1.field_13977 * var2.field_13983
            + var1.field_13993 * var2.field_13992
            + var1.field_13983 * var2.field_13978
            + var1.field_13975 * var2.field_13990;
         float var8 = var1.field_13977 * var2.field_13975
            + var1.field_13993 * var2.field_13985
            + var1.field_13983 * var2.field_13986
            + var1.field_13975 * var2.field_13988;
         float var9 = var1.field_13991 * var2.field_13977
            + var1.field_13979 * var2.field_13991
            + var1.field_13992 * var2.field_13976
            + var1.field_13985 * var2.field_13984;
         float var10 = var1.field_13991 * var2.field_13993
            + var1.field_13979 * var2.field_13979
            + var1.field_13992 * var2.field_13989
            + var1.field_13985 * var2.field_13982;
         float var11 = var1.field_13991 * var2.field_13983
            + var1.field_13979 * var2.field_13992
            + var1.field_13992 * var2.field_13978
            + var1.field_13985 * var2.field_13990;
         float var12 = var1.field_13991 * var2.field_13975
            + var1.field_13979 * var2.field_13985
            + var1.field_13992 * var2.field_13986
            + var1.field_13985 * var2.field_13988;
         float var13 = var1.field_13976 * var2.field_13977
            + var1.field_13989 * var2.field_13991
            + var1.field_13978 * var2.field_13976
            + var1.field_13986 * var2.field_13984;
         float var14 = var1.field_13976 * var2.field_13993
            + var1.field_13989 * var2.field_13979
            + var1.field_13978 * var2.field_13989
            + var1.field_13986 * var2.field_13982;
         float var15 = var1.field_13976 * var2.field_13983
            + var1.field_13989 * var2.field_13992
            + var1.field_13978 * var2.field_13978
            + var1.field_13986 * var2.field_13990;
         float var16 = var1.field_13976 * var2.field_13975
            + var1.field_13989 * var2.field_13985
            + var1.field_13978 * var2.field_13986
            + var1.field_13986 * var2.field_13988;
         float var17 = var1.field_13984 * var2.field_13977
            + var1.field_13982 * var2.field_13991
            + var1.field_13990 * var2.field_13976
            + var1.field_13988 * var2.field_13984;
         float var18 = var1.field_13984 * var2.field_13993
            + var1.field_13982 * var2.field_13979
            + var1.field_13990 * var2.field_13989
            + var1.field_13988 * var2.field_13982;
         float var19 = var1.field_13984 * var2.field_13983
            + var1.field_13982 * var2.field_13992
            + var1.field_13990 * var2.field_13978
            + var1.field_13988 * var2.field_13990;
         float var20 = var1.field_13984 * var2.field_13975
            + var1.field_13982 * var2.field_13985
            + var1.field_13990 * var2.field_13986
            + var1.field_13988 * var2.field_13988;
         this.field_13977 = var5;
         this.field_13991 = var6;
         this.field_13976 = var7;
         this.field_13984 = var8;
         this.field_13993 = var9;
         this.field_13979 = var10;
         this.field_13989 = var11;
         this.field_13982 = var12;
         this.field_13983 = var13;
         this.field_13992 = var14;
         this.field_13978 = var15;
         this.field_13990 = var16;
         this.field_13975 = var17;
         this.field_13985 = var18;
         this.field_13986 = var19;
         this.field_13988 = var20;
      }
   }

   public final void method_13079(class_2856 var1, class_2856 var2) {
      if (this != var1 && this != var2) {
         this.field_13977 = var1.field_13977 * var2.field_13977
            + var1.field_13991 * var2.field_13991
            + var1.field_13976 * var2.field_13976
            + var1.field_13984 * var2.field_13984;
         this.field_13991 = var1.field_13977 * var2.field_13993
            + var1.field_13991 * var2.field_13979
            + var1.field_13976 * var2.field_13989
            + var1.field_13984 * var2.field_13982;
         this.field_13976 = var1.field_13977 * var2.field_13983
            + var1.field_13991 * var2.field_13992
            + var1.field_13976 * var2.field_13978
            + var1.field_13984 * var2.field_13990;
         this.field_13984 = var1.field_13977 * var2.field_13975
            + var1.field_13991 * var2.field_13985
            + var1.field_13976 * var2.field_13986
            + var1.field_13984 * var2.field_13988;
         this.field_13993 = var1.field_13993 * var2.field_13977
            + var1.field_13979 * var2.field_13991
            + var1.field_13989 * var2.field_13976
            + var1.field_13982 * var2.field_13984;
         this.field_13979 = var1.field_13993 * var2.field_13993
            + var1.field_13979 * var2.field_13979
            + var1.field_13989 * var2.field_13989
            + var1.field_13982 * var2.field_13982;
         this.field_13989 = var1.field_13993 * var2.field_13983
            + var1.field_13979 * var2.field_13992
            + var1.field_13989 * var2.field_13978
            + var1.field_13982 * var2.field_13990;
         this.field_13982 = var1.field_13993 * var2.field_13975
            + var1.field_13979 * var2.field_13985
            + var1.field_13989 * var2.field_13986
            + var1.field_13982 * var2.field_13988;
         this.field_13983 = var1.field_13983 * var2.field_13977
            + var1.field_13992 * var2.field_13991
            + var1.field_13978 * var2.field_13976
            + var1.field_13990 * var2.field_13984;
         this.field_13992 = var1.field_13983 * var2.field_13993
            + var1.field_13992 * var2.field_13979
            + var1.field_13978 * var2.field_13989
            + var1.field_13990 * var2.field_13982;
         this.field_13978 = var1.field_13983 * var2.field_13983
            + var1.field_13992 * var2.field_13992
            + var1.field_13978 * var2.field_13978
            + var1.field_13990 * var2.field_13990;
         this.field_13990 = var1.field_13983 * var2.field_13975
            + var1.field_13992 * var2.field_13985
            + var1.field_13978 * var2.field_13986
            + var1.field_13990 * var2.field_13988;
         this.field_13975 = var1.field_13975 * var2.field_13977
            + var1.field_13985 * var2.field_13991
            + var1.field_13986 * var2.field_13976
            + var1.field_13988 * var2.field_13984;
         this.field_13985 = var1.field_13975 * var2.field_13993
            + var1.field_13985 * var2.field_13979
            + var1.field_13986 * var2.field_13989
            + var1.field_13988 * var2.field_13982;
         this.field_13986 = var1.field_13975 * var2.field_13983
            + var1.field_13985 * var2.field_13992
            + var1.field_13986 * var2.field_13978
            + var1.field_13988 * var2.field_13990;
         this.field_13988 = var1.field_13975 * var2.field_13975
            + var1.field_13985 * var2.field_13985
            + var1.field_13986 * var2.field_13986
            + var1.field_13988 * var2.field_13988;
      } else {
         float var5 = var1.field_13977 * var2.field_13977
            + var1.field_13991 * var2.field_13991
            + var1.field_13976 * var2.field_13976
            + var1.field_13984 * var2.field_13984;
         float var6 = var1.field_13977 * var2.field_13993
            + var1.field_13991 * var2.field_13979
            + var1.field_13976 * var2.field_13989
            + var1.field_13984 * var2.field_13982;
         float var7 = var1.field_13977 * var2.field_13983
            + var1.field_13991 * var2.field_13992
            + var1.field_13976 * var2.field_13978
            + var1.field_13984 * var2.field_13990;
         float var8 = var1.field_13977 * var2.field_13975
            + var1.field_13991 * var2.field_13985
            + var1.field_13976 * var2.field_13986
            + var1.field_13984 * var2.field_13988;
         float var9 = var1.field_13993 * var2.field_13977
            + var1.field_13979 * var2.field_13991
            + var1.field_13989 * var2.field_13976
            + var1.field_13982 * var2.field_13984;
         float var10 = var1.field_13993 * var2.field_13993
            + var1.field_13979 * var2.field_13979
            + var1.field_13989 * var2.field_13989
            + var1.field_13982 * var2.field_13982;
         float var11 = var1.field_13993 * var2.field_13983
            + var1.field_13979 * var2.field_13992
            + var1.field_13989 * var2.field_13978
            + var1.field_13982 * var2.field_13990;
         float var12 = var1.field_13993 * var2.field_13975
            + var1.field_13979 * var2.field_13985
            + var1.field_13989 * var2.field_13986
            + var1.field_13982 * var2.field_13988;
         float var13 = var1.field_13983 * var2.field_13977
            + var1.field_13992 * var2.field_13991
            + var1.field_13978 * var2.field_13976
            + var1.field_13990 * var2.field_13984;
         float var14 = var1.field_13983 * var2.field_13993
            + var1.field_13992 * var2.field_13979
            + var1.field_13978 * var2.field_13989
            + var1.field_13990 * var2.field_13982;
         float var15 = var1.field_13983 * var2.field_13983
            + var1.field_13992 * var2.field_13992
            + var1.field_13978 * var2.field_13978
            + var1.field_13990 * var2.field_13990;
         float var16 = var1.field_13983 * var2.field_13975
            + var1.field_13992 * var2.field_13985
            + var1.field_13978 * var2.field_13986
            + var1.field_13990 * var2.field_13988;
         float var17 = var1.field_13975 * var2.field_13977
            + var1.field_13985 * var2.field_13991
            + var1.field_13986 * var2.field_13976
            + var1.field_13988 * var2.field_13984;
         float var18 = var1.field_13975 * var2.field_13993
            + var1.field_13985 * var2.field_13979
            + var1.field_13986 * var2.field_13989
            + var1.field_13988 * var2.field_13982;
         float var19 = var1.field_13975 * var2.field_13983
            + var1.field_13985 * var2.field_13992
            + var1.field_13986 * var2.field_13978
            + var1.field_13988 * var2.field_13990;
         float var20 = var1.field_13975 * var2.field_13975
            + var1.field_13985 * var2.field_13985
            + var1.field_13986 * var2.field_13986
            + var1.field_13988 * var2.field_13988;
         this.field_13977 = var5;
         this.field_13991 = var6;
         this.field_13976 = var7;
         this.field_13984 = var8;
         this.field_13993 = var9;
         this.field_13979 = var10;
         this.field_13989 = var11;
         this.field_13982 = var12;
         this.field_13983 = var13;
         this.field_13992 = var14;
         this.field_13978 = var15;
         this.field_13990 = var16;
         this.field_13975 = var17;
         this.field_13985 = var18;
         this.field_13986 = var19;
         this.field_13988 = var20;
      }
   }

   public final void method_13042(class_2856 var1, class_2856 var2) {
      if (this != var1 && this != var2) {
         this.field_13977 = var1.field_13977 * var2.field_13977
            + var1.field_13993 * var2.field_13993
            + var1.field_13983 * var2.field_13983
            + var1.field_13975 * var2.field_13975;
         this.field_13991 = var1.field_13977 * var2.field_13991
            + var1.field_13993 * var2.field_13979
            + var1.field_13983 * var2.field_13992
            + var1.field_13975 * var2.field_13985;
         this.field_13976 = var1.field_13977 * var2.field_13976
            + var1.field_13993 * var2.field_13989
            + var1.field_13983 * var2.field_13978
            + var1.field_13975 * var2.field_13986;
         this.field_13984 = var1.field_13977 * var2.field_13984
            + var1.field_13993 * var2.field_13982
            + var1.field_13983 * var2.field_13990
            + var1.field_13975 * var2.field_13988;
         this.field_13993 = var1.field_13991 * var2.field_13977
            + var1.field_13979 * var2.field_13993
            + var1.field_13992 * var2.field_13983
            + var1.field_13985 * var2.field_13975;
         this.field_13979 = var1.field_13991 * var2.field_13991
            + var1.field_13979 * var2.field_13979
            + var1.field_13992 * var2.field_13992
            + var1.field_13985 * var2.field_13985;
         this.field_13989 = var1.field_13991 * var2.field_13976
            + var1.field_13979 * var2.field_13989
            + var1.field_13992 * var2.field_13978
            + var1.field_13985 * var2.field_13986;
         this.field_13982 = var1.field_13991 * var2.field_13984
            + var1.field_13979 * var2.field_13982
            + var1.field_13992 * var2.field_13990
            + var1.field_13985 * var2.field_13988;
         this.field_13983 = var1.field_13976 * var2.field_13977
            + var1.field_13989 * var2.field_13993
            + var1.field_13978 * var2.field_13983
            + var1.field_13986 * var2.field_13975;
         this.field_13992 = var1.field_13976 * var2.field_13991
            + var1.field_13989 * var2.field_13979
            + var1.field_13978 * var2.field_13992
            + var1.field_13986 * var2.field_13985;
         this.field_13978 = var1.field_13976 * var2.field_13976
            + var1.field_13989 * var2.field_13989
            + var1.field_13978 * var2.field_13978
            + var1.field_13986 * var2.field_13986;
         this.field_13990 = var1.field_13976 * var2.field_13984
            + var1.field_13989 * var2.field_13982
            + var1.field_13978 * var2.field_13990
            + var1.field_13986 * var2.field_13988;
         this.field_13975 = var1.field_13984 * var2.field_13977
            + var1.field_13982 * var2.field_13993
            + var1.field_13990 * var2.field_13983
            + var1.field_13988 * var2.field_13975;
         this.field_13985 = var1.field_13984 * var2.field_13991
            + var1.field_13982 * var2.field_13979
            + var1.field_13990 * var2.field_13992
            + var1.field_13988 * var2.field_13985;
         this.field_13986 = var1.field_13984 * var2.field_13976
            + var1.field_13982 * var2.field_13989
            + var1.field_13990 * var2.field_13978
            + var1.field_13988 * var2.field_13986;
         this.field_13988 = var1.field_13984 * var2.field_13984
            + var1.field_13982 * var2.field_13982
            + var1.field_13990 * var2.field_13990
            + var1.field_13988 * var2.field_13988;
      } else {
         float var5 = var1.field_13977 * var2.field_13977
            + var1.field_13993 * var2.field_13993
            + var1.field_13983 * var2.field_13983
            + var1.field_13975 * var2.field_13975;
         float var6 = var1.field_13977 * var2.field_13991
            + var1.field_13993 * var2.field_13979
            + var1.field_13983 * var2.field_13992
            + var1.field_13975 * var2.field_13985;
         float var7 = var1.field_13977 * var2.field_13976
            + var1.field_13993 * var2.field_13989
            + var1.field_13983 * var2.field_13978
            + var1.field_13975 * var2.field_13986;
         float var8 = var1.field_13977 * var2.field_13984
            + var1.field_13993 * var2.field_13982
            + var1.field_13983 * var2.field_13990
            + var1.field_13975 * var2.field_13988;
         float var9 = var1.field_13991 * var2.field_13977
            + var1.field_13979 * var2.field_13993
            + var1.field_13992 * var2.field_13983
            + var1.field_13985 * var2.field_13975;
         float var10 = var1.field_13991 * var2.field_13991
            + var1.field_13979 * var2.field_13979
            + var1.field_13992 * var2.field_13992
            + var1.field_13985 * var2.field_13985;
         float var11 = var1.field_13991 * var2.field_13976
            + var1.field_13979 * var2.field_13989
            + var1.field_13992 * var2.field_13978
            + var1.field_13985 * var2.field_13986;
         float var12 = var1.field_13991 * var2.field_13984
            + var1.field_13979 * var2.field_13982
            + var1.field_13992 * var2.field_13990
            + var1.field_13985 * var2.field_13988;
         float var13 = var1.field_13976 * var2.field_13977
            + var1.field_13989 * var2.field_13993
            + var1.field_13978 * var2.field_13983
            + var1.field_13986 * var2.field_13975;
         float var14 = var1.field_13976 * var2.field_13991
            + var1.field_13989 * var2.field_13979
            + var1.field_13978 * var2.field_13992
            + var1.field_13986 * var2.field_13985;
         float var15 = var1.field_13976 * var2.field_13976
            + var1.field_13989 * var2.field_13989
            + var1.field_13978 * var2.field_13978
            + var1.field_13986 * var2.field_13986;
         float var16 = var1.field_13976 * var2.field_13984
            + var1.field_13989 * var2.field_13982
            + var1.field_13978 * var2.field_13990
            + var1.field_13986 * var2.field_13988;
         float var17 = var1.field_13984 * var2.field_13977
            + var1.field_13982 * var2.field_13993
            + var1.field_13990 * var2.field_13983
            + var1.field_13988 * var2.field_13975;
         float var18 = var1.field_13984 * var2.field_13991
            + var1.field_13982 * var2.field_13979
            + var1.field_13990 * var2.field_13992
            + var1.field_13988 * var2.field_13985;
         float var19 = var1.field_13984 * var2.field_13976
            + var1.field_13982 * var2.field_13989
            + var1.field_13990 * var2.field_13978
            + var1.field_13988 * var2.field_13986;
         float var20 = var1.field_13984 * var2.field_13984
            + var1.field_13982 * var2.field_13982
            + var1.field_13990 * var2.field_13990
            + var1.field_13988 * var2.field_13988;
         this.field_13977 = var5;
         this.field_13991 = var6;
         this.field_13976 = var7;
         this.field_13984 = var8;
         this.field_13993 = var9;
         this.field_13979 = var10;
         this.field_13989 = var11;
         this.field_13982 = var12;
         this.field_13983 = var13;
         this.field_13992 = var14;
         this.field_13978 = var15;
         this.field_13990 = var16;
         this.field_13975 = var17;
         this.field_13985 = var18;
         this.field_13986 = var19;
         this.field_13988 = var20;
      }
   }

   public boolean equals(class_2856 var1) {
      try {
         return this.field_13977 == var1.field_13977
            && this.field_13991 == var1.field_13991
            && this.field_13976 == var1.field_13976
            && this.field_13984 == var1.field_13984
            && this.field_13993 == var1.field_13993
            && this.field_13979 == var1.field_13979
            && this.field_13989 == var1.field_13989
            && this.field_13982 == var1.field_13982
            && this.field_13983 == var1.field_13983
            && this.field_13992 == var1.field_13992
            && this.field_13978 == var1.field_13978
            && this.field_13990 == var1.field_13990
            && this.field_13975 == var1.field_13975
            && this.field_13985 == var1.field_13985
            && this.field_13986 == var1.field_13986
            && this.field_13988 == var1.field_13988;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_2856 var4 = (class_2856)var1;
         return this.field_13977 == var4.field_13977
            && this.field_13991 == var4.field_13991
            && this.field_13976 == var4.field_13976
            && this.field_13984 == var4.field_13984
            && this.field_13993 == var4.field_13993
            && this.field_13979 == var4.field_13979
            && this.field_13989 == var4.field_13989
            && this.field_13982 == var4.field_13982
            && this.field_13983 == var4.field_13983
            && this.field_13992 == var4.field_13992
            && this.field_13978 == var4.field_13978
            && this.field_13990 == var4.field_13990
            && this.field_13975 == var4.field_13975
            && this.field_13985 == var4.field_13985
            && this.field_13986 == var4.field_13986
            && this.field_13988 == var4.field_13988;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method_12994(class_2856 var1, float var2) {
      boolean var5 = true;
      if (Math.abs(this.field_13977 - var1.field_13977) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13991 - var1.field_13991) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13976 - var1.field_13976) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13984 - var1.field_13984) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13993 - var1.field_13993) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13979 - var1.field_13979) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13989 - var1.field_13989) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13982 - var1.field_13982) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13983 - var1.field_13983) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13992 - var1.field_13992) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13978 - var1.field_13978) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13990 - var1.field_13990) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13975 - var1.field_13975) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13985 - var1.field_13985) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13986 - var1.field_13986) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_13988 - var1.field_13988) > var2) {
         var5 = false;
      }

      return var5;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13977);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13991);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13976);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13984);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13993);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13979);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13989);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13982);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13983);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13992);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13978);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13990);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13975);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13985);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13986);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_13988);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_13019(class_1752 var1, class_1752 var2) {
      float var5 = this.field_13977 * var1.field_9014
         + this.field_13991 * var1.field_9016
         + this.field_13976 * var1.field_9013
         + this.field_13984 * var1.field_9012;
      float var6 = this.field_13993 * var1.field_9014
         + this.field_13979 * var1.field_9016
         + this.field_13989 * var1.field_9013
         + this.field_13982 * var1.field_9012;
      float var7 = this.field_13983 * var1.field_9014
         + this.field_13992 * var1.field_9016
         + this.field_13978 * var1.field_9013
         + this.field_13990 * var1.field_9012;
      var2.field_9012 = this.field_13975 * var1.field_9014
         + this.field_13985 * var1.field_9016
         + this.field_13986 * var1.field_9013
         + this.field_13988 * var1.field_9012;
      var2.field_9014 = var5;
      var2.field_9016 = var6;
      var2.field_9013 = var7;
   }

   public final void method_13018(class_1752 var1) {
      float var4 = this.field_13977 * var1.field_9014
         + this.field_13991 * var1.field_9016
         + this.field_13976 * var1.field_9013
         + this.field_13984 * var1.field_9012;
      float var5 = this.field_13993 * var1.field_9014
         + this.field_13979 * var1.field_9016
         + this.field_13989 * var1.field_9013
         + this.field_13982 * var1.field_9012;
      float var6 = this.field_13983 * var1.field_9014
         + this.field_13992 * var1.field_9016
         + this.field_13978 * var1.field_9013
         + this.field_13990 * var1.field_9012;
      var1.field_9012 = this.field_13975 * var1.field_9014
         + this.field_13985 * var1.field_9016
         + this.field_13986 * var1.field_9013
         + this.field_13988 * var1.field_9012;
      var1.field_9014 = var4;
      var1.field_9016 = var5;
      var1.field_9013 = var6;
   }

   public final void method_13023(class_8079 var1, class_8079 var2) {
      float var5 = this.field_13977 * var1.field_4390 + this.field_13991 * var1.field_4391 + this.field_13976 * var1.field_4393 + this.field_13984;
      float var6 = this.field_13993 * var1.field_4390 + this.field_13979 * var1.field_4391 + this.field_13989 * var1.field_4393 + this.field_13982;
      var2.field_4393 = this.field_13983 * var1.field_4390 + this.field_13992 * var1.field_4391 + this.field_13978 * var1.field_4393 + this.field_13990;
      var2.field_4390 = var5;
      var2.field_4391 = var6;
   }

   public final void method_13022(class_8079 var1) {
      float var4 = this.field_13977 * var1.field_4390 + this.field_13991 * var1.field_4391 + this.field_13976 * var1.field_4393 + this.field_13984;
      float var5 = this.field_13993 * var1.field_4390 + this.field_13979 * var1.field_4391 + this.field_13989 * var1.field_4393 + this.field_13982;
      var1.field_4393 = this.field_13983 * var1.field_4390 + this.field_13992 * var1.field_4391 + this.field_13978 * var1.field_4393 + this.field_13990;
      var1.field_4390 = var4;
      var1.field_4391 = var5;
   }

   public final void method_13021(class_6181 var1, class_6181 var2) {
      float var5 = this.field_13977 * var1.field_4390 + this.field_13991 * var1.field_4391 + this.field_13976 * var1.field_4393;
      float var6 = this.field_13993 * var1.field_4390 + this.field_13979 * var1.field_4391 + this.field_13989 * var1.field_4393;
      var2.field_4393 = this.field_13983 * var1.field_4390 + this.field_13992 * var1.field_4391 + this.field_13978 * var1.field_4393;
      var2.field_4390 = var5;
      var2.field_4391 = var6;
   }

   public final void method_13020(class_6181 var1) {
      float var4 = this.field_13977 * var1.field_4390 + this.field_13991 * var1.field_4391 + this.field_13976 * var1.field_4393;
      float var5 = this.field_13993 * var1.field_4390 + this.field_13979 * var1.field_4391 + this.field_13989 * var1.field_4393;
      var1.field_4393 = this.field_13983 * var1.field_4390 + this.field_13992 * var1.field_4391 + this.field_13978 * var1.field_4393;
      var1.field_4390 = var4;
      var1.field_4391 = var5;
   }

   public final void method_13064(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      this.field_13977 = (float)(var1.field_20304 * var5[0]);
      this.field_13991 = (float)(var1.field_20313 * var5[1]);
      this.field_13976 = (float)(var1.field_20311 * var5[2]);
      this.field_13993 = (float)(var1.field_20312 * var5[0]);
      this.field_13979 = (float)(var1.field_20305 * var5[1]);
      this.field_13989 = (float)(var1.field_20319 * var5[2]);
      this.field_13983 = (float)(var1.field_20314 * var5[0]);
      this.field_13992 = (float)(var1.field_20322 * var5[1]);
      this.field_13978 = (float)(var1.field_20307 * var5[2]);
   }

   public final void method_13063(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      this.field_13977 = (float)((double)var1.field_16607 * var5[0]);
      this.field_13991 = (float)((double)var1.field_16596 * var5[1]);
      this.field_13976 = (float)((double)var1.field_16597 * var5[2]);
      this.field_13993 = (float)((double)var1.field_16606 * var5[0]);
      this.field_13979 = (float)((double)var1.field_16602 * var5[1]);
      this.field_13989 = (float)((double)var1.field_16599 * var5[2]);
      this.field_13983 = (float)((double)var1.field_16604 * var5[0]);
      this.field_13992 = (float)((double)var1.field_16605 * var5[1]);
      this.field_13978 = (float)((double)var1.field_16600 * var5[2]);
   }

   public final void method_13066(class_8778 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      this.field_13977 = (float)((double)(1.0F - 2.0F * var1.field_9016 * var1.field_9016 - 2.0F * var1.field_9013 * var1.field_9013) * var5[0]);
      this.field_13993 = (float)((double)(2.0F * (var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013)) * var5[0]);
      this.field_13983 = (float)((double)(2.0F * (var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016)) * var5[0]);
      this.field_13991 = (float)((double)(2.0F * (var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013)) * var5[1]);
      this.field_13979 = (float)((double)(1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9013 * var1.field_9013) * var5[1]);
      this.field_13992 = (float)((double)(2.0F * (var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014)) * var5[1]);
      this.field_13976 = (float)((double)(2.0F * (var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016)) * var5[2]);
      this.field_13989 = (float)((double)(2.0F * (var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014)) * var5[2]);
      this.field_13978 = (float)((double)(1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9016 * var1.field_9016) * var5[2]);
   }

   public final void method_13067(class_9400 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      this.field_13977 = (float)((1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828) * var5[0]);
      this.field_13993 = (float)(2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828) * var5[0]);
      this.field_13983 = (float)(2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830) * var5[0]);
      this.field_13991 = (float)(2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828) * var5[1]);
      this.field_13979 = (float)((1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828) * var5[1]);
      this.field_13992 = (float)(2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829) * var5[1]);
      this.field_13976 = (float)(2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830) * var5[2]);
      this.field_13989 = (float)(2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829) * var5[2]);
      this.field_13978 = (float)((1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830) * var5[2]);
   }

   public final void method_13065(class_7441 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_13041(var5, var4);
      double var6 = Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!(var6 < 1.0E-8)) {
         var6 = 1.0 / var6;
         double var8 = (double)var1.field_37928 * var6;
         double var10 = (double)var1.field_37931 * var6;
         double var12 = (double)var1.field_37927 * var6;
         double var14 = Math.sin((double)var1.field_37925);
         double var16 = Math.cos((double)var1.field_37925);
         double var18 = 1.0 - var16;
         double var20 = (double)(var1.field_37928 * var1.field_37927);
         double var22 = (double)(var1.field_37928 * var1.field_37931);
         double var24 = (double)(var1.field_37931 * var1.field_37927);
         this.field_13977 = (float)((var18 * var8 * var8 + var16) * var5[0]);
         this.field_13991 = (float)((var18 * var22 - var14 * var12) * var5[1]);
         this.field_13976 = (float)((var18 * var20 + var14 * var10) * var5[2]);
         this.field_13993 = (float)((var18 * var22 + var14 * var12) * var5[0]);
         this.field_13979 = (float)((var18 * var10 * var10 + var16) * var5[1]);
         this.field_13989 = (float)((var18 * var24 - var14 * var8) * var5[2]);
         this.field_13983 = (float)((var18 * var20 - var14 * var10) * var5[0]);
         this.field_13992 = (float)((var18 * var24 + var14 * var8) * var5[1]);
         this.field_13978 = (float)((var18 * var12 * var12 + var16) * var5[2]);
      } else {
         this.field_13977 = 1.0F;
         this.field_13991 = 0.0F;
         this.field_13976 = 0.0F;
         this.field_13993 = 0.0F;
         this.field_13979 = 1.0F;
         this.field_13989 = 0.0F;
         this.field_13983 = 0.0F;
         this.field_13992 = 0.0F;
         this.field_13978 = 1.0F;
      }
   }

   public final void method_13082() {
      this.field_13977 = 0.0F;
      this.field_13991 = 0.0F;
      this.field_13976 = 0.0F;
      this.field_13984 = 0.0F;
      this.field_13993 = 0.0F;
      this.field_13979 = 0.0F;
      this.field_13989 = 0.0F;
      this.field_13982 = 0.0F;
      this.field_13983 = 0.0F;
      this.field_13992 = 0.0F;
      this.field_13978 = 0.0F;
      this.field_13990 = 0.0F;
      this.field_13975 = 0.0F;
      this.field_13985 = 0.0F;
      this.field_13986 = 0.0F;
      this.field_13988 = 0.0F;
   }

   public final void method_13049() {
      this.field_13977 = -this.field_13977;
      this.field_13991 = -this.field_13991;
      this.field_13976 = -this.field_13976;
      this.field_13984 = -this.field_13984;
      this.field_13993 = -this.field_13993;
      this.field_13979 = -this.field_13979;
      this.field_13989 = -this.field_13989;
      this.field_13982 = -this.field_13982;
      this.field_13983 = -this.field_13983;
      this.field_13992 = -this.field_13992;
      this.field_13978 = -this.field_13978;
      this.field_13990 = -this.field_13990;
      this.field_13975 = -this.field_13975;
      this.field_13985 = -this.field_13985;
      this.field_13986 = -this.field_13986;
      this.field_13988 = -this.field_13988;
   }

   public final void method_13050(class_2856 var1) {
      this.field_13977 = -var1.field_13977;
      this.field_13991 = -var1.field_13991;
      this.field_13976 = -var1.field_13976;
      this.field_13984 = -var1.field_13984;
      this.field_13993 = -var1.field_13993;
      this.field_13979 = -var1.field_13979;
      this.field_13989 = -var1.field_13989;
      this.field_13982 = -var1.field_13982;
      this.field_13983 = -var1.field_13983;
      this.field_13992 = -var1.field_13992;
      this.field_13978 = -var1.field_13978;
      this.field_13990 = -var1.field_13990;
      this.field_13975 = -var1.field_13975;
      this.field_13985 = -var1.field_13985;
      this.field_13986 = -var1.field_13986;
      this.field_13988 = -var1.field_13988;
   }

   private final void method_13041(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         (double)this.field_13977,
         (double)this.field_13991,
         (double)this.field_13976,
         (double)this.field_13993,
         (double)this.field_13979,
         (double)this.field_13989,
         (double)this.field_13983,
         (double)this.field_13992,
         (double)this.field_13978
      };
      class_4173.method_19400(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (class_2856)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final float method_12995() {
      return this.field_13977;
   }

   public final void method_12975(float var1) {
      this.field_13977 = var1;
   }

   public final float method_13024() {
      return this.field_13991;
   }

   public final void method_12991(float var1) {
      this.field_13991 = var1;
   }

   public final float method_12982() {
      return this.field_13976;
   }

   public final void method_12977(float var1) {
      this.field_13976 = var1;
   }

   public final float method_13033() {
      return this.field_13993;
   }

   public final void method_13055(float var1) {
      this.field_13993 = var1;
   }

   public final float method_13058() {
      return this.field_13979;
   }

   public final void method_12993(float var1) {
      this.field_13979 = var1;
   }

   public final float method_13046() {
      return this.field_13989;
   }

   public final void method_13077(float var1) {
      this.field_13989 = var1;
   }

   public final float method_12985() {
      return this.field_13983;
   }

   public final void method_13048(float var1) {
      this.field_13983 = var1;
   }

   public final float method_13057() {
      return this.field_13992;
   }

   public final void method_12981(float var1) {
      this.field_13992 = var1;
   }

   public final float method_13056() {
      return this.field_13978;
   }

   public final void method_13072(float var1) {
      this.field_13978 = var1;
   }

   public final float method_13078() {
      return this.field_13984;
   }

   public final void method_13031(float var1) {
      this.field_13984 = var1;
   }

   public final float method_13083() {
      return this.field_13982;
   }

   public final void method_12976(float var1) {
      this.field_13982 = var1;
   }

   public final float method_12990() {
      return this.field_13990;
   }

   public final void method_13040(float var1) {
      this.field_13990 = var1;
   }

   public final float method_12979() {
      return this.field_13975;
   }

   public final void method_12987(float var1) {
      this.field_13975 = var1;
   }

   public final float method_12988() {
      return this.field_13985;
   }

   public final void method_13030(float var1) {
      this.field_13985 = var1;
   }

   public final float method_12974() {
      return this.field_13986;
   }

   public final void method_13013(float var1) {
      this.field_13986 = var1;
   }

   public final float method_12973() {
      return this.field_13988;
   }

   public final void method_13080(float var1) {
      this.field_13988 = var1;
   }
}
