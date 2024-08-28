package mapped;

@FunctionalInterface
public interface Class3008 extends Class3007 {
   void method11400(Class8563 var1) throws Exception;

   @Override
   default void method11399(Class8563 var1, Object var2) throws Exception {
      try {
         this.method11400(var1);
      } catch (Class2447 var6) {
         var6.method10459(this.getClass());
         throw var6;
      }
   }
}
