package remapped;

import java.util.Random;

public class class_9176 extends class_6414 {
   private static String[] field_46946;
   public static final class_7044 field_46944 = class_6023.field_30708;
   private final class_5307 field_46945;

   public class_9176(class_5307 var1, class_3073 var2) {
      super(var2);
      this.field_46945 = var1;
      this.method_29284(this.field_32751.method_36446().method_10308(field_46944, Integer.valueOf(0)));
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_46944) < 5;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      class_1331 var7 = var3.method_6081();
      if (var2.method_22548(var7) && var7.method_12165() < 256) {
         int var8 = var1.<Integer>method_10313(field_46944);
         if (var8 < 5) {
            boolean var9 = false;
            boolean var10 = false;
            class_2522 var11 = var2.method_28262(var3.method_6100());
            class_6414 var12 = var11.method_8360();
            if (var12 == class_4783.field_23894) {
               var9 = true;
            } else if (var12 != this.field_46945) {
               if (var11.method_8345()) {
                  var9 = true;
               }
            } else {
               int var13 = 1;

               for (int var14 = 0; var14 < 4; var14++) {
                  class_6414 var15 = var2.method_28262(var3.method_6101(var13 + 1)).method_8360();
                  if (var15 != this.field_46945) {
                     if (var15 == class_4783.field_23894) {
                        var10 = true;
                     }
                     break;
                  }

                  var13++;
               }

               if (var13 < 2 || var13 <= var4.nextInt(!var10 ? 4 : 5)) {
                  var9 = true;
               }
            }

            if (var9 && method_42287(var2, var7, (class_240)null) && var2.method_22548(var3.method_6082(2))) {
               var2.method_7513(var3, this.field_46945.method_24237(var2, var3), 2);
               this.method_42289(var2, var7, var8);
            } else if (var8 >= 4) {
               this.method_42286(var2, var3);
            } else {
               int var18 = var4.nextInt(4);
               if (var10) {
                  var18++;
               }

               boolean var19 = false;

               for (int var20 = 0; var20 < var18; var20++) {
                  class_240 var16 = class_9594.field_48893.method_44313(var4);
                  class_1331 var17 = var3.method_6098(var16);
                  if (var2.method_22548(var17) && var2.method_22548(var17.method_6100()) && method_42287(var2, var17, var16.method_1046())) {
                     this.method_42289(var2, var17, var8 + 1);
                     var19 = true;
                  }
               }

               if (!var19) {
                  this.method_42286(var2, var3);
               } else {
                  var2.method_7513(var3, this.field_46945.method_24237(var2, var3), 2);
               }
            }
         }
      }
   }

   private void method_42289(class_6486 var1, class_1331 var2, int var3) {
      var1.method_7513(var2, this.method_29260().method_10308(field_46944, Integer.valueOf(var3)), 2);
      var1.method_43364(1033, var2, 0);
   }

   private void method_42286(class_6486 var1, class_1331 var2) {
      var1.method_7513(var2, this.method_29260().method_10308(field_46944, Integer.valueOf(5)), 2);
      var1.method_43364(1034, var2, 0);
   }

   private static boolean method_42287(class_4924 var0, class_1331 var1, class_240 var2) {
      for (class_240 var6 : class_9594.field_48893) {
         if (var6 != var2 && !var0.method_22548(var1.method_6098(var6))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 != class_240.field_817 && !var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6100());
      if (var6.method_8360() != this.field_46945 && !var6.method_8350(class_4783.field_23894)) {
         if (var6.method_8345()) {
            boolean var7 = false;

            for (class_240 var9 : class_9594.field_48893) {
               class_2522 var10 = var2.method_28262(var3.method_6098(var9));
               if (!var10.method_8350(this.field_46945)) {
                  if (!var10.method_8345()) {
                     return false;
                  }
               } else {
                  if (var7) {
                     return false;
                  }

                  var7 = true;
               }
            }

            return var7;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_46944);
   }

   public static void method_42288(class_9379 var0, class_1331 var1, Random var2, int var3) {
      var0.method_7513(var1, ((class_5307)class_4783.field_23634).method_24237(var0, var1), 2);
      method_42285(var0, var1, var2, var1, var3, 0);
   }

   private static void method_42285(class_9379 var0, class_1331 var1, Random var2, class_1331 var3, int var4, int var5) {
      class_5307 var8 = (class_5307)class_4783.field_23634;
      int var9 = var2.nextInt(4) + 1;
      if (var5 == 0) {
         var9++;
      }

      for (int var10 = 0; var10 < var9; var10++) {
         class_1331 var11 = var1.method_6082(var10 + 1);
         if (!method_42287(var0, var11, (class_240)null)) {
            return;
         }

         var0.method_7513(var11, var8.method_24237(var0, var11), 2);
         var0.method_7513(var11.method_6100(), var8.method_24237(var0, var11.method_6100()), 2);
      }

      boolean var15 = false;
      if (var5 < 4) {
         int var16 = var2.nextInt(4);
         if (var5 == 0) {
            var16++;
         }

         for (int var12 = 0; var12 < var16; var12++) {
            class_240 var13 = class_9594.field_48893.method_44313(var2);
            class_1331 var14 = var1.method_6082(var9).method_6098(var13);
            if (Math.abs(var14.method_12173() - var3.method_12173()) < var4
               && Math.abs(var14.method_12185() - var3.method_12185()) < var4
               && var0.method_22548(var14)
               && var0.method_22548(var14.method_6100())
               && method_42287(var0, var14, var13.method_1046())) {
               var15 = true;
               var0.method_7513(var14, var8.method_24237(var0, var14), 2);
               var0.method_7513(var14.method_6098(var13.method_1046()), var8.method_24237(var0, var14.method_6098(var13.method_1046())), 2);
               method_42285(var0, var14, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!var15) {
         var0.method_7513(var1.method_6082(var9), class_4783.field_23650.method_29260().method_10308(field_46944, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void method_10758(class_6486 var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      if (var4.method_37387().method_30453(class_5218.field_26793)) {
         class_1331 var7 = var3.method_43955();
         var1.method_7511(var7, true, var4);
      }
   }
}
