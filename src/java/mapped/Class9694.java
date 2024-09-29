package mapped;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class9694 {
   private static String[] field45313;

   private Class9694() {
   }

   public static Field method37948(Class var0, Class var1) {
      try {
         Field[] var4 = var0.getDeclaredFields();

         for (int var5 = 0; var5 < var4.length; var5++) {
            Field var6 = var4[var5];
            if (var6.getType() == var1) {
               var6.setAccessible(true);
               return var6;
            }
         }

         return null;
      } catch (Exception var7) {
         return null;
      }
   }

   public static Field[] method37949(Class var0, Class var1) {
      try {
         Field[] var4 = var0.getDeclaredFields();
         return method37950(var4, var1);
      } catch (Exception var5) {
         return null;
      }
   }

   public static Field[] method37950(Field[] var0, Class var1) {
      try {
         ArrayList<Field> var4 = new ArrayList();

         for (int var5 = 0; var5 < var0.length; var5++) {
            Field var6 = var0[var5];
            if (var6.getType() == var1) {
               var6.setAccessible(true);
               var4.add(var6);
            }
         }

         return var4.toArray(new Field[var4.size()]);
      } catch (Exception var7) {
         return null;
      }
   }

   public static Field[] method37951(Class var0, Field var1, Class var2) {
      try {
         Field[] var5 = var0.getDeclaredFields();
         List<Field> var6 = Arrays.<Field>asList(var5);
         int var7 = var6.indexOf(var1);
         if (var7 < 0) {
            return new Field[0];
         } else {
            List<Field> var8 = var6.subList(var7 + 1, var6.size());
            Field[] var9 = var8.toArray(new Field[var8.size()]);
            return method37950(var9, var2);
         }
      } catch (Exception var10) {
         return null;
      }
   }

   public static Field[] method37952(Object var0, Field[] var1, Class var2, Object var3) {
      try {
         ArrayList<Field> var6 = new ArrayList();

         for (int var7 = 0; var7 < var1.length; var7++) {
            Field var8 = var1[var7];
            if (var8.getType() == var2) {
               boolean var9 = Modifier.isStatic(var8.getModifiers());
               if ((var0 != null || var9) && (var0 == null || !var9)) {
                  var8.setAccessible(true);
                  Object var10 = var8.get(var0);
                  if (var10 == var3) {
                     var6.add(var8);
                  } else if (var10 != null && var3 != null && var10.equals(var3)) {
                     var6.add(var8);
                  }
               }
            }
         }

         return var6.toArray(new Field[var6.size()]);
      } catch (Exception var11) {
         return null;
      }
   }

   public static Field method37953(Class var0, Class var1, int var2) {
      Field[] var5 = method37949(var0, var1);
      return var2 >= 0 && var2 < var5.length ? var5[var2] : null;
   }

   public static Field method37954(Class var0, Field var1, Class var2, int var3) {
      Field[] var6 = method37951(var0, var1, var2);
      return var3 >= 0 && var3 < var6.length ? var6[var3] : null;
   }

   public static Object method37955(Object var0, Class var1, Class var2) {
      Class6633 var5 = method37959(var1, var2);
      if (var5 != null) {
         return var5.exists() ? Reflector.method35072(var0, var5) : null;
      } else {
         return null;
      }
   }

   public static Object method37956(Object var0, Class var1, Class var2, int var3) {
      Class6633 var6 = method37960(var1, var2, var3);
      if (var6 != null) {
         return var6.exists() ? Reflector.method35072(var0, var6) : null;
      } else {
         return null;
      }
   }

   public static boolean method37957(Object var0, Class var1, Class var2, Object var3) {
      Class6633 var6 = method37959(var1, var2);
      if (var6 != null) {
         return var6.exists() ? Reflector.method35082(var0, var6, var3) : false;
      } else {
         return false;
      }
   }

   public static boolean method37958(Object var0, Class var1, Class var2, int var3, Object var4) {
      Class6633 var7 = method37960(var1, var2, var3);
      if (var7 != null) {
         return var7.exists() ? Reflector.method35082(var0, var7, var4) : false;
      } else {
         return false;
      }
   }

   public static Class6633 method37959(Class var0, Class var1) {
      Field var4 = method37948(var0, var1);
      if (var4 != null) {
         Class6636 var5 = new Class6636(var0);
         return new Class6633(var5, var4.getName());
      } else {
         return null;
      }
   }

   public static Class6633 method37960(Class var0, Class var1, int var2) {
      Field var5 = method37953(var0, var1, var2);
      if (var5 != null) {
         Class6636 var6 = new Class6636(var0);
         return new Class6633(var6, var5.getName());
      } else {
         return null;
      }
   }
}
