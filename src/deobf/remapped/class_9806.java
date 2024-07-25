package remapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class class_9806 {
   public int field_49722 = 40;
   public int field_49721 = 20;
   public int field_49723 = 10000;
   public float field_49714 = 0.1F;
   public int field_49712 = 150;
   public class_2932 field_49715;
   private static MinecraftClient field_49724 = MinecraftClient.getInstance();
   public Vector3i field_49717;
   public class_7047 field_49713;
   public class_8670 field_49716;
   public class_1623 field_49720;
   public int field_49718 = 0;

   public float method_45230(class_8670 var1, class_7047 var2) {
      return var1.field_44468.method_32372(var2);
   }

   public List<class_8670> method_45229(class_8670 var1, class_1623 var2) {
      this.field_49716 = var1;
      this.field_49713 = var1.field_44468;
      this.field_49713.field_36387 = var1;
      boolean var5 = this.field_49713.method_32377(0.0F, 2.0F, 0.0F).method_32356();
      ArrayList var6 = new ArrayList();
      List var7 = !var2.field_8452 ? class_8104.method_36793() : class_8104.method_36791();
      Iterator var8 = var7.iterator();
      byte var9 = 8;
      byte var10 = 5;
      int var11 = var2.field_8451;
      if (!var2.field_8452) {
         while (var8.hasNext()) {
            class_8104 var42 = (class_8104)var8.next();
            this.field_49717 = var42.field_41508;
            class_7047 var13 = this.method_45223(0.0F, 1);
            class_7047 var14 = this.method_45223(1.0F, 1);
            class_7047 var15 = this.method_45223(1.0F, 0);
            class_7047 var16 = this.method_45223(0.0F, -1);
            boolean var17 = var16.method_32364();
            class_7047 var18 = this.method_45222(1.0F, 1.0F, 0);
            class_7047 var19 = this.method_45222(1.0F, 1.0F, -1);
            class_7047 var20 = this.method_45222(1.0F, 1.0F, 1);
            class_7047 var21 = this.method_45222(0.0F, 1.0F, 0);
            class_7047 var22 = this.method_45222(1.0F, 0.0F, 0);
            if (var2.field_8450) {
               class_7047 var23 = this.method_45223(0.0F, -2);
               if (var16.method_32364() && !var16.method_32357() && var23.method_32364()) {
                  var6.add(new class_8670(var16, var11, class_4748.field_23006).method_39817(var16, false));
               }
            }

            if (!var15.method_32356() && var14.method_32356() && var13.method_32356() && var17) {
               if (var15.method_32364()) {
                  class_7047 var45 = this.method_45223(1.0F, 1);
                  if (var45.method_32356()) {
                     var6.add(new class_8670(var14, var9, class_4748.field_23004));
                  }
               }
            } else {
               if (var2.field_8450) {
                  class_7047 var43 = this.method_45223(0.0F, 1);
                  class_7047 var24 = this.method_45223(0.0F, 2);
                  class_7047 var25 = this.method_45223(1.0F, 1);
                  class_7047 var26 = this.method_45223(1.0F, 0);
                  if (var17
                     && var26.method_32364()
                     && (var26.method_32364() || var25.method_32364() || var24.method_32364())
                     && !var25.method_32357()
                     && !var43.method_32357()) {
                     int var27 = (!var26.method_32364() ? 0 : 1) + (!var25.method_32364() ? 0 : 1) + (!var24.method_32364() ? 0 : 1);
                     var6.add(new class_8670(var25, var11 + var27 * 7, class_4748.field_23004).method_39817(var25, true).method_39817(var24, false));
                  }
               }

               class_7047 var44 = this.method_45223(1.0F, -1);
               if (var44.method_32364() && var15.method_32356()) {
                  byte var47 = 1;
                  if (this.field_49716.field_44476 != null
                     && this.field_49716.field_44476.field_44477 == class_4748.field_23006
                     && var42 != this.field_49716.field_44476.field_44469) {
                     var47 = 0;
                  }

                  var6.add(new class_8670(var15, var47, class_4748.field_23006, var42));
               } else {
                  if (var2.field_8450 && var17 && !var15.method_32360() && !var15.method_32356() && var44.method_32364()) {
                     var6.add(new class_8670(var15, var11, class_4748.field_23006).method_39817(var15, true));
                  }

                  if (var15.method_32356()) {
                     class_7047 var46 = this.method_45223(1.0F, -2);
                     if (var44.method_32356()) {
                        if (!var46.method_32364()) {
                           if (var46.method_32356() && var17) {
                              class_7047 var48 = this.method_45223(1.0F, -3);
                              if (!var48.method_32364()) {
                                 if (var48.method_32356() && var17) {
                                    class_7047 var50 = this.method_45223(1.0F, -4);
                                    if (var50.method_32364()) {
                                       var6.add(new class_8670(var48, var10));
                                    }
                                 }
                              } else {
                                 var6.add(new class_8670(var46, var10));
                              }
                           }
                        } else {
                           var6.add(new class_8670(var44, var10));
                        }
                     }

                     class_7047 var49 = this.method_45223(1.0F, 2);
                     class_7047 var51 = this.method_45223(2.0F, 2);
                     class_7047 var52 = this.method_45223(2.0F, 1);
                     class_7047 var28 = this.method_45223(2.0F, 0);
                     class_7047 var29 = this.method_45223(2.0F, -1);
                     class_7047 var30 = this.method_45223(2.0F, -2);
                     boolean var31 = false;
                     if (var52.method_32356() && var28.method_32356() && var29.method_32356() && var30.method_32364()) {
                        var31 = true;
                        var6.add(new class_8670(var29, var10));
                     }

                     boolean var32 = false;
                     if (var46.method_32356()) {
                        class_7047 var33 = this.method_45223(2.0F, -3);
                        if (var28.method_32356() && var29.method_32356() && var30.method_32356() && var33.method_32364()) {
                           var32 = true;
                           var6.add(new class_8670(var30, var10));
                        }

                        class_7047 var34 = this.method_45223(2.0F, -4);
                        if (var29.method_32356() && var30.method_32356() && var33.method_32356() && var34.method_32364()) {
                           var6.add(new class_8670(var33, var10));
                        }
                     }

                     boolean var53 = var5 && var49.method_32356() && var51.method_32356();
                     if (var53 && var52.method_32356() && var28.method_32364() && var17) {
                        var6.add(new class_8670(var52, var9, class_4748.field_23004));
                     }

                     boolean var54 = var53 && var28.method_32356() && var52.method_32356();
                     if (var54 && var29.method_32364() && var17) {
                        var6.add(new class_8670(var28, var9, class_4748.field_23004));
                        var54 = false;
                     }

                     if (var54 && var17) {
                        class_7047 var35 = this.method_45223(3.0F, 1);
                        class_7047 var36 = this.method_45223(3.0F, 0);
                        class_7047 var37 = this.method_45223(3.0F, -1);
                        if (var36.method_32364() && var35.method_32356()) {
                           var6.add(new class_8670(var35, var9 + 2, class_4748.field_23008));
                           continue;
                        }

                        if (var35.method_32356() && var36.method_32356() && var37.method_32364()) {
                           var6.add(new class_8670(var36, var9 + 4, class_4748.field_23008));
                           continue;
                        }

                        class_7047 var38 = this.method_45223(3.0F, -2);
                        if (!var31 && var36.method_32356() && var37.method_32356() && var38.method_32364()) {
                           var6.add(new class_8670(var37, var9 + 4, class_4748.field_23008));
                           continue;
                        }

                        class_7047 var39 = this.method_45223(3.0F, -3);
                        if (!var32 && var37.method_32356() && var38.method_32356() && var39.method_32364()) {
                           var6.add(new class_8670(var38, var9 + 4, class_4748.field_23008));
                           continue;
                        }

                        class_7047 var40 = this.method_45223(4.0F, 0);
                        class_7047 var41 = this.method_45223(4.0F, -1);
                        if (this.method_45223(3.0F, 1).method_32378() && var41.method_32364() && var40.method_32356()) {
                           var6.add(new class_8670(var40, var9 + 2, class_4748.field_23008));
                        }
                     }

                     if (var2.field_8455 && !var44.method_32364() && var15.method_32356()) {
                        var6.add(new class_8670(var15, 60, class_4748.field_23009, var42).method_39816(var44));
                     }
                  }
               }
            }
         }
      } else {
         while (var8.hasNext()) {
            this.field_49717 = ((class_8104)var8.next()).field_41508;
            class_7047 var12 = this.method_45223(1.0F, this.field_49717.method_12165());
            if (var12.method_32356()) {
               var6.add(new class_8670(var12, Math.abs(this.field_49717.method_12165())));
            }
         }
      }

      return var6;
   }

   private class_7047 method_45223(float var1, int var2) {
      return this.field_49713.method_32377((float)this.field_49717.getX() * var1, (float)var2, (float)this.field_49717.method_12185() * var1);
   }

   private class_7047 method_45222(float var1, float var2, int var3) {
      class_7047 var6 = this.field_49713
         .method_32377((float)this.field_49717.getX() * var1, (float)var3, (float)this.field_49717.method_12185() * var1);
      if (this.field_49717.getX() > 0) {
         var6 = var6.method_32377(0.0F, 0.0F, -var2);
      }

      if (this.field_49717.method_12185() > 0) {
         var6 = var6.method_32377(var2, 0.0F, 0.0F);
      }

      if (this.field_49717.getX() < 0) {
         var6 = var6.method_32377(0.0F, 0.0F, var2);
      }

      if (this.field_49717.method_12185() < 0) {
         var6 = var6.method_32377(-var2, 0.0F, 0.0F);
      }

      return var6;
   }

   public List<class_8670> method_45226(class_1623 var1) throws Exception {
      HashSet var4 = new HashSet();
      HashSet var5 = new HashSet();
      this.field_49720 = var1;
      this.field_49715 = var1.field_8457;
      int var6 = var1.field_8451;
      var1.field_8454.field_44473 = (float)this.field_49715.method_13436(var1.field_8454.field_44468);
      var1.field_8454.field_44479 = var1.field_8454.field_44473;
      var4.add(var1.field_8454);
      this.field_49718 = 0;
      short var7 = 7000;
      class_8670 var8 = null;

      while (true) {
         var8 = null;
         if (this.field_49718 > var1.field_8448) {
            throw new RuntimeException("canceled");
         }

         if (Thread.interrupted()) {
            throw new RuntimeException("canceled");
         }

         if (var4.size() == 0) {
            throw new RuntimeException("no route");
         }

         for (class_8670 var10 : var4) {
            if (var10.field_44472.size() == 0) {
               var8 = var10;
               break;
            }
         }

         for (class_8670 var17 : var4) {
            if (var8 == null || var17.field_44479 < var8.field_44479 && (this.field_49718 > var17.field_44474 || var17.field_44472.size() == 0)) {
               var8 = var17;
            }
         }

         if (var8.field_44472.size() <= 0) {
            var8.field_44474 = this.field_49718 + 2500;
         } else {
            var8.field_44474 = this.field_49718;

            for (class_8670 var18 : var4) {
               if (var18.field_44479 < var8.field_44479) {
                  var8 = var18;
               }
            }
         }

         if (this.field_49715.method_13435(var8.field_44468)) {
            ArrayList var16;
            for (var16 = new ArrayList(); var8 != null && var8.field_44476 != null; var8 = var8.field_44476) {
               var16.add(var8);
            }

            var16.add(var1.field_8454);
            if (!var1.field_8453) {
               return var16;
            }

            return method_45225(var16);
         }

         var4.remove(var8);
         var5.add(var8);

         for (class_8670 var19 : this.method_45229(var8, var1)) {
            if (var19 != null) {
               int var11 = var8.field_44480 + var19.field_44471;
               if (!var4.contains(var19) && !var5.contains(var19)) {
                  var19.field_44480 = var11;
                  var19.field_44473 = (float)(this.field_49715.method_13436(var19.field_44468) * 0.95F);
                  var19.field_44479 = (float)var19.field_44480 + var19.field_44473;
                  var19.field_44476 = var8;
                  var19.field_44466.addAll(var8.field_44466);
                  var19.field_44470.addAll(var8.field_44470);
                  var19.field_44474 = var8.field_44474;
                  var4.add(var19);
               }
            }
         }

         this.field_49718++;
      }
   }

   public static List<class_8670> method_45225(List<class_8670> var0) {
      int var3 = 0;
      byte var4 = 6;
      byte var5 = 2;
      class_8670 var6 = null;
      class_8670 var7 = null;
      ArrayList var8 = new ArrayList();

      for (int var9 = 0; var9 < var0.size(); var9++) {
         class_8670 var10 = (class_8670)var0.get(var9);
         class_4748 var11 = class_4748.field_23006;
         if (var9 + 1 < var0.size()) {
            var11 = ((class_8670)var0.get(var9)).field_44477;
         }

         if (var3 != 0 && var3 != var0.size() - 1) {
            boolean var12 = true;
            if (var7.field_44477 == var10.field_44477
               && (var11 == class_4748.field_23006 || var11 == class_4748.field_23009 || var10.field_44477 == class_4748.field_23007)) {
               if (var10.field_44477 == class_4748.field_23006 && var10.field_44468.method_32376(var7.field_44468) <= (double)(var4 * var4)) {
                  double var13 = Math.min(var7.field_44468.method_32381(), var10.field_44468.method_32381());
                  double var15 = Math.min(var7.field_44468.method_32375(), var10.field_44468.method_32375());
                  double var17 = Math.min(var7.field_44468.method_32382(), var10.field_44468.method_32382());
                  double var19 = Math.max(var7.field_44468.method_32381(), var10.field_44468.method_32381());
                  double var21 = Math.max(var7.field_44468.method_32375(), var10.field_44468.method_32375());
                  double var23 = Math.max(var7.field_44468.method_32382(), var10.field_44468.method_32382());

                  label83:
                  for (int var25 = (int)var13; (double)var25 <= var19; var25++) {
                     for (int var26 = (int)var15; (double)var26 <= var21; var26++) {
                        for (int var27 = (int)var17; (double)var27 <= var23; var27++) {
                           if (!new class_7047((double)var25, (double)var26, (double)var27, var10).method_32380()) {
                              var12 = false;
                              break label83;
                           }
                        }
                     }
                  }
               } else {
                  var12 = false;
               }
            } else {
               var12 = false;
            }

            if (!var12) {
               var8.add(var6);
               var7 = var6;
            }
         } else {
            if (var6 != null) {
               var8.add(var6);
            }

            var8.add(var10);
            var7 = var10;
         }

         var6 = var10;
         var3++;
      }

      return var8;
   }

   public static List<class_7047> method_45221(List<class_8670> var0) {
      int var3 = 0;
      byte var4 = 5;
      class_7047 var5 = null;
      class_7047 var6 = null;
      ArrayList var7 = new ArrayList();

      for (class_8670 var9 : var0) {
         if (var3 != 0 && var3 != var0.size() - 1) {
            boolean var10 = true;
            if (!(var9.field_44468.method_32376(var6) > (double)(var4 * var4))) {
               double var11 = Math.min(var6.method_32381(), var9.field_44468.method_32381());
               double var13 = Math.min(var6.method_32375(), var9.field_44468.method_32375());
               double var15 = Math.min(var6.method_32382(), var9.field_44468.method_32382());
               double var17 = Math.max(var6.method_32381(), var9.field_44468.method_32381());
               double var19 = Math.max(var6.method_32375(), var9.field_44468.method_32375());
               double var21 = Math.max(var6.method_32382(), var9.field_44468.method_32382());

               label62:
               for (int var23 = (int)var11; (double)var23 <= var17; var23++) {
                  for (int var24 = (int)var13; (double)var24 <= var19; var24++) {
                     for (int var25 = (int)var15; (double)var25 <= var21; var25++) {
                        if (!class_6306.method_28766(var23, var24, var25, false)) {
                           var10 = false;
                           break label62;
                        }
                     }
                  }
               }
            } else {
               var10 = false;
            }

            if (!var10) {
               var7.add(var5.method_32359(0.5, 0.0, 0.5));
               var6 = var5;
            }
         } else {
            if (var5 != null) {
               var7.add(var5.method_32359(0.5, 0.0, 0.5));
            }

            var7.add(var9.field_44468.method_32359(0.5, 0.0, 0.5));
            var6 = var9.field_44468;
         }

         var5 = var9.field_44468;
         var3++;
      }

      return var7;
   }

   public static double method_45228(BlockPos var0, BlockPos var1) {
      double var4 = (double)var0.getX() - (double)var1.getX();
      double var6 = (double)var0.method_12185() - (double)var1.method_12185();
      return Math.sqrt(var4 * var6);
   }

   public static double method_45224(BlockPos var0, BlockPos var1, BlockPos var2) {
      if (var1.field_13231 == var2.field_13231 && var1.field_13229 == var2.field_13229) {
         return method_45228(var0, var1);
      } else {
         double var5 = (double)(
            (var2.field_13231 - var1.field_13231) * (var2.field_13231 - var1.field_13231)
               + (var2.field_13229 - var1.field_13229) * (var2.field_13229 - var1.field_13229)
         );
         double var7 = (double)(
               (var0.field_13231 - var1.field_13231) * (var2.field_13231 - var1.field_13231)
                  + (var0.field_13229 - var1.field_13229) * (var2.field_13229 - var1.field_13229)
            )
            / var5;
         if (!(var7 <= 0.0)) {
            if (!(var7 >= 1.0)) {
               double var9 = (double)(
                     (var1.field_13229 - var0.field_13229) * (var2.field_13231 - var1.field_13231)
                        - (var1.field_13231 - var0.field_13231) * (var2.field_13229 - var1.field_13229)
                  )
                  / var5;
               return Math.abs(var9) * Math.sqrt(var5);
            } else {
               return method_45228(var0, var2);
            }
         } else {
            return method_45228(var0, var1);
         }
      }
   }
}
