package remapped;

import java.util.List;

public final class class_6503 {
   public static final TagRegistry<class_2340> field_33093 = TagRegistryManager.<class_2340>create(new Identifier("fluid"), ITagCollectionSupplier::method_29391);
   public static final INamedTag<class_2340> field_33094 = method_29648("water");
   public static final INamedTag<class_2340> field_33095 = method_29648("lava");

   private static INamedTag<class_2340> method_29648(String var0) {
      return field_33093.createTag(var0);
   }

   public static List<? extends INamedTag<class_2340>> method_29650() {
      return field_33093.getTags();
   }
}
