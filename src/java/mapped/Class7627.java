package mapped;

public final class Class7627 extends Class7626 {
   private String field32701;

   public Class7627(Class7627 var1) {
      super(var1);
      this.method25031(var1.method25030());
   }

   public Class7627(String var1) {
      this.method25031(var1);
   }

   @Override
   public Class7626 method24990() {
      return new Class7627(this);
   }

   @Override
   public void method25015(StringBuilder var1) {
      var1.append(this.method25030());
      super.method25015(var1);
   }

   @Override
   public void method24983(StringBuilder var1) {
      var1.append(this.method24998());
      if (this.method25000()) {
         var1.append(ChatFormatting.BOLD);
      }

      if (this.method25002()) {
         var1.append(ChatFormatting.ITALIC);
      }

      if (this.method25004()) {
         var1.append(ChatFormatting.UNDERLINE);
      }

      if (this.method25006()) {
         var1.append(ChatFormatting.STRIKETHROUGH);
      }

      if (this.method25008()) {
         var1.append(ChatFormatting.OBFUSCATED);
      }

      var1.append(this.method25030());
      super.method24983(var1);
   }

   public String method25030() {
      return this.field32701;
   }

   public void method25031(String var1) {
      this.field32701 = var1;
   }

   @Override
   public String toString() {
      return "KeybindComponent(keybind=" + this.method25030() + ")";
   }

   public Class7627() {
   }
}
