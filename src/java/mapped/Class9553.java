package mapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Class9553 {
   private static String[] field44507;
   private final List<String> field44508 = Lists.newArrayList();

   public Class9553 method37003(String var1) {
      this.field44508.add(var1);
      return this;
   }

   public Class9101 method37004(Writer var1) throws IOException {
      return new Class9101(var1, this.field44508);
   }
}
