package remapped;

import java.lang.reflect.Field;

@Deprecated
public class class_2323 extends class_7671 {
   private Field field_11622;
   private Object field_11624;

   public static boolean method_10669(Field var0) {
      return !var0.getDeclaringClass().isAnnotationPresent(class_4747.class)
         ? false
         : (var0.getType().isPrimitive() || var0.getType() == String.class) && var0.isAnnotationPresent(class_2246.class);
   }

   public class_2323(Field var1, Object var2) {
      this.field_11624 = var2;
      this.field_11622 = var1;
      var1.setAccessible(true);
      if (class_6660.method_30576(this.field_38995 = var1.<class_2246>getAnnotation(class_2246.class).method_10327())) {
         this.field_38995 = var1.getName();
      }
   }

   public Field method_10670() {
      return this.field_11622;
   }

   @Override
   public void method_34759(String var1, String... var2) {
      try {
         if (this.field_11622.getType() == byte.class) {
            this.field_11622.setByte(this.field_11624, Byte.parseByte(var2[0]));
         } else if (this.field_11622.getType() == char.class) {
            this.field_11622.setChar(this.field_11624, var2[0].charAt(0));
         } else if (this.field_11622.getType() == boolean.class) {
            this.field_11622.setBoolean(this.field_11624, Boolean.parseBoolean(var2[0]));
         } else if (this.field_11622.getType() == short.class) {
            this.field_11622.setShort(this.field_11624, Short.parseShort(var2[0]));
         } else if (this.field_11622.getType() == int.class) {
            this.field_11622.setInt(this.field_11624, Integer.parseInt(var2[0]));
         } else if (this.field_11622.getType() == long.class) {
            this.field_11622.setLong(this.field_11624, Long.parseLong(var2[0]));
         } else if (this.field_11622.getType() == float.class) {
            this.field_11622.setFloat(this.field_11624, Float.parseFloat(var2[0]));
         } else if (this.field_11622.getType() == double.class) {
            this.field_11622.setDouble(this.field_11624, Double.parseDouble(var2[0]));
         } else {
            if (this.field_11622.getType() != String.class) {
               throw new IllegalStateException("Should never have gotten here, forgot to implement " + this.field_11622.getType().getName() + "?");
            }

            this.field_11622.set(this.field_11624, var2[0]);
         }
      } catch (Exception var6) {
         class_727.method_3328()
            .method_3326()
            .method_12864(var2[0] + "is an invalid input for variable " + this.field_11624.getClass().getName() + "::" + this.field_11622.getName());
         var6.printStackTrace();
      }
   }

   public static String method_10668(Class var0) {
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
   public String method_34762(String var1, String... var2) {
      StringBuilder var5 = new StringBuilder(var1);
      if (var2 != null) {
         if (var2.length > 0) {
            for (String var9 : var2) {
               var5.append(" ").append(var9);
            }
         } else {
            var5.append(" ").append(method_10668(this.field_11622.getType()));
         }
      }

      return var5.toString();
   }
}
