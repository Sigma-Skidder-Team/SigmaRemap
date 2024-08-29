package mapped;

import net.minecraft.client.Minecraft;

public enum Class1890 implements Class1876 {
   field11072("is_alive"),
   field11073("is_burning"),
   field11074("is_child"),
   field11075("is_glowing"),
   field11076("is_hurt"),
   field11077("is_in_lava"),
   field11078("is_in_water"),
   field11079("is_invisible"),
   field11080("is_on_ground"),
   field11081("is_ridden"),
   field11082("is_riding"),
   field11083("is_sneaking"),
   field11084("is_sprinting"),
   field11085("is_wet");

   private String field11086;
   private EntityRendererManager field11087;
   private static final Class1890[] field11088 = values();
   private static final Class1890[] field11089 = new Class1890[]{
      field11072,
      field11073,
      field11074,
      field11075,
      field11076,
      field11077,
      field11078,
      field11079,
      field11080,
      field11081,
      field11082,
      field11083,
      field11084,
      field11085
   };

   private Class1890(String var3) {
      this.field11086 = var3;
      this.field11087 = Minecraft.getInstance().getRenderManager();
   }

   public String method8148() {
      return this.field11086;
   }

   @Override
   public boolean method8137() {
      Class5715 var3 = this.field11087.field40023;
      if (var3 == null) {
         return false;
      } else {
         if (var3 instanceof Class5712) {
            Class5712 var4 = (Class5712)var3;
            Class880 var5 = var4.field25088;
            if (var5 == null) {
               return false;
            }

            switch (Class9103.field41632[this.ordinal()]) {
               case 1:
                  return var5.method3066();
               case 2:
                  return var5.method3327();
               case 3:
                  return var5.method3005();
               case 4:
                  return var5.isGlowing();
               case 5:
                  return var5.field4952 > 0;
               case 6:
                  return var5.method3264();
               case 7:
                  return var5.method3250();
               case 8:
                  return var5.method3342();
               case 9:
                  return var5.method3226();
               case 10:
                  return var5.isBeingRidden();
               case 11:
                  return var5.isPassenger();
               case 12:
                  return var5.method3336();
               case 13:
                  return var5.method3337();
               case 14:
                  return var5.method3253();
            }
         }

         return false;
      }
   }

   public static Class1890 method8149(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < field11088.length; var3++) {
            Class1890 var4 = field11088[var3];
            if (var4.method8148().equals(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
