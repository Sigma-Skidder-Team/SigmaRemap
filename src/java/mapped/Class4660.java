package mapped;

public class Class4660 extends Class4661 {
   public Class4660(ViaVersion7 var1, Class8584 var2) {
      super(var1, var2);
      this.field22197.put("stonecutting", this::method14626);
      this.field22197.put("blasting", this::method14627);
      this.field22197.put("smoking", this::method14627);
      this.field22197.put("campfire_cooking", this::method14627);
   }

   public void method14626(Class8563 var1) throws Exception {
      var1.<String>method30561(Class4750.field22539);
      Class9738[] var4 = var1.<Class9738[]>method30561(Class4750.field22573);

      for (Class9738 var8 : var4) {
         this.field22196.method30683(var8);
      }

      this.field22196.method30683(var1.<Class9738>method30561(Class4750.field22569));
   }
}
