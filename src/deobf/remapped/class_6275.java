package remapped;

public class class_6275 {
   public static final class_6275 field_32072 = method_28611("core");
   public static final class_6275 field_32075 = method_28611("idle");
   public static final class_6275 field_32073 = method_28611("work");
   public static final class_6275 field_32064 = method_28611("play");
   public static final class_6275 field_32079 = method_28611("rest");
   public static final class_6275 field_32065 = method_28611("meet");
   public static final class_6275 field_32071 = method_28611("panic");
   public static final class_6275 field_32067 = method_28611("raid");
   public static final class_6275 field_32077 = method_28611("pre_raid");
   public static final class_6275 field_32076 = method_28611("hide");
   public static final class_6275 field_32070 = method_28611("fight");
   public static final class_6275 field_32063 = method_28611("celebrate");
   public static final class_6275 field_32078 = method_28611("admire_item");
   public static final class_6275 field_32068 = method_28611("avoid");
   public static final class_6275 field_32066 = method_28611("ride");
   private final String field_32062;
   private final int field_32069;

   private class_6275(String var1) {
      this.field_32062 = var1;
      this.field_32069 = var1.hashCode();
   }

   public String method_28610() {
      return this.field_32062;
   }

   private static class_6275 method_28611(String var0) {
      return class_8669.<class_6275>method_39791(class_8669.field_44433, var0, new class_6275(var0));
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_6275 var4 = (class_6275)var1;
            return this.field_32062.equals(var4.field_32062);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_32069;
   }

   @Override
   public String toString() {
      return this.method_28610();
   }
}
