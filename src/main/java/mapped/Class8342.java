package mapped;

import java.util.Map;

public class Class8342 {
   private Class2148 field35865;
   private Map<String, String> field35866;

   public Class8342(Class2148 var1, Map<String, String> var2) {
      this.field35865 = var1;
      this.field35866 = var2;
   }

   public Class2148 method29248() {
      return this.field35865;
   }

   public Map<String, String> method29249() {
      return this.field35866;
   }

   @Override
   public String toString() {
      return String.format("VersionTagsTuple<%s, %s>", this.field35865, this.field35866);
   }
}
