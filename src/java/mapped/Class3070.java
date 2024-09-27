package mapped;

public class Class3070 implements Class2982 {
   public final Class4016 field18238;

   public Class3070(Class4016 var1) {
      this.field18238 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class9738 var4 = var1.<Class9738>method30561(BruhMotha.field22569);
      Class8770.method31636(var4);
      if (ViaVersion3.method27612().setTruncate114books()) {
         if (var4 == null) {
            return;
         }

         Class72 var5 = var4.method38167();
         if (var5 == null) {
            return;
         }

         Class61 var6 = var5.<Class61>method235("pages");
         if (!(var6 instanceof Class60)) {
            return;
         }

         Class60 var7 = (Class60)var6;
         if (var7.method202() <= 50) {
            return;
         }

         var7.method197(var7.method205().subList(0, 50));
      }
   }
}
