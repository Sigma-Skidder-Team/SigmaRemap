package mapped;

import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;

public class Class6102 {
   private final String field27358;
   private final String field27359;
   private final String field27360;

   private Class6102(String var1) {
      this.field27358 = var1;
      this.field27359 = null;
      this.field27360 = null;
   }

   private Class6102(String var1, String var2, String var3) {
      this.field27358 = var1;
      this.field27359 = var2;
      this.field27360 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class6102 var4 = (Class6102)var1;
         return Objects.equals(this.field27358, var4.field27358)
            && Objects.equals(this.field27359, var4.field27359)
            && Objects.equals(this.field27360, var4.field27360);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field27358, this.field27359, this.field27360);
   }

   @Override
   public String toString() {
      return "Segment{fullText='" + this.field27358 + '\'' + ", linkTitle='" + this.field27359 + '\'' + ", linkUrl='" + this.field27360 + '\'' + '}';
   }

   public String method18864() {
      return !this.method18865() ? this.field27358 : this.field27359;
   }

   public boolean method18865() {
      return this.field27359 != null;
   }

   public String method18866() {
      if (this.method18865()) {
         return this.field27360;
      } else {
         throw new IllegalStateException("Not a link: " + this);
      }
   }

   public static Class6102 method18867(String var0, String var1) {
      return new Class6102((String)null, var0, var1);
   }

   @VisibleForTesting
   public static Class6102 method18868(String var0) {
      return new Class6102(var0);
   }
}
