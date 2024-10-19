package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class2836 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      var1.accept(
         Class8793.field39609,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37900).method18299(5).method18296(new Class5878().method18310(Enchantments.SOUL_SPEED)))
                  .method18291(Class4695.method14724(Items.field37855).method18299(8).method18296(new Class5878().method18310(Enchantments.SOUL_SPEED)))
                  .method18291(
                     Class4695.method14724(Items.field37971)
                        .method18299(8)
                        .method18296(
                           Class136.method399(Util.<CompoundNBT>make(new CompoundNBT(), var0 -> var0.putString("Potion", "minecraft:fire_resistance")))
                        )
                  )
                  .method18291(
                     Class4695.method14724(Items.field38115)
                        .method18299(8)
                        .method18296(
                           Class136.method399(Util.<CompoundNBT>make(new CompoundNBT(), var0 -> var0.putString("Potion", "minecraft:fire_resistance")))
                        )
                  )
                  .method18291(
                     Class4695.method14724(Items.field37971)
                        .method18299(10)
                        .method18296(Class136.method399(Util.<CompoundNBT>make(new CompoundNBT(), var0 -> var0.putString("Potion", "minecraft:water"))))
                  )
                  .method18291(Class4695.method14724(Items.field38128).method18299(10).method18296(Class140.method420(Class6872.method20921(10.0F, 36.0F))))
                  .method18291(Class4695.method14724(Items.field37966).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18299(20).method18296(Class140.method420(Class6872.method20921(3.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field38072).method18299(20).method18296(Class140.method420(Class6872.method20921(5.0F, 12.0F))))
                  .method18291(Class4695.method14724(Items.field37392).method18299(40))
                  .method18291(Class4695.method14724(Items.field38184).method18299(40).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field38046).method18299(40))
                  .method18291(Class4695.method14724(Items.LEATHER).method18299(40).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37441).method18299(40).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field38071).method18299(40).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field38116).method18299(40).method18296(Class140.method420(Class6872.method20921(6.0F, 12.0F))))
                  .method18291(Class4695.method14724(Items.field37254).method18299(40).method18296(Class140.method420(Class6872.method20921(8.0F, 16.0F))))
                  .method18291(Class4695.method14724(Items.field38185).method18299(40).method18296(Class140.method420(Class6872.method20921(8.0F, 16.0F))))
            )
      );
   }
}
