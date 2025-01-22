package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class2840 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   private static String[] field17637;

   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      var1.accept(
         Class8793.field39553,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(20))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE))
                  .method18291(Class4695.method14724(Items.field38088).method18299(30))
                  .method18291(Class4695.method14724(Items.field37900).method18299(10).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37822).method18299(5))
                  .method18291(Class4694.method14723().method18299(5))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37917).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37800).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(10).method18296(Class140.method420(Class6872.method20921(3.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37960).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37959).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38112).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Blocks.RAIL).method18299(20).method18296(Class140.method420(Class6872.method20921(4.0F, 8.0F))))
                  .method18291(Class4695.method14724(Blocks.POWERED_RAIL).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.DETECTOR_RAIL).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.field36728).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.TORCH).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 16.0F))))
            )
      );
      var1.accept(
         Class8793.field39572,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Blocks.field37129).method18296(Class140.method420(Class6871.method20919(1))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 2.0F))
                  .method18291(
                     Class4695.method14724(Items.CROSSBOW)
                        .method18296(Class145.method443(Class6872.method20921(0.1F, 0.5F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Items.field38116).method18296(Class140.method420(Class6872.method20921(10.0F, 28.0F))))
                  .method18291(Class4695.method14724(Blocks.field37141).method18296(Class140.method420(Class6872.method20921(8.0F, 12.0F))))
                  .method18291(Class4695.method14724(Blocks.CRYING_OBSIDIAN).method18296(Class140.method420(Class6872.method20921(3.0F, 8.0F))))
                  .method18291(Class4695.method14724(Blocks.GOLD_BLOCK).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37802).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_SWORD).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(
                     Class4695.method14724(Items.field37861).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37860).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.GOLDEN_LEGGINGS).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37863).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37818).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37838).method18296(Class140.method420(Class6872.method20921(1.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.LEATHER).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37797).method18296(Class140.method420(Class6872.method20921(5.0F, 17.0F))))
                  .method18291(Class4695.method14724(Items.field38128).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
            )
      );
      var1.accept(
         Class8793.field39573,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37826)
                        .method18299(15)
                        .method18296(Class145.method443(Class6872.method20921(0.15F, 0.8F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37827)
                        .method18299(12)
                        .method18296(Class145.method443(Class6872.method20921(0.15F, 0.95F)))
                        .method18296(Class140.method420(Class6871.method20919(1)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Items.field37804).method18299(8).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field38182).method18299(12).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field38182).method18299(5).method18296(Class140.method420(Class6871.method20919(2))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(12).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Blocks.GOLD_BLOCK).method18299(16).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38057).method18299(10).method18296(Class140.method420(Class6872.method20921(8.0F, 17.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(10).method18296(Class140.method420(Class6871.method20919(1))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 4.0F))
                  .method18291(
                     Class4695.method14724(Items.field37818).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Blocks.CRYING_OBSIDIAN).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.GLOWSTONE).method18296(Class140.method420(Class6872.method20921(3.0F, 6.0F))))
                  .method18291(Class4695.method14724(Blocks.field37141).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.SOUL_SAND).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Blocks.CRIMSON_NYLIUM).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.LEATHER).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37797).method18296(Class140.method420(Class6872.method20921(5.0F, 17.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18296(Class140.method420(Class6872.method20921(3.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.PORKCHOP).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37870).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.CRIMSON_FUNGUS).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Blocks.CRIMSON_ROOTS).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
            )
      );
      var1.accept(
         Class8793.field39571,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37827)
                        .method18299(6)
                        .method18296(Class140.method420(Class6871.method20919(1)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Items.field37826).method18299(6).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(
                     Class4695.method14724(Items.CROSSBOW)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.1F, 0.9F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Items.field38182).method18299(12).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37804).method18299(4).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field38116).method18299(10).method18296(Class140.method420(Class6872.method20921(10.0F, 22.0F))))
                  .method18291(Class4695.method14724(Items.field38156).method18299(9).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field38143).method18299(5).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field38057).method18299(12).method18296(Class140.method420(Class6872.method20921(6.0F, 17.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(9).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37900).method18299(10).method18296(new Class5878().method18310(Enchantments.SOUL_SPEED)))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(2))
                  .method18291(
                     Class4695.method14724(Items.field37820)
                        .method18299(2)
                        .method18296(Class145.method443(Class6872.method20921(0.1F, 0.9F)))
                        .method18296(Class140.method420(Class6871.method20919(1)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Blocks.IRON_BLOCK).method18299(2).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(
                     Class4695.method14724(Items.field37863)
                        .method18296(Class140.method420(Class6871.method20919(1)))
                        .method18296(new Class5878().method18310(Enchantments.SOUL_SPEED))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37818).method18296(Class140.method420(Class6871.method20919(1))).method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Blocks.GOLD_BLOCK).method18299(2).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.CROSSBOW).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_SWORD).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37861).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37860).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.GOLDEN_LEGGINGS).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37863).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Blocks.CRYING_OBSIDIAN).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 4.0F))
                  .method18291(Class4695.method14724(Blocks.field37141).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.CHAIN).method18296(Class140.method420(Class6872.method20921(2.0F, 10.0F))))
                  .method18291(Class4695.method14724(Items.field37976).method18299(2).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Blocks.field36893).method18296(Class140.method420(Class6872.method20921(3.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field38128).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Blocks.OBSIDIAN).method18296(Class140.method420(Class6872.method20921(4.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18296(Class140.method420(Class6872.method20921(4.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37797).method18299(2).method18296(Class140.method420(Class6872.method20921(5.0F, 17.0F))))
                  .method18291(Class4695.method14724(Items.field37870).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      var1.accept(
         Class8793.field39570,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Items.field37803).method18299(15).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Blocks.ANCIENT_DEBRIS).method18299(10).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Items.field37804).method18299(8).method18296(Class140.method420(Class6871.method20919(1))))
                  .method18291(Class4695.method14724(Blocks.ANCIENT_DEBRIS).method18299(4).method18296(Class140.method420(Class6871.method20919(2))))
                  .method18291(
                     Class4695.method14724(Items.field37825)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.8F, 1.0F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37857)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.8F, 1.0F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37856)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.8F, 1.0F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37858)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.8F, 1.0F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37859)
                        .method18299(6)
                        .method18296(Class145.method443(Class6872.method20921(0.8F, 1.0F)))
                        .method18296(Class134.method392())
                  )
                  .method18291(Class4695.method14724(Items.field37825).method18299(6))
                  .method18291(Class4695.method14724(Items.field37857).method18299(5))
                  .method18291(Class4695.method14724(Items.field37856).method18299(5))
                  .method18291(Class4695.method14724(Items.field37859).method18299(5))
                  .method18291(Class4695.method14724(Items.field37858).method18299(5))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE).method18299(2).method18296(Class140.method420(Class6871.method20919(1))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field38116).method18296(Class140.method420(Class6872.method20921(12.0F, 25.0F))))
                  .method18291(Class4695.method14724(Blocks.GOLD_BLOCK).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.IRON_BLOCK).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18296(Class140.method420(Class6872.method20921(3.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18296(Class140.method420(Class6872.method20921(3.0F, 9.0F))))
                  .method18291(Class4695.method14724(Blocks.CRYING_OBSIDIAN).method18296(Class140.method420(Class6872.method20921(3.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field38072).method18296(Class140.method420(Class6872.method20921(8.0F, 23.0F))))
                  .method18291(Class4695.method14724(Blocks.field37141).method18296(Class140.method420(Class6872.method20921(5.0F, 15.0F))))
                  .method18291(Class4695.method14724(Items.field37976).method18296(Class140.method420(Class6872.method20921(3.0F, 8.0F))))
            )
      );
      var1.accept(
         Class8793.field39565,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(Items.field38147)))
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(5.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.TNT).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field38076).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(0.0F, 1.0F))
                  .method18291(Class4695.method14724(Items.field37845))
                  .method18291(Class4695.method14724(Items.field37820))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(2))
                  .method18291(Class4695.method14724(Items.field37913).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37914).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
            )
      );
      var1.accept(
         Class8793.field39558,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(15).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37935).method18299(25).method18296(Class140.method420(Class6872.method20921(4.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37973).method18299(25).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(25).method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(20))
                  .method18291(Class4695.method14724(Items.field38083).method18299(15))
                  .method18291(Class4695.method14724(Items.field38084).method18299(10))
                  .method18291(Class4695.method14724(Items.field38085).method18299(5))
                  .method18291(Class4695.method14724(Items.field37900).method18299(20).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(20))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE).method18299(2))
                  .method18291(Class4694.method14723().method18299(15))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(4))
                  .method18291(Class4695.method14724(Items.field37935).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37840).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Blocks.SAND).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
            )
      );
      var1.accept(
         Class8793.field39535,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 6.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(4.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(15).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(2).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field38112).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 10.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(3))
                  .method18291(Class4695.method14724(Items.field38083))
                  .method18291(Class4695.method14724(Items.field38084))
                  .method18291(Class4695.method14724(Items.field38085))
                  .method18291(
                     Class4695.method14724(Items.field37825)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37859)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37857)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37858)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37856)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37827)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37826)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37820)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37855)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37853)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37854)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37852)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37822)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.IRON_SHOVEL)
                        .method18299(3)
                        .method18296(Class143.method439(Class6872.method20921(20.0F, 39.0F)).method18311())
                  )
            )
      );
      var1.accept(
         Class8793.field39561,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37813).method18299(2))
                  .method18291(Class4695.method14724(Items.field37965).method18299(10))
                  .method18291(Class4695.method14724(Items.EMERALD))
                  .method18291(Class4695.method14724(Items.field37842).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F))))
            )
            .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(Items.GOLDEN_APPLE)))
      );
      var1.accept(
         Class8793.field39559,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 6.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(15).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Blocks.field37009).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37935).method18299(20).method18296(Class140.method420(Class6872.method20921(4.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(16).method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(3))
                  .method18291(Class4695.method14724(Items.field38083))
                  .method18291(Class4695.method14724(Items.field38084))
                  .method18291(Class4695.method14724(Items.field38085))
                  .method18291(Class4695.method14724(Items.field37900).method18296(Class143.method439(Class6871.method20919(30)).method18311()))
            )
      );
      var1.accept(
         Class8793.field39560,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 2.0F))
                  .method18291(Class4695.method14724(Items.field37797).method18299(30).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
            )
      );
      var1.accept(
         Class8793.field39554,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_SWORD).method18299(5))
                  .method18291(Class4695.method14724(Items.field37861).method18299(5))
                  .method18291(Class4695.method14724(Items.field37794).method18299(5))
                  .method18291(Class4695.method14724(Items.field37970).method18299(5).method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(10))
                  .method18291(Class4695.method14724(Items.field38084).method18299(8))
                  .method18291(Class4695.method14724(Items.field38083).method18299(5))
                  .method18291(Class4695.method14724(Items.field38085).method18299(3))
                  .method18291(Class4695.method14724(Blocks.OBSIDIAN).method18299(2).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
            )
      );
      var1.accept(
         Class8793.field39569,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18289(Class6872.method20921(0.0F, 1.0F)).method18291(Class4695.method14724(Items.CROSSBOW)))
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.field37842).method18299(7).method18296(Class140.method420(Class6872.method20921(3.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field38053).method18299(5).method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field38052).method18299(5).method18296(Class140.method420(Class6872.method20921(3.0F, 5.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 3.0F))
                  .method18291(Class4695.method14724(Blocks.DARK_OAK_LOG).method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.EXPERIENCE_BOTTLE).method18299(7))
                  .method18291(Class4695.method14724(Items.field37838).method18299(4).method18296(Class140.method420(Class6872.method20921(1.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field37797).method18299(4).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37500).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37900).method18299(1).method18296(Class134.method392()))
            )
      );
      var1.accept(
         Class8793.field39566,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38056)
                        .method18296(
                           ExplorationMap.method423().method18313(Structure.field18072).method18314(MapDecorationType.RED_X).method18315((byte)1).method18316(false)
                        )
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Items.COMPASS))
                  .method18291(Class4695.method14724(Items.field38056))
                  .method18291(Class4695.method14724(Items.field37907))
                  .method18291(Class4695.method14724(Items.field37899).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 10.0F))))
                  .method18291(Class4695.method14724(Items.field37839).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37900).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
            )
      );
      var1.accept(
         Class8793.field39567,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 10.0F))
                  .method18291(Class4695.method14724(Items.field37899).method18299(8).method18296(Class140.method420(Class6872.method20921(1.0F, 12.0F))))
                  .method18291(Class4695.method14724(Items.field38053).method18299(7).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field38055).method18299(7).method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F))))
                  .method18291(Class4695.method14724(Items.field38052).method18299(7).method18296(Class140.method420(Class6872.method20921(4.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37842).method18299(7).method18296(Class140.method420(Class6872.method20921(8.0F, 21.0F))))
                  .method18291(
                     Class4695.method14724(Items.field38149)
                        .method18299(10)
                        .method18296(
                           Class133.method389()
                              .method18318(Effects.NIGHT_VISION, Class6872.method20921(7.0F, 10.0F))
                              .method18318(Effects.JUMP_BOOST, Class6872.method20921(7.0F, 10.0F))
                              .method18318(Effects.WEAKNESS, Class6872.method20921(6.0F, 8.0F))
                              .method18318(Effects.BLINDNESS, Class6872.method20921(5.0F, 7.0F))
                              .method18318(Effects.POISON, Class6872.method20921(10.0F, 20.0F))
                              .method18318(Effects.SATURATION, Class6872.method20921(7.0F, 10.0F))
                        )
                  )
                  .method18291(Class4695.method14724(Items.field37798).method18299(6).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(5).method18296(Class140.method420(Class6872.method20921(5.0F, 24.0F))))
                  .method18291(Class4695.method14724(Blocks.PUMPKIN).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.field37009).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37840).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Blocks.TNT).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37844).method18299(3).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37845).method18299(3).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37846).method18299(3).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37847).method18299(3).method18296(Class134.method392()))
            )
      );
      var1.accept(
         Class8793.field39568,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 6.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(90).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(40).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37800).method18299(5))
                  .method18291(Class4695.method14724(Items.EXPERIENCE_BOTTLE).method18299(5))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.field38128).method18299(50).method18296(Class140.method420(Class6872.method20921(1.0F, 10.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 10.0F))))
                  .method18291(Class4695.method14724(Items.field37917).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 10.0F))))
            )
      );
      var1.accept(
         Class8793.field39536,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.field37886).method18299(20))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(15))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE).method18299(2))
                  .method18291(Class4695.method14724(Items.field38131).method18299(15))
                  .method18291(Class4695.method14724(Items.field38132).method18299(15))
                  .method18291(Class4695.method14724(Items.field38088).method18299(20))
                  .method18291(Class4695.method14724(Items.field38084).method18299(10))
                  .method18291(Class4695.method14724(Items.field38083).method18299(15))
                  .method18291(Class4695.method14724(Items.field38085).method18299(5))
                  .method18291(Class4695.method14724(Items.field37900).method18299(10).method18296(Class134.method392()))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(20))
                  .method18291(Class4695.method14724(Items.field37842).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.BUCKET).method18299(10))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37960).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37959).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38112).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Items.field37935).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37840).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
            )
      );
      var1.accept(
         Class8793.field39534,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37813))
                  .method18291(Class4695.method14724(Items.field37808).method18299(3))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37812))
                  .method18291(Class4695.method14724(Items.field37807).method18299(3))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37910).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(4))
                  .method18291(Class4695.method14724(Items.field37835).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 12.0F))))
                  .method18291(Class4695.method14724(Blocks.OAK_PLANKS).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 12.0F))))
                  .method18291(Class4695.method14724(Blocks.OAK_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.SPRUCE_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.BIRCH_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.JUNGLE_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.ACACIA_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.DARK_OAK_LOG).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
            )
      );
      var1.accept(
         Class8793.field39557,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.ENDER_PEARL).method18299(10))
                  .method18291(Class4695.method14724(Items.field37800).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37822).method18299(5))
                  .method18291(Class4695.method14724(Items.field37820).method18299(5))
                  .method18291(Class4695.method14724(Items.field37853).method18299(5))
                  .method18291(Class4695.method14724(Items.field37852).method18299(5))
                  .method18291(Class4695.method14724(Items.field37854).method18299(5))
                  .method18291(Class4695.method14724(Items.field37855).method18299(5))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE))
                  .method18291(Class4695.method14724(Items.field37886))
                  .method18291(Class4695.method14724(Items.field38083))
                  .method18291(Class4695.method14724(Items.field38084))
                  .method18291(Class4695.method14724(Items.field38085))
                  .method18291(Class4695.method14724(Items.field37900).method18296(Class143.method439(Class6871.method20919(30)).method18311()))
            )
      );
      var1.accept(
         Class8793.field39556,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(10).method18296(Class140.method420(Class6872.method20921(3.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37822))
                  .method18291(Class4695.method14724(Items.field37900).method18296(Class143.method439(Class6871.method20919(30)).method18311()))
            )
      );
      var1.accept(
         Class8793.field39555,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 10.0F))
                  .method18291(Class4695.method14724(Items.field37900).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37899).method18299(20).method18296(Class140.method420(Class6872.method20921(2.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field38056))
                  .method18291(Class4695.method14724(Items.COMPASS))
                  .method18291(
                     Class4695.method14724(Items.field37900).method18299(10).method18296(Class143.method439(Class6871.method20919(30)).method18311())
                  )
            )
      );
      var1.accept(
         Class8793.field39564,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37798).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37969).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD))
                  .method18291(Class4695.method14724(Items.field37842).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE))
                  .method18291(Class4695.method14724(Items.field37900).method18299(5).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37845))
                  .method18291(Class4695.method14724(Items.field37860))
                  .method18291(Class4695.method14724(Items.field37906).method18299(5).method18296(Class134.method392()))
                  .method18291(
                     Class4695.method14724(Items.field38056)
                        .method18299(10)
                        .method18296(
                           ExplorationMap.method423().method18313(Structure.field18072).method18314(MapDecorationType.RED_X).method18315((byte)1).method18316(false)
                        )
                  )
            )
      );
      var1.accept(
         Class8793.field39563,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(2.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37798).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37813).method18299(2))
                  .method18291(Class4695.method14724(Items.field37965).method18299(5))
                  .method18291(Class4695.method14724(Items.EMERALD))
                  .method18291(Class4695.method14724(Items.field37842).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37845))
                  .method18291(Class4695.method14724(Items.field37860))
                  .method18291(Class4695.method14724(Items.field37906).method18299(5).method18296(Class134.method392()))
                  .method18291(
                     Class4695.method14724(Items.field38056)
                        .method18299(5)
                        .method18296(
                           ExplorationMap.method423().method18313(Structure.field18072).method18314(MapDecorationType.RED_X).method18315((byte)1).method18316(false)
                        )
                  )
            )
      );
      var1.accept(
         Class8793.field39537,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37822).method18299(5))
                  .method18291(Class4695.method14724(Items.field37820).method18299(5))
                  .method18291(Class4695.method14724(Items.field37853).method18299(5))
                  .method18291(Class4695.method14724(Items.field37852).method18299(5))
                  .method18291(Class4695.method14724(Items.field37854).method18299(5))
                  .method18291(Class4695.method14724(Items.field37855).method18299(5))
                  .method18291(Class4695.method14724(Blocks.OBSIDIAN).method18299(5).method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F))))
                  .method18291(Class4695.method14724(Blocks.OAK_SAPLING).method18299(5).method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(3))
                  .method18291(Class4695.method14724(Items.field38083))
                  .method18291(Class4695.method14724(Items.field38084))
                  .method18291(Class4695.method14724(Items.field38085))
            )
      );
      var1.accept(
         Class8793.field39538,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37800).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37801).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37822).method18299(5))
                  .method18291(Class4695.method14724(Items.field37798).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37835).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.IRON_SHOVEL).method18299(5))
            )
      );
      var1.accept(
         Class8793.field39540,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.field38056).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37899).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.COMPASS).method18299(5))
                  .method18291(Class4695.method14724(Items.field37843).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37835).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
            )
      );
      var1.accept(
         Class8793.field39541,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.field37897).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field38051).method18299(1))
                  .method18291(Class4695.method14724(Blocks.STONE).method18299(2))
                  .method18291(Class4695.method14724(Blocks.field36615).method18299(2))
                  .method18291(Class4695.method14724(Items.field37843).method18299(4).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37922).method18299(1))
                  .method18291(Class4695.method14724(Blocks.field36858).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
            )
      );
      var1.accept(
         Class8793.field39539,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(4).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37852).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
            )
      );
      var1.accept(
         Class8793.field39542,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Blocks.WHITE_WOOL).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Blocks.BLACK_WOOL).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.GRAY_WOOL).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.BROWN_WOOL).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Blocks.LIGHT_GRAY_WOOL).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
                  .method18291(Class4695.method14724(Items.field37956).method18299(1))
                  .method18291(Class4695.method14724(Items.field37842).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 6.0F))))
            )
      );
      var1.accept(
         Class8793.field39543,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
                  .method18291(Class4695.method14724(Items.PORKCHOP).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37842).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37961).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field38090).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
            )
      );
      var1.accept(
         Class8793.field39544,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
                  .method18291(Class4695.method14724(Items.field37797).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37839).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.EGG).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37868).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37835).method18299(6).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
            )
      );
      var1.accept(
         Class8793.field39545,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1))
                  .method18291(Class4695.method14724(Items.field37909).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37910).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.WATER_BUCKET).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field38158).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37841).method18299(3).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
            )
      );
      var1.accept(
         Class8793.field39546,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 5.0F))
                  .method18291(Class4695.method14724(Items.LEATHER).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37845).method18299(2))
                  .method18291(Class4695.method14724(Items.field37847).method18299(2))
                  .method18291(Class4695.method14724(Items.field37844).method18299(2))
                  .method18291(Class4695.method14724(Items.field37843).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37846).method18299(2))
                  .method18291(Class4695.method14724(Items.field37886).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
            )
      );
      var1.accept(
         Class8793.field39547,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(7).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(7).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37917).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
            )
      );
      var1.accept(
         Class8793.field39549,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37969).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37333).method18299(2))
                  .method18291(Class4695.method14724(Items.field37334).method18299(1))
                  .method18291(Class4695.method14724(Items.field38053).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.APPLE).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37900).method18299(1))
                  .method18291(Class4695.method14724(Items.field37839).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.OAK_SAPLING).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
            )
      );
      var1.accept(
         Class8793.field39550,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field38128).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field37312).method18299(2))
                  .method18291(Class4695.method14724(Items.field37600).method18299(2))
                  .method18291(Class4695.method14724(Items.field38053).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field38170).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37959).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field38067).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.SPRUCE_SAPLING).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.SPRUCE_SIGN).method18299(1))
                  .method18291(Class4695.method14724(Items.field37260).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
            )
      );
      var1.accept(
         Class8793.field39552,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37969).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.field37311).method18299(5))
                  .method18291(Class4695.method14724(Items.field37599).method18299(5))
                  .method18291(Class4695.method14724(Items.field37843).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37841).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Blocks.ACACIA_SAPLING).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37886).method18299(1))
                  .method18291(Class4695.method14724(Blocks.TORCH).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.BUCKET).method18299(1))
            )
      );
      var1.accept(
         Class8793.field39551,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Blocks.field37006).method18299(1))
                  .method18291(Class4695.method14724(Blocks.SNOW_BLOCK).method18299(4))
                  .method18291(Class4695.method14724(Items.field38053).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38112).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 5.0F))))
                  .method18291(Class4695.method14724(Items.field38113).method18299(1))
                  .method18291(Class4695.method14724(Items.field37407).method18299(1))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.SNOWBALL).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
            )
      );
      var1.accept(
         Class8793.field39548,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(3.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37897).method18299(1))
                  .method18291(Class4695.method14724(Items.field37931).method18299(1))
                  .method18291(Class4695.method14724(Blocks.CACTUS).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37842).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 7.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37900).method18299(1))
                  .method18291(Class4695.method14724(Blocks.DEAD_BUSH).method18299(2).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
                  .method18291(Class4695.method14724(Items.EMERALD).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F))))
            )
      );
      var1.accept(
         Class8793.field39562,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 3.0F))
                  .method18291(Class4695.method14724(Items.LEAD).method18299(20))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(15))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE).method18299(2))
                  .method18291(Class4695.method14724(Items.field38131).method18299(15))
                  .method18291(Class4695.method14724(Items.field38132).method18299(15))
                  .method18291(Class4695.method14724(Items.field38088).method18299(20))
                  .method18291(Class4695.method14724(Items.field37849).method18299(10))
                  .method18291(Class4695.method14724(Items.field37829).method18299(15))
                  .method18291(Class4695.method14724(Items.field37857).method18299(5))
                  .method18291(Class4695.method14724(Items.field37900).method18299(10).method18296(Class134.method392()))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 4.0F))
                  .method18291(Class4695.method14724(Items.field37801).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37843).method18299(20))
                  .method18291(Class4695.method14724(Items.field37842).method18299(20).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.BUCKET).method18299(10))
                  .method18291(Class4695.method14724(Items.REDSTONE_DUST).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37798).method18299(15).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37960).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field37959).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38112).method18299(10).method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(3))
                  .method18291(Class4695.method14724(Items.field37935).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37840).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37965).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field37838).method18299(10).method18296(Class140.method420(Class6872.method20921(1.0F, 8.0F))))
            )
      );
      var1.accept(
         Class8793.field39574,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(4.0F, 8.0F))
                  .method18291(Class4695.method14724(Items.field37392).method18299(40).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
                  .method18291(Class4695.method14724(Items.field37868).method18299(40).method18296(Class140.method420(Class6872.method20921(1.0F, 4.0F))))
                  .method18291(Class4695.method14724(Items.field38128).method18299(40).method18296(Class140.method420(Class6872.method20921(9.0F, 18.0F))))
                  .method18291(Class4695.method14724(Items.field37794).method18299(40))
                  .method18291(Class4695.method14724(Items.field38046).method18299(40))
                  .method18291(Class4695.method14724(Items.GOLDEN_APPLE).method18299(15))
                  .method18291(Class4695.method14724(Items.field37969).method18299(15).method18296(Class140.method420(Class6872.method20921(4.0F, 24.0F))))
                  .method18291(Class4695.method14724(Items.GOLDEN_SWORD).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37818).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37819).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37816).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37817).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37863).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37861).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37860).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.GOLDEN_LEGGINGS).method18299(15).method18296(Class134.method392()))
                  .method18291(Class4695.method14724(Items.field37980).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 12.0F))))
                  .method18291(Class4695.method14724(Items.field38084).method18299(5))
                  .method18291(Class4695.method14724(Items.field37540).method18299(5))
                  .method18291(Class4695.method14724(Items.field38057).method18299(5).method18296(Class140.method420(Class6872.method20921(4.0F, 12.0F))))
                  .method18291(Class4695.method14724(Items.field37907).method18299(5))
                  .method18291(Class4695.method14724(Items.field37802).method18299(5).method18296(Class140.method420(Class6872.method20921(2.0F, 8.0F))))
                  .method18291(Class4695.method14724(Items.field38167).method18299(1))
                  .method18291(Class4695.method14724(Items.ENCHANTED_GOLDEN_APPLE).method18299(1))
                  .method18291(Class4695.method14724(Items.field37358).method18299(1).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F))))
            )
      );
   }
}
