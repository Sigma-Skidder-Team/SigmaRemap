package mapped;

import com.google.common.collect.ImmutableMap;
import com.mentalfrostbyte.jello.event.impl.Class4424;
import com.mojang.serialization.MapCodec;
import com.mentalfrostbyte.jello.Client;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class Class7377 extends Class7378<Block, Class7380> {
   private final int field31564;
   private final boolean field31565;
   private final boolean field31566;
   private final Class8649 field31567;
   private final Class7210 field31568;
   private final float field31569;
   private final boolean field31570;
   private final boolean field31571;
   private final Class8609 field31572;
   private final Class8609 field31573;
   private final Class8609 field31574;
   private final Class8609 field31575;
   private final Class8609 field31576;
   public Class6486 field31577;

   public Class7377(Block var1, ImmutableMap<Class8550<?>, Comparable<?>> var2, MapCodec<Class7380> var3) {
      super(var1, var2, var3);
      AbstractBlock var6 = var1.field19013;
      this.field31564 = AbstractBlock.method26654(var6).applyAsInt(this.method23457());
      this.field31565 = var1.method11534(this.method23457());
      this.field31566 = AbstractBlock.method26655(var6);
      this.field31567 = AbstractBlock.method26643(var6);
      this.field31568 = (Class7210) AbstractBlock.method26653(var6).apply(this.method23457());
      this.field31569 = AbstractBlock.method26656(var6);
      this.field31570 = AbstractBlock.method26657(var6);
      this.field31571 = AbstractBlock.method26658(var6);
      this.field31572 = AbstractBlock.method26659(var6);
      this.field31573 = AbstractBlock.method26660(var6);
      this.field31574 = AbstractBlock.method26661(var6);
      this.field31575 = AbstractBlock.method26662(var6);
      this.field31576 = AbstractBlock.method26663(var6);
   }

   public void method23382() {
      if (!this.method23383().method11582()) {
         this.field31577 = new Class6486(this.method23457());
      }
   }

   public Block method23383() {
      return this.field31579;
   }

   public Class8649 method23384() {
      return this.field31567;
   }

   public boolean method23385(Class1665 var1, BlockPos var2, Class8992<?> var3) {
      return AbstractBlock.method26664(this.method23383().field19013).method38752(this.method23457(), var1, var2, var3);
   }

   public boolean method23386(Class1665 var1, BlockPos var2) {
      return this.field31577 == null ? this.method23383().method11493(this.method23457(), var1, var2) : Class6486.method19652(this.field31577);
   }

   public int method23387(Class1665 var1, BlockPos var2) {
      return this.field31577 == null ? this.method23383().method11996(this.method23457(), var1, var2) : Class6486.method19653(this.field31577);
   }

   public Class6408 method23388(Class1665 var1, BlockPos var2, Direction var3) {
      return this.field31577 != null && Class6486.method19654(this.field31577) != null
         ? Class6486.method19654(this.field31577)[var3.ordinal()]
         : Class8022.method27442(this.method23389(var1, var2), var3);
   }

   public Class6408 method23389(Class1665 var1, BlockPos var2) {
      return this.method23383().method11503(this.method23457(), var1, var2);
   }

   public boolean method23390() {
      return this.field31577 == null || this.field31577.field28443;
   }

   public boolean method23391() {
      return this.field31565;
   }

   public int method23392() {
      Class4424 var3 = new Class4424(this);
      Client.getInstance().getEventManager().call(var3);
      return !var3.method13971() ? this.field31564 : 1;
   }

   public boolean method23393() {
      return this.field31566;
   }

   public Class7210 method23394(Class1665 var1, BlockPos var2) {
      return this.field31568;
   }

   public Class7380 method23395(Class80 var1) {
      return this.method23383().method11500(this.method23457(), var1);
   }

   public Class7380 method23396(Class2089 var1) {
      return this.method23383().method11501(this.method23457(), var1);
   }

   public Class1855 method23397() {
      return this.method23383().method11526(this.method23457());
   }

   public boolean method23398(Class1665 var1, BlockPos var2) {
      return this.field31576.method30847(this.method23457(), var1, var2);
   }

   public float method23399(Class1665 var1, BlockPos var2) {
      return this.method23383().method11636(this.method23457(), var1, var2);
   }

   public boolean method23400(Class1665 var1, BlockPos var2) {
      return this.field31572.method30847(this.method23457(), var1, var2);
   }

   public boolean method23401() {
      return this.method23383().method11516(this.method23457());
   }

   public int method23402(Class1665 var1, BlockPos var2, Direction var3) {
      return this.method23383().method11514(this.method23457(), var1, var2, var3);
   }

   public boolean method23403() {
      return this.method23383().method11648(this.method23457());
   }

   public int method23404(Class1655 var1, BlockPos var2) {
      return this.method23383().method11649(this.method23457(), var1, var2);
   }

   public float method23405(Class1665 var1, BlockPos var2) {
      return this.field31569;
   }

   public float method23406(PlayerEntity var1, Class1665 var2, BlockPos var3) {
      return this.method23383().method11997(this.method23457(), var1, var2, var3);
   }

   public int method23407(Class1665 var1, BlockPos var2, Direction var3) {
      return this.method23383().method11515(this.method23457(), var1, var2, var3);
   }

   public Class2315 method23408() {
      return this.method23383().method11689(this.method23457());
   }

   public boolean method23409(Class1665 var1, BlockPos var2) {
      if (this.field31577 == null) {
         Class7380 var5 = this.method23457();
         return !var5.method23410() ? false : Block.method11550(var5.method23389(var1, var2));
      } else {
         return this.field31577.field28438;
      }
   }

   public boolean method23410() {
      return this.field31571;
   }

   public boolean method23411(Class7380 var1, Direction var2) {
      return this.method23383().method11634(this.method23457(), var1, var2);
   }

   public Class6408 method23412(Class1665 var1, BlockPos var2) {
      return this.method23413(var1, var2, Class4832.method14947());
   }

   public Class6408 method23413(Class1665 var1, BlockPos var2, Class4832 var3) {
      return this.method23383().method11483(this.method23457(), var1, var2, var3);
   }

   public Class6408 method23414(Class1665 var1, BlockPos var2) {
      return this.field31577 == null ? this.method23415(var1, var2, Class4832.method14947()) : this.field31577.field28442;
   }

   public Class6408 method23415(Class1665 var1, BlockPos var2, Class4832 var3) {
      return this.method23383().method11502(this.method23457(), var1, var2, var3);
   }

   public Class6408 method23416(Class1665 var1, BlockPos var2) {
      return this.method23383().method11995(this.method23457(), var1, var2);
   }

   public Class6408 method23417(Class1665 var1, BlockPos var2, Class4832 var3) {
      return this.method23383().method11635(this.method23457(), var1, var2, var3);
   }

   public Class6408 method23418(Class1665 var1, BlockPos var2) {
      return this.method23383().method11938(this.method23457(), var1, var2);
   }

   public final boolean method23419(Class1665 var1, BlockPos var2, Entity var3) {
      return this.method23420(var1, var2, var3, Direction.field673);
   }

   public final boolean method23420(Class1665 var1, BlockPos var2, Entity var3, Direction var4) {
      return Block.method11549(this.method23415(var1, var2, Class4832.method14948(var3)), var4);
   }

   public Vector3d method23421(Class1665 var1, BlockPos var2) {
      Class2260 var5 = this.method23383().method11994();
      if (var5 != Class2260.field14702) {
         long var6 = Class9679.method37810(var2.method8304(), 0, var2.method8306());
         return new Vector3d(
            ((double)((float)(var6 & 15L) / 15.0F) - 0.5) * 0.5,
            var5 != Class2260.field14704 ? 0.0 : ((double)((float)(var6 >> 4 & 15L) / 15.0F) - 1.0) * 0.2,
            ((double)((float)(var6 >> 8 & 15L) / 15.0F) - 0.5) * 0.5
         );
      } else {
         return Vector3d.field18047;
      }
   }

   public boolean method23422(Class1655 var1, BlockPos var2, int var3, int var4) {
      return this.method23383().method11647(this.method23457(), var1, var2, var3, var4);
   }

   public void method23423(Class1655 var1, BlockPos var2, Block var3, BlockPos var4, boolean var5) {
      this.method23383().method11506(this.method23457(), var1, var2, var3, var4, var5);
   }

   public final void method23424(Class1660 var1, BlockPos var2, int var3) {
      this.method23425(var1, var2, var3, 512);
   }

   public final void method23425(Class1660 var1, BlockPos var2, int var3, int var4) {
      this.method23383();
      Mutable var7 = new Mutable();

      for (Direction var11 : Class3390.field19003) {
         var7.method8377(var2, var11);
         Class7380 var12 = var1.method6738(var7);
         Class7380 var13 = var12.method23439(var11.method536(), this.method23457(), var1, var7, var2);
         Block.method11544(var12, var13, var1, var7, var3, var4);
      }
   }

   public final void method23426(Class1660 var1, BlockPos var2, int var3) {
      this.method23427(var1, var2, var3, 512);
   }

   public void method23427(Class1660 var1, BlockPos var2, int var3, int var4) {
      this.method23383().method11618(this.method23457(), var1, var2, var3, var4);
   }

   public void method23428(Class1655 var1, BlockPos var2, Class7380 var3, boolean var4) {
      this.method23383().method11589(this.method23457(), var1, var2, var3, var4);
   }

   public void method23429(Class1655 var1, BlockPos var2, Class7380 var3, boolean var4) {
      this.method23383().method11513(this.method23457(), var1, var2, var3, var4);
   }

   public void method23430(Class1657 var1, BlockPos var2, Random var3) {
      this.method23383().method11522(this.method23457(), var1, var2, var3);
   }

   public void method23431(Class1657 var1, BlockPos var2, Random var3) {
      this.method23383().method11484(this.method23457(), var1, var2, var3);
   }

   public void method23432(Class1655 var1, BlockPos var2, Entity var3) {
      this.method23383().method11523(this.method23457(), var1, var2, var3);
   }

   public void method23433(Class1657 var1, BlockPos var2, Class8848 var3) {
      this.method23383().method11965(this.method23457(), var1, var2, var3);
   }

   public List<Class8848> method23434(Class9464 var1) {
      return this.method23383().method11697(this.method23457(), var1);
   }

   public Class2274 method23435(Class1655 var1, PlayerEntity var2, Class79 var3, Class8711 var4) {
      return this.method23383().method11505(this.method23457(), var1, var4.method31423(), var2, var3, var4);
   }

   public void method23436(Class1655 var1, BlockPos var2, PlayerEntity var3) {
      this.method23383().method11602(this.method23457(), var1, var2, var3);
   }

   public boolean method23437(Class1665 var1, BlockPos var2) {
      return this.field31573.method30847(this.method23457(), var1, var2);
   }

   public boolean method23438(Class1665 var1, BlockPos var2) {
      return this.field31574.method30847(this.method23457(), var1, var2);
   }

   public Class7380 method23439(Direction var1, Class7380 var2, Class1660 var3, BlockPos var4, BlockPos var5) {
      return this.method23383().method11491(this.method23457(), var1, var2, var3, var4, var5);
   }

   public boolean method23440(Class1665 var1, BlockPos var2, Class1947 var3) {
      return this.method23383().method11494(this.method23457(), var1, var2, var3);
   }

   public boolean method23441(Class5909 var1) {
      return this.method23383().method11497(this.method23457(), var1);
   }

   public boolean method23442(Class7631 var1) {
      return this.method23383().method11650(this.method23457(), var1);
   }

   public boolean method23443(Class1662 var1, BlockPos var2) {
      return this.method23383().method11492(this.method23457(), var1, var2);
   }

   public boolean method23444(Class1665 var1, BlockPos var2) {
      return this.field31575.method30847(this.method23457(), var1, var2);
   }

   @Nullable
   public Class949 method23445(Class1655 var1, BlockPos var2) {
      return this.method23383().method11528(this.method23457(), var1, var2);
   }

   public boolean method23446(Class7608<Block> var1) {
      return this.method23383().method11540(var1);
   }

   public boolean method23447(Class7608<Block> var1, Predicate<Class7377> var2) {
      return this.method23383().method11540(var1) && var2.test(this);
   }

   public boolean method23448(Block var1) {
      return this.method23383().method11541(var1);
   }

   public Class7379 method23449() {
      return this.method23383().method11498(this.method23457());
   }

   public boolean method23450() {
      return this.method23383().method11499(this.method23457());
   }

   public long method23451(BlockPos var1) {
      return this.method23383().method11691(this.method23457(), var1);
   }

   public Class8447 method23452() {
      return this.method23383().method11580(this.method23457());
   }

   public void method23453(Class1655 var1, Class7380 var2, Class8711 var3, Class882 var4) {
      this.method23383().method11595(var1, var2, var3, var4);
   }

   public boolean method23454(Class1665 var1, BlockPos var2, Direction var3) {
      return this.method23455(var1, var2, var3, Class2156.field14140);
   }

   public boolean method23455(Class1665 var1, BlockPos var2, Direction var3, Class2156 var4) {
      return this.field31577 == null ? var4.method8876(this.method23457(), var1, var2, var3) : this.field31577.method19649(var3, var4);
   }

   public boolean method23456(Class1665 var1, BlockPos var2) {
      return this.field31577 == null ? Block.method11550(this.method23414(var1, var2)) : this.field31577.field28445;
   }

   public abstract Class7380 method23457();

   public boolean method23458() {
      return this.field31570;
   }
}
