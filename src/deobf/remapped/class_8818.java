package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class class_8818 {
   private static String[] field_45105;
   private final List<String> field_45106 = Lists.newArrayList();

   public class_8818 method_40500(String var1) {
      this.field_45106.add(var1);
      return this;
   }

   public class_7012 method_40499(Writer var1) throws IOException {
      return new class_7012(var1, this.field_45106, null);
   }
}
