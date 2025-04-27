// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBT;

import javax.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;

public class Class8097
{
    public static CompoundNBT method26590(final InputStream in) throws IOException {
        CompoundNBT method26596;
        try (final DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(in)))) {
            method26596 = method26596(dataInputStream, NBTSizeTracker.INFINITE);
        }
        return method26596;
    }
    
    public static void method26591(final CompoundNBT class51, final OutputStream out) throws IOException {
        try (final DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(out)))) {
            method26597(class51, dataOutputStream);
        }
    }
    
    public static void method26592(final CompoundNBT class51, final File file) throws IOException {
        final File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        method26593(class51, file2);
        if (file.exists()) {
            file.delete();
        }
        if (!file.exists()) {
            file2.renameTo(file);
            return;
        }
        throw new IOException("Failed to delete " + file);
    }
    
    public static void method26593(final CompoundNBT class51, final File file) throws IOException {
        final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            method26597(class51, dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }
    
    @Nullable
    public static CompoundNBT method26594(final File file) throws IOException {
        if (!file.exists()) {
            return null;
        }
        final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        CompoundNBT method26596;
        try {
            method26596 = method26596(dataInputStream, NBTSizeTracker.INFINITE);
        }
        finally {
            dataInputStream.close();
        }
        return method26596;
    }
    
    public static CompoundNBT method26595(final DataInputStream dataInputStream) throws IOException {
        return method26596(dataInputStream, NBTSizeTracker.INFINITE);
    }
    
    public static CompoundNBT method26596(final DataInput dataInput, final NBTSizeTracker class7553) throws IOException {
        final INBT method26599 = method26599(dataInput, 0, class7553);
        if (!(method26599 instanceof CompoundNBT)) {
            throw new IOException("Root tag must be a named compound tag");
        }
        return (CompoundNBT)method26599;
    }
    
    public static void method26597(final CompoundNBT class51, final DataOutput dataOutput) throws IOException {
        method26598(class51, dataOutput);
    }
    
    private static void method26598(final INBT class41, final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class41.getId());
        if (class41.getId() != 0) {
            dataOutput.writeUTF("");
            class41.write(dataOutput);
        }
    }
    
    private static INBT method26599(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        final byte byte1 = dataInput.readByte();
        if (byte1 == 0) {
            return EndNBT.INSTANCE;
        }
        dataInput.readUTF();
        try {
            return NBTTypes.func_229710_a_(byte1).func_225649_b_(dataInput, n, class7553);
        }
        catch (final IOException ex) {
            final CrashReport method24421 = CrashReport.makeCrashReport(ex, "Loading NBT data");
            method24421.makeCategory("NBT Tag").addDetail("Tag type", byte1);
            throw new ReportedException(method24421);
        }
    }
}
