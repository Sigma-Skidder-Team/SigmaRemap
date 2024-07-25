package remapped;

import java.awt.Font;
import java.io.InputStream;

public class class_5320 {
   private static final String field_27137 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf";
   private static final String field_27136 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf";
   private static final String field_27142 = "com/mentalfrostbyte/gui/resources/font/regular.ttf";
   public static final class_3384 field_27145 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0F);
   public static final class_3384 field_27138 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
   public static final class_3384 field_27139 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
   public static final class_3384 field_27152 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0F);
   public static final class_3384 field_27141 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0F);
   public static final class_3384 field_27153 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0F);
   public static final class_3384 field_27151 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0F);
   public static final class_3384 field_27157 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0F);
   public static final class_3384 field_27150 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0F);
   public static final class_3384 field_27140 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0F);
   public static final class_3384 field_27154 = method_24270("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0F);
   public static final class_3384 field_27160 = method_24270("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0F);
   public static final class_3384 field_27148 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 14.0F);
   public static final class_3384 field_27161 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
   public static final class_3384 field_27155 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
   public static final class_3384 field_27147 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0F);
   public static final class_3384 field_27144 = method_24270("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0F);
   public static final class_8624 field_27156 = new class_8624(2);
   public static final class_3384 field_27146 = method_24271("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
   public static final class_3384 field_27143 = method_24271("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
   public static final class_3384 field_27149 = method_24271("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
   public static final class_3384 field_27159 = method_24271("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);

   public static class_3384 method_24271(String var0, int var1, float var2) {
      try {
         InputStream var5 = NotificationIcons.processBitmap(var0);
         Font var6 = Font.createFont(0, var5);
         var6 = var6.deriveFont(var1, var2);
         return new class_3384(var6, (int)var2);
      } catch (Exception var7) {
         var7.printStackTrace();
         return new class_3384(new Font("Arial", 0, (int)var2), true);
      }
   }

   public static class_3384 method_24270(String var0, int var1, float var2) {
      try {
         InputStream var5 = NotificationIcons.processBitmap(var0);
         Font var6 = Font.createFont(0, var5);
         var6 = var6.deriveFont(var1, var2);
         return new class_3384(var6, true);
      } catch (Exception var7) {
         var7.printStackTrace();
         return new class_3384(new Font("Arial", 0, (int)var2), SigmaMainClass.getInstance().method_3312() != class_6015.field_30644);
      }
   }
}
