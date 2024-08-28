package mapped;

public class Class4661 extends Class4662 {
   public Class4661(Class6355 var1, Class8584 var2) {
      super(var1, var2);
      this.field22197.put("crafting_shapeless", this::method14629);
      this.field22197.put("crafting_shaped", this::method14628);
      this.field22197.put("smelting", this::method14627);
   }

   public void method14627(Class8563 var1) throws Exception {
      var1.<String>method30561(Class4750.field22539);
      Class9738[] var4 = var1.<Class9738[]>method30561(Class4750.field22573);

      for (Class9738 var8 : var4) {
         this.field22196.method30683(var8);
      }

      this.field22196.method30683(var1.<Class9738>method30561(Class4750.field22569));
      var1.<Float>method30561(Class4750.field22532);
      var1.<Integer>method30561(Class4750.field22544);
   }

   public void method14628(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30561(Class4750.field22544) * var1.<Integer>method30561(Class4750.field22544);
      var1.<String>method30561(Class4750.field22539);

      for (int var5 = 0; var5 < var4; var5++) {
         Class9738[] var6 = var1.<Class9738[]>method30561(Class4750.field22573);

         for (Class9738 var10 : var6) {
            this.field22196.method30683(var10);
         }
      }

      this.field22196.method30683(var1.<Class9738>method30561(Class4750.field22569));
   }

   public void method14629(Class8563 var1) throws Exception {
      var1.<String>method30561(Class4750.field22539);
      int var4 = var1.<Integer>method30561(Class4750.field22544);

      for (int var5 = 0; var5 < var4; var5++) {
         Class9738[] var6 = var1.<Class9738[]>method30561(Class4750.field22573);

         for (Class9738 var10 : var6) {
            this.field22196.method30683(var10);
         }
      }

      this.field22196.method30683(var1.<Class9738>method30561(Class4750.field22569));
   }
}
