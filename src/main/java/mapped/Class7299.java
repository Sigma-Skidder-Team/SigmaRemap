package mapped;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class Class7299 implements Class7292 {
   private byte[] field31279;
   private TreeMap<String, String> field31280 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

   @Override
   public Iterator<String> method23064() {
      return Collections.<String>unmodifiableSet(this.field31280.keySet()).iterator();
   }

   @Override
   public String method23065(String var1) {
      String var4 = this.field31280.get(var1);
      return var4 != null ? var4 : "";
   }

   @Override
   public byte[] method23067() {
      return this.field31279;
   }

   @Override
   public void method23060(byte[] var1) {
      this.field31279 = var1;
   }

   @Override
   public void method23061(String var1, String var2) {
      this.field31280.put(var1, var2);
   }

   @Override
   public boolean method23066(String var1) {
      return this.field31280.containsKey(var1);
   }
}
