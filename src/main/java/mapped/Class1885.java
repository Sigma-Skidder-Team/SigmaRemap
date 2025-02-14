package mapped;

public class Class1885 implements Class1884 {
   private Class1910 field11040;
   private int field11041;
   private int field11042;

   public Class1885(Class1910 var1) {
      this(var1, 0, 0);
   }

   public Class1885(Class1910 var1, int var2) {
      this(var1, var2, 0);
   }

   public Class1885(Class1910 var1, int var2, int var3) {
      this.field11040 = var1;
      this.field11041 = var2;
      this.field11042 = var3;
   }

   @Override
   public float method8142() {
      return this.field11040.method8187(this.field11041, this.field11042);
   }

   @Override
   public String toString() {
      if (this.field11040.method8185() != null) {
         return this.field11040.method8186() != null
            ? "" + this.field11040 + "." + this.field11040.method8185()[this.field11041] + "." + this.field11040.method8186()[this.field11042]
            : "" + this.field11040 + "." + this.field11040.method8185()[this.field11041];
      } else {
         return "" + this.field11040;
      }
   }
}
