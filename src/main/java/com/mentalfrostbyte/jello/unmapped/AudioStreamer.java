package com.mentalfrostbyte.jello.unmapped;

import mapped.MusicStream;

import java.io.InputStream;

public final class AudioStreamer implements Runnable {
    private final InputStream inputStream;
    public final MusicStream musicStream;

    public AudioStreamer(MusicStream musicStream, InputStream inputStream) {
        this.musicStream = musicStream;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        int bytesRead;
        byte[] buffer = new byte[16384];

        try {
            while ((bytesRead = this.inputStream.read(buffer)) != -1 && !Thread.interrupted()) {
                if (bytesRead > 0) {
                    musicStream.getByteStream().write(buffer, 0, bytesRead);
                    musicStream.setBufferEnd(musicStream.getBufferEnd() + bytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!Thread.interrupted()) {
            musicStream.setEndOfStream(true);
            if (musicStream.getAudioProcessor() != null && musicStream.getByteStream() != null) {
                musicStream.getAudioProcessor()
                        .processBuffer(musicStream.getByteStream().getBuffer(), 0, musicStream.getBufferEnd());
            }
        }
    }
}
