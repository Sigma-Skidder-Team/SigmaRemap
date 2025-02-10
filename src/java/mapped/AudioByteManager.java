package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AudioByteManager {
   public int descriptorType;
   public int descriptorSize;
   public long descriptorOffset;
   private final List<AudioByteManager> childDescriptors = new ArrayList<>();

   public static AudioByteManager readDescriptor(MP4InputStream reader) throws IOException {
      int type = reader.readInt();
      long descriptorLength = 1;
      int size = 0;
      int bytesRead;

      do {
         bytesRead = reader.readInt();
         size <<= 7;
         size |= bytesRead & 127;
         descriptorLength++;
      } while ((bytesRead & 128) == 128);

      AudioByteManager descriptor = createDescriptor(type);
      descriptor.descriptorType = type;
      descriptor.descriptorSize = size;
      descriptor.descriptorOffset = reader.getPosition();
      descriptor.readData(reader);

      long remainingBytes = (long) size - (reader.getPosition() - descriptor.descriptorOffset);

      if (remainingBytes > 0L) {
         Logger.getLogger("MP4 Boxes").log(Level.INFO, "Descriptor: bytes left: {0}, offset: {1}", new Object[]{remainingBytes, reader.getPosition()});
         reader.skipBytes(remainingBytes);  // Skip the remaining bytes in the stream
      }

      descriptor.descriptorSize += (int) descriptorLength;
      return descriptor;
   }

   private static AudioByteManager createDescriptor(int type) {
      AudioByteManager descriptor;
      switch (type) {
         case 1:
            descriptor = new AudioDescriptor();
            break;
         case 2:
         case 16:
            descriptor = new VideoDescriptor();
            break;
         case 3:
            descriptor = new TextDescriptor();
            break;
         case 4:
            descriptor = new MetaDescriptor();
            break;
         case 5:
            descriptor = new BinaryDataDescriptor();
            break;
         default:
            Logger.getLogger("MP4 Boxes").log(Level.INFO, "Unknown descriptor type: {0}", type);
            descriptor = new UnknownDescriptor();
      }

      return descriptor;
   }

   public abstract void readData(MP4InputStream reader) throws IOException;

   public void readChildDescriptors(MP4InputStream reader) throws IOException {
      while ((long)this.descriptorSize - (reader.getPosition() - this.descriptorOffset) > 0L) {
         AudioByteManager childDescriptor = readDescriptor(reader);
         this.childDescriptors.add(childDescriptor);
      }
   }

   public List<AudioByteManager> getChildDescriptors() {
      return Collections.unmodifiableList(this.childDescriptors);
   }

   public int getDescriptorType() {
      return this.descriptorType;
   }

   public static class AudioDescriptor extends AudioByteManager {
      private int audioFormat;
      private boolean hasAdditionalData;
      private String additionalData;

      @Override
      public void readData(MP4InputStream reader) throws IOException {
         int header = (int) reader.readBits(2);
         this.audioFormat = header >> 6 & 1023;
         this.hasAdditionalData = (header >> 5 & 1) == 1;
         if (this.hasAdditionalData) {
            this.additionalData = reader.readString(this.descriptorSize - 2);
         }

         this.readChildDescriptors(reader);
      }
   }

   public static class VideoDescriptor extends AudioByteManager {
      private int videoFormat;
      private boolean isProtected;
      private boolean hasAdditionalMetadata;
      private String metadata;
      private int width;
      private int height;
      private int frameRate;
      private int bitRate;
      private int codec;

      @Override
      public void readData(MP4InputStream reader) throws IOException {
         int header = (int) reader.readBits(2);
         this.videoFormat = header >> 6 & 1023;
         this.isProtected = (header >> 5 & 1) == 1;
         this.hasAdditionalMetadata = (header >> 4 & 1) == 1;
         if (!this.isProtected) {
            this.width = reader.readInt();
            this.height = reader.readInt();
            this.frameRate = reader.readInt();
            this.bitRate = reader.readInt();
            this.codec = reader.readInt();
         } else {
            this.metadata = reader.readString(this.descriptorSize - 2);
         }

         this.readChildDescriptors(reader);
      }
   }

   public static class TextDescriptor extends AudioByteManager {
      private int languageCode;
      private boolean isDefault;
      private String subtitleText;

      @Override
      public void readData(MP4InputStream reader) throws IOException {
         this.languageCode = (int) reader.readBits(2);
         int header = reader.readInt();
         this.isDefault = (header >> 7 & 1) == 1;
         if (this.isDefault) {
            this.subtitleText = reader.readString(header & 31);
         }

         this.readChildDescriptors(reader);
      }
   }

   public static class MetaDescriptor extends AudioByteManager {
      private int metadataType;
      private int metadataLength;
      private int metadataFlags;
      private boolean isEncrypted;
      private long encryptionKey;
      private long initializationVector;

      @Override
      public void readData(MP4InputStream reader) throws IOException {
         this.metadataType = reader.readInt();
         int header = reader.readInt();
         this.metadataLength = header >> 2 & 63;
         this.isEncrypted = (header >> 1 & 1) == 1;
         this.metadataFlags = (int) reader.readBits(3);
         this.encryptionKey = reader.readBits(4);
         this.initializationVector = reader.readBits(4);
         this.readChildDescriptors(reader);
      }
   }

   public static class BinaryDataDescriptor extends AudioByteManager {
      private byte[] binaryData;

      @Override
      public void readData(MP4InputStream reader) throws IOException {
         this.binaryData = new byte[this.descriptorSize];
         reader.readBytes(this.binaryData);
      }

      public byte[] getBinaryData() {
         return this.binaryData;
      }
   }

   public static class UnknownDescriptor extends AudioByteManager {

      @Override
      public void readData(MP4InputStream reader) {
      }
   }
}
