package mapped;

import net.minecraft.scoreboard.Team;
import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8663 {
   private static String[] field39037;
   public static final int[] field39038;
   public static final int[] field39039 = new int[Team.Visible.values().length];

   static {
      try {
         field39039[Team.Visible.ALWAYS.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field39039[Team.Visible.NEVER.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field39039[Team.Visible.HIDE_FOR_OTHER_TEAMS.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field39039[Team.Visible.HIDE_FOR_OWN_TEAM.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      field39038 = new int[Direction.values().length];

      try {
         field39038[Direction.SOUTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field39038[Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39038[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39038[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
