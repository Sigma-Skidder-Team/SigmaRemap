package mapped;

import com.mojang.datafixers.types.Type;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Supplier;

public class Class4387<T extends Class944> {
   private static final Logger field21420 = LogManager.getLogger();
   public static final Class4387<Class986> field21421 = method13794("furnace", Class9785.<Class986>method38569(Class986::new, Class8487.field36541));
   public static final Class4387<Class941> field21422 = method13794("chest", Class9785.<Class941>method38569(Class941::new, Class8487.field36534));
   public static final Class4387<Class970> field21423 = method13794("trapped_chest", Class9785.<Class970>method38569(Class970::new, Class8487.field36716));
   public static final Class4387<Class943> field21424 = method13794("ender_chest", Class9785.<Class943>method38569(Class943::new, Class8487.field36657));
   public static final Class4387<Class947> field21425 = method13794("jukebox", Class9785.<Class947>method38569(Class947::new, Class8487.field36577));
   public static final Class4387<Class971> field21426 = method13794("dispenser", Class9785.<Class971>method38569(Class971::new, Class8487.field36457));
   public static final Class4387<Class972> field21427 = method13794("dropper", Class9785.<Class972>method38569(Class972::new, Class8487.field36729));
   public static final Class4387<Class954> field21428 = method13794(
      "sign",
      Class9785.<Class954>method38569(
         Class954::new,
         Class8487.field36542,
         Class8487.field36543,
         Class8487.field36544,
         Class8487.field36545,
         Class8487.field36546,
         Class8487.field36547,
         Class8487.field36552,
         Class8487.field36553,
         Class8487.field36554,
         Class8487.field36555,
         Class8487.field36556,
         Class8487.field36557,
         Class8487.field37109,
         Class8487.field37111,
         Class8487.field37110,
         Class8487.field37112
      )
   );
   public static final Class4387<Class960> field21429 = method13794("mob_spawner", Class9785.<Class960>method38569(Class960::new, Class8487.field36532));
   public static final Class4387<Class955> field21430 = method13794("piston", Class9785.<Class955>method38569(Class955::new, Class8487.field36505));
   public static final Class4387<Class931> field21431 = method13794("brewing_stand", Class9785.<Class931>method38569(Class931::new, Class8487.field36647));
   public static final Class4387<Class934> field21432 = method13794("enchanting_table", Class9785.<Class934>method38569(Class934::new, Class8487.field36646));
   public static final Class4387<Class956> field21433 = method13794("end_portal", Class9785.<Class956>method38569(Class956::new, Class8487.field36649));
   public static final Class4387<Class950> field21434 = method13794("beacon", Class9785.<Class950>method38569(Class950::new, Class8487.field36665));
   public static final Class4387<Class968> field21435 = method13794(
      "skull",
      Class9785.<Class968>method38569(
         Class968::new,
         Class8487.field36701,
         Class8487.field36702,
         Class8487.field36709,
         Class8487.field36710,
         Class8487.field36711,
         Class8487.field36712,
         Class8487.field36705,
         Class8487.field36706,
         Class8487.field36703,
         Class8487.field36704,
         Class8487.field36707,
         Class8487.field36708
      )
   );
   public static final Class4387<Class961> field21436 = method13794("daylight_detector", Class9785.<Class961>method38569(Class961::new, Class8487.field36720));
   public static final Class4387<Class936> field21437 = method13794("hopper", Class9785.<Class936>method38569(Class936::new, Class8487.field36723));
   public static final Class4387<Class963> field21438 = method13794("comparator", Class9785.<Class963>method38569(Class963::new, Class8487.field36719));
   public static final Class4387<Class958> field21439 = method13794(
      "banner",
      Class9785.<Class958>method38569(
         Class958::new,
         Class8487.field36803,
         Class8487.field36804,
         Class8487.field36805,
         Class8487.field36806,
         Class8487.field36807,
         Class8487.field36808,
         Class8487.field36809,
         Class8487.field36810,
         Class8487.field36811,
         Class8487.field36812,
         Class8487.field36813,
         Class8487.field36814,
         Class8487.field36815,
         Class8487.field36816,
         Class8487.field36817,
         Class8487.field36818,
         Class8487.field36819,
         Class8487.field36820,
         Class8487.field36821,
         Class8487.field36822,
         Class8487.field36823,
         Class8487.field36824,
         Class8487.field36825,
         Class8487.field36826,
         Class8487.field36827,
         Class8487.field36828,
         Class8487.field36829,
         Class8487.field36830,
         Class8487.field36831,
         Class8487.field36832,
         Class8487.field36833,
         Class8487.field36834
      )
   );
   public static final Class4387<Class964> field21440 = method13794("structure_block", Class9785.<Class964>method38569(Class964::new, Class8487.field37113));
   public static final Class4387<Class957> field21441 = method13794("end_gateway", Class9785.<Class957>method38569(Class957::new, Class8487.field36886));
   public static final Class4387<Class969> field21442 = method13794(
      "command_block", Class9785.<Class969>method38569(Class969::new, Class8487.field36664, Class8487.field36888, Class8487.field36887)
   );
   public static final Class4387<Class940> field21443 = method13794(
      "shulker_box",
      Class9785.<Class940>method38569(
         Class940::new,
         Class8487.field36896,
         Class8487.field36912,
         Class8487.field36908,
         Class8487.field36909,
         Class8487.field36906,
         Class8487.field36904,
         Class8487.field36910,
         Class8487.field36900,
         Class8487.field36905,
         Class8487.field36902,
         Class8487.field36899,
         Class8487.field36898,
         Class8487.field36903,
         Class8487.field36907,
         Class8487.field36911,
         Class8487.field36897,
         Class8487.field36901
      )
   );
   public static final Class4387<Class967> field21444 = method13794(
      "bed",
      Class9785.<Class967>method38569(
         Class967::new,
         Class8487.field36476,
         Class8487.field36477,
         Class8487.field36473,
         Class8487.field36474,
         Class8487.field36471,
         Class8487.field36469,
         Class8487.field36475,
         Class8487.field36465,
         Class8487.field36470,
         Class8487.field36467,
         Class8487.field36464,
         Class8487.field36463,
         Class8487.field36468,
         Class8487.field36472,
         Class8487.field36462,
         Class8487.field36466
      )
   );
   public static final Class4387<Class959> field21445 = method13794("conduit", Class9785.<Class959>method38569(Class959::new, Class8487.field37007));
   public static final Class4387<Class973> field21446 = method13794("barrel", Class9785.<Class973>method38569(Class973::new, Class8487.field37055));
   public static final Class4387<Class985> field21447 = method13794("smoker", Class9785.<Class985>method38569(Class985::new, Class8487.field37056));
   public static final Class4387<Class987> field21448 = method13794("blast_furnace", Class9785.<Class987>method38569(Class987::new, Class8487.field37057));
   public static final Class4387<Class948> field21449 = method13794("lectern", Class9785.<Class948>method38569(Class948::new, Class8487.field37061));
   public static final Class4387<Class966> field21450 = method13794("bell", Class9785.<Class966>method38569(Class966::new, Class8487.field37064));
   public static final Class4387<Class965> field21451 = method13794("jigsaw", Class9785.<Class965>method38569(Class965::new, Class8487.field37114));
   public static final Class4387<Class945> field21452 = method13794(
      "campfire", Class9785.<Class945>method38569(Class945::new, Class8487.field37067, Class8487.field37068)
   );
   public static final Class4387<Class962> field21453 = method13794(
      "beehive", Class9785.<Class962>method38569(Class962::new, Class8487.field37117, Class8487.field37118)
   );
   private final Supplier<? extends T> field21454;
   private final Set<Class3209> field21455;
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

   public Class4387(Supplier<? extends T> var1, Set<Class3209> var2, Type<?> var3) {
      this.field21454 = var1;
      this.field21455 = var2;
      this.field21456 = var3;
   }

   @Nullable
   public T method13795() {
      return (T)this.field21454.get();
   }

   public boolean method13796(Class3209 var1) {
      return this.field21455.contains(var1);
   }

   @Nullable
   public T method13797(Class1665 var1, BlockPos var2) {
      Class944 var5 = var1.method6759(var2);
      return (T)(var5 != null && var5.method3786() == this ? var5 : null);
   }
}
