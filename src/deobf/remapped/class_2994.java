package remapped;

import com.google.gson.JsonObject;

public interface class_2994<T extends class_8932<?>> {
   class_2994<class_644> field_14711 = method_13695("crafting_shaped", new class_3564());
   class_2994<class_3197> field_14706 = method_13695("crafting_shapeless", new class_7383());
   class_2907<class_2471> field_14717 = method_13695("crafting_special_armordye", new class_2907<class_2471>(class_2471::new));
   class_2907<class_6553> field_14723 = method_13695("crafting_special_bookcloning", new class_2907<class_6553>(class_6553::new));
   class_2907<class_6302> field_14714 = method_13695("crafting_special_mapcloning", new class_2907<class_6302>(class_6302::new));
   class_2907<class_6820> field_14710 = method_13695("crafting_special_mapextending", new class_2907<class_6820>(class_6820::new));
   class_2907<class_7347> field_14709 = method_13695("crafting_special_firework_rocket", new class_2907<class_7347>(class_7347::new));
   class_2907<class_8347> field_14713 = method_13695("crafting_special_firework_star", new class_2907<class_8347>(class_8347::new));
   class_2907<class_9069> field_14712 = method_13695("crafting_special_firework_star_fade", new class_2907<class_9069>(class_9069::new));
   class_2907<class_4514> field_14722 = method_13695("crafting_special_tippedarrow", new class_2907<class_4514>(class_4514::new));
   class_2907<class_3510> field_14724 = method_13695("crafting_special_bannerduplicate", new class_2907<class_3510>(class_3510::new));
   class_2907<class_9358> field_14715 = method_13695("crafting_special_shielddecoration", new class_2907<class_9358>(class_9358::new));
   class_2907<class_6469> field_14708 = method_13695("crafting_special_shulkerboxcoloring", new class_2907<class_6469>(class_6469::new));
   class_2907<class_220> field_14721 = method_13695("crafting_special_suspiciousstew", new class_2907<class_220>(class_220::new));
   class_2907<class_7524> field_14720 = method_13695("crafting_special_repairitem", new class_2907<class_7524>(class_7524::new));
   class_705<class_3001> field_14725 = method_13695("smelting", new class_705<class_3001>(class_3001::new, 200));
   class_705<class_1422> field_14718 = method_13695("blasting", new class_705<class_1422>(class_1422::new, 100));
   class_705<class_4317> field_14707 = method_13695("smoking", new class_705<class_4317>(class_4317::new, 100));
   class_705<class_5917> field_14716 = method_13695("campfire_cooking", new class_705<class_5917>(class_5917::new, 100));
   class_2994<class_5638> field_14726 = method_13695("stonecutting", new class_9423<class_5638>(class_5638::new));
   class_2994<class_667> field_14719 = method_13695("smithing", new class_1141());

   T method_13696(Identifier var1, JsonObject var2);

   T method_13697(Identifier var1, class_8248 var2);

   void method_13694(class_8248 var1, T var2);

   static <S extends class_2994<T>, T extends class_8932<?>> S method_13695(String var0, S var1) {
      return class_8669.<S>method_39791(class_8669.field_44414, var0, (S)var1);
   }
}
