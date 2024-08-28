package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class Class9143 {
   private static String[] field42016;
   private final List<Class6690> field42017 = Lists.newArrayList();

   public Class9143 method34155(Class7202 var1, int var2) {
      if (var1 != null) {
         this.field42017.add(new Class6690(var1, var2));
      }

      return this;
   }

   @Nullable
   public Class7202 method34156() {
      if (!this.field42017.isEmpty()) {
         return (Class7202)(this.field42017.size() != 1 ? new Class7204(this.field42017) : this.field42017.get(0).field29307);
      } else {
         return null;
      }
   }
}
