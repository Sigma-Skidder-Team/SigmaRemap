package mapped;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class3624 extends Class3625 {
   private static String[] field19629;
   private final Set<ServerPlayerEntity> field19630 = Sets.newHashSet();
   private final Set<ServerPlayerEntity> field19631 = Collections.<ServerPlayerEntity>unmodifiableSet(this.field19630);
   private boolean field19632 = true;

   public Class3624(ITextComponent var1, Class2303 var2, Class2300 var3) {
      super(MathHelper.method37812(), var1, var2, var3);
   }

   @Override
   public void method12278(float var1) {
      if (var1 != this.field19635) {
         super.method12278(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_PCT);
      }
   }

   @Override
   public void method12279(Class2303 var1) {
      if (var1 != this.field19636) {
         super.method12279(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_STYLE);
      }
   }

   @Override
   public void method12280(Class2300 var1) {
      if (var1 != this.field19637) {
         super.method12280(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_STYLE);
      }
   }

   @Override
   public Class3625 method12281(boolean var1) {
      if (var1 != this.field19638) {
         super.method12281(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_PROPERTIES);
      }

      return this;
   }

   @Override
   public Class3625 method12282(boolean var1) {
      if (var1 != this.field19639) {
         super.method12282(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_PROPERTIES);
      }

      return this;
   }

   @Override
   public Class3625 method12283(boolean var1) {
      if (var1 != this.field19640) {
         super.method12283(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_PROPERTIES);
      }

      return this;
   }

   @Override
   public void method12284(ITextComponent var1) {
      if (!Objects.equal(var1, this.field19634)) {
         super.method12284(var1);
         this.method12285(SUpdateBossInfoPacket.Operation.UPDATE_NAME);
      }
   }

   private void method12285(SUpdateBossInfoPacket.Operation var1) {
      if (this.field19632) {
         SUpdateBossInfoPacket var4 = new SUpdateBossInfoPacket(var1, this);

         for (ServerPlayerEntity var6 : this.field19630) {
            var6.field4855.sendPacket(var4);
         }
      }
   }

   public void method12263(ServerPlayerEntity var1) {
      if (this.field19630.add(var1) && this.field19632) {
         var1.field4855.sendPacket(new SUpdateBossInfoPacket(SUpdateBossInfoPacket.Operation.ADD, this));
      }
   }

   public void method12265(ServerPlayerEntity var1) {
      if (this.field19630.remove(var1) && this.field19632) {
         var1.field4855.sendPacket(new SUpdateBossInfoPacket(SUpdateBossInfoPacket.Operation.REMOVE, this));
      }
   }

   public void method12266() {
      if (!this.field19630.isEmpty()) {
         for (ServerPlayerEntity var4 : Lists.newArrayList(this.field19630)) {
            this.method12265(var4);
         }
      }
   }

   public boolean method12286() {
      return this.field19632;
   }

   public void method12287(boolean var1) {
      if (var1 != this.field19632) {
         this.field19632 = var1;

         for (ServerPlayerEntity var5 : this.field19630) {
            var5.field4855.sendPacket(new SUpdateBossInfoPacket(!var1 ? SUpdateBossInfoPacket.Operation.REMOVE : SUpdateBossInfoPacket.Operation.ADD, this));
         }
      }
   }

   public Collection<ServerPlayerEntity> method12288() {
      return this.field19631;
   }
}
