package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;

import java.util.List;

public class Class4491 extends Class4457 {
   private final Class8840 field21693;
   private final Class8840 field21694;
   private final Class8840 field21695;
   private final Class8634[] field21696;

   public Class4491(Class9587 var1, Class8840 var2, Class8840 var3, Class8840 var4, Class8634[] var5) {
      super(Class4883.method15089(), var1);
      this.field21693 = var2;
      this.field21694 = var3;
      this.field21695 = var4;
      this.field21696 = var5;
   }

   public static Class4491 method14163(Class8634... var0) {
      return new Class4491(Class9587.field44822, Class8840.field39936, Class8840.field39936, Class8840.field39936, var0);
   }

   public static Class4491 method14164(IItemProvider... var0) {
      Class8634[] var3 = new Class8634[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         var3[var4] = new Class8634(
            (ITag<Item>)null,
            var0[var4].asItem(),
            Class8840.field39936,
            Class8840.field39936,
            Class8605.field38716,
            Class8605.field38716,
            (Class8812)null,
            Class8811.field39645
         );
      }

      return method14163(var3);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (!this.field21693.method32004() || !this.field21694.method32004() || !this.field21695.method32004()) {
         JsonObject var5 = new JsonObject();
         var5.add("occupied", this.field21693.method32005());
         var5.add("full", this.field21694.method32005());
         var5.add("empty", this.field21695.method32005());
         var4.add("slots", var5);
      }

      if (this.field21696.length > 0) {
         JsonArray var10 = new JsonArray();

         for (Class8634 var9 : this.field21696) {
            var10.add(var9.method31018());
         }

         var4.add("items", var10);
      }

      return var4;
   }

   public boolean method14165(PlayerInventory var1, ItemStack var2, int var3, int var4, int var5) {
      if (!this.field21694.method32015(var3)) {
         return false;
      } else if (!this.field21695.method32015(var4)) {
         return false;
      } else if (!this.field21693.method32015(var5)) {
         return false;
      } else {
         int var8 = this.field21696.length;
         if (var8 == 0) {
            return true;
         } else if (var8 == 1) {
            return !var2.isEmpty() && this.field21696[0].method31016(var2);
         } else {
            List<Class8634> var9 = new ObjectArrayList<>(this.field21696);
            int var10 = var1.getSizeInventory();

            for (int var11 = 0; var11 < var10; var11++) {
               if (var9.isEmpty()) {
                  return true;
               }

               ItemStack var12 = var1.getStackInSlot(var11);
               if (!var12.isEmpty()) {
                  var9.removeIf(var1x -> var1x.method31016(var12));
               }
            }

            return var9.isEmpty();
         }
      }
   }
}
