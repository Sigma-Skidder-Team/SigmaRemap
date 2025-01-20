package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.*;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.potion.EffectInstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class InvManagerUtils {
    private static final Minecraft mc = Minecraft.getInstance();

   public static boolean method25819(int var0) {
      ItemStack var3 = mc.player.container.getSlot(var0).getStack();
      return var3 == null || var3.getItem() instanceof Class3280;
   }

   public static int findItemSlot(Item var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = mc.player.container.getSlot(var5).getStack();
         if (!method25819(var5) && var6.getItem() == var0) {
            int var7 = var6.count;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25823(Item... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = mc.player.container.getSlot(var5).getStack();
         if (!method25819(var5)) {
            for (Item var10 : var0) {
               if (var6.getItem() == var10) {
                  int var11 = var6.count;
                  if (var11 > var3) {
                     var4 = var5;
                     var3 = var11;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static void click(int slotId, int mouseButton, boolean type) {
      mc.playerController
         .windowClick(mc.player.container.windowId, slotId, mouseButton, !type ? ClickType.THROW : ClickType.QUICK_MOVE, mc.player);
   }

   public static boolean isHead(ArmorItem armorPiece) {
      return armorPiece.getType() == EquipmentSlotType.HEAD;
   }

   public static boolean isChestplate(ArmorItem armorPiece) {
      return armorPiece.getType() == EquipmentSlotType.CHEST;
   }

   public static boolean isLeggings(ArmorItem armorPiece) {
      return armorPiece.getType() == EquipmentSlotType.LEGS;
   }

   public static boolean isBoots(ArmorItem armorPiece) {
      return armorPiece.getType() == EquipmentSlotType.FEET;
   }

   public static int findBestToolFromHotbarSlotForBlock(BlockState state) {
      int slot = -1;
      float dmg = 1.0F;

      for (int hotbarSlot = 44; hotbarSlot >= 9; hotbarSlot--) {
         ItemStack item = mc.player.container.getSlot(hotbarSlot).getStack();
         if (item != null) {
            float damage;
            if (state == null) {
               if (!(item.getItem() instanceof SwordItem)) {
                  continue;
               }

               damage = ((SwordItem)item.getItem()).getAttackDamage();
            } else {
               damage = item.method32109(state);
            }

            if (damage > dmg) {
               slot = hotbarSlot;
               dmg = damage;
            }
         }
      }

      return slot;
   }

   public static int method25843(Item... items) {
      int size = 0;
      int slot = -1;

      for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++) {
         ItemStack itemStack = mc.player.inventory.getStackInSlot(hotbarSlot);
         if (itemStack != null) {
            for (Item item : items) {
               if (itemStack.getItem() == item) {
                  int amount = itemStack.count;
                  if (amount > size) {
                     slot = hotbarSlot;
                     size = amount;
                  }
               }
            }
         }
      }

      return slot;
   }

   public static int isHotbarEmpty() {
      for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++) {
         ItemStack itemStack = mc.player.inventory.getStackInSlot(hotbarSlot);
         if (itemStack == null) {
            return hotbarSlot;
         }
      }

      return 0;
   }

   public static boolean isArmor(int slot) {
      return method25848(mc.player.container.getSlot(slot).getStack());
   }

   public static boolean method25848(ItemStack itemStack) {
      if (itemStack.getItem() instanceof ArmorItem) {
         ArmorItem armorItem = (ArmorItem)itemStack.getItem();
         int var4 = getArmorProtectionValue(itemStack);
         if (!isHead(armorItem)) {
            if (!isChestplate(armorItem)) {
               if (!isLeggings(armorItem)) {
                  return !isBoots(armorItem) ? false : var4 > getDamageReduceFromSlot(8);
               } else {
                  return var4 > getDamageReduceFromSlot(7);
               }
            } else {
               return var4 > getDamageReduceFromSlot(6);
            }
         } else {
            return var4 > getDamageReduceFromSlot(5);
         }
      } else {
         return false;
      }
   }

   public static int getDamageReduceFromSlot(int slot) {
      if (mc.player.container.getSlot(slot).getStack() != null) {
         if (mc.player.container.getSlot(slot).getStack().getItem() instanceof ArmorItem) {
            ArmorItem armorPiece = (ArmorItem) mc.player.container.getSlot(slot).getStack().getItem();
            return armorPiece.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(0), mc.player.container.getSlot(slot).getStack());
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static int getArmorProtectionValue(ItemStack itemStack) {
      if (itemStack != null) {
         return itemStack.getItem() instanceof ArmorItem ? ((ArmorItem)itemStack.getItem()).damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantments.PROTECTION, itemStack) : 0;
      } else {
         return 0;
      }
   }

   public static int getTotalArmorProtection(PlayerEntity player) {
      int totalProtection = 0;

      for (int slot = 5; slot <= 8; slot++) {
         totalProtection += getArmorProtectionValue(player.inventory.getStackInSlot(slot));
      }

      return totalProtection;
   }

   public static float method25854(ItemStack var0) {
      if (var0 != null) {
         Item var3 = var0.getItem();
         if (!(var3 instanceof SwordItem)) {
            if (!(var3 instanceof Class3287)) {
               if (!(var3 instanceof Class3271)) {
                  if (!(var3 instanceof ToolItem)) {
                     if (!(var3 instanceof BowItem)) {
                        if (!(var3 instanceof Class3323)) {
                           if (!(var3 instanceof BlockItem)) {
                              if (var0.method32184() && var0.getItem().method11745() == Class8672.field39078) {
                                 return 1.0F;
                              } else if (!(var3 instanceof Class3335)) {
                                 if (!var0.method32184()) {
                                    if (!(var3 instanceof Class3319)) {
                                       return !(var3 instanceof Class3333) ? 0.0F : 0.25F;
                                    } else {
                                       return 0.25F;
                                    }
                                 } else {
                                    return 0.5F;
                                 }
                              } else {
                                 return 1.0F;
                              }
                           } else {
                              return 1.0F;
                           }
                        } else {
                           return 1.25F;
                        }
                     } else {
                        return 1.5F;
                     }
                  } else {
                     return 1.5F;
                  }
               } else {
                  return 1.5F;
               }
            } else {
               return 1.5F;
            }
         } else {
            return 2.0F;
         }
      } else {
         return -1.0F;
      }
   }

   public static HashMap<Integer, Float> method25855() {
      HashMap var2 = new HashMap();

      for (int var3 = 0; var3 < 9; var3++) {
         ItemStack var4 = mc.player.inventory.getStackInSlot(var3);
         var2.put(var3, method25854(var4) * (float)(mc.player.inventory.currentItem != var3 ? 1 : 2));
      }

      return var2;
   }

   public static int method25856() {
      HashMap<Integer, Float> var2 = method25855();
      TreeMap<Integer, Float> var3 = new TreeMap(Collections.reverseOrder());
      var3.putAll(var2);
      Entry<Integer, Float> var4 = null;

      for (Entry<Integer, Float> var6 : var3.entrySet()) {
         if (var4 == null || var4.getValue() > var6.getValue()) {
            var4 = var6;
         }
      }

      return var4.getKey();
   }

   public static int swapToolToHotbar(int var0) {
      int var3 = method25856();
      method25869(mc.player.container.windowId, var0, var3, ClickType.SWAP, mc.player);
      return var3;
   }

   public static List<EffectInstance> getPotionEffects(ItemStack var0) {
      if (var0 != null) {
         return var0.getItem() instanceof Class3323 ? PotionUtils.method38176(var0) : null;
      } else {
         return null;
      }
   }

   public static boolean method25859(ItemStack var0) {
      return var0 != null ? var0.getItem() instanceof Class3326 : false;
   }

   public static ItemStack method25866(int var0) {
      return mc.player.container.getSlot(var0).getStack();
   }


   public static ItemStack method25869(int var0, int var1, int var2, ClickType var3, PlayerEntity var4) {
      return fixedClick(var0, var1, var2, var3, var4, false);
   }

   public static ItemStack fixedClick(int var0, int var1, int var2, ClickType var3, PlayerEntity var4, boolean var5) {
      ItemStack var8 = null;
      if (var1 >= 0) {
         var8 = var4.openContainer.getSlot(var1).getStack().copy();
      }

      short var9 = var4.openContainer.getNextTransactionID(mc.player.inventory);
      ItemStack var10 = var4.openContainer.slotClick(var1, var2, var3, var4);
      if (var3 == null) {
         return var10;
      }
      if (var8 == null || /*JelloPortal.getCurrentVersion().getVersionNumber() > ViaVerList._1_12.getVersionNumber() && */!var5 || var3 == ClickType.SWAP) {
         var8 = var10;
      }

      mc.getConnection().sendPacket(new CClickWindowPacket(var0, var1, var2, var3, var8, var9));
      return var10;
   }

   public static void method25871(int var0) {
      mc.playerController.windowClick(mc.player.container.windowId, var0, 1, ClickType.THROW, mc.player);
   }

   public static boolean isBestArmorPiece(ItemStack var0) {
      if (var0 != null && var0.getItem() instanceof ArmorItem) {
         float var3 = (float) getArmorProtectionValue(var0);

         for (int var4 = 5; var4 < 45; var4++) {
            if (mc.player.container.getSlot(var4).getHasStack()) {
               ItemStack var5 = mc.player.container.getSlot(var4).getStack();
               Item var6 = var5.getItem();
               if (var6 instanceof ArmorItem) {
                  ArmorItem var7 = (ArmorItem)var6;
                  if ((float) getArmorProtectionValue(var5) > var3 && var7.getType() == ((ArmorItem)var0.getItem()).getType()) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void moveItemToHotbar(int var0, int var1) {
      mc.playerController.windowClick(mc.player.container.windowId, var0, var1, ClickType.SWAP, mc.player);
   }

   public static boolean method25874(ItemStack var0) {
      if (var0 != null && var0.getItem() instanceof Class3323) {
         for (EffectInstance var4 : getPotionEffects(var0)) {
            if (var4.getPotion() == Effects.POISON
               || var4.getPotion() == Effects.INSTANT_DAMAGE
               || var4.getPotion() == Effects.SLOWNESS
               || var4.getPotion() == Effects.WEAKNESS) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean method25875() {
      for (Slot var3 : mc.player.container.inventorySlots) {
         if (!var3.getHasStack() && var3.slotNumber > 8 && var3.slotNumber < 45) {
            return false;
         }
      }

      return true;
   }

   public static boolean isItemStackValid(ItemStack var0) {
      return var0 != null && !var0.getItem().equals(Items.AIR);
   }

   public static List<ItemStack> getValidStacks(PlayerEntity player) {
      ArrayList<ItemStack> stacks = new ArrayList<>();

      for (Slot slot : player.container.inventorySlots) {
         if (isItemStackValid(slot.getStack())) {
            stacks.add(slot.getStack());
         }
      }

      return stacks;
   }

   public static int method25878(Item var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = mc.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var5.getItem() == var0) {
            var3 += var5.count;
         }
      }

      return var3;
   }
}
