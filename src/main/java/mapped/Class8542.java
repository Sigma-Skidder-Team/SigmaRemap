package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class Class8542 {
   private static String[] field38399;

   public static ModelRenderer method30390(Iterator<ModelRenderer> var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return null;
      } else {
         for (int var4 = 0; var4 < var1; var4++) {
            if (!var0.hasNext()) {
               return null;
            }

            ModelRenderer var5 = (ModelRenderer)var0.next();
         }

         return var0.hasNext() ? (ModelRenderer)var0.next() : null;
      }
   }

   public static ModelRenderer method30391(ImmutableList<ModelRenderer> var0, int var1) {
      if (var0 != null) {
         if (var1 >= 0) {
            return var1 < var0.size() ? (ModelRenderer)var0.get(var1) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
