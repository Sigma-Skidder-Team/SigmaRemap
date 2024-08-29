package mapped;

import net.minecraft.client.util.Util;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class2834 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   public static final Class7519 field17619 = Class155.method467(Class8912.method32576().method32577(Class9495.field44142));
   public static final Class7519 field17620 = Class155.method467(Class8912.method32576().method32577(Class9495.field44143));
   public static final Class7519 field17621 = Class155.method467(Class8912.method32576().method32577(Class9495.field44144));
   public static final Class7519 field17622 = Class155.method467(Class8912.method32576().method32577(Class9495.field44194));
   public static final Class7519 field17623 = Class155.method467(Class8912.method32576().method32577(Class9495.field44180));
   public static final Class7519 field17624 = Class155.method467(Class8912.method32576().method32577(Class9495.field44181));
   public static final Class7519 field17625 = Class155.method467(Class8912.method32576().method32577(Class9495.field44195));

   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      var1.accept(
         Class8793.field39591,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4687.method14706(Class8793.field39592).method18299(10).method18300(-2))
                  .method18291(
                     Class4687.method14706(Class8793.field39593)
                        .method18299(5)
                        .method18300(2)
                        .method18297(Class123.method357(Class2063.field13447, Class7552.method24700().method24712(Class8713.method31426(true))))
                  )
                  .method18291(Class4687.method14706(Class8793.field39594).method18299(85).method18300(-1))
            )
      );
      var1.accept(
         Class8793.field39594,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18291(Class4695.method14724(Items.field37909).method18299(60))
                  .method18291(Class4695.method14724(Items.field37910).method18299(25))
                  .method18291(Class4695.method14724(Items.field37911).method18299(2))
                  .method18291(Class4695.method14724(Items.field37912).method18299(13))
            )
      );
      var1.accept(
         Class8793.field39592,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18291(Class4695.method14724(Blocks.LILY_PAD).method18299(17))
                  .method18291(Class4695.method14724(Items.field37847).method18299(10).method18296(Class145.method443(Class6872.method20921(0.0F, 0.9F))))
                  .method18291(Class4695.method14724(Items.field37890).method18299(10))
                  .method18291(Class4695.method14724(Items.field37935).method18299(10))
                  .method18291(
                     Class4695.method14724(Items.field37971)
                        .method18299(10)
                        .method18296(Class136.method399(Util.<CompoundNBT>make(new CompoundNBT(), var0 -> var0.method109("Potion", "minecraft:water"))))
                  )
                  .method18291(Class4695.method14724(Items.field37838).method18299(5))
                  .method18291(Class4695.method14724(Items.field37906).method18299(2).method18296(Class145.method443(Class6872.method20921(0.0F, 0.9F))))
                  .method18291(Class4695.method14724(Items.field37836).method18299(10))
                  .method18291(Class4695.method14724(Items.field37835).method18299(5))
                  .method18291(Class4695.method14724(Items.field37915).method18299(1).method18296(Class140.method420(Class6871.method20919(10))))
                  .method18291(Class4695.method14724(Blocks.TRIPWIRE_HOOK).method18299(10))
                  .method18291(Class4695.method14724(Items.field37965).method18299(10))
                  .method18291(
                     Class4695.method14724(Blocks.field37009)
                        .method18297(
                           field17619.method24516(field17620)
                              .method24516(field17621)
                              .method24516(field17622)
                              .method24516(field17623)
                              .method24516(field17624)
                              .method24516(field17625)
                        )
                        .method18299(10)
                  )
            )
      );
      var1.accept(
         Class8793.field39593,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18291(Class4695.method14724(Items.field38088))
                  .method18291(Class4695.method14724(Items.field37886))
                  .method18291(
                     Class4695.method14724(Items.field37796)
                        .method18296(Class145.method443(Class6872.method20921(0.0F, 0.25F)))
                        .method18296(Class143.method439(Class6871.method20919(30)).method18311())
                  )
                  .method18291(
                     Class4695.method14724(Items.field37906)
                        .method18296(Class145.method443(Class6872.method20921(0.0F, 0.25F)))
                        .method18296(Class143.method439(Class6871.method20919(30)).method18311())
                  )
                  .method18291(Class4695.method14724(Items.field37900).method18296(Class143.method439(Class6871.method20919(30)).method18311()))
                  .method18291(Class4695.method14724(Items.field38146))
            )
      );
   }
}
