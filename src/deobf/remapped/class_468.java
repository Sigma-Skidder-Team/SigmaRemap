package remapped;

import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;

public class class_468 {
   private final String field_2932;
   private final String field_2931;
   private final String field_2933;

   private class_468(String var1) {
      this.field_2932 = var1;
      this.field_2931 = null;
      this.field_2933 = null;
   }

   private class_468(String var1, String var2, String var3) {
      this.field_2932 = var1;
      this.field_2931 = var2;
      this.field_2933 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_468 var4 = (class_468)var1;
         return Objects.equals(this.field_2932, var4.field_2932)
            && Objects.equals(this.field_2931, var4.field_2931)
            && Objects.equals(this.field_2933, var4.field_2933);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_2932, this.field_2931, this.field_2933);
   }

   @Override
   public String toString() {
      return "Segment{fullText='" + this.field_2932 + '\'' + ", linkTitle='" + this.field_2931 + '\'' + ", linkUrl='" + this.field_2933 + '\'' + '}';
   }

   public String method_2253() {
      return !this.method_2249() ? this.field_2932 : this.field_2931;
   }

   public boolean method_2249() {
      return this.field_2931 != null;
   }

   public String method_2251() {
      if (this.method_2249()) {
         return this.field_2933;
      } else {
         throw new IllegalStateException("Not a link: " + this);
      }
   }

   public static class_468 method_2254(String var0, String var1) {
      return new class_468((String)null, var0, var1);
   }

   @VisibleForTesting
   public static class_468 method_2250(String var0) {
      return new class_468(var0);
   }
}
