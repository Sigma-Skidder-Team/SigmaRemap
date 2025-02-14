package mapped;

public final class Class9311 {
   private final CharSequence field43239;
   private int field43240;

   public Class9311(CharSequence var1) {
      this.field43239 = var1;
   }

   public char method35177() {
      return this.field43239.charAt(this.field43240);
   }

   public char method35178(int var1) {
      return this.field43239.charAt(this.field43240 + var1);
   }

   public char method35179() {
      return this.field43239.charAt(this.field43240++);
   }

   public boolean method35180() {
      this.field43240++;
      return this.method35181();
   }

   public boolean method35181() {
      return this.field43240 < this.field43239.length();
   }

   public CharSequence method35182(char var1) throws Class2459 {
      var1 = Character.toLowerCase(var1);
      int var4 = -1;

      for (int var5 = this.field43240; var5 < this.field43239.length(); var5++) {
         if (this.field43239.charAt(var5) != '\\') {
            if (Character.toLowerCase(this.field43239.charAt(var5)) == var1) {
               var4 = var5;
               break;
            }
         } else {
            var5++;
         }
      }

      if (var4 != -1) {
         CharSequence var7 = this.field43239.subSequence(this.field43240, var4);
         this.field43240 = var4 + 1;
         return var7;
      } else {
         throw this.method35185("No occurrence of " + var1 + " was found");
      }
   }

   public Class9311 method35183(char var1) throws Class2459 {
      this.method35184();
      if (this.method35181()) {
         if (this.method35177() == var1) {
            this.method35179();
            return this;
         } else {
            throw this.method35185("Expected character '" + var1 + "' but got '" + this.method35177() + "'");
         }
      } else {
         throw this.method35185("Expected character '" + var1 + "' but got EOF");
      }
   }

   public Class9311 method35184() {
      while (this.method35181() && Character.isWhitespace(this.method35177())) {
         this.method35180();
      }

      return this;
   }

   public Class2459 method35185(String var1) {
      return new Class2459(var1, this.field43239, this.field43240);
   }
}
