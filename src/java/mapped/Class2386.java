package mapped;

public class Class2386 implements Cloneable {
   private Class6614 field16271 = Class6614.field29101;
   private Class6625 field16272 = new Class6625();

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError(this + ": " + var4);
      }
   }

   public void method9723(Class6614 var1) {
      if (var1 != null) {
         this.field16271 = var1;
      } else {
         throw new NullPointerException("out");
      }
   }

   public Class6614 method9724() {
      return this.field16271;
   }

   public Class6625 method9725() {
      return this.field16272;
   }
}
