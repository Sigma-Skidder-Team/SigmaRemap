package remapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class class_9128 {
   public static MinecraftClient field_46692 = MinecraftClient.method_8510();
   public String field_46702;
   public String field_46701;
   public class_5664 field_46696;
   public boolean field_46700;
   public boolean field_46699;
   private boolean field_46698 = true;
   private static List<Class<? extends class_9128>> field_46693 = new ArrayList<Class<? extends class_9128>>();
   private class_9128 field_46695 = null;
   private int field_46691 = 0;
   private Set<String> field_46694 = new HashSet<String>();
   public Map<String, class_5004> field_46697 = new LinkedHashMap<String, class_5004>();

   public class_9128(class_5664 var1, String var2, String var3) {
      this.field_46696 = var1;
      this.field_46702 = var2;
      this.field_46701 = var3;
   }

   public void method_42010(class_5004 var1) {
      if (!this.field_46697.containsKey(var1.method_23032())) {
         this.field_46697.put(var1.method_23032(), var1);
      } else {
         throw new IllegalArgumentException("Attempted to add an option with the same name");
      }
   }

   public Object method_41997(String var1) {
      return this.field_46697.get(var1).method_23031();
   }

   public boolean method_42007(String var1) {
      try {
         return Boolean.parseBoolean(this.method_41997(var1).toString());
      } catch (Exception var5) {
         return false;
      }
   }

   public float[] method_42024(String var1) {
      class_5004 var4 = (class_5004)this.method_41997(var1);
      return !(var4 instanceof class_426) ? null : ((class_426)var4).method_2111();
   }

   public int method_41993(String var1) {
      try {
         return Integer.parseInt(this.method_41997(var1).toString());
      } catch (Exception var5) {
         return -1;
      }
   }

   public float method_42002(String var1) {
      try {
         return Float.parseFloat(this.method_41997(var1).toString());
      } catch (Exception var5) {
         return -1.0F;
      }
   }

   public String method_42016(String var1) {
      try {
         return (String)this.method_41997(var1);
      } catch (Exception var5) {
         return null;
      }
   }

   public List<class_5004> method_41988(String var1) {
      try {
         return ((class_4978)this.field_46697.get(var1)).method_9875();
      } catch (Exception var5) {
         return null;
      }
   }

   public void method_42022(String var1, Object var2) {
      this.field_46697.get(var1).method_23037(var2);
   }

   public void method_41986(String var1, boolean var2) {
      this.field_46697.get(var1).method_23037(var2);
   }

   public void method_42008(String var1, int var2) {
      this.field_46697.get(var1).method_23037(var2);
   }

   public void method_42005(String var1, boolean var2) {
      this.field_46697.get(var1).method_23037(var2);
   }

   public void method_42009(String var1, String var2) {
      this.field_46697.get(var1).method_23037(var2);
   }

   public void method_42019() {
      if (this.field_46700) {
         this.method_42020();
      }

      this.field_46700 = false;
      this.field_46699 = true;

      for (class_5004 var4 : this.field_46697.values()) {
         var4.method_23041();
      }
   }

   public class_1293 method_42021(class_1293 var1) {
      class_1336 var4 = class_3332.method_15293(var1, "options");

      try {
         this.field_46700 = var1.method_5826("enabled");
      } catch (class_7584 var14) {
      }

      try {
         this.field_46699 = var1.method_5826("allowed");
      } catch (class_7584 var13) {
      }

      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            class_1293 var6 = var4.method_6143(var5);
            String var7 = null;

            try {
               var7 = class_3332.method_15291(var6, "name", null);
            } catch (class_7584 var12) {
            }

            for (class_5004 var9 : this.field_46697.values()) {
               if (var9.method_23032().equals(var7)) {
                  try {
                     var9.method_23042(var6);
                  } catch (class_7584 var11) {
                     SigmaMainClass.method_3328()
                        .method_3326()
                        .method_12862("Could not initialize settings of " + this.method_41992() + "." + var9.method_23032() + " from config.");
                  }
                  break;
               }
            }
         }
      }

      if (this.field_46700 && field_46692.field_9601 != null) {
         this.method_42006();
      }

      return var1;
   }

   public class_1293 method_42014(class_1293 var1) {
      var1.method_5820("name", this.method_41992());
      var1.method_5823("enabled", this.field_46700);
      var1.method_5823("allowed", this.method_41994());
      class_1336 var4 = new class_1336();

      for (class_5004 var6 : this.field_46697.values()) {
         var4.method_6159(var6.method_23035(new class_1293()));
      }

      var1.method_5820("options", var4);
      return var1;
   }

   public void method_42006() {
      if (this.getClass().isAnnotationPresent(class_1748.class) && !field_46693.contains(this.getClass())) {
         SigmaMainClass.method_3328().method_3326().method_12862("This mod is still in development. Be careful!");
         field_46693.add((Class<? extends class_9128>)this.getClass());
      }
   }

   public void method_42020() {
   }

   public boolean method_42003() {
      return this.method_42015();
   }

   public Map<String, class_5004> method_41996() {
      return this.field_46697;
   }

   public String method_41987() {
      return this.field_46702;
   }

   public String method_41992() {
      return this.field_46702;
   }

   public String method_42001() {
      return this.field_46701;
   }

   public class_5664 method_42004() {
      if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30644 && this.field_46696 == class_5664.field_28712) {
         return class_5664.field_28710;
      } else {
         return SigmaMainClass.method_3328().method_3312() == class_6015.field_30644 && this.field_46696 == class_5664.field_28717
            ? class_5664.field_28711
            : this.field_46696;
      }
   }

   public int method_41990() {
      return this.field_46691;
   }

   public class_5664 method_41998() {
      return this.field_46696;
   }

   public boolean method_42015() {
      if (SigmaMainClass.method_3328().method_3312() != class_6015.field_30642) {
         return SigmaMainClass.method_3328().method_3312() == class_6015.field_30644 && !this.method_42013() ? false : this.field_46700;
      } else {
         return false;
      }
   }

   public void method_42023(boolean var1) {
      if (this.field_46700 != var1) {
         if (!(this.field_46700 = var1)) {
            SigmaMainClass.method_3328().method_3302().method_7915(this);
            this.method_42020();
         } else {
            SigmaMainClass.method_3328().method_3302().method_7917(this);
            this.method_42006();
         }
      }

      SigmaMainClass.method_3328().method_3298().method_835().method_370(this);
   }

   public void method_42018(boolean var1) {
      this.field_46700 = var1;
      if (!this.field_46700) {
         SigmaMainClass.method_3328().method_3302().method_7915(this);
      } else {
         SigmaMainClass.method_3328().method_3302().method_7917(this);
      }
   }

   public void method_41991(boolean var1) {
      if (this.field_46700 != var1) {
         if (!(this.field_46700 = var1)) {
            SigmaMainClass.method_3328().method_3302().method_7915(this);
            if (!(this instanceof class_3620)) {
               if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30645
                  && SigmaMainClass.method_3328().method_3298().method_847(class_8438.class).method_42007("Sound")) {
                  SigmaMainClass.method_3328().method_3315().method_21206("deactivate");
               }

               if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30644
                  && SigmaMainClass.method_3328().method_3298().method_847(class_4221.class).method_42007("Sound")) {
                  MinecraftClient.method_8510().method_8590().method_16345(class_4949.method_22675(class_463.field_2870, 0.6F));
               }
            }

            this.method_42020();
         } else {
            SigmaMainClass.method_3328().method_3302().method_7917(this);
            if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30645
               && SigmaMainClass.method_3328().method_3298().method_847(class_8438.class).method_42007("Sound")) {
               SigmaMainClass.method_3328().method_3315().method_21206("activate");
            }

            if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30644
               && SigmaMainClass.method_3328().method_3298().method_847(class_4221.class).method_42007("Sound")) {
               MinecraftClient.method_8510().method_8590().method_16345(class_4949.method_22675(class_463.field_2870, 0.7F));
            }

            this.method_42006();
            this.field_46691++;
         }
      }

      SigmaMainClass.method_3328().method_3298().method_835().method_370(this);
   }

   public void method_41999() {
      if (this.method_42015()) {
         this.method_41991(false);
      } else {
         this.method_41991(true);
      }
   }

   public boolean method_41994() {
      return this.field_46699;
   }

   public void method_41989(boolean var1) {
      this.field_46699 = var1;
   }

   public void method_41995(class_9128 var1) {
      this.field_46695 = var1;
   }

   public class_9128 method_42017() {
      return this.field_46695 != null ? this.field_46695 : this;
   }

   public void method_42011(boolean var1) {
      this.field_46698 = var1;
   }

   public boolean method_42013() {
      return this.field_46698;
   }

   public void method_42012() {
   }
}
