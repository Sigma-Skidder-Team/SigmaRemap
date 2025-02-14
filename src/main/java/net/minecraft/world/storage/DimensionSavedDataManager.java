package net.minecraft.world.storage;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import net.minecraft.util.datafix.DefaultTypeReferences;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.*;
import java.util.Map;
import java.util.function.Supplier;

public class DimensionSavedDataManager {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Map<String, WorldSavedData> savedDatum = Maps.newHashMap();
    private final File folder;
    private final DataFixer dataFixer;

    public DimensionSavedDataManager(File folder, DataFixer dataFixer) {
        this.folder = folder;
        this.dataFixer = dataFixer;
    }

    private File getDataFile(String name) {
        return new File(this.folder, name + ".dat");
    }

    public <T extends WorldSavedData> T getOrCreate(Supplier<T> defaultSupplier, String name) {
        T t = this.get(defaultSupplier, name);

        if (t != null) {
            return t;
        } else {
            T t1 = defaultSupplier.get();
            this.set(t1);
            return t1;
        }
    }

    @Nullable
    public <T extends WorldSavedData> T get(Supplier<T> defaultSupplier, String name) {
        WorldSavedData worldSavedData = this.savedDatum.get(name);
        if (worldSavedData == null && !this.savedDatum.containsKey(name)) {
            worldSavedData = this.loadSavedData(defaultSupplier, name);
            this.savedDatum.put(name, worldSavedData);
        }

        return (T) worldSavedData;
    }

    @Nullable
    private <T extends WorldSavedData> T loadSavedData(Supplier<T> defaultSupplier, String name) {
        try {
            File file = this.getDataFile(name);
            if (file.exists()) {
                T t = defaultSupplier.get();
                CompoundNBT compoundNBT = this.load(name, SharedConstants.getVersion().getWorldVersion());
                t.read(compoundNBT.getCompound("data"));
                return t;
            }
        } catch (Exception e) {
            LOGGER.error("Error loading saved data: {}", name, e);
        }

        return null;
    }

    public void set(WorldSavedData data) {
        this.savedDatum.put(data.getName(), data);
    }

    public CompoundNBT load(String name, int worldVersion) throws IOException {
        File file = this.getDataFile(name);
        CompoundNBT compoundNBT;

        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                PushbackInputStream pushbackInputStream = new PushbackInputStream(fileInputStream, 2);
            )
        {
            CompoundNBT compoundNBT1;
            if (this.isCompressed(pushbackInputStream)) {
                compoundNBT1 = CompressedStreamTools.readCompressed(pushbackInputStream);
            } else {
                try (DataInputStream dataInputStream = new DataInputStream(pushbackInputStream)) {
                    compoundNBT1 = CompressedStreamTools.read(dataInputStream);
                }
            }

            int i = compoundNBT1.contains("DataVersion", 99) ? compoundNBT1.getInt("DataVersion") : 1343;
            compoundNBT = NBTUtil.update(this.dataFixer, DefaultTypeReferences.SAVED_DATA, compoundNBT1, i, worldVersion);
        }

        return compoundNBT;
    }

    private boolean isCompressed(PushbackInputStream var1) throws IOException {
        byte[] var4 = new byte[2];
        boolean var5 = false;
        int var6 = var1.read(var4, 0, 2);
        if (var6 == 2) {
            int var7 = (var4[1] & 255) << 8 | var4[0] & 255;
            if (var7 == 35615) {
                var5 = true;
            }
        }

        if (var6 != 0) {
            var1.unread(var4, 0, var6);
        }

        return var5;
    }

    public void method28773() {
        for (WorldSavedData var4 : this.savedDatum.values()) {
            if (var4 != null) {
                var4.save(this.getDataFile(var4.getName()));
            }
        }
    }
}
