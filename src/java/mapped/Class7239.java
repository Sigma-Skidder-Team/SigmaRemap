package mapped;

import java.util.Map;

public final class Class7239 implements Class7238 {
   public final Map field31090;

   public Class7239(Map var1) {
      this.field31090 = var1;
   }

   @Override
   public void method22732(Class7432 var1, Class8075 var2) {
      synchronized (this.field31090) {
         this.field31090.put("Response", var2);
         this.field31090.notifyAll();
      }
   }

   @Override
   public void method22733(Class7432 var1, Exception var2) {
      synchronized (this.field31090) {
         this.field31090.put("Exception", var2);
         this.field31090.notifyAll();
      }
   }
}
