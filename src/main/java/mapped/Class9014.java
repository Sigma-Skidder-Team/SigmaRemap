package mapped;

import java.util.Collection;

public interface Class9014 {
   Class9014 field41220 = var0 -> {
      String[][] var3 = new String[var0.size()][];
      int var4 = 0;

      for (String var6 : var0) {
         var3[var4++] = new String[]{var6};
      }

      return var3;
   };
   Class9014 field41221 = var0 -> new String[][]{var0.<String>toArray(new String[0])};

   String[][] method33310(Collection<String> var1);
}
