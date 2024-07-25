package remapped;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import sun.misc.Unsafe;

public class class_3685 {
   public static final Unsafe field_18064;

   private class_3685() {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_17123(class_7975 var0, long var1, class_7975 var3, long var4, long var6) {
      if (var0.method_36099() != var3.method_36099()) {
         throw new IllegalArgumentException("The type of source array is different than the type of destimation array.");
      } else {
         switch (var0.method_36099()) {
            case field_25344:
               method_17125((class_8720)var0, var1, (class_8720)var3, var4, var6);
               break;
            case field_25349:
               method_17122((class_7210)var0, var1, (class_7210)var3, var4, var6);
               break;
            case field_25343:
               method_17118((class_4516)var0, var1, (class_4516)var3, var4, var6);
               break;
            case field_25342:
               method_17119((class_5260)var0, var1, (class_5260)var3, var4, var6);
               break;
            case field_25350:
               method_17114((class_878)var0, var1, (class_878)var3, var4, var6);
               break;
            case field_25353:
               method_17117((class_4330)var0, var1, (class_4330)var3, var4, var6);
               break;
            case field_25351:
               method_17115((class_1702)var0, var1, (class_1702)var3, var4, var6);
               break;
            case field_25352:
               method_17116((class_2384)var0, var1, (class_2384)var3, var4, var6);
               break;
            case field_25354:
               method_17126((class_9245)var0, var1, (class_9245)var3, var4, var6);
               break;
            case field_25345:
               method_17121((class_6949)var0, var1, (class_6949)var3, var4, var6);
               break;
            case field_25348:
               method_17120((class_5812)var0, var1, (class_5812)var3, var4, var6);
               break;
            default:
               throw new IllegalArgumentException("Invalid array type.");
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_17113(Object var0, long var1, class_7975 var3, long var4, long var6) {
      switch (var3.method_36099()) {
         case field_25344:
            method_17139((boolean[])var0, (int)var1, (class_8720)var3, var4, var6);
            break;
         case field_25349:
            method_17128((byte[])var0, (int)var1, (class_8514)var3, var4, var6);
            break;
         case field_25343:
            method_17137((short[])var0, (int)var1, (class_4516)var3, var4, var6);
            break;
         case field_25342:
            method_17133((int[])var0, (int)var1, (class_5260)var3, var4, var6);
            break;
         case field_25350:
            method_17134((long[])var0, (int)var1, (class_878)var3, var4, var6);
            break;
         case field_25353:
            method_17132((float[])var0, (int)var1, (class_4330)var3, var4, var6);
            break;
         case field_25351:
            method_17129((double[])var0, (int)var1, (class_1702)var3, var4, var6);
            break;
         case field_25352:
            method_17131((float[])var0, (int)var1, (class_2384)var3, var4, var6);
            break;
         case field_25354:
            method_17130((double[])var0, (int)var1, (class_9245)var3, var4, var6);
            break;
         case field_25345:
            method_17136((String[])var0, (int)var1, (class_6949)var3, var4, var6);
            break;
         case field_25348:
            method_17135((Object[])var0, (int)var1, (class_5812)var3, var4, var6);
            break;
         case field_25346:
            Class var8 = var0.getClass();
            Class var9 = var8.getComponentType();
            if (var9 == byte.class) {
               method_17127((byte[])var0, (int)var1, (class_7210)var3, var4, var6);
            } else {
               method_17138((short[])var0, (int)var1, (class_7210)var3, var4, var6);
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   public static void method_17125(class_8720 var0, long var1, class_8720 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_3923(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36117(var24, var0.method_36121(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36117(var23, var0.method_36121(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36117(var11, var0.method_36121(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17139(boolean[] var0, int var1, class_8720 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_4119(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36109(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36109(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36109(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17124(class_8514 var0, long var1, class_8514 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_208(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36117(var24, var0.method_36121(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36117(var23, var0.method_36121(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36117(var11, var0.method_36121(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17128(byte[] var0, int var1, class_8514 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_363(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36117(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36117(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36117(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17122(class_7210 var0, long var1, class_7210 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_639(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36117(var24, var0.method_36121(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36117(var23, var0.method_36121(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36117(var11, var0.method_36121(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17127(byte[] var0, int var1, class_7210 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_4914(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36117(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36117(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36117(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17138(short[] var0, int var1, class_7210 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_4554(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36086(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36086(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36086(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17118(class_4516 var0, long var1, class_4516 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_6286(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36129(var24, var0.method_36124(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36129(var23, var0.method_36124(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36129(var11, var0.method_36124(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17137(short[] var0, int var1, class_4516 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_5632(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36129(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36129(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36129(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17119(class_5260 var0, long var1, class_5260 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_1740(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36092(var24, var0.method_36079(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36092(var23, var0.method_36079(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36092(var11, var0.method_36079(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17133(int[] var0, int var1, class_5260 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_64(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36092(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36092(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36092(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17114(class_878 var0, long var1, class_878 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_5803(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36131(var24, var0.method_36076(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36131(var23, var0.method_36076(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36131(var11, var0.method_36076(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17134(long[] var0, int var1, class_878 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_2503(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36131(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36131(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36131(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17117(class_4330 var0, long var1, class_4330 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_5364(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36123(var24, var0.method_36133(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36123(var23, var0.method_36133(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36123(var11, var0.method_36133(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17132(float[] var0, int var1, class_4330 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_3091(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36123(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36123(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36123(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17115(class_1702 var0, long var1, class_1702 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_8233(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36114(var24, var0.method_36107(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36114(var23, var0.method_36107(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36114(var11, var0.method_36107(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17129(double[] var0, int var1, class_1702 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_2388(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36114(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36114(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36114(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17116(class_2384 var0, long var1, class_2384 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_834(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_10884(var24, var0.method_10878(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_10884(var23, var0.method_10878(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_10884(var11, var0.method_10878(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17131(float[] var0, int var1, class_2384 var2, long var3, long var5) {
      if (var0.length % 2 != 0) {
         throw new IllegalArgumentException("The length of the source array must be even.");
      } else if (var1 < 0 || var1 >= var0.length / 2) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_5971(var13, var15, var0, var1, var2, var3));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               float[] var21 = new float[2];

               for (long var22 = var3; var22 < var3 + var5; var22++) {
                  var21[0] = var0[2 * var7];
                  var21[1] = var0[2 * var7 + 1];
                  var2.method_10884(var22, var21);
                  var7++;
               }
            } catch (ExecutionException var18) {
               float[] var20 = new float[2];

               for (long var14 = var3; var14 < var3 + var5; var14++) {
                  var20[0] = var0[2 * var7];
                  var20[1] = var0[2 * var7 + 1];
                  var2.method_10884(var14, var20);
                  var7++;
               }
            }
         } else {
            float[] var9 = new float[2];

            for (long var10 = var3; var10 < var3 + var5; var10++) {
               var9[0] = var0[2 * var7];
               var9[1] = var0[2 * var7 + 1];
               var2.method_10884(var10, var9);
               var7++;
            }
         }
      }
   }

   public static void method_17126(class_9245 var0, long var1, class_9245 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_3868(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_42612(var24, var0.method_42617(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_42612(var23, var0.method_42617(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_42612(var11, var0.method_42617(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17130(double[] var0, int var1, class_9245 var2, long var3, long var5) {
      if (var0.length % 2 != 0) {
         throw new IllegalArgumentException("The length of the source array must be even.");
      } else if (var1 < 0 || var1 >= var0.length / 2) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_8523(var13, var15, var0, var1, var2, var3));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               double[] var21 = new double[2];

               for (long var22 = var3; var22 < var3 + var5; var22++) {
                  var21[0] = var0[2 * var7];
                  var21[1] = var0[2 * var7 + 1];
                  var2.method_42612(var22, var21);
                  var7++;
               }
            } catch (ExecutionException var18) {
               double[] var20 = new double[2];

               for (long var14 = var3; var14 < var3 + var5; var14++) {
                  var20[0] = var0[2 * var7];
                  var20[1] = var0[2 * var7 + 1];
                  var2.method_42612(var14, var20);
                  var7++;
               }
            }
         } else {
            double[] var9 = new double[2];

            for (long var10 = var3; var10 < var3 + var5; var10++) {
               var9[0] = var0[2 * var7];
               var9[1] = var0[2 * var7 + 1];
               var2.method_42612(var10, var9);
               var7++;
            }
         }
      }
   }

   public static void method_17121(class_6949 var0, long var1, class_6949 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_7189(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36122(var24, var0.method_31787(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36122(var23, var0.method_31787(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36122(var11, var0.method_31787(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17136(String[] var0, int var1, class_6949 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_9376(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36122(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36122(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36122(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method_17120(class_5812 var0, long var1, class_5812 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)class_6806.method_31196(var6, (long)class_1266.method_5693());
         if (var8 >= 2 && var6 >= class_1266.method_5689()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = class_1266.method_5694(new class_2242(var13, var15, var3, var4, var0, var1));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method_36122(var24, var0.method_36098(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method_36122(var23, var0.method_36098(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method_36122(var11, var0.method_36098(var9));
               var9++;
            }
         }
      }
   }

   public static void method_17135(Object[] var0, int var1, class_5812 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method_36136()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method_36112()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)class_6806.method_31196(var5, (long)class_1266.method_5693());
         if (var8 >= 2 && var5 >= class_1266.method_5689()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = class_1266.method_5694(new class_9649(var13, var15, var2, var3, var0, var1));
            }

            try {
               class_1266.method_5696(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method_36122(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method_36122(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method_36122(var9, var0[var7++]);
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_7975 method_17142(class_4903 var0, long var1, Object var3) {
      switch (var0) {
         case field_25344:
            int var16;
            if (var3 instanceof Boolean) {
               var16 = (Boolean)var3 ? 1 : 0;
            } else if (var3 instanceof Byte) {
               var16 = (Byte)var3;
            } else if (var3 instanceof Short) {
               var16 = ((Short)var3).byteValue();
            } else if (var3 instanceof Integer) {
               var16 = ((Integer)var3).byteValue();
            } else if (var3 instanceof Long) {
               var16 = ((Long)var3).byteValue();
            } else if (var3 instanceof Float) {
               var16 = ((Float)var3).byteValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var16 = ((Double)var3).byteValue();
            }

            return new class_8720(var1, (byte)var16);
         case field_25349:
            int var15;
            if (var3 instanceof Boolean) {
               var15 = (Boolean)var3 ? 1 : 0;
            } else if (var3 instanceof Byte) {
               var15 = (Byte)var3;
            } else if (var3 instanceof Short) {
               var15 = ((Short)var3).byteValue();
            } else if (var3 instanceof Integer) {
               var15 = ((Integer)var3).byteValue();
            } else if (var3 instanceof Long) {
               var15 = ((Long)var3).byteValue();
            } else if (var3 instanceof Float) {
               var15 = ((Float)var3).byteValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var15 = ((Double)var3).byteValue();
            }

            return new class_8514(var1, (byte)var15);
         case field_25343:
            int var14;
            if (var3 instanceof Boolean) {
               var14 = (Boolean)var3 ? 1 : 0;
            } else if (var3 instanceof Byte) {
               var14 = ((Byte)var3).shortValue();
            } else if (var3 instanceof Short) {
               var14 = (Short)var3;
            } else if (var3 instanceof Integer) {
               var14 = ((Integer)var3).shortValue();
            } else if (var3 instanceof Long) {
               var14 = ((Long)var3).shortValue();
            } else if (var3 instanceof Float) {
               var14 = ((Float)var3).shortValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var14 = ((Double)var3).shortValue();
            }

            return new class_4516(var1, (short)var14);
         case field_25342:
            int var13;
            if (var3 instanceof Boolean) {
               var13 = (Boolean)var3 ? 1 : 0;
            } else if (var3 instanceof Byte) {
               var13 = ((Byte)var3).intValue();
            } else if (var3 instanceof Short) {
               var13 = ((Short)var3).intValue();
            } else if (var3 instanceof Integer) {
               var13 = (Integer)var3;
            } else if (var3 instanceof Long) {
               var13 = ((Long)var3).intValue();
            } else if (var3 instanceof Float) {
               var13 = ((Float)var3).intValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var13 = ((Double)var3).intValue();
            }

            return new class_5260(var1, var13);
         case field_25350:
            long var12;
            if (var3 instanceof Boolean) {
               var12 = (Boolean)var3 ? 1L : 0L;
            } else if (var3 instanceof Byte) {
               var12 = ((Byte)var3).longValue();
            } else if (var3 instanceof Short) {
               var12 = ((Short)var3).longValue();
            } else if (var3 instanceof Integer) {
               var12 = ((Integer)var3).longValue();
            } else if (var3 instanceof Long) {
               var12 = (Long)var3;
            } else if (var3 instanceof Float) {
               var12 = ((Float)var3).longValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var12 = ((Double)var3).longValue();
            }

            return new class_878(var1, var12);
         case field_25353:
            float var11;
            if (var3 instanceof Boolean) {
               var11 = (Boolean)var3 ? 1.0F : 0.0F;
            } else if (var3 instanceof Byte) {
               var11 = ((Byte)var3).floatValue();
            } else if (var3 instanceof Short) {
               var11 = ((Short)var3).floatValue();
            } else if (var3 instanceof Integer) {
               var11 = ((Integer)var3).floatValue();
            } else if (var3 instanceof Long) {
               var11 = ((Long)var3).floatValue();
            } else if (var3 instanceof Float) {
               var11 = (Float)var3;
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var11 = ((Double)var3).floatValue();
            }

            return new class_4330(var1, var11);
         case field_25351:
            double var10;
            if (var3 instanceof Boolean) {
               var10 = (Boolean)var3 ? 1.0 : 0.0;
            } else if (var3 instanceof Byte) {
               var10 = ((Byte)var3).doubleValue();
            } else if (var3 instanceof Short) {
               var10 = ((Short)var3).doubleValue();
            } else if (var3 instanceof Integer) {
               var10 = ((Integer)var3).doubleValue();
            } else if (var3 instanceof Long) {
               var10 = ((Long)var3).doubleValue();
            } else if (var3 instanceof Float) {
               var10 = ((Float)var3).doubleValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var10 = (Double)var3;
            }

            return new class_1702(var1, var10);
         case field_25352:
            Class var9 = var3.getClass();
            Class var17 = var9.getComponentType();
            if (var17 == float.class) {
               float[] var18 = (float[])var3;
               return new class_2384(var1, var18);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case field_25354:
            Class var8 = var3.getClass();
            Class var5 = var8.getComponentType();
            if (var5 == double.class) {
               double[] var6 = (double[])var3;
               return new class_9245(var1, var6);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case field_25345:
            if (var3 instanceof String) {
               String var7 = (String)var3;
               return new class_6949(var1, var7);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case field_25348:
            return new class_5812(var1, var3);
         case field_25346:
            int var4;
            if (var3 instanceof Boolean) {
               var4 = (Boolean)var3 ? 1 : 0;
            } else if (var3 instanceof Byte) {
               var4 = ((Byte)var3).shortValue();
            } else if (var3 instanceof Short) {
               var4 = (Short)var3;
            } else if (var3 instanceof Integer) {
               var4 = ((Integer)var3).shortValue();
            } else if (var3 instanceof Long) {
               var4 = ((Long)var3).shortValue();
            } else if (var3 instanceof Float) {
               var4 = ((Float)var3).shortValue();
            } else {
               if (!(var3 instanceof Double)) {
                  throw new IllegalArgumentException("Invalid value type.");
               }

               var4 = ((Double)var3).shortValue();
            }

            return new class_7210(var1, (short)var4);
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   public static class_7975 method_17110(class_4903 var0, long var1) {
      return method_17111(var0, var1, true);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_7975 method_17111(class_4903 var0, long var1, boolean var3) {
      switch (var0) {
         case field_25344:
            return new class_8720(var1, var3);
         case field_25349:
            return new class_8514(var1, var3);
         case field_25343:
            return new class_4516(var1, var3);
         case field_25342:
            return new class_5260(var1, var3);
         case field_25350:
            return new class_878(var1, var3);
         case field_25353:
            return new class_4330(var1, var3);
         case field_25351:
            return new class_1702(var1, var3);
         case field_25352:
            return new class_2384(var1, var3);
         case field_25354:
            return new class_9245(var1, var3);
         case field_25345:
            return new class_6949(var1, 100, var3);
         case field_25348:
            return new class_5812(var1, 100, var3);
         case field_25346:
            return new class_7210(var1, var3);
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_7975 method_17140(class_4903 var0, long var1) {
      class_7975 var3 = method_17111(var0, var1, false);
      Random var4 = new Random();
      switch (var0) {
         case field_25344:
            for (long var18 = 0L; var18 < var1; var18++) {
               var3.method_36109(var18, var4.nextBoolean());
            }
            break;
         case field_25349:
         case field_25346:
            long var17;
            for (var17 = 0L; var17 < var1 / 4L; var17 += 4L) {
               int var25 = var4.nextInt();
               int var26;
               var3.method_36117(var17, (byte)(var26 = var25 >> 8));
               var3.method_36117(var17 + 1L, (byte)(var25 = var26 >> 8));
               int var28;
               var3.method_36117(var17 + 2L, (byte)(var28 = var25 >> 8));
               var3.method_36117(var17 + 3L, (byte)(var25 = var28 >> 8));
            }

            for (int var30 = var4.nextInt(); var17 < var1; var17++) {
               var3.method_36117(var17, (byte)(var30 >>= 8));
            }
            break;
         case field_25343:
            long var16;
            for (var16 = 0L; var16 < var1 / 2L; var16 += 2L) {
               int var21 = var4.nextInt();
               int var22;
               var3.method_36129(var16, (short)(var22 = var21 >> 16));
               var3.method_36129(var16 + 1L, (short)(var21 = var22 >> 16));
            }

            for (int var24 = var4.nextInt(); var16 < var1; var16++) {
               var3.method_36129(var16, (short)(var24 >>= 16));
            }
            break;
         case field_25342:
            for (long var15 = 0L; var15 < var1; var15++) {
               var3.method_36092(var15, var4.nextInt());
            }
            break;
         case field_25350:
            for (long var14 = 0L; var14 < var1; var14++) {
               var3.method_36131(var14, var4.nextLong());
            }
            break;
         case field_25353:
            for (long var13 = 0L; var13 < var1; var13++) {
               var3.method_36123(var13, var4.nextFloat());
            }
            break;
         case field_25351:
            for (long var12 = 0L; var12 < var1; var12++) {
               var3.method_36114(var12, var4.nextDouble());
            }
            break;
         case field_25352:
            class_2384 var11 = (class_2384)var3;
            float[] var19 = new float[2];

            for (long var20 = 0L; var20 < var1; var20++) {
               var19[0] = var4.nextFloat();
               var19[1] = var4.nextFloat();
               var11.method_10884(var20, var19);
            }
            break;
         case field_25354:
            class_9245 var10 = (class_9245)var3;
            double[] var6 = new double[2];

            for (long var7 = 0L; var7 < var1; var7++) {
               var6[0] = var4.nextDouble();
               var6[1] = var4.nextDouble();
               var10.method_42612(var7, var6);
            }
            break;
         case field_25345:
            for (long var9 = 0L; var9 < var1; var9++) {
               var3.method_36123(var9, var4.nextFloat());
            }
            break;
         case field_25348:
            for (long var5 = 0L; var5 < var1; var5++) {
               var3.method_36122(var5, var4.nextFloat());
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }

      return var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_7975 method_17112(class_7975 var0, class_4903 var1) {
      if (var0.method_36099() == var1) {
         return var0;
      } else if (var0.method_36112()) {
         switch (var1) {
            case field_25344:
               return new class_8720(var0.method_36136(), var0.method_36121(0L));
            case field_25349:
               return new class_8514(var0.method_36136(), var0.method_36121(0L));
            case field_25343:
               return new class_4516(var0.method_36136(), var0.method_36124(0L));
            case field_25342:
               return new class_5260(var0.method_36136(), var0.method_36079(0L));
            case field_25350:
               return new class_878(var0.method_36136(), var0.method_36076(0L));
            case field_25353:
               return new class_4330(var0.method_36136(), var0.method_36133(0L));
            case field_25351:
               return new class_1702(var0.method_36136(), var0.method_36107(0L));
            case field_25352:
               return new class_2384(var0.method_36136(), ((class_2384)var0).method_10878(0L));
            case field_25354:
               return new class_9245(var0.method_36136(), ((class_9245)var0).method_42617(0L));
            case field_25345:
               return new class_6949(var0.method_36136(), var0.method_36098(0L).toString());
            case field_25348:
               return new class_5812(var0.method_36136(), var0.method_36098(0L));
            case field_25346:
               return new class_7210(var0.method_36136(), var0.method_36103(0L));
            default:
               throw new IllegalArgumentException("Invalid array type.");
         }
      } else {
         long var2 = var0.field_40837;
         class_7975 var4 = method_17111(var1, var2, false);
         int var5 = (int)class_6806.method_31196(var2, (long)class_1266.method_5693());
         if (var5 >= 2 && var2 >= class_1266.method_5689()) {
            long var28 = var2 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var28;
               long var12 = var9 == var5 - 1 ? var2 : var10 + var28;
               var8[var9] = class_1266.method_5694(new class_4886(var1, var10, var12, var4, var0));
            }

            try {
               class_1266.method_5696(var8);
            } catch (InterruptedException var14) {
               switch (var1) {
                  case field_25344:
                  case field_25349:
                     for (long var54 = 0L; var54 < var2; var54++) {
                        var4.method_36117(var54, var0.method_36121(var54));
                     }
                     break;
                  case field_25343:
                     for (long var53 = 0L; var53 < var2; var53++) {
                        var4.method_36129(var53, var0.method_36124(var53));
                     }
                     break;
                  case field_25342:
                     for (long var52 = 0L; var52 < var2; var52++) {
                        var4.method_36092(var52, var0.method_36079(var52));
                     }
                     break;
                  case field_25350:
                     for (long var51 = 0L; var51 < var2; var51++) {
                        var4.method_36131(var51, var0.method_36076(var51));
                     }
                     break;
                  case field_25353:
                     for (long var50 = 0L; var50 < var2; var50++) {
                        var4.method_36123(var50, var0.method_36133(var50));
                     }
                     break;
                  case field_25351:
                     for (long var49 = 0L; var49 < var2; var49++) {
                        var4.method_36114(var49, var0.method_36107(var49));
                     }
                     break;
                  case field_25352:
                     if (var0.method_36099() == class_4903.field_25354) {
                        for (long var47 = 0L; var47 < var2; var47++) {
                           ((class_2384)var4).method_10886(var47, ((class_9245)var0).method_42617(var47));
                        }
                     } else {
                        for (long var48 = 0L; var48 < var2; var48++) {
                           var4.method_36123(var48, var0.method_36133(var48));
                        }
                     }
                     break;
                  case field_25354:
                     if (var0.method_36099() == class_4903.field_25352) {
                        for (long var45 = 0L; var45 < var2; var45++) {
                           ((class_9245)var4).method_42621(var45, ((class_2384)var0).method_10878(var45));
                        }
                     } else {
                        for (long var46 = 0L; var46 < var2; var46++) {
                           var4.method_36114(var46, var0.method_36107(var46));
                        }
                     }
                     break;
                  case field_25345:
                     for (long var44 = 0L; var44 < var2; var44++) {
                        var4.method_36122(var44, var0.method_36098(var44).toString());
                     }
                     break;
                  case field_25348:
                     for (long var43 = 0L; var43 < var2; var43++) {
                        var4.method_36122(var43, var0.method_36098(var43));
                     }
                     break;
                  case field_25346:
                     for (long var42 = 0L; var42 < var2; var42++) {
                        var4.method_36086(var42, var0.method_36103(var42));
                     }
                     break;
                  default:
                     throw new IllegalArgumentException("Invalid array type.");
               }
            } catch (ExecutionException var15) {
               switch (var1) {
                  case field_25344:
                  case field_25349:
                     for (long var41 = 0L; var41 < var2; var41++) {
                        var4.method_36117(var41, var0.method_36121(var41));
                     }
                     break;
                  case field_25343:
                     for (long var40 = 0L; var40 < var2; var40++) {
                        var4.method_36129(var40, var0.method_36124(var40));
                     }
                     break;
                  case field_25342:
                     for (long var39 = 0L; var39 < var2; var39++) {
                        var4.method_36092(var39, var0.method_36079(var39));
                     }
                     break;
                  case field_25350:
                     for (long var38 = 0L; var38 < var2; var38++) {
                        var4.method_36131(var38, var0.method_36076(var38));
                     }
                     break;
                  case field_25353:
                     for (long var37 = 0L; var37 < var2; var37++) {
                        var4.method_36123(var37, var0.method_36133(var37));
                     }
                     break;
                  case field_25351:
                     for (long var36 = 0L; var36 < var2; var36++) {
                        var4.method_36114(var36, var0.method_36107(var36));
                     }
                     break;
                  case field_25352:
                     if (var0.method_36099() == class_4903.field_25354) {
                        for (long var34 = 0L; var34 < var2; var34++) {
                           ((class_2384)var4).method_10886(var34, ((class_9245)var0).method_42617(var34));
                        }
                     } else {
                        for (long var35 = 0L; var35 < var2; var35++) {
                           var4.method_36123(var35, var0.method_36133(var35));
                        }
                     }
                     break;
                  case field_25354:
                     if (var0.method_36099() == class_4903.field_25352) {
                        for (long var32 = 0L; var32 < var2; var32++) {
                           ((class_9245)var4).method_42621(var32, ((class_2384)var0).method_10878(var32));
                        }
                     } else {
                        for (long var33 = 0L; var33 < var2; var33++) {
                           var4.method_36114(var33, var0.method_36107(var33));
                        }
                     }
                     break;
                  case field_25345:
                     for (long var31 = 0L; var31 < var2; var31++) {
                        var4.method_36122(var31, var0.method_36098(var31).toString());
                     }
                     break;
                  case field_25348:
                     for (long var30 = 0L; var30 < var2; var30++) {
                        var4.method_36122(var30, var0.method_36098(var30));
                     }
                     break;
                  case field_25346:
                     for (long var29 = 0L; var29 < var2; var29++) {
                        var4.method_36086(var29, var0.method_36103(var29));
                     }
                     break;
                  default:
                     throw new IllegalArgumentException("Invalid array type.");
               }
            }
         } else {
            switch (var1) {
               case field_25344:
               case field_25349:
                  for (long var27 = 0L; var27 < var2; var27++) {
                     var4.method_36117(var27, var0.method_36121(var27));
                  }
                  break;
               case field_25343:
                  for (long var26 = 0L; var26 < var2; var26++) {
                     var4.method_36129(var26, var0.method_36124(var26));
                  }
                  break;
               case field_25342:
                  for (long var25 = 0L; var25 < var2; var25++) {
                     var4.method_36092(var25, var0.method_36079(var25));
                  }
                  break;
               case field_25350:
                  for (long var24 = 0L; var24 < var2; var24++) {
                     var4.method_36131(var24, var0.method_36076(var24));
                  }
                  break;
               case field_25353:
                  for (long var23 = 0L; var23 < var2; var23++) {
                     var4.method_36123(var23, var0.method_36133(var23));
                  }
                  break;
               case field_25351:
                  for (long var22 = 0L; var22 < var2; var22++) {
                     var4.method_36114(var22, var0.method_36107(var22));
                  }
                  break;
               case field_25352:
                  if (var0.method_36099() == class_4903.field_25354) {
                     for (long var20 = 0L; var20 < var2; var20++) {
                        ((class_2384)var4).method_10886(var20, ((class_9245)var0).method_42617(var20));
                     }
                  } else {
                     for (long var21 = 0L; var21 < var2; var21++) {
                        var4.method_36123(var21, var0.method_36133(var21));
                     }
                  }
                  break;
               case field_25354:
                  if (var0.method_36099() == class_4903.field_25352) {
                     for (long var18 = 0L; var18 < var2; var18++) {
                        ((class_9245)var4).method_42621(var18, ((class_2384)var0).method_10878(var18));
                     }
                  } else {
                     for (long var19 = 0L; var19 < var2; var19++) {
                        var4.method_36114(var19, var0.method_36107(var19));
                     }
                  }
                  break;
               case field_25345:
                  for (long var17 = 0L; var17 < var2; var17++) {
                     var4.method_36122(var17, var0.method_36098(var17).toString());
                  }
                  break;
               case field_25348:
                  for (long var16 = 0L; var16 < var2; var16++) {
                     var4.method_36122(var16, var0.method_36098(var16));
                  }
                  break;
               case field_25346:
                  for (long var6 = 0L; var6 < var2; var6++) {
                     var4.method_36086(var6, var0.method_36103(var6));
                  }
                  break;
               default:
                  throw new IllegalArgumentException("Invalid array type.");
            }
         }

         return var4;
      }
   }

   public static class_7975 method_17141(class_7975 var0, class_8720 var1) {
      if (var0.field_40837 != var1.field_40837) {
         throw new IllegalArgumentException("src.length != mask.length");
      } else {
         long var2 = var0.field_40837;
         long var4 = 0L;
         int var6 = (int)class_6806.method_31196(var2, (long)class_1266.method_5693());
         long var7 = var2 / (long)var6;
         ExecutorService var9 = Executors.newCachedThreadPool();
         Future[] var10 = new Future[var6];

         for (int var11 = 0; var11 < var6; var11++) {
            long var12 = (long)var11 * var7;
            long var14 = var11 == var6 - 1 ? var2 : var12 + var7;
            var10[var11] = var9.submit(new class_4445(var12, var14, var1));
         }

         try {
            for (int var18 = 0; var18 < var6; var18++) {
               var4 += var10[var18].get();
            }
         } catch (Exception var16) {
            for (long var20 = 0L; var20 < var2; var20++) {
               if (var1.method_36121(var20) == 1) {
                  var4++;
               }
            }
         }

         if (var4 <= 0L) {
            return null;
         } else {
            class_7975 var19 = method_17111(var0.method_36099(), var4, false);
            var7 = 0L;

            for (long var21 = 0L; var21 < var2; var21++) {
               if (var1.method_36121(var21) == 1) {
                  var19.method_36122(var7++, var0.method_36098(var21));
               }
            }

            return var19;
         }
      }
   }

   static {
      Object var0 = null;
      Object var1 = null;

      try {
         Class var2 = Class.forName("sun.misc.Unsafe");
         Field var3 = var2.getDeclaredField("theUnsafe");
         var3.setAccessible(true);
         var0 = var3.get(var2);
      } catch (ClassNotFoundException var8) {
         var1 = var8;
      } catch (IllegalAccessException var9) {
         var1 = var9;
      } catch (IllegalArgumentException var10) {
         var1 = var10;
      } catch (NoSuchFieldException var11) {
         var1 = var11;
      } catch (SecurityException var12) {
         var1 = var12;
      }

      field_18064 = (Unsafe)var0;
      if (field_18064 == null) {
         throw new Error("Could not obtain access to sun.misc.Unsafe", (Throwable)var1);
      }
   }
}
