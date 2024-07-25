package remapped;

@FunctionalInterface
public interface class_5226 extends class_1450 {
   void method_23914(class_5051 var1) throws Exception;

   @Override
   default void method_6684(class_5051 var1, Object var2) throws Exception {
      try {
         this.method_23914(var1);
      } catch (class_9699 var6) {
         var6.method_44826(this.getClass());
         throw var6;
      }
   }
}
