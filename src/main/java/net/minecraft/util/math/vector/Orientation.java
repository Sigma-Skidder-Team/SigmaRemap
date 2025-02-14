package net.minecraft.util.math.vector;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import net.minecraft.util.TriplePermutation;
import mapped.Class9825;
import net.minecraft.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.gen.feature.jigsaw.JigsawOrientation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Orientation implements IStringSerializable {
   IDENTITY("identity", TriplePermutation.P123, false, false, false),
   ROT_180_FACE_XY("rot_180_face_xy", TriplePermutation.P123, true, true, false),
   ROT_180_FACE_XZ("rot_180_face_xz", TriplePermutation.P123, true, false, true),
   ROT_180_FACE_YZ("rot_180_face_yz", TriplePermutation.P123, false, true, true),
   ROT_120_NNN("rot_120_nnn", TriplePermutation.P231, false, false, false),
   ROT_120_NNP("rot_120_nnp", TriplePermutation.P312, true, false, true),
   ROT_120_NPN("rot_120_npn", TriplePermutation.P312, false, true, true),
   ROT_120_NPP("rot_120_npp", TriplePermutation.P231, true, false, true),
   ROT_120_PNN("rot_120_pnn", TriplePermutation.P312, true, true, false),
   ROT_120_PNP("rot_120_pnp", TriplePermutation.P231, true, true, false),
   ROT_120_PPN("rot_120_ppn", TriplePermutation.P231, false, true, true),
   ROT_120_PPP("rot_120_ppp", TriplePermutation.P312, false, false, false),
   ROT_180_EDGE_XY_NEG("rot_180_edge_xy_neg", TriplePermutation.P213, true, true, true),
   ROT_180_EDGE_XY_POS("rot_180_edge_xy_pos", TriplePermutation.P213, false, false, true),
   ROT_180_EDGE_XZ_NEG("rot_180_edge_xz_neg", TriplePermutation.P321, true, true, true),
   ROT_180_EDGE_XZ_POS("rot_180_edge_xz_pos", TriplePermutation.P321, false, true, false),
   ROT_180_EDGE_YZ_NEG("rot_180_edge_yz_neg", TriplePermutation.P132, true, true, true),
   ROT_180_EDGE_YZ_POS("rot_180_edge_yz_pos", TriplePermutation.P132, true, false, false),
   ROT_90_X_NEG("rot_90_x_neg", TriplePermutation.P132, false, false, true),
   ROT_90_X_POS("rot_90_x_pos", TriplePermutation.P132, false, true, false),
   ROT_90_Y_NEG("rot_90_y_neg", TriplePermutation.P321, true, false, false),
   ROT_90_Y_POS("rot_90_y_pos", TriplePermutation.P321, false, false, true),
   ROT_90_Z_NEG("rot_90_z_neg", TriplePermutation.P213, false, true, false),
   ROT_90_Z_POS("rot_90_z_pos", TriplePermutation.P213, true, false, false),
   INVERSION("inversion", TriplePermutation.P123, true, true, true),
   INVERT_X("invert_x", TriplePermutation.P123, true, false, false),
   INVERT_Y("invert_y", TriplePermutation.P123, false, true, false),
   INVERT_Z("invert_z", TriplePermutation.P123, false, false, true),
   ROT_60_REF_NNN("rot_60_ref_nnn", TriplePermutation.P312, true, true, true),
   ROT_60_REF_NNP("rot_60_ref_nnp", TriplePermutation.P231, true, false, false),
   ROT_60_REF_NPN("rot_60_ref_npn", TriplePermutation.P231, false, false, true),
   ROT_60_REF_NPP("rot_60_ref_npp", TriplePermutation.P312, false, false, true),
   ROT_60_REF_PNN("rot_60_ref_pnn", TriplePermutation.P231, false, true, false),
   ROT_60_REF_PNP("rot_60_ref_pnp", TriplePermutation.P312, true, false, false),
   ROT_60_REF_PPN("rot_60_ref_ppn", TriplePermutation.P312, false, true, false),
   ROT_60_REF_PPP("rot_60_ref_ppp", TriplePermutation.P231, true, true, true),
   SWAP_XY("swap_xy", TriplePermutation.P213, false, false, false),
   SWAP_YZ("swap_yz", TriplePermutation.P132, false, false, false),
   SWAP_XZ("swap_xz", TriplePermutation.P321, false, false, false),
   SWAP_NEG_XY("swap_neg_xy", TriplePermutation.P213, true, true, false),
   SWAP_NEG_YZ("swap_neg_yz", TriplePermutation.P132, false, true, true),
   SWAP_NEG_XZ("swap_neg_xz", TriplePermutation.P321, true, false, true),
   ROT_90_REF_X_NEG("rot_90_ref_x_neg", TriplePermutation.P132, true, false, true),
   ROT_90_REF_X_POS("rot_90_ref_x_pos", TriplePermutation.P132, true, true, false),
   ROT_90_REF_Y_NEG("rot_90_ref_y_neg", TriplePermutation.P321, true, true, false),
   ROT_90_REF_Y_POS("rot_90_ref_y_pos", TriplePermutation.P321, false, true, true),
   ROT_90_REF_Z_NEG("rot_90_ref_z_neg", TriplePermutation.P213, false, true, true),
   ROT_90_REF_Z_POS("rot_90_ref_z_pos", TriplePermutation.P213, true, false, true);

   private final Matrix3f field613;
   private final String field614;
   private Map<Direction, Direction> field615;
   private final boolean field616;
   private final boolean field617;
   private final boolean field618;
   private final TriplePermutation field619;
   private static final Orientation[][] field620 = Util.make(new Orientation[values().length][values().length], var0 -> {
      Map<Pair<TriplePermutation, BooleanList>, Orientation> var3 = Arrays.stream(values()).collect(Collectors.toMap(var0x -> Pair.of(var0x.field619, var0x.method506()), var0x -> (Orientation)var0x));

      for (Orientation var7 : values()) {
         for (Orientation var11 : values()) {
            BooleanList var12 = var7.method506();
            BooleanList var13 = var11.method506();
            TriplePermutation var14 = var11.field619.method8985(var7.field619);
            BooleanArrayList var15 = new BooleanArrayList(3);

            for (int var16 = 0; var16 < 3; var16++) {
               var15.add(var12.getBoolean(var16) ^ var13.getBoolean(var7.field619.method8986(var16)));
            }

            var0[var7.ordinal()][var11.ordinal()] = (Orientation)var3.get(Pair.of(var14, var15));
         }
      }
   });

   Orientation(String var3, TriplePermutation var4, boolean var5, boolean var6, boolean var7) {
      this.field614 = var3;
      this.field616 = var5;
      this.field617 = var6;
      this.field618 = var7;
      this.field619 = var4;
      this.field613 = new Matrix3f();
      this.field613.field40499 = !var5 ? 1.0F : -1.0F;
      this.field613.field40503 = !var6 ? 1.0F : -1.0F;
      this.field613.field40507 = !var7 ? 1.0F : -1.0F;
      this.field613.method32828(var4.method8987());
   }

   private BooleanList method506() {
      return new BooleanArrayList(new boolean[]{this.field616, this.field617, this.field618});
   }

   public Orientation method507(Orientation var1) {
      return field620[this.ordinal()][var1.ordinal()];
   }

   @Override
   public String toString() {
      return this.field614;
   }

   @Override
   public String getString() {
      return this.field614;
   }

   public Direction method508(Direction var1) {
      if (this.field615 == null) {
         this.field615 = Maps.newEnumMap(Direction.class);

         for (Direction var7 : Direction.values()) {
            Direction.Axis var8 = var7.getAxis();
            Direction.AxisDirection var9 = var7.getAxisDirection();
            Direction.Axis var10 = Direction.Axis.values()[this.field619.method8986(var8.ordinal())];
            Direction.AxisDirection var11 = !this.method509(var10) ? var9 : var9.inverted();
            Direction var12 = Direction.getFacingFromAxisDirection(var10, var11);
            this.field615.put(var7, var12);
         }
      }

      return this.field615.get(var1);
   }

   public boolean method509(Direction.Axis var1) {
      switch (Class9825.field45904[var1.ordinal()]) {
         case 1:
            return this.field616;
         case 2:
            return this.field617;
         case 3:
         default:
            return this.field618;
      }
   }

   public JigsawOrientation method510(JigsawOrientation var1) {
      return JigsawOrientation.method526(this.method508(var1.method527()), this.method508(var1.method528()));
   }
}
