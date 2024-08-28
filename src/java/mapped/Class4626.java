package mapped;

public abstract class Class4626 implements Class4632 {
   @Override
   public void method14588(Class7255 var1, Object var2) {
      if (!var1.method22787()) {
         throw new Class2478("Unexpected recursive structure for Node: " + var1);
      } else {
         throw new IllegalStateException("Not Implemented in " + this.getClass().getName());
      }
   }
}
