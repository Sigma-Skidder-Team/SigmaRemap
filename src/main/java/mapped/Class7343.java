package mapped;

import java.util.ResourceBundle;

public class Class7343 implements Class7342 {
   private final ResourceBundle field31448;

   public Class7343(String var1) {
      this.field31448 = ResourceBundle.getBundle(var1);
   }

   @Override
   public String method23265(String var1) {
      return !this.field31448.containsKey(var1) ? null : this.field31448.getString(var1);
   }

   public ResourceBundle method23268() {
      return this.field31448;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof Class7343) {
         Class7343 var4 = (Class7343)var1;
         if (!var4.method23269(this)) {
            return false;
         } else {
            ResourceBundle var5 = this.method23268();
            ResourceBundle var6 = var4.method23268();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return false;
      }
   }

   public boolean method23269(Object var1) {
      return var1 instanceof Class7343;
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      ResourceBundle var5 = this.method23268();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry.ResourceBundleProvider(bundle=" + this.method23268() + ")";
   }
}
