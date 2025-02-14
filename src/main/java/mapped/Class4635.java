package mapped;

import java.util.Set;

public class Class4635 implements Class4632 {
   public final Class6211 field22161;

   public Class4635(Class6211 var1) {
      this.field22161 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      if (!var1.method22787()) {
         return this.field22161.method19182((Class7254)var1);
      } else {
         return !this.field22161.field27705.containsKey(var1)
            ? this.field22161.method19167(((Class7254)var1).method22770().size())
            : this.field22161.field27705.get(var1);
      }
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      if (!var1.method22787()) {
         throw new Class2478("Unexpected recursive set structure. Node: " + var1);
      } else {
         this.field22161.method19151((Class7254)var1, (Set<Object>)var2);
      }
   }
}
