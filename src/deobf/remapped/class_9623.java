package remapped;

public class class_9623<T extends class_6406> {
   private static String[] field_49019;
   private final T field_49021;
   private long field_49022;
   private long field_49018;
   private class_5068 field_49023;

   private class_9623(T var1, class_6406 var2) {
      this.field_49020 = var1;
      this.field_49022 = -1L;
      this.field_49018 = -1L;
      this.field_49023 = class_5068.field_26192;
      this.field_49021 = (T)var2;
   }

   public T method_44421() {
      return this.field_49021;
   }

   private float method_44420(long var1) {
      float var5 = MathHelper.clamp((float)(var1 - this.field_49022) / 600.0F, 0.0F, 1.0F);
      var5 *= var5;
      return this.field_49023 != class_5068.field_26190 ? var5 : 1.0F - var5;
   }

   public boolean method_44422(int var1, int var2, class_7966 var3) {
      long var6 = Util.getMeasuringTimeMs();
      if (this.field_49022 == -1L) {
         this.field_49022 = var6;
         this.field_49023.method_23330(class_9184.method_42330(this.field_49020).method_8590());
      }

      if (this.field_49023 == class_5068.field_26192 && var6 - this.field_49022 <= 600L) {
         this.field_49018 = var6;
      }

      RenderSystem.method_16438();
      RenderSystem.method_16413(
         (float)var1 - (float)this.field_49021.method_29239() * this.method_44420(var6), (float)(var2 * this.field_49021.method_29238()), (float)(800 + var2)
      );
      class_5068 var8 = this.field_49021.method_29236(var3, this.field_49020, var6 - this.field_49018);
      RenderSystem.method_16489();
      if (var8 != this.field_49023) {
         this.field_49022 = var6 - (long)((int)((1.0F - this.method_44420(var6)) * 600.0F));
         this.field_49023 = var8;
         this.field_49023.method_23330(class_9184.method_42330(this.field_49020).method_8590());
      }

      return this.field_49023 == class_5068.field_26190 && var6 - this.field_49022 > 600L;
   }
}
