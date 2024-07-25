package remapped;

import com.mojang.bridge.game.Language;

public class class_7395 implements Language, Comparable<class_7395> {
   private final String field_37753;
   private final String field_37757;
   private final String field_37755;
   private final boolean field_37756;

   public class_7395(String var1, String var2, String var3, boolean var4) {
      this.field_37753 = var1;
      this.field_37757 = var2;
      this.field_37755 = var3;
      this.field_37756 = var4;
   }

   public String getCode() {
      return this.field_37753;
   }

   public String getName() {
      return this.field_37755;
   }

   public String getRegion() {
      return this.field_37757;
   }

   public boolean method_33675() {
      return this.field_37756;
   }

   @Override
   public String toString() {
      return String.format("%s (%s)", this.field_37755, this.field_37757);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         return var1 instanceof class_7395 ? this.field_37753.equals(((class_7395)var1).field_37753) : false;
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_37753.hashCode();
   }

   public int compareTo(class_7395 var1) {
      return this.field_37753.compareTo(var1.field_37753);
   }
}
