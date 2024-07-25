package remapped;

public abstract class class_4575 implements class_9420 {
   @Override
   public void method_43612(class_1621 var1, Object var2) {
      if (!var1.method_7225()) {
         throw new class_5251("Unexpected recursive structure for Node: " + var1);
      } else {
         throw new IllegalStateException("Not Implemented in " + this.getClass().getName());
      }
   }
}
