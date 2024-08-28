package mapped;

public class Class2506 extends RuntimeException {
   private static String[] field16613;
   private final Class4526 field16614;

   public Class2506(Class4526 var1) {
      this.field16614 = var1;
   }

   public Class4526 method10487() {
      return this.field16614;
   }

   @Override
   public Throwable getCause() {
      return this.field16614.method14403();
   }

   @Override
   public String getMessage() {
      return this.field16614.method14402();
   }
}
