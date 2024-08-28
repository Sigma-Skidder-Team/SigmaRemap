package mapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Class7285 {
   private static String[] field31258;
   private final List<Class8266> field31259;
   private final Map<Block, List<Class8266>> field31260 = Maps.newHashMap();

   public Class7285(List<Class8266> var1) {
      this.field31259 = var1;
   }

   public List<Class8266> method22980() {
      return this.field31259;
   }

   public List<Class8266> method22981(Block var1) {
      return this.field31260
         .computeIfAbsent(
            var1, var1x -> this.field31259.stream().filter(var1xx -> var1xx.field35531.method23448(var1x)).collect(Collectors.<Class8266>toList())
         );
   }
}
