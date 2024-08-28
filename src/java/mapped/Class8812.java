package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class Class8812 {
   private static String[] field39647;
   private final String field39648;
   private final ImmutableList<Class2023> field39649;

   public static Class8812 method31814(String var0) {
      return Registry.field16076.method9184(ResourceLocation.method8289(var0));
   }

   public Class8812(Class2023... var1) {
      this((String)null, var1);
   }

   public Class8812(String var1, Class2023... var2) {
      this.field39648 = var1;
      this.field39649 = ImmutableList.copyOf(var2);
   }

   public String method31815(String var1) {
      return var1 + (this.field39648 != null ? this.field39648 : Registry.field16076.method9181(this).method8292());
   }

   public List<Class2023> method31816() {
      return this.field39649;
   }

   public boolean method31817() {
      if (!this.field39649.isEmpty()) {
         UnmodifiableIterator var3 = this.field39649.iterator();

         while (var3.hasNext()) {
            Class2023 var4 = (Class2023)var3.next();
            if (var4.method8627().method22292()) {
               return true;
            }
         }
      }

      return false;
   }
}
