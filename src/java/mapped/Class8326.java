package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;

import java.util.Set;

public class Class8326 {
   private static String[] field35775;
   private final Class6698 field35776;
   private final Class6166 field35777;
   private Set<Block> field35778 = ImmutableSet.of();
   private Set<BlockState> field35779 = ImmutableSet.of();
   private int field35780 = 64;
   private int field35781 = 7;
   private int field35782 = 3;
   private int field35783 = 7;
   private boolean field35784;
   private boolean field35785 = true;
   private boolean field35786 = false;

   public Class8326(Class6698 var1, Class6166 var2) {
      this.field35776 = var1;
      this.field35777 = var2;
   }

   public Class8326 method29189(Set<Block> var1) {
      this.field35778 = var1;
      return this;
   }

   public Class8326 method29190(Set<BlockState> var1) {
      this.field35779 = var1;
      return this;
   }

   public Class8326 method29191(int var1) {
      this.field35780 = var1;
      return this;
   }

   public Class8326 method29192(int var1) {
      this.field35781 = var1;
      return this;
   }

   public Class8326 method29193(int var1) {
      this.field35782 = var1;
      return this;
   }

   public Class8326 method29194(int var1) {
      this.field35783 = var1;
      return this;
   }

   public Class8326 method29195() {
      this.field35784 = true;
      return this;
   }

   public Class8326 method29196() {
      this.field35785 = false;
      return this;
   }

   public Class8326 method29197() {
      this.field35786 = true;
      return this;
   }

   public Class4703 method29198() {
      return new Class4703(
         this.field35776,
         this.field35777,
         this.field35778,
         this.field35779,
         this.field35780,
         this.field35781,
         this.field35782,
         this.field35783,
         this.field35784,
         this.field35785,
         this.field35786
      );
   }
}
