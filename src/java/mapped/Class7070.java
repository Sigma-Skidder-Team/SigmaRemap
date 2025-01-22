package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.Util;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.resources.ResourcePackInfo;

import java.util.Optional;
import java.util.stream.Collectors;

public class Class7070 {
   public int field30448;
   public float field30449;
   public float field30450;
   public int field30451;
   public int field30452;
   public ItemStack field30453;
   public ItemStack field30454;
   public ItemStack field30455;

   public Class7070(int var1) {
      this.field30448 = var1;
   }

   public void method21984() {
      this.method21987();
      boolean var3 = this.field30454 != null && this.field30454.count > 0;
      boolean var4 = this.field30453 != null && this.field30453.count > 0;
      boolean var5 = this.method21986() != null
         && this.method21986().equals(this.field30455.getItem())
         && this.field30455 != null
         && this.field30455.count < 64;
      if (this.field30450 < this.field30449 && var4 && var5 && this.field30452 > 0) {
         this.field30450 = this.field30450 + Client.getInstance().getPlayerTracker().getPing();
      }

      if (this.field30452 > 0) {
         this.field30452--;
      }

      if (this.field30452 == 0) {
         if (var3 && var4) {
            this.field30454.count--;
            this.field30452 = this.field30451;
         } else {
            this.field30450 = 0.0F;
         }
      }

      if (this.field30450 >= this.field30449 && this.field30449 != 0.0F) {
         if (var4) {
            this.field30453.count--;
         }

         this.field30450 = 0.0F;
         if (this.field30455 != null) {
            ItemStack var6 = this.method21985();
            this.field30455.count = this.field30455.count + var6.count;
         }
      }

      if (this.field30453 != null && this.field30453.count == 0) {
         this.field30453 = null;
      }
   }

   public ItemStack method21985() {
      if (this.field30453 == null) {
         return null;
      } else {
         if (!Minecraft.getInstance().getConnection().getRecipeManager()
            .method1030(IRecipeType.SMELTING, new Class927(new ItemStack(Items.field37236)), Minecraft.getInstance().world)
            .isPresent()) {
            SimpleReloadableResourceManager var3 = new SimpleReloadableResourceManager(ResourcePackType.SERVER_DATA);

            for (IResourcePack var6 : Minecraft.getInstance().resourcePackRepository.getEnabledPacks().stream().<IResourcePack>map(ResourcePackInfo::getResourcePack).collect(Collectors.toList())) {
               var3.method588(var6);
            }

            Class7120 var9 = new Class7120(this);
            Minecraft.getInstance().getConnection().getRecipeManager().method777(var9, var3, EmptyProfiler.INSTANCE, EmptyProfiler.INSTANCE, Util.getServerExecutor(), Minecraft.getInstance());
         }

         Optional<FurnaceRecipe> var7 = Minecraft.getInstance().getConnection().getRecipeManager()
            .method1030(IRecipeType.SMELTING, new Class927(this.field30453), Minecraft.getInstance().world);
         if (var7.isPresent()) {
            ItemStack var8 = ((FurnaceRecipe)var7.get()).getRecipeOutput();
            if (!var8.isEmpty()) {
               return var8.copy();
            }
         }

         return null;
      }
   }

   public Item method21986() {
      ItemStack var3 = this.method21985();
      return var3 == null ? null : var3.getItem();
   }

   public ItemStack method21987() {
      if (this.field30455 != null && this.field30455.getItem() instanceof AirItem) {
         this.field30455 = null;
      }

      if (this.field30453 != null && this.field30453.getItem() instanceof AirItem) {
         this.field30453 = null;
      }

      if (this.field30454 != null && this.field30454.getItem() instanceof AirItem) {
         this.field30454 = null;
      }

      if (this.field30455 == null) {
         if (this.field30453 != null) {
            ItemStack var3 = this.method21985();
            if (var3 != null) {
               var3.count = 0;
            }

            return this.field30455 = var3;
         } else {
            return null;
         }
      } else {
         return this.field30455;
      }
   }
}
