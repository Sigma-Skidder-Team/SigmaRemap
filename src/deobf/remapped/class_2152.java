package remapped;

import java.util.List;

public class class_2152 extends class_7238 {
   private static String[] field_10763;

   public class_2152(class_5988 var1) {
      super(var1, class_4074.class);
      this.method_33113(class_4630.values(), class_6124.class);
      this.method_33118(class_4630.field_22604, class_6124.field_31414);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      var3.method_24608(class_5884.method_26830(var3.method_24603().method_25778()));
      class_4074 var8 = var5.<class_4074>method_6746(class_4074.class);
      if (var3.method_24603() != class_5884.field_29885) {
         if (var3.method_24603() == class_5884.field_29872) {
            int var9 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var9));
         }
      } else {
         class_5830.method_26389((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var3.method_24602() > 5) {
            var3.method_24605(var3.method_24602() + 1);
         }

         if (var3.method_24602() == 8 && var2.method_3418(class_6124.field_31334)) {
            float var12 = ((Number)var3.method_24609()).floatValue();
            if (Float.isNaN(var12) && class_3446.method_15884().method_25818()) {
               var3.method_24607(1.0F);
            }
         }

         if (var3.method_24602() > 11 && var2.method_3418(class_6124.field_31334)) {
            var3.method_24605(var3.method_24602() + 1);
         }

         if (var2.method_3418(class_6124.field_31424) && var3.method_24602() == 13) {
            var8.method_18792(var1, (byte)(((Number)var3.method_24609()).byteValue() & -5 | var8.method_18784(var1) & 4));
            var3.method_24607(var8.method_18784(var1));
         }

         if (!var2.method_3418(class_6124.field_31372)) {
            if (var2.method_3418(class_6124.field_31437)) {
               if (var3.method_24602() != 16) {
                  if (var3.method_24602() > 16) {
                     var3.method_24605(var3.method_24602() - 1);
                  }
               } else {
                  var8.method_18792(var1, (byte)(var8.method_18784(var1) & -5 | (!var3.method_24609() ? 0 : 4)));
                  var4.remove(var3);
                  var4.add(new class_5407(13, class_5884.field_29883, var8.method_18784(var1)));
               }
            }
         } else if (var1 != var8.method_14874()) {
            if (var3.method_24602() != 0) {
               if (var3.method_24602() == 7) {
                  var8.method_18778(var1, (((Number)var3.method_24609()).byteValue() & 4) != 0);
               }
            } else {
               byte var13 = ((Number)var3.method_24609()).byteValue();
               var8.method_18790(var1, var13);
            }

            if (var3.method_24602() == 0 || var3.method_24602() == 7) {
               var4.add(new class_5407(6, class_5884.field_29892, method_10042(var1, var8)));
            }
         }

         if (!var2.method_3418(class_6124.field_31321)) {
            if (!var2.method_3420(class_6124.field_31344)) {
               if (!var2.method_3420(class_6124.field_31442)) {
                  if (!var2.method_3420(class_6124.field_31354)) {
                     if (!var2.method_3418(class_6124.field_31337)) {
                        if (!var2.method_3420(class_6124.field_31322)) {
                           if (!var2.method_3418(class_6124.field_31331)) {
                              if (var2.method_3420(class_6124.field_31362) && var3.method_24602() == 10) {
                                 this.method_33119((class_5167)var3.method_24609());
                              }
                           } else if (var3.method_24602() == 14) {
                              var8.method_18792(var1, (byte)(var8.method_18784(var1) & -5 | (!var3.method_24609() ? 0 : 4)));
                              var4.remove(var3);
                              var4.add(new class_5407(13, class_5884.field_29883, var8.method_18784(var1)));
                           }
                        } else if (var3.method_24602() == 8) {
                           if (var3.method_24609().equals(0)) {
                              var3.method_24607(null);
                           }

                           var3.method_24608(class_5884.field_29882);
                        }
                     } else if (var3.method_24602() >= 9) {
                        var3.method_24605(var3.method_24602() + 1);
                     }
                  } else if (var3.method_24602() == 18) {
                     var3.method_24607(new class_7468(2, method_10043((Integer)var3.method_24609()), 0));
                     var3.method_24608(class_5884.field_29870);
                  }
               } else if (var3.method_24602() == 15) {
                  var3.method_24607(new class_7468(2, method_10043((Integer)var3.method_24609()), 0));
                  var3.method_24608(class_5884.field_29870);
               }
            } else if (var3.method_24602() == 18) {
               var4.remove(var3);
               int var14 = (Integer)var3.method_24609();
               class_9530 var10 = null;
               if (var14 != 1) {
                  if (var14 != 2) {
                     if (var14 == 3) {
                        var10 = new class_9530(this.field_37136.method_19008().method_28210(729), (byte)1, (short)0, null);
                     }
                  } else {
                     var10 = new class_9530(this.field_37136.method_19008().method_28210(728), (byte)1, (short)0, null);
                  }
               } else {
                  var10 = new class_9530(this.field_37136.method_19008().method_28210(727), (byte)1, (short)0, null);
               }

               class_5051 var11 = new class_5051(70, null, var5);
               var11.method_23236(class_8039.field_41157, var1);
               var11.method_23236(class_8039.field_41157, 4);
               var11.method_23236(class_8039.field_41162, var10);
               var11.method_23233(class_5988.class);
            }
         } else if (var3.method_24602() == 10) {
            int var15 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var15));
         }

         if (var2.method_3418(class_6124.field_31347) && var3.method_24602() == 14) {
            var8.method_18792(var1, (byte)(var8.method_18784(var1) & -5 | (((Number)var3.method_24609()).byteValue() == 0 ? 0 : 4)));
            var4.remove(var3);
            var4.add(new class_5407(13, class_5884.field_29883, var8.method_18784(var1)));
         }

         if ((var2.method_3420(class_6124.field_31395) || var2.method_3420(class_6124.field_31343) || var2.method_3418(class_6124.field_31347))
            && var3.method_24602() >= 14) {
            var3.method_24605(var3.method_24602() + 1);
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_415.method_2063(var1);
   }

   private static boolean method_10044(byte var0) {
      return false;
   }

   private static boolean method_10040(byte var0) {
      return false;
   }

   private static int method_10043(int var0) {
      switch (var0) {
         case 0:
            return 5;
         case 1:
            return 9;
         case 2:
            return 4;
         case 3:
            return 1;
         case 4:
            return 2;
         case 5:
            return 11;
         default:
            return 0;
      }
   }

   private static boolean method_10041(int var0) {
      return false;
   }

   public static int method_10042(int var0, class_4074 var1) {
      byte var4 = var1.method_18789(var0);
      byte var5 = 0;
      if (!method_10041(var4)) {
         if (!var1.method_18788(var0)) {
            if (!method_10040(var4)) {
               if (!var1.method_18786(var0)) {
                  if (method_10044(var4)) {
                     var5 = 5;
                  }
               } else {
                  var5 = 4;
               }
            } else {
               var5 = 3;
            }
         } else {
            var5 = 2;
         }
      } else {
         var5 = 1;
      }

      return var5;
   }
}
