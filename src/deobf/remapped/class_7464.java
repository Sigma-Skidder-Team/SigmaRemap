package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class_7464 {
   public final class_9375 field_38137;
   private final class_1862 field_38133;
   private final Map<String, class_1621> field_38136;
   private final Set<class_1621> field_38134;

   public class_7464(class_9375 var1, class_1862 var2) {
      this.field_38137 = var1;
      this.field_38133 = var2;
      this.field_38136 = new HashMap<String, class_1621>();
      this.field_38134 = new HashSet<class_1621>();
   }

   public boolean method_33976() {
      if (this.field_38137.method_43353(class_3467.field_16980)) {
         this.field_38137.method_43352();
      }

      return !this.field_38137.method_43353(class_3467.field_16981);
   }

   public class_1621 method_33973() {
      this.field_38137.method_43352();
      class_1621 var3 = this.method_33974(null);
      this.field_38137.method_43352();
      this.field_38136.clear();
      this.field_38134.clear();
      return var3;
   }

   public class_1621 method_33970() {
      this.field_38137.method_43352();
      class_1621 var3 = null;
      if (!this.field_38137.method_43353(class_3467.field_16981)) {
         var3 = this.method_33973();
      }

      if (this.field_38137.method_43353(class_3467.field_16981)) {
         this.field_38137.method_43352();
         return var3;
      } else {
         class_8087 var4 = this.field_38137.method_43352();
         throw new class_320("expected a single document in the stream", var3.method_7224(), "but found another document", var4.method_36725());
      }
   }

   private class_1621 method_33974(class_1621 var1) {
      if (var1 != null) {
         this.field_38134.add(var1);
      }

      class_1621 var6;
      if (!this.field_38137.method_43353(class_3467.field_16978)) {
         class_5399 var4 = (class_5399)this.field_38137.method_43354();
         String var5 = var4.method_24586();
         if (!this.field_38137.method_43353(class_3467.field_16982)) {
            if (!this.field_38137.method_43353(class_3467.field_16986)) {
               var6 = this.method_33971(var5);
            } else {
               var6 = this.method_33979(var5);
            }
         } else {
            var6 = this.method_33980(var5);
         }
      } else {
         class_8788 var7 = (class_8788)this.field_38137.method_43352();
         String var8 = var7.method_24586();
         if (!this.field_38136.containsKey(var8)) {
            throw new class_320(null, null, "found undefined alias " + var8, var7.method_36725());
         }

         var6 = this.field_38136.get(var8);
         if (this.field_38134.remove(var6)) {
            var6.method_7229(true);
         }
      }

      this.field_38134.remove(var1);
      return var6;
   }

   public class_1621 method_33980(String var1) {
      class_4417 var4 = (class_4417)this.field_38137.method_43352();
      String var5 = var4.method_20550();
      boolean var6 = false;
      class_9592 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new class_9592(var5);
      } else {
         var7 = this.field_38133.method_8244(class_99.field_235, var4.method_20548(), var4.method_20549().method_12730());
         var6 = true;
      }

      class_8437 var8 = new class_8437(var7, var6, var4.method_20548(), var4.method_36725(), var4.method_36728(), var4.method_20551());
      if (var1 != null) {
         this.field_38136.put(var1, var8);
      }

      return var8;
   }

   public class_1621 method_33979(String var1) {
      class_2410 var4 = (class_2410)this.field_38137.method_43352();
      String var5 = var4.method_1815();
      boolean var6 = false;
      class_9592 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new class_9592(var5);
      } else {
         var7 = this.field_38133.method_8244(class_99.field_234, null, var4.method_1814());
         var6 = true;
      }

      ArrayList var8 = new ArrayList();
      class_1596 var9 = new class_1596(var7, var6, var8, var4.method_36725(), null, var4.method_1813());
      if (var1 != null) {
         this.field_38136.put(var1, var9);
      }

      while (!this.field_38137.method_43353(class_3467.field_16983)) {
         var8.add(this.method_33974(var9));
      }

      class_8087 var10 = this.field_38137.method_43352();
      var9.method_10283(var10.method_36728());
      return var9;
   }

   public class_1621 method_33971(String var1) {
      class_3659 var4 = (class_3659)this.field_38137.method_43352();
      String var5 = var4.method_1815();
      boolean var6 = false;
      class_9592 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new class_9592(var5);
      } else {
         var7 = this.field_38133.method_8244(class_99.field_233, null, var4.method_1814());
         var6 = true;
      }

      ArrayList var8 = new ArrayList();
      class_7984 var9 = new class_7984(var7, var6, var8, var4.method_36725(), null, var4.method_1813());
      if (var1 != null) {
         this.field_38136.put(var1, var9);
      }

      while (!this.field_38137.method_43353(class_3467.field_16987)) {
         this.method_33975(var8, var9);
      }

      class_8087 var10 = this.field_38137.method_43352();
      var9.method_10283(var10.method_36728());
      return var9;
   }

   public void method_33975(List<class_8473> var1, class_7984 var2) {
      class_1621 var5 = this.method_33972(var2);
      if (var5.method_7232().equals(class_9592.field_48872)) {
         var2.method_36232(true);
      }

      class_1621 var6 = this.method_33977(var2);
      var1.add(new class_8473(var5, var6));
   }

   public class_1621 method_33972(class_7984 var1) {
      return this.method_33974(var1);
   }

   public class_1621 method_33977(class_7984 var1) {
      return this.method_33974(var1);
   }
}
