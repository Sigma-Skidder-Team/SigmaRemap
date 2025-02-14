package mapped;

public class EntitySpawnPlacementRegistry$Entry {
   private final Heightmap.Type type;
   private final EntitySpawnPlacementRegistry$PlacementType placementType;
   private final EntitySpawnPlacementRegistry$IPlacementPredicate<?> placementPredicate;

   public EntitySpawnPlacementRegistry$Entry(Heightmap.Type type, EntitySpawnPlacementRegistry$PlacementType placementType, EntitySpawnPlacementRegistry$IPlacementPredicate<?> placementPredicate) {
      this.type = type;
      this.placementType = placementType;
      this.placementPredicate = placementPredicate;
   }

   public static EntitySpawnPlacementRegistry$PlacementType getPlacementType(EntitySpawnPlacementRegistry$Entry of) {
      return of.placementType;
   }

   public static Heightmap.Type getType(EntitySpawnPlacementRegistry$Entry of) {
      return of.type;
   }

   public static EntitySpawnPlacementRegistry$IPlacementPredicate getPlacementPredicate(EntitySpawnPlacementRegistry$Entry of) {
      return of.placementPredicate;
   }
}
