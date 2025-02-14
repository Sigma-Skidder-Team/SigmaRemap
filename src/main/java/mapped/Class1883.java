package mapped;

public class Class1883 implements Class1884, Class1882 {
   private Class1884 field11037;
   private boolean field11038;
   private float field11039;

   public Class1883(Class1884 var1) {
      this.field11037 = var1;
   }

   @Override
   public float method8142() {
      if (!this.field11038) {
         this.field11039 = this.field11037.method8142();
         this.field11038 = true;
      }

      return this.field11039;
   }

   @Override
   public void method8141() {
      this.field11038 = false;
   }

   @Override
   public Class2118 method8139() {
      return Class2118.field13803;
   }

   @Override
   public String toString() {
      return "cached(" + this.field11037 + ")";
   }
}
