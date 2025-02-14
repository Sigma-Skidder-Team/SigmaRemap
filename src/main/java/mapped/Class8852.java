package mapped;

import java.util.Arrays;

public final class Class8852 {
   private static final String field39991 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
   private static final String field39992 = "\n\u0085\u2028\u2029";
   private static final String field39993 = "\r\n\u0085\u2028\u2029";
   private static final String field39994 = "\u0000\r\n\u0085\u2028\u2029";
   private static final String field39995 = " \u0000\r\n\u0085\u2028\u2029";
   private static final String field39996 = "\t \u0000\r\n\u0085\u2028\u2029";
   private static final String field39997 = "\u0000 \t";
   private static final String field39998 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%";
   public static final Class8852 field39999 = new Class8852("\n\u0085\u2028\u2029");
   public static final Class8852 field40000 = new Class8852("\r\n\u0085\u2028\u2029");
   public static final Class8852 field40001 = new Class8852("\u0000\r\n\u0085\u2028\u2029");
   public static final Class8852 field40002 = new Class8852(" \u0000\r\n\u0085\u2028\u2029");
   public static final Class8852 field40003 = new Class8852("\t \u0000\r\n\u0085\u2028\u2029");
   public static final Class8852 field40004 = new Class8852("\u0000 \t");
   public static final Class8852 field40005 = new Class8852("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
   public static final Class8852 field40006 = new Class8852("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
   private String field40007;
   public boolean[] field40008 = new boolean[128];
   public boolean field40009 = false;

   private Class8852(String var1) {
      Arrays.fill(this.field40008, false);
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1.length(); var5++) {
         int var6 = var1.codePointAt(var5);
         if (var6 >= 128) {
            var4.appendCodePoint(var6);
         } else {
            this.field40008[var6] = true;
         }
      }

      if (var4.length() > 0) {
         this.field40009 = true;
         this.field40007 = var4.toString();
      }
   }

   public boolean method32204(int var1) {
      return var1 >= 128 ? this.field40009 && this.field40007.indexOf(var1, 0) != -1 : this.field40008[var1];
   }

   public boolean method32205(int var1) {
      return !this.method32204(var1);
   }

   public boolean method32206(int var1, String var2) {
      return this.method32204(var1) || var2.indexOf(var1, 0) != -1;
   }

   public boolean method32207(int var1, String var2) {
      return !this.method32206(var1, var2);
   }
}
