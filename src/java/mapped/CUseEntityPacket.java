package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class CUseEntityPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24438;
   private int field24439;
   private Action field24440;
   private Vector3d field24441;
   private Hand field24442;
   private boolean field24443;

   public CUseEntityPacket() {
   }

   public CUseEntityPacket(Entity var1, boolean var2) {
      this.field24439 = var1.method3205();
      this.field24440 = Action.ATTACK;
      this.field24443 = var2;
   }

   public CUseEntityPacket(Entity var1, Hand var2, boolean var3) {
      this.field24439 = var1.method3205();
      this.field24440 = Action.INTERACT;
      this.field24442 = var2;
      this.field24443 = var3;
   }

   public CUseEntityPacket(Entity var1, Hand var2, Vector3d var3, boolean var4) {
      this.field24439 = var1.method3205();
      this.field24440 = Action.INTERACT_AT;
      this.field24442 = var2;
      this.field24441 = var3;
      this.field24443 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24439 = var1.method35714();
      this.field24440 = var1.<Action>method35712(Action.class);
      if (this.field24440 == Action.INTERACT_AT) {
         this.field24441 = new Vector3d((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if (this.field24440 == Action.INTERACT || this.field24440 == Action.INTERACT_AT) {
         this.field24442 = var1.<Hand>method35712(Hand.class);
      }

      this.field24443 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24439);
      var1.method35713(this.field24440);
      if (this.field24440 == Action.INTERACT_AT) {
         var1.writeFloat((float)this.field24441.field18048);
         var1.writeFloat((float)this.field24441.field18049);
         var1.writeFloat((float)this.field24441.field18050);
      }

      if (this.field24440 == Action.INTERACT || this.field24440 == Action.INTERACT_AT) {
         var1.method35713(this.field24442);
      }

      var1.writeBoolean(this.field24443);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.processUseEntity(this);
   }

   @Nullable
   public Entity getEntityFromWorld(World var1) {
      return var1.method6774(this.field24439);
   }

   public Action getAction() {
      return this.field24440;
   }

   @Nullable
   public Hand getHand() {
      return this.field24442;
   }

   public Vector3d getHitVec() {
      return this.field24441;
   }

   public boolean func_241792_e_() {
      return this.field24443;
   }

    public enum Action {
       INTERACT,
       ATTACK,
       INTERACT_AT;
    }
}
