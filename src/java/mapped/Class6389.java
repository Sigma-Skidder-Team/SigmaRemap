package mapped;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class Class6389 {
   private final List<Class9723> field27970 = new ArrayList<Class9723>();

   public Class6389 method19420(String var1, String... var2) {
      if (var1 == null) {
         throw new NullPointerException("pattern == null");
      } else {
         for (String var8 : var2) {
            this.field27970.add(new Class9723(var1, var8));
         }

         return this;
      }
   }

   public Class8388 method19421() {
      return new Class8388(new LinkedHashSet<Class9723>(this.field27970), null);
   }
}
