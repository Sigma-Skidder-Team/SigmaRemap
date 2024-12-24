package mapped;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.nio.file.Path;
import java.util.function.Function;

public class Class4455 extends Class4441<Item> {
   private final Function<ITag$NamedTag<Block>, Class6879> field21632;

   public Class4455(Class9068 var1, Class4454 var2) {
      super(var1, Registry.ITEM);
      this.field21632 = var2::method14015;
   }

   @Override
   public void method14010() {
      this.method14089(BlockTags.field32734, ItemTags.field26070);
      this.method14089(BlockTags.field32735, ItemTags.field26071);
      this.method14089(BlockTags.field32736, ItemTags.field26072);
      this.method14089(BlockTags.field32737, ItemTags.field26073);
      this.method14089(BlockTags.field32738, ItemTags.field26074);
      this.method14089(BlockTags.field32739, ItemTags.field26075);
      this.method14089(BlockTags.field32740, ItemTags.field26076);
      this.method14089(BlockTags.field32741, ItemTags.field26077);
      this.method14089(BlockTags.field32742, ItemTags.field26078);
      this.method14089(BlockTags.field32743, ItemTags.field26079);
      this.method14089(BlockTags.field32745, ItemTags.field26080);
      this.method14089(BlockTags.field32748, ItemTags.field26082);
      this.method14089(BlockTags.field32749, ItemTags.field26083);
      this.method14089(BlockTags.field32753, ItemTags.field26087);
      this.method14089(BlockTags.field32752, ItemTags.field26086);
      this.method14089(BlockTags.field32754, ItemTags.field26088);
      this.method14089(BlockTags.field32755, ItemTags.field26089);
      this.method14089(BlockTags.field32757, ItemTags.field26091);
      this.method14089(BlockTags.field32756, ItemTags.field26090);
      this.method14089(BlockTags.field32758, ItemTags.field26092);
      this.method14089(BlockTags.field32759, ItemTags.field26093);
      this.method14089(BlockTags.field32750, ItemTags.field26084);
      this.method14089(BlockTags.field32751, ItemTags.field26085);
      this.method14089(BlockTags.field32761, ItemTags.field26095);
      this.method14089(BlockTags.field32763, ItemTags.field26097);
      this.method14089(BlockTags.field32764, ItemTags.field26098);
      this.method14089(BlockTags.field32762, ItemTags.field26096);
      this.method14089(BlockTags.field32765, ItemTags.field26099);
      this.method14089(BlockTags.field32766, ItemTags.field26100);
      this.method14089(BlockTags.LEAVES, ItemTags.field26101);
      this.method14089(BlockTags.field32747, ItemTags.field26081);
      this.method14089(BlockTags.field32768, ItemTags.field26102);
      this.method14089(BlockTags.field32769, ItemTags.field26103);
      this.method14089(BlockTags.field32770, ItemTags.field26104);
      this.method14089(BlockTags.field32771, ItemTags.field26105);
      this.method14089(BlockTags.field32772, ItemTags.field26106);
      this.method14089(BlockTags.field32773, ItemTags.field26107);
      this.method14089(BlockTags.field32775, ItemTags.field26110);
      this.method14089(BlockTags.field32807, ItemTags.field26112);
      this.method14014(ItemTags.field26094)
         .method31560(
            Items.field38092,
            Items.field38093,
            Items.field38094,
            Items.field38095,
            Items.field38096,
            Items.field38097,
            Items.field38098,
            Items.field38099,
            Items.field38100,
            Items.field38101,
            Items.field38102,
            Items.field38103,
            Items.field38104,
            Items.field38105,
            Items.field38106,
            Items.field38107
         );
      this.method14014(ItemTags.field26113)
         .method31560(Items.OAK_BOAT, Items.field38121, Items.field38122, Items.field38123, Items.field38124, Items.field38125);
      this.method14014(ItemTags.field26114)
         .method31560(Items.field37909, Items.field37913, Items.field37910, Items.field37914, Items.field37912, Items.field37911);
      this.method14089(BlockTags.field32788, ItemTags.field26115);
      this.method14014(ItemTags.field26117)
         .method31560(
            Items.field38131,
            Items.field38132,
            Items.field38133,
            Items.field38134,
            Items.field38135,
            Items.field38136,
            Items.field38137,
            Items.field38138,
            Items.field38139,
            Items.field38140,
            Items.field38141,
            Items.field38142
         );
      this.method14014(ItemTags.field26116).method31559(ItemTags.field26117).method31558(Items.field38143);
      this.method14014(ItemTags.field26118).method31560(Items.field37798, Items.field37799);
      this.method14014(ItemTags.field26119).method31560(Items.field37797, Items.field38117, Items.field38116);
      this.method14014(ItemTags.field26120).method31560(Items.field38048, Items.field38047);
      this.method14014(ItemTags.field26121)
         .method31560(Items.field37803, Items.EMERALD, Items.field37800, Items.field37802, Items.field37801);
      this.method14014(ItemTags.field26108).method31558(Items.field37445).method31558(Items.field38169).method31558(Items.field38172);
      this.method14014(ItemTags.field26109)
         .method31559(ItemTags.field26110)
         .method31560(
            Items.field37358,
            Items.field38188,
            Items.field37540,
            Items.field37802,
            Items.field38167,
            Items.field37907,
            Items.field38057,
            Items.field37980,
            Items.GOLDEN_APPLE,
            Items.ENCHANTED_GOLDEN_APPLE,
            Items.field37860,
            Items.field37861,
            Items.GOLDEN_LEGGINGS,
            Items.field37863,
            Items.field38084,
            Items.GOLDEN_SWORD,
            Items.field37817,
            Items.field37816,
            Items.field37818,
            Items.field37819
         );
      this.method14014(ItemTags.field26111)
         .method31560(
            Items.field37266,
            Items.field37274,
            Items.field37290,
            Items.field37282,
            Items.field37265,
            Items.field37273,
            Items.field37289,
            Items.field37281,
            Items.field37243,
            Items.field37244,
            Items.field37366,
            Items.field37367,
            Items.field37419,
            Items.field37420,
            Items.field37436,
            Items.field37437,
            Items.field37454,
            Items.field37455,
            Items.field37480,
            Items.field37481,
            Items.field37505,
            Items.field37506,
            Items.field37533,
            Items.field37534,
            Items.field37786,
            Items.field37787,
            Items.field37880,
            Items.field37881
         );
      this.method14014(ItemTags.field26122).method31560(Items.field37236, Items.field38185);
      this.method14014(ItemTags.field26123).method31560(Items.field37236, Items.field38185);
   }

   public void method14089(ITag$NamedTag<Block> var1, ITag$NamedTag<Item> var2) {
      Class6879 var5 = this.method14015(var2);
      Class6879 var6 = this.field21632.apply(var1);
      var6.method20948().forEach(var5::method20943);
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.getNamespace() + "/tags/items/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Item Tags";
   }
}
