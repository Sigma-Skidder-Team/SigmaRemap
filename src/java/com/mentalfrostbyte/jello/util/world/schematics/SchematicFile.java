package com.mentalfrostbyte.jello.util.world.schematics;

import mapped.DataPacket;
import mapped.Vector3m;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchematicFile {
   private File schematicFile;
   public Vector3m vCoreVector = null;
   private short width;
   private short height;
   private short length;
   private String materials;
   private List<DataPacket> dataPacketList = new ArrayList<DataPacket>();

   public SchematicFile(File fileInput) {
      this.schematicFile = fileInput;
   }

   public boolean method31836() {
      CompoundNBT schematicData;

      try {
         schematicData = CompressedStreamTools.readCompressed(new FileInputStream(this.schematicFile));
      } catch (IOException var16) {
         var16.printStackTrace();
         return false;
      }

      this.width = schematicData.getShort("Width");
      this.height = schematicData.getShort("Height");
      this.length = schematicData.getShort("Length");

      try {
         int originX = schematicData.getInt("WEOriginX");
         int originY = schematicData.getInt("WEOriginY");
         int originZ = schematicData.getInt("WEOriginZ");
         Vector3m originVector = new Vector3m(originX, originY, originZ);
         int offsetX = schematicData.getInt("WEOffsetX");
         int offsetY = schematicData.getInt("WEOffsetY");
         int offsetZ = schematicData.getInt("WEOffsetZ");
         Vector3m coreVector = new Vector3m(offsetX, offsetY, offsetZ);
         this.vCoreVector = originVector.subtract(coreVector);
      } catch (Exception e) {
         this.vCoreVector = new Vector3m(0, 0, 0);
         System.out.println("Error processing schematic: not an alpha schematic?");
      }

      this.materials = schematicData.getString("Materials");
      byte[] blockData = schematicData.getByteArray("Blocks");
      byte[] blockMetadata = schematicData.getByteArray("Data");
      byte[] additionalBlocks = new byte[0];
      short[] combinedBlockData = new short[blockData.length];

      if (schematicData.contains("AddBlocks")) {
         additionalBlocks = schematicData.getByteArray("AddBlocks");
      }

      for (int i = 0; i < blockData.length; i++) {
         if (i >> 1 >= additionalBlocks.length) {
            combinedBlockData[i] = (short)(blockData[i] & 255);
         } else if ((i & 1) == 0) {
            combinedBlockData[i] = (short)(((additionalBlocks[i >> 1] & 15) << 8) + (blockData[i] & 255));
         } else {
            combinedBlockData[i] = (short)(((additionalBlocks[i >> 1] & 240) << 4) + (blockData[i] & 255));
         }
      }

      for (int y = 0; y < this.height; y++) {
         for (int x = 0; x < this.width; x++) {
            for (int z = 0; z < this.length; z++) {
               int index = y * this.width * this.length + z * this.width + x;
               Vector3m.IntegerVector positionVector = new Vector3m.IntegerVector(x, y, z);
               short blockId = combinedBlockData[index];
               byte blockMetadataValue = blockMetadata[index];
               if (blockId != 0) {
                  this.dataPacketList.add(new DataPacket(blockId, blockMetadataValue, positionVector));
               }
            }
         }
      }

      return true;
   }

   public File getSchematic() {
      return this.schematicFile;
   }

   public short getWidth() {
      return this.width;
   }

   public short getHeight() {
      return this.height;
   }

   public short getLength() {
      return this.length;
   }

   public String getMaterial() {
      return this.materials;
   }

   public Vector3m getVectorCore() {
      return this.vCoreVector;
   }

   public List<DataPacket> getDataPackets() {
      return this.dataPacketList;
   }
}
