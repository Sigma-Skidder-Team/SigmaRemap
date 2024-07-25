package remapped;

public enum class_8972 implements class_1342 {
   field_45969("is_alive"),
   field_45964("is_burning"),
   field_45965("is_child"),
   field_45968("is_glowing"),
   field_45966("is_hurt"),
   field_45967("is_in_lava"),
   field_45977("is_in_water"),
   field_45976("is_invisible"),
   field_45974("is_on_ground"),
   field_45962("is_ridden"),
   field_45973("is_riding"),
   field_45970("is_sneaking"),
   field_45978("is_sprinting"),
   field_45961("is_wet");

   private String field_45963;
   private EntityRenderDispatcher field_45960;
   private static final class_8972[] field_45975 = values();

   private class_8972(String var3) {
      this.field_45963 = var3;
      this.field_45960 = MinecraftClient.getInstance().method_8587();
   }

   public String method_41146() {
      return this.field_45963;
   }

   @Override
   public boolean method_6191() {
      class_7067 var3 = this.field_45960.field_31300;
      if (var3 == null) {
         return false;
      } else {
         if (var3 instanceof class_6353) {
            class_6353 var4 = (class_6353)var3;
            LivingEntity var5 = var4.field_32481;
            if (var5 == null) {
               return false;
            }

            switch (this) {
               case field_45969:
                  return var5.isAlive();
               case field_45964:
                  return var5.method_37264();
               case field_45965:
                  return var5.method_26449();
               case field_45968:
                  return var5.method_37116();
               case field_45966:
                  return var5.field_29645 > 0;
               case field_45967:
                  return var5.method_37370();
               case field_45977:
                  return var5.method_37285();
               case field_45976:
                  return var5.method_37109();
               case field_45974:
                  return var5.method_37360();
               case field_45962:
                  return var5.method_37151();
               case field_45973:
                  return var5.isPassenger();
               case field_45970:
                  return var5.method_37382();
               case field_45978:
                  return var5.method_37321();
               case field_45961:
                  return var5.method_37363();
            }
         }

         return false;
      }
   }

   public static class_8972 method_41147(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < field_45975.length; var3++) {
            class_8972 var4 = field_45975[var3];
            if (var4.method_41146().equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
