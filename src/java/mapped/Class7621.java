package mapped;

import com.mentalfrostbyte.jello.Client;
import net.minecraft.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
public class Class7621 extends Class7620 {
   private Method field32683;
   private Object field32684;

   private static boolean method24975(Method var0) {
      for (Class var6 : var0.getParameterTypes()) {
         if (!var6.isPrimitive() && var6 != String.class) {
            return false;
         }
      }

      return true;
   }

   public static boolean method24976(Method var0) {
      return !var0.getDeclaringClass().isAnnotationPresent(Class5635.class) ? false : var0.isAnnotationPresent(Class5638.class) && method24975(var0);
   }

   public Class7621(Method var1, Object var2) {
      this.field32683 = var1;
      this.field32684 = var2;
      if (StringUtils.isNullOrEmpty(this.field32682 = var1.<Class5638>getAnnotation(Class5638.class).method17769())) {
         this.field32682 = var1.getName();
      }
   }

   private Object method24977(String[] var1, int var2, Class var3) {
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
   public void method24971(String var1, String... var2) {
      try {
         if (var2.length == 0) {
            this.field32683.invoke(this.field32684);
         } else {
            Object[] var5 = new Object[var2.length];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = this.method24977(var2, var6, this.field32683.getParameterTypes()[var6]);
            }

            this.field32683.invoke(this.field32684, var5);
         }
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var7) {
         Client.getInstance().getLogger().error("Unable to invoke " + this.field32684.getClass().getName() + "::" + this.field32683.getName());
         var7.printStackTrace();
      }
   }

   @Override
   public String method24973(String var1, String... var2) {
      StringBuilder var5 = new StringBuilder(var1);

      int var6;
      for (var6 = 0; var6 < var2.length && var6 < this.field32683.getParameterCount(); var6++) {
         var5.append(" ").append(var2[var6]);
      }

      while (var6 < this.field32683.getParameterCount()) {
         var5.append(" ").append(Class7619.method24972(this.field32683.getParameterTypes()[var6]));
         var6++;
      }

      return var5.toString();
   }
}
