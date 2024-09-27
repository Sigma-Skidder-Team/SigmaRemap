package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.server.SPlaceGhostRecipePacket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.List;

public class Class1260<C extends IInventory> implements Class1253<Integer> {
   public static final Logger field6658 = LogManager.getLogger();
   public final Class6207 field6659 = new Class6207();
   public PlayerInventory field6660;
   public Class5828<C> field6661;

   public Class1260(Class5828<C> var1) {
      this.field6661 = var1;
   }

   public void method5868(ServerPlayerEntity var1, IRecipe<C> var2, boolean var3) {
      if (var2 != null && var1.method2810().method21360(var2)) {
         this.field6660 = var1.inventory;
         if (this.method5874() || var1.isCreative()) {
            this.field6659.method19128();
            var1.inventory.method4061(this.field6659);
            this.field6661.method18220(this.field6659);
            if (!this.field6659.method19123(var2, (IntList)null)) {
               this.method5869();
               var1.field4855.sendPacket(new SPlaceGhostRecipePacket(var1.openContainer.windowId, var2));
            } else {
               this.method5871(var2, var3);
            }

            var1.inventory.markDirty();
         }
      }
   }

   public void method5869() {
      for (int var3 = 0; var3 < this.field6661.method18224() * this.field6661.method18225() + 1; var3++) {
         if (var3 != this.field6661.method18223() || !(this.field6661 instanceof Class5829) && !(this.field6661 instanceof PlayerContainer)) {
            this.method5870(var3);
         }
      }

      this.field6661.method18221();
   }

   public void method5870(int var1) {
      ItemStack var4 = this.field6661.getSlot(var1).getStack();
      if (!var4.isEmpty()) {
         for (; var4.getCount() > 0; this.field6661.getSlot(var1).decrStackSize(1)) {
            int var5 = this.field6660.method4043(var4);
            if (var5 == -1) {
               var5 = this.field6660.method4032();
            }

            ItemStack var6 = var4.copy();
            var6.setCount(1);
            if (!this.field6660.method4046(var5, var6)) {
               field6658.error("Can't find any space for item in the inventory");
            }
         }
      }
   }

   public void method5871(IRecipe<C> var1, boolean var2) {
      boolean var5 = this.field6661.method18222(var1);
      int var6 = this.field6659.method19125(var1, (IntList)null);
      if (var5) {
         for (int var7 = 0; var7 < this.field6661.method18225() * this.field6661.method18224() + 1; var7++) {
            if (var7 != this.field6661.method18223()) {
               ItemStack var8 = this.field6661.getSlot(var7).getStack();
               if (!var8.isEmpty() && Math.min(var6, var8.getMaxStackSize()) < var8.getCount() + 1) {
                  return;
               }
            }
         }
      }

      int var13 = this.method5872(var2, var6, var5);
      IntArrayList var14 = new IntArrayList();
      if (this.field6659.method19124(var1, var14, var13)) {
         int var9 = var13;
         IntListIterator var10 = var14.iterator();

         while (var10.hasNext()) {
            int var11 = (Integer)var10.next();
            int var12 = Class6207.method19127(var11).getMaxStackSize();
            if (var12 < var9) {
               var9 = var12;
            }
         }

         if (this.field6659.method19124(var1, var14, var9)) {
            this.method5869();
            this.method5832(this.field6661.method18224(), this.field6661.method18225(), this.field6661.method18223(), var1, var14.iterator(), var9);
         }
      }
   }

   @Override
   public void method5830(Iterator<Integer> var1, int var2, int var3, int var4, int var5) {
      Slot var8 = this.field6661.getSlot(var2);
      ItemStack var9 = Class6207.method19127((Integer)var1.next());
      if (!var9.isEmpty()) {
         for (int var10 = 0; var10 < var3; var10++) {
            this.method5873(var8, var9);
         }
      }
   }

   public int method5872(boolean var1, int var2, boolean var3) {
      int var6 = 1;
      if (!var1) {
         if (var3) {
            var6 = 64;

            for (int var7 = 0; var7 < this.field6661.method18224() * this.field6661.method18225() + 1; var7++) {
               if (var7 != this.field6661.method18223()) {
                  ItemStack var8 = this.field6661.getSlot(var7).getStack();
                  if (!var8.isEmpty() && var6 > var8.getCount()) {
                     var6 = var8.getCount();
                  }
               }
            }

            if (var6 < 64) {
               var6++;
            }
         }
      } else {
         var6 = var2;
      }

      return var6;
   }

   public void method5873(Slot var1, ItemStack var2) {
      int var5 = this.field6660.method4037(var2);
      if (var5 != -1) {
         ItemStack var6 = this.field6660.getStackInSlot(var5).copy();
         if (!var6.isEmpty()) {
            if (var6.getCount() <= 1) {
               this.field6660.removeStackFromSlot(var5);
            } else {
               this.field6660.decrStackSize(var5, 1);
            }

            var6.setCount(1);
            if (!var1.getStack().isEmpty()) {
               var1.getStack().grow(1);
            } else {
               var1.putStack(var6);
            }
         }
      }
   }

   private boolean method5874() {
      List<ItemStack> var3 = Lists.newArrayList();
      int var4 = this.method5875();

      for (int var5 = 0; var5 < this.field6661.method18224() * this.field6661.method18225() + 1; var5++) {
         if (var5 != this.field6661.method18223()) {
            ItemStack var6 = this.field6661.getSlot(var5).getStack().copy();
            if (!var6.isEmpty()) {
               int var7 = this.field6660.method4043(var6);
               if (var7 == -1 && var3.size() <= var4) {
                  for (ItemStack var9 : var3) {
                     if (var9.method32132(var6) && var9.getCount() != var9.getMaxStackSize() && var9.getCount() + var6.getCount() <= var9.getMaxStackSize()) {
                        var9.grow(var6.getCount());
                        var6.setCount(0);
                        break;
                     }
                  }

                  if (!var6.isEmpty()) {
                     if (var3.size() >= var4) {
                        return false;
                     }

                     var3.add(var6);
                  }
               } else if (var7 == -1) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private int method5875() {
      int var3 = 0;

      for (ItemStack var5 : this.field6660.field5439) {
         if (var5.isEmpty()) {
            var3++;
         }
      }

      return var3;
   }
}
