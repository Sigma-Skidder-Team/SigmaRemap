package mapped;

import com.mojang.serialization.DynamicLike;

public class Class7235 {
   private final double field31079;
   private final double field31080;
   private final double field31081;
   private final double field31082;
   private final int field31083;
   private final int field31084;
   private final double field31085;
   private final long field31086;
   private final double field31087;

   public Class7235(double var1, double var3, double var5, double var7, int var9, int var10, double var11, long var13, double var15) {
      this.field31079 = var1;
      this.field31080 = var3;
      this.field31081 = var5;
      this.field31082 = var7;
      this.field31083 = var9;
      this.field31084 = var10;
      this.field31085 = var11;
      this.field31086 = var13;
      this.field31087 = var15;
   }

   public Class7235(Class7522 var1) {
      this.field31079 = var1.method24534();
      this.field31080 = var1.method24535();
      this.field31081 = var1.method24548();
      this.field31082 = var1.method24546();
      this.field31083 = var1.method24553();
      this.field31084 = var1.method24551();
      this.field31085 = var1.method24537();
      this.field31086 = var1.method24538();
      this.field31087 = var1.method24539();
   }

   public double method22710() {
      return this.field31079;
   }

   public double method22711() {
      return this.field31080;
   }

   public double method22712() {
      return this.field31081;
   }

   public double method22713() {
      return this.field31082;
   }

   public int method22714() {
      return this.field31083;
   }

   public int method22715() {
      return this.field31084;
   }

   public double method22716() {
      return this.field31085;
   }

   public long method22717() {
      return this.field31086;
   }

   public double method22718() {
      return this.field31087;
   }

   public static Class7235 method22719(DynamicLike<?> var0, Class7235 var1) {
      double var4 = var0.get("BorderCenterX").asDouble(var1.field31079);
      double var6 = var0.get("BorderCenterZ").asDouble(var1.field31080);
      double var8 = var0.get("BorderSize").asDouble(var1.field31085);
      long var10 = var0.get("BorderSizeLerpTime").asLong(var1.field31086);
      double var12 = var0.get("BorderSizeLerpTarget").asDouble(var1.field31087);
      double var14 = var0.get("BorderSafeZone").asDouble(var1.field31082);
      double var16 = var0.get("BorderDamagePerBlock").asDouble(var1.field31081);
      int var18 = var0.get("BorderWarningBlocks").asInt(var1.field31083);
      int var19 = var0.get("BorderWarningTime").asInt(var1.field31084);
      return new Class7235(var4, var6, var16, var14, var18, var19, var8, var10, var12);
   }

   public void method22720(Class39 var1) {
      var1.method108("BorderCenterX", this.field31079);
      var1.method108("BorderCenterZ", this.field31080);
      var1.method108("BorderSize", this.field31085);
      var1.method103("BorderSizeLerpTime", this.field31086);
      var1.method108("BorderSafeZone", this.field31082);
      var1.method108("BorderDamagePerBlock", this.field31081);
      var1.method108("BorderSizeLerpTarget", this.field31087);
      var1.method108("BorderWarningBlocks", (double)this.field31083);
      var1.method108("BorderWarningTime", (double)this.field31084);
   }
}
