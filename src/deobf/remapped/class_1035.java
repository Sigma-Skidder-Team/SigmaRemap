package remapped;

import java.util.LinkedList;
import java.util.List;

public final class class_1035 {
   public static final class_1035 field_5716 = new class_1035();
   private final List<class_2676> field_5715 = new LinkedList<class_2676>();

   private void method_4590(class_2676 var1) {
      this.field_5715.add(var1);
   }

   public String method_4591(String var1) {
      for (class_2676 var5 : this.field_5715) {
         String var6 = var5.method_12044(var1);
         if (var6 != null) {
            return var6;
         }
      }

      return var1;
   }

   public List<class_2676> method_4588() {
      return this.field_5715;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof class_1035)) {
            return false;
         } else {
            class_1035 var4 = (class_1035)var1;
            List var5 = this.method_4588();
            List var6 = var4.method_4588();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      List var5 = this.method_4588();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry(providers=" + this.method_4588() + ")";
   }

   private class_1035() {
   }

   static {
      try {
         field_5716.method_4590(new class_1831("/assets/minecraft/lang/en_us.json"));
      } catch (Exception var8) {
      }

      try {
         field_5716.method_4590(new class_8920("mojang-translations/en_US"));
      } catch (Exception var7) {
      }
   }
}
