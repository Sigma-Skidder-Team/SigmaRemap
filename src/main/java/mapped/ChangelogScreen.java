package mapped;

import com.mentalfrostbyte.Client;
import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.ClientColors;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;

public class ChangelogScreen extends CustomGuiScreen {
   public Animation animation = new Animation(380, 200, Animation.Direction.BACKWARDS);
   public Class4339 field21184;
   private static JSONArray cachedChangelog;

   public ChangelogScreen(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      this.field21184 = new Class4339(this, "scroll", 100, 200, var5 - 200, var6 - 200);
      this.field21184.method13518(true);
      this.method13233(this.field21184);
      new Thread(() -> this.method13490(this.getChangelog())).start();
   }

   public void method13490(JSONArray var1) {
      if (var1 != null) {
         this.getScreen().runThisOnDimensionUpdate(new Class576(this, var1));
      }
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      super.updatePanelDimensions(newHeight, newWidth);
      if (this.field21184 != null) {
         if (this.isHovered() && this.isVisible()) {
            for (CustomGuiScreen var9 : this.field21184.getButton().method13241()) {
               Class4330 var10 = (Class4330) var9;
               var10.animation2.changeDirection(Animation.Direction.FORWARDS);
               if ((double) var10.animation2.calcPercent() < 0.5) {
                  break;
               }
            }
         } else {
            for (CustomGuiScreen var6 : this.field21184.getButton().method13241()) {
               Class4330 var7 = (Class4330) var6;
               var7.animation2.changeDirection(Animation.Direction.BACKWARDS);
            }
         }
      }
   }

   @Override
   public void draw(float partialTicks) {
      this.animation.changeDirection(!this.isHovered() ? Animation.Direction.BACKWARDS : Animation.Direction.FORWARDS);
      partialTicks *= this.animation.calcPercent();

      float fadeFactor = MathUtils.lerp(this.animation.calcPercent(), 0.17f, 1.0f, 0.51f, 1.0f);

      if (this.animation.getDirection() == Animation.Direction.BACKWARDS) {
         fadeFactor = 1.0f;
      }

      this.drawBackground((int) (150.0f * (1.0f - fadeFactor)));
      this.method13225();
      RenderUtil.drawString(ResourceRegistry.JelloLightFont36, 100.0F, 100.0F, "Changelog",
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), partialTicks));
      TrueTypeFont jelloLightFont25 = ResourceRegistry.JelloLightFont25;
      String versionText = "You're currently using Sigma " + Client.VERSION;
      RenderUtil.drawString(
            jelloLightFont25,
            100.0f, 150.0f,
            versionText,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.6f * partialTicks));
      super.draw(partialTicks);
   }

   public JSONArray getChangelog() {
      if (cachedChangelog != null) {
         return cachedChangelog;
      } else {
         String jsonString = getChanges();
         try {
            cachedChangelog = new JSONArray(jsonString);
         } catch (JSONException e) {
            throw new RuntimeException(e);
         }
         return cachedChangelog;
      }
   }

   private String getChanges() {
      return "[\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 15 (1.16.4) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added AI FightBot module\",\n" +
            "            \"Added JelloAIBot module\",\n" +
            "            \"Added StaffRepealer for hypixel\",\n" +
            "            \"Added back VClip module\",\n" +
            "            \"Added HitSounds module (unfinished)\",\n" +
            "            \"Added NoServerInfo module that hides scoreboard (broken)\",\n" +
            "            \"Added Murderer module to detect the murderer in mm\",\n" +
            "            \"Added Streaming module to hide yourself when streaming\",\n" +
            "            \"Added JelloEdit for schematics\",\n" +
            "            \"Added AutoClicker module\",\n" +
            "            \"Added back Dumper module to dump server commands & plugins\",\n" +
            "            \"Added back Skeleton ESP to ESP (broken)\",\n" +
            "            \"Added back Minemen AntiKnockBack\",\n" +
            "            \"Added back Cubecraft & Cubecraft2 fly\",\n" +
            "            \"Added back Mineplex HighJump (got patched on b2)\",\n" +
            "            \"Added back Viper Disabler\",\n" +
            "            \"Added back VeltPvP Disabler\",\n" +
            "            \"Added back Minemen Criticals\",\n" +
            "            \"Added back NickNameDetector that detects custom nicks (untested)\",\n" +
            "            \"Added back Legit WTap\",\n" +
            "            \"Added back AGC Fly\",\n" +
            "            \"Added back TargetHUD module (unfinished)\",\n" +
            "            \"Added back Info HUD module that shows stuff about the player\",\n" +
            "            \"Added back PacketDumper module\",\n" +
            "            \"Added back DebugSpeed module to debug the player speed\",\n" +
            "            \"Added back AutoMiner module\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 14 (1.16.4) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added New Cubecraft Fly\",\n" +
            "            \"Added Bypass mode to Hypixel Fly\",\n" +
            "            \"Added New Hypixel BlockFly\",\n" +
            "            \"Added Hypixel Packet Criticals\",\n" +
            "            \"Added New bypassing Hypixel Fast Fly\",\n" +
            "            \"Added AutoTool Inv option\",\n" +
            "            \"Improved Cubecraft2 Fly (Up & Down for 1.9+ users)\",\n" +
            "            \"Improved NCP Step Added vanilla phase\",\n" +
            "            \"Improved spiders & phases\",\n" +
            "            \"Renamed Cubecraft Tower to 'Vanilla' (no longer bypasses)\",\n" +
            "            \"Fixed Nameprotect rendering\",\n" +
            "            \"Fixed an Optifine bug which prevents blocks from rendering\",\n" +
            "            \"Fixed Music Player\",\n" +
            "            \"Fixed AltManager skins\",\n" +
            "            \"Removed Cubecraft speed mode from BlockFly (no longer bypasses)\",\n" +
            "            \"Removed Old Hypixel fastfly\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 13 (1.16.1) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added Animals & Monsters option to KillAura\",\n" +
            "            \"Added Aura option to AAC4 Criticals\",\n" +
            "            \"Added Redesky longjump\",\n" +
            "            \"Fixed bugs\",\n" +
            "            \"Updated Redesky config\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 12 (1.16.1) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Fixed bugs\",\n" +
            "            \"Fixed XRay\",\n" +
            "            \"Fixed baninfo for minemen\",\n" +
            "            \"Added Optifine\",\n" +
            "            \"Added Gomme Spider Step\",\n" +
            "            \"Added Auto Disable option to ClickTP\",\n" +
            "            \"Added silent option to KillAura\",\n" +
            "            \"Improved pingspoof disabler\",\n" +
            "            \"Improved gommeSpeed\",\n" +
            "            \"Improved Jump Spider\",\n" +
            "            \"Improved KillAura (raytrace & reach)\",\n" +
            "            \"Removed Shaders\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 10/11 (1.16.1) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Fixed Music Player\",\n" +
            "            \"Fixed FakeForge\",\n" +
            "            \"Fixed a Jello Portal Issue\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 9 (1.16.1) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added the best exit button ever\",\n" +
            "            \"Added speed option to BoatFly\",\n" +
            "            \"Added an option to hide date & server from hypixel scoreboard in GamePlay\",\n" +
            "            \"Added Hypixel2 NoFall\",\n" +
            "            \"Added InvBypass for null & pingspoof disabler\",\n" +
            "            \"Added LockView KillAura rotation\",\n" +
            "            \"Added NCP Step Timer\",\n" +
            "            \"Added Friend Accept in Hypixel GamePlay\",\n" +
            "            \"Added TargetStrafe void option\",\n" +
            "            \"Improved TargetStrafe\",\n" +
            "            \"Improved Vanilla Fly Speed\",\n" +
            "            \"Improved Hypixel speed\",\n" +
            "            \"Improved Omegacraft Fly\",\n" +
            "            \"Fixed Spartan Fly\",\n" +
            "            \"Fixed Realms & Alt Manager compatibility\",\n" +
            "            \"Fixed a Jello Portal crash issue\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 8 (1.16.1) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Updated to 1.16.1\",\n" +
            "            \"Fixed bugs\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 7 (1.16) Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Updated to 1.16\",\n" +
            "            \"Removed Optifine\",\n" +
            "            \"Added Ancient Debris to Xray\",\n" +
            "            \"Fixed Music Player Bugs\",\n" +
            "            \"Fixed Music Player Spectrum getting darker\",\n" +
            "            \"Fixed Invisible block glitches\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 6 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Improved Client inner workings\",\n" +
            "            \"Improved Jello Maps terrain scanning\",\n" +
            "            \"Added FPSBooster\",\n" +
            "            \"Added shader support\",\n" +
            "            \"Added Basic Realms support\",\n" +
            "            \"Added Legit Nofall (Suggested by u/Cweepaw on Reddit)\",\n" +
            "            \"Added Vanilla ESP back\",\n" +
            "            \"Added Elytra Equipping to AutoArmor\",\n" +
            "            \"Added Hypixel High Longjump mode\",\n" +
            "            \"Added New Classic/Jello Switch GUI\",\n" +
            "            \"Added Weird 'Ninja' AutoBlock Animation\",\n" +
            "            \"Fixed Cords not hiding in F3/F1\",\n" +
            "            \"Fixed Music Player Skipping\",\n" +
            "            \"Fixed Music Player Windows Issues\",\n" +
            "            \"Fixed Hypixel Flies (Special thanks to Pepa_Pig58 and Carlos)\",\n" +
            "            \"Fixed Hypixel AutoL\",\n" +
            "            \"Fixed a Main Menu GUI memory leak\",\n" +
            "            \"Fixed a Jello Portal memory leak\",\n" +
            "            \"Fixed a Texture leak\",\n" +
            "            \"Removed AGC Fly (Patched)\",\n" +
            "            \"Updated Optifine\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 5 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added Ninja & Random TargetStrafe\",\n" +
            "            \"Added Cubecraft2 fly (up & down)\",\n" +
            "            \"Added Egg to Nuker\",\n" +
            "            \"Added Jartex Gameplay Mods\",\n" +
            "            \"Added Pingspoof option to TP Disabler\",\n" +
            "            \"Added FakeLag\",\n" +
            "            \"Added Ghostly Disabler\",\n" +
            "            \"Added Advanced AutoSoup\",\n" +
            "            \"Added Spartan Fly Ground Spoof Option\",\n" +
            "            \"Added Delay to Speed Autopot\",\n" +
            "            \"Made PingSpoof go up to 10k Ping\",\n" +
            "            \"Fixed KillAura Raytrace\",\n" +
            "            \"Fixed Nametags Issues\",\n" +
            "            \"Fixed Minor MusicPlayer Issues\",\n" +
            "            \"Fixed ChangeLog Spacing\",\n" +
            "            \"Improved Hypixel Gameplay\",\n" +
            "            \"Improved ChestStealer Aura\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 4 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Added Mineplex Fly\",\n" +
            "            \"Added Vanilla Fly Kick Bypass\",\n" +
            "            \"Added Music Player Repeat Options\",\n" +
            "            \"Added Rollback NoteBlockPlayer Music\",\n" +
            "            \"Improved Hypixel Speed\",\n" +
            "            \"Fixed Cubecraft Gameplay\",\n" +
            "            \"Fixed Funcraft Gameplay\",\n" +
            "            \"Fixed Hypixel BlockFly\",\n" +
            "            \"Fixed a Pasting issue\",\n" +
            "            \"Fixed Ban Info for spanish servers\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 3 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Fixed minimap memory leaks\",\n" +
            "            \"Fixed Hypixel BlockFly (New mode)\",\n" +
            "            \"Fixed Hypixel Fly\",\n" +
            "            \"Fixed Hypixel HighJump\",\n" +
            "            \"Fixed Hypixel LongJump with Nofall\",\n" +
            "            \"Fixed Hypixel AntiVoid\",\n" +
            "            \"Fixed Hypixel Speed without Auto Jump\",\n" +
            "            \"Fixed sword managing for 1.8\",\n" +
            "            \"Fixed Explosion crashes\",\n" +
            "            \"Fixed some issues with the music player\",\n" +
            "            \"Updated Optifine (pre13)\",\n" +
            "            \"Fixed 1.8 movement\",\n" +
            "            \"Fixed 1.9 - 1.12 swim mechanics\",\n" +
            "            \"Added old AAC Speed (HiiveMC)\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Beta 2 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"Fixed Hypixel Nofall\",\n" +
            "            \"Added Angle BowAimbot sort mode\",\n" +
            "            \"Added fight option with autopot\",\n" +
            "            \"Added blockfly slow speed\",\n" +
            "            \"Added Discord RPC\",\n" +
            "            \"Removed Mineplex Highjump (patched)\",\n" +
            "            \"Removed agc autoblock (patched?)\",\n" +
            "            \"Fixed explosions with antikb\",\n" +
            "            \"Improved AntiVoid for hypixel\",\n" +
            "            \"Optimisations...\"\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"5.0.0 Update\",\n" +
            "        \"changes\": [\n" +
            "            \"[Error] Cannot render changelog: More than 1000 changes are trying to be displayed at the same time. Are the developers insane ?\"\n"
            +
            "        ]\n" +
            "    }\n" +
            "]";
   }

}
