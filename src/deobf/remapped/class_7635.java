package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
public class class_7635 extends class_7671 {
   private Method field_38844;
   private Object field_38845;

   private static boolean method_34597(Method var0) {
      for (Class var6 : var0.getParameterTypes()) {
         if (!var6.isPrimitive() && var6 != String.class) {
            return false;
         }
      }

      return true;
   }

   public static boolean method_34598(Method var0) {
      return !var0.getDeclaringClass().isAnnotationPresent(class_4747.class) ? false : var0.isAnnotationPresent(class_4515.class) && method_34597(var0);
   }

   public class_7635(Method var1, Object var2) {
      this.field_38844 = var1;
      this.field_38845 = var2;
      if (class_6660.method_30576(this.field_38995 = var1.<class_4515>getAnnotation(class_4515.class).method_20979())) {
         this.field_38995 = var1.getName();
      }
   }

   private Object method_34596(String[] var1, int var2, Class var3) {
      if (var2 < var1.length) {
         if (var3 != byte.class) {
            if (var3 != char.class) {
               if (var3 != short.class) {
                  if (var3 != int.class) {
                     if (var3 != long.class) {
                        if (var3 != float.class) {
                           if (var3 != double.class) {
                              return var3 != String.class && var3 != Object.class ? null : var1[var2];
                           } else {
                              return Double.parseDouble(var1[var2]);
                           }
                        } else {
                           return Float.parseFloat(var1[var2]);
                        }
                     } else {
                        return Long.parseLong(var1[var2]);
                     }
                  } else {
                     return Integer.parseInt(var1[var2]);
                  }
               } else {
                  return Short.parseShort(var1[var2]);
               }
            } else {
               return var1[var2].charAt(0);
            }
         } else {
            return Byte.parseByte(var1[var2]);
         }
      } else {
         return null;
      }
   }

   @Override
   public void method_34759(String var1, String... var2) {
      try {
         if (var2.length == 0) {
            this.field_38844.invoke(this.field_38845);
         } else {
            Object[] var5 = new Object[var2.length];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = this.method_34596(var2, var6, this.field_38844.getParameterTypes()[var6]);
            }

            this.field_38844.invoke(this.field_38845, var5);
         }
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var7) {
         SigmaMainClass.method_3328().method_3326().method_12864("Unable to invoke " + this.field_38845.getClass().getName() + "::" + this.field_38844.getName());
         var7.printStackTrace();
      }
   }

   @Override
   public String method_34762(String var1, String... var2) {
      StringBuilder var5 = new StringBuilder(var1);

      int var6;
      for (var6 = 0; var6 < var2.length && var6 < this.field_38844.getParameterCount(); var6++) {
         var5.append(" ").append(var2[var6]);
      }

      while (var6 < this.field_38844.getParameterCount()) {
         var5.append(" ").append(class_2323.method_10668(this.field_38844.getParameterTypes()[var6]));
         var6++;
      }

      return var5.toString();
   }
}
