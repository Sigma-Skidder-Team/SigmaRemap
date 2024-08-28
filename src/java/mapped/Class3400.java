package mapped;

import com.google.common.base.Predicates;

public class Class3400 extends Block {
   public static final Class8553 field19053 = Class3198.field18484;
   public static final Class8551 field19054 = Class8820.field39689;
   public static final Class6408 field19055 = Block.method11539(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   public static final Class6408 field19056 = Block.method11539(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   public static final Class6408 field19057 = Class8022.method27431(field19055, field19056);
   private static Class9803 field19058;

   public Class3400(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19053, Direction.NORTH).method23465(field19054, Boolean.valueOf(false)));
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return !var1.<Boolean>method23463(field19054) ? field19055 : field19057;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field19053, var1.method18350().method536()).method23465(field19054, Boolean.valueOf(false));
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return !var1.<Boolean>method23463(field19054) ? 0 : 15;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field19053, var2.method252(var1.<Direction>method23463(field19053)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19053)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19053, field19054);
   }

   public static Class9803 method12029() {
      if (field19058 == null) {
         field19058 = Class9659.method37706()
            .method37705("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .method37707('?', Class9632.method37552(Class166.field534))
            .method37707(
               '^',
               Class9632.method37552(
                  Class166.method497(Blocks.field36650)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.SOUTH))
               )
            )
            .method37707(
               '>',
               Class9632.method37552(
                  Class166.method497(Blocks.field36650)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.WEST))
               )
            )
            .method37707(
               'v',
               Class9632.method37552(
                  Class166.method497(Blocks.field36650)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.NORTH))
               )
            )
            .method37707(
               '<',
               Class9632.method37552(
                  Class166.method497(Blocks.field36650)
                     .method499(field19054, Predicates.equalTo(true))
                     .method499(field19053, Predicates.equalTo(Direction.EAST))
               )
            )
            .method37708();
      }

      return field19058;
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
