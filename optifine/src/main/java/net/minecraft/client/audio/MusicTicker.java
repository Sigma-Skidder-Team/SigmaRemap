package net.minecraft.client.audio;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class MusicTicker
{
    private final Random random = new Random();
    private final Minecraft client;
    private ISound currentMusic;
    private int timeUntilNextMusic = 100;

    public MusicTicker(Minecraft p_i319_1_)
    {
        this.client = p_i319_1_;
    }

    public void tick()
    {
        MusicTicker.MusicType musicticker$musictype = this.client.getAmbientMusicType();

        if (this.currentMusic != null)
        {
            if (!musicticker$musictype.getSound().getName().equals(this.currentMusic.getSoundLocation()))
            {
                this.client.getSoundHandler().stop(this.currentMusic);
                this.timeUntilNextMusic = MathHelper.nextInt(this.random, 0, musicticker$musictype.getMinDelay() / 2);
            }

            if (!this.client.getSoundHandler().isPlaying(this.currentMusic))
            {
                this.currentMusic = null;
                this.timeUntilNextMusic = Math.min(MathHelper.nextInt(this.random, musicticker$musictype.getMinDelay(), musicticker$musictype.getMaxDelay()), this.timeUntilNextMusic);
            }
        }

        this.timeUntilNextMusic = Math.min(this.timeUntilNextMusic, musicticker$musictype.getMaxDelay());

        if (this.currentMusic == null && this.timeUntilNextMusic-- <= 0)
        {
            this.play(musicticker$musictype);
        }
    }

    public void play(MusicTicker.MusicType type)
    {
        this.currentMusic = SimpleSound.music(type.getSound());
        this.client.getSoundHandler().play(this.currentMusic);
        this.timeUntilNextMusic = Integer.MAX_VALUE;
    }

    public void stop()
    {
        if (this.currentMusic != null)
        {
            this.client.getSoundHandler().stop(this.currentMusic);
            this.currentMusic = null;
            this.timeUntilNextMusic = 0;
        }
    }

    public boolean isPlaying(MusicTicker.MusicType type)
    {
        return this.currentMusic == null ? false : type.getSound().getName().equals(this.currentMusic.getSoundLocation());
    }

    public static enum MusicType
    {
        MENU(SoundEvents.MUSIC_MENU, 20, 600),
        GAME(SoundEvents.MUSIC_GAME, 12000, 24000),
        CREATIVE(SoundEvents.MUSIC_CREATIVE, 1200, 3600),
        CREDITS(SoundEvents.MUSIC_CREDITS, 0, 0),
        NETHER(SoundEvents.MUSIC_NETHER, 1200, 3600),
        END_BOSS(SoundEvents.MUSIC_DRAGON, 0, 0),
        END(SoundEvents.MUSIC_END, 6000, 24000),
        UNDER_WATER(SoundEvents.MUSIC_UNDER_WATER, 12000, 24000);

        private final SoundEvent sound;
        private final int minDelay;
        private final int maxDelay;

        private MusicType(SoundEvent p_i1446_3_, int p_i1446_4_, int p_i1446_5_)
        {
            this.sound = p_i1446_3_;
            this.minDelay = p_i1446_4_;
            this.maxDelay = p_i1446_5_;
        }

        public SoundEvent getSound()
        {
            return this.sound;
        }

        public int getMinDelay()
        {
            return this.minDelay;
        }

        public int getMaxDelay()
        {
            return this.maxDelay;
        }
    }
}
