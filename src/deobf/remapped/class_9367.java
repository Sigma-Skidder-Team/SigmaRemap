package remapped;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class_9367 {
   private static String[] field_47904;

   private class_9367() {
   }

   public static Field method_43329(Class var0, Class var1) {
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

   public static Field[] method_43324(Class var0, Class var1) {
      try {
         Field[] var4 = var0.getDeclaredFields();
         return method_43326(var4, var1);
      } catch (Exception var5) {
         return null;
      }
   }

   public static Field[] method_43326(Field[] var0, Class var1) {
      try {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var0.length; var5++) {
            Field var6 = var0[var5];
            if (var6.getType() == var1) {
               var6.setAccessible(true);
               var4.add(var6);
            }
         }

         return var4.<Field>toArray(new Field[var4.size()]);
      } catch (Exception var7) {
         return null;
      }
   }

   public static Field[] method_43331(Class var0, Field var1, Class var2) {
      try {
         Field[] var5 = var0.getDeclaredFields();
         List var6 = Arrays.<Field>asList(var5);
         int var7 = var6.indexOf(var1);
         if (var7 < 0) {
            return new Field[0];
         } else {
            List var8 = var6.subList(var7 + 1, var6.size());
            Field[] var9 = var8.<Field>toArray(new Field[var8.size()]);
            return method_43326(var9, var2);
         }
      } catch (Exception var10) {
         return null;
      }
   }

   public static Field[] method_43325(Object var0, Field[] var1, Class var2, Object var3) {
      try {
         ArrayList var6 = new ArrayList();

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

         return var6.<Field>toArray(new Field[var6.size()]);
      } catch (Exception var11) {
         return null;
      }
   }

   public static Field method_43330(Class var0, Class var1, int var2) {
      Field[] var5 = method_43324(var0, var1);
      return var2 >= 0 && var2 < var5.length ? var5[var2] : null;
   }

   public static Field method_43320(Class var0, Field var1, Class var2, int var3) {
      Field[] var6 = method_43331(var0, var1, var2);
      return var3 >= 0 && var3 < var6.length ? var6[var3] : null;
   }

   public static Object method_43327(Object var0, Class var1, Class var2) {
      class_1790 var5 = method_43318(var1, var2);
      if (var5 != null) {
         return var5.method_7978() ? class_7860.method_35557(var0, var5) : null;
      } else {
         return null;
      }
   }

   public static Object method_43328(Object var0, Class var1, Class var2, int var3) {
      class_1790 var6 = method_43319(var1, var2, var3);
      if (var6 != null) {
         return var6.method_7978() ? class_7860.method_35557(var0, var6) : null;
      } else {
         return null;
      }
   }

   public static boolean method_43323(Object var0, Class var1, Class var2, Object var3) {
      class_1790 var6 = method_43318(var1, var2);
      if (var6 != null) {
         return var6.method_7978() ? class_7860.method_35561(var0, var6, var3) : false;
      } else {
         return false;
      }
   }

   public static boolean method_43322(Object var0, Class var1, Class var2, int var3, Object var4) {
      class_1790 var7 = method_43319(var1, var2, var3);
      if (var7 != null) {
         return var7.method_7978() ? class_7860.method_35561(var0, var7, var4) : false;
      } else {
         return false;
      }
   }

   public static class_1790 method_43318(Class var0, Class var1) {
      Field var4 = method_43329(var0, var1);
      if (var4 != null) {
         class_9859 var5 = new class_9859(var0);
         return new class_1790(var5, var4.getName());
      } else {
         return null;
      }
   }

   public static class_1790 method_43319(Class var0, Class var1, int var2) {
      Field var5 = method_43330(var0, var1, var2);
      if (var5 != null) {
         class_9859 var6 = new class_9859(var0);
         return new class_1790(var6, var5.getName());
      } else {
         return null;
      }
   }
}
