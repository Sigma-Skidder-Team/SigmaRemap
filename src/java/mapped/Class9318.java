package mapped;

public class Class9318 {
   private static String[] field43256;
   public float field43257;
   public float field43258;
   public float field43259;
   public float field43260;

   public Class9318(float var1, float var2, float var3, float var4) {
      this.field43257 = var1;
      this.field43258 = var2;
      this.field43259 = var3;
      this.field43260 = var4;
   }

   public Class9318(Class2344 var1) {
      this.field43257 = Float.parseFloat(var1.method9131(0));
      this.field43258 = Float.parseFloat(var1.method9131(1));
      this.field43259 = Float.parseFloat(var1.method9131(2));
      this.field43260 = Float.parseFloat(var1.method9131(3));
   }

   public Class2344 method35208() {
      Class2344 var3 = new Class2344();
      var3.method9165(0, Float.toString(this.field43257));
      var3.method9165(1, Float.toString(this.field43258));
      var3.method9165(2, Float.toString(this.field43259));
      var3.method9165(3, Float.toString(this.field43260));
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1 instanceof Class9318) {
         Class9318 var4 = (Class9318)var1;
         return this.field43257 == var4.field43257
            && this.field43258 == var4.field43258
            && this.field43259 == var4.field43259
            && this.field43260 == var4.field43260;
      } else {
         return false;
      }
   }
}
