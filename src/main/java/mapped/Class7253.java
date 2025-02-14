package mapped;

import java.util.List;

public abstract class Class7253<T> extends Class7255 {
   private Class2214 field31126;

   public Class7253(Class9757 var1, Class2512 var2, Class2512 var3, Class2214 var4) {
      super(var1, var2, var3);
      this.method22773(var4);
   }

   public abstract List<T> method22770();

   public Class2214 method22772() {
      return this.field31126;
   }

   public void method22773(Class2214 var1) {
      if (var1 != null) {
         this.field31126 = var1;
      } else {
         throw new NullPointerException("Flow style must be provided.");
      }
   }

   public void method22774(Class2512 var1) {
      this.field31131 = var1;
   }
}
