package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class5883 extends Class5876<Class5883> {
   private static String[] field25685;
   private final Map<Class7144, Class6872> field25686 = Maps.newHashMap();

   public Class5883 method18305() {
      return this;
   }

   public Class5883 method18318(Class7144 var1, Class6872 var2) {
      this.field25686.put(var1, var2);
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return new Class133(this.method18306(), this.field25686);
   }
}
