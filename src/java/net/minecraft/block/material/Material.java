package net.minecraft.block.material;

import mapped.MaterialColor;

public final class Material {
   private static String[] field38931;
   public static final Material field38932 = Builder.method30894(new Builder(MaterialColor.AIR).method30887())
      .method30886()
      .method30890()
      .build();
   public static final Material field38933 = Builder.method30894(new Builder(MaterialColor.AIR).method30887())
      .method30886()
      .method30890()
      .build();
   public static final Material field38934 = Builder.method30894(new Builder(MaterialColor.AIR).method30887())
      .method30886()
      .pushBlocks()
      .build();
   public static final Material field38935 = Builder.method30894(new Builder(MaterialColor.field30950).method30887())
      .method30886()
      .notOpaque()
      .build();
   public static final Material PLANTS = Builder.method30894(new Builder(MaterialColor.FOLIAGE).method30887())
      .method30886()
      .pushDestroys()
      .build();
   public static final Material field38937 = Builder.method30894(new Builder(MaterialColor.field30959).method30887())
      .method30886()
      .pushDestroys()
      .build();
   public static final Material TALL_PLANTS = Builder.method30894(new Builder(MaterialColor.FOLIAGE).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .notOpaque()
      .build();
   public static final Material field38939 = Builder.method30894(new Builder(MaterialColor.FOLIAGE).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .build();
   public static final Material field38940 = Builder.method30894(new Builder(MaterialColor.field30959).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .build();
   public static final Material field38941 = Builder.method30894(new Builder(MaterialColor.field30959).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .method30885()
      .build();
   public static final Material field38942 = Builder.method30894(new Builder(MaterialColor.field30959).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .method30885()
      .build();
   public static final Material field38943 = Builder.method30894(new Builder(MaterialColor.field30951).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .method30885()
      .build();
   public static final Material field38944 = Builder.method30894(new Builder(MaterialColor.SNOW).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .build();
   public static final Material field38945 = Builder.method30894(new Builder(MaterialColor.AIR).method30887())
      .method30886()
      .pushDestroys()
      .method30890()
      .build();
   public static final Material field38946 = Builder.method30894(new Builder(MaterialColor.AIR).method30887())
      .method30886()
      .pushDestroys()
      .build();
   public static final Material field38947 = Builder.method30894(new Builder(MaterialColor.field30950).method30887()).pushDestroys().build();
   public static final Material field38948 = new Builder(MaterialColor.AIR).build();
   public static final Material field38949 = new Builder(MaterialColor.field30956).build();
   public static final Material field38950 = new Builder(MaterialColor.field30957).build();
   public static final Material field38951 = new Builder(MaterialColor.field30948).build();
   public static final Material field38952 = new Builder(MaterialColor.field30952).build();
   public static final Material field38953 = new Builder(MaterialColor.field30949).build();
   public static final Material field38954 = new Builder(MaterialColor.field30965).build();
   public static final Material field38955 = new Builder(MaterialColor.field30971).build();
   public static final Material field38956 = new Builder(MaterialColor.field30960).notOpaque().build();
   public static final Material field38957 = new Builder(MaterialColor.field30960).build();
   public static final Material field38958 = new Builder(MaterialColor.field30960).notOpaque().pushDestroys().method30887().build();
   public static final Material field38959 = new Builder(MaterialColor.field30960).notOpaque().pushDestroys().build();
   public static final Material field38960 = new Builder(MaterialColor.field30950).notOpaque().build();
   public static final Material field38961 = Builder.method30894(new Builder(MaterialColor.field30951).notOpaque()).build();
   public static final Material field38962 = Builder.method30894(new Builder(MaterialColor.FOLIAGE).notOpaque()).pushDestroys().build();
   public static final Material field38963 = Builder.method30894(new Builder(MaterialColor.AIR)).build();
   public static final Material ICE = Builder.method30894(new Builder(MaterialColor.field30952)).build();
   public static final Material field38965 = Builder.method30894(new Builder(MaterialColor.FOLIAGE)).pushDestroys().build();
   public static final Material field38966 = new Builder(MaterialColor.STONE).build();
   public static final Material field38967 = new Builder(MaterialColor.IRON).build();
   public static final Material SNOW_BLOCK = new Builder(MaterialColor.SNOW).build();
   public static final Material ANVIL = new Builder(MaterialColor.IRON).pushBlocks().build();
   public static final Material BARRIER = new Builder(MaterialColor.AIR).pushBlocks().build();
   public static final Material PISTON = new Builder(MaterialColor.STONE).pushBlocks().build();
   public static final Material CORAL = new Builder(MaterialColor.FOLIAGE).pushDestroys().build();
   public static final Material GOURD = new Builder(MaterialColor.FOLIAGE).pushDestroys().build();
   public static final Material DRAGON_EGG = new Builder(MaterialColor.FOLIAGE).pushDestroys().build();
   public static final Material CAKE = new Builder(MaterialColor.AIR).pushDestroys().build();
   private final MaterialColor color;
   private final PushReaction pushReaction;
   private final boolean blocksMovement;
   private final boolean flammable;
   private final boolean isLiquid;
   private final boolean isOpaque;
   private final boolean replaceable;
   private final boolean isSolid;

   public Material(MaterialColor var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, PushReaction var8) {
      this.color = var1;
      this.isLiquid = var2;
      this.isSolid = var3;
      this.blocksMovement = var4;
      this.isOpaque = var5;
      this.flammable = var6;
      this.replaceable = var7;
      this.pushReaction = var8;
   }

   public boolean isLiquid() {
      return this.isLiquid;
   }

   public boolean isSolid() {
      return this.isSolid;
   }

   public boolean blocksMovement() {
      return this.blocksMovement;
   }

   public boolean isFlammable() {
      return this.flammable;
   }

   public boolean isReplaceable() {
      return this.replaceable;
   }

   public boolean isOpaque() {
      return this.isOpaque;
   }

   public PushReaction getPushReaction() {
      return this.pushReaction;
   }

   public MaterialColor getColor() {
      return this.color;
   }

   public static class Builder {
       private PushReaction field38756 = PushReaction.field15862;
      private boolean field38757 = true;
      private boolean field38758;
      private boolean field38759;
      private boolean field38760;
      private boolean field38761 = true;
      private final MaterialColor field38762;
      private boolean field38763 = true;

      public Builder(MaterialColor var1) {
         this.field38762 = var1;
      }

      public Builder method30885() {
         this.field38759 = true;
         return this;
      }

      public Builder method30886() {
         this.field38761 = false;
         return this;
      }

      public Builder method30887() {
         this.field38757 = false;
         return this;
      }

      private Builder method30888() {
         this.field38763 = false;
         return this;
      }

      public Builder notOpaque() {
         this.field38758 = true;
         return this;
      }

      public Builder method30890() {
         this.field38760 = true;
         return this;
      }

      public Builder pushDestroys() {
         this.field38756 = PushReaction.field15863;
         return this;
      }

      public Builder pushBlocks() {
         this.field38756 = PushReaction.field15864;
         return this;
      }

      public Material build() {
         return new Material(
            this.field38762, this.field38759, this.field38761, this.field38757, this.field38763, this.field38758, this.field38760, this.field38756
         );
      }

      // $VF: synthetic method
      public static Builder method30894(Builder var0) {
         return var0.method30888();
      }
   }
}
