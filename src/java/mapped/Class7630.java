package mapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class7630 extends Class7626 {
   private static final Pattern field32706 = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
   private String field32707;

   public static Class7626[] method25042(String var0) {
      return method25043(var0, ChatFormatting.WHITE);
   }

   public static Class7626[] method25043(String var0, ChatFormatting var1) {
      List<Class7626> var4 = new ArrayList();
      StringBuilder var5 = new StringBuilder();
      Class7630 var6 = new Class7630();
      Matcher var7 = field32706.matcher(var0);

      for (int var8 = 0; var8 < var0.length(); var8++) {
         char var9 = var0.charAt(var8);
         if (var9 == 167) {
            if (++var8 >= var0.length()) {
               break;
            }

            var9 = var0.charAt(var8);
            if (var9 >= 'A' && var9 <= 'Z') {
               var9 = (char)(var9 + ' ');
            }

            ChatFormatting var10 = ChatFormatting.getChatFormatting(var9);
            if (var10 != null) {
               if (var5.length() > 0) {
                  Class7630 var11 = var6;
                  var6 = new Class7630(var6);
                  var11.method25045(var5.toString());
                  var5 = new StringBuilder();
                  var4.add(var11);
               }

               switch (Class8362.field35913[var10.ordinal()]) {
                  case 1:
                     var6.method25018(Boolean.valueOf(true));
                     break;
                  case 2:
                     var6.method25019(Boolean.valueOf(true));
                     break;
                  case 3:
                     var6.method25020(Boolean.valueOf(true));
                     break;
                  case 4:
                     var6.method25021(Boolean.valueOf(true));
                     break;
                  case 5:
                     var6.method25022(Boolean.valueOf(true));
                     break;
                  case 6:
                     var10 = var1;
                  default:
                     var6 = new Class7630();
                     var6.method25017(var10);
               }
            }
         } else {
            int var15 = var0.indexOf(32, var8);
            if (var15 == -1) {
               var15 = var0.length();
            }

            if (var7.region(var8, var15).find()) {
               if (var5.length() > 0) {
                  Class7630 var16 = var6;
                  var6 = new Class7630(var6);
                  var16.method25045(var5.toString());
                  var5 = new StringBuilder();
                  var4.add(var16);
               }

               Class7630 var13 = new Class7630(var6);
               String var12 = var0.substring(var8, var15);
               var13.method25045(var12);
               var13.method25024(new Class7576(Class2027.field13156, var12.startsWith("http") ? var12 : "http://" + var12));
               var4.add(var13);
               var8 += var15 - var8 - 1;
               var6 = var6;
            } else {
               var5.append(var9);
            }
         }
      }

      var6.method25045(var5.toString());
      var4.add(var6);
      return var4.toArray(new Class7626[var4.size()]);
   }

   public Class7630() {
      this.field32707 = "";
   }

   public Class7630(Class7630 var1) {
      super(var1);
      this.method25045(var1.method25044());
   }

   public Class7630(Class7626... var1) {
      this.method25045("");
      this.method25010(new ArrayList<Class7626>(Arrays.asList(var1)));
   }

   @Override
   public Class7626 method24990() {
      return new Class7630(this);
   }

   @Override
   public void method25015(StringBuilder var1) {
      var1.append(this.field32707);
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

      var1.append(this.field32707);
      super.method24983(var1);
   }

   @Override
   public String toString() {
      return String.format("TextComponent{text=%s, %s}", this.field32707, super.toString());
   }

   public String method25044() {
      return this.field32707;
   }

   public void method25045(String var1) {
      this.field32707 = var1;
   }

   public Class7630(String var1) {
      this.field32707 = var1;
   }
}
