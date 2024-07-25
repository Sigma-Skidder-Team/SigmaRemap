package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;

public class class_3698 {
   private static String[] field_18153;
   private Int2ObjectMap<class_9396> field_18152 = new Int2ObjectOpenHashMap();
   private List<class_9396> field_18155 = new ArrayList<class_9396>();
   private boolean field_18154 = false;

   public class_9396 method_17188(int var1, class_9396 var2) {
      class_9396 var5 = (class_9396)this.field_18152.put(var1, var2);
      this.method_17192();
      return var5;
   }

   public class_9396 method_17186(int var1) {
      return (class_9396)this.field_18152.get(var1);
   }

   public int method_17185() {
      return this.field_18152.size();
   }

   public class_9396 method_17187(int var1) {
      class_9396 var4 = (class_9396)this.field_18152.remove(var1);
      if (var4 != null) {
         this.method_17192();
      }

      return var4;
   }

   public void method_17189() {
      this.field_18152.clear();
      this.field_18155.clear();
      this.method_17192();
   }

   private void method_17192() {
      this.field_18154 = true;
   }

   public List<class_9396> method_17191() {
      if (this.field_18154) {
         this.field_18155.clear();
         this.field_18155.addAll(this.field_18152.values());
         this.field_18154 = false;
      }

      return this.field_18155;
   }
}
