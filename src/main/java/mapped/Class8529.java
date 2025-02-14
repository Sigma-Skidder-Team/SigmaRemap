package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.ColumnPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;

public final class Class8529 {
   private static String[] field38311;
   public static final Class4703 field38312 = new Class8326(new Class6700(Class7700.field32994), SimpleBlockPlacer.field27597).method29191(32).method29198();
   public static final Class4703 field38313 = new Class8326(
         new Class6699().method20427(Class7700.field32994, 1).method20427(Class7700.field32995, 4), SimpleBlockPlacer.field27597
      )
      .method29191(32)
      .method29198();
   public static final Class4703 field38314 = new Class8326(
         new Class6699().method20427(Class7700.field32994, 3).method20427(Class7700.field32995, 1), SimpleBlockPlacer.field27597
      )
      .method29190(ImmutableSet.of(Class7700.field32996))
      .method29191(32)
      .method29198();
   public static final Class4703 field38315 = new Class8326(
         new Class6699().method20427(Class7700.field33025, 2).method20427(Class7700.field33026, 1), SimpleBlockPlacer.field27597
      )
      .method29191(64)
      .method29198();
   public static final Class4703 field38316 = new Class8326(new Class6700(Class7700.field33027), SimpleBlockPlacer.field27597).method29191(4).method29198();
   public static final Class4703 field38317 = new Class8326(new Class6700(Class7700.field33030), SimpleBlockPlacer.field27597)
      .method29191(64)
      .method29189(ImmutableSet.of(Class7700.field33013.getBlock()))
      .method29196()
      .method29198();
   public static final Class4703 field38318 = new Class8326(new Class6700(Class7700.field33015), new DoublePlantPlacer()).method29191(64).method29196().method29198();
   public static final Class4703 field38319 = new Class8326(new Class6700(Class7700.field33041), new ColumnPlacer(2, 2))
      .method29191(20)
      .method29192(4)
      .method29193(0)
      .method29194(4)
      .method29196()
      .method29197()
      .method29198();
   public static final Class4697 field38320 = new Class4697(
      Class7700.field33046, true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)
   );
   public static final Class4697 field38321 = new Class4697(Class7700.field33046, false, 5, 0, ImmutableSet.of(Blocks.NETHERRACK));
   public static final Class4710 field38322 = new Class4710(
      new Class6699().method20427(Class7700.field33035, 87).method20427(Class7700.field33074, 11).method20427(Class7700.field33075, 1)
   );
   public static final Class4710 field38323 = new Class4710(
      new Class6699()
         .method20427(Class7700.field33076, 85)
         .method20427(Class7700.field33035, 1)
         .method20427(Class7700.field33075, 13)
         .method20427(Class7700.field33074, 1)
   );
   public static final Class4710 field38324 = new Class4710(new Class6700(Class7700.field33077));
}
