package mapped;

import com.mentalfrostbyte.jello.unmapped.SettingType;

// $VF: synthetic class
public class Class9820 {
   private static String[] field45881;
   public static final int[] field45882 = new int[SettingType.values().length];

   static {
      try {
         field45882[SettingType.BOOLEAN.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field45882[SettingType.NUMBER.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field45882[SettingType.INPUT.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field45882[SettingType.MODE.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field45882[SettingType.TEXTBOX.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field45882[SettingType.SUBOPTION.ordinal()] = 6;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45882[SettingType.BOOLEAN2.ordinal()] = 7;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45882[SettingType.UNUSUED.ordinal()] = 8;
      } catch (NoSuchFieldError var3) {
      }
   }
}
