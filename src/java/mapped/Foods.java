package mapped;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods {
   private static String[] field39057;
   public static final Food field39058 = new Food.Builder().method28229(4).method28230(0.3F).method28235();
   public static final Food field39059 = new Food.Builder().method28229(5).method28230(0.6F).method28235();
   public static final Food field39060 = new Food.Builder().method28229(3).method28230(0.3F).method28231().method28235();
   public static final Food field39061 = new Food.Builder().method28229(1).method28230(0.6F).method28235();
   public static final Food field39062 = method31214(6);
   public static final Food field39063 = new Food.Builder().method28229(5).method28230(0.6F).method28235();
   public static final Food field39064 = new Food.Builder().method28229(3).method28230(0.6F).method28235();
   public static final Food field39065 = new Food.Builder()
      .method28229(2)
      .method28230(0.3F)
      .method28234(new EffectInstance(Effects.HUNGER, 600, 0), 0.3F)
      .method28231()
      .method28235();
   public static final Food field39066 = new Food.Builder().method28229(4).method28230(0.3F).method28232().method28235();
   public static final Food field39067 = new Food.Builder().method28229(2).method28230(0.1F).method28235();
   public static final Food field39068 = new Food.Builder().method28229(8).method28230(0.8F).method28231().method28235();
   public static final Food field39069 = new Food.Builder().method28229(6).method28230(0.6F).method28231().method28235();
   public static final Food field39070 = new Food.Builder().method28229(5).method28230(0.6F).method28235();
   public static final Food field39071 = new Food.Builder().method28229(6).method28230(0.8F).method28231().method28235();
   public static final Food field39072 = new Food.Builder().method28229(8).method28230(0.8F).method28231().method28235();
   public static final Food field39073 = new Food.Builder().method28229(5).method28230(0.6F).method28231().method28235();
   public static final Food field39074 = new Food.Builder().method28229(6).method28230(0.8F).method28235();
   public static final Food field39075 = new Food.Builder().method28229(2).method28230(0.1F).method28235();
   public static final Food field39076 = new Food.Builder().method28229(1).method28230(0.3F).method28233().method28235();
   public static final Food ENCHANTED_GOLDEN_APPLE = new Food.Builder()
      .method28229(4)
      .method28230(1.2F)
      .method28234(new EffectInstance(Effects.REGENERATION, 400, 1), 1.0F)
      .method28234(new EffectInstance(Effects.RESISTANCE, 6000, 0), 1.0F)
      .method28234(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1.0F)
      .method28234(new EffectInstance(Effects.ABSORPTION, 2400, 3), 1.0F)
      .method28232()
      .method28235();
   public static final Food GOLDEN_APPLE = new Food.Builder()
      .method28229(4)
      .method28230(1.2F)
      .method28234(new EffectInstance(Effects.REGENERATION, 100, 1), 1.0F)
      .method28234(new EffectInstance(Effects.ABSORPTION, 2400, 0), 1.0F)
      .method28232()
      .method28235();
   public static final Food field39079 = new Food.Builder().method28229(6).method28230(1.2F).method28235();
   public static final Food field39080 = new Food.Builder().method28229(6).method28230(0.1F).method28235();
   public static final Food field39081 = new Food.Builder().method28229(2).method28230(0.3F).method28235();
   public static final Food field39082 = method31214(6);
   public static final Food field39083 = new Food.Builder().method28229(2).method28230(0.3F).method28231().method28235();
   public static final Food field39084 = new Food.Builder()
      .method28229(2)
      .method28230(0.3F)
      .method28234(new EffectInstance(Effects.POISON, 100, 0), 0.6F)
      .method28235();
   public static final Food field39085 = new Food.Builder().method28229(3).method28230(0.3F).method28231().method28235();
   public static final Food field39086 = new Food.Builder().method28229(1).method28230(0.3F).method28235();
   public static final Food field39087 = new Food.Builder()
      .method28229(1)
      .method28230(0.1F)
      .method28234(new EffectInstance(Effects.POISON, 1200, 3), 1.0F)
      .method28234(new EffectInstance(Effects.HUNGER, 300, 2), 1.0F)
      .method28234(new EffectInstance(Effects.NAUSEA, 300, 0), 1.0F)
      .method28235();
   public static final Food field39088 = new Food.Builder().method28229(8).method28230(0.3F).method28235();
   public static final Food field39089 = new Food.Builder().method28229(3).method28230(0.3F).method28231().method28235();
   public static final Food field39090 = method31214(10);
   public static final Food field39091 = new Food.Builder()
      .method28229(4)
      .method28230(0.1F)
      .method28234(new EffectInstance(Effects.HUNGER, 600, 0), 0.8F)
      .method28231()
      .method28235();
   public static final Food field39092 = new Food.Builder().method28229(2).method28230(0.1F).method28235();
   public static final Food field39093 = new Food.Builder()
      .method28229(2)
      .method28230(0.8F)
      .method28234(new EffectInstance(Effects.POISON, 100, 0), 1.0F)
      .method28235();
   public static final Food field39094 = method31214(6);
   public static final Food field39095 = new Food.Builder().method28229(2).method28230(0.1F).method28235();
   public static final Food field39096 = new Food.Builder().method28229(1).method28230(0.1F).method28235();

   private static Food method31214(int var0) {
      return new Food.Builder().method28229(var0).method28230(0.6F).method28235();
   }
}
