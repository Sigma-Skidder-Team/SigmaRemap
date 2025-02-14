package mapped;

public final class Class9232 {
   private static String[] field42490;
   public static final char field42491 = '{';
   public static final char field42492 = '}';
   public static final char field42493 = ':';
   public static final char field42494 = '[';
   public static final char field42495 = ']';
   public static final char field42496 = ';';
   public static final char field42497 = ',';
   public static final char field42498 = '\'';
   public static final char field42499 = '"';
   public static final char field42500 = '\\';
   public static final char field42501 = 'B';
   public static final char field42502 = 'S';
   public static final char field42503 = 'I';
   public static final char field42504 = 'L';
   public static final char field42505 = 'F';
   public static final char field42506 = 'D';
   public static final char field42507 = '\u0000';

   private Class9232() {
   }

   public static boolean method34724(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z' || var0 >= '0' && var0 <= '9' || var0 == '-' || var0 == '_' || var0 == '.' || var0 == '+';
   }

   public static boolean method34725(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 == '+' || var0 == '-' || var0 == 'e' || var0 == 'E' || var0 == '.';
   }
}
