package mapped;

public class Class7256 extends Class7255 {
   private Class1857 field31136;
   private String field31137;

   public Class7256(Class9757 var1, String var2, Class2512 var3, Class2512 var4, Class1857 var5) {
      this(var1, true, var2, var3, var4, var5);
   }

   public Class7256(Class9757 var1, boolean var2, String var3, Class2512 var4, Class2512 var5, Class1857 var6) {
      super(var1, var4, var5);
      if (var3 != null) {
         this.field31137 = var3;
         if (var6 != null) {
            this.field31136 = var6;
            this.field31134 = var2;
         } else {
            throw new NullPointerException("Scalar style must be provided.");
         }
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public Class1857 method22790() {
      return this.field31136;
   }

   @Override
   public Class2048 method22769() {
      return Class2048.field13364;
   }

   public String method22791() {
      return this.field31137;
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + " (tag=" + this.method22780() + ", value=" + this.method22791() + ")>";
   }

   public boolean method22792() {
      return this.field31136 == Class1857.field9898;
   }
}
