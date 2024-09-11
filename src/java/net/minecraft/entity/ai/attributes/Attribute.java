package net.minecraft.entity.ai.attributes;

public class Attribute {
   private static String[] field22693;
   private final double field22694;
   private boolean field22695;
   private final String field22696;

   public Attribute(String var1, double var2) {
      this.field22694 = var2;
      this.field22696 = var1;
   }

   public double method15028() {
      return this.field22694;
   }

   public boolean method15029() {
      return this.field22695;
   }

   public Attribute method15030(boolean var1) {
      this.field22695 = var1;
      return this;
   }

   public double method15031(double var1) {
      return var1;
   }

   public String method15032() {
      return this.field22696;
   }
}
