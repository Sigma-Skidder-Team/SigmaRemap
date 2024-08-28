package mapped;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class1694 implements AutoCloseable {
   private static String[] field9229;
   private final Map<ResourceLocation, Class289> field9230;

   public Class1694(Collection<Class289> var1) {
      this.field9230 = var1.stream().collect(Collectors.toMap(Class289::method1100, Function.<Class289>identity()));
   }

   public Class289 method7288(ResourceLocation var1) {
      return this.field9230.get(var1);
   }

   public Class1713 method7289(Class7826 var1) {
      return this.field9230.get(var1.method26196()).method1098(var1.method26197());
   }

   @Override
   public void close() {
      this.field9230.values().forEach(Class289::method1099);
      this.field9230.clear();
   }
}
