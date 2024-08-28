package mapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class6039 extends Class6037 {
   private static String[] field26239;
   private static final IntSet field26247 = new IntOpenHashSet(46, 1.0F);
   private final Map<Class9695, Class9344> field26248 = new ConcurrentHashMap<Class9695, Class9344>();

   public Class6039(Class7161 var1) {
      super(var1);
   }

   public void method18685(Class9695 var1, int var2) {
      this.method18686(var1, var2, -1);
   }

   public void method18686(Class9695 var1, int var2, int var3) {
      if (field26247.contains(var2)) {
         this.field26248.put(var1, new Class9344(var2, var3));
      }
   }

   public boolean method18687(int var1) {
      return field26247.contains(var1);
   }

   public boolean method18688(Class9695 var1) {
      return this.field26248.containsKey(var1);
   }

   public Class9344 method18689(Class9695 var1) {
      return this.field26248.get(var1);
   }

   public Class9344 method18690(Class9695 var1) {
      return this.field26248.remove(var1);
   }

   static {
      field26247.add(5266);

      for (int var2 = 0; var2 < 16; var2++) {
         field26247.add(972 + var2);
      }

      for (int var3 = 0; var3 < 20; var3++) {
         field26247.add(6854 + var3);
      }

      for (int var4 = 0; var4 < 4; var4++) {
         field26247.add(7110 + var4);
      }

      for (int var5 = 0; var5 < 5; var5++) {
         field26247.add(5447 + var5);
      }
   }
}
