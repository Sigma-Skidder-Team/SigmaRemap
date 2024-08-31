package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.impl.render.jello.NameTags;
import net.minecraft.client.util.Util;
import net.minecraft.resources.ResourcePackInfo;

import java.util.Optional;
import java.util.stream.Collectors;

public class Class7070 {
   private static String[] field30447;
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
      boolean var3 = this.field30454 != null && this.field30454.field39976 > 0;
      boolean var4 = this.field30453 != null && this.field30453.field39976 > 0;
      boolean var5 = this.method21986() != null
         && this.method21986().equals(this.field30455.getItem())
         && this.field30455 != null
         && this.field30455.field39976 < 64;
      if (this.field30450 < this.field30449 && var4 && var5 && this.field30452 > 0) {
         this.field30450 = this.field30450 + Client.getInstance().method19939().method31327();
      }

      if (this.field30452 > 0) {
         this.field30452--;
      }

      if (this.field30452 == 0) {
         if (var3 && var4) {
            this.field30454.field39976--;
            this.field30452 = this.field30451;
         } else {
            this.field30450 = 0.0F;
         }
      }

      if (this.field30450 >= this.field30449 && this.field30449 != 0.0F) {
         if (var4) {
            this.field30453.field39976--;
         }

         this.field30450 = 0.0F;
         if (this.field30455 != null) {
            ItemStack var6 = this.method21985();
            this.field30455.field39976 = this.field30455.field39976 + var6.field39976;
         }
      }

      if (this.field30453 != null && this.field30453.field39976 == 0) {
         this.field30453 = null;
      }
   }

   public ItemStack method21985() {
      if (this.field30453 == null) {
         return null;
      } else {
         if (!NameTags.method16937()
            .<Class920, Class4849>method1030(Class7207.field30936, new Class927(new ItemStack(Items.field37236)), NameTags.method16936().world)
            .isPresent()) {
            SimpleReloadableResourceManager var3 = new SimpleReloadableResourceManager(ResourcePackType.field12611);

            for (IResourcePack var6 : NameTags.method16938().resourcePackRepository.getEnabledPacks().stream().<IResourcePack>map(ResourcePackInfo::method7950).collect(Collectors.toList())) {
               var3.method588(var6);
            }

            Class7120 var9 = new Class7120(this);
            NameTags.method16937().method777(var9, var3, EmptyProfiler.INSTANCE, EmptyProfiler.INSTANCE, Util.getServerExecutor(), NameTags.method16939());
         }

         Optional var7 = NameTags.method16937()
            .<Class920, Class4849>method1030(Class7207.field30936, new Class927(this.field30453), NameTags.method16940().world);
         if (var7.isPresent()) {
            ItemStack var8 = ((Class4849)var7.get()).getRecipeOutput();
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
      if (this.field30455 != null && this.field30455.getItem() instanceof Class3280) {
         this.field30455 = null;
      }

      if (this.field30453 != null && this.field30453.getItem() instanceof Class3280) {
         this.field30453 = null;
      }

      if (this.field30454 != null && this.field30454.getItem() instanceof Class3280) {
         this.field30454 = null;
      }

      if (this.field30455 == null) {
         if (this.field30453 != null) {
            ItemStack var3 = this.method21985();
            if (var3 != null) {
               var3.field39976 = 0;
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
