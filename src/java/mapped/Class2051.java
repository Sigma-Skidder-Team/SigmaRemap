package mapped;

public interface Class2051 extends Class2052 {
   int method8687();

   int method8688();

   void method8691(int var1, int var2);

   boolean method8692();

   float method8690();

   default float method8694() {
      return this.method8700();
   }

   default float method8695() {
      return this.method8694() + (float)this.method8687() / this.method8690();
   }

   default float method8696() {
      return this.method8698();
   }

   default float method8697() {
      return this.method8696() + (float)this.method8688() / this.method8690();
   }

   default float method8698() {
      return 3.0F;
   }
}
