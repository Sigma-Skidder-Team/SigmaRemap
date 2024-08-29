package mapped;

import java.util.*;

public class Class9823 {
   public int field45889 = 40;
   public int field45890 = 20;
   public int field45891 = 10000;
   public float field45892 = 0.1F;
   public int field45893 = 150;
   public Class7859 field45894;
   private static Minecraft field45895 = Minecraft.getInstance();
   public Class1998 field45896;
   public Class9110 field45897;
   public Class9510 field45898;
   public Class7267 field45899;
   public int field45900 = 0;

   public float method38772(Class9510 var1, Class9110 var2) {
      return var1.field44271.method33975(var2);
   }

   public List<Class9510> method38773(Class9510 var1, Class7267 var2) {
      this.field45898 = var1;
      this.field45897 = var1.field44271;
      this.field45897.field41869 = var1;
      boolean var5 = this.field45897.method33977(0.0F, 2.0F, 0.0F).method33980();
      ArrayList var6 = new ArrayList();
      List var7 = !var2.field31171 ? Class2285.method9023() : Class2285.method9022();
      Iterator var8 = var7.iterator();
      int var9 = 8;
      int var10 = 5;
      int var11 = var2.field31176;
      if (!var2.field31171) {
         while (var8.hasNext()) {
            Class2285 var42 = (Class2285)var8.next();
            this.field45896 = var42.field15129;
            Class9110 var13 = this.method38774(0.0F, 1);
            Class9110 var14 = this.method38774(1.0F, 1);
            Class9110 var15 = this.method38774(1.0F, 0);
            Class9110 var16 = this.method38774(0.0F, -1);
            boolean var17 = var16.method33989();
            Class9110 var18 = this.method38775(1.0F, 1.0F, 0);
            Class9110 var19 = this.method38775(1.0F, 1.0F, -1);
            Class9110 var20 = this.method38775(1.0F, 1.0F, 1);
            Class9110 var21 = this.method38775(0.0F, 1.0F, 0);
            Class9110 var22 = this.method38775(1.0F, 0.0F, 0);
            if (var2.field31173) {
               Class9110 var23 = this.method38774(0.0F, -2);
               if (var16.method33989() && !var16.method33987() && var23.method33989()) {
                  var6.add(new Class9510(var16, var11, Class2317.field15873).method36727(var16, false));
               }
            }

            if (!var15.method33980() && var14.method33980() && var13.method33980() && var17) {
               if (var15.method33989()) {
                  Class9110 var45 = this.method38774(1.0F, 1);
                  if (var45.method33980()) {
                     var6.add(new Class9510(var14, var9, Class2317.field15874));
                  }
               }
            } else {
               if (var2.field31173) {
                  Class9110 var43 = this.method38774(0.0F, 1);
                  Class9110 var24 = this.method38774(0.0F, 2);
                  Class9110 var25 = this.method38774(1.0F, 1);
                  Class9110 var26 = this.method38774(1.0F, 0);
                  if (var17
                     && var26.method33989()
                     && (var26.method33989() || var25.method33989() || var24.method33989())
                     && !var25.method33987()
                     && !var43.method33987()) {
                     int var27 = (!var26.method33989() ? 0 : 1) + (!var25.method33989() ? 0 : 1) + (!var24.method33989() ? 0 : 1);
                     var6.add(new Class9510(var25, var11 + var27 * 7, Class2317.field15874).method36727(var25, true).method36727(var24, false));
                  }
               }

               Class9110 var44 = this.method38774(1.0F, -1);
               if (var44.method33989() && var15.method33980()) {
                  int var47 = 1;
                  if (this.field45898.field44278 != null
                     && this.field45898.field44278.field44279 == Class2317.field15873
                     && var42 != this.field45898.field44278.field44280) {
                     var47 = 0;
                  }

                  var6.add(new Class9510(var15, var47, Class2317.field15873, var42));
               } else {
                  if (var2.field31173 && var17 && !var15.method33986() && !var15.method33980() && var44.method33989()) {
                     var6.add(new Class9510(var15, var11, Class2317.field15873).method36727(var15, true));
                  }

                  if (var15.method33980()) {
                     Class9110 var46 = this.method38774(1.0F, -2);
                     if (var44.method33980()) {
                        if (!var46.method33989()) {
                           if (var46.method33980() && var17) {
                              Class9110 var48 = this.method38774(1.0F, -3);
                              if (!var48.method33989()) {
                                 if (var48.method33980() && var17) {
                                    Class9110 var50 = this.method38774(1.0F, -4);
                                    if (var50.method33989()) {
                                       var6.add(new Class9510(var48, var10));
                                    }
                                 }
                              } else {
                                 var6.add(new Class9510(var46, var10));
                              }
                           }
                        } else {
                           var6.add(new Class9510(var44, var10));
                        }
                     }

                     Class9110 var49 = this.method38774(1.0F, 2);
                     Class9110 var51 = this.method38774(2.0F, 2);
                     Class9110 var52 = this.method38774(2.0F, 1);
                     Class9110 var28 = this.method38774(2.0F, 0);
                     Class9110 var29 = this.method38774(2.0F, -1);
                     Class9110 var30 = this.method38774(2.0F, -2);
                     boolean var31 = false;
                     if (var52.method33980() && var28.method33980() && var29.method33980() && var30.method33989()) {
                        var31 = true;
                        var6.add(new Class9510(var29, var10));
                     }

                     boolean var32 = false;
                     if (var46.method33980()) {
                        Class9110 var33 = this.method38774(2.0F, -3);
                        if (var28.method33980() && var29.method33980() && var30.method33980() && var33.method33989()) {
                           var32 = true;
                           var6.add(new Class9510(var30, var10));
                        }

                        Class9110 var34 = this.method38774(2.0F, -4);
                        if (var29.method33980() && var30.method33980() && var33.method33980() && var34.method33989()) {
                           var6.add(new Class9510(var33, var10));
                        }
                     }

                     boolean var53 = var5 && var49.method33980() && var51.method33980();
                     if (var53 && var52.method33980() && var28.method33989() && var17) {
                        var6.add(new Class9510(var52, var9, Class2317.field15874));
                     }

                     boolean var54 = var53 && var28.method33980() && var52.method33980();
                     if (var54 && var29.method33989() && var17) {
                        var6.add(new Class9510(var28, var9, Class2317.field15874));
                        var54 = false;
                     }

                     if (var54 && var17) {
                        Class9110 var35 = this.method38774(3.0F, 1);
                        Class9110 var36 = this.method38774(3.0F, 0);
                        Class9110 var37 = this.method38774(3.0F, -1);
                        if (var36.method33989() && var35.method33980()) {
                           var6.add(new Class9510(var35, var9 + 2, Class2317.field15875));
                           continue;
                        }

                        if (var35.method33980() && var36.method33980() && var37.method33989()) {
                           var6.add(new Class9510(var36, var9 + 4, Class2317.field15875));
                           continue;
                        }

                        Class9110 var38 = this.method38774(3.0F, -2);
                        if (!var31 && var36.method33980() && var37.method33980() && var38.method33989()) {
                           var6.add(new Class9510(var37, var9 + 4, Class2317.field15875));
                           continue;
                        }

                        Class9110 var39 = this.method38774(3.0F, -3);
                        if (!var32 && var37.method33980() && var38.method33980() && var39.method33989()) {
                           var6.add(new Class9510(var38, var9 + 4, Class2317.field15875));
                           continue;
                        }

                        Class9110 var40 = this.method38774(4.0F, 0);
                        Class9110 var41 = this.method38774(4.0F, -1);
                        if (this.method38774(3.0F, 1).method33981() && var41.method33989() && var40.method33980()) {
                           var6.add(new Class9510(var40, var9 + 2, Class2317.field15875));
                        }
                     }

                     if (var2.field31175 && !var44.method33989() && var15.method33980()) {
                        var6.add(new Class9510(var15, 60, Class2317.field15876, var42).method36728(var44));
                     }
                  }
               }
            }
         }
      } else {
         while (var8.hasNext()) {
            this.field45896 = ((Class2285)var8.next()).field15129;
            Class9110 var12 = this.method38774(1.0F, this.field45896.getY());
            if (var12.method33980()) {
               var6.add(new Class9510(var12, Math.abs(this.field45896.getY())));
            }
         }
      }

      return var6;
   }

   private Class9110 method38774(float var1, int var2) {
      return this.field45897.method33977((float)this.field45896.getX() * var1, (float)var2, (float)this.field45896.getZ() * var1);
   }

   private Class9110 method38775(float var1, float var2, int var3) {
      Class9110 var6 = this.field45897.method33977((float)this.field45896.getX() * var1, (float)var3, (float)this.field45896.getZ() * var1);
      if (this.field45896.getX() > 0) {
         var6 = var6.method33977(0.0F, 0.0F, -var2);
      }

      if (this.field45896.getZ() > 0) {
         var6 = var6.method33977(var2, 0.0F, 0.0F);
      }

      if (this.field45896.getX() < 0) {
         var6 = var6.method33977(0.0F, 0.0F, var2);
      }

      if (this.field45896.getZ() < 0) {
         var6 = var6.method33977(-var2, 0.0F, 0.0F);
      }

      return var6;
   }

   public List<Class9510> method38776(Class7267 var1) throws Exception {
      Set<Class9510> var4 = new HashSet();
      Set var5 = new HashSet();
      this.field45899 = var1;
      this.field45894 = var1.field31178;
      int var6 = var1.field31176;
      var1.field31177.field44274 = (float)this.field45894.method26355(var1.field31177.field44271);
      var1.field31177.field44275 = var1.field31177.field44274;
      var4.add(var1.field31177);
      this.field45900 = 0;
      short var7 = 7000;
      Class9510 var8 = null;

      while (true) {
         var8 = null;
         if (this.field45900 > var1.field31170) {
            throw new RuntimeException("canceled");
         }

         if (Thread.interrupted()) {
            throw new RuntimeException("canceled");
         }

         if (var4.size() == 0) {
            throw new RuntimeException("no route");
         }

         for (Class9510 var10 : var4) {
            if (var10.field44281.size() == 0) {
               var8 = var10;
               break;
            }
         }

         for (Class9510 var17 : var4) {
            if (var8 == null || var17.field44275 < var8.field44275 && (this.field45900 > var17.field44277 || var17.field44281.size() == 0)) {
               var8 = var17;
            }
         }

         if (var8.field44281.size() <= 0) {
            var8.field44277 = this.field45900 + 2500;
         } else {
            var8.field44277 = this.field45900;

            for (Class9510 var18 : var4) {
               if (var18.field44275 < var8.field44275) {
                  var8 = var18;
               }
            }
         }

         if (this.field45894.method26354(var8.field44271)) {
            ArrayList var16;
            for (var16 = new ArrayList(); var8 != null && var8.field44278 != null; var8 = var8.field44278) {
               var16.add(var8);
            }

            var16.add(var1.field31177);
            if (!var1.field31174) {
               return var16;
            }

            return method38777(var16);
         }

         var4.remove(var8);
         var5.add(var8);

         for (Class9510 var19 : this.method38773(var8, var1)) {
            if (var19 != null) {
               int var11 = var8.field44273 + var19.field44276;
               if (!var4.contains(var19) && !var5.contains(var19)) {
                  var19.field44273 = var11;
                  var19.field44274 = (float)(this.field45894.method26355(var19.field44271) * 0.95F);
                  var19.field44275 = (float)var19.field44273 + var19.field44274;
                  var19.field44278 = var8;
                  var19.field44283.addAll(var8.field44283);
                  var19.field44284.addAll(var8.field44284);
                  var19.field44277 = var8.field44277;
                  var4.add(var19);
               }
            }
         }

         this.field45900++;
      }
   }

   public static List<Class9510> method38777(List<Class9510> var0) {
      int var3 = 0;
      int var4 = 6;
      Class9510 var6 = null;
      Class9510 var7 = null;
      ArrayList var8 = new ArrayList();

      for (int var9 = 0; var9 < var0.size(); var9++) {
         Class9510 var10 = (Class9510)var0.get(var9);
         Class2317 var11 = Class2317.field15873;
         if (var9 + 1 < var0.size()) {
            var11 = ((Class9510)var0.get(var9)).field44279;
         }

         if (var3 != 0 && var3 != var0.size() - 1) {
            boolean var12 = true;
            if (var7.field44279 == var10.field44279
               && (var11 == Class2317.field15873 || var11 == Class2317.field15876 || var10.field44279 == Class2317.field15877)) {
               if (var10.field44279 == Class2317.field15873 && var10.field44271.method33976(var7.field44271) <= (double)(var4 * var4)) {
                  double var13 = Math.min(var7.field44271.method33969(), var10.field44271.method33969());
                  double var15 = Math.min(var7.field44271.method33970(), var10.field44271.method33970());
                  double var17 = Math.min(var7.field44271.method33971(), var10.field44271.method33971());
                  double var19 = Math.max(var7.field44271.method33969(), var10.field44271.method33969());
                  double var21 = Math.max(var7.field44271.method33970(), var10.field44271.method33970());
                  double var23 = Math.max(var7.field44271.method33971(), var10.field44271.method33971());

                  label83:
                  for (int var25 = (int)var13; (double)var25 <= var19; var25++) {
                     for (int var26 = (int)var15; (double)var26 <= var21; var26++) {
                        for (int var27 = (int)var17; (double)var27 <= var23; var27++) {
                           if (!new Class9110((double)var25, (double)var26, (double)var27, var10).method33983()) {
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

   public static List<Class9110> method38778(List<Class9510> var0) {
      int var3 = 0;
      int var4 = 5;
      Class9110 var5 = null;
      Class9110 var6 = null;
      ArrayList var7 = new ArrayList();

      for (Class9510 var9 : var0) {
         if (var3 != 0 && var3 != var0.size() - 1) {
            boolean var10 = true;
            if (!(var9.field44271.method33976(var6) > (double)(var4 * var4))) {
               double var11 = Math.min(var6.method33969(), var9.field44271.method33969());
               double var13 = Math.min(var6.method33970(), var9.field44271.method33970());
               double var15 = Math.min(var6.method33971(), var9.field44271.method33971());
               double var17 = Math.max(var6.method33969(), var9.field44271.method33969());
               double var19 = Math.max(var6.method33970(), var9.field44271.method33970());
               double var21 = Math.max(var6.method33971(), var9.field44271.method33971());

               label62:
               for (int var23 = (int)var11; (double)var23 <= var17; var23++) {
                  for (int var24 = (int)var13; (double)var24 <= var19; var24++) {
                     for (int var25 = (int)var15; (double)var25 <= var21; var25++) {
                        if (!Class8901.method32449(var23, var24, var25, false)) {
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
               var7.add(var5.method33965(0.5, 0.0, 0.5));
               var6 = var5;
            }
         } else {
            if (var5 != null) {
               var7.add(var5.method33965(0.5, 0.0, 0.5));
            }

            var7.add(var9.field44271.method33965(0.5, 0.0, 0.5));
            var6 = var9.field44271;
         }

         var5 = var9.field44271;
         var3++;
      }

      return var7;
   }

   public static double method38779(BlockPos var0, BlockPos var1) {
      double var4 = (double)var0.getX() - (double)var1.getX();
      double var6 = (double)var0.getZ() - (double)var1.getZ();
      return Math.sqrt(var4 * var6);
   }

   public static double method38780(BlockPos var0, BlockPos var1, BlockPos var2) {
      if (var1.field13027 == var2.field13027 && var1.field13029 == var2.field13029) {
         return method38779(var0, var1);
      } else {
         double var5 = (double)(
            (var2.field13027 - var1.field13027) * (var2.field13027 - var1.field13027)
               + (var2.field13029 - var1.field13029) * (var2.field13029 - var1.field13029)
         );
         double var7 = (double)(
               (var0.field13027 - var1.field13027) * (var2.field13027 - var1.field13027)
                  + (var0.field13029 - var1.field13029) * (var2.field13029 - var1.field13029)
            )
            / var5;
         if (!(var7 <= 0.0)) {
            if (!(var7 >= 1.0)) {
               double var9 = (double)(
                     (var1.field13029 - var0.field13029) * (var2.field13027 - var1.field13027)
                        - (var1.field13027 - var0.field13027) * (var2.field13029 - var1.field13029)
                  )
                  / var5;
               return Math.abs(var9) * Math.sqrt(var5);
            } else {
               return method38779(var0, var2);
            }
         } else {
            return method38779(var0, var1);
         }
      }
   }
}
