package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class2832 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   private static final Class7552 field17612 = Class7552.method24700().method24709(Class8265.method28830().method28831(true).method28833());
   private static final Set<EntityType<?>> field17613 = ImmutableSet.of(
      EntityType.PLAYER, EntityType.field41006, EntityType.field41041, EntityType.field41082, EntityType.field41098
   );
   private final Map<ResourceLocation, Class5888> field17614 = Maps.newHashMap();

   private static Class5888 method11032(Class3303 var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0)))
         .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4687.method14706(EntityType.field41074.method33212())));
   }

   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      this.method11033(EntityType.field41006, Class7318.method23188());
      this.method11033(EntityType.field41008, Class7318.method23188());
      this.method11033(EntityType.field41009, Class7318.method23188());
      this.method11033(
         EntityType.field41010,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37967)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41012,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37838).method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F))))
            )
      );
      this.method11033(
         EntityType.field41013,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37838)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37973)
                        .method18296(Class140.method420(Class6872.method20921(-1.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41014,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37839)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37963)
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41015,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37909)
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37934))
                  .method18297(Class151.method456(0.05F))
            )
      );
      this.method11033(
         EntityType.field41016,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37961)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41017,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37840)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18291(Class4685.method14698(Class5985.field26117))
                  .method18297(Class123.method357(Class2063.field13448, Class7552.method24700().method24702(Class8613.field38734)))
            )
      );
      this.method11033(
         EntityType.field41018,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37909)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                  )
            )
      );
      this.method11033(
         EntityType.field41019,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41021,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37802))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.05F, 0.01F))
            )
      );
      this.method11033(
         EntityType.field41022,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38075)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37909)
                        .method18299(3)
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                  )
                  .method18291(Class4695.method14724(Items.field38076).method18299(2).method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F))))
                  .method18291(Class4694.method14723())
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Blocks.field36453))
                  .method18297(Class163.method492())
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4687.method14706(Class8793.field39594))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(EntityType.field41024, Class7318.method23188());
      this.method11033(
         EntityType.field41025,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37966)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41026, Class7318.method23188());
      this.method11033(
         EntityType.field41027,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(Items.field38126)))
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38049)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(EntityType.field41033, Class7318.method23188());
      this.method11033(
         EntityType.field41034,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37968)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37840)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41035, Class7318.method23188());
      this.method11033(
         EntityType.field41036,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38075)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37909)
                        .method18299(2)
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                  )
                  .method18291(Class4695.method14724(Items.field38076).method18299(2).method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F))))
                  .method18291(Class4694.method14723())
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4687.method14706(Class8793.field39594))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(
         EntityType.field41038,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41039,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37801))
                  .method18291(Class4695.method14724(Items.field38052))
                  .method18291(Class4695.method14724(Items.field38053))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(
         EntityType.field41072,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37886).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      this.method11033(EntityType.field41040, Class7318.method23188());
      this.method11033(
         EntityType.field41041,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Blocks.POPPY).method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37801).method18296(Class140.method420(Class6872.method20921(3.0F, 5.0F))))
            )
      );
      this.method11033(
         EntityType.field41047,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41049,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37976)
                        .method18296(Class140.method420(Class6872.method20921(-2.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41057,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41058,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37961)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41059, Class7318.method23188());
      this.method11033(
         EntityType.field41061,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Blocks.field37009).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      this.method11033(
         EntityType.field41062,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37839)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41063,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38145)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41064,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37869)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41067, Class7318.method23188());
      this.method11033(EntityType.PLAYER, Class7318.method23188());
      this.method11033(
         EntityType.field41068,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37909)
                        .method18299(3)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37910)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41070,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37912).method18296(Class140.method420(Class6871.method20919(1))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37934))
                  .method18297(Class151.method456(0.05F))
            )
      );
      this.method11033(
         EntityType.field41071,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38081)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38077)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field38080))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.1F, 0.03F))
            )
      );
      this.method11033(
         EntityType.field41073,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37910)
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37934))
                  .method18297(Class151.method456(0.05F))
            )
      );
      this.method11033(
         EntityType.field41074,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38090)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11034(Class8793.field39590, method11032(Blocks.BLACK_WOOL));
      this.method11034(Class8793.field39586, method11032(Blocks.BLUE_WOOL));
      this.method11034(Class8793.field39587, method11032(Blocks.BROWN_WOOL));
      this.method11034(Class8793.field39584, method11032(Blocks.CYAN_WOOL));
      this.method11034(Class8793.field39582, method11032(Blocks.GRAY_WOOL));
      this.method11034(Class8793.field39588, method11032(Blocks.GREEN_WOOL));
      this.method11034(Class8793.field39578, method11032(Blocks.LIGHT_BLUE_WOOL));
      this.method11034(Class8793.field39583, method11032(Blocks.LIGHT_GRAY_WOOL));
      this.method11034(Class8793.field39580, method11032(Blocks.LIME_WOOL));
      this.method11034(Class8793.field39577, method11032(Blocks.MAGENTA_WOOL));
      this.method11034(Class8793.field39576, method11032(Blocks.ORANGE_WOOL));
      this.method11034(Class8793.field39581, method11032(Blocks.PINK_WOOL));
      this.method11034(Class8793.field39585, method11032(Blocks.PURPLE_WOOL));
      this.method11034(Class8793.field39589, method11032(Blocks.RED_WOOL));
      this.method11034(Class8793.field39575, method11032(Blocks.WHITE_WOOL));
      this.method11034(Class8793.field39579, method11032(Blocks.YELLOW_WOOL));
      this.method11033(
         EntityType.field41075,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field38127))
                  .method18297(Class124.method363(0.5F, 0.0625F))
            )
      );
      this.method11033(EntityType.field41077, Class7318.method23188());
      this.method11033(
         EntityType.field41078,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37797)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37935)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41079,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37935)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41080,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37901)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41082,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37888).method18296(Class140.method420(Class6872.method20921(0.0F, 15.0F))))
            )
      );
      this.method11033(
         EntityType.field41085,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37838)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37973)
                        .method18296(Class140.method420(Class6872.method20921(-1.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41086,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37915)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41087,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37797)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37935)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38117)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)).method18317(1))
                        .method18296(Class136.method399(Util.<CompoundNBT>method38508(new CompoundNBT(), var0 -> var0.method109("Potion", "minecraft:slowness"))))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41088,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37838)
                        .method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41094,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41095,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37911).method18296(Class140.method420(Class6871.method20919(1))))
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37934))
                  .method18297(Class151.method456(0.05F))
            )
      );
      this.method11033(
         EntityType.field41096,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Blocks.SEAGRASS)
                        .method18299(3)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37836))
                  .method18297(Class153.method462(Class9714.method38056().method38058(true)))
            )
      );
      this.method11033(EntityType.field41097, Class7318.method23188());
      this.method11033(EntityType.field41098, Class7318.method23188());
      this.method11033(EntityType.field41100, Class7318.method23188());
      this.method11033(
         EntityType.field41099,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field38049)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18297(Class163.method492())
            )
      );
      this.method11033(
         EntityType.field41101,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6872.method20921(1.0F, 3.0F))
                  .method18291(
                     Class4695.method14724(Items.field37908)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37936)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37887)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37973)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37972)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37840)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
                  .method18291(
                     Class4695.method14724(Items.field37835)
                        .method18299(2)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41102, Class7318.method23188());
      this.method11033(
         EntityType.field41103,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37798)
                        .method18296(Class140.method420(Class6872.method20921(-1.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37935)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Blocks.field36703))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(EntityType.field41105, Class7318.method23188());
      this.method11033(
         EntityType.field41106,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 3.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41107,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37801))
                  .method18291(Class4695.method14724(Items.field38052))
                  .method18291(Class4695.method14724(Items.field38053))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(
         EntityType.field41108,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(
         EntityType.field41110,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37969)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37802))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      this.method11033(
         EntityType.field41037,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37869)
                        .method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F)))
                        .method18296(Class131.method383().method18297(Class123.method357(Class2063.field13447, field17612)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37890)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 1.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
      );
      this.method11033(EntityType.field41065, Class7318.method23188());
      this.method11033(EntityType.field41066, Class7318.method23188());
      this.method11033(
         EntityType.field41109,
         Class7318.method23188()
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(Items.field37965)
                        .method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F)))
                        .method18296(Class130.method379(Class6872.method20921(0.0F, 1.0F)))
                  )
            )
            .method18320(
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(Items.field37801))
                  .method18291(Class4695.method14724(Items.field38052))
                  .method18291(Class4695.method14724(Items.field38053))
                  .method18297(Class163.method492())
                  .method18297(Class124.method363(0.025F, 0.01F))
            )
      );
      HashSet var4 = Sets.newHashSet();

      for (EntityType var6 : Registry.ENTITY_TYPE) {
         ResourceLocation var7 = var6.method33212();
         if (!field17613.contains(var6) && var6.method33209() == Class179.field628) {
            if (var7 != Class8793.field39533 && this.field17614.remove(var7) != null) {
               throw new IllegalStateException(
                  String.format("Weird loottable '%s' for '%s', not a LivingEntity so should not have loot", var7, Registry.ENTITY_TYPE.getKey(var6))
               );
            }
         } else if (var7 != Class8793.field39533 && var4.add(var7)) {
            Class5888 var8 = this.field17614.remove(var7);
            if (var8 == null) {
               throw new IllegalStateException(String.format("Missing loottable '%s' for '%s'", var7, Registry.ENTITY_TYPE.getKey(var6)));
            }

            var1.accept(var7, var8);
         }
      }

      this.field17614.forEach(var1::accept);
   }

   private void method11033(EntityType<?> var1, Class5888 var2) {
      this.method11034(var1.method33212(), var2);
   }

   private void method11034(ResourceLocation var1, Class5888 var2) {
      this.field17614.put(var1, var2);
   }
}
