package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;

import java.util.Optional;

public class VillagerTasks {
   private static String[] field43525;

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35581(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new SwimTask(0.8F)),
         Pair.of(0, new InteractWithDoorTask()),
         Pair.of(0, new LookTask(45, 90)),
         Pair.of(0, new PanicTask()),
         Pair.of(0, new WakeUpTask()),
         Pair.of(0, new HideFromRaidOnBellRingTask()),
         Pair.of(0, new BeginRaidTask()),
         Pair.of(0, new ExpirePOITask(var0.getPointOfInterest(), MemoryModuleType.field39814)),
         Pair.of(0, new ExpirePOITask(var0.getPointOfInterest(), MemoryModuleType.field39815)),
         Pair.of(1, new WalkToTargetTask()),
         Pair.of(2, new SwitchVillagerJobTask(var0)),
         Pair.of(3, new TradeTask(var1)),
         new Pair[]{
            Pair.of(5, new PickupWantedItemTask(var1, false, 4)),
            Pair.of(6, new GatherPOITask(var0.getPointOfInterest(), MemoryModuleType.field39814, MemoryModuleType.field39815, true, Optional.<Byte>empty())),
            Pair.of(7, new FindPotentialJobTask(var1)),
            Pair.of(8, new FindJobTask(var1)),
            Pair.of(10, new GatherPOITask(PointOfInterestType.HOME, MemoryModuleType.field39813, false, Optional.<Byte>of((byte)14))),
            Pair.of(10, new GatherPOITask(PointOfInterestType.MEETING, MemoryModuleType.field39816, true, Optional.<Byte>of((byte)14))),
            Pair.of(10, new AssignProfessionTask()),
            Pair.of(10, new ChangeJobTask())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35582(VillagerProfession var0, float var1) {
      Object var4;
      if (var0 != VillagerProfession.field36016) {
         var4 = new Class3706();
      } else {
         var4 = new Class3707();
      }

      return ImmutableList.of(
         lookAtPlayerOrVillager(),
         Pair.of(
            5,
            new FirstShuffledTask(
               ImmutableList.of(
                  Pair.of(var4, 7),
                  Pair.of(new Class3726(MemoryModuleType.field39814, 0.4F, 4), 2),
                  Pair.of(new Class3700(MemoryModuleType.field39814, 0.4F, 1, 10), 5),
                  Pair.of(new Class3742(MemoryModuleType.field39817, var1, 1, 6, MemoryModuleType.field39814), 5),
                  Pair.of(new Class3749(), var0 != VillagerProfession.field36016 ? 5 : 2),
                  Pair.of(new Class3725(), var0 != VillagerProfession.field36016 ? 7 : 4)
               )
            )
         ),
         Pair.of(10, new Class3729(400, 1600)),
         Pair.of(10, new Class3715(EntityType.PLAYER, 4)),
         Pair.of(2, new StayNearPointTask(MemoryModuleType.field39814, var1, 9, 100, 1200)),
         Pair.of(3, new Class3717(100)),
         Pair.of(99, new Class3708())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35583(float var0) {
      return ImmutableList.of(
         Pair.of(0, new WalkToTargetTask(80, 120)),
         method35591(),
         Pair.of(5, new Class3739()),
         Pair.of(
            5,
            new FirstShuffledTask(
               ImmutableMap.of(MemoryModuleType.field39820, Class2217.field14485),
               ImmutableList.of(
                  Pair.of(Class3696.<LivingEntity>method12551(EntityType.VILLAGER, 8, MemoryModuleType.field39828, var0, 2), 2),
                  Pair.of(Class3696.<LivingEntity>method12551(EntityType.CAT, 8, MemoryModuleType.field39828, var0, 2), 1),
                  Pair.of(new Class3712(var0), 1),
                  Pair.of(new Class3694(var0, 2), 1),
                  Pair.of(new Class3730(var0), 2),
                  Pair.of(new DummyTask(20, 40), 2)
               )
            )
         ),
         Pair.of(99, new Class3708())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35584(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, new StayNearPointTask(MemoryModuleType.field39813, var1, 1, 150, 1200)),
         Pair.of(3, new ExpirePOITask(PointOfInterestType.HOME, MemoryModuleType.field39813)),
         Pair.of(3, new SleepAtHomeTask()),
         Pair.of(
            5,
            new FirstShuffledTask(
               ImmutableMap.of(MemoryModuleType.field39813, Class2217.field14485),
               ImmutableList.of(
                  Pair.of(new WalkToHouseTask(var1), 1), Pair.of(new WalkRandomlyInsideTask(var1), 4), Pair.of(new WalkToPOITask(var1, 4), 2), Pair.of(new DummyTask(20, 40), 2)
               )
            )
         ),
         lookAtPlayerOrVillager(),
         Pair.of(99, new Class3708())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35585(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, new FirstShuffledTask(ImmutableList.of(Pair.of(new Class3726(MemoryModuleType.field39816, 0.4F, 40), 2), Pair.of(new Class3727(), 2)))),
         Pair.of(10, new Class3729(400, 1600)),
         Pair.of(10, new Class3715(EntityType.PLAYER, 4)),
         Pair.of(2, new StayNearPointTask(MemoryModuleType.field39816, var1, 6, 100, 200)),
         Pair.of(3, new Class3717(100)),
         Pair.of(3, new ExpirePOITask(PointOfInterestType.MEETING, MemoryModuleType.field39816)),
         Pair.of(
            3,
            new Class3692(
               ImmutableMap.of(),
               ImmutableSet.of(MemoryModuleType.field39828),
               Class1956.field12749,
               Class2111.field13770,
               ImmutableList.of(Pair.of(new Class3754(), 1))
            )
         ),
         method35591(),
         Pair.of(99, new Class3708())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35586(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new FirstShuffledTask(
               ImmutableList.of(
                  Pair.of(Class3696.<LivingEntity>method12551(EntityType.VILLAGER, 8, MemoryModuleType.field39828, var1, 2), 2),
                  Pair.of(
                     new Class3696<VillagerEntity, Class1045>(EntityType.VILLAGER, 8, Class1045::method4700, Class1045::method4700, MemoryModuleType.field39829, var1, 2),
                     1
                  ),
                  Pair.of(Class3696.<LivingEntity>method12551(EntityType.CAT, 8, MemoryModuleType.field39828, var1, 2), 1),
                  Pair.of(new Class3712(var1), 1),
                  Pair.of(new Class3694(var1, 2), 1),
                  Pair.of(new Class3730(var1), 1),
                  Pair.of(new DummyTask(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new Class3717(100)),
         Pair.of(3, new Class3715(EntityType.PLAYER, 4)),
         Pair.of(3, new Class3729(400, 1600)),
         Pair.of(
            3,
            new Class3692(
               ImmutableMap.of(),
               ImmutableSet.of(MemoryModuleType.field39828),
               Class1956.field12749,
               Class2111.field13770,
               ImmutableList.of(Pair.of(new Class3754(), 1))
            )
         ),
         Pair.of(
            3,
            new Class3692(
               ImmutableMap.of(),
               ImmutableSet.of(MemoryModuleType.field39829),
               Class1956.field12749,
               Class2111.field13770,
               ImmutableList.of(Pair.of(new Class3723(), 1))
            )
         ),
         method35591(),
         Pair.of(99, new Class3708())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35587(VillagerProfession var0, float var1) {
      float var4 = var1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, new Class3750()),
         Pair.of(1, Class3690.method12539(MemoryModuleType.field39838, var4, 6, false)),
         Pair.of(1, Class3690.method12539(MemoryModuleType.field39836, var4, 6, false)),
         Pair.of(3, new Class3712(var4, 2, 2)),
         lookAtPlayerOrVillager()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35588(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new Class3679()),
         Pair.of(
            0,
            new FirstShuffledTask(ImmutableList.of(Pair.of(new StayNearPointTask(MemoryModuleType.field39816, var1 * 1.5F, 2, 150, 200), 6), Pair.of(new Class3712(var1 * 1.5F), 2)))
         ),
         lookAtPlayerOrVillager(),
         Pair.of(99, new ForgetRaidTask())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35589(VillagerProfession var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new FirstShuffledTask(ImmutableList.of(Pair.of(new GoOutsideAfterRaidTask(var1), 5), Pair.of(new FindWalkTargetAfterRaidVictoryTask(var1 * 1.1F), 2)))),
         Pair.of(0, new CelebrateRaidVictoryTask(600, 600)),
         Pair.of(2, new FindHidingPlaceDuringRaidTask(24, var1 * 1.4F)),
         lookAtPlayerOrVillager(),
         Pair.of(99, new ForgetRaidTask())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends Class3676<? super VillagerEntity>>> method35590(VillagerProfession var0, float var1) {
      byte var4 = 2;
      return ImmutableList.of(Pair.of(0, new ExpireHidingTask(15, 3)), Pair.of(1, new FindHidingPlaceTask(32, var1 * 1.25F, 2)), lookAtPlayerOrVillager());
   }

   private static Pair<Integer, Class3676<LivingEntity>> method35591() {
      return Pair.of(
         5,
         new FirstShuffledTask(
            ImmutableList.of(
               Pair.of(new Class3738(EntityType.CAT, 8.0F), 8),
               Pair.of(new Class3738(EntityType.VILLAGER, 8.0F), 2),
               Pair.of(new Class3738(EntityType.PLAYER, 8.0F), 2),
               Pair.of(new Class3738(EntityClassification.CREATURE, 8.0F), 1),
               Pair.of(new Class3738(EntityClassification.WATER_CREATURE, 8.0F), 1),
               Pair.of(new Class3738(EntityClassification.WATER_AMBIENT, 8.0F), 1),
               Pair.of(new Class3738(EntityClassification.MONSTER, 8.0F), 1),
               Pair.of(new DummyTask(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, Class3676<LivingEntity>> lookAtPlayerOrVillager() {
      return Pair.of(
         5,
         new FirstShuffledTask(
            ImmutableList.of(
               Pair.of(new Class3738(EntityType.VILLAGER, 8.0F), 2), Pair.of(new Class3738(EntityType.PLAYER, 8.0F), 2), Pair.of(new DummyTask(30, 60), 8)
            )
         )
      );
   }
}
