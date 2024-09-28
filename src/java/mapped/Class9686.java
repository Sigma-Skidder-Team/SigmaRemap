package mapped;

import net.minecraft.state.properties.StructureMode;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9686 {
   private static String[] field45293;
   public static final int[] field45294;
   public static final int[] field45295;
   public static final int[] field45296 = new int[StructureMode.values().length];

   static {
      try {
         field45296[StructureMode.field318.ordinal()] = 1;
      } catch (NoSuchFieldError var13) {
      }

      try {
         field45296[StructureMode.field319.ordinal()] = 2;
      } catch (NoSuchFieldError var12) {
      }

      try {
         field45296[StructureMode.field320.ordinal()] = 3;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field45296[StructureMode.field321.ordinal()] = 4;
      } catch (NoSuchFieldError var10) {
      }

      field45295 = new int[Rotation.values().length];

      try {
         field45295[Rotation.field185.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field45295[Rotation.field187.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field45295[Rotation.field188.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field45295[Rotation.field186.ordinal()] = 4;
      } catch (NoSuchFieldError var6) {
      }

      field45294 = new int[Mirror.values().length];

      try {
         field45294[Mirror.field13614.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45294[Mirror.field13615.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45294[Mirror.field13616.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
