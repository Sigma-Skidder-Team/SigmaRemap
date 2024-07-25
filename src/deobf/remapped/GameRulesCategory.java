package remapped;

public enum GameRulesCategory {
   PLAYER("gamerule.category.player"),
   MOBS("gamerule.category.mobs"),
   SPAWNING("gamerule.category.spawning"),
   DROPS("gamerule.category.drops"),
   UPDATES("gamerule.category.updates"),
   CHAT("gamerule.category.chat"),
   MISC("gamerule.category.misc");

   private final String field_41459;

   private GameRulesCategory(String var3) {
      this.field_41459 = var3;
   }

   public String method_36744() {
      return this.field_41459;
   }
}
