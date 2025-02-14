package mapped;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class8075 {
   private static String[] field34665;
   private int field34666 = 0;
   private String field34667 = null;
   private Map<String, String> field34668 = new LinkedHashMap<String, String>();
   private byte[] field34669 = null;

   public Class8075(int var1, String var2, Map var3, byte[] var4) {
      this.field34666 = var1;
      this.field34667 = var2;
      this.field34668 = var3;
      this.field34669 = var4;
   }

   public int method27942() {
      return this.field34666;
   }

   public String method27943() {
      return this.field34667;
   }

   public Map method27944() {
      return this.field34668;
   }

   public String method27945(String var1) {
      return this.field34668.get(var1);
   }

   public byte[] method27946() {
      return this.field34669;
   }
}
