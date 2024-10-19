package mapped;

import com.google.gson.JsonElement;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Class7810 {
   private final BiConsumer<ResourceLocation, Supplier<JsonElement>> field33510;

   public Class7810(BiConsumer<ResourceLocation, Supplier<JsonElement>> var1) {
      this.field33510 = var1;
   }

   private void method26074(Item var1, Class9253 var2) {
      var2.method34808(Class9060.method33724(var1), Class7287.method23038(var1), this.field33510);
   }

   private void method26075(Item var1, String var2, Class9253 var3) {
      var3.method34808(Class9060.method33725(var1, var2), Class7287.method23040(Class7287.method23044(var1, var2)), this.field33510);
   }

   private void method26076(Item var1, Item var2, Class9253 var3) {
      var3.method34808(Class9060.method33724(var1), Class7287.method23038(var2), this.field33510);
   }

   public void method26077() {
      this.method26074(Items.field38124, Class9756.field45623);
      this.method26074(Items.field37795, Class9756.field45623);
      this.method26074(Items.ARMOR_STAND, Class9756.field45623);
      this.method26074(Items.field37797, Class9756.field45623);
      this.method26074(Items.field38054, Class9756.field45623);
      this.method26074(Items.field37357, Class9756.field45624);
      this.method26074(Items.field37961, Class9756.field45623);
      this.method26074(Items.field38111, Class9756.field45623);
      this.method26074(Items.field38113, Class9756.field45623);
      this.method26074(Items.field38122, Class9756.field45623);
      this.method26074(Items.field37933, Class9756.field45623);
      this.method26074(Items.field37975, Class9756.field45623);
      this.method26074(Items.field37967, Class9756.field45624);
      this.method26074(Items.field37929, Class9756.field45623);
      this.method26074(Items.field37934, Class9756.field45623);
      this.method26074(Items.field37900, Class9756.field45623);
      this.method26074(Items.field37836, Class9756.field45623);
      this.method26074(Items.field37843, Class9756.field45623);
      this.method26074(Items.field37896, Class9756.field45623);
      this.method26074(Items.field37930, Class9756.field45623);
      this.method26074(Items.BUCKET, Class9756.field45623);
      this.method26074(Items.field38064, Class9756.field45625);
      this.method26074(Items.field38065, Class9756.field45625);
      this.method26074(Items.field37851, Class9756.field45623);
      this.method26074(Items.field37849, Class9756.field45623);
      this.method26074(Items.field37848, Class9756.field45623);
      this.method26074(Items.field37850, Class9756.field45623);
      this.method26074(Items.field37799, Class9756.field45623);
      this.method26074(Items.CHEST_MINECART, Class9756.field45623);
      this.method26074(Items.field37963, Class9756.field45623);
      this.method26074(Items.field38109, Class9756.field45623);
      this.method26074(Items.field37897, Class9756.field45623);

      for (int var3 = 1; var3 < 64; var3++) {
         this.method26075(Items.field37907, String.format("_%02d", var3), Class9756.field45623);
      }

      this.method26074(Items.field37798, Class9756.field45623);
      this.method26074(Items.field37894, Class9756.field45623);
      this.method26074(Items.COMMAND_BLOCK_MINECART, Class9756.field45623);

      for (int var4 = 0; var4 < 32; var4++) {
         if (var4 != 16) {
            this.method26075(Items.field37905, String.format("_%02d", var4), Class9756.field45623);
         }
      }

      this.method26074(Items.field37962, Class9756.field45623);
      this.method26074(Items.field37964, Class9756.field45623);
      this.method26074(Items.field37913, Class9756.field45623);
      this.method26074(Items.field38091, Class9756.field45623);
      this.method26074(Items.field37870, Class9756.field45623);
      this.method26074(Items.field38078, Class9756.field45623);
      this.method26074(Items.field37914, Class9756.field45623);
      this.method26074(Items.field37954, Class9756.field45623);
      this.method26074(Items.field38152, Class9756.field45623);
      this.method26074(Items.field37927, Class9756.field45623);
      this.method26074(Items.field38125, Class9756.field45623);
      this.method26074(Items.field37800, Class9756.field45623);
      this.method26074(Items.field37828, Class9756.field45624);
      this.method26074(Items.field37859, Class9756.field45623);
      this.method26074(Items.field37857, Class9756.field45623);
      this.method26074(Items.field37856, Class9756.field45623);
      this.method26074(Items.field37829, Class9756.field45624);
      this.method26074(Items.field38085, Class9756.field45623);
      this.method26074(Items.field37858, Class9756.field45623);
      this.method26074(Items.field37827, Class9756.field45624);
      this.method26074(Items.field37826, Class9756.field45624);
      this.method26074(Items.field37825, Class9756.field45624);
      this.method26074(Items.field38114, Class9756.field45623);
      this.method26074(Items.field37958, Class9756.field45623);
      this.method26074(Items.field37904, Class9756.field45623);
      this.method26074(Items.field38049, Class9756.field45623);
      this.method26074(Items.field38070, Class9756.field45623);
      this.method26074(Items.field37979, Class9756.field45623);
      this.method26074(Items.field37966, Class9756.field45623);
      this.method26074(Items.END_CRYSTAL, Class9756.field45623);
      this.method26074(Items.field38045, Class9756.field45623);
      this.method26074(Items.field37974, Class9756.field45623);
      this.method26074(Items.field38068, Class9756.field45623);
      this.method26074(Items.field38046, Class9756.field45623);
      this.method26074(Items.field37868, Class9756.field45623);
      this.method26074(Items.field37794, Class9756.field45623);
      this.method26074(Items.field38151, Class9756.field45623);
      this.method26074(Items.FURNACE_MINECART, Class9756.field45623);
      this.method26074(Items.field37968, Class9756.field45623);
      this.method26074(Items.field37972, Class9756.field45623);
      this.method26074(Items.field37980, Class9756.field45623);
      this.method26074(Items.field38155, Class9756.field45623);
      this.method26074(Items.field37908, Class9756.field45623);
      this.method26074(Items.GOLDEN_APPLE, Class9756.field45623);
      this.method26074(Items.field37818, Class9756.field45624);
      this.method26074(Items.field37863, Class9756.field45623);
      this.method26074(Items.field38057, Class9756.field45623);
      this.method26074(Items.field37861, Class9756.field45623);
      this.method26074(Items.field37860, Class9756.field45623);
      this.method26074(Items.field37819, Class9756.field45624);
      this.method26074(Items.field38084, Class9756.field45623);
      this.method26074(Items.field37862, Class9756.field45623);
      this.method26074(Items.field37817, Class9756.field45624);
      this.method26074(Items.field37816, Class9756.field45624);
      this.method26074(Items.field37815, Class9756.field45624);
      this.method26074(Items.field37802, Class9756.field45623);
      this.method26074(Items.field37969, Class9756.field45623);
      this.method26074(Items.field37925, Class9756.field45623);
      this.method26074(Items.field37931, Class9756.field45623);
      this.method26074(Items.field37840, Class9756.field45623);
      this.method26074(Items.field38147, Class9756.field45623);
      this.method26074(Items.field38174, Class9756.field45623);
      this.method26074(Items.field38177, Class9756.field45623);
      this.method26074(Items.HOPPER_MINECART, Class9756.field45623);
      this.method26074(Items.field37915, Class9756.field45623);
      this.method26074(Items.field37823, Class9756.field45624);
      this.method26074(Items.field37855, Class9756.field45623);
      this.method26074(Items.field37853, Class9756.field45623);
      this.method26074(Items.field37852, Class9756.field45623);
      this.method26074(Items.field37824, Class9756.field45624);
      this.method26074(Items.field38083, Class9756.field45623);
      this.method26074(Items.field37801, Class9756.field45623);
      this.method26074(Items.field37854, Class9756.field45623);
      this.method26074(Items.field38128, Class9756.field45623);
      this.method26074(Items.field37822, Class9756.field45624);
      this.method26074(Items.field37821, Class9756.field45624);
      this.method26074(Items.field37820, Class9756.field45624);
      this.method26074(Items.ITEM_FRAME, Class9756.field45623);
      this.method26074(Items.field38123, Class9756.field45623);
      this.method26074(Items.field38129, Class9756.field45623);
      this.method26074(Items.field37917, Class9756.field45623);
      this.method26074(Items.LAVA_BUCKET, Class9756.field45623);
      this.method26074(Items.LEATHER, Class9756.field45623);
      this.method26074(Items.field38086, Class9756.field45623);
      this.method26074(Items.field37921, Class9756.field45623);
      this.method26074(Items.field37926, Class9756.field45623);
      this.method26074(Items.field37923, Class9756.field45623);
      this.method26074(Items.field37920, Class9756.field45623);
      this.method26074(Items.field37976, Class9756.field45623);
      this.method26074(Items.field38056, Class9756.field45623);
      this.method26074(Items.field37957, Class9756.field45623);
      this.method26074(Items.MILK_BUCKET, Class9756.field45623);
      this.method26074(Items.MINECART, Class9756.field45623);
      this.method26074(Items.field38154, Class9756.field45623);
      this.method26074(Items.field37837, Class9756.field45623);
      this.method26074(Items.field38141, Class9756.field45623);
      this.method26074(Items.field38131, Class9756.field45623);
      this.method26074(Items.field38133, Class9756.field45623);
      this.method26074(Items.field38132, Class9756.field45623);
      this.method26074(Items.field38134, Class9756.field45623);
      this.method26074(Items.field38135, Class9756.field45623);
      this.method26074(Items.field38136, Class9756.field45623);
      this.method26074(Items.field38137, Class9756.field45623);
      this.method26074(Items.field38143, Class9756.field45623);
      this.method26074(Items.field38138, Class9756.field45623);
      this.method26074(Items.field38139, Class9756.field45623);
      this.method26074(Items.field38142, Class9756.field45623);
      this.method26074(Items.field38140, Class9756.field45623);
      this.method26074(Items.field38090, Class9756.field45623);
      this.method26074(Items.field38088, Class9756.field45623);
      this.method26074(Items.field38146, Class9756.field45623);
      this.method26074(Items.field37833, Class9756.field45624);
      this.method26074(Items.field37867, Class9756.field45623);
      this.method26074(Items.field37865, Class9756.field45623);
      this.method26074(Items.field37864, Class9756.field45623);
      this.method26074(Items.field37834, Class9756.field45624);
      this.method26074(Items.field37803, Class9756.field45623);
      this.method26074(Items.field37866, Class9756.field45623);
      this.method26074(Items.field37832, Class9756.field45624);
      this.method26074(Items.field37804, Class9756.field45623);
      this.method26074(Items.field37831, Class9756.field45624);
      this.method26074(Items.field37830, Class9756.field45624);
      this.method26074(Items.field38071, Class9756.field45623);
      this.method26074(Items.field38066, Class9756.field45623);
      this.method26074(Items.OAK_BOAT, Class9756.field45623);
      this.method26074(Items.field37919, Class9756.field45623);
      this.method26074(Items.PAINTING, Class9756.field45623);
      this.method26074(Items.field37899, Class9756.field45623);
      this.method26074(Items.field38145, Class9756.field45623);
      this.method26074(Items.field38156, Class9756.field45623);
      this.method26074(Items.field37924, Class9756.field45623);
      this.method26074(Items.field38055, Class9756.field45623);
      this.method26074(Items.field38110, Class9756.field45623);
      this.method26074(Items.field37869, Class9756.field45623);
      this.method26074(Items.field38076, Class9756.field45623);
      this.method26074(Items.field38075, Class9756.field45623);
      this.method26074(Items.field37912, Class9756.field45623);
      this.method26074(Items.field37892, Class9756.field45623);
      this.method26074(Items.field38067, Class9756.field45623);
      this.method26074(Items.field37928, Class9756.field45623);
      this.method26074(Items.field38072, Class9756.field45623);
      this.method26074(Items.field38077, Class9756.field45623);
      this.method26074(Items.field38080, Class9756.field45623);
      this.method26074(Items.field38081, Class9756.field45623);
      this.method26074(Items.field38079, Class9756.field45623);
      this.method26074(Items.field37932, Class9756.field45623);
      this.method26074(Items.field37965, Class9756.field45623);
      this.method26074(Items.field37886, Class9756.field45623);
      this.method26074(Items.field37910, Class9756.field45623);
      this.method26074(Items.SALMON_BUCKET, Class9756.field45623);
      this.method26074(Items.field37793, Class9756.field45623);
      this.method26074(Items.field37956, Class9756.field45623);
      this.method26074(Items.field38127, Class9756.field45623);
      this.method26074(Items.field38153, Class9756.field45623);
      this.method26074(Items.field37901, Class9756.field45623);
      this.method26074(Items.SNOWBALL, Class9756.field45623);
      this.method26074(Items.field38116, Class9756.field45623);
      this.method26074(Items.field37973, Class9756.field45623);
      this.method26074(Items.field38121, Class9756.field45623);
      this.method26074(Items.field37835, Class9756.field45624);
      this.method26074(Items.field37813, Class9756.field45624);
      this.method26074(Items.field37814, Class9756.field45624);
      this.method26074(Items.field37812, Class9756.field45624);
      this.method26074(Items.field37811, Class9756.field45624);
      this.method26074(Items.field37810, Class9756.field45624);
      this.method26074(Items.field37936, Class9756.field45623);
      this.method26074(Items.field38149, Class9756.field45623);
      this.method26074(Items.TNT_MINECART, Class9756.field45623);
      this.method26074(Items.TOTEM_OF_UNDYING, Class9756.field45623);
      this.method26074(Items.field38144, Class9756.field45623);
      this.method26074(Items.field37911, Class9756.field45623);
      this.method26074(Items.field37895, Class9756.field45623);
      this.method26074(Items.field37792, Class9756.field45623);
      this.method26074(Items.WATER_BUCKET, Class9756.field45623);
      this.method26074(Items.field37842, Class9756.field45623);
      this.method26074(Items.field37918, Class9756.field45623);
      this.method26074(Items.field37808, Class9756.field45624);
      this.method26074(Items.field37809, Class9756.field45624);
      this.method26074(Items.field37807, Class9756.field45624);
      this.method26074(Items.field37806, Class9756.field45624);
      this.method26074(Items.field37805, Class9756.field45624);
      this.method26074(Items.field38047, Class9756.field45623);
      this.method26074(Items.field38048, Class9756.field45623);
      this.method26074(Items.field37922, Class9756.field45623);
      this.method26076(Items.field38130, Items.field37835, Class9756.field45624);
      this.method26076(Items.ENCHANTED_GOLDEN_APPLE, Items.GOLDEN_APPLE, Class9756.field45623);
   }
}
