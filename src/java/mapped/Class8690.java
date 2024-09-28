package mapped;

import net.minecraft.state.properties.RailShape;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class8690 {
   private static String[] field39229;
   public static final int[] field39230;
   public static final int[] field39231;
   public static final int[] field39232 = new int[Mirror.values().length];

   static {
      try {
         field39232[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var17) {
      }

      try {
         field39232[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var16) {
      }

      field39231 = new int[Rotation.values().length];

      try {
         field39231[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var15) {
      }

      try {
         field39231[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var14) {
      }

      try {
         field39231[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var13) {
      }

      field39230 = new int[RailShape.values().length];

      try {
         field39230[RailShape.field247.ordinal()] = 1;
      } catch (NoSuchFieldError var12) {
      }

      try {
         field39230[RailShape.field248.ordinal()] = 2;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field39230[RailShape.field249.ordinal()] = 3;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field39230[RailShape.field250.ordinal()] = 4;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field39230[RailShape.field251.ordinal()] = 5;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field39230[RailShape.field252.ordinal()] = 6;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field39230[RailShape.field253.ordinal()] = 7;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field39230[RailShape.field254.ordinal()] = 8;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39230[RailShape.field255.ordinal()] = 9;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39230[RailShape.field256.ordinal()] = 10;
      } catch (NoSuchFieldError var3) {
      }
   }
}
