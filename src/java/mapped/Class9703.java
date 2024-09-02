package mapped;

import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;

// $VF: synthetic class
public class Class9703 {
   private static String[] field45355;
   public static final int[] field45356;
   public static final int[] field45357;
   public static final int[] field45358;
   public static final int[] state = new int[CClientStatusPacketState.values().length];

   static {
      try {
         state[CClientStatusPacketState.field14277.ordinal()] = 1;
      } catch (NoSuchFieldError var23) {
      }

      try {
         state[CClientStatusPacketState.field14278.ordinal()] = 2;
      } catch (NoSuchFieldError var22) {
      }

      field45358 = new int[CEntityActionPacket.Action.values().length];

      try {
         field45358[CEntityActionPacket.Action.PRESS_SHIFT_KEY.ordinal()] = 1;
      } catch (NoSuchFieldError var21) {
      }

      try {
         field45358[CEntityActionPacket.Action.RELEASE_SHIFT_KEY.ordinal()] = 2;
      } catch (NoSuchFieldError var20) {
      }

      try {
         field45358[CEntityActionPacket.Action.START_SPRINTING.ordinal()] = 3;
      } catch (NoSuchFieldError var19) {
      }

      try {
         field45358[CEntityActionPacket.Action.STOP_SPRINTING.ordinal()] = 4;
      } catch (NoSuchFieldError var18) {
      }

      try {
         field45358[CEntityActionPacket.Action.STOP_SLEEPING.ordinal()] = 5;
      } catch (NoSuchFieldError var17) {
      }

      try {
         field45358[CEntityActionPacket.Action.START_RIDING_JUMP.ordinal()] = 6;
      } catch (NoSuchFieldError var16) {
      }

      try {
         field45358[CEntityActionPacket.Action.STOP_RIDING_JUMP.ordinal()] = 7;
      } catch (NoSuchFieldError var15) {
      }

      try {
         field45358[CEntityActionPacket.Action.OPEN_INVENTORY.ordinal()] = 8;
      } catch (NoSuchFieldError var14) {
      }

      try {
         field45358[CEntityActionPacket.Action.START_FALL_FLYING.ordinal()] = 9;
      } catch (NoSuchFieldError var13) {
      }

      field45357 = new int[CPlayerDiggingPacket.Action.values().length];

      try {
         field45357[CPlayerDiggingPacket.Action.SWAP_ITEM_WITH_OFFHAND.ordinal()] = 1;
      } catch (NoSuchFieldError var12) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.DROP_ITEM.ordinal()] = 2;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.DROP_ALL_ITEMS.ordinal()] = 3;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.RELEASE_USE_ITEM.ordinal()] = 4;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.START_DESTROY_BLOCK.ordinal()] = 5;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK.ordinal()] = 6;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field45357[CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK.ordinal()] = 7;
      } catch (NoSuchFieldError var6) {
      }

      field45356 = new int[Class2037.values().length];

      try {
         field45356[Class2037.field13323.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45356[Class2037.field13324.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45356[Class2037.field13325.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
