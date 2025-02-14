package mapped;

import java.util.LinkedHashMap;
import java.util.Set;

public class Class6188 implements Class6180 {
   private static String[] field27631;
   public final Class4499 field27632;

   public Class6188(Class4499 var1) {
      this.field27632 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      LinkedHashMap var4 = new LinkedHashMap();

      for (Object var7 : (Set)var1) {
         var4.put(var7, null);
      }

      return this.field27632.method14195(this.field27632.method14203(var1.getClass(), Class9757.field45633), var4, Class2214.field14477);
   }
}
