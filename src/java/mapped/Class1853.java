package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public enum Class1853 {
   field9872("vertex", ".vsh", 35633),
   field9873("fragment", ".fsh", 35632);

   private final String field9874;
   private final String field9875;
   private final int field9876;
   private final Map<String, Class8144> field9877 = Maps.newHashMap();
   private static final Class1853[] field9878 = new Class1853[]{field9872, field9873};

   private Class1853(String var3, String var4, int var5) {
      this.field9874 = var3;
      this.field9875 = var4;
      this.field9876 = var5;
   }

   public String method8094() {
      return this.field9874;
   }

   public String method8095() {
      return this.field9875;
   }

   private int method8096() {
      return this.field9876;
   }

   public Map<String, Class8144> method8097() {
      return this.field9877;
   }

   // $VF: synthetic method
   public static int method8098(Class1853 var0) {
      return var0.method8096();
   }
}
