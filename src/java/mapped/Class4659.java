package mapped;

public class Class4659 extends Class4660 {
   public Class4659(ViaVersion7 var1, Class8584 var2) {
      super(var1, var2);
      this.field22197.put("smithing", this::method14625);
   }

   public void method14625(Class8563 var1) throws Exception {
      Class9738[] var4 = var1.<Class9738[]>method30561(BruhMotha.field22573);

      for (Class9738 var8 : var4) {
         this.field22196.method30683(var8);
      }

      Class9738[] var10 = var1.<Class9738[]>method30561(BruhMotha.field22573);

      for (Class9738 var9 : var10) {
         this.field22196.method30683(var9);
      }

      this.field22196.method30683(var1.<Class9738>method30561(BruhMotha.field22569));
   }
}
