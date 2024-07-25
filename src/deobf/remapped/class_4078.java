package remapped;

import java.util.regex.Pattern;

public final class class_4078 {
   private final class_9592 field_19847;
   private final Pattern field_19848;

   public class_4078(class_9592 var1, Pattern var2) {
      this.field_19847 = var1;
      this.field_19848 = var2;
   }

   public class_9592 method_18803() {
      return this.field_19847;
   }

   public Pattern method_18805() {
      return this.field_19848;
   }

   @Override
   public String toString() {
      return "Tuple tag=" + this.field_19847 + " regexp=" + this.field_19848;
   }
}
