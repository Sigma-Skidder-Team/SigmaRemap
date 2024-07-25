package remapped;

public enum class_7810 implements class_1372 {
   field_39537("SPAWN_ENTITY"),
   field_39584("SPAWN_EXPERIENCE_ORB"),
   field_39616("SPAWN_GLOBAL_ENTITY"),
   field_39583("SPAWN_MOB"),
   field_39555("SPAWN_PAINTING"),
   field_39586("SPAWN_PLAYER"),
   field_39617("ENTITY_ANIMATION"),
   field_39571("STATISTICS"),
   field_39564("BLOCK_BREAK_ANIMATION"),
   field_39581("BLOCK_ENTITY_DATA"),
   field_39579("BLOCK_ACTION"),
   field_39605("BLOCK_CHANGE"),
   field_39610("BOSSBAR"),
   field_39540("SERVER_DIFFICULTY"),
   field_39539("CHAT_MESSAGE"),
   field_39547("MULTI_BLOCK_CHANGE"),
   field_39593("TAB_COMPLETE"),
   field_39542("DECLARE_COMMANDS"),
   field_39552("WINDOW_CONFIRMATION"),
   field_39607("CLOSE_WINDOW"),
   field_39536("OPEN_WINDOW"),
   field_39621("WINDOW_ITEMS"),
   field_39573("WINDOW_PROPERTY"),
   field_39538("SET_SLOT"),
   field_39611("COOLDOWN"),
   field_39596("PLUGIN_MESSAGE"),
   field_39541("NAMED_SOUND"),
   field_39592("DISCONNECT"),
   field_39587("ENTITY_STATUS"),
   field_39594("NBT_QUERY"),
   field_39559("EXPLOSION"),
   field_39577("UNLOAD_CHUNK"),
   field_39585("GAME_EVENT"),
   field_39572("KEEP_ALIVE"),
   field_39615("CHUNK_DATA"),
   field_39549("EFFECT"),
   field_39576("SPAWN_PARTICLE"),
   field_39554("JOIN_GAME"),
   field_39550("MAP_DATA"),
   field_39609("ENTITY_MOVEMENT"),
   field_39604("ENTITY_POSITION"),
   field_39602("ENTITY_POSITION_AND_ROTATION"),
   field_39598("ENTITY_ROTATION"),
   field_39566("VEHICLE_MOVE"),
   field_39589("OPEN_SIGN_EDITOR"),
   field_39563("CRAFT_RECIPE_RESPONSE"),
   field_39562("PLAYER_ABILITIES"),
   field_39534("COMBAT_EVENT"),
   field_39600("PLAYER_INFO"),
   field_39545("FACE_PLAYER"),
   field_39582("PLAYER_POSITION"),
   field_39606("USE_BED"),
   field_39567("UNLOCK_RECIPES"),
   field_39618("DESTROY_ENTITIES"),
   field_39569("REMOVE_ENTITY_EFFECT"),
   field_39619("RESOURCE_PACK"),
   field_39612("RESPAWN"),
   field_39603("ENTITY_HEAD_LOOK"),
   field_39597("SELECT_ADVANCEMENTS_TAB"),
   field_39544("WORLD_BORDER"),
   field_39561("CAMERA"),
   field_39614("HELD_ITEM_CHANGE"),
   field_39557("DISPLAY_SCOREBOARD"),
   field_39570("ENTITY_METADATA"),
   field_39578("ATTACH_ENTITY"),
   field_39560("ENTITY_VELOCITY"),
   field_39591("ENTITY_EQUIPMENT"),
   field_39568("SET_EXPERIENCE"),
   field_39546("UPDATE_HEALTH"),
   field_39558("SCOREBOARD_OBJECTIVE"),
   field_39565("SET_PASSENGERS"),
   field_39620("TEAMS"),
   field_39599("UPDATE_SCORE"),
   field_39543("SPAWN_POSITION"),
   field_39580("TIME_UPDATE"),
   field_39556("TITLE"),
   field_39601("STOP_SOUND"),
   field_39553("SOUND"),
   field_39588("TAB_LIST"),
   field_39574("COLLECT_ITEM"),
   field_39590("ENTITY_TELEPORT"),
   field_39613("ADVANCEMENTS"),
   field_39535("ENTITY_PROPERTIES"),
   field_39533("ENTITY_EFFECT"),
   field_39575("DECLARE_RECIPES"),
   field_39548("TAGS");

   public String field_39608;

   private class_7810(String var3) {
      this.field_39608 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_39608;
   }

   @Override
   public int method_31559() {
      for (int var3 = 0; var3 < values().length; var3++) {
         if (values()[var3] == this) {
            return var3;
         }
      }

      return 0;
   }
}
