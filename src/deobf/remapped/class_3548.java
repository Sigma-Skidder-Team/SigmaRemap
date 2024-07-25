package remapped;

import java.util.LinkedHashMap;
import java.util.Map;

public class class_3548 {
   private static String[] field_17364;
   private int field_17360 = 0;
   private String field_17361 = null;
   private Map<String, String> field_17362 = new LinkedHashMap<String, String>();
   private byte[] field_17363 = null;

   public class_3548(int var1, String var2, Map var3, byte[] var4) {
      this.field_17360 = var1;
      this.field_17361 = var2;
      this.field_17362 = var3;
      this.field_17363 = var4;
   }

   public int method_16508() {
      return this.field_17360;
   }

   public String method_16511() {
      return this.field_17361;
   }

   public Map method_16513() {
      return this.field_17362;
   }

   public String method_16509(String var1) {
      return this.field_17362.get(var1);
   }

   public byte[] method_16512() {
      return this.field_17363;
   }
}
