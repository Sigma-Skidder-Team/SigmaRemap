package mapped;

import java.util.List;

public class Class4637 implements Class4632 {
   public final Class6211 field22163;

   public Class4637(Class6211 var1) {
      this.field22163 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7252 var4 = (Class7252)var1;
      return !var1.method22787() ? this.field22163.method19177(var4) : this.field22163.method19175(var4);
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      if (!var1.method22787()) {
         throw new Class2478("Unexpected recursive sequence structure. Node: " + var1);
      } else {
         this.field22163.method19180((Class7252)var1, (List)var2);
      }
   }
}
