package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class class_1857 {
   private static String[] field_9423;
   public MinecraftClient field_9415 = MinecraftClient.getInstance();
   public List<class_1331> field_9420 = new ArrayList<class_1331>();
   public static List<class_8145> field_9416 = new ArrayList<class_8145>();
   public static int field_9414 = 0;
   public final class_6590 field_9417;
   public class_6248 field_9421;
   private UUID field_9419;
   public boolean field_9418 = false;
   public boolean field_9422;

   public class_1857() {
      this.field_9417 = new class_6590(this);
   }

   public void method_8226() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      new class_3347(null);
   }

   @class_9148
   public void method_8230(class_4996 var1) {
      if (class_3347.method_15349() == class_412.field_1747.method_2055()) {
         if (this.field_9415.field_9632.method_26613() <= 1) {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   public void method_8222(class_6435 var1) {
      if (var1.method_29384() == this.field_9415.field_9577.field_45575.field_30027.method_16988()
         && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
         this.field_9415.method_8614().method_4813(new class_8559(class_2105.field_10551));
      }

      if (class_3347.method_15349() == class_412.field_1747.method_2055()
         && var1.method_29384() == 258
         && this.field_9421 != null
         && this.field_9415.field_9623 instanceof class_5766) {
         this.field_9415.method_8614().method_9091().method_23481(this.field_9421);
         this.field_9421 = null;
      }
   }

   @class_9148
   @class_5355
   public void method_8229(class_717 var1) {
      field_9414 = 0;
      this.field_9417.method_30353();
   }

   @class_9148
   @class_5355
   public void method_8232(class_3278 var1) {
      if (this.field_9415.field_9632 != null
         && this.field_9415.field_9632.method_37102() == class_7653.field_38888
         && (class_3347.method_15349() < class_412.field_1751.method_2055() || class_314.method_1387())) {
         this.field_9415.field_9632.method_37356(class_7653.field_38885);
      }
   }

   @class_9148
   @class_5355
   public void method_8224(class_5243 var1) {
      if (this.field_9415.field_9601 != null && this.field_9415.field_9632 != null) {
         class_6414 var4 = this.field_9415.field_9601.method_28262(var1.method_23989()).method_8360();
         if (class_3347.method_15349() == class_412.field_1747.method_2055() && var4 instanceof class_402) {
            class_4190 var5 = class_3370.method_15522(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            var1.method_23986(var5);
         }

         if (class_3347.method_15349() == class_412.field_1747.method_2055()) {
            if (this.field_9415.field_9632.field_41712.field_19939 - this.field_9415.field_9632.field_41712.field_19937 == 1.5) {
               this.field_9415.field_9632.field_41712 = this.field_9415.field_9632.field_41712.method_18928(0.0, 0.29999995F, 0.0);
            }

            if (this.field_9415.field_9632.field_41710 == 1.27F) {
               this.field_9415.field_9632.field_41710 = 1.38F;
            }
         }
      }
   }

   @class_9148
   @class_5355
   public void method_8225(class_5596 var1) {
      if (this.method_8231()) {
         int var4 = field_9416.size();

         for (int var5 = 0; var5 < var4; var5++) {
            class_8145 var6 = field_9416.get(var5);
            if (!class_314.method_1440().contains(var6)) {
               field_9416.remove(var6);
               var4--;
               var5--;
            } else {
               Iterator var7 = var6.method_37294().iterator();
               boolean var8 = false;

               while (var7.hasNext()) {
                  class_6098 var9 = (class_6098)var7.next();
                  if (var9.method_27960() instanceof class_2235) {
                     var8 = true;
                  }
               }

               if (!var8) {
                  field_9416.remove(var6);
                  var4--;
                  var5--;
               }
            }
         }

         try {
            this.field_9417.method_30351();
         } catch (ConcurrentModificationException var10) {
         }

         this.field_9417.method_30349();

         for (int var11 = -5; var11 < 5; var11++) {
            for (int var12 = -5; var12 < 5; var12++) {
               class_2654 var13 = this.field_9415
                  .field_9601
                  .method_29554(this.field_9415.field_9632.field_41742 + var11, this.field_9415.field_9632.field_41714 + var12);
               if (var13 instanceof class_8526) {
                  int var10001 = this.field_9415.field_9632.field_41742 + var11;
                  int var14 = this.field_9415.field_9601.method_745().field_27356.method_27420(var10001, this.field_9415.field_9632.field_41714 + var12);
                  class_2654 var15 = new class_2654(
                     this.field_9415.field_9601,
                     new class_2034(this.field_9415.field_9632.field_41742 + var11, this.field_9415.field_9632.field_41714 + var12),
                     var13.method_27356()
                  );
                  this.field_9415.field_9601.method_745().field_27356.method_27423(var14, var15);
               }
            }
         }
      }
   }

   @class_9148
   public void method_8228(class_2157 var1) {
      if (var1.method_10047() instanceof class_7371) {
         int var4 = ((class_7371)var1.method_10047()).method_33575();
         if (class_7051.method_32417(var4)) {
            field_9414 = var4;
         }
      }

      if (var1.method_10047() instanceof class_6248) {
         if (((class_6248)var1.method_10047()).method_28521().length() == 1) {
            return;
         }

         this.field_9421 = (class_6248)var1.method_10047();
         var1.method_29715(true);
      }
   }

   @class_9148
   @class_5355
   public void method_8221(class_139 var1) {
      if (!SigmaMainClass.method_3328().method_3298().method_847(class_2016.class).method_42015() && class_3347.method_15349() != class_412.field_1747.method_2055()
         )
       {
         if (!field_9416.isEmpty()) {
            field_9416.clear();
         }
      } else if (var1.method_557() instanceof class_9014) {
         class_9014 var4 = (class_9014)var1.method_557();

         for (Pair var6 : var4.method_41363()) {
            if (var6.getFirst() == class_6943.field_35701
               && var6.getSecond() != null
               && (
                  SigmaMainClass.method_3328().method_3298().method_847(class_2016.class).method_42015()
                     || class_3347.method_15349() == class_412.field_1747.method_2055()
               )) {
               if (!(((class_6098)var6.getSecond()).method_27960() instanceof class_8440)) {
                  class_8145 var7 = this.field_9415.field_9601.method_29534(var4.method_41364());
                  if (field_9416.contains(var7)) {
                     field_9416.remove(var7);
                  }
               } else {
                  class_8145 var14 = this.field_9415.field_9601.method_29534(var4.method_41364());
                  if (!field_9416.contains(var14) && !class_314.method_1381()) {
                     field_9416.add(var14);
                  }

                  var1.method_29715(true);
               }
            }
         }
      }

      if (this.method_8231()) {
         class_6394.method_29195(var1, this.field_9417);
         if (!(var1.method_557() instanceof class_4020)) {
            if (var1.method_557() instanceof class_2972 && class_314.method_1384()) {
               var1.method_29715(true);
            } else if (!(var1.method_557() instanceof class_8329)) {
               if (var1.method_557() instanceof class_8849 && this.field_9415.field_9632 != null) {
                  class_8849 var10 = (class_8849)var1.method_557();
               } else if (!(var1.method_557() instanceof class_3767)) {
                  if (var1.method_557() instanceof class_9889) {
                     class_9889 var8 = (class_9889)var1.method_557();
                     if (var8.method_45557() != class_8891.field_45606) {
                        if (this.field_9419 != null && var8.method_45557() == class_8891.field_45607) {
                           if (this.field_9419.compareTo(var8.method_45554()) != 0) {
                              var1.method_29715(true);
                           } else {
                              this.field_9419 = null;
                           }
                        } else if (this.field_9419 != null && this.field_9419.compareTo(var8.method_45554()) != 0) {
                           var1.method_29715(true);
                        }
                     } else if (this.field_9419 != null) {
                        var1.method_29715(true);
                     } else {
                        this.field_9419 = var8.method_45554();
                     }
                  }
               } else {
                  class_3767 var9 = (class_3767)var1.method_557();
               }
            } else {
               class_8329 var11 = (class_8329)var1.method_557();
               class_8145 var13 = this.field_9415.field_9601.method_29534(var11.method_38366());
               if (var13 != null && var11.method_38365() == 3 && class_3347.method_15349() == class_412.field_1747.method_2055()) {
                  var1.method_29715(true);
               }
            }
         } else {
            int var12 = ((class_4020)var1.method_557()).method_18514();
            if (class_7051.method_32417(var12)) {
               field_9414 = var12;
            }
         }
      }
   }

   @class_9148
   @class_5355
   public void method_8223(class_7767 var1) {
      if (class_3347.method_15349() < class_412.field_1751.method_2055() || class_314.method_1387()) {
         if (this.field_9415.field_9632.method_37285()) {
            this.field_9418 = true;
            double var4 = this.field_9415.field_9632.method_37309();
            float var6 = class_7194.method_32937();
            float var7 = 0.02F;
            float var8 = (float)class_2931.method_13417(this.field_9415.field_9632);
            if (var8 > 3.0F) {
               var8 = 3.0F;
            }

            if (!this.field_9415.field_9632.field_41726) {
               var8 *= 0.5F;
            }

            if (var8 > 0.0F) {
               var6 += (0.54600006F - var6) * var8 / 3.0F;
               var7 += (this.field_9415.field_9632.method_26423() - var7) * var8 / 3.0F;
            }

            if (!this.field_9415.field_9577.field_45444.method_27060()) {
               if (this.field_9415.field_9632.field_29676 == 0.0F && this.field_9415.field_9632.field_29673 == 0.0F) {
                  this.field_9415.field_9632.method_37140(false);
               }
            } else {
               this.field_9415.field_9632.method_37140(true);
            }

            var7 *= !this.field_9415.field_9632.method_37321() ? 1.0F : (!this.field_9415.field_9632.field_41726 ? 1.3F : 1.5F);
            class_7194.method_32939(
               this.field_9415.field_9632.field_29676, this.field_9415.field_9632.field_29651, this.field_9415.field_9632.field_29673, var7
            );
            class_7194.method_32942(class_7194.field_36984, class_7194.field_36992, class_7194.field_36985);
            class_7194.field_36984 *= (double)var6;
            class_7194.field_36992 *= 0.8F;
            class_7194.field_36985 *= (double)var6;
            if (!this.field_9415.field_9632.method_37078()) {
               class_7194.field_36992 -= 0.02;
            }

            if (this.field_9415.field_9632.field_41744
               && this.field_9415
                  .field_9632
                  .method_37159(
                     class_7194.field_36984, class_7194.field_36992 + 0.6F - this.field_9415.field_9632.method_37309() + var4, class_7194.field_36985
                  )) {
               class_7194.field_36992 = 0.3F;
            }

            if (this.field_9415.field_9632.field_29654) {
               class_7194.method_32941();
            }

            var1.method_35232(class_7194.field_36984);
            var1.method_35235(class_7194.field_36992);
            var1.method_35229(class_7194.field_36985);
         } else {
            class_7194.field_36992 = this.field_9415.field_9632.method_37098().field_7333;
            if (this.field_9418 && class_7194.method_32943()) {
               class_7194.field_36992 = 0.2F;
               class_314.method_1408(class_7194.field_36992);
            }

            class_7194.field_36984 = this.field_9415.field_9632.method_37098().field_7336;
            class_7194.field_36985 = this.field_9415.field_9632.method_37098().field_7334;
            this.field_9418 = false;
         }
      }

      if (class_3347.method_15349() == class_412.field_1747.method_2055()) {
         if (Math.abs(var1.method_35234()) < 0.005) {
            var1.method_35232(0.0);
            class_314.method_1463(var1.method_35234());
         }

         if (Math.abs(var1.method_35236()) < 0.005) {
            var1.method_35235(0.0);
            class_314.method_1408(var1.method_35236());
         }

         if (Math.abs(var1.method_35231()) < 0.005) {
            var1.method_35229(0.0);
            class_314.method_1405(var1.method_35231());
         }
      }
   }

   public boolean method_8231() {
      return class_3347.method_15349() <= class_412.field_1728.method_2055();
   }

   @class_9148
   @class_5355
   public void method_8233(class_5278 var1) {
      if (var1.method_24098() == this.field_9415.field_9632 || var1.method_24098() == class_9598.field_48917 || var1.method_24098() == class_5477.field_27898) {
         if (var1.method_24094() != 1.0F) {
            if (class_1393.field_7595 - this.field_9415.field_9632.field_29618 == 0.0F) {
               if (this.field_9422) {
                  var1.method_24096(class_9299.method_42837(var1.method_24094(), class_1393.field_7593, var1.method_24098().field_29605));
                  var1.method_24090(class_9299.method_42837(var1.method_24094(), class_1393.field_7593, var1.method_24098().field_29618));
                  var1.method_24086(class_9299.method_42795(var1.method_24094(), class_1393.field_7602, var1.method_24098().field_41755));
                  var1.method_24099(var1.method_24092() - var1.method_24091());
                  var1.method_24098().field_41762 = class_1393.field_7602;
                  var1.method_24098().field_41711 = class_1393.field_7593;
                  var1.method_24098().field_29657 = class_1393.field_7593;
                  var1.method_24098().field_29611 = class_1393.field_7593;
                  this.field_9422 = !this.field_9422;
               }
            } else {
               var1.method_24096(class_9299.method_42837(var1.method_24094(), class_1393.field_7593, class_1393.field_7595));
               var1.method_24090(class_9299.method_42837(var1.method_24094(), class_1393.field_7593, class_1393.field_7595));
               var1.method_24086(class_9299.method_42795(var1.method_24094(), class_1393.field_7602, class_1393.field_7605));
               var1.method_24099(var1.method_24092() - var1.method_24091());
               this.field_9422 = true;
            }
         }
      }
   }
}
