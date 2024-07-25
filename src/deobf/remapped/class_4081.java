package remapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class class_4081 extends class_1174 {
   private static String[] field_19863;
   private static final IntSet field_19861 = new IntOpenHashSet(46, 1.0F);
   private final Map<class_9371, class_8012> field_19862 = new ConcurrentHashMap<class_9371, class_8012>();

   public class_4081(class_1455 var1) {
      super(var1);
   }

   public void method_18812(class_9371 var1, int var2) {
      this.method_18813(var1, var2, -1);
   }

   public void method_18813(class_9371 var1, int var2, int var3) {
      if (field_19861.contains(var2)) {
         this.field_19862.put(var1, new class_8012(var2, var3));
      }
   }

   public boolean method_18810(int var1) {
      return field_19861.contains(var1);
   }

   public boolean method_18811(class_9371 var1) {
      return this.field_19862.containsKey(var1);
   }

   public class_8012 method_18809(class_9371 var1) {
      return this.field_19862.get(var1);
   }

   public class_8012 method_18814(class_9371 var1) {
      return this.field_19862.remove(var1);
   }

   static {
      field_19861.add(5266);

      for (int var2 = 0; var2 < 16; var2++) {
         field_19861.add(972 + var2);
      }

      for (int var3 = 0; var3 < 20; var3++) {
         field_19861.add(6854 + var3);
      }

      for (int var4 = 0; var4 < 4; var4++) {
         field_19861.add(7110 + var4);
      }

      for (int var5 = 0; var5 < 5; var5++) {
         field_19861.add(5447 + var5);
      }
   }
}
