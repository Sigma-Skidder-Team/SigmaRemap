package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

public class class_4167 {
   private static String[] field_20270;
   private ConcurrentMap<String, ConcurrentLinkedQueue<class_6224>> field_20269 = new ConcurrentHashMap<String, ConcurrentLinkedQueue<class_6224>>();

   public class_4167 method_19329(String var1, class_6224 var2) {
      ConcurrentLinkedQueue var5 = this.field_20269.get(var1);
      if (var5 == null) {
         var5 = new ConcurrentLinkedQueue();
         ConcurrentLinkedQueue var6 = this.field_20269.putIfAbsent(var1, var5);
         if (var6 != null) {
            var5 = var6;
         }
      }

      var5.add(var2);
      return this;
   }

   public class_4167 method_19331(String var1, class_6224 var2) {
      this.method_19329(var1, new class_2429(this, var1, var2));
      return this;
   }

   public class_4167 method_19326() {
      this.field_20269.clear();
      return this;
   }

   public class_4167 method_19327(String var1) {
      this.field_20269.remove(var1);
      return this;
   }

   public class_4167 method_19328(String var1, class_6224 var2) {
      ConcurrentLinkedQueue var5 = this.field_20269.get(var1);
      if (var5 != null) {
         Iterator var6 = var5.iterator();

         while (var6.hasNext()) {
            class_6224 var7 = (class_6224)var6.next();
            if (method_19330(var2, var7)) {
               var6.remove();
               break;
            }
         }
      }

      return this;
   }

   private static boolean method_19330(class_6224 var0, class_6224 var1) {
      if (!var0.equals(var1)) {
         return !(var1 instanceof class_2429) ? false : var0.equals(((class_2429)var1).field_12090);
      } else {
         return true;
      }
   }

   public class_4167 method_19325(String var1, Object... var2) {
      ConcurrentLinkedQueue var5 = this.field_20269.get(var1);
      if (var5 != null) {
         for (class_6224 var7 : var5) {
            var7.method_28452(var2);
         }
      }

      return this;
   }

   public List<class_6224> method_19323(String var1) {
      ConcurrentLinkedQueue var4 = this.field_20269.get(var1);
      return var4 == null ? new ArrayList<class_6224>(0) : new ArrayList<class_6224>(var4);
   }

   public boolean method_19324(String var1) {
      ConcurrentLinkedQueue var4 = this.field_20269.get(var1);
      return var4 != null && !var4.isEmpty();
   }
}
