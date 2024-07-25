package remapped;

import java.util.ArrayList;
import java.util.List;

public final class class_2305 {
   private final List<String> field_11502 = new ArrayList<String>();
   private final List<String> field_11501 = new ArrayList<String>();

   public class_2305 method_10600(String var1, String var2) {
      this.field_11502.add(class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
      this.field_11501.add(class_1672.method_7475(var2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
      return this;
   }

   public class_2305 method_10597(String var1, String var2) {
      this.field_11502.add(class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
      this.field_11501.add(class_1672.method_7475(var2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
      return this;
   }

   public class_7613 method_10598() {
      return new class_7613(this.field_11502, this.field_11501);
   }
}
