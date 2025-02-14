package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Set;

public class Class9139 {
   private static final Object2ObjectOpenHashMap<String, String> field41993 = new Object2ObjectOpenHashMap(150, 1.0F);
   private static final Set<String> field41994 = new HashSet<String>(10);

   private static void method34118(String var0, String var1) {
      field41993.put(var0, var1);
   }

   private static void method34119(String var0, String var1) {
      method34118(var0, var1);
      field41994.add(var0);
   }

   public static String method34120(String var0) {
      return (String)field41993.get(var0);
   }

   public static boolean method34121(String var0) {
      return field41994.contains(var0);
   }

   static {
      method34118("chat.type.achievement", "%s has just earned the achievement %s");
      method34118("chat.type.achievement.taken", "%s has lost the achievement %s");
      method34118("stats.tooltip.type.achievement", "Achievement");
      method34118("stats.tooltip.type.statistic", "Statistic");
      method34118("stat.generalButton", "General");
      method34118("stat.blocksButton", "Blocks");
      method34118("stat.itemsButton", "Items");
      method34118("stat.mobsButton", "Mobs");
      method34118("stat.used", "Times Used");
      method34118("stat.mined", "Times Mined");
      method34118("stat.depleted", "Times Depleted");
      method34118("stat.crafted", "Times Crafted");
      method34118("stat.entityKills", "You killed %s %s");
      method34118("stat.entityKilledBy", "%s killed you %s time(s)");
      method34118("stat.entityKills.none", "You have never killed %s");
      method34118("stat.entityKilledBy.none", "You have never been killed by %s");
      method34118("stat.startGame", "Times Played");
      method34118("stat.createWorld", "Worlds Created");
      method34118("stat.loadWorld", "Saves Loaded");
      method34118("stat.joinMultiplayer", "Multiplayer Joins");
      method34118("stat.leaveGame", "Games Quit");
      method34118("stat.playOneMinute", "Minutes Played");
      method34118("stat.timeSinceDeath", "Since Last Death");
      method34118("stat.sneakTime", "Sneak Time");
      method34118("stat.walkOneCm", "Distance Walked");
      method34118("stat.crouchOneCm", "Distance Crouched");
      method34118("stat.sprintOneCm", "Distance Sprinted");
      method34118("stat.fallOneCm", "Distance Fallen");
      method34118("stat.swimOneCm", "Distance Swum");
      method34118("stat.flyOneCm", "Distance Flown");
      method34118("stat.climbOneCm", "Distance Climbed");
      method34118("stat.diveOneCm", "Distance Dove");
      method34118("stat.minecartOneCm", "Distance by Minecart");
      method34118("stat.boatOneCm", "Distance by Boat");
      method34118("stat.pigOneCm", "Distance by Pig");
      method34118("stat.horseOneCm", "Distance by Horse");
      method34118("stat.aviateOneCm", "Distance by Elytra");
      method34118("stat.jump", "Jumps");
      method34118("stat.drop", "Items Dropped");
      method34118("stat.dropped", "Dropped");
      method34118("stat.pickup", "Picked Up");
      method34118("stat.damageDealt", "Damage Dealt");
      method34118("stat.damageTaken", "Damage Taken");
      method34118("stat.deaths", "Number of Deaths");
      method34118("stat.mobKills", "Mob Kills");
      method34118("stat.animalsBred", "Animals Bred");
      method34118("stat.playerKills", "Player Kills");
      method34118("stat.fishCaught", "Fish Caught");
      method34118("stat.treasureFished", "Treasure Fished");
      method34118("stat.junkFished", "Junk Fished");
      method34118("stat.talkedToVillager", "Talked to Villagers");
      method34118("stat.tradedWithVillager", "Traded with Villagers");
      method34118("stat.cakeSlicesEaten", "Cake Slices Eaten");
      method34118("stat.cauldronFilled", "Cauldrons Filled");
      method34118("stat.cauldronUsed", "Water Taken from Cauldron");
      method34118("stat.armorCleaned", "Armor Pieces Cleaned");
      method34118("stat.bannerCleaned", "Banners Cleaned");
      method34118("stat.brewingstandInteraction", "Interactions with Brewing Stand");
      method34118("stat.beaconInteraction", "Interactions with Beacon");
      method34118("stat.dropperInspected", "Droppers Searched");
      method34118("stat.hopperInspected", "Hoppers Searched");
      method34118("stat.dispenserInspected", "Dispensers Searched");
      method34118("stat.noteblockPlayed", "Note Blocks Played");
      method34118("stat.noteblockTuned", "Note Blocks Tuned");
      method34118("stat.flowerPotted", "Plants Potted");
      method34118("stat.trappedChestTriggered", "Trapped Chests Triggered");
      method34118("stat.enderchestOpened", "Ender Chests Opened");
      method34118("stat.itemEnchanted", "Items Enchanted");
      method34118("stat.recordPlayed", "Records Played");
      method34118("stat.furnaceInteraction", "Interactions with Furnace");
      method34118("stat.workbenchInteraction", "Interactions with Crafting Table");
      method34118("stat.chestOpened", "Chests Opened");
      method34118("stat.shulkerBoxOpened", "Shulker Boxes Opened");
      method34118("stat.sleepInBed", "Times Slept in a Bed");
      method34118("stat.mineBlock", "%1$s Mined");
      method34118("stat.craftItem", "%1$s Crafted");
      method34118("stat.useItem", "%1$s Used");
      method34118("stat.breakItem", "%1$s Depleted");
      method34118("achievement.get", "Achievement get!");
      method34118("achievement.taken", "Taken!");
      method34118("achievement.unknown", "???");
      method34118("achievement.requires", "Requires '%1$s'");
      method34118("achievement.openInventory", "Taking Inventory");
      method34118("achievement.openInventory.desc", "Press 'E' to open your inventory");
      method34118("achievement.mineWood", "Getting Wood");
      method34118("achievement.mineWood.desc", "Attack a tree until a block of wood pops out");
      method34118("achievement.buildWorkBench", "Benchmarking");
      method34118("achievement.buildWorkBench.desc", "Craft a workbench with four blocks of planks");
      method34118("achievement.buildPickaxe", "Time to Mine!");
      method34118("achievement.buildPickaxe.desc", "Use planks and sticks to make a pickaxe");
      method34118("achievement.buildFurnace", "Hot Topic");
      method34118("achievement.buildFurnace.desc", "Construct a furnace out of eight cobblestone blocks");
      method34118("achievement.acquireIron", "Acquire Hardware");
      method34118("achievement.acquireIron.desc", "Smelt an iron ingot");
      method34118("achievement.buildHoe", "Time to Farm!");
      method34118("achievement.buildHoe.desc", "Use planks and sticks to make a hoe");
      method34118("achievement.makeBread", "Bake Bread");
      method34118("achievement.makeBread.desc", "Turn wheat into bread");
      method34118("achievement.bakeCake", "The Lie");
      method34118("achievement.bakeCake.desc", "Wheat, sugar, milk and eggs!");
      method34118("achievement.buildBetterPickaxe", "Getting an Upgrade");
      method34118("achievement.buildBetterPickaxe.desc", "Construct a better pickaxe");
      method34119("achievement.overpowered", "Overpowered");
      method34118("achievement.overpowered.desc", "Eat a Notch apple");
      method34118("achievement.cookFish", "Delicious Fish");
      method34118("achievement.cookFish.desc", "Catch and cook fish!");
      method34119("achievement.onARail", "On A Rail");
      method34118("achievement.onARail.desc", "Travel by minecart at least 1 km from where you started");
      method34118("achievement.buildSword", "Time to Strike!");
      method34118("achievement.buildSword.desc", "Use planks and sticks to make a sword");
      method34118("achievement.killEnemy", "Monster Hunter");
      method34118("achievement.killEnemy.desc", "Attack and destroy a monster");
      method34118("achievement.killCow", "Cow Tipper");
      method34118("achievement.killCow.desc", "Harvest some leather");
      method34118("achievement.breedCow", "Repopulation");
      method34118("achievement.breedCow.desc", "Breed two cows with wheat");
      method34119("achievement.flyPig", "When Pigs Fly");
      method34118("achievement.flyPig.desc", "Fly a pig off a cliff");
      method34119("achievement.snipeSkeleton", "Sniper Duel");
      method34118("achievement.snipeSkeleton.desc", "Kill a skeleton with an arrow from more than 50 meters");
      method34118("achievement.diamonds", "DIAMONDS!");
      method34118("achievement.diamonds.desc", "Acquire diamonds with your iron tools");
      method34118("achievement.diamondsToYou", "Diamonds to you!");
      method34118("achievement.diamondsToYou.desc", "Throw diamonds at another player");
      method34118("achievement.portal", "We Need to Go Deeper");
      method34118("achievement.portal.desc", "Build a portal to the Nether");
      method34119("achievement.ghast", "Return to Sender");
      method34118("achievement.ghast.desc", "Destroy a Ghast with a fireball");
      method34118("achievement.blazeRod", "Into Fire");
      method34118("achievement.blazeRod.desc", "Relieve a Blaze of its rod");
      method34118("achievement.potion", "Local Brewery");
      method34118("achievement.potion.desc", "Brew a potion");
      method34119("achievement.theEnd", "The End?");
      method34118("achievement.theEnd.desc", "Locate the End");
      method34119("achievement.theEnd2", "The End.");
      method34118("achievement.theEnd2.desc", "Defeat the Ender Dragon");
      method34118("achievement.spawnWither", "The Beginning?");
      method34118("achievement.spawnWither.desc", "Spawn the Wither");
      method34118("achievement.killWither", "The Beginning.");
      method34118("achievement.killWither.desc", "Kill the Wither");
      method34119("achievement.fullBeacon", "Beaconator");
      method34118("achievement.fullBeacon.desc", "Create a full beacon");
      method34119("achievement.exploreAllBiomes", "Adventuring Time");
      method34118("achievement.exploreAllBiomes.desc", "Discover all biomes");
      method34118("achievement.enchantments", "Enchanter");
      method34118("achievement.enchantments.desc", "Use a book, obsidian and diamonds to construct an enchantment table");
      method34119("achievement.overkill", "Overkill");
      method34118("achievement.overkill.desc", "Deal nine hearts of damage in a single hit");
      method34118("achievement.bookcase", "Librarian");
      method34118("achievement.bookcase.desc", "Build some bookshelves to improve your enchantment table");
   }
}
