package mapped;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class8648 {
   private final Map<Class<? extends Class5402>, Class5402> field38929 = new HashMap<Class<? extends Class5402>, Class5402>();
   private final List<Class<? extends Class5402>> field38930 = new ArrayList<Class<? extends Class5402>>();

   public void method31081(Class<? extends Class5402> var1) {
      this.field38930.add(var1);
   }

   public <T extends Class5402> void method31082(Class<T> var1, T var2) {
      this.field38929.put(var1, var2);
   }

   public <T extends Class5402> void method31083(Class<T> var1, T var2) {
      this.field38930.remove(var1);
      this.field38929.put(var1, var2);
   }

   @Nullable
   public <T extends Class5402> T method31084(Class<T> var1) {
      Class5402 var4 = this.field38929.get(var1);
      if (var4 == null) {
         if (!this.field38930.contains(var1)) {
            return null;
         } else {
            throw new IllegalStateException("There was no provider for " + var1 + ", one is required!");
         }
      } else {
         return (T)var4;
      }
   }
}
