package remapped;

public class class_2612 extends class_4178 {
   private boolean field_12899;
   private boolean field_12895;
   private boolean field_12897 = false;
   public class_7038 field_12901;
   public class_9568 field_12902;
   private boolean field_12894 = true;
   public int field_12900 = 35;
   public boolean field_12896 = false;

   public class_2612(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_11847();
   }

   public class_2612(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method_11847();
   }

   public class_2612(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method_11847();
   }

   public class_2612(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, FontRenderer var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method_11847();
   }

   private final void method_11847() {
      this.method_32134().add(this.field_12901 = new class_7038(this, "content", 0, 0, this.field_36278, this.field_36257));
      this.field_12901.method_32135(new class_4383());
      this.method_32134().add(this.field_12902 = new class_9568(this, 11));
      this.field_12902.method_32187(true);
   }

   public void method_11851(int var1) {
      this.field_12902.field_48684 = var1;
   }

   public int method_11853() {
      return this.field_12902 != null ? this.field_12902.field_48684 : 0;
   }

   public void method_11849(boolean var1) {
      this.field_12897 = var1;
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (!this.field_12897 || this.method_32126()) {
         super.method_32145(var1, var2);
         this.field_12901.method_32117(-1 * this.field_12902.method_2266());

         for (class_7038 var6 : this.method_11850().method_32134()) {
            for (class_4726 var8 : var6.method_32123()) {
               var8.method_21840(var6, this);
            }
         }
      }
   }

   public void method_11852(boolean var1) {
      this.field_12894 = var1;
   }

   public boolean method_11854() {
      return this.field_12894;
   }

   @Override
   public void method_32178(float var1) {
      this.method_32190();
      if (!this.field_12897 || this.method_32126()) {
         if (this.field_12894) {
            FontManager.method_151(this);
         }

         super.method_32178(var1);
         if (this.field_12894) {
            FontManager.method_141();
         }
      }
   }

   @Override
   public void method_32148(class_7038 var1) {
      this.field_12901.method_32148(var1);
   }

   @Override
   public boolean method_32116(class_7038 var1) {
      return this.field_12901.method_32116(var1);
   }

   @Override
   public boolean method_32115(String var1) {
      return this.field_12901.method_32115(var1);
   }

   public class_7038 method_11850() {
      return this.field_12901;
   }

   public void method_11848(boolean var1) {
      this.field_12896 = var1;
   }
}
