package mapped;

import net.minecraft.util.ResourceLocation;

public final class Class9431 {
   private final ResourceLocation field43750;
   private int field43751;
   private int field43752;
   private final Class7788 field43753;
   private double field43754 = 1.0;

   public Class9431(ResourceLocation var1, int var2, int var3, Class7788 var4) {
      this.field43750 = var1;
      this.field43751 = var2;
      this.field43752 = var3;
      this.field43753 = var4;
   }

   public ResourceLocation method36195() {
      return this.field43750;
   }

   public int method36196() {
      return this.field43751;
   }

   public int method36197() {
      return this.field43752;
   }

   public void method36198(int var1) {
      this.field43751 = var1;
   }

   public void method36199(int var1) {
      this.field43752 = var1;
   }

   public Class7788 method36200() {
      return this.field43753;
   }

   public double method36201() {
      return this.field43754;
   }

   public void method36202(double var1) {
      this.field43754 = var1;
   }

   @Override
   public String toString() {
      return ""
         + this.field43750
         + ", width: "
         + this.field43751
         + ", height: "
         + this.field43752
         + ", frames: "
         + this.field43753.method25812()
         + ", scale: "
         + this.field43754;
   }

   // $VF: synthetic method
   public static Class7788 method36203(Class9431 var0) {
      return var0.field43753;
   }

   // $VF: synthetic method
   public static int method36204(Class9431 var0) {
      return var0.field43751;
   }

   // $VF: synthetic method
   public static int method36205(Class9431 var0) {
      return var0.field43752;
   }

   // $VF: synthetic method
   public static double method36206(Class9431 var0) {
      return var0.field43754;
   }

   // $VF: synthetic method
   public static ResourceLocation method36207(Class9431 var0) {
      return var0.field43750;
   }
}
