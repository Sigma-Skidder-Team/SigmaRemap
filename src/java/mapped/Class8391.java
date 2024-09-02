package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Class8391 {
   private static String[] field35979;
   private BlockState field35980;
   private BlockPos field35981;
   private int field35982 = -1;
   private int field35983 = -1;
   private int field35984 = -1;
   private int field35985 = -1;
   private float[] field35986 = new float[Direction.field685.length * 2];
   private BitSet field35987 = new BitSet(3);
   private Class9529 field35988 = new Class9529();
   private Class2001 field35989 = null;
   private boolean[] field35990 = null;
   private boolean[] field35991 = null;
   private boolean[] field35992 = null;
   private Direction[] field35993 = null;
   private List<Class8557> field35994 = new ArrayList<Class8557>();
   private List<Class8557> field35995 = new ArrayList<Class8557>();
   private Class8557[] field35996 = new Class8557[1];
   private Class8557[] field35997 = new Class8557[2];
   private Class8557[] field35998 = new Class8557[3];
   private Class8557[] field35999 = new Class8557[4];
   private Class7828 field36000 = null;
   private Class9585[] field36001 = new Class9585[RenderType.field21819.length];
   private boolean field36002 = false;
   private Long2ByteLinkedOpenHashMap field36003 = new Long2ByteLinkedOpenHashMap();
   private static final int field36004 = -1;
   private static final int field36005 = 0;
   private static final int field36006 = 1;

   public Class8391(BlockState var1, BlockPos var2) {
      this.field35980 = var1;
      this.field35981 = var2;
   }

   public void method29411(BlockState var1, BlockPos var2) {
      if (this.field35980 != var1 || this.field35981 != var2) {
         this.field35980 = var1;
         this.field35981 = var2;
         this.field35982 = -1;
         this.field35983 = -1;
         this.field35984 = -1;
         this.field35985 = -1;
         this.field35987.clear();
      }
   }

   public int method29412() {
      if (this.field35982 < 0) {
         this.field35982 = this.field35980.method23490();
      }

      return this.field35982;
   }

   public int method29413() {
      if (this.field35983 < 0) {
         this.field35983 = this.field35980.method23491();
      }

      return this.field35983;
   }

   public float[] method29414() {
      return this.field35986;
   }

   public BitSet method29415() {
      return this.field35987;
   }

   public Class9529 method29416() {
      return this.field35988;
   }

   public boolean method29417(List var1) {
      if (this.field35984 == -1 && var1.size() > 0) {
         if (!(var1.get(0) instanceof Class8558)) {
            this.field35984 = 0;
         } else {
            this.field35984 = 1;
         }
      }

      return this.field35984 == 1;
   }

   public boolean method29418(Class8557 var1) {
      if (this.field35984 < 0) {
         if (!(var1 instanceof Class8558)) {
            this.field35984 = 0;
         } else {
            this.field35984 = 1;
         }
      }

      return this.field35984 == 1;
   }

   public boolean method29419() {
      return this.field35984 == 1;
   }

   public BlockState method29420() {
      return this.field35980;
   }

   public Class2001 method29421() {
      if (this.field35989 == null) {
         this.field35989 = new Class2001(0, 0, 0);
      }

      return this.field35989;
   }

   public boolean[] method29422() {
      if (this.field35990 == null) {
         this.field35990 = new boolean[4];
      }

      return this.field35990;
   }

   public boolean[] method29423() {
      if (this.field35991 == null) {
         this.field35991 = new boolean[4];
      }

      return this.field35991;
   }

   public boolean[] method29424() {
      if (this.field35992 == null) {
         this.field35992 = new boolean[4];
      }

      return this.field35992;
   }

   public Direction[] method29425() {
      if (this.field35993 == null) {
         this.field35993 = new Direction[4];
      }

      return this.field35993;
   }

   public Direction[] method29426(Direction var1, Direction var2, Direction var3, Direction var4) {
      Direction[] var7 = this.method29425();
      var7[0] = var1;
      var7[1] = var2;
      var7[2] = var3;
      var7[3] = var4;
      return var7;
   }

   public boolean method29427() {
      if (this.field35985 == -1) {
         if (Class7944.method26827() && this.field35980.getBlock() instanceof Class3465) {
            this.field35985 = 1;
         } else {
            this.field35985 = 0;
         }
      }

      return this.field35985 == 1;
   }

   public List<Class8557> method29428() {
      return this.field35994;
   }

   public Class8557[] method29429(Class8557 var1) {
      this.field35996[0] = var1;
      return this.field35996;
   }

   public Class8557[] method29430(Class8557 var1, Class8557 var2) {
      this.field35997[0] = var1;
      this.field35997[1] = var2;
      return this.field35997;
   }

   public Class8557[] method29431(Class8557 var1, Class8557 var2, Class8557 var3) {
      this.field35998[0] = var1;
      this.field35998[1] = var2;
      this.field35998[2] = var3;
      return this.field35998;
   }

   public Class8557[] method29432(Class8557 var1, Class8557 var2, Class8557 var3, Class8557 var4) {
      this.field35999[0] = var1;
      this.field35999[1] = var2;
      this.field35999[2] = var3;
      this.field35999[3] = var4;
      return this.field35999;
   }

   public List<Class8557> method29433(Class8557[] var1) {
      this.field35995.clear();
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class8557 var5 = var1[var4];
            this.field35995.add(var5);
         }
      }

      return this.field35995;
   }

   public Class7828 method29434() {
      return this.field36000;
   }

   public void method29435(Class7828 var1) {
      this.field36000 = var1;
   }

   public Class9585 method29436(RenderType var1) {
      Class9585 var4 = this.field36001[var1.method14297()];
      if (var4 == null) {
         var4 = new Class9585();
         this.field36001[var1.method14297()] = var4;
      }

      return var4;
   }

   public boolean method29437() {
      return this.field36002;
   }

   public void method29438(boolean var1) {
      this.field36002 = var1;
   }

   public Long2ByteLinkedOpenHashMap method29439() {
      return this.field36003;
   }
}
