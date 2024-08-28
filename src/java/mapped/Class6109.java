package mapped;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class Class6109 {
   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("{");

      for (Field var7 : this.getClass().getFields()) {
         if (!method18872(var7)) {
            try {
               var3.append(method18871(var7)).append("=").append(var7.get(this)).append(" ");
            } catch (IllegalAccessException var9) {
            }
         }
      }

      var3.deleteCharAt(var3.length() - 1);
      var3.append('}');
      return var3.toString();
   }

   private static String method18871(Field var0) {
      SerializedName var3 = var0.<SerializedName>getAnnotation(SerializedName.class);
      return var3 == null ? var0.getName() : var3.value();
   }

   private static boolean method18872(Field var0) {
      return Modifier.isStatic(var0.getModifiers());
   }
}
