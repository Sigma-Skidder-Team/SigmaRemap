package mapped;

public final class Class9077 {
   private int field41524;
   private boolean field41525;
   private int field41526;
   private int field41527;
   private int field41528;
   private Class2512 field41529;

   public Class9077(int var1, boolean var2, int var3, int var4, int var5, Class2512 var6) {
      this.field41524 = var1;
      this.field41525 = var2;
      this.field41526 = var3;
      this.field41527 = var4;
      this.field41528 = var5;
      this.field41529 = var6;
   }

   public int method33818() {
      return this.field41524;
   }

   public int method33819() {
      return this.field41528;
   }

   public Class2512 method33820() {
      return this.field41529;
   }

   public int method33821() {
      return this.field41526;
   }

   public int method33822() {
      return this.field41527;
   }

   public boolean method33823() {
      return this.field41525;
   }

   @Override
   public String toString() {
      return "SimpleKey - tokenNumber="
         + this.field41524
         + " required="
         + this.field41525
         + " index="
         + this.field41526
         + " line="
         + this.field41527
         + " column="
         + this.field41528;
   }
}
