package mapped;

import com.mojang.datafixers.types.Type;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Supplier;

public class Class4387<T extends Class944> {
   private static final Logger field21420 = LogManager.getLogger();
   public static final Class4387<Class986> field21421 = method13794("furnace", Class9785.<Class986>method38569(Class986::new, Blocks.field36541));
   public static final Class4387<Class941> field21422 = method13794("chest", Class9785.<Class941>method38569(Class941::new, Blocks.field36534));
   public static final Class4387<Class970> field21423 = method13794("trapped_chest", Class9785.<Class970>method38569(Class970::new, Blocks.field36716));
   public static final Class4387<Class943> field21424 = method13794("ender_chest", Class9785.<Class943>method38569(Class943::new, Blocks.field36657));
   public static final Class4387<Class947> field21425 = method13794("jukebox", Class9785.<Class947>method38569(Class947::new, Blocks.JUKEBOX));
   public static final Class4387<Class971> field21426 = method13794("dispenser", Class9785.<Class971>method38569(Class971::new, Blocks.field36457));
   public static final Class4387<Class972> field21427 = method13794("dropper", Class9785.<Class972>method38569(Class972::new, Blocks.field36729));
   public static final Class4387<Class954> field21428 = method13794(
      "sign",
      Class9785.<Class954>method38569(
         Class954::new,
         Blocks.field36542,
         Blocks.field36543,
         Blocks.field36544,
         Blocks.field36545,
         Blocks.field36546,
         Blocks.field36547,
         Blocks.field36552,
         Blocks.field36553,
         Blocks.field36554,
         Blocks.field36555,
         Blocks.field36556,
         Blocks.field36557,
         Blocks.field37109,
         Blocks.field37111,
         Blocks.field37110,
         Blocks.field37112
      )
   );
   public static final Class4387<Class960> field21429 = method13794("mob_spawner", Class9785.<Class960>method38569(Class960::new, Blocks.field36532));
   public static final Class4387<Class955> field21430 = method13794("piston", Class9785.<Class955>method38569(Class955::new, Blocks.field36505));
   public static final Class4387<Class931> field21431 = method13794("brewing_stand", Class9785.<Class931>method38569(Class931::new, Blocks.field36647));
   public static final Class4387<Class934> field21432 = method13794("enchanting_table", Class9785.<Class934>method38569(Class934::new, Blocks.field36646));
   public static final Class4387<Class956> field21433 = method13794("end_portal", Class9785.<Class956>method38569(Class956::new, Blocks.field36649));
   public static final Class4387<Class950> field21434 = method13794("beacon", Class9785.<Class950>method38569(Class950::new, Blocks.field36665));
   public static final Class4387<Class968> field21435 = method13794(
      "skull",
      Class9785.<Class968>method38569(
         Class968::new,
         Blocks.field36701,
         Blocks.field36702,
         Blocks.field36709,
         Blocks.field36710,
         Blocks.field36711,
         Blocks.field36712,
         Blocks.field36705,
         Blocks.field36706,
         Blocks.field36703,
         Blocks.field36704,
         Blocks.field36707,
         Blocks.field36708
      )
   );
   public static final Class4387<Class961> field21436 = method13794("daylight_detector", Class9785.<Class961>method38569(Class961::new, Blocks.field36720));
   public static final Class4387<Class936> field21437 = method13794("hopper", Class9785.<Class936>method38569(Class936::new, Blocks.field36723));
   public static final Class4387<Class963> field21438 = method13794("comparator", Class9785.<Class963>method38569(Class963::new, Blocks.field36719));
   public static final Class4387<Class958> field21439 = method13794(
      "banner",
      Class9785.<Class958>method38569(
         Class958::new,
         Blocks.field36803,
         Blocks.field36804,
         Blocks.field36805,
         Blocks.field36806,
         Blocks.field36807,
         Blocks.field36808,
         Blocks.field36809,
         Blocks.field36810,
         Blocks.field36811,
         Blocks.field36812,
         Blocks.field36813,
         Blocks.field36814,
         Blocks.field36815,
         Blocks.field36816,
         Blocks.field36817,
         Blocks.field36818,
         Blocks.field36819,
         Blocks.field36820,
         Blocks.field36821,
         Blocks.field36822,
         Blocks.field36823,
         Blocks.field36824,
         Blocks.field36825,
         Blocks.field36826,
         Blocks.field36827,
         Blocks.field36828,
         Blocks.field36829,
         Blocks.field36830,
         Blocks.field36831,
         Blocks.field36832,
         Blocks.field36833,
         Blocks.field36834
      )
   );
   public static final Class4387<Class964> field21440 = method13794("structure_block", Class9785.<Class964>method38569(Class964::new, Blocks.field37113));
   public static final Class4387<Class957> field21441 = method13794("end_gateway", Class9785.<Class957>method38569(Class957::new, Blocks.field36886));
   public static final Class4387<Class969> field21442 = method13794(
      "command_block", Class9785.<Class969>method38569(Class969::new, Blocks.field36664, Blocks.field36888, Blocks.field36887)
   );
   public static final Class4387<Class940> field21443 = method13794(
      "shulker_box",
      Class9785.<Class940>method38569(
         Class940::new,
         Blocks.field36896,
         Blocks.field36912,
         Blocks.field36908,
         Blocks.field36909,
         Blocks.field36906,
         Blocks.field36904,
         Blocks.field36910,
         Blocks.field36900,
         Blocks.field36905,
         Blocks.field36902,
         Blocks.field36899,
         Blocks.field36898,
         Blocks.field36903,
         Blocks.field36907,
         Blocks.field36911,
         Blocks.field36897,
         Blocks.field36901
      )
   );
   public static final Class4387<Class967> field21444 = method13794(
      "bed",
      Class9785.<Class967>method38569(
         Class967::new,
         Blocks.field36476,
         Blocks.field36477,
         Blocks.field36473,
         Blocks.field36474,
         Blocks.field36471,
         Blocks.field36469,
         Blocks.field36475,
         Blocks.field36465,
         Blocks.field36470,
         Blocks.field36467,
         Blocks.field36464,
         Blocks.field36463,
         Blocks.field36468,
         Blocks.field36472,
         Blocks.field36462,
         Blocks.field36466
      )
   );
   public static final Class4387<Class959> field21445 = method13794("conduit", Class9785.<Class959>method38569(Class959::new, Blocks.field37007));
   public static final Class4387<Class973> field21446 = method13794("barrel", Class9785.<Class973>method38569(Class973::new, Blocks.field37055));
   public static final Class4387<Class985> field21447 = method13794("smoker", Class9785.<Class985>method38569(Class985::new, Blocks.field37056));
   public static final Class4387<Class987> field21448 = method13794("blast_furnace", Class9785.<Class987>method38569(Class987::new, Blocks.field37057));
   public static final Class4387<Class948> field21449 = method13794("lectern", Class9785.<Class948>method38569(Class948::new, Blocks.field37061));
   public static final Class4387<Class966> field21450 = method13794("bell", Class9785.<Class966>method38569(Class966::new, Blocks.field37064));
   public static final Class4387<Class965> field21451 = method13794("jigsaw", Class9785.<Class965>method38569(Class965::new, Blocks.field37114));
   public static final Class4387<Class945> field21452 = method13794(
      "campfire", Class9785.<Class945>method38569(Class945::new, Blocks.field37067, Blocks.field37068)
   );
   public static final Class4387<Class962> field21453 = method13794(
      "beehive", Class9785.<Class962>method38569(Class962::new, Blocks.field37117, Blocks.field37118)
   );
   private final Supplier<? extends T> field21454;
   private final Set<Block> field21455;
   private final Type<?> field21456;

   @Nullable
   public static ResourceLocation method13793(Class4387<?> var0) {
      return Class2348.field16078.method9181(var0);
   }

   private static <T extends Class944> Class4387<T> method13794(String var0, Class9785<T> var1) {
      if (Class9785.method38571(var1).isEmpty()) {
         field21420.warn("Block entity type {} requires at least one valid block to be defined!", var0);
      }

      Type var4 = Util.method38500(Class8239.field35386, var0);
      return Class2348.<Class4387<T>>method9194(Class2348.field16078, var0, var1.method38570(var4));
   }

   public Class4387(Supplier<? extends T> var1, Set<Block> var2, Type<?> var3) {
      this.field21454 = var1;
      this.field21455 = var2;
      this.field21456 = var3;
   }

   @Nullable
   public T method13795() {
      return (T)this.field21454.get();
   }

   public boolean method13796(Block var1) {
      return this.field21455.contains(var1);
   }

   @Nullable
   public T method13797(Class1665 var1, BlockPos var2) {
      Class944 var5 = var1.method6759(var2);
      return (T)(var5 != null && var5.method3786() == this ? var5 : null);
   }
}
