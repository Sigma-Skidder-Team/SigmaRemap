package remapped;

import java.awt.Font;
import java.io.InputStream;

public class class_5320 {
   private static final String helveticaNeueLight = "com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf";
   private static final String helveticaNeueMedium = "com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf";
   private static final String regularFont = "com/mentalfrostbyte/gui/resources/font/regular.ttf";
   public static final FontRenderer field_27145 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0F);
   public static final FontRenderer field_27138 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
   public static final FontRenderer field_27139 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
   public static final FontRenderer field_27152 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0F);
   public static final FontRenderer field_27141 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0F);
   public static final FontRenderer field_27153 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0F);
   public static final FontRenderer field_27151 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0F);
   public static final FontRenderer field_27157 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0F);
   public static final FontRenderer field_27150 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0F);
   public static final FontRenderer field_27140 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0F);
   public static final FontRenderer field_27154 = method_24270("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0F);
   public static final FontRenderer field_27160 = method_24270("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0F);
   public static final FontRenderer field_27148 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 14.0F);
   public static final FontRenderer field_27161 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
   public static final FontRenderer field_27155 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
   public static final FontRenderer field_27147 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0F);
   public static final FontRenderer field_27144 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0F);
   public static final class_8624 field_27156 = new class_8624(2);
   public static final FontRenderer field_27146 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
   public static final FontRenderer field_27143 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
   public static final FontRenderer field_27149 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
   public static final FontRenderer field_27159 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);

   public static FontRenderer getFont(String var0, int var1, float var2) {
      try {
         InputStream var5 = NotificationIcons.processBitmap(var0);
         Font newFont = Font.createFont(0, var5);
         newFont = newFont.deriveFont(var1, var2);
         return new FontRenderer(newFont, (int)var2);
      } catch (Exception var7) {
         var7.printStackTrace();
         return new FontRenderer(new Font("Arial", 0, (int)var2), true);
      }
   }

   public static FontRenderer method_24270(String var0, int var1, float var2) {
      try {
         InputStream processBitmapInput = NotificationIcons.processBitmap(var0);
         Font newFont = Font.createFont(0, processBitmapInput);
         newFont = newFont.deriveFont(var1, var2);
         return new FontRenderer(newFont, true);
      } catch (Exception var7) {
         var7.printStackTrace();
         return new FontRenderer(new Font("Arial", 0, (int)var2), SigmaMainClass.getInstance().method_3312() != class_6015.field_30644);
      }
   }
}
