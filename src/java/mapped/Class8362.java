package mapped;

// $VF: synthetic class
public class Class8362 {
   private static String[] field35912;
   public static final int[] field35913 = new int[TextFormatting.values().length];

   static {
      try {
         field35913[TextFormatting.BOLD.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field35913[TextFormatting.ITALIC.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field35913[TextFormatting.UNDERLINE.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field35913[TextFormatting.STRIKETHROUGH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field35913[TextFormatting.OBFUSCATED.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field35913[TextFormatting.RESET.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
