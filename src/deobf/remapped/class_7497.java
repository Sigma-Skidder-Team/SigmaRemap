package remapped;

public final class class_7497 implements ITagCollectionSupplier {
   private static String[] field_38248;

   public class_7497(ITagCollection var1, ITagCollection var2, ITagCollection var3, ITagCollection var4) {
      this.field_38249 = var1;
      this.field_38250 = var2;
      this.field_38247 = var3;
      this.field_38251 = var4;
   }

   @Override
   public ITagCollection<class_6414> method_29392() {
      return this.field_38249;
   }

   @Override
   public ITagCollection<class_2451> method_29393() {
      return this.field_38250;
   }

   @Override
   public ITagCollection<class_2340> method_29391() {
      return this.field_38247;
   }

   @Override
   public ITagCollection<EntityType<?>> getEntityTypeTags() {
      return this.field_38251;
   }
}
