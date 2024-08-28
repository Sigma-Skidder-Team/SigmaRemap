package mapped;

public final class Class9723 {
   private static final String field45416 = "*.";
   public final String field45417;
   public final String field45418;
   public final String field45419;
   public final Class2003 field45420;

   public Class9723(String var1, String var2) {
      this.field45417 = var1;
      this.field45418 = !var1.startsWith("*.")
         ? Class7284.method22966("http://" + var1).method22942()
         : Class7284.method22966("http://" + var1.substring("*.".length())).method22942();
      if (!var2.startsWith("sha1/")) {
         if (!var2.startsWith("sha256/")) {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + var2);
         }

         this.field45419 = "sha256/";
         this.field45420 = Class2003.method8448(var2.substring("sha256/".length()));
      } else {
         this.field45419 = "sha1/";
         this.field45420 = Class2003.method8448(var2.substring("sha1/".length()));
      }

      if (this.field45420 == null) {
         throw new IllegalArgumentException("pins must be base64: " + var2);
      }
   }

   public boolean method38082(String var1) {
      if (!this.field45417.startsWith("*.")) {
         return var1.equals(this.field45418);
      } else {
         int var4 = var1.indexOf(46);
         return var1.regionMatches(false, var4 + 1, this.field45418, 0, this.field45418.length());
      }
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class9723
         && this.field45417.equals(((Class9723)var1).field45417)
         && this.field45419.equals(((Class9723)var1).field45419)
         && this.field45420.equals(((Class9723)var1).field45420);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field45417.hashCode();
      var3 = 31 * var3 + this.field45419.hashCode();
      return 31 * var3 + this.field45420.hashCode();
   }

   @Override
   public String toString() {
      return this.field45419 + this.field45420.method8437();
   }
}
