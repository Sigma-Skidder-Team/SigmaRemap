package remapped;

public interface ITagCollectionSupplier {
   ITagCollectionSupplier field_32865 = method_29388(
      ITagCollection.<class_6414>method_43146(),
      ITagCollection.<class_2451>method_43146(),
      ITagCollection.<class_2340>method_43146(),
      ITagCollection.<EntityType<?>>method_43146()
   );

   ITagCollection<class_6414> method_29392();

   ITagCollection<class_2451> method_29393();

   ITagCollection<class_2340> method_29391();

   ITagCollection<EntityType<?>> getEntityTypeTags();

   default void method_29395() {
      TagRegistryManager.method_20598(this);
      class_4783.method_22068();
   }

   default void method_29394(class_8248 var1) {
      this.method_29392().method_43139(var1, class_8669.field_44462);
      this.method_29393().method_43139(var1, class_8669.field_44382);
      this.method_29391().method_43139(var1, class_8669.field_44447);
      this.getEntityTypeTags().method_43139(var1, class_8669.field_44400);
   }

   static ITagCollectionSupplier method_29390(class_8248 var0) {
      ITagCollection var3 = ITagCollection.<class_6414>method_43142(var0, class_8669.field_44462);
      ITagCollection var4 = ITagCollection.<class_2451>method_43142(var0, class_8669.field_44382);
      ITagCollection var5 = ITagCollection.<class_2340>method_43142(var0, class_8669.field_44447);
      ITagCollection var6 = ITagCollection.<EntityType<?>>method_43142(var0, class_8669.field_44400);
      return method_29388(var3, var4, var5, var6);
   }

   static ITagCollectionSupplier method_29388(ITagCollection<class_6414> var0, ITagCollection<class_2451> var1, ITagCollection<class_2340> var2, ITagCollection<EntityType<?>> var3) {
      return new class_7497(var0, var1, var2, var3);
   }
}
