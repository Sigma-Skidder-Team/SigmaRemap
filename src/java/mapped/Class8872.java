package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class8872 {
   private String field40079;
   private List<String> field40080 = new ArrayList<String>();
   private Map<String, String> field40081 = new HashMap<String, String>();

   public Class8872(String var1) {
      this.field40079 = var1;
   }

   public String method32279() {
      return this.field40079;
   }

   public Map<String, String> method32280() {
      return this.field40081;
   }

   public List<String> method32281() {
      return this.field40080;
   }

   @Override
   public String toString() {
      return "CompactData: " + this.field40079 + " " + this.field40081;
   }
}
