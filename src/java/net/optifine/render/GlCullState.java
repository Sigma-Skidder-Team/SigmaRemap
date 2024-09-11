package net.optifine.render;

public class GlCullState {
   private boolean field45871;
   private int field45872;

   public GlCullState() {
      this(false, 1029);
   }

   public GlCullState(boolean var1) {
      this(var1, 1029);
   }

   public GlCullState(boolean var1, int var2) {
      this.field45871 = var1;
      this.field45872 = var2;
   }

   public void method38744(boolean var1, int var2) {
      this.field45871 = var1;
      this.field45872 = var2;
   }

   public void method38745(GlCullState var1) {
      this.field45871 = var1.field45871;
      this.field45872 = var1.field45872;
   }

   public void method38746(int var1) {
      this.field45872 = var1;
   }

   public void method38747(boolean var1) {
      this.field45871 = var1;
   }

   public void method38748() {
      this.field45871 = true;
   }

   public void method38749() {
      this.field45871 = false;
   }

   public boolean method38750() {
      return this.field45871;
   }

   public int method38751() {
      return this.field45872;
   }

   @Override
   public String toString() {
      return "enabled: " + this.field45871 + ", mode: " + this.field45872;
   }
}
