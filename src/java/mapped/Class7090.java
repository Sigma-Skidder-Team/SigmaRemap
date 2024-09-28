package mapped;

import net.minecraft.state.properties.RailShape;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class7090 {
   private static String[] field30513;
   public static final int[] field30514;
   public static final int[] field30515;
   public static final int[] field30516 = new int[Mirror.values().length];

   static {
      try {
         field30516[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var17) {
      }

      try {
         field30516[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var16) {
      }

      field30515 = new int[Rotation.values().length];

      try {
         field30515[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var15) {
      }

      try {
         field30515[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var14) {
      }

      try {
         field30515[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var13) {
      }

      field30514 = new int[RailShape.values().length];

      try {
         field30514[RailShape.field249.ordinal()] = 1;
      } catch (NoSuchFieldError var12) {
      }

      try {
         field30514[RailShape.field250.ordinal()] = 2;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field30514[RailShape.field251.ordinal()] = 3;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field30514[RailShape.field252.ordinal()] = 4;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field30514[RailShape.field253.ordinal()] = 5;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field30514[RailShape.field254.ordinal()] = 6;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field30514[RailShape.field255.ordinal()] = 7;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field30514[RailShape.field256.ordinal()] = 8;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field30514[RailShape.field247.ordinal()] = 9;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field30514[RailShape.field248.ordinal()] = 10;
      } catch (NoSuchFieldError var3) {
      }
   }
}
