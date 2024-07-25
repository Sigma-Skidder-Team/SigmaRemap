package remapped;

import java.util.Collection;

public interface class_6701 {
   class_6701 field_34597 = var0 -> {
      String[][] var3 = new String[var0.size()][];
      int var4 = 0;

      for (String var6 : var0) {
         var3[var4++] = new String[]{var6};
      }

      return var3;
   };
   class_6701 field_34598 = var0 -> new String[][]{var0.<String>toArray(new String[0])};

   String[][] method_30697(Collection<String> var1);
}
