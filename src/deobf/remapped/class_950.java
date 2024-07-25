package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_950 implements AutoCloseable {
   private static final Logger field_4890 = LogManager.getLogger();
   public static final class_4639 field_4894 = new class_4639("minecraft", "missing");
   private final class_6988 field_4895;
   private final Map<class_4639, class_6988> field_4892 = Maps.newHashMap();
   private final class_7889 field_4893;
   private Map<class_4639, class_4639> field_4896 = ImmutableMap.of();
   private final class_2231 field_4897 = new class_3634(this);

   public class_950(class_7889 var1) {
      this.field_4893 = var1;
      this.field_4895 = Util.<class_6988>method_44659(
         new class_6988(var1, field_4894), var0 -> var0.method_31979(Lists.newArrayList(new class_3293[]{new class_8365()}))
      );
   }

   public void method_4191(Map<class_4639, class_4639> var1) {
      this.field_4896 = var1;
   }

   public TextRenderer method_4190() {
      return new TextRenderer(var1 -> this.field_4892.getOrDefault(this.field_4896.getOrDefault(var1, var1), this.field_4895));
   }

   public class_2231 method_4189() {
      return this.field_4897;
   }

   @Override
   public void close() {
      this.field_4892.values().forEach(class_6988::close);
      this.field_4895.close();
   }
}
