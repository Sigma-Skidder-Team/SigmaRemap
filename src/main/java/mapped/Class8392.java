package mapped;

public class Class8392 {
   private Boolean field36007 = null;

   public boolean method29440() {
      if (this.field36007 == null) {
         this.field36007 = System.getProperty("java.runtime.name").startsWith("Android Runtime");
      }

      return this.field36007;
   }
}
