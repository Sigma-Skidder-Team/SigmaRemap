package remapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Set;

public class class_7188 {
   private static final Object2ObjectOpenHashMap<String, String> field_36966 = new Object2ObjectOpenHashMap(150, 1.0F);
   private static final Set<String> field_36965 = new HashSet<String>(10);

   private static void method_32933(String var0, String var1) {
      field_36966.put(var0, var1);
   }

   private static void method_32930(String var0, String var1) {
      method_32933(var0, var1);
      field_36965.add(var0);
   }

   public static String method_32929(String var0) {
      return (String)field_36966.get(var0);
   }

   public static boolean method_32932(String var0) {
      return field_36965.contains(var0);
   }

   static {
      method_32933("chat.type.achievement", "%s has just earned the achievement %s");
      method_32933("chat.type.achievement.taken", "%s has lost the achievement %s");
      method_32933("stats.tooltip.type.achievement", "Achievement");
      method_32933("stats.tooltip.type.statistic", "Statistic");
      method_32933("stat.generalButton", "General");
      method_32933("stat.blocksButton", "Blocks");
      method_32933("stat.itemsButton", "Items");
      method_32933("stat.mobsButton", "Mobs");
      method_32933("stat.used", "Times Used");
      method_32933("stat.mined", "Times Mined");
      method_32933("stat.depleted", "Times Depleted");
      method_32933("stat.crafted", "Times Crafted");
      method_32933("stat.entityKills", "You killed %s %s");
      method_32933("stat.entityKilledBy", "%s killed you %s time(s)");
      method_32933("stat.entityKills.none", "You have never killed %s");
      method_32933("stat.entityKilledBy.none", "You have never been killed by %s");
      method_32933("stat.startGame", "Times Played");
      method_32933("stat.createWorld", "Worlds Created");
      method_32933("stat.loadWorld", "Saves Loaded");
      method_32933("stat.joinMultiplayer", "Multiplayer Joins");
      method_32933("stat.leaveGame", "Games Quit");
      method_32933("stat.playOneMinute", "Minutes Played");
      method_32933("stat.timeSinceDeath", "Since Last Death");
      method_32933("stat.sneakTime", "Sneak Time");
      method_32933("stat.walkOneCm", "Distance Walked");
      method_32933("stat.crouchOneCm", "Distance Crouched");
      method_32933("stat.sprintOneCm", "Distance Sprinted");
      method_32933("stat.fallOneCm", "Distance Fallen");
      method_32933("stat.swimOneCm", "Distance Swum");
      method_32933("stat.flyOneCm", "Distance Flown");
      method_32933("stat.climbOneCm", "Distance Climbed");
      method_32933("stat.diveOneCm", "Distance Dove");
      method_32933("stat.minecartOneCm", "Distance by Minecart");
      method_32933("stat.boatOneCm", "Distance by Boat");
      method_32933("stat.pigOneCm", "Distance by Pig");
      method_32933("stat.horseOneCm", "Distance by Horse");
      method_32933("stat.aviateOneCm", "Distance by Elytra");
      method_32933("stat.jump", "Jumps");
      method_32933("stat.drop", "Items Dropped");
      method_32933("stat.dropped", "Dropped");
      method_32933("stat.pickup", "Picked Up");
      method_32933("stat.damageDealt", "Damage Dealt");
      method_32933("stat.damageTaken", "Damage Taken");
      method_32933("stat.deaths", "Number of Deaths");
      method_32933("stat.mobKills", "Mob Kills");
      method_32933("stat.animalsBred", "Animals Bred");
      method_32933("stat.playerKills", "Player Kills");
      method_32933("stat.fishCaught", "Fish Caught");
      method_32933("stat.treasureFished", "Treasure Fished");
      method_32933("stat.junkFished", "Junk Fished");
      method_32933("stat.talkedToVillager", "Talked to Villagers");
      method_32933("stat.tradedWithVillager", "Traded with Villagers");
      method_32933("stat.cakeSlicesEaten", "Cake Slices Eaten");
      method_32933("stat.cauldronFilled", "Cauldrons Filled");
      method_32933("stat.cauldronUsed", "Water Taken from Cauldron");
      method_32933("stat.armorCleaned", "Armor Pieces Cleaned");
      method_32933("stat.bannerCleaned", "Banners Cleaned");
      method_32933("stat.brewingstandInteraction", "Interactions with Brewing Stand");
      method_32933("stat.beaconInteraction", "Interactions with Beacon");
      method_32933("stat.dropperInspected", "Droppers Searched");
      method_32933("stat.hopperInspected", "Hoppers Searched");
      method_32933("stat.dispenserInspected", "Dispensers Searched");
      method_32933("stat.noteblockPlayed", "Note Blocks Played");
      method_32933("stat.noteblockTuned", "Note Blocks Tuned");
      method_32933("stat.flowerPotted", "Plants Potted");
      method_32933("stat.trappedChestTriggered", "Trapped Chests Triggered");
      method_32933("stat.enderchestOpened", "Ender Chests Opened");
      method_32933("stat.itemEnchanted", "Items Enchanted");
      method_32933("stat.recordPlayed", "Records Played");
      method_32933("stat.furnaceInteraction", "Interactions with Furnace");
      method_32933("stat.workbenchInteraction", "Interactions with Crafting Table");
      method_32933("stat.chestOpened", "Chests Opened");
      method_32933("stat.shulkerBoxOpened", "Shulker Boxes Opened");
      method_32933("stat.sleepInBed", "Times Slept in a Bed");
      method_32933("stat.mineBlock", "%1$s Mined");
      method_32933("stat.craftItem", "%1$s Crafted");
      method_32933("stat.useItem", "%1$s Used");
      method_32933("stat.breakItem", "%1$s Depleted");
      method_32933("achievement.get", "Achievement get!");
      method_32933("achievement.taken", "Taken!");
      method_32933("achievement.unknown", "???");
      method_32933("achievement.requires", "Requires '%1$s'");
      method_32933("achievement.openInventory", "Taking Inventory");
      method_32933("achievement.openInventory.desc", "Press 'E' to open your inventory");
      method_32933("achievement.mineWood", "Getting Wood");
      method_32933("achievement.mineWood.desc", "Attack a tree until a block of wood pops out");
      method_32933("achievement.buildWorkBench", "Benchmarking");
      method_32933("achievement.buildWorkBench.desc", "Craft a workbench with four blocks of planks");
      method_32933("achievement.buildPickaxe", "Time to Mine!");
      method_32933("achievement.buildPickaxe.desc", "Use planks and sticks to make a pickaxe");
      method_32933("achievement.buildFurnace", "Hot Topic");
      method_32933("achievement.buildFurnace.desc", "Construct a furnace out of eight cobblestone blocks");
      method_32933("achievement.acquireIron", "Acquire Hardware");
      method_32933("achievement.acquireIron.desc", "Smelt an iron ingot");
      method_32933("achievement.buildHoe", "Time to Farm!");
      method_32933("achievement.buildHoe.desc", "Use planks and sticks to make a hoe");
      method_32933("achievement.makeBread", "Bake Bread");
      method_32933("achievement.makeBread.desc", "Turn wheat into bread");
      method_32933("achievement.bakeCake", "The Lie");
      method_32933("achievement.bakeCake.desc", "Wheat, sugar, milk and eggs!");
      method_32933("achievement.buildBetterPickaxe", "Getting an Upgrade");
      method_32933("achievement.buildBetterPickaxe.desc", "Construct a better pickaxe");
      method_32930("achievement.overpowered", "Overpowered");
      method_32933("achievement.overpowered.desc", "Eat a Notch apple");
      method_32933("achievement.cookFish", "Delicious Fish");
      method_32933("achievement.cookFish.desc", "Catch and cook fish!");
      method_32930("achievement.onARail", "On A Rail");
      method_32933("achievement.onARail.desc", "Travel by minecart at least 1 km from where you started");
      method_32933("achievement.buildSword", "Time to Strike!");
      method_32933("achievement.buildSword.desc", "Use planks and sticks to make a sword");
      method_32933("achievement.killEnemy", "Monster Hunter");
      method_32933("achievement.killEnemy.desc", "Attack and destroy a monster");
      method_32933("achievement.killCow", "Cow Tipper");
      method_32933("achievement.killCow.desc", "Harvest some leather");
      method_32933("achievement.breedCow", "Repopulation");
      method_32933("achievement.breedCow.desc", "Breed two cows with wheat");
      method_32930("achievement.flyPig", "When Pigs Fly");
      method_32933("achievement.flyPig.desc", "Fly a pig off a cliff");
      method_32930("achievement.snipeSkeleton", "Sniper Duel");
      method_32933("achievement.snipeSkeleton.desc", "Kill a skeleton with an arrow from more than 50 meters");
      method_32933("achievement.diamonds", "DIAMONDS!");
      method_32933("achievement.diamonds.desc", "Acquire diamonds with your iron tools");
      method_32933("achievement.diamondsToYou", "Diamonds to you!");
      method_32933("achievement.diamondsToYou.desc", "Throw diamonds at another player");
      method_32933("achievement.portal", "We Need to Go Deeper");
      method_32933("achievement.portal.desc", "Build a portal to the Nether");
      method_32930("achievement.ghast", "Return to Sender");
      method_32933("achievement.ghast.desc", "Destroy a Ghast with a fireball");
      method_32933("achievement.blazeRod", "Into Fire");
      method_32933("achievement.blazeRod.desc", "Relieve a Blaze of its rod");
      method_32933("achievement.potion", "Local Brewery");
      method_32933("achievement.potion.desc", "Brew a potion");
      method_32930("achievement.theEnd", "The End?");
      method_32933("achievement.theEnd.desc", "Locate the End");
      method_32930("achievement.theEnd2", "The End.");
      method_32933("achievement.theEnd2.desc", "Defeat the Ender Dragon");
      method_32933("achievement.spawnWither", "The Beginning?");
      method_32933("achievement.spawnWither.desc", "Spawn the Wither");
      method_32933("achievement.killWither", "The Beginning.");
      method_32933("achievement.killWither.desc", "Kill the Wither");
      method_32930("achievement.fullBeacon", "Beaconator");
      method_32933("achievement.fullBeacon.desc", "Create a full beacon");
      method_32930("achievement.exploreAllBiomes", "Adventuring Time");
      method_32933("achievement.exploreAllBiomes.desc", "Discover all biomes");
      method_32933("achievement.enchantments", "Enchanter");
      method_32933("achievement.enchantments.desc", "Use a book, obsidian and diamonds to construct an enchantment table");
      method_32930("achievement.overkill", "Overkill");
      method_32933("achievement.overkill.desc", "Deal nine hearts of damage in a single hit");
      method_32933("achievement.bookcase", "Librarian");
      method_32933("achievement.bookcase.desc", "Build some bookshelves to improve your enchantment table");
   }
}
