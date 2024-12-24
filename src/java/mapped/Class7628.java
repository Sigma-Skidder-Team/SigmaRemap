package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class7628 extends Class7626 {
   private final Pattern field32702 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
   private String field32703;
   private List<Class7626> field32704;

   public Class7628(Class7628 var1) {
      super(var1);
      this.method25039(var1.method25037());
      if (var1.method25038() != null) {
         ArrayList var4 = new ArrayList();

         for (Class7626 var6 : var1.method25038()) {
            var4.add(var6.method24990());
         }

         this.method25032(var4);
      }
   }

   public Class7628(String var1, Object... var2) {
      this.method25039(var1);
      if (var2 != null && var2.length != 0) {
         ArrayList var5 = new ArrayList();

         for (Object var9 : var2) {
            if (!(var9 instanceof Class7626)) {
               var5.add(new Class7630(String.valueOf(var9)));
            } else {
               var5.add((Class7626)var9);
            }
         }

         this.method25032(var5);
      }
   }

   @Override
   public Class7626 method24990() {
      return new Class7628(this);
   }

   public void method25032(List<Class7626> var1) {
      for (Class7626 var5 : var1) {
         var5.field32690 = this;
      }

      this.field32704 = var1;
   }

   public void method25033(String var1) {
      this.method25034(new Class7630(var1));
   }

   public void method25034(Class7626 var1) {
      if (this.field32704 == null) {
         this.field32704 = new ArrayList<Class7626>();
      }

      var1.field32690 = this;
      this.field32704.add(var1);
   }

   @Override
   public void method25015(StringBuilder var1) {
      String var4 = Class6856.field29778.method20894(this.field32703);
      Matcher var5 = this.field32702.matcher(var4);
      int var6 = 0;
      int var7 = 0;

      while (var5.find(var6)) {
         int var8 = var5.start();
         if (var8 != var6) {
            var1.append(var4.substring(var6, var8));
         }

         var6 = var5.end();
         String var9 = var5.group(2);
         switch (var9.charAt(0)) {
            case '%':
               var1.append('%');
               break;
            case 'd':
            case 's':
               String var10 = var5.group(1);
               this.field32704.get(var10 != null ? Integer.parseInt(var10) - 1 : var7++).method25015(var1);
         }
      }

      if (var4.length() != var6) {
         var1.append(var4.substring(var6, var4.length()));
      }

      super.method25015(var1);
   }

   @Override
   public void method24983(StringBuilder var1) {
      String var4 = Class6856.field29778.method20894(this.field32703);
      Matcher var5 = this.field32702.matcher(var4);
      int var6 = 0;
      int var7 = 0;

      while (var5.find(var6)) {
         int var8 = var5.start();
         if (var8 != var6) {
            this.method25035(var1);
            var1.append(var4.substring(var6, var8));
         }

         var6 = var5.end();
         String var9 = var5.group(2);
         switch (var9.charAt(0)) {
            case '%':
               this.method25035(var1);
               var1.append('%');
               break;
            case 'd':
            case 's':
               String var10 = var5.group(1);
               this.field32704.get(var10 != null ? Integer.parseInt(var10) - 1 : var7++).method24983(var1);
         }
      }

      if (var4.length() != var6) {
         this.method25035(var1);
         var1.append(var4.substring(var6, var4.length()));
      }

      super.method24983(var1);
   }

   private void method25035(StringBuilder var1) {
      var1.append(this.method24998());
      if (this.method25000()) {
         var1.append(TextFormatting.BOLD);
      }

      if (this.method25002()) {
         var1.append(TextFormatting.ITALIC);
      }

      if (this.method25004()) {
         var1.append(TextFormatting.UNDERLINE);
      }

      if (this.method25006()) {
         var1.append(TextFormatting.STRIKETHROUGH);
      }

      if (this.method25008()) {
         var1.append(TextFormatting.OBFUSCATED);
      }
   }

   public Pattern method25036() {
      return this.field32702;
   }

   public String method25037() {
      return this.field32703;
   }

   public List<Class7626> method25038() {
      return this.field32704;
   }

   public void method25039(String var1) {
      this.field32703 = var1;
   }

   @Override
   public String toString() {
      return "TranslatableComponent(format=" + this.method25036() + ", translate=" + this.method25037() + ", with=" + this.method25038() + ")";
   }

   public Class7628() {
   }
}
