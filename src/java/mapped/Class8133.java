package mapped;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import sun.misc.Unsafe;

public class Class8133 {
   public static final Unsafe field34961;

   private Class8133() {
   }

   public static void method28160(Class2373 var0, long var1, Class2373 var3, long var4, long var6) {
      if (var0.method9635() != var3.method9635()) {
         throw new IllegalArgumentException("The type of source array is different than the type of destimation array.");
      } else {
         switch (Class8569.field38527[var0.method9635().ordinal()]) {
            case 1:
               method28162((Class2385)var0, var1, (Class2385)var3, var4, var6);
               break;
            case 2:
               method28166((Class2374)var0, var1, (Class2374)var3, var4, var6);
               break;
            case 3:
               method28169((Class2383)var0, var1, (Class2383)var3, var4, var6);
               break;
            case 4:
               method28171((Class2376)var0, var1, (Class2376)var3, var4, var6);
               break;
            case 5:
               method28173((Class2382)var0, var1, (Class2382)var3, var4, var6);
               break;
            case 6:
               method28175((Class2378)var0, var1, (Class2378)var3, var4, var6);
               break;
            case 7:
               method28177((Class2381)var0, var1, (Class2381)var3, var4, var6);
               break;
            case 8:
               method28179((Class2380)var0, var1, (Class2380)var3, var4, var6);
               break;
            case 9:
               method28181((Class2377)var0, var1, (Class2377)var3, var4, var6);
               break;
            case 10:
               method28183((Class2379)var0, var1, (Class2379)var3, var4, var6);
               break;
            case 11:
               method28185((Class2384)var0, var1, (Class2384)var3, var4, var6);
               break;
            default:
               throw new IllegalArgumentException("Invalid array type.");
         }
      }
   }

   public static void method28161(Object var0, long var1, Class2373 var3, long var4, long var6) {
      switch (Class8569.field38527[var3.method9635().ordinal()]) {
         case 1:
            method28163((boolean[])var0, (int)var1, (Class2385)var3, var4, var6);
            break;
         case 2:
            method28165((byte[])var0, (int)var1, (Class2375)var3, var4, var6);
            break;
         case 3:
            method28170((short[])var0, (int)var1, (Class2383)var3, var4, var6);
            break;
         case 4:
            method28172((int[])var0, (int)var1, (Class2376)var3, var4, var6);
            break;
         case 5:
            method28174((long[])var0, (int)var1, (Class2382)var3, var4, var6);
            break;
         case 6:
            method28176((float[])var0, (int)var1, (Class2378)var3, var4, var6);
            break;
         case 7:
            method28178((double[])var0, (int)var1, (Class2381)var3, var4, var6);
            break;
         case 8:
            method28180((float[])var0, (int)var1, (Class2380)var3, var4, var6);
            break;
         case 9:
            method28182((double[])var0, (int)var1, (Class2377)var3, var4, var6);
            break;
         case 10:
            method28184((String[])var0, (int)var1, (Class2379)var3, var4, var6);
            break;
         case 11:
            method28186((Object[])var0, (int)var1, (Class2384)var3, var4, var6);
            break;
         case 12:
            Class var8 = var0.getClass();
            Class var9 = var8.getComponentType();
            if (var9 == byte.class) {
               method28167((byte[])var0, (int)var1, (Class2374)var3, var4, var6);
            } else {
               method28168((short[])var0, (int)var1, (Class2374)var3, var4, var6);
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   public static void method28162(Class2385 var0, long var1, Class2385 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class1360(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9675(var24, var0.method9641(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9675(var23, var0.method9641(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9675(var11, var0.method9641(var9));
               var9++;
            }
         }
      }
   }

   public static void method28163(boolean[] var0, int var1, Class2385 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class1525(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9673(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9673(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9673(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28164(Class2375 var0, long var1, Class2375 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class713(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9675(var24, var0.method9641(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9675(var23, var0.method9641(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9675(var11, var0.method9641(var9));
               var9++;
            }
         }
      }
   }

   public static void method28165(byte[] var0, int var1, Class2375 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class672(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9675(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9675(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9675(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28166(Class2374 var0, long var1, Class2374 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class1522(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9675(var24, var0.method9641(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9675(var23, var0.method9641(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9675(var11, var0.method9641(var9));
               var9++;
            }
         }
      }
   }

   public static void method28167(byte[] var0, int var1, Class2374 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class624(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9675(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9675(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9675(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28168(short[] var0, int var1, Class2374 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class698(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9677(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9677(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9677(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28169(Class2383 var0, long var1, Class2383 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class486(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9679(var24, var0.method9645(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9679(var23, var0.method9645(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9679(var11, var0.method9645(var9));
               var9++;
            }
         }
      }
   }

   public static void method28170(short[] var0, int var1, Class2383 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class537(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9679(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9679(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9679(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28171(Class2376 var0, long var1, Class2376 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class327(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9681(var24, var0.method9647(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9681(var23, var0.method9647(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9681(var11, var0.method9647(var9));
               var9++;
            }
         }
      }
   }

   public static void method28172(int[] var0, int var1, Class2376 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class502(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9681(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9681(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9681(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28173(Class2382 var0, long var1, Class2382 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class694(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9683(var24, var0.method9649(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9683(var23, var0.method9649(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9683(var11, var0.method9649(var9));
               var9++;
            }
         }
      }
   }

   public static void method28174(long[] var0, int var1, Class2382 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class501(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9683(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9683(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9683(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28175(Class2378 var0, long var1, Class2378 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class784(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9685(var24, var0.method9651(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9685(var23, var0.method9651(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9685(var11, var0.method9651(var9));
               var9++;
            }
         }
      }
   }

   public static void method28176(float[] var0, int var1, Class2378 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class416(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9685(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9685(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9685(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28177(Class2381 var0, long var1, Class2381 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class1513(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9687(var24, var0.method9653(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9687(var23, var0.method9653(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9687(var11, var0.method9653(var9));
               var9++;
            }
         }
      }
   }

   public static void method28178(double[] var0, int var1, Class2381 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class708(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9687(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9687(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9687(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28179(Class2380 var0, long var1, Class2380 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class407(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9714(var24, var0.method9710(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9714(var23, var0.method9710(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9714(var11, var0.method9710(var9));
               var9++;
            }
         }
      }
   }

   public static void method28180(float[] var0, int var1, Class2380 var2, long var3, long var5) {
      if (var0.length % 2 != 0) {
         throw new IllegalArgumentException("The length of the source array must be even.");
      } else if (var1 < 0 || var1 >= var0.length / 2) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class563(var13, var15, var0, var1, var2, var3));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               float[] var21 = new float[2];

               for (long var22 = var3; var22 < var3 + var5; var22++) {
                  var21[0] = var0[2 * var7];
                  var21[1] = var0[2 * var7 + 1];
                  var2.method9714(var22, var21);
                  var7++;
               }
            } catch (ExecutionException var18) {
               float[] var20 = new float[2];

               for (long var14 = var3; var14 < var3 + var5; var14++) {
                  var20[0] = var0[2 * var7];
                  var20[1] = var0[2 * var7 + 1];
                  var2.method9714(var14, var20);
                  var7++;
               }
            }
         } else {
            float[] var9 = new float[2];

            for (long var10 = var3; var10 < var3 + var5; var10++) {
               var9[0] = var0[2 * var7];
               var9[1] = var0[2 * var7 + 1];
               var2.method9714(var10, var9);
               var7++;
            }
         }
      }
   }

   public static void method28181(Class2377 var0, long var1, Class2377 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class1629(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9704(var24, var0.method9700(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9704(var23, var0.method9700(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9704(var11, var0.method9700(var9));
               var9++;
            }
         }
      }
   }

   public static void method28182(double[] var0, int var1, Class2377 var2, long var3, long var5) {
      if (var0.length % 2 != 0) {
         throw new IllegalArgumentException("The length of the source array must be even.");
      } else if (var1 < 0 || var1 >= var0.length / 2) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class1536(var13, var15, var0, var1, var2, var3));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               double[] var21 = new double[2];

               for (long var22 = var3; var22 < var3 + var5; var22++) {
                  var21[0] = var0[2 * var7];
                  var21[1] = var0[2 * var7 + 1];
                  var2.method9704(var22, var21);
                  var7++;
               }
            } catch (ExecutionException var18) {
               double[] var20 = new double[2];

               for (long var14 = var3; var14 < var3 + var5; var14++) {
                  var20[0] = var0[2 * var7];
                  var20[1] = var0[2 * var7 + 1];
                  var2.method9704(var14, var20);
                  var7++;
               }
            }
         } else {
            double[] var9 = new double[2];

            for (long var10 = var3; var10 < var3 + var5; var10++) {
               var9[0] = var0[2 * var7];
               var9[1] = var0[2 * var7 + 1];
               var2.method9704(var10, var9);
               var7++;
            }
         }
      }
   }

   public static void method28183(Class2379 var0, long var1, Class2379 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class462(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9670(var24, var0.method9636(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9670(var23, var0.method9636(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9670(var11, var0.method9636(var9));
               var9++;
            }
         }
      }
   }

   public static void method28184(String[] var0, int var1, Class2379 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class1485(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9670(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9670(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9670(var9, var0[var7++]);
            }
         }
      }
   }

   public static void method28185(Class2384 var0, long var1, Class2384 var3, long var4, long var6) {
      if (var1 < 0L || var1 >= var0.method9634()) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
      } else if (var4 < 0L || var4 >= var3.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var6 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var3.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var8 = (int)Class9044.method33604(var6, (long)Class7008.method21726());
         if (var8 >= 2 && var6 >= Class7008.method21723()) {
            long var19 = var6 / (long)var8;
            Future[] var20 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var6 : var13 + var19;
               var20[var12] = Class7008.method21729(new Class329(var13, var15, var3, var4, var0, var1));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var17) {
               long var22 = var1;

               for (long var24 = var4; var22 < var1 + var6; var24++) {
                  var3.method9670(var24, var0.method9636(var22));
                  var22++;
               }
            } catch (ExecutionException var18) {
               long var21 = var1;

               for (long var23 = var4; var21 < var1 + var6; var23++) {
                  var3.method9670(var23, var0.method9636(var21));
                  var21++;
               }
            }
         } else {
            long var9 = var1;

            for (long var11 = var4; var9 < var1 + var6; var11++) {
               var3.method9670(var11, var0.method9636(var9));
               var9++;
            }
         }
      }
   }

   public static void method28186(Object[] var0, int var1, Class2384 var2, long var3, long var5) {
      if (var1 < 0 || var1 >= var0.length) {
         throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
      } else if (var3 < 0L || var3 >= var2.method9634()) {
         throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
      } else if (var5 < 0L) {
         throw new IllegalArgumentException("length < 0");
      } else if (var2.method9691()) {
         throw new IllegalArgumentException("Constant arrays cannot be modified.");
      } else {
         int var7 = var1;
         int var8 = (int)Class9044.method33604(var5, (long)Class7008.method21726());
         if (var8 >= 2 && var5 >= Class7008.method21723()) {
            long var19 = var5 / (long)var8;
            Future[] var11 = new Future[var8];

            for (int var12 = 0; var12 < var8; var12++) {
               long var13 = (long)var12 * var19;
               long var15 = var12 == var8 - 1 ? var5 : var13 + var19;
               var11[var12] = Class7008.method21729(new Class1477(var13, var15, var2, var3, var0, var1));
            }

            try {
               Class7008.method21730(var11);
            } catch (InterruptedException var17) {
               for (long var21 = var3; var21 < var3 + var5; var21++) {
                  var2.method9670(var21, var0[var7++]);
               }
            } catch (ExecutionException var18) {
               for (long var20 = var3; var20 < var3 + var5; var20++) {
                  var2.method9670(var20, var0[var7++]);
               }
            }
         } else {
            for (long var9 = var3; var9 < var3 + var5; var9++) {
               var2.method9670(var9, var0[var7++]);
            }
         }
      }
   }

   public static Class2373 method28187(Class2178 var0, long var1, Object var3) {
      switch (Class8569.field38527[var0.ordinal()]) {
         case 1:
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

            return new Class2385(var1, (byte)var16);
         case 2:
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

            return new Class2375(var1, (byte)var15);
         case 3:
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

            return new Class2383(var1, (short)var14);
         case 4:
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

            return new Class2376(var1, var13);
         case 5:
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

            return new Class2382(var1, var12);
         case 6:
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

            return new Class2378(var1, var11);
         case 7:
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

            return new Class2381(var1, var10);
         case 8:
            Class var9 = var3.getClass();
            Class var17 = var9.getComponentType();
            if (var17 == float.class) {
               float[] var18 = (float[])var3;
               return new Class2380(var1, var18);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case 9:
            Class var8 = var3.getClass();
            Class var5 = var8.getComponentType();
            if (var5 == double.class) {
               double[] var6 = (double[])var3;
               return new Class2377(var1, var6);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case 10:
            if (var3 instanceof String) {
               String var7 = (String)var3;
               return new Class2379(var1, var7);
            }

            throw new IllegalArgumentException("Invalid value type.");
         case 11:
            return new Class2384(var1, var3);
         case 12:
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

            return new Class2374(var1, (short)var4);
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   public static Class2373 method28188(Class2178 var0, long var1) {
      return method28189(var0, var1, true);
   }

   public static Class2373 method28189(Class2178 var0, long var1, boolean var3) {
      switch (Class8569.field38527[var0.ordinal()]) {
         case 1:
            return new Class2385(var1, var3);
         case 2:
            return new Class2375(var1, var3);
         case 3:
            return new Class2383(var1, var3);
         case 4:
            return new Class2376(var1, var3);
         case 5:
            return new Class2382(var1, var3);
         case 6:
            return new Class2378(var1, var3);
         case 7:
            return new Class2381(var1, var3);
         case 8:
            return new Class2380(var1, var3);
         case 9:
            return new Class2377(var1, var3);
         case 10:
            return new Class2379(var1, 100, var3);
         case 11:
            return new Class2384(var1, 100, var3);
         case 12:
            return new Class2374(var1, var3);
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }

   public static Class2373 method28190(Class2178 var0, long var1) {
      Class2373 var3 = method28189(var0, var1, false);
      Random var4 = new Random();
      switch (Class8569.field38527[var0.ordinal()]) {
         case 1:
            for (long var18 = 0L; var18 < var1; var18++) {
               var3.method9673(var18, var4.nextBoolean());
            }
            break;
         case 2:
         case 12:
            long var17;
            for (var17 = 0L; var17 < var1 / 4L; var17 += 4L) {
               int var25 = var4.nextInt();
               int var26;
               var3.method9675(var17, (byte)(var26 = var25 >> 8));
               var3.method9675(var17 + 1L, (byte)(var25 = var26 >> 8));
               int var28;
               var3.method9675(var17 + 2L, (byte)(var28 = var25 >> 8));
               var3.method9675(var17 + 3L, (byte)(var25 = var28 >> 8));
            }

            for (int var30 = var4.nextInt(); var17 < var1; var17++) {
               var3.method9675(var17, (byte)(var30 >>= 8));
            }
            break;
         case 3:
            long var16;
            for (var16 = 0L; var16 < var1 / 2L; var16 += 2L) {
               int var21 = var4.nextInt();
               int var22;
               var3.method9679(var16, (short)(var22 = var21 >> 16));
               var3.method9679(var16 + 1L, (short)(var21 = var22 >> 16));
            }

            for (int var24 = var4.nextInt(); var16 < var1; var16++) {
               var3.method9679(var16, (short)(var24 >>= 16));
            }
            break;
         case 4:
            for (long var15 = 0L; var15 < var1; var15++) {
               var3.method9681(var15, var4.nextInt());
            }
            break;
         case 5:
            for (long var14 = 0L; var14 < var1; var14++) {
               var3.method9683(var14, var4.nextLong());
            }
            break;
         case 6:
            for (long var13 = 0L; var13 < var1; var13++) {
               var3.method9685(var13, var4.nextFloat());
            }
            break;
         case 7:
            for (long var12 = 0L; var12 < var1; var12++) {
               var3.method9687(var12, var4.nextDouble());
            }
            break;
         case 8:
            Class2380 var11 = (Class2380)var3;
            float[] var19 = new float[2];

            for (long var20 = 0L; var20 < var1; var20++) {
               var19[0] = var4.nextFloat();
               var19[1] = var4.nextFloat();
               var11.method9714(var20, var19);
            }
            break;
         case 9:
            Class2377 var10 = (Class2377)var3;
            double[] var6 = new double[2];

            for (long var7 = 0L; var7 < var1; var7++) {
               var6[0] = var4.nextDouble();
               var6[1] = var4.nextDouble();
               var10.method9704(var7, var6);
            }
            break;
         case 10:
            for (long var9 = 0L; var9 < var1; var9++) {
               var3.method9685(var9, var4.nextFloat());
            }
            break;
         case 11:
            for (long var5 = 0L; var5 < var1; var5++) {
               var3.method9670(var5, var4.nextFloat());
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }

      return var3;
   }

   public static Class2373 method28191(Class2373 var0, Class2178 var1) {
      if (var0.method9635() == var1) {
         return var0;
      } else if (var0.method9691()) {
         switch (Class8569.field38527[var1.ordinal()]) {
            case 1:
               return new Class2385(var0.method9634(), var0.method9641(0L));
            case 2:
               return new Class2375(var0.method9634(), var0.method9641(0L));
            case 3:
               return new Class2383(var0.method9634(), var0.method9645(0L));
            case 4:
               return new Class2376(var0.method9634(), var0.method9647(0L));
            case 5:
               return new Class2382(var0.method9634(), var0.method9649(0L));
            case 6:
               return new Class2378(var0.method9634(), var0.method9651(0L));
            case 7:
               return new Class2381(var0.method9634(), var0.method9653(0L));
            case 8:
               return new Class2380(var0.method9634(), ((Class2380)var0).method9710(0L));
            case 9:
               return new Class2377(var0.method9634(), ((Class2377)var0).method9700(0L));
            case 10:
               return new Class2379(var0.method9634(), var0.method9636(0L).toString());
            case 11:
               return new Class2384(var0.method9634(), var0.method9636(0L));
            case 12:
               return new Class2374(var0.method9634(), var0.method9643(0L));
            default:
               throw new IllegalArgumentException("Invalid array type.");
         }
      } else {
         long var2 = var0.field16234;
         Class2373 var4 = method28189(var1, var2, false);
         int var5 = (int)Class9044.method33604(var2, (long)Class7008.method21726());
         if (var5 >= 2 && var2 >= Class7008.method21723()) {
            long var28 = var2 / (long)var5;
            Future[] var8 = new Future[var5];

            for (int var9 = 0; var9 < var5; var9++) {
               long var10 = (long)var9 * var28;
               long var12 = var9 == var5 - 1 ? var2 : var10 + var28;
               var8[var9] = Class7008.method21729(new Class644(var1, var10, var12, var4, var0));
            }

            try {
               Class7008.method21730(var8);
            } catch (InterruptedException var14) {
               switch (Class8569.field38527[var1.ordinal()]) {
                  case 1:
                  case 2:
                     for (long var54 = 0L; var54 < var2; var54++) {
                        var4.method9675(var54, var0.method9641(var54));
                     }
                     break;
                  case 3:
                     for (long var53 = 0L; var53 < var2; var53++) {
                        var4.method9679(var53, var0.method9645(var53));
                     }
                     break;
                  case 4:
                     for (long var52 = 0L; var52 < var2; var52++) {
                        var4.method9681(var52, var0.method9647(var52));
                     }
                     break;
                  case 5:
                     for (long var51 = 0L; var51 < var2; var51++) {
                        var4.method9683(var51, var0.method9649(var51));
                     }
                     break;
                  case 6:
                     for (long var50 = 0L; var50 < var2; var50++) {
                        var4.method9685(var50, var0.method9651(var50));
                     }
                     break;
                  case 7:
                     for (long var49 = 0L; var49 < var2; var49++) {
                        var4.method9687(var49, var0.method9653(var49));
                     }
                     break;
                  case 8:
                     if (var0.method9635() == Class2178.field14304) {
                        for (long var47 = 0L; var47 < var2; var47++) {
                           ((Class2380)var4).method9715(var47, ((Class2377)var0).method9700(var47));
                        }
                     } else {
                        for (long var48 = 0L; var48 < var2; var48++) {
                           var4.method9685(var48, var0.method9651(var48));
                        }
                     }
                     break;
                  case 9:
                     if (var0.method9635() == Class2178.field14303) {
                        for (long var45 = 0L; var45 < var2; var45++) {
                           ((Class2377)var4).method9703(var45, ((Class2380)var0).method9710(var45));
                        }
                     } else {
                        for (long var46 = 0L; var46 < var2; var46++) {
                           var4.method9687(var46, var0.method9653(var46));
                        }
                     }
                     break;
                  case 10:
                     for (long var44 = 0L; var44 < var2; var44++) {
                        var4.method9670(var44, var0.method9636(var44).toString());
                     }
                     break;
                  case 11:
                     for (long var43 = 0L; var43 < var2; var43++) {
                        var4.method9670(var43, var0.method9636(var43));
                     }
                     break;
                  case 12:
                     for (long var42 = 0L; var42 < var2; var42++) {
                        var4.method9677(var42, var0.method9643(var42));
                     }
                     break;
                  default:
                     throw new IllegalArgumentException("Invalid array type.");
               }
            } catch (ExecutionException var15) {
               switch (Class8569.field38527[var1.ordinal()]) {
                  case 1:
                  case 2:
                     for (long var41 = 0L; var41 < var2; var41++) {
                        var4.method9675(var41, var0.method9641(var41));
                     }
                     break;
                  case 3:
                     for (long var40 = 0L; var40 < var2; var40++) {
                        var4.method9679(var40, var0.method9645(var40));
                     }
                     break;
                  case 4:
                     for (long var39 = 0L; var39 < var2; var39++) {
                        var4.method9681(var39, var0.method9647(var39));
                     }
                     break;
                  case 5:
                     for (long var38 = 0L; var38 < var2; var38++) {
                        var4.method9683(var38, var0.method9649(var38));
                     }
                     break;
                  case 6:
                     for (long var37 = 0L; var37 < var2; var37++) {
                        var4.method9685(var37, var0.method9651(var37));
                     }
                     break;
                  case 7:
                     for (long var36 = 0L; var36 < var2; var36++) {
                        var4.method9687(var36, var0.method9653(var36));
                     }
                     break;
                  case 8:
                     if (var0.method9635() == Class2178.field14304) {
                        for (long var34 = 0L; var34 < var2; var34++) {
                           ((Class2380)var4).method9715(var34, ((Class2377)var0).method9700(var34));
                        }
                     } else {
                        for (long var35 = 0L; var35 < var2; var35++) {
                           var4.method9685(var35, var0.method9651(var35));
                        }
                     }
                     break;
                  case 9:
                     if (var0.method9635() == Class2178.field14303) {
                        for (long var32 = 0L; var32 < var2; var32++) {
                           ((Class2377)var4).method9703(var32, ((Class2380)var0).method9710(var32));
                        }
                     } else {
                        for (long var33 = 0L; var33 < var2; var33++) {
                           var4.method9687(var33, var0.method9653(var33));
                        }
                     }
                     break;
                  case 10:
                     for (long var31 = 0L; var31 < var2; var31++) {
                        var4.method9670(var31, var0.method9636(var31).toString());
                     }
                     break;
                  case 11:
                     for (long var30 = 0L; var30 < var2; var30++) {
                        var4.method9670(var30, var0.method9636(var30));
                     }
                     break;
                  case 12:
                     for (long var29 = 0L; var29 < var2; var29++) {
                        var4.method9677(var29, var0.method9643(var29));
                     }
                     break;
                  default:
                     throw new IllegalArgumentException("Invalid array type.");
               }
            }
         } else {
            switch (Class8569.field38527[var1.ordinal()]) {
               case 1:
               case 2:
                  for (long var27 = 0L; var27 < var2; var27++) {
                     var4.method9675(var27, var0.method9641(var27));
                  }
                  break;
               case 3:
                  for (long var26 = 0L; var26 < var2; var26++) {
                     var4.method9679(var26, var0.method9645(var26));
                  }
                  break;
               case 4:
                  for (long var25 = 0L; var25 < var2; var25++) {
                     var4.method9681(var25, var0.method9647(var25));
                  }
                  break;
               case 5:
                  for (long var24 = 0L; var24 < var2; var24++) {
                     var4.method9683(var24, var0.method9649(var24));
                  }
                  break;
               case 6:
                  for (long var23 = 0L; var23 < var2; var23++) {
                     var4.method9685(var23, var0.method9651(var23));
                  }
                  break;
               case 7:
                  for (long var22 = 0L; var22 < var2; var22++) {
                     var4.method9687(var22, var0.method9653(var22));
                  }
                  break;
               case 8:
                  if (var0.method9635() == Class2178.field14304) {
                     for (long var20 = 0L; var20 < var2; var20++) {
                        ((Class2380)var4).method9715(var20, ((Class2377)var0).method9700(var20));
                     }
                  } else {
                     for (long var21 = 0L; var21 < var2; var21++) {
                        var4.method9685(var21, var0.method9651(var21));
                     }
                  }
                  break;
               case 9:
                  if (var0.method9635() == Class2178.field14303) {
                     for (long var18 = 0L; var18 < var2; var18++) {
                        ((Class2377)var4).method9703(var18, ((Class2380)var0).method9710(var18));
                     }
                  } else {
                     for (long var19 = 0L; var19 < var2; var19++) {
                        var4.method9687(var19, var0.method9653(var19));
                     }
                  }
                  break;
               case 10:
                  for (long var17 = 0L; var17 < var2; var17++) {
                     var4.method9670(var17, var0.method9636(var17).toString());
                  }
                  break;
               case 11:
                  for (long var16 = 0L; var16 < var2; var16++) {
                     var4.method9670(var16, var0.method9636(var16));
                  }
                  break;
               case 12:
                  for (long var6 = 0L; var6 < var2; var6++) {
                     var4.method9677(var6, var0.method9643(var6));
                  }
                  break;
               default:
                  throw new IllegalArgumentException("Invalid array type.");
            }
         }

         return var4;
      }
   }

   public static Class2373 method28192(Class2373 var0, Class2385 var1) {
      if (var0.field16234 != var1.field16234) {
         throw new IllegalArgumentException("src.length != mask.length");
      } else {
         long var2 = var0.field16234;
         long var4 = 0L;
         int var6 = (int)Class9044.method33604(var2, (long)Class7008.method21726());
         long var7 = var2 / (long)var6;
         ExecutorService var9 = Executors.newCachedThreadPool();
         Future<Integer>[] var10 = new Future[var6];

         for (int var11 = 0; var11 < var6; var11++) {
            long var12 = (long)var11 * var7;
            long var14 = var11 == var6 - 1 ? var2 : var12 + var7;
            var10[var11] = var9.submit(new Class8386(var12, var14, var1));
         }

         try {
            for (int var18 = 0; var18 < var6; var18++) {
               var4 += var10[var18].get();
            }
         } catch (Exception var16) {
            for (long var20 = 0L; var20 < var2; var20++) {
               if (var1.method9641(var20) == 1) {
                  var4++;
               }
            }
         }

         if (var4 <= 0L) {
            return null;
         } else {
            Class2373 var19 = method28189(var0.method9635(), var4, false);
            var7 = 0L;

            for (long var21 = 0L; var21 < var2; var21++) {
               if (var1.method9641(var21) == 1) {
                  var19.method9670(var7++, var0.method9636(var21));
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

      field34961 = (Unsafe)var0;
      if (field34961 == null) {
         throw new Error("Could not obtain access to sun.misc.Unsafe", (Throwable)var1);
      }
   }
}
