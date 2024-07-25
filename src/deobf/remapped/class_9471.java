package remapped;

public final class class_9471 {
   private static final String field_48297 = "*.";
   public final String field_48295;
   public final String field_48296;
   public final String field_48300;
   public final class_9091 field_48299;

   public class_9471(String var1, String var2) {
      this.field_48295 = var1;
      this.field_48296 = !var1.startsWith("*.")
         ? class_1672.method_7484("http://" + var1).method_7449()
         : class_1672.method_7484("http://" + var1.substring("*.".length())).method_7449();
      if (!var2.startsWith("sha1/")) {
         if (!var2.startsWith("sha256/")) {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + var2);
         }

         this.field_48300 = "sha256/";
         this.field_48299 = class_9091.method_41878(var2.substring("sha256/".length()));
      } else {
         this.field_48300 = "sha1/";
         this.field_48299 = class_9091.method_41878(var2.substring("sha1/".length()));
      }

      if (this.field_48299 == null) {
         throw new IllegalArgumentException("pins must be base64: " + var2);
      }
   }

   public boolean method_43755(String var1) {
      if (!this.field_48295.startsWith("*.")) {
         return var1.equals(this.field_48296);
      } else {
         int var4 = var1.indexOf(46);
         return var1.regionMatches(false, var4 + 1, this.field_48296, 0, this.field_48296.length());
      }
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_9471
         && this.field_48295.equals(((class_9471)var1).field_48295)
         && this.field_48300.equals(((class_9471)var1).field_48300)
         && this.field_48299.equals(((class_9471)var1).field_48299);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_48295.hashCode();
      var3 = 31 * var3 + this.field_48300.hashCode();
      return 31 * var3 + this.field_48299.hashCode();
   }

   @Override
   public String toString() {
      return this.field_48300 + this.field_48299.method_41880();
   }
}
