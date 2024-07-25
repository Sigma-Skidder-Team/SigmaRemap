package remapped;

public final class class_7580 {
   private static String[] field_38610;
   public static final char field_38625 = '{';
   public static final char field_38621 = '}';
   public static final char field_38612 = ':';
   public static final char field_38618 = '[';
   public static final char field_38624 = ']';
   public static final char field_38626 = ';';
   public static final char field_38623 = ',';
   public static final char field_38616 = '\'';
   public static final char field_38609 = '"';
   public static final char field_38611 = '\\';
   public static final char field_38614 = 'B';
   public static final char field_38619 = 'S';
   public static final char field_38622 = 'I';
   public static final char field_38620 = 'L';
   public static final char field_38615 = 'F';
   public static final char field_38613 = 'D';
   public static final char field_38617 = '\u0000';

   private class_7580() {
   }

   public static boolean method_34445(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z' || var0 >= '0' && var0 <= '9' || var0 == '-' || var0 == '_' || var0 == '.' || var0 == '+';
   }

   public static boolean method_34446(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 == '+' || var0 == '-' || var0 == 'e' || var0 == 'E' || var0 == '.';
   }
}
