package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class class_591 {
   private String field_3429;
   private final List<String> field_3427 = Lists.newArrayList();

   private class_591() {
   }

   private void method_2779(String var1) {
      this.field_3427.add(0, var1);
   }

   public String method_2778() {
      return StringUtils.join(this.field_3427, "->");
   }

   @Override
   public String toString() {
      if (this.field_3429 == null) {
         return !this.field_3427.isEmpty() ? "(Unknown file) " + this.method_2778() : "(Unknown file)";
      } else {
         return !this.field_3427.isEmpty() ? this.field_3429 + " " + this.method_2778() : this.field_3429;
      }
   }
}
