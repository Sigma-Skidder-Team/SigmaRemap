package remapped;

public enum class_7340 implements class_1342 {
   field_37541("is_alive"),
   field_37534("is_burning"),
   field_37532("is_child"),
   field_37537("is_glowing"),
   field_37533("is_hurt"),
   field_37536("is_in_lava"),
   field_37549("is_in_water"),
   field_37548("is_invisible"),
   field_37547("is_on_ground"),
   field_37535("is_ridden"),
   field_37546("is_riding"),
   field_37544("is_sneaking"),
   field_37539("is_sprinting"),
   field_37543("is_wet");

   private String field_37531;
   private class_6122 field_37545;
   private static final class_7340[] field_37540 = values();

   private class_7340(String var3) {
      this.field_37531 = var3;
      this.field_37545 = MinecraftClient.getInstance().method_8587();
   }

   public String method_33470() {
      return this.field_37531;
   }

   @Override
   public boolean method_6191() {
      class_8145 var3 = MinecraftClient.getInstance().method_8516();
      if (var3 instanceof class_5834) {
         class_5834 var4 = (class_5834)var3;
         switch (this) {
            case field_37541:
               return var4.method_37330();
            case field_37534:
               return var4.method_37264();
            case field_37532:
               return var4.method_26449();
            case field_37537:
               return var4.method_37116();
            case field_37533:
               return var4.field_29645 > 0;
            case field_37536:
               return var4.method_37370();
            case field_37549:
               return var4.method_37285();
            case field_37548:
               return var4.method_37109();
            case field_37547:
               return var4.method_37360();
            case field_37535:
               return var4.method_37151();
            case field_37546:
               return var4.method_37070();
            case field_37544:
               return var4.method_37382();
            case field_37539:
               return var4.method_37321();
            case field_37543:
               return var4.method_37363();
         }
      }

      return false;
   }

   public static class_7340 method_33468(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < field_37540.length; var3++) {
            class_7340 var4 = field_37540[var3];
            if (var4.method_33470().equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
