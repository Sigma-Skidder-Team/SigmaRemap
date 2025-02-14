package mapped;

public class Class1881 implements Class1879, Class1882 {
   private Class1879 field11034;
   private boolean field11035;
   private float[] field11036;

   public Class1881(Class1879 var1) {
      this.field11034 = var1;
   }

   @Override
   public float[] method8140() {
      if (!this.field11035) {
         this.field11036 = this.field11034.method8140();
         this.field11035 = true;
      }

      return this.field11036;
   }

   @Override
   public void method8141() {
      this.field11035 = false;
   }

   @Override
   public Class2118 method8139() {
      return Class2118.field13803;
   }

   @Override
   public String toString() {
      return "cached(" + this.field11034 + ")";
   }
}
