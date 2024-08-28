package mapped;

import java.util.Map;

public class Class4639 implements Class4632 {
   public final Class6211 field22165;

   public Class4639(Class6211 var1) {
      this.field22165 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7254 var4 = (Class7254)var1;
      return !var1.method22787() ? this.field22165.method19183(var4) : this.field22165.method19168(var4.method22770().size());
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      if (!var1.method22787()) {
         throw new Class2478("Unexpected recursive mapping structure. Node: " + var1);
      } else {
         this.field22165.method19150((Class7254)var1, (Map<Object, Object>)var2);
      }
   }
}
