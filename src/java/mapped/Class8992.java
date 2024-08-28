package mapped;

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

public class Class8992<T extends Entity> {
   private static final Logger field41004 = LogManager.getLogger();
   public static final Class8992<Class999> field41005 = method33197(
      "area_effect_cloud",
      Class8878.<Class999>method32299(Class999::new, Class179.field628).method32304().method32301(6.0F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class1005> field41006 = method33197(
      "armor_stand", Class8878.<Class1005>method32299(Class1005::new, Class179.field628).method32301(0.5F, 1.975F).method32307(10)
   );
   public static final Class8992<Class887> field41007 = method33197(
      "arrow", Class8878.<Class887>method32299(Class887::new, Class179.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final Class8992<Class1114> field41008 = method33197(
      "bat", Class8878.<Class1114>method32299(Class1114::new, Class179.field625).method32301(0.5F, 0.9F).method32307(5)
   );
   public static final Class8992<Class1017> field41009 = method33197(
      "bee", Class8878.<Class1017>method32299(Class1017::new, Class179.field624).method32301(0.7F, 0.6F).method32307(8)
   );
   public static final Class8992<Class1103> field41010 = method33197(
      "blaze", Class8878.<Class1103>method32299(Class1103::new, Class179.field623).method32304().method32301(0.6F, 1.8F).method32307(8)
   );
   public static final Class8992<Class1002> field41011 = method33197(
      "boat", Class8878.<Class1002>method32299(Class1002::new, Class179.field628).method32301(1.375F, 0.5625F).method32307(10)
   );
   public static final Class8992<Class1098> field41012 = method33197(
      "cat", Class8878.<Class1098>method32299(Class1098::new, Class179.field624).method32301(0.6F, 0.7F).method32307(8)
   );
   public static final Class8992<Class1102> field41013 = method33197(
      "cave_spider", Class8878.<Class1102>method32299(Class1102::new, Class179.field623).method32301(0.7F, 0.5F).method32307(8)
   );
   public static final Class8992<Class1089> field41014 = method33197(
      "chicken", Class8878.<Class1089>method32299(Class1089::new, Class179.field624).method32301(0.4F, 0.7F).method32307(10)
   );
   public static final Class8992<Class1051> field41015 = method33197(
      "cod", Class8878.<Class1051>method32299(Class1051::new, Class179.field627).method32301(0.5F, 0.3F).method32307(4)
   );
   public static final Class8992<Class1087> field41016 = method33197(
      "cow", Class8878.<Class1087>method32299(Class1087::new, Class179.field624).method32301(0.9F, 1.4F).method32307(10)
   );
   public static final Class8992<Class1081> field41017 = method33197(
      "creeper", Class8878.<Class1081>method32299(Class1081::new, Class179.field623).method32301(0.6F, 1.7F).method32307(8)
   );
   public static final Class8992<Class1048> field41018 = method33197(
      "dolphin", Class8878.<Class1048>method32299(Class1048::new, Class179.field626).method32301(0.9F, 0.6F)
   );
   public static final Class8992<Class1067> field41019 = method33197(
      "donkey", Class8878.<Class1067>method32299(Class1067::new, Class179.field624).method32301(1.3964844F, 1.5F).method32307(10)
   );
   public static final Class8992<Class903> field41020 = method33197(
      "dragon_fireball", Class8878.<Class903>method32299(Class903::new, Class179.field628).method32301(1.0F, 1.0F).method32307(4).method32308(10)
   );
   public static final Class8992<Class1037> field41021 = method33197(
      "drowned", Class8878.<Class1037>method32299(Class1037::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1106> field41022 = method33197(
      "elder_guardian", Class8878.<Class1106>method32299(Class1106::new, Class179.field623).method32301(1.9975F, 1.9975F).method32307(10)
   );
   public static final Class8992<Class1001> field41023 = method33197(
      "end_crystal", Class8878.<Class1001>method32299(Class1001::new, Class179.field628).method32301(2.0F, 2.0F).method32307(16).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class1007> field41024 = method33197(
      "ender_dragon", Class8878.<Class1007>method32299(Class1007::new, Class179.field623).method32304().method32301(16.0F, 8.0F).method32307(10)
   );
   public static final Class8992<Class1010> field41025 = method33197(
      "enderman", Class8878.<Class1010>method32299(Class1010::new, Class179.field623).method32301(0.6F, 2.9F).method32307(8)
   );
   public static final Class8992<Class1104> field41026 = method33197(
      "endermite", Class8878.<Class1104>method32299(Class1104::new, Class179.field623).method32301(0.4F, 0.3F).method32307(8)
   );
   public static final Class8992<Class1032> field41027 = method33197(
      "evoker", Class8878.<Class1032>method32299(Class1032::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class915> field41028 = method33197(
      "evoker_fangs", Class8878.<Class915>method32299(Class915::new, Class179.field628).method32301(0.5F, 0.8F).method32307(6).method32308(2)
   );
   public static final Class8992<Class1003> field41029 = method33197(
      "experience_orb", Class8878.<Class1003>method32299(Class1003::new, Class179.field628).method32301(0.5F, 0.5F).method32307(6).method32308(20)
   );
   public static final Class8992<Class897> field41030 = method33197(
      "eye_of_ender", Class8878.<Class897>method32299(Class897::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(4)
   );
   public static final Class8992<Class907> field41031 = method33197(
      "falling_block", Class8878.<Class907>method32299(Class907::new, Class179.field628).method32301(0.98F, 0.98F).method32307(10).method32308(20)
   );
   public static final Class8992<Class888> field41032 = method33197(
      "firework_rocket", Class8878.<Class888>method32299(Class888::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class1095> field41033 = method33197(
      "fox", Class8878.<Class1095>method32299(Class1095::new, Class179.field624).method32301(0.6F, 0.7F).method32307(8).method32305(Blocks.field37069)
   );
   public static final Class8992<Class1112> field41034 = method33197(
      "ghast", Class8878.<Class1112>method32299(Class1112::new, Class179.field623).method32304().method32301(4.0F, 4.0F).method32307(10)
   );
   public static final Class8992<Class1099> field41035 = method33197(
      "giant", Class8878.<Class1099>method32299(Class1099::new, Class179.field623).method32301(3.6F, 12.0F).method32307(10)
   );
   public static final Class8992<Class1105> field41036 = method33197(
      "guardian", Class8878.<Class1105>method32299(Class1105::new, Class179.field623).method32301(0.85F, 0.85F).method32307(8)
   );
   public static final Class8992<Class1091> field41037 = method33197(
      "hoglin", Class8878.<Class1091>method32299(Class1091::new, Class179.field623).method32301(1.3964844F, 1.4F).method32307(8)
   );
   public static final Class8992<Class1074> field41038 = method33197(
      "horse", Class8878.<Class1074>method32299(Class1074::new, Class179.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final Class8992<Class1039> field41039 = method33197(
      "husk", Class8878.<Class1039>method32299(Class1039::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1033> field41040 = method33197(
      "illusioner", Class8878.<Class1033>method32299(Class1033::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1058> field41041 = method33197(
      "iron_golem", Class8878.<Class1058>method32299(Class1058::new, Class179.field628).method32301(1.4F, 2.7F).method32307(10)
   );
   public static final Class8992<Class1000> field41042 = method33197(
      "item", Class8878.<Class1000>method32299(Class1000::new, Class179.field628).method32301(0.25F, 0.25F).method32307(6).method32308(20)
   );
   public static final Class8992<Class997> field41043 = method33197(
      "item_frame", Class8878.<Class997>method32299(Class997::new, Class179.field628).method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class899> field41044 = method33197(
      "fireball", Class8878.<Class899>method32299(Class899::new, Class179.field628).method32301(1.0F, 1.0F).method32307(4).method32308(10)
   );
   public static final Class8992<Class996> field41045 = method33197(
      "leash_knot",
      Class8878.<Class996>method32299(Class996::new, Class179.field628).method32303().method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class906> field41046 = method33197(
      "lightning_bolt",
      Class8878.<Class906>method32299(Class906::new, Class179.field628).method32303().method32301(0.0F, 0.0F).method32307(16).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class1064> field41047 = method33197(
      "llama", Class8878.<Class1064>method32299(Class1064::new, Class179.field624).method32301(0.9F, 1.87F).method32307(10)
   );
   public static final Class8992<Class883> field41048 = method33197(
      "llama_spit", Class8878.<Class883>method32299(Class883::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class1109> field41049 = method33197(
      "magma_cube", Class8878.<Class1109>method32299(Class1109::new, Class179.field623).method32304().method32301(2.04F, 2.04F).method32307(8)
   );
   public static final Class8992<Class917> field41050 = method33197(
      "minecart", Class8878.<Class917>method32299(Class917::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class991> field41051 = method33197(
      "chest_minecart", Class8878.<Class991>method32299(Class991::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class918> field41052 = method33197(
      "command_block_minecart", Class8878.<Class918>method32299(Class918::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class994> field41053 = method33197(
      "furnace_minecart", Class8878.<Class994>method32299(Class994::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class938> field41054 = method33197(
      "hopper_minecart", Class8878.<Class938>method32299(Class938::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class992> field41055 = method33197(
      "spawner_minecart", Class8878.<Class992>method32299(Class992::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class993> field41056 = method33197(
      "tnt_minecart", Class8878.<Class993>method32299(Class993::new, Class179.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final Class8992<Class1078> field41057 = method33197(
      "mule", Class8878.<Class1078>method32299(Class1078::new, Class179.field624).method32301(1.3964844F, 1.6F).method32307(8)
   );
   public static final Class8992<Class1086> field41058 = method33197(
      "mooshroom", Class8878.<Class1086>method32299(Class1086::new, Class179.field624).method32301(0.9F, 1.4F).method32307(10)
   );
   public static final Class8992<Class1090> field41059 = method33197(
      "ocelot", Class8878.<Class1090>method32299(Class1090::new, Class179.field624).method32301(0.6F, 0.7F).method32307(10)
   );
   public static final Class8992<Class998> field41060 = method33197(
      "painting", Class8878.<Class998>method32299(Class998::new, Class179.field628).method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final Class8992<Class1097> field41061 = method33197(
      "panda", Class8878.<Class1097>method32299(Class1097::new, Class179.field624).method32301(1.3F, 1.25F).method32307(10)
   );
   public static final Class8992<Class1015> field41062 = method33197(
      "parrot", Class8878.<Class1015>method32299(Class1015::new, Class179.field624).method32301(0.5F, 0.9F).method32307(8)
   );
   public static final Class8992<Class1110> field41063 = method33197(
      "phantom", Class8878.<Class1110>method32299(Class1110::new, Class179.field623).method32301(0.9F, 0.5F).method32307(8)
   );
   public static final Class8992<Class1072> field41064 = method33197(
      "pig", Class8878.<Class1072>method32299(Class1072::new, Class179.field624).method32301(0.9F, 0.9F).method32307(10)
   );
   public static final Class8992<Class1034> field41065 = method33197(
      "piglin", Class8878.<Class1034>method32299(Class1034::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1036> field41066 = method33197(
      "piglin_brute", Class8878.<Class1036>method32299(Class1036::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1024> field41067 = method33197(
      "pillager", Class8878.<Class1024>method32299(Class1024::new, Class179.field623).method32306().method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1096> field41068 = method33197(
      "polar_bear", Class8878.<Class1096>method32299(Class1096::new, Class179.field624).method32301(1.4F, 1.4F).method32307(10)
   );
   public static final Class8992<Class1004> field41069 = method33197(
      "tnt", Class8878.<Class1004>method32299(Class1004::new, Class179.field628).method32304().method32301(0.98F, 0.98F).method32307(10).method32308(10)
   );
   public static final Class8992<Class1054> field41070 = method33197(
      "pufferfish", Class8878.<Class1054>method32299(Class1054::new, Class179.field627).method32301(0.7F, 0.7F).method32307(4)
   );
   public static final Class8992<Class1094> field41071 = method33197(
      "rabbit", Class8878.<Class1094>method32299(Class1094::new, Class179.field624).method32301(0.4F, 0.5F).method32307(8)
   );
   public static final Class8992<Class1029> field41072 = method33197(
      "ravager", Class8878.<Class1029>method32299(Class1029::new, Class179.field623).method32301(1.95F, 2.2F).method32307(10)
   );
   public static final Class8992<Class1053> field41073 = method33197(
      "salmon", Class8878.<Class1053>method32299(Class1053::new, Class179.field627).method32301(0.7F, 0.4F).method32307(4)
   );
   public static final Class8992<Class1019> field41074 = method33197(
      "sheep", Class8878.<Class1019>method32299(Class1019::new, Class179.field624).method32301(0.9F, 1.3F).method32307(10)
   );
   public static final Class8992<Class1057> field41075 = method33197(
      "shulker", Class8878.<Class1057>method32299(Class1057::new, Class179.field623).method32304().method32306().method32301(1.0F, 1.0F).method32307(10)
   );
   public static final Class8992<Class905> field41076 = method33197(
      "shulker_bullet", Class8878.<Class905>method32299(Class905::new, Class179.field628).method32301(0.3125F, 0.3125F).method32307(8)
   );
   public static final Class8992<Class1107> field41077 = method33197(
      "silverfish", Class8878.<Class1107>method32299(Class1107::new, Class179.field623).method32301(0.4F, 0.3F).method32307(8)
   );
   public static final Class8992<Class1085> field41078 = method33197(
      "skeleton", Class8878.<Class1085>method32299(Class1085::new, Class179.field623).method32301(0.6F, 1.99F).method32307(8)
   );
   public static final Class8992<Class1076> field41079 = method33197(
      "skeleton_horse", Class8878.<Class1076>method32299(Class1076::new, Class179.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final Class8992<Class1108> field41080 = method33197(
      "slime", Class8878.<Class1108>method32299(Class1108::new, Class179.field623).method32301(2.04F, 2.04F).method32307(10)
   );
   public static final Class8992<Class900> field41081 = method33197(
      "small_fireball", Class8878.<Class900>method32299(Class900::new, Class179.field628).method32301(0.3125F, 0.3125F).method32307(4).method32308(10)
   );
   public static final Class8992<Class1021> field41082 = method33197(
      "snow_golem", Class8878.<Class1021>method32299(Class1021::new, Class179.field628).method32301(0.7F, 1.9F).method32307(8)
   );
   public static final Class8992<Class894> field41083 = method33197(
      "snowball", Class8878.<Class894>method32299(Class894::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class885> field41084 = method33197(
      "spectral_arrow", Class8878.<Class885>method32299(Class885::new, Class179.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final Class8992<Class1101> field41085 = method33197(
      "spider", Class8878.<Class1101>method32299(Class1101::new, Class179.field623).method32301(1.4F, 0.9F).method32307(8)
   );
   public static final Class8992<Class1055> field41086 = method33197(
      "squid", Class8878.<Class1055>method32299(Class1055::new, Class179.field626).method32301(0.8F, 0.8F).method32307(8)
   );
   public static final Class8992<Class1083> field41087 = method33197(
      "stray", Class8878.<Class1083>method32299(Class1083::new, Class179.field623).method32301(0.6F, 1.99F).method32307(8)
   );
   public static final Class8992<Class1070> field41088 = method33197(
      "strider", Class8878.<Class1070>method32299(Class1070::new, Class179.field624).method32304().method32301(0.9F, 1.7F).method32307(10)
   );
   public static final Class8992<Class892> field41089 = method33197(
      "egg", Class8878.<Class892>method32299(Class892::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class895> field41090 = method33197(
      "ender_pearl", Class8878.<Class895>method32299(Class895::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class891> field41091 = method33197(
      "experience_bottle", Class8878.<Class891>method32299(Class891::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class896> field41092 = method33197(
      "potion", Class8878.<Class896>method32299(Class896::new, Class179.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final Class8992<Class886> field41093 = method33197(
      "trident", Class8878.<Class886>method32299(Class886::new, Class179.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final Class8992<Class1065> field41094 = method33197(
      "trader_llama", Class8878.<Class1065>method32299(Class1065::new, Class179.field624).method32301(0.9F, 1.87F).method32307(10)
   );
   public static final Class8992<Class1052> field41095 = method33197(
      "tropical_fish", Class8878.<Class1052>method32299(Class1052::new, Class179.field627).method32301(0.5F, 0.4F).method32307(4)
   );
   public static final Class8992<Class1088> field41096 = method33197(
      "turtle", Class8878.<Class1088>method32299(Class1088::new, Class179.field624).method32301(1.2F, 0.4F).method32307(10)
   );
   public static final Class8992<Class1100> field41097 = method33197(
      "vex", Class8878.<Class1100>method32299(Class1100::new, Class179.field623).method32304().method32301(0.4F, 0.8F).method32307(8)
   );
   public static final Class8992<Class1042> field41098 = method33197(
      "villager", Class8878.<Class1042>method32299(Class1042::new, Class179.field628).method32301(0.6F, 1.95F).method32307(10)
   );
   public static final Class8992<Class1030> field41099 = method33197(
      "vindicator", Class8878.<Class1030>method32299(Class1030::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1044> field41100 = method33197(
      "wandering_trader", Class8878.<Class1044>method32299(Class1044::new, Class179.field624).method32301(0.6F, 1.95F).method32307(10)
   );
   public static final Class8992<Class1027> field41101 = method33197(
      "witch", Class8878.<Class1027>method32299(Class1027::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1079> field41102 = method33197(
      "wither",
      Class8878.<Class1079>method32299(Class1079::new, Class179.field623)
         .method32304()
         .method32305(Blocks.field36517)
         .method32301(0.9F, 3.5F)
         .method32307(10)
   );
   public static final Class8992<Class1084> field41103 = method33197(
      "wither_skeleton",
      Class8878.<Class1084>method32299(Class1084::new, Class179.field623)
         .method32304()
         .method32305(Blocks.field36517)
         .method32301(0.7F, 2.4F)
         .method32307(8)
   );
   public static final Class8992<Class902> field41104 = method33197(
      "wither_skull", Class8878.<Class902>method32299(Class902::new, Class179.field628).method32301(0.3125F, 0.3125F).method32307(4).method32308(10)
   );
   public static final Class8992<Class1012> field41105 = method33197(
      "wolf", Class8878.<Class1012>method32299(Class1012::new, Class179.field624).method32301(0.6F, 0.85F).method32307(10)
   );
   public static final Class8992<Class1093> field41106 = method33197(
      "zoglin", Class8878.<Class1093>method32299(Class1093::new, Class179.field623).method32304().method32301(1.3964844F, 1.4F).method32307(8)
   );
   public static final Class8992<Class1038> field41107 = method33197(
      "zombie", Class8878.<Class1038>method32299(Class1038::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1075> field41108 = method33197(
      "zombie_horse", Class8878.<Class1075>method32299(Class1075::new, Class179.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final Class8992<Class1040> field41109 = method33197(
      "zombie_villager", Class8878.<Class1040>method32299(Class1040::new, Class179.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<Class1063> field41110 = method33197(
      "zombified_piglin", Class8878.<Class1063>method32299(Class1063::new, Class179.field623).method32304().method32301(0.6F, 1.95F).method32307(8)
   );
   public static final Class8992<PlayerEntity> field41111 = method33197(
      "player", Class8878.<PlayerEntity>method32300(Class179.field628).method32303().method32302().method32301(0.6F, 1.8F).method32307(32).method32308(2)
   );
   public static final Class8992<Class904> field41112 = method33197(
      "fishing_bobber", Class8878.<Class904>method32300(Class179.field628).method32303().method32302().method32301(0.25F, 0.25F).method32307(4).method32308(5)
   );
   private final Class9283<T> field41113;
   private final Class179 field41114;
   private final ImmutableSet<Block> field41115;
   private final boolean field41116;
   private final boolean field41117;
   private final boolean field41118;
   private final boolean field41119;
   private final int field41120;
   private final int field41121;
   private String field41122;
   private ITextComponent field41123;
   private ResourceLocation field41124;
   private final Class8847 field41125;

   private static <T extends Entity> Class8992<T> method33197(String var0, Class8878<T> var1) {
      return Class2348.<Class8992<T>>method9194(Class2348.field16074, var0, var1.method32309(var0));
   }

   public static ResourceLocation method33198(Class8992<?> var0) {
      return Class2348.field16074.method9181(var0);
   }

   public static Optional<Class8992<?>> method33199(String var0) {
      return Class2348.field16074.method9187(ResourceLocation.method8289(var0));
   }

   public Class8992(
      Class9283<T> var1,
      Class179 var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      ImmutableSet<Block> var7,
      Class8847 var8,
      int var9,
      int var10
   ) {
      this.field41113 = var1;
      this.field41114 = var2;
      this.field41119 = var6;
      this.field41116 = var3;
      this.field41117 = var4;
      this.field41118 = var5;
      this.field41115 = var7;
      this.field41125 = var8;
      this.field41120 = var9;
      this.field41121 = var10;
   }

   @Nullable
   public Entity method33200(Class1657 var1, Class8848 var2, PlayerEntity var3, BlockPos var4, Class2202 var5, boolean var6, boolean var7) {
      return this.method33201(
         var1, var2 != null ? var2.method32142() : null, var2 != null && var2.method32152() ? var2.method32149() : null, var3, var4, var5, var6, var7
      );
   }

   @Nullable
   public T method33201(Class1657 var1, Class39 var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, Class2202 var6, boolean var7, boolean var8) {
      Entity var11 = this.method33202(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11 != null) {
         var1.method6995(var11);
      }

      return (T)var11;
   }

   @Nullable
   public T method33202(Class1657 var1, Class39 var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, Class2202 var6, boolean var7, boolean var8) {
      Entity var11 = this.method33215(var1);
      if (var11 != null) {
         double var12;
         if (!var7) {
            var12 = 0.0;
         } else {
            var11.method3215((double)var5.method8304() + 0.5, (double)(var5.getY() + 1), (double)var5.method8306() + 0.5);
            var12 = method33203(var1, var5, var8, var11.method3389());
         }

         var11.method3273(
            (double)var5.method8304() + 0.5,
            (double)var5.getY() + var12,
            (double)var5.method8306() + 0.5,
            Class9679.method37792(var1.field9016.nextFloat() * 360.0F),
            0.0F
         );
         if (var11 instanceof Class1006) {
            Class1006 var14 = (Class1006)var11;
            var14.field4967 = var14.field5031;
            var14.field4965 = var14.field5031;
            var14.method4276(var1, var1.method6807(var14.method3432()), var6, (Class5093)null, var2);
            var14.method4237();
         }

         if (var3 != null && var11 instanceof Class880) {
            var11.method3379(var3);
         }

         method33204(var1, var4, var11, var2);
         return (T)var11;
      } else {
         return null;
      }
   }

   public static double method33203(Class1662 var0, BlockPos var1, boolean var2, Class6488 var3) {
      Class6488 var6 = new Class6488(var1);
      if (var2) {
         var6 = var6.method19662(0.0, -1.0, 0.0);
      }

      Stream var7 = var0.method7047((Entity)null, var6, var0x -> true);
      return 1.0 + Class8022.method27437(Class113.field414, var3, var7, !var2 ? -1.0 : -2.0);
   }

   public static void method33204(Class1655 var0, PlayerEntity var1, Entity var2, Class39 var3) {
      if (var3 != null && var3.method119("EntityTag", 10)) {
         Class314 var6 = var0.method6715();
         if (var6 != null && var2 != null && (var0.field9020 || !var2.method3404() || var1 != null && var6.method1367().method19464(var1.method2906()))) {
            Class39 var7 = var2.method3294(new Class39());
            UUID var8 = var2.method3375();
            var7.method140(var3.method130("EntityTag"));
            var2.method3374(var8);
            var2.method3295(var7);
         }
      }
   }

   public boolean method33205() {
      return this.field41116;
   }

   public boolean method33206() {
      return this.field41117;
   }

   public boolean method33207() {
      return this.field41118;
   }

   public boolean method33208() {
      return this.field41119;
   }

   public Class179 method33209() {
      return this.field41114;
   }

   public String method33210() {
      if (this.field41122 == null) {
         this.field41122 = Util.method38486("entity", Class2348.field16074.method9181(this));
      }

      return this.field41122;
   }

   public ITextComponent method33211() {
      if (this.field41123 == null) {
         this.field41123 = new TranslationTextComponent(this.method33210());
      }

      return this.field41123;
   }

   @Override
   public String toString() {
      return this.method33210();
   }

   public ResourceLocation method33212() {
      if (this.field41124 == null) {
         ResourceLocation var3 = Class2348.field16074.method9181(this);
         this.field41124 = new ResourceLocation(var3.method8293(), "entities/" + var3.method8292());
      }

      return this.field41124;
   }

   public float method33213() {
      return this.field41125.field39968;
   }

   public float method33214() {
      return this.field41125.field39969;
   }

   @Nullable
   public T method33215(Class1655 var1) {
      return this.field41113.method35007(this, var1);
   }

   @Nullable
   public static Entity method33216(int var0, Class1655 var1) {
      return method33218(var1, Class2348.field16074.method9172(var0));
   }

   public static Optional<Entity> method33217(Class39 var0, Class1655 var1) {
      return Util.<Entity>method38514(
         method33222(var0).<Entity>map(var1x -> var1x.method33215(var1)),
         var1x -> var1x.method3295(var0),
         () -> field41004.warn("Skipping Entity with id {}", var0.method126("id"))
      );
   }

   @Nullable
   private static Entity method33218(Class1655 var0, Class8992<?> var1) {
      return var1 != null ? var1.method33215(var0) : null;
   }

   public Class6488 method33219(double var1, double var3, double var5) {
      float var9 = this.method33213() / 2.0F;
      return new Class6488(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)this.method33214(), var5 + (double)var9);
   }

   public boolean method33220(Class7380 var1) {
      if (this.field41115.contains(var1.method23383())) {
         return false;
      } else {
         return this.field41118
               || !var1.method23446(Class7645.field32798)
                  && !var1.method23448(Blocks.field36890)
                  && !Class3244.method11655(var1)
                  && !var1.method23448(Blocks.LAVA)
            ? var1.method23448(Blocks.field36517) || var1.method23448(Blocks.field37069) || var1.method23448(Blocks.CACTUS)
            : true;
      }
   }

   public Class8847 method33221() {
      return this.field41125;
   }

   public static Optional<Class8992<?>> method33222(Class39 var0) {
      return Class2348.field16074.method9187(new ResourceLocation(var0.method126("id")));
   }

   @Nullable
   public static Entity method33223(Class39 var0, Class1655 var1, Function<Entity, Entity> var2) {
      return method33224(var0, var1).<Entity>map(var2).<Entity>map(var3 -> {
         if (var0.method119("Passengers", 9)) {
            Class41 var6 = var0.method131("Passengers", 10);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = method33223(var6.method153(var7), var1, var2);
               if (var8 != null) {
                  var8.method2758(var3, true);
               }
            }
         }

         return (Entity)var3;
      }).orElse((Entity)null);
   }

   private static Optional<Entity> method33224(Class39 var0, Class1655 var1) {
      try {
         return method33217(var0, var1);
      } catch (RuntimeException var5) {
         field41004.warn("Exception loading entity: ", var5);
         return Optional.<Entity>empty();
      }
   }

   public int method33225() {
      return this.field41120;
   }

   public int method33226() {
      return this.field41121;
   }

   public boolean method33227() {
      return this != field41111
         && this != field41048
         && this != field41102
         && this != field41008
         && this != field41043
         && this != field41045
         && this != field41060
         && this != field41023
         && this != field41028;
   }

   public boolean method33228(Class7608<Class8992<?>> var1) {
      return var1.method24917(this);
   }
}
