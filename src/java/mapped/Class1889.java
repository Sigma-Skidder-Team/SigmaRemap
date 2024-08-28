package mapped;

public enum Class1889 implements Class1884 {
   field11051("limb_swing"),
   field11052("limb_speed"),
   field11053("age"),
   field11054("head_yaw"),
   field11055("head_pitch"),
   field11056("health"),
   field11057("hurt_time"),
   field11058("idle_time"),
   field11059("max_health"),
   field11060("move_forward"),
   field11061("move_strafing"),
   field11062("partial_ticks"),
   field11063("pos_x"),
   field11064("pos_y"),
   field11065("pos_z"),
   field11066("revenge_time"),
   field11067("swing_progress");

   private String field11068;
   private Class8853 field11069;
   private static final Class1889[] field11070 = values();
   private static final Class1889[] field11071 = new Class1889[]{
      field11051,
      field11052,
      field11053,
      field11054,
      field11055,
      field11056,
      field11057,
      field11058,
      field11059,
      field11060,
      field11061,
      field11062,
      field11063,
      field11064,
      field11065,
      field11066,
      field11067
   };

   private Class1889(String var3) {
      this.field11068 = var3;
      this.field11069 = Minecraft.getInstance().method1554();
   }

   public String method8146() {
      return this.field11068;
   }

   @Override
   public float method8142() {
      Class5715 var3 = this.field11069.field40023;
      if (var3 == null) {
         return 0.0F;
      } else {
         if (var3 instanceof Class5712) {
            Class5712 var4 = (Class5712)var3;
            switch (Class7313.field31355[this.ordinal()]) {
               case 12:
                  return var4.field25089;
               case 13:
                  return var4.field25090;
               case 14:
                  return var4.field25091;
               case 15:
                  return var4.field25092;
               case 16:
                  return var4.field25093;
               default:
                  Class880 var5 = var4.field25088;
                  if (var5 == null) {
                     return 0.0F;
                  }

                  switch (Class7313.field31355[this.ordinal()]) {
                     case 1:
                        return var5.method3042();
                     case 2:
                        return (float)var5.field4952;
                     case 3:
                        return (float)var5.method3021();
                     case 4:
                        return var5.method3075();
                     case 5:
                        return var5.field4984;
                     case 6:
                        return var5.field4982;
                     case 7:
                        return (float)var5.getPosX();
                     case 8:
                        return (float)var5.getPosY();
                     case 9:
                        return (float)var5.getPosZ();
                     case 10:
                        return (float)var5.method3015();
                     case 11:
                        return var5.method3137(var4.field25094);
                  }
            }
         }

         return 0.0F;
      }
   }

   public static Class1889 method8147(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < field11070.length; var3++) {
            Class1889 var4 = field11070[var3];
            if (var4.method8146().equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
