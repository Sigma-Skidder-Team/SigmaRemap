package remapped;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class class_8671 {
   private final class_1893 field_44499;
   private boolean field_44481;
   private boolean field_44497;
   private boolean field_44488;
   private double field_44482;
   private double field_44493;
   private int field_44486;
   private int field_44490 = -1;
   private boolean field_44489 = true;
   private int field_44492;
   private double field_44483;
   private final class_2299 field_44484 = new class_2299();
   private final class_2299 field_44495 = new class_2299();
   private double field_44498;
   private double field_44487;
   private double field_44494;
   private double field_44491 = Double.MIN_VALUE;
   private boolean field_44496;

   public class_8671(class_1893 var1) {
      this.field_44499 = var1;
   }

   private void method_39836(long var1, int var3, int var4, int var5) {
      if (SigmaMainClass.method_3328().method_3299().method_31001() != null) {
         SigmaMainClass.method_3328().method_3299().method_30982(var3, var4);
      } else {
         if (this.field_44499.field_9623 == null) {
            if (var4 != 1 && var4 != 2) {
               if (var4 == 0) {
                  class_307 var15 = new class_307(var3);
                  SigmaMainClass.method_3328().method_3302().method_7914(var15);
                  if (var15.method_29716()) {
                     return;
                  }
               }
            } else {
               if (var3 > 1) {
                  class_4233.method_19731(var3);
               }

               class_6435 var8 = new class_6435(var3, var4 == 2, null);
               SigmaMainClass.method_3328().method_3302().method_7914(var8);
               if (var8.method_29716()) {
                  return;
               }
            }
         }

         if (var1 == this.field_44499.method_8552().method_43181()) {
            boolean var16 = var4 == 1;
            if (class_1893.field_9574 && var3 == 0) {
               if (!var16) {
                  if (this.field_44486 > 0) {
                     var3 = 1;
                     this.field_44486--;
                  }
               } else if ((var5 & 2) == 2) {
                  var3 = 1;
                  this.field_44486++;
               }
            }

            int var9 = var3;
            if (!var16) {
               if (this.field_44490 != -1) {
                  if (this.field_44499.field_9577.field_45570 && --this.field_44492 > 0) {
                     return;
                  }

                  this.field_44490 = -1;
               }
            } else {
               if (this.field_44499.field_9577.field_45570 && this.field_44492++ > 0) {
                  return;
               }

               this.field_44490 = var9;
               this.field_44483 = class_2075.method_9684();
            }

            boolean[] var10 = new boolean[]{false};
            if (this.field_44499.field_9610 == null) {
               if (this.field_44499.field_9623 != null) {
                  double var11 = this.field_44482
                     * (double)this.field_44499.method_8552().method_43165()
                     / (double)this.field_44499.method_8552().method_43166();
                  double var13 = this.field_44493
                     * (double)this.field_44499.method_8552().method_43177()
                     / (double)this.field_44499.method_8552().method_43163();
                  if (!var16) {
                     class_266.method_1181(
                        () -> var10[0] = this.field_44499.field_9623.method_26941(var11, var13, var9),
                        "mouseReleased event handler",
                        this.field_44499.field_9623.getClass().getCanonicalName()
                     );
                  } else {
                     class_266.method_1181(
                        () -> var10[0] = this.field_44499.field_9623.method_26940(var11, var13, var9),
                        "mouseClicked event handler",
                        this.field_44499.field_9623.getClass().getCanonicalName()
                     );
                  }
               } else if (!this.field_44496 && var16) {
                  this.method_39834();
               }
            }

            if (!var10[0] && (this.field_44499.field_9623 == null || this.field_44499.field_9623.field_951) && this.field_44499.field_9610 == null) {
               if (var9 != 0) {
                  if (var9 != 2) {
                     if (var9 == 1) {
                        this.field_44488 = var16;
                     }
                  } else {
                     this.field_44497 = var16;
                  }
               } else {
                  this.field_44481 = var16;
               }

               class_5916.method_27072(class_8863.field_45320.method_40758(var9), var16);
               if (var16) {
                  if (this.field_44499.field_9632.method_37221() && var9 == 2) {
                     this.field_44499.field_9614.method_14004().method_38559();
                  } else {
                     class_5916.method_27059(class_8863.field_45320.method_40758(var9));
                  }
               }
            }
         }
      }
   }

   private void method_39841(long var1, double var3, double var5) {
      if (SigmaMainClass.method_3328().method_3299().method_31001() == null) {
         class_1523 var9 = new class_1523(var5);
         SigmaMainClass.method_3328().method_3302().method_7914(var9);
         if (!var9.method_29716()) {
            if (var1 == class_1893.method_8510().method_8552().method_43181()) {
               double var10 = (!this.field_44499.field_9577.field_45521 ? var5 : Math.signum(var5)) * this.field_44499.field_9577.field_45578;
               if (this.field_44499.field_9610 == null) {
                  if (this.field_44499.field_9623 == null) {
                     if (this.field_44499.field_9632 != null) {
                        if (this.field_44494 != 0.0 && Math.signum(var10) != Math.signum(this.field_44494)) {
                           this.field_44494 = 0.0;
                        }

                        this.field_44494 += var10;
                        float var16 = (float)((int)this.field_44494);
                        if (var16 == 0.0F) {
                           return;
                        }

                        this.field_44494 -= (double)var16;
                        if (!this.field_44499.field_9632.method_37221()) {
                           this.field_44499.field_9632.field_3853.method_32415((double)var16);
                        } else if (!this.field_44499.field_9614.method_14004().method_38557()) {
                           float var17 = class_9299.method_42828(this.field_44499.field_9632.field_3876.method_4230() + var16 * 0.005F, 0.0F, 0.2F);
                           this.field_44499.field_9632.field_3876.method_4233(var17);
                        } else {
                           this.field_44499.field_9614.method_14004().method_38564((double)(-var16));
                        }
                     }
                  } else {
                     double var12 = this.field_44482
                        * (double)this.field_44499.method_8552().method_43165()
                        / (double)this.field_44499.method_8552().method_43166();
                     double var14 = this.field_44493
                        * (double)this.field_44499.method_8552().method_43177()
                        / (double)this.field_44499.method_8552().method_43163();
                     this.field_44499.field_9623.method_26945(var12, var14, var10);
                  }
               }
            }
         }
      } else {
         SigmaMainClass.method_3328().method_3299().method_31011(var3, var5);
      }
   }

   private void method_39831(long var1, List<Path> var3) {
      if (this.field_44499.field_9623 != null) {
         this.field_44499.field_9623.method_1189(var3);
      }
   }

   public void method_39837(long var1) {
      class_9732.method_44941(
         var1,
         (var1x, var3, var5) -> this.field_44499.execute(() -> this.method_39839(var1x, var3, var5)),
         (var1x, var3, var4, var5) -> this.field_44499.execute(() -> this.method_39836(var1x, var3, var4, var5)),
         (var1x, var3, var5) -> this.field_44499.execute(() -> this.method_39841(var1x, var3, var5)),
         (var1x, var3, var4) -> {
            Path[] var8 = new Path[var3];

            for (int var9 = 0; var9 < var3; var9++) {
               var8[var9] = Paths.get(GLFWDropCallback.getName(var4, var9));
            }

            this.field_44499.execute(() -> this.method_39831(var1x, Arrays.<Path>asList(var8)));
         }
      );
   }

   private void method_39839(long var1, double var3, double var5) {
      if (var1 == class_1893.method_8510().method_8552().method_43181()) {
         if (this.field_44489) {
            this.field_44482 = var3;
            this.field_44493 = var5;
            this.field_44489 = false;
         }

         class_266 var9 = this.field_44499.field_9623;
         if (var9 != null && this.field_44499.field_9610 == null) {
            double var10 = var3 * (double)this.field_44499.method_8552().method_43165() / (double)this.field_44499.method_8552().method_43166();
            double var12 = var5 * (double)this.field_44499.method_8552().method_43177() / (double)this.field_44499.method_8552().method_43163();
            class_266.method_1181(() -> var9.method_26943(var10, var12), "mouseMoved event handler", var9.getClass().getCanonicalName());
            if (this.field_44490 != -1 && this.field_44483 > 0.0) {
               double var14 = (var3 - this.field_44482)
                  * (double)this.field_44499.method_8552().method_43165()
                  / (double)this.field_44499.method_8552().method_43166();
               double var16 = (var5 - this.field_44493)
                  * (double)this.field_44499.method_8552().method_43177()
                  / (double)this.field_44499.method_8552().method_43163();
               class_266.method_1181(
                  () -> var9.method_26944(var10, var12, this.field_44490, var14, var16), "mouseDragged event handler", var9.getClass().getCanonicalName()
               );
            }
         }

         this.field_44499.method_8562().method_16056("mouse");
         if (this.method_39843() && this.field_44499.method_8558()) {
            this.field_44498 = this.field_44498 + (var3 - this.field_44482);
            this.field_44487 = this.field_44487 + (var5 - this.field_44493);
         }

         this.method_39846();
         this.field_44482 = var3;
         this.field_44493 = var5;
         this.field_44499.method_8562().method_16054();
      }
   }

   public void method_39846() {
      double var3 = class_2075.method_9684();
      double var5 = var3 - this.field_44491;
      this.field_44491 = var3;
      if (this.method_39843() && this.field_44499.method_8558()) {
         double var7 = this.field_44499.field_9577.field_45561 * 0.6F + 0.2F;
         double var9 = var7 * var7 * var7 * 8.0;
         double var11;
         double var13;
         if (!this.field_44499.field_9577.field_45499) {
            this.field_44484.method_10572();
            this.field_44495.method_10572();
            var11 = this.field_44498 * var9;
            var13 = this.field_44487 * var9;
         } else {
            double var15 = this.field_44484.method_10573(this.field_44498 * var9, var5 * var9);
            double var17 = this.field_44495.method_10573(this.field_44487 * var9, var5 * var9);
            var11 = var15;
            var13 = var17;
         }

         this.field_44498 = 0.0;
         this.field_44487 = 0.0;
         byte var19 = 1;
         if (this.field_44499.field_9577.field_45535) {
            var19 = -1;
         }

         this.field_44499.method_8531().method_40528(var11, var13);
         if (this.field_44499.field_9632 != null) {
            this.field_44499.field_9632.method_37218(var11, var13 * (double)var19);
         }
      } else {
         this.field_44498 = 0.0;
         this.field_44487 = 0.0;
      }
   }

   public boolean method_39838() {
      return this.field_44481;
   }

   public boolean method_39842() {
      return this.field_44488;
   }

   public double method_39835() {
      return this.field_44482;
   }

   public double method_39832() {
      return this.field_44493;
   }

   public void method_39833() {
      this.field_44489 = true;
   }

   public boolean method_39843() {
      return this.field_44496;
   }

   public void method_39834() {
      if (this.field_44499.method_8558() && !this.field_44496) {
         if (!class_1893.field_9574) {
            class_5916.method_27065();
         }

         this.field_44496 = true;
         this.field_44482 = (double)(this.field_44499.method_8552().method_43166() / 2);
         this.field_44493 = (double)(this.field_44499.method_8552().method_43163() / 2);
         class_9732.method_44937(this.field_44499.method_8552().method_43181(), 212995, this.field_44482, this.field_44493);
         this.field_44499.method_8609((class_266)null);
         this.field_44499.field_9582 = 10000;
         this.field_44489 = true;
      }
   }

   public void method_39844() {
      if (this.field_44496) {
         this.field_44496 = false;
         this.field_44482 = (double)(this.field_44499.method_8552().method_43166() / 2);
         this.field_44493 = (double)(this.field_44499.method_8552().method_43163() / 2);
         class_9732.method_44937(this.field_44499.method_8552().method_43181(), 212993, this.field_44482, this.field_44493);
      }
   }

   public void method_39840() {
      this.field_44489 = true;
   }
}
