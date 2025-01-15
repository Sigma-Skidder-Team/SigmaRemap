// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.sound.sampled.AudioInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.net.URL;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.spi.AudioFileReader;

public class Class6939 extends AudioFileReader
{
    public static final AudioFileFormat.Type field27174;
    public static final AudioFileFormat.Type field27175;
    private static final AudioFormat.Encoding field27176;
    
    @Override
    public AudioFileFormat getAudioFileFormat(InputStream in) throws UnsupportedAudioFileException, IOException {
        try {
            if (!in.markSupported()) {
                in = new BufferedInputStream(in);
            }
            in.mark(4);
            return this.getAudioFileFormat(in, -1);
        }
        finally {
            in.reset();
        }
    }
    
    @Override
    public AudioFileFormat getAudioFileFormat(final URL url) throws UnsupportedAudioFileException, IOException {
        final InputStream openStream = url.openStream();
        try {
            return this.getAudioFileFormat(openStream);
        }
        finally {
            if (openStream != null) {
                openStream.close();
            }
        }
    }
    
    @Override
    public AudioFileFormat getAudioFileFormat(final File file) throws UnsupportedAudioFileException, IOException {
        InputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));
            inputStream.mark(1000);
            final AudioFileFormat audioFileFormat = this.getAudioFileFormat(inputStream, (int)file.length());
            inputStream.reset();
            return audioFileFormat;
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
    
    private AudioFileFormat getAudioFileFormat(final InputStream inputStream, final int channels) throws UnsupportedAudioFileException, IOException {
        final byte[] array = new byte[8];
        inputStream.read(array);
        boolean b;
        if (new String(array, 4, 4).equals("ftyp")) {
            b = true;
        }
        else {
            final Class8157 class8157 = new Class8157(array);
            try {
                final Class8847 class8158 = new Class8847(inputStream);
                b = true;
            }
            catch (final Exception ex) {
                b = false;
            }
        }
        if (b) {
            return new AudioFileFormat(Class6939.field27174, new AudioFormat(Class6939.field27176, -1.0f, -1, channels, -1, -1.0f, true), -1);
        }
        throw new UnsupportedAudioFileException();
    }
    
    @Override
    public AudioInputStream getAudioInputStream(InputStream in) throws UnsupportedAudioFileException, IOException {
        try {
            if (!in.markSupported()) {
                in = new BufferedInputStream(in);
            }
            in.mark(1000);
            final AudioFileFormat audioFileFormat = this.getAudioFileFormat(in, -1);
            in.reset();
            return new Class1745(in, audioFileFormat.getFormat(), audioFileFormat.getFrameLength());
        }
        catch (final UnsupportedAudioFileException ex) {
            in.reset();
            throw ex;
        }
        catch (final IOException ex2) {
            in.reset();
            throw ex2;
        }
    }
    
    @Override
    public AudioInputStream getAudioInputStream(final URL url) throws UnsupportedAudioFileException, IOException {
        final InputStream openStream = url.openStream();
        try {
            return this.getAudioInputStream(openStream);
        }
        catch (final UnsupportedAudioFileException ex) {
            if (openStream != null) {
                openStream.close();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (openStream != null) {
                openStream.close();
            }
            throw ex2;
        }
    }
    
    @Override
    public AudioInputStream getAudioInputStream(final File file) throws UnsupportedAudioFileException, IOException {
        final FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return this.getAudioInputStream(fileInputStream);
        }
        catch (final UnsupportedAudioFileException ex) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw ex2;
        }
    }
    
    static {
        field27174 = new AudioFileFormat.Type("AAC", "aac");
        field27175 = new AudioFileFormat.Type("MP4", "mp4");
        field27176 = new AudioFormat.Encoding("AAC");
    }
}
