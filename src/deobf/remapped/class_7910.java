package remapped;

import us.myles.ViaVersion.api.minecraft.nbt.StringTagParseException;

public final class class_7910 {
   private final CharSequence field_40437;
   private int field_40438;

   public class_7910(CharSequence var1) {
      this.field_40437 = var1;
   }

   public char method_35789() {
      return this.field_40437.charAt(this.field_40438);
   }

   public char method_35790(int var1) {
      return this.field_40437.charAt(this.field_40438 + var1);
   }

   public char method_35785() {
      return this.field_40437.charAt(this.field_40438++);
   }

   public boolean method_35786() {
      this.field_40438++;
      return this.method_35782();
   }

   public boolean method_35782() {
      return this.field_40438 < this.field_40437.length();
   }

   public CharSequence method_35787(char var1) throws StringTagParseException {
      var1 = Character.toLowerCase(var1);
      int var4 = -1;

      for (int var5 = this.field_40438; var5 < this.field_40437.length(); var5++) {
         if (this.field_40437.charAt(var5) != '\\') {
            if (Character.toLowerCase(this.field_40437.charAt(var5)) == var1) {
               var4 = var5;
               break;
            }
         } else {
            var5++;
         }
      }

      if (var4 != -1) {
         CharSequence var7 = this.field_40437.subSequence(this.field_40438, var4);
         this.field_40438 = var4 + 1;
         return var7;
      } else {
         throw this.method_35781("No occurrence of " + var1 + " was found");
      }
   }

   public class_7910 method_35784(char var1) throws StringTagParseException {
      this.method_35783();
      if (this.method_35782()) {
         if (this.method_35789() == var1) {
            this.method_35785();
            return this;
         } else {
            throw this.method_35781("Expected character '" + var1 + "' but got '" + this.method_35789() + "'");
         }
      } else {
         throw this.method_35781("Expected character '" + var1 + "' but got EOF");
      }
   }

   public class_7910 method_35783() {
      while (this.method_35782() && Character.isWhitespace(this.method_35789())) {
         this.method_35786();
      }

      return this;
   }

   public class_5381 method_35781(String var1) {
      return new class_5381(var1, this.field_40437, this.field_40438);
   }
}
