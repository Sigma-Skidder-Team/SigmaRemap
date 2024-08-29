package mapped;

public class Class9525 {
   public static final Class9821<Entity> field44330 = method36807("this_entity");
   public static final Class9821<PlayerEntity> field44331 = method36807("last_damage_player");
   public static final Class9821<Class8654> field44332 = method36807("damage_source");
   public static final Class9821<Entity> field44333 = method36807("killer_entity");
   public static final Class9821<Entity> field44334 = method36807("direct_killer_entity");
   public static final Class9821<Vector3d> field44335 = method36807("origin");
   public static final Class9821<BlockState> field44336 = method36807("block_state");
   public static final Class9821<TileEntity> field44337 = method36807("block_entity");
   public static final Class9821<ItemStack> field44338 = method36807("tool");
   public static final Class9821<Float> field44339 = method36807("explosion_radius");

   private static <T> Class9821<T> method36807(String var0) {
      return new Class9821<T>(new ResourceLocation(var0));
   }
}
