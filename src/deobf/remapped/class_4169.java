package remapped;

public enum class_4169 implements class_6839 {
   field_20292("limb_swing"),
   field_20297("limb_speed"),
   field_20283("age"),
   field_20295("head_yaw"),
   field_20291("head_pitch"),
   field_20298("health"),
   field_20290("hurt_time"),
   field_20288("idle_time"),
   field_20296("max_health"),
   field_20299("move_forward"),
   field_20281("move_strafing"),
   field_20285("partial_ticks"),
   field_20286("pos_x"),
   field_20293("pos_y"),
   field_20280("pos_z"),
   field_20289("revenge_time"),
   field_20282("swing_progress");

   private String field_20294;
   private class_6122 field_20284;
   private static final class_4169[] field_20279 = values();

   private class_4169(String var3) {
      this.field_20294 = var3;
      this.field_20284 = MinecraftClient.getInstance().method_8587();
   }

   public String method_19343() {
      return this.field_20294;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float method_31353() {
      class_7067 var3 = this.field_20284.field_31300;
      if (var3 == null) {
         return 0.0F;
      } else {
         if (var3 instanceof class_6353) {
            class_6353 var4 = (class_6353)var3;
            switch (this) {
               case field_20292:
                  return var4.field_32485;
               case field_20297:
                  return var4.field_32484;
               case field_20283:
                  return var4.field_32482;
               case field_20295:
                  return var4.field_32486;
               case field_20291:
                  return var4.field_32489;
               default:
                  class_5834 var5 = var4.field_32481;
                  if (var5 == null) {
                     return 0.0F;
                  }

                  switch (this) {
                     case field_20298:
                        return var5.method_26551();
                     case field_20290:
                        return (float)var5.field_29645;
                     case field_20288:
                        return (float)var5.method_26532();
                     case field_20296:
                        return var5.method_26465();
                     case field_20299:
                        return var5.field_29673;
                     case field_20281:
                        return var5.field_29676;
                     case field_20286:
                        return (float)var5.method_37302();
                     case field_20293:
                        return (float)var5.method_37309();
                     case field_20280:
                        return (float)var5.method_37156();
                     case field_20289:
                        return (float)var5.method_26577();
                     case field_20282:
                        return var5.method_26533(var4.field_32488);
                  }
            }
         }

         return 0.0F;
      }
   }

   public static class_4169 method_19341(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < field_20279.length; var3++) {
            class_4169 var4 = field_20279[var3];
            if (var4.method_19343().equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
