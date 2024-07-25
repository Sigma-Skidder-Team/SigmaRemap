package remapped;

import java.util.List;

public final class class_391 {
   public static final TagRegistry<class_2451> field_1612 = TagRegistryManager.<class_2451>create(new Identifier("item"), ITagCollectionSupplier::method_29393);
   public static final INamedTag<class_2451> field_1597 = method_1892("wool");
   public static final INamedTag<class_2451> field_1605 = method_1892("planks");
   public static final INamedTag<class_2451> field_1610 = method_1892("stone_bricks");
   public static final INamedTag<class_2451> field_1609 = method_1892("wooden_buttons");
   public static final INamedTag<class_2451> field_1628 = method_1892("buttons");
   public static final INamedTag<class_2451> field_1619 = method_1892("carpets");
   public static final INamedTag<class_2451> field_1600 = method_1892("wooden_doors");
   public static final INamedTag<class_2451> field_1630 = method_1892("wooden_stairs");
   public static final INamedTag<class_2451> field_1596 = method_1892("wooden_slabs");
   public static final INamedTag<class_2451> field_1595 = method_1892("wooden_fences");
   public static final INamedTag<class_2451> field_1645 = method_1892("wooden_pressure_plates");
   public static final INamedTag<class_2451> field_1617 = method_1892("wooden_trapdoors");
   public static final INamedTag<class_2451> field_1627 = method_1892("doors");
   public static final INamedTag<class_2451> field_1631 = method_1892("saplings");
   public static final INamedTag<class_2451> field_1622 = method_1892("logs_that_burn");
   public static final INamedTag<class_2451> field_1638 = method_1892("logs");
   public static final INamedTag<class_2451> field_1601 = method_1892("dark_oak_logs");
   public static final INamedTag<class_2451> field_1646 = method_1892("oak_logs");
   public static final INamedTag<class_2451> field_1641 = method_1892("birch_logs");
   public static final INamedTag<class_2451> field_1629 = method_1892("acacia_logs");
   public static final INamedTag<class_2451> field_1647 = method_1892("jungle_logs");
   public static final INamedTag<class_2451> field_1592 = method_1892("spruce_logs");
   public static final INamedTag<class_2451> field_1625 = method_1892("crimson_stems");
   public static final INamedTag<class_2451> field_1616 = method_1892("warped_stems");
   public static final INamedTag<class_2451> field_1604 = method_1892("banners");
   public static final INamedTag<class_2451> field_1633 = method_1892("sand");
   public static final INamedTag<class_2451> field_1618 = method_1892("stairs");
   public static final INamedTag<class_2451> field_1606 = method_1892("slabs");
   public static final INamedTag<class_2451> field_1636 = method_1892("walls");
   public static final INamedTag<class_2451> field_1624 = method_1892("anvil");
   public static final INamedTag<class_2451> field_1621 = method_1892("rails");
   public static final INamedTag<class_2451> field_1632 = method_1892("leaves");
   public static final INamedTag<class_2451> field_1626 = method_1892("trapdoors");
   public static final INamedTag<class_2451> field_1644 = method_1892("small_flowers");
   public static final INamedTag<class_2451> field_1637 = method_1892("beds");
   public static final INamedTag<class_2451> field_1593 = method_1892("fences");
   public static final INamedTag<class_2451> field_1599 = method_1892("tall_flowers");
   public static final INamedTag<class_2451> field_1607 = method_1892("flowers");
   public static final INamedTag<class_2451> field_1598 = method_1892("piglin_repellents");
   public static final INamedTag<class_2451> field_1643 = method_1892("piglin_loved");
   public static final INamedTag<class_2451> field_1635 = method_1892("gold_ores");
   public static final INamedTag<class_2451> field_1639 = method_1892("non_flammable_wood");
   public static final INamedTag<class_2451> field_1602 = method_1892("soul_fire_base_blocks");
   public static final INamedTag<class_2451> field_1634 = method_1892("boats");
   public static final INamedTag<class_2451> field_1613 = method_1892("fishes");
   public static final INamedTag<class_2451> field_1640 = method_1892("signs");
   public static final INamedTag<class_2451> field_1603 = method_1892("music_discs");
   public static final INamedTag<class_2451> field_1615 = method_1892("creeper_drop_music_discs");
   public static final INamedTag<class_2451> field_1642 = method_1892("coals");
   public static final INamedTag<class_2451> field_1594 = method_1892("arrows");
   public static final INamedTag<class_2451> field_1614 = method_1892("lectern_books");
   public static final INamedTag<class_2451> field_1611 = method_1892("beacon_payment_items");
   public static final INamedTag<class_2451> field_1623 = method_1892("stone_tool_materials");
   public static final INamedTag<class_2451> field_1620 = method_1892("stone_crafting_materials");

   private static INamedTag<class_2451> method_1892(String var0) {
      return field_1612.createTag(var0);
   }

   public static ITagCollection<class_2451> method_1891() {
      return field_1612.getCollection();
   }

   public static List<? extends INamedTag<class_2451>> method_1890() {
      return field_1612.getTags();
   }
}
