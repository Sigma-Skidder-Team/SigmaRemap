package remapped;

import java.util.OptionalDouble;

public abstract class class_5348 {
   public final String field_27283;
   private final Runnable field_27307;
   private final Runnable field_27285;
   public static final class_4298 field_27320 = new class_4298("no_transparency", () -> class_3542.method_16448(), () -> {
   });
   public static final class_4298 field_27292 = new class_4298("additive_transparency", () -> {
      class_3542.method_16488();
      class_3542.method_16398(class_5033.field_26047, class_8535.field_43691);
   }, () -> {
      class_3542.method_16448();
      class_3542.method_16437();
   });
   public static final class_4298 field_27288 = new class_4298("lightning_transparency", () -> {
      class_3542.method_16488();
      class_3542.method_16398(class_5033.field_26042, class_8535.field_43691);
   }, () -> {
      class_3542.method_16448();
      class_3542.method_16437();
   });
   public static final class_4298 field_27325 = new class_4298("glint_transparency", () -> {
      class_3542.method_16488();
      class_3542.method_16425(class_5033.field_26035, class_8535.field_43691, class_5033.field_26048, class_8535.field_43691);
   }, () -> {
      class_3542.method_16448();
      class_3542.method_16437();
   });
   public static final class_4298 field_27326 = new class_4298("crumbling_transparency", () -> {
      class_3542.method_16488();
      class_3542.method_16425(class_5033.field_26038, class_8535.field_43692, class_5033.field_26047, class_8535.field_43699);
   }, () -> {
      class_3542.method_16448();
      class_3542.method_16437();
   });
   public static final class_4298 field_27308 = new class_4298("translucent_transparency", () -> {
      class_3542.method_16488();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43697);
   }, () -> {
      class_3542.method_16448();
      class_3542.method_16437();
   });
   public static final class_7017 field_27304 = new class_7017(0.0F);
   public static final class_7017 field_27310 = new class_7017(0.003921569F);
   public static final class_7017 field_27299 = new class_7017(0.5F);
   public static final class_7017 field_27316 = new class_7017(0.1F);
   public static final class_1594 field_27294 = new class_1594(false);
   public static final class_1594 field_27297 = new class_1594(true);
   public static final class_3771 field_27324 = new class_3771(class_8359.field_42824, false, true);
   public static final class_3771 field_27315 = new class_3771(class_8359.field_42824, false, false);
   public static final class_3771 field_27302 = new class_3771();
   public static final class_4696 field_27290 = new class_4696("default_texturing", () -> {
   }, () -> {
   });
   public static final class_4696 field_27281 = new class_4696("outline_texturing", () -> class_3542.method_16472(), () -> class_3542.method_16485());
   public static final class_4696 field_27301 = new class_4696("glint_texturing", () -> method_24423(8.0F), () -> {
      class_3542.method_16463(5890);
      class_3542.method_16489();
      class_3542.method_16463(5888);
   });
   public static final class_4696 field_27314 = new class_4696("entity_glint_texturing", () -> method_24423(0.16F), () -> {
      class_3542.method_16463(5890);
      class_3542.method_16489();
      class_3542.method_16463(5888);
   });
   public static final class_8384 field_27280 = new class_8384(true);
   public static final class_8384 field_27282 = new class_8384(false);
   public static final class_376 field_27311 = new class_376(true);
   public static final class_376 field_27322 = new class_376(false);
   public static final class_3899 field_27278 = new class_3899(true);
   public static final class_3899 field_27291 = new class_3899(false);
   public static final class_3754 field_27309 = new class_3754(true);
   public static final class_3754 field_27319 = new class_3754(false);
   public static final class_8385 field_27296 = new class_8385("always", 519);
   public static final class_8385 field_27289 = new class_8385("==", 514);
   public static final class_8385 field_27321 = new class_8385("<=", 515);
   public static final class_7207 field_27327 = new class_7207(true, true);
   public static final class_7207 field_27303 = new class_7207(true, false);
   public static final class_7207 field_27286 = new class_7207(false, true);
   public static final class_9603 field_27295 = new class_9603("no_layering", () -> {
   }, () -> {
   });
   public static final class_9603 field_27318 = new class_9603("polygon_offset_layering", () -> {
      class_3542.method_16475(-1.0F, -10.0F);
      class_3542.method_16464();
   }, () -> {
      class_3542.method_16475(0.0F, 0.0F);
      class_3542.method_16382();
   });
   public static final class_9603 field_27293 = new class_9603("view_offset_z_layering", () -> {
      class_3542.method_16438();
      class_3542.method_16403(0.99975586F, 0.99975586F, 0.99975586F);
   }, class_3542::method_16489);
   public static final class_4781 field_27306 = new class_4781("no_fog", () -> {
   }, () -> {
   });
   public static final class_4781 field_27305 = new class_4781("fog", () -> {
      class_6377.method_29161();
      class_3542.method_16353();
   }, () -> class_3542.method_16367());
   public static final class_4781 field_27284 = new class_4781("black_fog", () -> {
      class_3542.method_16434(2918, 0.0F, 0.0F, 0.0F, 1.0F);
      class_3542.method_16353();
   }, () -> {
      class_6377.method_29161();
      class_3542.method_16367();
   });
   public static final class_6160 field_27298 = new class_6160("main_target", () -> {
   }, () -> {
   });
   public static final class_6160 field_27287 = new class_6160(
      "outline_target",
      () -> class_1893.method_8510().field_9657.method_20029().method_19717(false),
      () -> class_1893.method_8510().method_8584().method_19717(false)
   );
   public static final class_6160 field_27323 = new class_6160("translucent_target", () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().field_9657.method_20010().method_19717(false);
      }
   }, () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().method_8584().method_19717(false);
      }
   });
   public static final class_6160 field_27312 = new class_6160("particles_target", () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().field_9657.method_20096().method_19717(false);
      }
   }, () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().method_8584().method_19717(false);
      }
   });
   public static final class_6160 field_27313 = new class_6160("weather_target", () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().field_9657.method_20095().method_19717(false);
      }
   }, () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().method_8584().method_19717(false);
      }
   });
   public static final class_6160 field_27300 = new class_6160("clouds_target", () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().field_9657.method_20091().method_19717(false);
      }
   }, () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().method_8584().method_19717(false);
      }
   });
   public static final class_6160 field_27317 = new class_6160("item_entity_target", () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().field_9657.method_20076().method_19717(false);
      }
   }, () -> {
      if (class_1893.method_8497()) {
         class_1893.method_8510().method_8584().method_19717(false);
      }
   });
   public static final class_8315 field_27279 = new class_8315(OptionalDouble.of(1.0));

   public class_5348(String var1, Runnable var2, Runnable var3) {
      this.field_27283 = var1;
      this.field_27307 = var2;
      this.field_27285 = var3;
   }

   public void method_24420() {
      this.field_27307.run();
   }

   public void method_24422() {
      this.field_27285.run();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_5348 var4 = (class_5348)var1;
            return this.field_27283.equals(var4.field_27283);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_27283.hashCode();
   }

   @Override
   public String toString() {
      return this.field_27283;
   }

   private static void method_24423(float var0) {
      class_3542.method_16463(5890);
      class_3542.method_16438();
      class_3542.method_16476();
      long var3 = class_9665.method_44650() * 8L;
      float var5 = (float)(var3 % 110000L) / 110000.0F;
      float var6 = (float)(var3 % 30000L) / 30000.0F;
      class_3542.method_16413(-var5, var6, 0.0F);
      class_3542.method_16410(10.0F, 0.0F, 0.0F, 1.0F);
      class_3542.method_16403(var0, var0, var0);
      class_3542.method_16463(5888);
   }

   public String method_24421() {
      return this.field_27283;
   }
}
