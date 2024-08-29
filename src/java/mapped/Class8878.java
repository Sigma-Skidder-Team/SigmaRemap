package mapped;

import com.google.common.collect.ImmutableSet;

public class Class8878<T extends Entity> {
   private static String[] field40180;
   private final Class9283<T> field40181;
   private final Class179 field40182;
   private ImmutableSet<Block> field40183 = ImmutableSet.of();
   private boolean field40184 = true;
   private boolean field40185 = true;
   private boolean field40186;
   private boolean field40187;
   private int field40188 = 5;
   private int field40189 = 3;
   private EntitySize field40190 = EntitySize.method32101(0.6F, 1.8F);

   private Class8878(Class9283<T> var1, Class179 var2) {
      this.field40181 = var1;
      this.field40182 = var2;
      this.field40187 = var2 == Class179.field624 || var2 == Class179.field628;
   }

   public static <T extends Entity> Class8878<T> method32299(Class9283<T> var0, Class179 var1) {
      return new Class8878<T>(var0, var1);
   }

   public static <T extends Entity> Class8878<T> method32300(Class179 var0) {
      return new Class8878<T>((var0x, var1) -> null, var0);
   }

   public Class8878<T> method32301(float var1, float var2) {
      this.field40190 = EntitySize.method32101(var1, var2);
      return this;
   }

   public Class8878<T> method32302() {
      this.field40185 = false;
      return this;
   }

   public Class8878<T> method32303() {
      this.field40184 = false;
      return this;
   }

   public Class8878<T> method32304() {
      this.field40186 = true;
      return this;
   }

   public Class8878<T> method32305(Block... var1) {
      this.field40183 = ImmutableSet.copyOf(var1);
      return this;
   }

   public Class8878<T> method32306() {
      this.field40187 = true;
      return this;
   }

   public Class8878<T> method32307(int var1) {
      this.field40188 = var1;
      return this;
   }

   public Class8878<T> method32308(int var1) {
      this.field40189 = var1;
      return this;
   }

   public EntityType<T> method32309(String var1) {
      if (this.field40184) {
         Util.method38500(Class8239.field35390, var1);
      }

      return new EntityType<T>(
         this.field40181,
         this.field40182,
         this.field40184,
         this.field40185,
         this.field40186,
         this.field40187,
         this.field40183,
         this.field40190,
         this.field40188,
         this.field40189
      );
   }
}
