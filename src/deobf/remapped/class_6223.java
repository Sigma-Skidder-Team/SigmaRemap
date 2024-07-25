package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_6223 {
   private String field_31790;
   private List<String> field_31793 = new ArrayList<String>();
   private Map<String, String> field_31792 = new HashMap<String, String>();

   public class_6223(String var1) {
      this.field_31790 = var1;
   }

   public String method_28451() {
      return this.field_31790;
   }

   public Map<String, String> method_28449() {
      return this.field_31792;
   }

   public List<String> method_28450() {
      return this.field_31793;
   }

   @Override
   public String toString() {
      return "CompactData: " + this.field_31790 + " " + this.field_31792;
   }
}
