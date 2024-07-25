package remapped;

import java.util.ArrayList;

public class class_9782 {
   public class_3223 field_49649;
   public int field_49646;
   public class_8145 field_49648;
   public class_1893 field_49645 = class_1893.method_8510();

   public class_9782() {
      this.field_49649 = new class_3223();
      SigmaMainClass.method_3328().method_3302().method_7908(this);
   }

   @class_9148
   @class_3932
   public void method_45154(class_1393 var1) {
      if (this.field_49648 != null) {
         if (this.field_49646 != 1) {
            if (this.field_49646 == 2) {
               boolean var4 = class_314.method_1387();
               if (var4) {
                  class_964 var5 = new class_964();
                  var5.field_4942 = true;
                  class_8145 var6 = null;

                  for (class_8145 var8 : class_314.method_1440()) {
                     if (var8 instanceof class_704
                        && var8 != this.field_49645.field_9632
                        && (var6 == null || var6.method_37175(this.field_49645.field_9632) > var8.method_37175(this.field_49645.field_9632))) {
                        var6 = var8;
                     }
                  }

                  this.field_49645.method_8614().method_4813(new class_3835(0, (short)-1, false));
                  this.field_49645.method_8614().method_4813(new class_9808(var5));
                  if (var6 != null) {
                     this.field_49645.method_8614().method_4813(new class_6404(var6.method_37328()));
                  }

                  this.field_49645.method_8614().method_4813(new class_758(0.98F, 0.98F, false, false));
               }

               Thread var9 = new Thread(
                  () -> {
                     try {
                        class_4714 var4x = new class_4714(this.field_49648.method_37302(), this.field_49648.method_37309(), this.field_49648.method_37156());
                        class_4714 var5x = new class_4714(
                           this.field_49645.field_9632.method_37302(), this.field_49645.field_9632.method_37309(), this.field_49645.field_9632.method_37156()
                        );
                        ArrayList var6x = class_6306.method_28770(var5x, var4x);
                        SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Teleport", "Successfully teleported !"));
                        class_8145 var7 = this.field_49645.field_9632.method_37243();

                        for (class_4714 var9x : var6x) {
                           if (var7 != null) {
                              var7.field_41736.field_7336 = var9x.method_21803() + 0.5;
                              var7.field_41736.field_7333 = var9x.method_21801();
                              var7.field_41736.field_7334 = var9x.method_21799() + 0.5;
                              this.field_49645.method_8614().method_4813(new class_8125(false, false));
                              this.field_49645
                                 .method_8614()
                                 .method_4813(new class_3616(this.field_49645.field_9632.field_41701, this.field_49645.field_9632.field_41755, false));
                              this.field_49645.method_8614().method_4813(new class_758(0.0F, 1.0F, false, false));
                              class_9149 var10 = new class_9149(
                                 this.field_49645.field_9601, var9x.method_21803() + 0.5, var9x.method_21801(), var9x.method_21799() + 0.5
                              );
                              var10.field_41701 = var7.field_41701;
                              var10.field_41755 = var7.field_41755;
                              this.field_49645.method_8614().method_4813(new class_4148(var10));
                           } else if (var4) {
                              this.field_49645
                                 .method_8614()
                                 .method_4813(new class_9515(var9x.method_21803(), var9x.method_21801(), var9x.method_21799(), false));
                           } else {
                              this.field_49645
                                 .method_8614()
                                 .method_4813(new class_9515(var9x.method_21803(), var9x.method_21801(), var9x.method_21799(), true));
                           }
                        }

                        if (var4) {
                           this.field_49645.method_8614().method_4813(new class_9515(var4x.field_22878, var4x.field_22880, var4x.field_22879, false));
                        }

                        this.field_49645.field_9632.method_37256(var4x.field_22878, var4x.field_22880, var4x.field_22879);
                        this.field_49648 = null;
                        if (var4) {
                           class_964 var12 = new class_964();
                           var12.field_4942 = false;
                           this.field_49645.method_8614().method_4813(new class_9808(var12));
                        }
                     } catch (Exception var11) {
                        var11.printStackTrace();
                     }
                  }
               );
               var9.start();
               this.field_49646 = 0;
            }
         } else {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   @class_3932
   public void method_45152(class_7767 var1) {
      if (this.field_49646 == 1) {
         var1.method_35232(0.0);
         var1.method_35235(0.0);
         var1.method_35229(0.0);
         if (this.field_49648 == null || !this.field_49648.method_37330() || !class_314.method_1440().contains(this.field_49648)) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Teleport", "Target lost"));
            this.field_49646 = 0;
            this.field_49648 = null;
         } else if (!this.field_49645.field_9632.method_37252()) {
            double var4 = this.field_49648.method_37309() - this.field_49648.field_41713;
            if (var4 < -2.0 && class_314.method_1432(this.field_49648) && this.field_49648.method_37309() - this.field_49645.field_9632.method_37309() < -10.0) {
               this.field_49646 = 0;
               this.field_49648 = null;
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Teleport", "Target seems to be falling in void"));
            }
         } else {
            this.field_49646 = 0;
            this.field_49648 = null;
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Teleport", "Teleport canceled"));
         }

         if (this.field_49649.method_14772() > 7000L) {
            this.field_49646 = 0;
            this.field_49648 = null;
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Teleport", "Failed teleport !"));
         }
      }
   }

   @class_9148
   @class_3932
   public void method_45155(class_139 var1) {
      if (this.field_49646 == 1) {
         if (var1.method_557() instanceof class_509) {
            this.field_49646 = 2;
         }
      }
   }
}
