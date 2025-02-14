package mapped;

public class Class2022 implements Comparable {
   private int field13124;
   private int field13125;
   private float field13126;
   private Class2022 field13127;
   private float field13128;
   private int field13129;
   private boolean field13130;
   private boolean field13131;
   public final Class4650 field13132;

   public Class2022(Class4650 var1, int var2, int var3) {
      this.field13132 = var1;
      this.field13124 = var2;
      this.field13125 = var3;
   }

   public int method8610(Class2022 var1) {
      this.field13129 = var1.field13129 + 1;
      this.field13127 = var1;
      return this.field13129;
   }

   @Override
   public int compareTo(Object var1) {
      Class2022 var4 = (Class2022)var1;
      float var5 = this.field13128 + this.field13126;
      float var6 = var4.field13128 + var4.field13126;
      if (!(var5 < var6)) {
         return !(var5 > var6) ? 0 : 1;
      } else {
         return -1;
      }
   }

   public void method8611(boolean var1) {
      this.field13130 = var1;
   }

   public boolean method8612() {
      return this.field13130;
   }

   public void method8613(boolean var1) {
      this.field13131 = var1;
   }

   public boolean method8614() {
      return this.field13131;
   }

   public void method8615() {
      this.field13131 = false;
      this.field13130 = false;
      this.field13126 = 0.0F;
      this.field13129 = 0;
   }

   @Override
   public String toString() {
      return "[Node " + this.field13124 + "," + this.field13125 + "]";
   }

   // $VF: synthetic method
   public static float method8616(Class2022 var0, float var1) {
      return var0.field13126 = var1;
   }

   // $VF: synthetic method
   public static int method8617(Class2022 var0, int var1) {
      return var0.field13129 = var1;
   }

   // $VF: synthetic method
   public static Class2022 method8618(Class2022 var0, Class2022 var1) {
      return var0.field13127 = var1;
   }

   // $VF: synthetic method
   public static int method8619(Class2022 var0) {
      return var0.field13124;
   }

   // $VF: synthetic method
   public static int method8620(Class2022 var0) {
      return var0.field13125;
   }

   // $VF: synthetic method
   public static int method8621(Class2022 var0) {
      return var0.field13129;
   }

   // $VF: synthetic method
   public static float method8622(Class2022 var0) {
      return var0.field13126;
   }

   // $VF: synthetic method
   public static float method8623(Class2022 var0, float var1) {
      return var0.field13128 = var1;
   }

   // $VF: synthetic method
   public static Class2022 method8624(Class2022 var0) {
      return var0.field13127;
   }
}
