package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6629<T extends class_8145> {
   private static final Logger field_34287 = LogManager.getLogger();
   public static final class_6629<class_4478> field_34279 = method_30457(
      "area_effect_cloud",
      class_6238.<class_4478>method_28492(class_4478::new, class_4565.field_22251)
         .method_28490()
         .method_28489(6.0F, 0.5F)
         .method_28499(10)
         .method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_9399> field_34289 = method_30457(
      "armor_stand", class_6238.<class_9399>method_28492(class_9399::new, class_4565.field_22251).method_28489(0.5F, 1.975F).method_28499(10)
   );
   public static final class_6629<class_581> field_34290 = method_30457(
      "arrow", class_6238.<class_581>method_28492(class_581::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(4).method_28500(20)
   );
   public static final class_6629<class_2022> field_34217 = method_30457(
      "bat", class_6238.<class_2022>method_28492(class_2022::new, class_4565.field_22240).method_28489(0.5F, 0.9F).method_28499(5)
   );
   public static final class_6629<class_8829> field_34238 = method_30457(
      "bee", class_6238.<class_8829>method_28492(class_8829::new, class_4565.field_22239).method_28489(0.7F, 0.6F).method_28499(8)
   );
   public static final class_6629<class_2806> field_34301 = method_30457(
      "blaze", class_6238.<class_2806>method_28492(class_2806::new, class_4565.field_22247).method_28490().method_28489(0.6F, 1.8F).method_28499(8)
   );
   public static final class_6629<class_9149> field_34330 = method_30457(
      "boat", class_6238.<class_9149>method_28492(class_9149::new, class_4565.field_22251).method_28489(1.375F, 0.5625F).method_28499(10)
   );
   public static final class_6629<class_5583> field_34249 = method_30457(
      "cat", class_6238.<class_5583>method_28492(class_5583::new, class_4565.field_22239).method_28489(0.6F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_8032> field_34272 = method_30457(
      "cave_spider", class_6238.<class_8032>method_28492(class_8032::new, class_4565.field_22247).method_28489(0.7F, 0.5F).method_28499(8)
   );
   public static final class_6629<class_3024> field_34263 = method_30457(
      "chicken", class_6238.<class_3024>method_28492(class_3024::new, class_4565.field_22239).method_28489(0.4F, 0.7F).method_28499(10)
   );
   public static final class_6629<class_105> field_34262 = method_30457(
      "cod", class_6238.<class_105>method_28492(class_105::new, class_4565.field_22248).method_28489(0.5F, 0.3F).method_28499(4)
   );
   public static final class_6629<class_2803> field_34325 = method_30457(
      "cow", class_6238.<class_2803>method_28492(class_2803::new, class_4565.field_22239).method_28489(0.9F, 1.4F).method_28499(10)
   );
   public static final class_6629<class_9490> field_34210 = method_30457(
      "creeper", class_6238.<class_9490>method_28492(class_9490::new, class_4565.field_22247).method_28489(0.6F, 1.7F).method_28499(8)
   );
   public static final class_6629<class_449> field_34320 = method_30457(
      "dolphin", class_6238.<class_449>method_28492(class_449::new, class_4565.field_22250).method_28489(0.9F, 0.6F)
   );
   public static final class_6629<class_141> field_34248 = method_30457(
      "donkey", class_6238.<class_141>method_28492(class_141::new, class_4565.field_22239).method_28489(1.3964844F, 1.5F).method_28499(10)
   );
   public static final class_6629<class_2844> field_34267 = method_30457(
      "dragon_fireball", class_6238.<class_2844>method_28492(class_2844::new, class_4565.field_22251).method_28489(1.0F, 1.0F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_4359> field_34211 = method_30457(
      "drowned", class_6238.<class_4359>method_28492(class_4359::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_4965> field_34324 = method_30457(
      "elder_guardian", class_6238.<class_4965>method_28492(class_4965::new, class_4565.field_22247).method_28489(1.9975F, 1.9975F).method_28499(10)
   );
   public static final class_6629<class_3577> field_34273 = method_30457(
      "end_crystal",
      class_6238.<class_3577>method_28492(class_3577::new, class_4565.field_22251).method_28489(2.0F, 2.0F).method_28499(16).method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_2770> field_34310 = method_30457(
      "ender_dragon", class_6238.<class_2770>method_28492(class_2770::new, class_4565.field_22247).method_28490().method_28489(16.0F, 8.0F).method_28499(10)
   );
   public static final class_6629<class_912> field_34308 = method_30457(
      "enderman", class_6238.<class_912>method_28492(class_912::new, class_4565.field_22247).method_28489(0.6F, 2.9F).method_28499(8)
   );
   public static final class_6629<class_2667> field_34264 = method_30457(
      "endermite", class_6238.<class_2667>method_28492(class_2667::new, class_4565.field_22247).method_28489(0.4F, 0.3F).method_28499(8)
   );
   public static final class_6629<class_1799> field_34296 = method_30457(
      "evoker", class_6238.<class_1799>method_28492(class_1799::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_1511> field_34309 = method_30457(
      "evoker_fangs", class_6238.<class_1511>method_28492(class_1511::new, class_4565.field_22251).method_28489(0.5F, 0.8F).method_28499(6).method_28500(2)
   );
   public static final class_6629<class_5614> field_34299 = method_30457(
      "experience_orb", class_6238.<class_5614>method_28492(class_5614::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(6).method_28500(20)
   );
   public static final class_6629<class_7483> field_34323 = method_30457(
      "eye_of_ender", class_6238.<class_7483>method_28492(class_7483::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(4)
   );
   public static final class_6629<class_1453> field_34245 = method_30457(
      "falling_block",
      class_6238.<class_1453>method_28492(class_1453::new, class_4565.field_22251).method_28489(0.98F, 0.98F).method_28499(10).method_28500(20)
   );
   public static final class_6629<class_8612> field_34280 = method_30457(
      "firework_rocket",
      class_6238.<class_8612>method_28492(class_8612::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_5542> field_34250 = method_30457(
      "fox",
      class_6238.<class_5542>method_28492(class_5542::new, class_4565.field_22239)
         .method_28489(0.6F, 0.7F)
         .method_28499(8)
         .method_28498(class_4783.field_23637)
   );
   public static final class_6629<class_4206> field_34281 = method_30457(
      "ghast", class_6238.<class_4206>method_28492(class_4206::new, class_4565.field_22247).method_28490().method_28489(4.0F, 4.0F).method_28499(10)
   );
   public static final class_6629<class_7549> field_34294 = method_30457(
      "giant", class_6238.<class_7549>method_28492(class_7549::new, class_4565.field_22247).method_28489(3.6F, 12.0F).method_28499(10)
   );
   public static final class_6629<class_337> field_34307 = method_30457(
      "guardian", class_6238.<class_337>method_28492(class_337::new, class_4565.field_22247).method_28489(0.85F, 0.85F).method_28499(8)
   );
   public static final class_6629<class_6704> field_34306 = method_30457(
      "hoglin", class_6238.<class_6704>method_28492(class_6704::new, class_4565.field_22247).method_28489(1.3964844F, 1.4F).method_28499(8)
   );
   public static final class_6629<class_3551> field_34286 = method_30457(
      "horse", class_6238.<class_3551>method_28492(class_3551::new, class_4565.field_22239).method_28489(1.3964844F, 1.6F).method_28499(10)
   );
   public static final class_6629<class_8170> field_34266 = method_30457(
      "husk", class_6238.<class_8170>method_28492(class_8170::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_2547> field_34270 = method_30457(
      "illusioner", class_6238.<class_2547>method_28492(class_2547::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_8127> field_34298 = method_30457(
      "iron_golem", class_6238.<class_8127>method_28492(class_8127::new, class_4565.field_22251).method_28489(1.4F, 2.7F).method_28499(10)
   );
   public static final class_6629<class_91> field_34208 = method_30457(
      "item", class_6238.<class_91>method_28492(class_91::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(6).method_28500(20)
   );
   public static final class_6629<class_7451> field_34319 = method_30457(
      "item_frame",
      class_6238.<class_7451>method_28492(class_7451::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(10).method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_9053> field_34216 = method_30457(
      "fireball", class_6238.<class_9053>method_28492(class_9053::new, class_4565.field_22251).method_28489(1.0F, 1.0F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_8008> field_34275 = method_30457(
      "leash_knot",
      class_6238.<class_8008>method_28492(class_8008::new, class_4565.field_22251)
         .method_28495()
         .method_28489(0.5F, 0.5F)
         .method_28499(10)
         .method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_900> field_34224 = method_30457(
      "lightning_bolt",
      class_6238.<class_900>method_28492(class_900::new, class_4565.field_22251)
         .method_28495()
         .method_28489(0.0F, 0.0F)
         .method_28499(16)
         .method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_9310> field_34327 = method_30457(
      "llama", class_6238.<class_9310>method_28492(class_9310::new, class_4565.field_22239).method_28489(0.9F, 1.87F).method_28499(10)
   );
   public static final class_6629<class_7548> field_34328 = method_30457(
      "llama_spit", class_6238.<class_7548>method_28492(class_7548::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_3252> field_34295 = method_30457(
      "magma_cube", class_6238.<class_3252>method_28492(class_3252::new, class_4565.field_22247).method_28490().method_28489(2.04F, 2.04F).method_28499(8)
   );
   public static final class_6629<class_1601> field_34239 = method_30457(
      "minecart", class_6238.<class_1601>method_28492(class_1601::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_5340> field_34221 = method_30457(
      "chest_minecart", class_6238.<class_5340>method_28492(class_5340::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_4648> field_34254 = method_30457(
      "command_block_minecart", class_6238.<class_4648>method_28492(class_4648::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_7851> field_34311 = method_30457(
      "furnace_minecart", class_6238.<class_7851>method_28492(class_7851::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_9715> field_34213 = method_30457(
      "hopper_minecart", class_6238.<class_9715>method_28492(class_9715::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_7339> field_34209 = method_30457(
      "spawner_minecart", class_6238.<class_7339>method_28492(class_7339::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_2048> field_34282 = method_30457(
      "tnt_minecart", class_6238.<class_2048>method_28492(class_2048::new, class_4565.field_22251).method_28489(0.98F, 0.7F).method_28499(8)
   );
   public static final class_6629<class_5720> field_34218 = method_30457(
      "mule", class_6238.<class_5720>method_28492(class_5720::new, class_4565.field_22239).method_28489(1.3964844F, 1.6F).method_28499(8)
   );
   public static final class_6629<class_4393> field_34269 = method_30457(
      "mooshroom", class_6238.<class_4393>method_28492(class_4393::new, class_4565.field_22239).method_28489(0.9F, 1.4F).method_28499(10)
   );
   public static final class_6629<class_7617> field_34214 = method_30457(
      "ocelot", class_6238.<class_7617>method_28492(class_7617::new, class_4565.field_22239).method_28489(0.6F, 0.7F).method_28499(10)
   );
   public static final class_6629<class_5490> field_34313 = method_30457(
      "painting",
      class_6238.<class_5490>method_28492(class_5490::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(10).method_28500(Integer.MAX_VALUE)
   );
   public static final class_6629<class_496> field_34232 = method_30457(
      "panda", class_6238.<class_496>method_28492(class_496::new, class_4565.field_22239).method_28489(1.3F, 1.25F).method_28499(10)
   );
   public static final class_6629<class_107> field_34228 = method_30457(
      "parrot", class_6238.<class_107>method_28492(class_107::new, class_4565.field_22239).method_28489(0.5F, 0.9F).method_28499(8)
   );
   public static final class_6629<class_9825> field_34246 = method_30457(
      "phantom", class_6238.<class_9825>method_28492(class_9825::new, class_4565.field_22247).method_28489(0.9F, 0.5F).method_28499(8)
   );
   public static final class_6629<class_9405> field_34252 = method_30457(
      "pig", class_6238.<class_9405>method_28492(class_9405::new, class_4565.field_22239).method_28489(0.9F, 0.9F).method_28499(10)
   );
   public static final class_6629<class_2599> field_34240 = method_30457(
      "piglin", class_6238.<class_2599>method_28492(class_2599::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_7263> field_34257 = method_30457(
      "piglin_brute", class_6238.<class_7263>method_28492(class_7263::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_4134> field_34265 = method_30457(
      "pillager", class_6238.<class_4134>method_28492(class_4134::new, class_4565.field_22247).method_28497().method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_9668> field_34229 = method_30457(
      "polar_bear", class_6238.<class_9668>method_28492(class_9668::new, class_4565.field_22239).method_28489(1.4F, 1.4F).method_28499(10)
   );
   public static final class_6629<class_1356> field_34291 = method_30457(
      "tnt",
      class_6238.<class_1356>method_28492(class_1356::new, class_4565.field_22251).method_28490().method_28489(0.98F, 0.98F).method_28499(10).method_28500(10)
   );
   public static final class_6629<class_2960> field_34315 = method_30457(
      "pufferfish", class_6238.<class_2960>method_28492(class_2960::new, class_4565.field_22248).method_28489(0.7F, 0.7F).method_28499(4)
   );
   public static final class_6629<class_7272> field_34251 = method_30457(
      "rabbit", class_6238.<class_7272>method_28492(class_7272::new, class_4565.field_22239).method_28489(0.4F, 0.5F).method_28499(8)
   );
   public static final class_6629<class_7885> field_34318 = method_30457(
      "ravager", class_6238.<class_7885>method_28492(class_7885::new, class_4565.field_22247).method_28489(1.95F, 2.2F).method_28499(10)
   );
   public static final class_6629<class_1260> field_34236 = method_30457(
      "salmon", class_6238.<class_1260>method_28492(class_1260::new, class_4565.field_22248).method_28489(0.7F, 0.4F).method_28499(4)
   );
   public static final class_6629<class_8031> field_34321 = method_30457(
      "sheep", class_6238.<class_8031>method_28492(class_8031::new, class_4565.field_22239).method_28489(0.9F, 1.3F).method_28499(10)
   );
   public static final class_6629<class_6092> field_34231 = method_30457(
      "shulker",
      class_6238.<class_6092>method_28492(class_6092::new, class_4565.field_22247).method_28490().method_28497().method_28489(1.0F, 1.0F).method_28499(10)
   );
   public static final class_6629<class_9552> field_34271 = method_30457(
      "shulker_bullet", class_6238.<class_9552>method_28492(class_9552::new, class_4565.field_22251).method_28489(0.3125F, 0.3125F).method_28499(8)
   );
   public static final class_6629<class_6174> field_34314 = method_30457(
      "silverfish", class_6238.<class_6174>method_28492(class_6174::new, class_4565.field_22247).method_28489(0.4F, 0.3F).method_28499(8)
   );
   public static final class_6629<class_6778> field_34241 = method_30457(
      "skeleton", class_6238.<class_6778>method_28492(class_6778::new, class_4565.field_22247).method_28489(0.6F, 1.99F).method_28499(8)
   );
   public static final class_6629<class_5948> field_34261 = method_30457(
      "skeleton_horse", class_6238.<class_5948>method_28492(class_5948::new, class_4565.field_22239).method_28489(1.3964844F, 1.6F).method_28499(10)
   );
   public static final class_6629<class_378> field_34222 = method_30457(
      "slime", class_6238.<class_378>method_28492(class_378::new, class_4565.field_22247).method_28489(2.04F, 2.04F).method_28499(10)
   );
   public static final class_6629<class_1593> field_34288 = method_30457(
      "small_fireball",
      class_6238.<class_1593>method_28492(class_1593::new, class_4565.field_22251).method_28489(0.3125F, 0.3125F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_223> field_34253 = method_30457(
      "snow_golem", class_6238.<class_223>method_28492(class_223::new, class_4565.field_22251).method_28489(0.7F, 1.9F).method_28499(8)
   );
   public static final class_6629<class_6889> field_34247 = method_30457(
      "snowball", class_6238.<class_6889>method_28492(class_6889::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_7841> field_34260 = method_30457(
      "spectral_arrow", class_6238.<class_7841>method_28492(class_7841::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(4).method_28500(20)
   );
   public static final class_6629<class_7937> field_34223 = method_30457(
      "spider", class_6238.<class_7937>method_28492(class_7937::new, class_4565.field_22247).method_28489(1.4F, 0.9F).method_28499(8)
   );
   public static final class_6629<class_6011> field_34292 = method_30457(
      "squid", class_6238.<class_6011>method_28492(class_6011::new, class_4565.field_22250).method_28489(0.8F, 0.8F).method_28499(8)
   );
   public static final class_6629<class_4180> field_34322 = method_30457(
      "stray", class_6238.<class_4180>method_28492(class_4180::new, class_4565.field_22247).method_28489(0.6F, 1.99F).method_28499(8)
   );
   public static final class_6629<class_1775> field_34233 = method_30457(
      "strider", class_6238.<class_1775>method_28492(class_1775::new, class_4565.field_22239).method_28490().method_28489(0.9F, 1.7F).method_28499(10)
   );
   public static final class_6629<class_1890> field_34274 = method_30457(
      "egg", class_6238.<class_1890>method_28492(class_1890::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_1537> field_34259 = method_30457(
      "ender_pearl", class_6238.<class_1537>method_28492(class_1537::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_6093> field_34219 = method_30457(
      "experience_bottle",
      class_6238.<class_6093>method_28492(class_6093::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_8011> field_34312 = method_30457(
      "potion", class_6238.<class_8011>method_28492(class_8011::new, class_4565.field_22251).method_28489(0.25F, 0.25F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_3348> field_34284 = method_30457(
      "trident", class_6238.<class_3348>method_28492(class_3348::new, class_4565.field_22251).method_28489(0.5F, 0.5F).method_28499(4).method_28500(20)
   );
   public static final class_6629<class_9629> field_34230 = method_30457(
      "trader_llama", class_6238.<class_9629>method_28492(class_9629::new, class_4565.field_22239).method_28489(0.9F, 1.87F).method_28499(10)
   );
   public static final class_6629<class_8477> field_34278 = method_30457(
      "tropical_fish", class_6238.<class_8477>method_28492(class_8477::new, class_4565.field_22248).method_28489(0.5F, 0.4F).method_28499(4)
   );
   public static final class_6629<class_3845> field_34283 = method_30457(
      "turtle", class_6238.<class_3845>method_28492(class_3845::new, class_4565.field_22239).method_28489(1.2F, 0.4F).method_28499(10)
   );
   public static final class_6629<class_2519> field_34277 = method_30457(
      "vex", class_6238.<class_2519>method_28492(class_2519::new, class_4565.field_22247).method_28490().method_28489(0.4F, 0.8F).method_28499(8)
   );
   public static final class_6629<class_7666> field_34276 = method_30457(
      "villager", class_6238.<class_7666>method_28492(class_7666::new, class_4565.field_22251).method_28489(0.6F, 1.95F).method_28499(10)
   );
   public static final class_6629<class_298> field_34255 = method_30457(
      "vindicator", class_6238.<class_298>method_28492(class_298::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_6862> field_34303 = method_30457(
      "wandering_trader", class_6238.<class_6862>method_28492(class_6862::new, class_4565.field_22239).method_28489(0.6F, 1.95F).method_28499(10)
   );
   public static final class_6629<class_1609> field_34220 = method_30457(
      "witch", class_6238.<class_1609>method_28492(class_1609::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_4653> field_34212 = method_30457(
      "wither",
      class_6238.<class_4653>method_28492(class_4653::new, class_4565.field_22247)
         .method_28490()
         .method_28498(class_4783.field_23401)
         .method_28489(0.9F, 3.5F)
         .method_28499(10)
   );
   public static final class_6629<class_3204> field_34317 = method_30457(
      "wither_skeleton",
      class_6238.<class_3204>method_28492(class_3204::new, class_4565.field_22247)
         .method_28490()
         .method_28498(class_4783.field_23401)
         .method_28489(0.7F, 2.4F)
         .method_28499(8)
   );
   public static final class_6629<class_1044> field_34329 = method_30457(
      "wither_skull",
      class_6238.<class_1044>method_28492(class_1044::new, class_4565.field_22251).method_28489(0.3125F, 0.3125F).method_28499(4).method_28500(10)
   );
   public static final class_6629<class_9408> field_34225 = method_30457(
      "wolf", class_6238.<class_9408>method_28492(class_9408::new, class_4565.field_22239).method_28489(0.6F, 0.85F).method_28499(10)
   );
   public static final class_6629<class_3895> field_34244 = method_30457(
      "zoglin", class_6238.<class_3895>method_28492(class_3895::new, class_4565.field_22247).method_28490().method_28489(1.3964844F, 1.4F).method_28499(8)
   );
   public static final class_6629<class_2811> field_34297 = method_30457(
      "zombie", class_6238.<class_2811>method_28492(class_2811::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_6734> field_34268 = method_30457(
      "zombie_horse", class_6238.<class_6734>method_28492(class_6734::new, class_4565.field_22239).method_28489(1.3964844F, 1.6F).method_28499(10)
   );
   public static final class_6629<class_9355> field_34227 = method_30457(
      "zombie_villager", class_6238.<class_9355>method_28492(class_9355::new, class_4565.field_22247).method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_1918> field_34234 = method_30457(
      "zombified_piglin", class_6238.<class_1918>method_28492(class_1918::new, class_4565.field_22247).method_28490().method_28489(0.6F, 1.95F).method_28499(8)
   );
   public static final class_6629<class_704> field_34300 = method_30457(
      "player",
      class_6238.<class_704>method_28491(class_4565.field_22251).method_28495().method_28494().method_28489(0.6F, 1.8F).method_28499(32).method_28500(2)
   );
   public static final class_6629<class_3942> field_34215 = method_30457(
      "fishing_bobber",
      class_6238.<class_3942>method_28491(class_4565.field_22251).method_28495().method_28494().method_28489(0.25F, 0.25F).method_28499(4).method_28500(5)
   );
   private final class_7792<T> field_34258;
   private final class_4565 field_34305;
   private final ImmutableSet<class_6414> field_34243;
   private final boolean field_34237;
   private final boolean field_34316;
   private final boolean field_34242;
   private final boolean field_34304;
   private final int field_34326;
   private final int field_34256;
   private String field_34226;
   private ITextComponent field_34293;
   private class_4639 field_34285;
   private final class_6097 field_34235;

   private static <T extends class_8145> class_6629<T> method_30457(String var0, class_6238<T> var1) {
      return class_8669.<class_6629<T>>method_39791(class_8669.field_44400, var0, var1.method_28496(var0));
   }

   public static class_4639 method_30472(class_6629<?> var0) {
      return class_8669.field_44400.method_39797(var0);
   }

   public static Optional<class_6629<?>> method_30460(String var0) {
      return class_8669.field_44400.method_39794(class_4639.method_21455(var0));
   }

   public class_6629(
      class_7792<T> var1,
      class_4565 var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      ImmutableSet<class_6414> var7,
      class_6097 var8,
      int var9,
      int var10
   ) {
      this.field_34258 = var1;
      this.field_34305 = var2;
      this.field_34304 = var6;
      this.field_34237 = var3;
      this.field_34316 = var4;
      this.field_34242 = var5;
      this.field_34243 = var7;
      this.field_34235 = var8;
      this.field_34326 = var9;
      this.field_34256 = var10;
   }

   @Nullable
   public class_8145 method_30479(class_6331 var1, class_6098 var2, class_704 var3, class_1331 var4, class_2417 var5, boolean var6, boolean var7) {
      return this.method_30478(
         var1, var2 != null ? var2.method_27990() : null, var2 != null && var2.method_28018() ? var2.method_28008() : null, var3, var4, var5, var6, var7
      );
   }

   @Nullable
   public T method_30478(class_6331 var1, class_5734 var2, ITextComponent var3, class_704 var4, class_1331 var5, class_2417 var6, boolean var7, boolean var8) {
      class_8145 var11 = this.method_30483(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11 != null) {
         var1.method_7065(var11);
      }

      return (T)var11;
   }

   @Nullable
   public T method_30483(class_6331 var1, class_5734 var2, ITextComponent var3, class_704 var4, class_1331 var5, class_2417 var6, boolean var7, boolean var8) {
      class_8145 var11 = this.method_30484(var1);
      if (var11 != null) {
         double var12;
         if (!var7) {
            var12 = 0.0;
         } else {
            var11.method_37256((double)var5.method_12173() + 0.5, (double)(var5.method_12165() + 1), (double)var5.method_12185() + 0.5);
            var12 = method_30461(var1, var5, var8, var11.method_37241());
         }

         var11.method_37144(
            (double)var5.method_12173() + 0.5,
            (double)var5.method_12165() + var12,
            (double)var5.method_12185() + 0.5,
            class_9299.method_42810(var1.field_33033.nextFloat() * 360.0F),
            0.0F
         );
         if (var11 instanceof class_5886) {
            class_5886 var14 = (class_5886)var11;
            var14.field_29618 = var14.field_41701;
            var14.field_29605 = var14.field_41701;
            var14.method_26864(var1, var1.method_43368(var14.method_37075()), var6, (class_8733)null, var2);
            var14.method_26853();
         }

         if (var3 != null && var11 instanceof class_5834) {
            var11.method_37303(var3);
         }

         method_30458(var1, var4, var11, var2);
         return (T)var11;
      } else {
         return null;
      }
   }

   public static double method_30461(class_4924 var0, class_1331 var1, boolean var2, class_4092 var3) {
      class_4092 var6 = new class_4092(var1);
      if (var2) {
         var6 = var6.method_18928(0.0, -1.0, 0.0);
      }

      Stream var7 = var0.method_6676((class_8145)null, var6, var0x -> true);
      return 1.0 + class_3370.method_15520(class_9249.field_47216, var3, var7, !var2 ? -1.0 : -2.0);
   }

   public static void method_30458(class_6486 var0, class_704 var1, class_8145 var2, class_5734 var3) {
      if (var3 != null && var3.method_25939("EntityTag", 10)) {
         class_341 var6 = var0.method_29522();
         if (var6 != null && var2 != null && (var0.field_33055 || !var2.method_37131() || var1 != null && var6.method_1600().method_39962(var1.method_3247()))) {
            class_5734 var7 = var2.method_37258(new class_5734());
            UUID var8 = var2.method_37328();
            var7.method_25925(var3.method_25937("EntityTag"));
            var2.method_37377(var8);
            var2.method_37393(var7);
         }
      }
   }

   public boolean method_30471() {
      return this.field_34237;
   }

   public boolean method_30465() {
      return this.field_34316;
   }

   public boolean method_30470() {
      return this.field_34242;
   }

   public boolean method_30466() {
      return this.field_34304;
   }

   public class_4565 method_30476() {
      return this.field_34305;
   }

   public String method_30469() {
      if (this.field_34226 == null) {
         this.field_34226 = class_9665.method_44671("entity", class_8669.field_44400.method_39797(this));
      }

      return this.field_34226;
   }

   public ITextComponent method_30464() {
      if (this.field_34293 == null) {
         this.field_34293 = new TranslationTextComponent(this.method_30469());
      }

      return this.field_34293;
   }

   @Override
   public String toString() {
      return this.method_30469();
   }

   public class_4639 method_30480() {
      if (this.field_34285 == null) {
         class_4639 var3 = class_8669.field_44400.method_39797(this);
         this.field_34285 = new class_4639(var3.method_21461(), "entities/" + var3.method_21456());
      }

      return this.field_34285;
   }

   public float method_30459() {
      return this.field_34235.field_31199;
   }

   public float method_30468() {
      return this.field_34235.field_31200;
   }

   @Nullable
   public T method_30484(class_6486 var1) {
      return this.field_34258.method_35350(this, var1);
   }

   @Nullable
   public static class_8145 method_30482(int var0, class_6486 var1) {
      return method_30485(var1, class_8669.field_44400.method_14040(var0));
   }

   public static Optional<class_8145> method_30475(class_5734 var0, class_6486 var1) {
      return class_9665.<class_8145>method_44691(
         method_30474(var0).<class_8145>map(var1x -> var1x.method_30484(var1)),
         var1x -> var1x.method_37393(var0),
         () -> field_34287.warn("Skipping Entity with id {}", var0.method_25965("id"))
      );
   }

   @Nullable
   private static class_8145 method_30485(class_6486 var0, class_6629<?> var1) {
      return var1 != null ? var1.method_30484(var0) : null;
   }

   public class_4092 method_30456(double var1, double var3, double var5) {
      float var9 = this.method_30459() / 2.0F;
      return new class_4092(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)this.method_30468(), var5 + (double)var9);
   }

   public boolean method_30481(class_2522 var1) {
      if (this.field_34243.contains(var1.method_8360())) {
         return false;
      } else {
         return this.field_34242
               || !var1.method_8349(class_2351.field_11771)
                  && !var1.method_8350(class_4783.field_23215)
                  && !class_8474.method_39004(var1)
                  && !var1.method_8350(class_4783.field_23811)
            ? var1.method_8350(class_4783.field_23401) || var1.method_8350(class_4783.field_23637) || var1.method_8350(class_4783.field_23500)
            : true;
      }
   }

   public class_6097 method_30473() {
      return this.field_34235;
   }

   public static Optional<class_6629<?>> method_30474(class_5734 var0) {
      return class_8669.field_44400.method_39794(new class_4639(var0.method_25965("id")));
   }

   @Nullable
   public static class_8145 method_30455(class_5734 var0, class_6486 var1, Function<class_8145, class_8145> var2) {
      return method_30454(var0, var1).<class_8145>map(var2).<class_8145>map(var3 -> {
         if (var0.method_25939("Passengers", 9)) {
            class_3416 var6 = var0.method_25927("Passengers", 10);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               class_8145 var8 = method_30455(var6.method_15764(var7), var1, var2);
               if (var8 != null) {
                  var8.method_37354(var3, true);
               }
            }
         }

         return (class_8145)var3;
      }).orElse((class_8145)null);
   }

   private static Optional<class_8145> method_30454(class_5734 var0, class_6486 var1) {
      try {
         return method_30475(var0, var1);
      } catch (RuntimeException var5) {
         field_34287.warn("Exception loading entity: ", var5);
         return Optional.<class_8145>empty();
      }
   }

   public int method_30462() {
      return this.field_34326;
   }

   public int method_30463() {
      return this.field_34256;
   }

   public boolean method_30477() {
      return this != field_34300
         && this != field_34328
         && this != field_34212
         && this != field_34217
         && this != field_34319
         && this != field_34275
         && this != field_34313
         && this != field_34273
         && this != field_34309;
   }

   public boolean method_30453(class_2307<class_6629<?>> var1) {
      return var1.method_10609(this);
   }
}
