package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_3604 implements Comparable<class_3604> {
   private final Map<String, class_8984> field_17619 = Maps.newHashMap();
   private String[][] field_17621 = new String[0][];

   public void method_16809(Map<String, class_7353> var1, String[][] var2) {
      Set var5 = var1.keySet();
      this.field_17619.entrySet().removeIf(var1x -> !var5.contains(var1x.getKey()));

      for (String var7 : var5) {
         if (!this.field_17619.containsKey(var7)) {
            this.field_17619.put(var7, new class_8984());
         }
      }

      this.field_17621 = var2;
   }

   public boolean method_16811() {
      if (this.field_17621.length == 0) {
         return false;
      } else {
         for (String[] var6 : this.field_17621) {
            boolean var7 = false;

            for (String var11 : var6) {
               class_8984 var12 = this.method_16820(var11);
               if (var12 != null && var12.method_41192()) {
                  var7 = true;
                  break;
               }
            }

            if (!var7) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method_16818() {
      for (class_8984 var4 : this.field_17619.values()) {
         if (var4.method_41192()) {
            return true;
         }
      }

      return false;
   }

   public boolean method_16807(String var1) {
      class_8984 var4 = this.field_17619.get(var1);
      if (var4 != null && !var4.method_41192()) {
         var4.method_41189();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_16816(String var1) {
      class_8984 var4 = this.field_17619.get(var1);
      if (var4 != null && var4.method_41192()) {
         var4.method_41191();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.field_17619 + ", requirements=" + Arrays.deepToString(this.field_17621) + '}';
   }

   public void method_16813(class_8248 var1) {
      var1.method_37743(this.field_17619.size());

      for (Entry var5 : this.field_17619.entrySet()) {
         var1.method_37760((String)var5.getKey());
         ((class_8984)var5.getValue()).method_41188(var1);
      }
   }

   public static class_3604 method_16808(class_8248 var0) {
      class_3604 var3 = new class_3604();
      int var4 = var0.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         var3.field_17619.put(var0.method_37784(32767), class_8984.method_41194(var0));
      }

      return var3;
   }

   @Nullable
   public class_8984 method_16820(String var1) {
      return this.field_17619.get(var1);
   }

   public float method_16805() {
      if (!this.field_17619.isEmpty()) {
         float var3 = (float)this.field_17621.length;
         float var4 = (float)this.method_16810();
         return var4 / var3;
      } else {
         return 0.0F;
      }
   }

   @Nullable
   public String method_16806() {
      if (!this.field_17619.isEmpty()) {
         int var3 = this.field_17621.length;
         if (var3 > 1) {
            int var4 = this.method_16810();
            return var4 + "/" + var3;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private int method_16810() {
      int var3 = 0;

      for (String[] var7 : this.field_17621) {
         boolean var8 = false;

         for (String var12 : var7) {
            class_8984 var13 = this.method_16820(var12);
            if (var13 != null && var13.method_41192()) {
               var8 = true;
               break;
            }
         }

         if (var8) {
            var3++;
         }
      }

      return var3;
   }

   public Iterable<String> method_16812() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field_17619.entrySet()) {
         if (!((class_8984)var5.getValue()).method_41192()) {
            var3.add(var5.getKey());
         }
      }

      return var3;
   }

   public Iterable<String> method_16817() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field_17619.entrySet()) {
         if (((class_8984)var5.getValue()).method_41192()) {
            var3.add(var5.getKey());
         }
      }

      return var3;
   }

   @Nullable
   public Date method_16814() {
      Date var3 = null;

      for (class_8984 var5 : this.field_17619.values()) {
         if (var5.method_41192() && (var3 == null || var5.method_41193().before(var3))) {
            var3 = var5.method_41193();
         }
      }

      return var3;
   }

   public int compareTo(class_3604 var1) {
      Date var4 = this.method_16814();
      Date var5 = var1.method_16814();
      if (var4 == null && var5 != null) {
         return 1;
      } else if (var4 != null && var5 == null) {
         return -1;
      } else {
         return var4 == null && var5 == null ? 0 : var4.compareTo(var5);
      }
   }
}
