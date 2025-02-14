package mapped;

import net.minecraft.state.properties.RedstoneSide;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class7339 {
   private static String[] field31441;
   public static final int[] field31442;
   public static final int[] field31443;
   public static final int[] field31444 = new int[Mirror.values().length];

   static {
      try {
         field31444[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field31444[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      field31443 = new int[Rotation.values().length];

      try {
         field31443[Rotation.CLOCKWISE_180.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field31443[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field31443[Rotation.CLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      field31442 = new int[RedstoneSide.values().length];

      try {
         field31442[RedstoneSide.field265.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field31442[RedstoneSide.field266.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field31442[RedstoneSide.field267.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
