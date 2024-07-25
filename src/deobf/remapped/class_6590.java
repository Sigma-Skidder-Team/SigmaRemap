package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class class_6590 {
   private static String[] field_33997;
   private final class_1857 field_34000;
   private HashMap<class_1331, class_2522> field_34001 = new HashMap<class_1331, class_2522>();
   private HashMap<class_1331, class_2522> field_33996 = new HashMap<class_1331, class_2522>();
   private Set<class_9448> field_34002 = new HashSet<class_9448>();
   private Set<class_3841> field_33998 = new HashSet<class_3841>();
   private Set<class_3841> field_34003 = new HashSet<class_3841>();
   private List<Runnable> field_33999 = new ArrayList<Runnable>();

   public class_6590(class_1857 var1) {
      this.field_34000 = var1;
      this.method_30341();
   }

   private void method_30347(class_9448 var1) {
      this.field_34002.add(var1);
   }

   private void method_30341() {
      this.method_30347(new class_2108());
      this.method_30347(new class_9085());
      this.method_30347(new class_7694());
      this.method_30347(new class_4955());
      this.method_30347(new class_2864());
      this.method_30347(new class_684());
      this.method_30347(new class_3154());
      this.method_30347(new class_4864());
      this.method_30347(new class_2709());
      this.method_30347(new class_3530());
   }

   public void method_30350() {
      for (Entry var4 : this.field_34001.entrySet()) {
         this.method_30355((class_1331)var4.getKey(), (class_2522)var4.getValue());
      }

      this.field_34001.clear();
   }

   public void method_30351() {
      for (Entry var4 : this.field_33996.entrySet()) {
         this.method_30343((class_1331)var4.getKey(), (class_2522)var4.getValue());
      }

      this.field_33996.clear();
   }

   public void method_30353() {
      this.field_33998.clear();
      this.field_34001.clear();
   }

   public void method_30349() {
      for (class_3841 var4 : this.field_34003) {
         class_1893.method_8510().field_9601.method_29594(var4.field_18753, var4.field_18752);
      }

      this.field_34003.clear();
      int var5 = this.field_33999.size();

      for (int var6 = 0; var6 < var5; var6++) {
         this.field_33999.get(var6).run();
         this.field_33999.remove(var6);
         var6--;
         var5--;
      }
   }

   private void method_30355(class_1331 var1, class_2522 var2) {
      class_9448 var5 = this.method_30348(var2);
      if (var5 != null) {
         try {
            this.field_33998.addAll(var5.method_43698(var1, var2, this));
         } catch (ArrayIndexOutOfBoundsException | NullPointerException var7) {
            var7.printStackTrace();
         }
      }
   }

   private class_9448 method_30348(class_2522 var1) {
      for (class_9448 var5 : this.field_34002) {
         if (var5.field_48221 == var1.method_8360().getClass()) {
            return var5;
         }
      }

      return null;
   }

   public class_6310 method_30345(class_6310 var1) {
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      if (!(var1 instanceof class_4467)) {
         if (var1 instanceof class_4267) {
            class_4267 var6 = (class_4267)var1;
            if (!this.method_30342(var6.method_19868())) {
               var5.put(var6.method_19867(), var6.method_19868());
            } else {
               var4.put(var6.method_19867(), new class_3841(var6.method_19867(), var6.method_19868()));
            }
         }
      } else {
         class_4467 var9 = (class_4467)var1;

         for (int var7 = 0; var7 < var9.field_21787.length; var7++) {
            class_1331 var8 = var9.field_21788.method_31904(var9.field_21787[var7]);
            if (!this.method_30342(var9.field_21786[var7])) {
               var5.put(var8, var9.field_21786[var7]);
            } else {
               var4.put(var8, new class_3841(var8, var9.field_21786[var7]));
            }
         }
      }

      for (class_3841 var12 : this.field_33998) {
         var4.put(var12.field_18753, new class_3841(var12.field_18753, var12.field_18752));
      }

      this.field_33998.clear();
      class_7348 var11 = new class_7348(this, var4, var5);
      this.field_33999.add(var11);
      return null;
   }

   private void method_30343(class_1331 var1, class_2522 var2) {
      class_9448 var5 = this.method_30348(var2);
      if (var5 != null) {
         this.field_34003.addAll(var5.method_43697(var1, var2, this));
      }
   }

   public boolean method_30342(class_2522 var1) {
      return this.method_30348(var1) != null;
   }

   public void method_30346(class_1331 var1, class_2522 var2) {
      this.field_34001.put(var1, var2);
      this.field_33996.put(var1, var2);
   }

   public class_2522 method_30352(class_1331 var1) {
      if (!this.field_34001.containsKey(var1)) {
         return !this.field_33996.containsKey(var1) ? class_1893.method_8510().field_9601.method_28262(var1) : this.field_33996.get(var1);
      } else {
         return this.field_34001.get(var1);
      }
   }

   public void method_30344(class_2654 var1) {
      for (class_3841 var5 : this.field_33998) {
         var1.method_27348(var5.field_18753, var5.field_18752, false);
      }

      this.field_33998.clear();
   }
}
