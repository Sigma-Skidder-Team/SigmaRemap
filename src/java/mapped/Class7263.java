package mapped;

import java.io.IOException;

public final class Class7263 extends Class7264 implements Class7266 {
   private final Class7723 field31155;
   public int field31165 = 1;

   public Class7263(Class7723 var2) {
      this.field31155 = var2;
   }


   public boolean method22809(Class7284 var1) {
       return var1.method22943() == this.field31155.method25539().method19049().method22943();
   }


   @Override
   public void method22816(FramedStream var1) throws IOException {
      var1.method37988(Class2077.field13531);
   }

   @Override
   public void method22817(FramedConnection var1) {
      this.field31165 = var1.method7709();
   }

}
