package red.felnull.imp.data;

import net.minecraft.util.ResourceLocation;
import red.felnull.imp.IamMusicPlayer;
import red.felnull.otyacraftengine.api.registries.OERegistries;

public class IMPWorldData {
    public static final ResourceLocation PLAYLIST_DATA = new ResourceLocation(IamMusicPlayer.MODID, "playlist_data");
    public static final ResourceLocation IMAGE = new ResourceLocation(IamMusicPlayer.MODID, "image");
    public static final ResourceLocation PLAYLIST_REQUEST = new ResourceLocation(IamMusicPlayer.MODID, "playlist_request");
    public static final ResourceLocation SERVER_TMP_DATA = new ResourceLocation(IamMusicPlayer.MODID, "tmp");
    public static final ResourceLocation SEND_MUSIC_RESPONSE = new ResourceLocation(IamMusicPlayer.MODID, "send_music_response");

    public static void register() {
        OERegistries.registrierWorldData(PLAYLIST_DATA, new PlayListWorldData());
        OERegistries.registrierServerRecevedPath(IMAGE, IamMusicPlayer.MODID + "\\image");
        OERegistries.registrierTextuerSendPath(IMAGE, IamMusicPlayer.MODID + "\\image");
        OERegistries.registrierServerRecevedPath(SERVER_TMP_DATA, IamMusicPlayer.MODID + "\\tmp");
    }
}
