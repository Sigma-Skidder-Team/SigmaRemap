package remapped;

import com.mojang.serialization.DynamicLike;

public class class_1572 {
   private final double field_8262;
   private final double field_8261;
   private final double field_8258;
   private final double field_8263;
   private final int field_8257;
   private final int field_8259;
   private final double field_8264;
   private final long field_8265;
   private final double field_8266;

   private class_1572(double var1, double var3, double var5, double var7, int var9, int var10, double var11, long var13, double var15) {
      this.field_8262 = var1;
      this.field_8261 = var3;
      this.field_8258 = var5;
      this.field_8263 = var7;
      this.field_8257 = var9;
      this.field_8259 = var10;
      this.field_8264 = var11;
      this.field_8265 = var13;
      this.field_8266 = var15;
   }

   private class_1572(class_2098 var1) {
      this.field_8262 = var1.method_9807();
      this.field_8261 = var1.method_9835();
      this.field_8258 = var1.method_9826();
      this.field_8263 = var1.method_9830();
      this.field_8257 = var1.method_9819();
      this.field_8259 = var1.method_9812();
      this.field_8264 = var1.method_9824();
      this.field_8265 = var1.method_9804();
      this.field_8266 = var1.method_9817();
   }

   public double method_7089() {
      return this.field_8262;
   }

   public double method_7096() {
      return this.field_8261;
   }

   public double method_7088() {
      return this.field_8258;
   }

   public double method_7092() {
      return this.field_8263;
   }

   public int method_7087() {
      return this.field_8257;
   }

   public int method_7090() {
      return this.field_8259;
   }

   public double method_7098() {
      return this.field_8264;
   }

   public long method_7094() {
      return this.field_8265;
   }

   public double method_7095() {
      return this.field_8266;
   }

   public static class_1572 method_7097(DynamicLike<?> var0, class_1572 var1) {
      double var4 = var0.get("BorderCenterX").asDouble(var1.field_8262);
      double var6 = var0.get("BorderCenterZ").asDouble(var1.field_8261);
      double var8 = var0.get("BorderSize").asDouble(var1.field_8264);
      long var10 = var0.get("BorderSizeLerpTime").asLong(var1.field_8265);
      double var12 = var0.get("BorderSizeLerpTarget").asDouble(var1.field_8266);
      double var14 = var0.get("BorderSafeZone").asDouble(var1.field_8263);
      double var16 = var0.get("BorderDamagePerBlock").asDouble(var1.field_8258);
      int var18 = var0.get("BorderWarningBlocks").asInt(var1.field_8257);
      int var19 = var0.get("BorderWarningTime").asInt(var1.field_8259);
      return new class_1572(var4, var6, var16, var14, var18, var19, var8, var10, var12);
   }

   public void method_7093(class_5734 var1) {
      var1.method_25923("BorderCenterX", this.field_8262);
      var1.method_25923("BorderCenterZ", this.field_8261);
      var1.method_25923("BorderSize", this.field_8264);
      var1.method_25949("BorderSizeLerpTime", this.field_8265);
      var1.method_25923("BorderSafeZone", this.field_8263);
      var1.method_25923("BorderDamagePerBlock", this.field_8258);
      var1.method_25923("BorderSizeLerpTarget", this.field_8266);
      var1.method_25923("BorderWarningBlocks", (double)this.field_8257);
      var1.method_25923("BorderWarningTime", (double)this.field_8259);
   }
}
