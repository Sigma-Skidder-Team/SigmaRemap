package mapped;

import com.mentalfrostbyte.jello.Client;
import net.minecraft.util.StringUtils;

import java.lang.reflect.Field;

@Deprecated
public class Class7619 extends Class7620 {
   private Field field32680;
   private Object field32681;

   public static boolean method24969(Field var0) {
      return !var0.getDeclaringClass().isAnnotationPresent(Class5635.class)
         ? false
         : (var0.getType().isPrimitive() || var0.getType() == String.class) && var0.isAnnotationPresent(Class5640.class);
   }

   public Class7619(Field var1, Object var2) {
      this.field32681 = var2;
      this.field32680 = var1;
      var1.setAccessible(true);
      if (StringUtils.isNullOrEmpty(this.field32682 = var1.<Class5640>getAnnotation(Class5640.class).method17771())) {
         this.field32682 = var1.getName();
      }
   }

   public Field method24970() {
      return this.field32680;
   }

   @Override
   public void method24971(String var1, String... var2) {
      try {
         if (this.field32680.getType() == byte.class) {
            this.field32680.setByte(this.field32681, Byte.parseByte(var2[0]));
         } else if (this.field32680.getType() == char.class) {
            this.field32680.setChar(this.field32681, var2[0].charAt(0));
         } else if (this.field32680.getType() == boolean.class) {
            this.field32680.setBoolean(this.field32681, Boolean.parseBoolean(var2[0]));
         } else if (this.field32680.getType() == short.class) {
            this.field32680.setShort(this.field32681, Short.parseShort(var2[0]));
         } else if (this.field32680.getType() == int.class) {
            this.field32680.setInt(this.field32681, Integer.parseInt(var2[0]));
         } else if (this.field32680.getType() == long.class) {
            this.field32680.setLong(this.field32681, Long.parseLong(var2[0]));
         } else if (this.field32680.getType() == float.class) {
            this.field32680.setFloat(this.field32681, Float.parseFloat(var2[0]));
         } else if (this.field32680.getType() == double.class) {
            this.field32680.setDouble(this.field32681, Double.parseDouble(var2[0]));
         } else {
            if (this.field32680.getType() != String.class) {
               throw new IllegalStateException("Should never have gotten here, forgot to implement " + this.field32680.getType().getName() + "?");
            }

            this.field32680.set(this.field32681, var2[0]);
         }
      } catch (Exception var6) {
         Client.getInstance()
            .getLogger()
            .error(var2[0] + "is an invalid input for variable " + this.field32681.getClass().getName() + "::" + this.field32680.getName());
         var6.printStackTrace();
      }
   }

   public static String method24972(Class var0) {
      if (var0 == byte.class || var0 == short.class || var0 == int.class || var0 == long.class) {
         return "[number]";
      } else if (var0 == char.class) {
         return "[char]";
      } else if (var0 == float.class || var0 == double.class) {
         return "[decimal]";
      } else {
         return var0 != String.class && var0 != Object.class ? null : "[string]";
      }
   }

   @Override
   public String method24973(String var1, String... var2) {
      StringBuilder var5 = new StringBuilder(var1);
      if (var2 != null) {
         if (var2.length > 0) {
            for (String var9 : var2) {
               var5.append(" ").append(var9);
            }
         } else {
            var5.append(" ").append(method24972(this.field32680.getType()));
         }
      }

      return var5.toString();
   }
}
